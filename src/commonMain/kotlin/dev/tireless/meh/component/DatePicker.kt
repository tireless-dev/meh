// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Composable
fun DatePicker(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String = "mm/dd/yyyy",
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    TextInput(
      value = value,
      onValueChange = onValueChange,
      label = label,
      placeholder = placeholder,
      helper = helper,
      error = error,
      enabled = enabled,
      size = size,
      trailingIcon = {
        Icon(
          image = MehTheme.icons.Calendar,
          size = dev.tireless.meh.theme.IconSize.Small,
          tint = if (enabled) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled
        )
      }
    )
  }
}
