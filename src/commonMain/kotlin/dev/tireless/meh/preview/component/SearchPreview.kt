// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Search
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Search", showBackground = true)
@Composable
internal fun SearchPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Search(
        value = "",
        onValueChange = {},
        onClear = {},
        placeholder = "Search"
      )
      Search(
        value = "Carbon design",
        onValueChange = {},
        onClear = {}
      )
      Search(
        value = "",
        onValueChange = {},
        onClear = {},
        enabled = false
      )
    }
  }
}
