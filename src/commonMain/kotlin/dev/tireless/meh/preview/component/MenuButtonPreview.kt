// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.MenuButton
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "MenuButton", showBackground = true)
@Composable
internal fun MenuButtonPreview() {
  PreviewTheme {
    MenuButton(
      text = "Actions",
      expanded = false,
      onExpandedChange = {},
    ) {
      MenuItem(text = "Option 1", onClick = {})
      MenuItem(text = "Option 2", onClick = {})
    }
  }
}
