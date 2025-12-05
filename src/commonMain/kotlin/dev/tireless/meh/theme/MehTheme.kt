// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily
import dev.tireless.meh.theme.Typography as MehTypography

object MehTheme {
  val colors: Colors
    @Composable @ReadOnlyComposable
    get() = LocalColors.current

  val spacing: Spacing
    @Composable @ReadOnlyComposable
    get() = LocalSpacing.current

  val size: Size
    @Composable @ReadOnlyComposable
    get() = LocalSizes.current

  val fontFamily: FontFamily
    @Composable @ReadOnlyComposable
    get() = LocalFontFamily.current

  val typography: MehTypography
    @Composable @ReadOnlyComposable
    get() = MehTypography
}

internal val LocalColors = staticCompositionLocalOf { whiteColors }
internal val LocalSpacing = staticCompositionLocalOf { Spacing }
internal val LocalSizes = staticCompositionLocalOf { Size }
internal val LocalFontFamily = staticCompositionLocalOf<FontFamily> { FontFamily.Default }

@Composable
fun MehTheme(
  colors: Colors = whiteColors,
  spacing: Spacing = Spacing,
  size: Size = Size,
  fontFamily: FontFamily = FontFamily.Default,
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
    LocalColors provides colors,
    LocalSpacing provides spacing,
    LocalSizes provides size,
    LocalFontFamily provides fontFamily,
    content = content,
  )
}
