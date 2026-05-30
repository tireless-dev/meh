// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Select
import dev.tireless.meh.theme.MehTheme

@Composable
fun SelectPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Select(
        selectedOption = "Option 1",
        onClick = {},
        label = "Select label",
        helper = "Optional helper text"
      )
      Select(
        selectedOption = "Option 2",
        onClick = {},
        label = "Invalid state",
        error = "Please select a valid option"
      )
      Select(
        selectedOption = "Option 3",
        onClick = {},
        label = "Disabled state",
        enabled = false
      )
    }
  }
}
