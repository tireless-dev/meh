// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.InlineLoading
import dev.tireless.meh.component.Loading
import dev.tireless.meh.component.LoadingStatus
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.LoadingSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 640)
@Preview(name = "Dark", widthDp = 640, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun LoadingPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography

    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          Loading(size = LoadingSize.Large)
          BasicText(
            text = "Large (88dp)",
            style = typography.label01.copy(color = colors.textSecondary),
          )
        }

        Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          Loading(size = LoadingSize.Small)
          BasicText(
            text = "Small (16dp)",
            style = typography.label01.copy(color = colors.textSecondary),
          )
        }

        Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          Box(
            modifier =
            Modifier
              .size(width = 160.dp, height = 120.dp)
              .background(colors.layer01),
            contentAlignment = Alignment.Center,
          ) {
            BasicText(
              text = "Underlying content",
              style = typography.bodyCompact01.copy(color = colors.textPrimary),
            )
            Loading(withOverlay = true)
          }
          BasicText(
            text = "With overlay",
            style = typography.label01.copy(color = colors.textSecondary),
          )
        }
      }

      Column(
        verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
      ) {
        InlineLoading(
          status = LoadingStatus.Active,
          description = "Loading data...",
        )
        InlineLoading(
          status = LoadingStatus.Finished,
          description = "Data loaded successfully",
        )
        InlineLoading(
          status = LoadingStatus.Error,
          description = "Failed to load data",
        )
        InlineLoading(
          status = LoadingStatus.Inactive,
          description = "Inactive status (no icon)",
        )
      }
    }
  }
}
