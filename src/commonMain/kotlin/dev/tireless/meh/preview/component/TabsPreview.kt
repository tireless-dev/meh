// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.TabVariant
import dev.tireless.meh.component.Tabs
import dev.tireless.meh.theme.MehTheme

@Composable
fun TabsPreview() {
  val tabs = listOf("Tab 1", "Tab 2", "Tab 3")
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
      Tabs(
        selectedIndex = 0,
        onTabSelected = {},
        tabs = tabs,
        variant = TabVariant.Line
      )

      Tabs(
        selectedIndex = 1,
        onTabSelected = {},
        tabs = tabs,
        variant = TabVariant.Contained
      )
    }
  }
}
