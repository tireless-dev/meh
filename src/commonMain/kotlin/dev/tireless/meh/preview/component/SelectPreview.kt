// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Select
import dev.tireless.meh.preview.PreviewTheme

@PreviewLightDark
@Composable
internal fun SelectPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Select(
        selectedOption = "Option 1",
        label = "Select label",
        helper = "Optional helper text",
      )
      Select(
        selectedOption = "Option 2",
        label = "Invalid state",
        error = "Please select a valid option",
      )
      Select(
        selectedOption = "Option 3",
        label = "Disabled state",
        enabled = false,
      )
      Select(
        selectedOption = "No label",
        expanded = true,
      )
    }
  }
}
