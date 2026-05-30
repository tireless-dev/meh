// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.tireless.meh.generated.resources.IBMPlexSansSC_Light
import dev.tireless.meh.generated.resources.IBMPlexSansSC_Regular
import dev.tireless.meh.generated.resources.IBMPlexSansSC_SemiBold
import dev.tireless.meh.generated.resources.IBMPlexSansTC_Light
import dev.tireless.meh.generated.resources.IBMPlexSansTC_Regular
import dev.tireless.meh.generated.resources.IBMPlexSansTC_SemiBold
import dev.tireless.meh.generated.resources.Res
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.resources.Font

/**
 * Helper used by @Preview functions so they can live next to the actual composables in commonMain.
 * These functions are stripped from release artifacts, so the extra resources stay preview-only.
 */
@Composable
internal fun previewFontFamilySc(): FontFamily =
  FontFamily(
    Font(Res.font.IBMPlexSansSC_Light, weight = FontWeight.Light),
    Font(Res.font.IBMPlexSansSC_Regular, weight = FontWeight.Normal),
    Font(Res.font.IBMPlexSansSC_SemiBold, weight = FontWeight.SemiBold),
  )

@Composable
internal fun previewFontFamilyTc(): FontFamily =
  FontFamily(
    Font(Res.font.IBMPlexSansTC_Light, weight = FontWeight.Light),
    Font(Res.font.IBMPlexSansTC_Regular, weight = FontWeight.Normal),
    Font(Res.font.IBMPlexSansTC_SemiBold, weight = FontWeight.SemiBold),
  )

@Composable
internal fun previewFontFamily(): FontFamily = previewFontFamilySc()

@Composable
internal fun PreviewTheme(
  fontFamily: FontFamily = previewFontFamily(),
  content: @Composable () -> Unit,
) {
  MehTheme(fontFamily = fontFamily) {
    Box(
      modifier = Modifier
        .background(MehTheme.colors.background)
        .padding(16.dp),
    ) {
      content()
    }
  }
}
