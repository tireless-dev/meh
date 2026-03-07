import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.Framework
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  alias(libs.plugins.kotlin.multiplatform)
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose.multiplatform)
  alias(libs.plugins.android.kotlin.multiplatform.library)
  alias(libs.plugins.spotless)
  id("maven-publish")
  id("dev.tireless.preview-strip-plugin")
}

kotlin {
  android {
    namespace = "dev.tireless.meh"
    compileSdk = 36
    minSdk = 24

    compilerOptions {
      jvmTarget.set(JvmTarget.JVM_17)
    }
  }

  jvm("desktop")

  listOf(
    iosX64(),
    iosArm64(),
    iosSimulatorArm64(),
  ).forEach { iosTarget ->
    iosTarget.binaries.framework {
      baseName = "meh"
      isStatic = true
    }
  }

  sourceSets {
    commonMain.dependencies {
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.ui)
      implementation(compose.components.uiToolingPreview)
      implementation(compose.components.resources)
    }

    androidMain.dependencies {
      implementation(compose.preview)
      implementation(compose.uiTooling)
    }
  }
}

compose.resources {
  packageOfResClass = "dev.tireless.meh.generated.resources"
  publicResClass = true
  generateResClass = always
}

previewResourceStripping {
  resourcePackage.set("dev.tireless.meh.generated.resources")
}

group = "dev.tireless"
version = "0.2512.0-SNAPTHOT"

// Ensure required license/notice files end up in every jar (desktop, metadata, Android classes.jar, etc.)
val bundledLicenseFiles =
  files(
    "LICENSE",
    "NOTICE",
    "THIRD_PARTY_NOTICES.md",
  ).filter { it.exists() }
val hasBundledLicenseFiles = bundledLicenseFiles.files.isNotEmpty()
val thirdPartyLicenseDir = file("third-party-licenses")

tasks.withType<Jar>().configureEach {
  if (hasBundledLicenseFiles) {
    from(bundledLicenseFiles) { into("META-INF") }
  }
  if (thirdPartyLicenseDir.isDirectory) {
    from(thirdPartyLicenseDir) { into("META-INF/licenses") }
  }
}

// Copy license/notice files into iOS frameworks (appears under meh.framework/Resources/META-INF)
kotlin.targets.withType<KotlinNativeTarget>().configureEach {
  if (!konanTarget.family.isAppleFamily) return@configureEach

  binaries.withType<Framework>().all {
    linkTaskProvider.configure {
      doLast {
        val frameworkDir = outputFile.get().parentFile
        val resourcesDir = frameworkDir.resolve("Resources")
        if (hasBundledLicenseFiles) {
          project.copy {
            from(bundledLicenseFiles)
            into(resourcesDir.resolve("META-INF"))
          }
        }
        if (thirdPartyLicenseDir.isDirectory) {
          project.copy {
            from(thirdPartyLicenseDir)
            into(resourcesDir.resolve("META-INF/licenses"))
          }
        }
      }
    }
  }
}

spotless {
  kotlin {
    target("src/**/*.kt")
    ktlint()
      .editorConfigOverride(
        mapOf(
          "compose_allowed_composition_locals" to "LocalColors,LocalSpacing,LocalSizes,LocalFontFamily,LocalIcons",
        ),
      ).customRuleSets(listOf("io.nlopez.compose.rules:ktlint:0.4.28"))
    licenseHeader(
      """
      // SPDX-License-Identifier: Apache-2.0
      // Copyright 2025 tireless.dev

      """.trimIndent(),
    )
  }
  kotlinGradle {
    target("*.kts")
    ktlint()
  }
}

publishing {
  repositories {
    mavenLocal()
  }
  publications.withType<MavenPublication> {
    pom {
      name.set("meh")
      description.set("A Compose Multiplatform UI library")
      url.set("https://github.com/tireless-dev/meh")
      licenses {
        license {
          name.set("The Apache License, Version 2.0")
          url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
        }
      }
      developers {
        developer {
          name.set("Jerry Shang")
          email.set("jerryshang@gmail.com")
          url.set("https://tireless.dev")
        }
      }
      scm {
        url.set("https://github.com/tireless-dev/meh")
      }
    }
  }
}
