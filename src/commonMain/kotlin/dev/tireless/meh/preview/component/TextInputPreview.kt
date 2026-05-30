// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.TextInput
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Composable
fun TextInputPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      TextInput(
        value = "",
        onValueChange = {},
        label = "Text input label",
        placeholder = "Placeholder text",
        helper = "Optional helper text"
      )
      TextInput(
        value = "Filled text",
        onValueChange = {},
        label = "Filled state"
      )
      TextInput(
        value = "Invalid input",
        onValueChange = {},
        label = "Invalid state",
        error = "Invalid selection"
      )
      TextInput(
        value = "",
        onValueChange = {},
        label = "Disabled state",
        enabled = false,
        placeholder = "Placeholder text"
      )
      TextInput(
        value = "Small size",
        onValueChange = {},
        label = "Small size",
        size = ControlSize.Small
      )
    }
  }
}
