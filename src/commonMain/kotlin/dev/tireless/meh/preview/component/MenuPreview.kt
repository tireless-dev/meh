// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.theme.MehTheme

@Composable
fun MenuPreview() {
  MehTheme {
    Column(modifier = Modifier.padding(16.dp)) {
      MenuItem(text = "Menu item 1", onClick = {})
      MenuItem(text = "Menu item 2", onClick = {})
      MenuItem(text = "Menu item 3 (disabled)", onClick = {}, enabled = false)
    }
  }
}
