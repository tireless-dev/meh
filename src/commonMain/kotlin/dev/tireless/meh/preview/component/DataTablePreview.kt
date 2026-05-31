// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.DataTable
import dev.tireless.meh.theme.MehTheme

@Composable
fun DataTablePreview() {
  MehTheme {
    DataTable(
      headers = listOf("Name", "Status", "Value"),
      rows = listOf(
        listOf("Item 1", "Active", "$100.00"),
        listOf("Item 2", "Disabled", "$50.00"),
        listOf("Item 3", "Active", "$200.00")
      ),
      modifier = Modifier.padding(16.dp)
    )
  }
}
