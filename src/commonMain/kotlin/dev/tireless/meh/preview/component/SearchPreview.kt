// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Search
import dev.tireless.meh.theme.MehTheme

@Composable
fun SearchPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
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
