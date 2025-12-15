import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
  alias(libs.plugins.kotlin.multiplatform)
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.compose.multiplatform)
  alias(libs.plugins.android.library)
  alias(libs.plugins.spotless)
  id("maven-publish")
}

kotlin {
  androidTarget {
    compilations.all {
      compileTaskProvider.configure {
        compilerOptions {
          jvmTarget.set(JvmTarget.JVM_17)
        }
      }
    }
    publishLibraryVariants("release")
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
    }

    androidMain.dependencies {
      implementation(compose.preview)
      implementation(compose.uiTooling)
    }
  }
}

android {
  namespace = "dev.tireless.meh"
  compileSdk = 36

  defaultConfig {
    minSdk = 24
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
}

group = "dev.tireless"
version = "0.2512.0-SNAPTHOT"

spotless {
  kotlin {
    target("src/**/*.kt")
    ktlint()
      .customRuleSets(listOf("io.nlopez.compose.rules:ktlint:0.5.2"))
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
