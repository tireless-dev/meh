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
import dev.tireless.meh.component.Multiselect
import dev.tireless.meh.component.MultiselectOptionList
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun MultiselectPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val allOptions = listOf("US East", "EU Central", "AP Northeast", "SA East")
    val selected = listOf("US East", "EU Central")

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Multiselect States & Open Menu", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Multiselect(
            selectedOptions = emptyList(),
            onClick = {},
            label = "Empty state",
            helper = "Select one or more regions",
          )
          Multiselect(
            selectedOptions = selected,
            onClick = {},
            onSelectionChange = {},
            label = "With selections",
          )
          Multiselect(
            selectedOptions = emptyList(),
            onClick = {},
            label = "Invalid state",
            error = "At least one region is required",
          )
          Multiselect(
            selectedOptions = selected,
            onClick = {},
            label = "Disabled state",
            enabled = false,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Multiselect(
            selectedOptions = selected,
            onClick = {},
            onSelectionChange = {},
            label = "Small size (32px)",
            size = ControlSize.Small,
          )
          Column {
            Multiselect(
              selectedOptions = selected,
              onClick = {},
              onSelectionChange = {},
              label = "Expanded checklist",
              expanded = true,
            )
            MultiselectOptionList(
              options = allOptions,
              selectedOptions = selected,
              onToggle = {},
            )
          }
        }
      }
    }
  }
}
