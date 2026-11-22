// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ProgressBar
import dev.tireless.meh.component.ProgressBarStatus
import dev.tireless.meh.component.ProgressBarType
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ProgressBarSize

@Preview(name = "Light", widthDp = 720)
@Preview(name = "Dark", widthDp = 720, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ProgressBarPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing

    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          ProgressBar(
            label = "Default big (Active)",
            value = 75f,
            helperText = "75% complete",
          )
          ProgressBar(
            label = "Default small (Active)",
            value = 40f,
            helperText = "40MB of 100MB",
            size = ProgressBarSize.Small,
          )
          ProgressBar(
            label = "Indeterminate",
            helperText = "Loading...",
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          ProgressBar(
            label = "Finished status",
            value = 100f,
            helperText = "Done",
            status = ProgressBarStatus.Finished,
          )
          ProgressBar(
            label = "Error status",
            value = 40f,
            helperText = "Upload failed",
            status = ProgressBarStatus.Error,
          )
          ProgressBar(
            label = "Indented type",
            value = 60f,
            helperText = "Indented helper text",
            type = ProgressBarType.Indented,
          )
        }
      }

      Column(
        verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ProgressBar(
          label = "Inline active",
          value = 65f,
          helperText = "Hidden in inline mode",
          type = ProgressBarType.Inline,
        )
        ProgressBar(
          label = "Inline small indeterminate",
          size = ProgressBarSize.Small,
          type = ProgressBarType.Inline,
        )
        ProgressBar(
          label = "Inline finished",
          status = ProgressBarStatus.Finished,
          type = ProgressBarType.Inline,
        )
        ProgressBar(
          label = "Inline error",
          status = ProgressBarStatus.Error,
          type = ProgressBarType.Inline,
        )
      }
    }
  }
}
