// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.GroupLayout
import dev.tireless.meh.component.RadioButton
import dev.tireless.meh.component.RadioButtonGroup
import dev.tireless.meh.component.RadioLabelPosition
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 640)
@Preview(name = "Dark", widthDp = 640, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun RadioButtonStatesPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        RadioButtonStateColumn(
          title = "Unselected",
          selected = false,
        )
        RadioButtonStateColumn(
          title = "Selected",
          selected = true,
        )
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        RadioButton(
          selected = true,
          label = "Hidden label radio",
          hideLabel = true,
          onClick = {},
        )
        RadioButton(
          selected = true,
          label = "Label on left",
          labelPosition = RadioLabelPosition.Left,
          onClick = {},
        )
        RadioButton(
          selected = false,
          label = "Multi-line radio button label that wraps cleanly while keeping the circle aligned to the first line",
          onClick = {},
          modifier = Modifier.width(260.dp),
        )
      }
    }
  }
}

@Composable
private fun RadioButtonStateColumn(
  title: String,
  selected: Boolean,
) {
  val spacing = MehTheme.spacing
  Column(
    verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
  ) {
    RadioButton(
      selected = selected,
      label = "$title (Enabled)",
      onClick = {},
    )
    RadioButton(
      selected = selected,
      label = "$title (Focus)",
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    RadioButton(
      selected = selected,
      label = "$title (Disabled)",
      enabled = false,
      onClick = {},
    )
    RadioButton(
      selected = selected,
      label = "$title (Read-only)",
      readOnly = true,
      onClick = {},
    )
    RadioButton(
      selected = selected,
      label = "$title (Read-only Focus)",
      readOnly = true,
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    RadioButton(
      selected = selected,
      label = "$title (Invalid)",
      invalid = true,
      onClick = {},
    )
  }
}

@Preview(name = "Light", widthDp = 720)
@Preview(name = "Dark", widthDp = 720, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun RadioButtonGroupPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        RadioButtonGroup(
          label = "Vertical group",
          helper = "Helper text goes here",
          layout = GroupLayout.Vertical,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Radio button label", onClick = {})
          RadioButton(selected = false, label = "Radio button label", onClick = {})
          RadioButton(selected = false, label = "Radio button label", onClick = {})
        }

        RadioButtonGroup(
          label = "Invalid group",
          invalid = true,
          invalidText = "Invalid selection",
          layout = GroupLayout.Vertical,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Radio button label", onClick = {})
          RadioButton(selected = false, label = "Radio button label", onClick = {})
        }

        RadioButtonGroup(
          label = "Warning group",
          warn = true,
          warnText = "Warning notice",
          layout = GroupLayout.Vertical,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Radio button label", onClick = {})
          RadioButton(selected = false, label = "Radio button label", onClick = {})
        }
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        RadioButtonGroup(
          label = "Read-only group",
          readOnly = true,
          helper = "Read-only helper text",
          layout = GroupLayout.Vertical,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Selected", onClick = {})
          RadioButton(selected = false, label = "Unselected", onClick = {})
        }

        RadioButtonGroup(
          label = "Disabled group",
          enabled = false,
          helper = "Disabled helper text",
          layout = GroupLayout.Vertical,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Selected", onClick = {})
          RadioButton(selected = false, label = "Unselected", onClick = {})
        }

        RadioButtonGroup(
          label = "Vertical (label left)",
          layout = GroupLayout.Vertical,
          labelPosition = RadioLabelPosition.Left,
          modifier = Modifier.weight(1f),
        ) {
          RadioButton(selected = true, label = "Short", onClick = {})
          RadioButton(selected = false, label = "Longer option", onClick = {})
        }
      }

      RadioButtonGroup(
        label = "Horizontal group (default)",
        helper = "Horizontal layout wraps when items exceed available width",
        layout = GroupLayout.Horizontal,
      ) {
        RadioButton(selected = true, label = "Option one", onClick = {})
        RadioButton(selected = false, label = "Option two", onClick = {})
        RadioButton(selected = false, label = "Option three", onClick = {})
        RadioButton(selected = false, label = "Option four", onClick = {})
        RadioButton(selected = false, label = "Option five", onClick = {})
        RadioButton(selected = false, label = "Option six", onClick = {})
        RadioButton(selected = false, label = "Option seven", onClick = {})
      }
    }
  }
}
