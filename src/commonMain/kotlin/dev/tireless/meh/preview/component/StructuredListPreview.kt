// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.StructuredList
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "StructuredList", showBackground = true)
@Composable
internal fun StructuredListPreview() {
  PreviewTheme {
    StructuredList(
      headers = listOf("Column 1", "Column 2", "Column 3"),
      rows = listOf(
        listOf("Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3"),
        listOf("Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3")
      )
    )
  }
}
