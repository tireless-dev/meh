// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.NumberInput
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "NumberInput", showBackground = true)
@Composable
internal fun NumberInputPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      NumberInput(
        value = 50.0,
        onValueChange = {},
        label = "Number input label",
        helper = "Optional helper text",
        min = 0.0,
        max = 100.0
      )
      NumberInput(
        value = 10.0,
        onValueChange = {},
        label = "Invalid state",
        error = "Number is out of range"
      )
      NumberInput(
        value = 5.0,
        onValueChange = {},
        label = "Disabled state",
        enabled = false
      )
    }
  }
}
