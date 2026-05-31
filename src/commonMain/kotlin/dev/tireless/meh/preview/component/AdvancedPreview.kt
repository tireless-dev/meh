// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.AiLabel
import dev.tireless.meh.component.ContentSwitcher
import dev.tireless.meh.component.DataTable
import dev.tireless.meh.component.Header
import dev.tireless.meh.component.MonoIconButton
import dev.tireless.meh.theme.MehTheme

@Composable
fun AdvancedPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
      Header(
        title = "Application Name",
        onMenuClick = {},
        actions = {
          MonoIconButton(icon = MehTheme.icons.Search, onClick = {})
          MonoIconButton(icon = MehTheme.icons.User, onClick = {})
        }
      )

      ContentSwitcher(
        selectedIndex = 0,
        options = listOf("Option 1", "Option 2", "Option 3"),
        onOptionSelected = {}
      )

      AiLabel()

      DataTable(
        headers = listOf("Name", "Status", "Value"),
        rows = listOf(
          listOf("Item 1", "Active", "$100.00"),
          listOf("Item 2", "Disabled", "$50.00"),
          listOf("Item 3", "Active", "$200.00")
        )
      )
    }
  }
}
