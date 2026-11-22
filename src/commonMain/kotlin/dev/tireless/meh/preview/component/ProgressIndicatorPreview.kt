// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ProgressIndicator
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 720)
@Preview(name = "Dark", widthDp = 720, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ProgressIndicatorPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val activeSource = rememberPreviewInteractionSource(PreviewInteractionState.Active)

    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing07),
    ) {
      ProgressIndicator(
        currentIndex = 1,
        onStepClick = {},
      ) {
        step(label = "First step", secondaryLabel = "Optional")
        step(label = "Second step", secondaryLabel = "Current")
        step(label = "Third step", invalid = true)
        step(label = "Fourth step")
        step(label = "Fifth step", enabled = false)
      }

      ProgressIndicator(
        currentIndex = 2,
        onStepClick = {},
        spaceEqually = true,
      ) {
        step(label = "Hover state", interactionSource = hoverSource)
        step(label = "Focus state", interactionSource = focusSource)
        step(label = "Current step", secondaryLabel = "Active")
        step(label = "Active press", interactionSource = activeSource)
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing08),
      ) {
        ProgressIndicator(
          currentIndex = 1,
          vertical = true,
          onStepClick = {},
        ) {
          step(label = "First step", secondaryLabel = "Optional")
          step(label = "Second step with longer wrapping label")
          step(label = "Third step", invalid = true, secondaryLabel = "Needs review")
          step(label = "Fourth step")
          step(label = "Fifth step", enabled = false)
        }

        ProgressIndicator(
          currentIndex = 2,
          steps = listOf("Account", "Billing", "Review", "Confirm"),
          vertical = true,
        )
      }
    }
  }
}
