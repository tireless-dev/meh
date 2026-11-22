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
import dev.tireless.meh.component.Checkbox
import dev.tireless.meh.component.CheckboxGroup
import dev.tireless.meh.component.GroupLayout
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 780)
@Preview(name = "Dark", widthDp = 780, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun CheckboxStatesPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        CheckboxStateColumn(
          title = "Unchecked",
          checked = false,
          indeterminate = false,
        )
        CheckboxStateColumn(
          title = "Checked",
          checked = true,
          indeterminate = false,
        )
        CheckboxStateColumn(
          title = "Indeterminate",
          checked = false,
          indeterminate = true,
        )
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Checkbox(
          checked = true,
          label = "Hidden label checkbox",
          hideLabel = true,
          onCheckedChange = {},
        )
        Checkbox(
          checked = false,
          label = "Multi-line checkbox label that wraps cleanly while keeping the box aligned to the first line",
          onCheckedChange = {},
          modifier = Modifier.width(240.dp),
        )
        Column(
          verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
        ) {
          Checkbox(
            checked = false,
            label = "With helper text",
            helper = "Helper text goes here",
            onCheckedChange = {},
          )
          Checkbox(
            checked = false,
            label = "Standalone invalid",
            invalid = true,
            invalidText = "Invalid message goes here",
            onCheckedChange = {},
          )
          Checkbox(
            checked = true,
            label = "Standalone warning",
            warn = true,
            warnText = "Warning message goes here",
            onCheckedChange = {},
          )
        }
      }
    }
  }
}

@Composable
private fun CheckboxStateColumn(
  title: String,
  checked: Boolean,
  indeterminate: Boolean,
) {
  val spacing = MehTheme.spacing
  Column(
    verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
  ) {
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Enabled)",
      onCheckedChange = {},
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Focus)",
      onCheckedChange = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Disabled)",
      enabled = false,
      onCheckedChange = {},
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Read-only)",
      readOnly = true,
      onCheckedChange = {},
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Read-only Focus)",
      readOnly = true,
      onCheckedChange = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Invalid)",
      invalid = true,
      onCheckedChange = {},
    )
    Checkbox(
      checked = checked,
      indeterminate = indeterminate,
      label = "$title (Warning)",
      warn = true,
      onCheckedChange = {},
    )
  }
}

@Preview(name = "Light", widthDp = 700)
@Preview(name = "Dark", widthDp = 700, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun CheckboxGroupPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        CheckboxGroup(
          label = "Vertical group",
          helper = "Helper text goes here",
          modifier = Modifier.weight(1f),
        ) {
          Checkbox(checked = true, label = "Checkbox label 1", onCheckedChange = {})
          Checkbox(checked = false, label = "Checkbox label 2", onCheckedChange = {})
          Checkbox(checked = false, indeterminate = true, label = "Checkbox label 3", onCheckedChange = {})
        }

        CheckboxGroup(
          label = "Invalid group",
          invalid = true,
          invalidText = "Invalid message goes here",
          modifier = Modifier.weight(1f),
        ) {
          Checkbox(checked = true, label = "Checkbox label 1", onCheckedChange = {})
          Checkbox(checked = false, label = "Checkbox label 2", onCheckedChange = {})
        }

        CheckboxGroup(
          label = "Warning group",
          warn = true,
          warnText = "Warning message goes here",
          modifier = Modifier.weight(1f),
        ) {
          Checkbox(checked = true, label = "Checkbox label 1", onCheckedChange = {})
          Checkbox(checked = false, label = "Checkbox label 2", onCheckedChange = {})
        }
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        CheckboxGroup(
          label = "Read-only group",
          readOnly = true,
          helper = "Read-only helper text",
          modifier = Modifier.weight(1f),
        ) {
          Checkbox(checked = true, label = "Checked", onCheckedChange = {})
          Checkbox(checked = false, label = "Unchecked", onCheckedChange = {})
          Checkbox(checked = false, indeterminate = true, label = "Indeterminate", onCheckedChange = {})
        }

        CheckboxGroup(
          label = "Disabled group",
          enabled = false,
          helper = "Disabled helper text",
          modifier = Modifier.weight(1f),
        ) {
          Checkbox(checked = true, label = "Checked", onCheckedChange = {})
          Checkbox(checked = false, label = "Unchecked", onCheckedChange = {})
          Checkbox(checked = false, indeterminate = true, label = "Indeterminate", onCheckedChange = {})
        }
      }

      CheckboxGroup(
        label = "Horizontal group (wrapping)",
        helper = "Horizontal layout wraps when items exceed available width",
        layout = GroupLayout.Horizontal,
      ) {
        Checkbox(checked = true, label = "Option one", onCheckedChange = {})
        Checkbox(checked = false, label = "Option two", onCheckedChange = {})
        Checkbox(checked = false, indeterminate = true, label = "Option three", onCheckedChange = {})
        Checkbox(checked = true, label = "Option four", onCheckedChange = {})
        Checkbox(checked = false, label = "Option five", onCheckedChange = {})
        Checkbox(checked = false, label = "Option six", onCheckedChange = {})
        Checkbox(checked = true, label = "Option seven", onCheckedChange = {})
        Checkbox(checked = false, label = "Option eight", onCheckedChange = {})
      }
    }
  }
}
