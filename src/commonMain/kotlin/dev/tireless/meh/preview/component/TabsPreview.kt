// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.TabVariant
import dev.tireless.meh.component.Tabs
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Tabs", showBackground = true)
@Composable
internal fun TabsPreview() {
  val tabs = listOf("Tab 1", "Tab 2", "Tab 3")
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
      Tabs(
        selectedIndex = 0,
        onTabSelect = {},
        tabs = tabs,
        variant = TabVariant.Line,
      )

      Tabs(
        selectedIndex = 1,
        onTabSelect = {},
        tabs = tabs,
        variant = TabVariant.Contained,
      )
    }
  }
}
