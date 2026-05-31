// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Checkbox
import dev.tireless.meh.component.CheckboxGroup
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Checkbox", showBackground = true)
@Composable
internal fun CheckboxPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
      CheckboxGroup(label = "Checkbox states") {
        Checkbox(checked = false, label = "Unchecked", onCheckedChange = {})
        Checkbox(checked = true, label = "Checked", onCheckedChange = {})
        Checkbox(checked = false, label = "Indeterminate", indeterminate = true, onCheckedChange = {})
        Checkbox(checked = false, label = "Disabled", enabled = false, onCheckedChange = {})
        Checkbox(checked = true, label = "Checked Disabled", enabled = false, onCheckedChange = {})
      }
    }
  }
}
