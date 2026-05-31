// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Toggle
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ToggleSize

@Preview(name = "Toggle", showBackground = true)
@Composable
internal fun TogglePreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Toggle(toggled = false, label = "Default size (Off)", onToggledChange = {})
      Toggle(toggled = true, label = "Default size (On)", onToggledChange = {})
      Toggle(toggled = false, label = "Small size", size = ToggleSize.Small, onToggledChange = {})
      Toggle(toggled = true, label = "Disabled", enabled = false, onToggledChange = {})
    }
  }
}
