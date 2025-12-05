// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object Typography {
  val fontFamily: FontFamily
    @Composable @ReadOnlyComposable
    get() = MehTheme.fontFamily

  val body01: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = fontFamily,
      )

  val bodyCompact01: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 14.sp,
        lineHeight = 18.sp,
        fontFamily = fontFamily,
      )

  val label01: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = fontFamily,
      )

  val label02: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 14.sp,
        lineHeight = 18.sp,
        fontFamily = fontFamily,
      )

  val headingCompact01: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 14.sp,
        lineHeight = 18.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.SemiBold,
      )

  val headingCompact02: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.SemiBold,
      )

  val heading01: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = fontFamily,
      )

  val heading02: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = fontFamily,
      )

  val heading03: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontFamily = fontFamily,
      )

  val heading04: TextStyle
    @Composable @ReadOnlyComposable
    get() =
      TextStyle(
        fontSize = 28.sp,
        lineHeight = 36.sp,
        fontFamily = fontFamily,
      )
}
