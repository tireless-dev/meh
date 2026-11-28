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
import dev.tireless.meh.component.NumberInput
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun NumberInputPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Number Input States & Sizes", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          NumberInput(
            value = 50.0,
            onValueChange = {},
            label = "Default (0–100)",
            helper = "Optional helper text",
            min = 0.0,
            max = 100.0,
          )
          NumberInput(
            value = 42.0,
            onValueChange = {},
            label = "Focus state",
            interactionSource = focusSource,
          )
          NumberInput(
            value = 120.0,
            onValueChange = {},
            label = "Invalid state",
            error = "Number is not valid",
          )
          NumberInput(
            value = 95.0,
            onValueChange = {},
            label = "Warning state",
            warning = "Value is close to the limit",
          )
          NumberInput(
            value = 10.0,
            onValueChange = {},
            label = "Read-only state",
            readOnly = true,
          )
          NumberInput(
            value = 5.0,
            onValueChange = {},
            label = "Disabled state",
            helper = "Helper text",
            enabled = false,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          NumberInput(
            value = 10.0,
            onValueChange = {},
            label = "Small (32px)",
            size = ControlSize.Small,
          )
          NumberInput(
            value = 20.0,
            onValueChange = {},
            label = "Medium (40px — default)",
            size = ControlSize.Medium,
          )
          NumberInput(
            value = 30.0,
            onValueChange = {},
            label = "Large (48px)",
            size = ControlSize.Large,
          )
          NumberInput(
            value = 0.0,
            onValueChange = {},
            label = "At minimum bound",
            min = 0.0,
            max = 10.0,
          )
          NumberInput(
            value = 100.0,
            onValueChange = {},
            label = "Hidden steppers",
            hideSteppers = true,
          )
        }
      }
    }
  }
}
