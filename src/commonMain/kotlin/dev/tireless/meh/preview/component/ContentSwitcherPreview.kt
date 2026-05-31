// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.ContentSwitcher
import dev.tireless.meh.theme.MehTheme

@Composable
fun ContentSwitcherPreview() {
  MehTheme {
    ContentSwitcher(
      selectedIndex = 0,
      options = listOf("Option 1", "Option 2", "Option 3"),
      onOptionSelected = {},
      modifier = Modifier.padding(16.dp)
    )
  }
}
