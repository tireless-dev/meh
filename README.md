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

## Acknowledgment & Copyright Notice (Carbon Design System)

Some resources used in this project—such as icons—are sourced from the Carbon Design System.
The Carbon icons and design assets are licensed under the Apache License 2.0.
All copyrights for Carbon assets are owned by IBM.

- Carbon Icons Copyright © IBM
- Licensed under: Apache License, Version 2.0
- Official website: https://carbondesignsystem.com/

Please make sure to comply with the terms of the Apache 2.0 License and retain this attribution in
any distribution of this project.

## Unofficial Implementation Disclaimer

This project is an **independent**, **unofficial implementation** that provides Jetpack Compose
components following the Carbon Design System guidelines.
It is **not affiliated with, endorsed by, or associated with IBM or the official Carbon Design
System team**.
