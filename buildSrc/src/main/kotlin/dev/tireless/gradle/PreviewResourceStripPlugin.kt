package dev.tireless.gradle

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.tasks.bundling.AbstractArchiveTask
import org.gradle.api.tasks.bundling.Zip
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.Serializable
import java.util.zip.ZipEntry
import java.util.zip.ZipException
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream
import javax.inject.Inject

abstract class PreviewResourceStripExtension
  @Inject
  constructor(
    objects: ObjectFactory,
  ) {
    val resourcePackage: Property<String> = objects.property(String::class.java)
  }

class PreviewResourceStripPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    val extension =
      project.extensions.create(
        "previewResourceStripping",
        PreviewResourceStripExtension::class.java,
      )

    project.afterEvaluate {
      val resourcePackage =
        extension.resourcePackage.orNull
          ?: error("previewResourceStripping.resourcePackage must be set")

      val stripAction = StripPreviewResourcesAction(resourcePackage)

      project.tasks.withType(AbstractArchiveTask::class.java).configureEach(
        object : Action<AbstractArchiveTask> {
          override fun execute(task: AbstractArchiveTask) {
            task.doLast(stripAction)
          }
        },
      )

      listOf("iosArm64Klib", "iosX64Klib", "iosSimulatorArm64Klib").forEach { taskName ->
        project.tasks.matching { task -> task.name == taskName }.configureEach(
          object : Action<Task> {
            override fun execute(task: Task) {
              task.doLast(stripAction)
            }
          },
        )
      }

      project.tasks.withType(Zip::class.java).configureEach(
        object : Action<Zip> {
          override fun execute(zipTask: Zip) {
            if (zipTask.name.endsWith("ZipMultiplatformResourcesForPublication")) {
              zipTask.exclude("**/font/**")
            }
          }
        },
      )
    }
  }
}

private class StripPreviewResourcesAction(
  resourcePackage: String,
) : Action<Any>,
  Serializable {
  private val resourceSlashPath = resourcePackage.replace('.', '/')
  private val resourceDotPath = resourcePackage

  override fun execute(task: Any) {
    val archive =
      when (task) {
        is AbstractArchiveTask -> task.archiveFile.orNull
        else -> null
      } ?: return

    stripPreviewResources(archive.asFile, resourceSlashPath, resourceDotPath)
  }
}

private fun stripPreviewResources(
  zipFile: File,
  resourceSlashPath: String,
  resourceDotPath: String,
) {
  if (!zipFile.exists() || zipFile.extension.isEmpty()) return
  val tempFile =
    kotlin
      .runCatching {
        File.createTempFile(zipFile.nameWithoutExtension, ".tmp", zipFile.parentFile)
      }.getOrElse { return }

  zipFile.inputStream().buffered().use { input ->
    ZipInputStream(input).use { zis ->
      tempFile.outputStream().buffered().use { output ->
        ZipOutputStream(output).use { zos ->
          copyWithoutPreviewEntries(zis, zos, resourceSlashPath, resourceDotPath)
        }
      }
    }
  }

  tempFile.copyTo(zipFile, overwrite = true)
  tempFile.delete()
}

private fun copyWithoutPreviewEntries(
  zipInputStream: ZipInputStream,
  zipOutputStream: ZipOutputStream,
  resourceSlashPath: String,
  resourceDotPath: String,
) {
  val fontDir = "composeResources/$resourceDotPath/font/"
  val assetFontDir = "assets/$fontDir"
  val classPrefix = "$resourceSlashPath/"

  generateSequence { zipInputStream.nextEntry }.forEach { entry ->
    val name = entry.name
    val shouldStrip =
      name.contains(fontDir) ||
        name.contains(assetFontDir) ||
        name.hasResourceSuffix(classPrefix) { it == "Res\$font.class" } ||
        name.hasResourceSuffix(classPrefix) { it.startsWith("Font") }

    val data =
      if (entry.isDirectory) {
        zipInputStream.closeEntry()
        null
      } else {
        zipInputStream.readEntryBytes().also { zipInputStream.closeEntry() }
      }

    if (!shouldStrip && data != null) {
      val payload =
        if (name.endsWith(".jar", ignoreCase = true)) {
          stripPreviewEntriesFromNestedJar(data, resourceSlashPath, resourceDotPath)
        } else {
          data
        }

      if (payload.isNotEmpty()) {
        val newEntry = ZipEntry(name).apply { time = entry.time }
        zipOutputStream.putNextEntry(newEntry)
        zipOutputStream.write(payload)
        zipOutputStream.closeEntry()
      }
    }
  }
}

private inline fun String.hasResourceSuffix(
  classPrefix: String,
  predicate: (String) -> Boolean,
): Boolean {
  val index = indexOf(classPrefix)
  if (index == -1) return false
  val suffixStart = index + classPrefix.length
  if (suffixStart >= length) return false
  val suffix = substring(suffixStart)
  return predicate(suffix)
}

private fun ZipInputStream.readEntryBytes(): ByteArray {
  val buffer = ByteArrayOutputStream()
  val data = ByteArray(DEFAULT_BUFFER_SIZE)
  while (true) {
    val read = read(data)
    if (read == -1) break
    buffer.write(data, 0, read)
  }
  return buffer.toByteArray()
}

private fun stripPreviewEntriesFromNestedJar(
  bytes: ByteArray,
  resourceSlashPath: String,
  resourceDotPath: String,
): ByteArray =
  try {
    val output = ByteArrayOutputStream()
    ZipInputStream(ByteArrayInputStream(bytes)).use { nestedInput ->
      ZipOutputStream(output).use { nestedOutput ->
        copyWithoutPreviewEntries(nestedInput, nestedOutput, resourceSlashPath, resourceDotPath)
      }
    }
    output.toByteArray()
  } catch (_: ZipException) {
    bytes
  }
