// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Menu", showBackground = true)
@Composable
internal fun MenuPreview() {
  PreviewTheme {
    Column {
      MenuItem(text = "Menu item 1", onClick = {})
      MenuItem(text = "Menu item 2", onClick = {})
      MenuItem(text = "Menu item 3 (disabled)", onClick = {}, enabled = false)
    }
  }
}
