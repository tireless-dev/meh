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

## License

```
Copyright 2025 tireless.dev

Licensed under the Apache License, Version 2.0
```

See [LICENSE](LICENSE) for details.
