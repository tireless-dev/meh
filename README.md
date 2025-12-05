# meh

A Compose Multiplatform UI library.

## Platforms

- Android
- iOS (arm64, x64, simulator)
- Desktop (JVM)

## Installation

Add the dependency to your project:

```kotlin
// settings.gradle.kts
repositories {
    mavenLocal() // or mavenCentral() when published
}

// build.gradle.kts (KMP)
commonMain.dependencies {
    implementation("dev.tireless:meh:<version>")
}

// build.gradle.kts (Android only)
dependencies {
    implementation("dev.tireless:meh:<version>")
}
```

## Usage

```kotlin
import dev.tireless.meh.Meh

@Composable
fun MyScreen() {
    Meh(text = "Hello!")
}
```

`Meh()` now ships with Compose Multiplatform resources. When you omit the `text` parameter, it resolves to `stringResource(Res.string.meh_default)` so the component always has a localized fallback.

## Build

```bash
./gradlew assembleRelease        # Android
./gradlew compileKotlinDesktop   # Desktop
./gradlew publishToMavenLocal    # Publish to ~/.m2
```

## Development

```bash
./gradlew spotlessCheck          # Check code formatting
./gradlew spotlessApply          # Auto-fix formatting
```

## Fonts

This library uses IBM Plex Sans fonts. Download them from the [official IBM Plex releases](https://github.com/IBM/plex/releases) and place the `.ttf` files in `src/commonMain/composeResources/font/`.

For each language variant (Latin, Traditional Chinese TC, Simplified Chinese SC), you'll need three weights: `Regular`, `Light`, and `SemiBold`. Additionally, `Italic` variants are used for Latin fonts.

**Example:**
- `IBMPlexSans-Regular.ttf`, `IBMPlexSans-Light.ttf`, `IBMPlexSans-SemiBold.ttf`
- `IBMPlexSansTC-Regular.ttf`, `IBMPlexSansTC-Light.ttf`, `IBMPlexSansTC-SemiBold.ttf`
- `IBMPlexSansSC-Regular.ttf`, `IBMPlexSansSC-Light.ttf`, `IBMPlexSansSC-SemiBold.ttf`

## License

```
Copyright 2025 tireless.dev

Licensed under the Apache License, Version 2.0
```

See [LICENSE](LICENSE) for details.
