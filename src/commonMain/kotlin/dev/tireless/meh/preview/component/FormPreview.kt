// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonType
import dev.tireless.meh.component.Checkbox
import dev.tireless.meh.component.Form
import dev.tireless.meh.component.FormButtonGroup
import dev.tireless.meh.component.TextInput
import dev.tireless.meh.theme.MehTheme

@Composable
fun FormPreview() {
  MehTheme {
    Form(modifier = Modifier.padding(16.dp)) {
      TextInput(
        value = "",
        onValueChange = {},
        label = "First Name",
        placeholder = "e.g. John"
      )
      TextInput(
        value = "",
        onValueChange = {},
        label = "Last Name",
        placeholder = "e.g. Doe"
      )
      Checkbox(
        checked = false,
        onCheckedChange = {},
        label = "I agree to the terms and conditions"
      )
      FormButtonGroup {
        Button(text = "Submit", onClick = {})
        Button(text = "Cancel", onClick = {}, type = ButtonType.Secondary)
      }
    }
  }
}
