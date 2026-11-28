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
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.PasswordInput
import dev.tireless.meh.component.TextArea
import dev.tireless.meh.component.TextInput
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TextInputPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val textAreaFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Text Input States & Sizes", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          TextInput(
            value = "",
            onValueChange = {},
            label = "Default",
            placeholder = "Placeholder text",
            helper = "Optional helper text",
          )
          TextInput(
            value = "Focused input",
            onValueChange = {},
            label = "Focus state",
            interactionSource = focusSource,
          )
          TextInput(
            value = "Invalid value",
            onValueChange = {},
            label = "Invalid state",
            error = "Error message goes here",
          )
          TextInput(
            value = "Warning value",
            onValueChange = {},
            label = "Warning state",
            warning = "Warning message goes here",
          )
          TextInput(
            value = "Read-only content",
            onValueChange = {},
            label = "Read-only state",
            readOnly = true,
          )
          TextInput(
            value = "",
            onValueChange = {},
            label = "Disabled state",
            placeholder = "Placeholder text",
            helper = "Helper text",
            enabled = false,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          TextInput(
            value = "Small (32px)",
            onValueChange = {},
            label = "Small size",
            size = ControlSize.Small,
          )
          TextInput(
            value = "Medium (40px — default)",
            onValueChange = {},
            label = "Medium size",
            size = ControlSize.Medium,
          )
          TextInput(
            value = "Large (48px)",
            onValueChange = {},
            label = "Large size",
            size = ControlSize.Large,
          )

          BasicText(text = "Password Input", style = sectionStyle)

          PasswordInput(
            value = "hunter2",
            onValueChange = {},
            label = "Password (hidden)",
            helper = "Must be at least 8 characters",
          )
          PasswordInput(
            value = "visible-pass",
            onValueChange = {},
            label = "Password (visible)",
            passwordVisible = true,
          )
          PasswordInput(
            value = "short",
            onValueChange = {},
            label = "Password (invalid)",
            error = "Password is too short",
          )
        }
      }

      BasicText(text = "Text Area", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        TextArea(
          value = "Carbon text areas support multi-line input and an optional character counter.",
          onValueChange = {},
          modifier = Modifier.weight(1f),
          label = "Description",
          helper = "Optional helper text",
          maxCount = 200,
          minHeight = 96.dp,
        )
        TextArea(
          value = "Focused text area",
          onValueChange = {},
          modifier = Modifier.weight(1f),
          label = "Focus state",
          interactionSource = textAreaFocusSource,
          minHeight = 96.dp,
        )
        TextArea(
          value = "Invalid multi-line text",
          onValueChange = {},
          modifier = Modifier.weight(1f),
          label = "Invalid state",
          error = "Description contains invalid characters",
          minHeight = 96.dp,
        )
      }
    }
  }
}
