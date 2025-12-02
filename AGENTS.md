# AGENTS.md

This file provides guidance for AI agents working on this codebase.

## Project Overview

**meh** is a Compose Multiplatform UI library.

- **Package:** `dev.tireless.meh`
- **Maven coordinates:** `dev.tireless:meh:<version>`
- **Targets:** Android, iOS (arm64, x64, simulator), Desktop (JVM)

## Tech Stack

- Kotlin Multiplatform
- Compose Multiplatform (JetBrains)
- Gradle with Kotlin DSL
- Version catalog (`gradle/libs.versions.toml`)
- Spotless + ktlint (code formatting)
- ktlint-compose-rules (Compose-specific linting)

## Project Structure

```
meh/
├── build.gradle.kts          # Main build config with KMP + Compose + Maven publish
├── settings.gradle.kts       # Single-module project settings
├── gradle/libs.versions.toml # Version catalog for dependencies
├── .editorconfig             # Code style and ktlint config
├── .github/dependabot.yml    # Automated dependency updates
└── src/commonMain/kotlin/    # Shared Compose code for all platforms
    └── dev/tireless/meh/
```

## Build Commands

```bash
./gradlew assembleRelease        # Build Android AAR
./gradlew compileKotlinDesktop   # Build Desktop JVM
./gradlew compileKotlinIosArm64  # Build iOS
./gradlew publishToMavenLocal    # Publish all variants to ~/.m2/repository
./gradlew spotlessCheck          # Check code formatting
./gradlew spotlessApply          # Auto-fix code formatting
```

## Key Conventions

### Dependencies
- Use `compose.*` accessors from the Compose Multiplatform plugin (e.g., `compose.runtime`, `compose.foundation`)
- Avoid Material dependencies unless necessary; prefer foundation APIs (`BasicText` over `Text`)
- Keep dependencies minimal - don't force consumers to include unused libraries

### Source Sets
- `commonMain` - Shared code for all platforms
- `androidMain` - Android-specific code (only if needed)
- `desktopMain` - Desktop-specific code (only if needed)
- `iosMain` - iOS-specific code (only if needed)

### Previews
- Use `org.jetbrains.compose.ui.tooling.preview.Preview` (multiplatform)
- NOT `androidx.compose.ui.tooling.preview.Preview` (Android-only)

### Versioning
- Version is set in `build.gradle.kts` via `version = "x.x.x"`
- Published artifacts use `group = "dev.tireless"`

## Publishing

Artifacts are published to Maven Local by default. Published variants:
- `dev.tireless:meh` - Common metadata
- `dev.tireless:meh-android` - Android AAR
- `dev.tireless:meh-desktop` - Desktop JVM JAR
- `dev.tireless:meh-iosarm64` - iOS ARM64
- `dev.tireless:meh-iossimulatorarm64` - iOS Simulator
- `dev.tireless:meh-iosx64` - iOS x64

## Notes

- AndroidManifest.xml is auto-generated (namespace defined in build.gradle.kts)
- No ProGuard rules needed; minification is disabled
- JVM target is 17 for both Android and Desktop
- All source files must have SPDX license header (enforced by Spotless)
- ktlint config is in `.editorconfig` (Compose function naming rule disabled for `@Composable`)
- Dependabot checks for Gradle and GitHub Actions updates weekly
