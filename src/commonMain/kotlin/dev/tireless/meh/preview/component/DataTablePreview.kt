// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.DataTable
import dev.tireless.meh.component.DataTableSortDirection
import dev.tireless.meh.component.Search
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun DataTablePreview() {
  PreviewTheme {
    val headers = listOf("Name", "Protocol", "Port", "Status")
    val rows = listOf(
      listOf("Load Balancer 1", "HTTP", "80", "Active"),
      listOf("Load Balancer 2", "HTTPS", "443", "Active"),
      listOf("Load Balancer 3", "TCP", "8080", "Disabled"),
    )

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing06),
    ) {
      DataTable(
        title = "Load balancers",
        description = "With toolbar, sorting, and zebra striping.",
        headers = headers,
        rows = rows,
        size = ControlSize.Medium,
        useZebraStyles = true,
        sortColumnIndex = 0,
        sortDirection = DataTableSortDirection.Ascending,
        onSort = {},
        toolbar = {
          Search(
            value = "",
            onValueChange = {},
            onClear = {},
            placeholder = "Filter table",
            size = ControlSize.Large,
            modifier = Modifier.weight(1f),
          )
          Button(text = "Add new", onClick = {}, size = ControlSize.Large)
        },
      )

      DataTable(
        title = "Batch selection",
        headers = headers,
        rows = rows,
        size = ControlSize.Small,
        selectedRows = setOf(0, 1),
        onRowSelectionChange = {},
      )
    }
  }
}
