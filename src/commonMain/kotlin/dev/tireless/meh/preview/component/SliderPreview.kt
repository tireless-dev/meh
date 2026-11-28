// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.RangeSlider
import dev.tireless.meh.component.Slider
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun SliderPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val activeSource = rememberPreviewInteractionSource(PreviewInteractionState.Active)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Slider States & Variants", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Slider(
            value = 50f,
            onValueChange = {},
            label = "Default slider",
            helper = "Optional helper text",
          )
          Slider(
            value = 65f,
            onValueChange = {},
            label = "Focus state",
            interactionSource = focusSource,
          )
          Slider(
            value = 35f,
            onValueChange = {},
            label = "Active (dragging) state",
            interactionSource = activeSource,
          )
          Slider(
            value = 70f,
            onValueChange = {},
            label = "Without text input",
            hideTextInput = true,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Slider(
            value = 95f,
            onValueChange = {},
            label = "Invalid state",
            error = "Value exceeds recommended threshold",
          )
          Slider(
            value = 80f,
            onValueChange = {},
            label = "Warning state",
            warning = "Approaching capacity limit",
          )
          Slider(
            value = 40f,
            onValueChange = {},
            label = "Read-only state",
            readOnly = true,
          )
          Slider(
            value = 50f,
            onValueChange = {},
            label = "Disabled state",
            enabled = false,
          )
        }
      }

      BasicText(text = "Range Slider", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        RangeSlider(
          value = 25f..75f,
          onValueChange = {},
          label = "Price range",
          modifier = Modifier.weight(1f),
        )
        RangeSlider(
          value = 20f..80f,
          onValueChange = {},
          label = "Disabled range",
          enabled = false,
          modifier = Modifier.weight(1f),
        )
      }
    }
  }
}
