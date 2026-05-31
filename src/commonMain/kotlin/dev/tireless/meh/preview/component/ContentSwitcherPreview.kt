// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ContentSwitcher
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "ContentSwitcher", showBackground = true)
@Composable
internal fun ContentSwitcherPreview() {
  PreviewTheme {
    ContentSwitcher(
      selectedIndex = 0,
      options = listOf("Option 1", "Option 2", "Option 3"),
      onOptionSelected = {}
    )
  }
}
