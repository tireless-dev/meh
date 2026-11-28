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
import dev.tireless.meh.component.ComboBox
import dev.tireless.meh.component.Dropdown
import dev.tireless.meh.component.DropdownOptionList
import dev.tireless.meh.component.Select
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun SelectPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val options = listOf("Option 1", "Option 2", "Option 3")

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Select, Dropdown & ComboBox", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Select(
            selectedOption = "Option 1",
            label = "Default select",
            helper = "Optional helper text",
          )
          Select(
            selectedOption = "Option 2",
            label = "Focus state",
            interactionSource = focusSource,
          )
          Select(
            selectedOption = "Invalid choice",
            label = "Invalid state",
            error = "A valid selection is required",
          )
          Select(
            selectedOption = "Region B",
            label = "Warning state",
            warning = "Higher latency expected",
          )
          Select(
            selectedOption = "Locked value",
            label = "Read-only state",
            readOnly = true,
          )
          Select(
            selectedOption = "Disabled",
            label = "Disabled state",
            enabled = false,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Dropdown(
            selectedOption = "Small (32px)",
            options = options,
            onOptionSelect = {},
            label = "Dropdown (Small)",
            size = ControlSize.Small,
          )
          Dropdown(
            selectedOption = "Inline option",
            options = options,
            onOptionSelect = {},
            label = "Inline:",
            inline = true,
          )
          ComboBox(
            value = "Option 2",
            onValueChange = {},
            options = options,
            onOptionSelect = {},
            label = "ComboBox (filterable)",
            helper = "Type to filter options",
          )
          Column {
            Select(
              selectedOption = "Option 2",
              label = "Open dropdown menu",
              expanded = true,
            )
            DropdownOptionList(
              options = options,
              selectedOption = "Option 2",
              onOptionSelect = {},
            )
          }
        }
      }
    }
  }
}
