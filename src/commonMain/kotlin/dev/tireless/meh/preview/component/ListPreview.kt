// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.ContainedList
import dev.tireless.meh.component.OrderedList
import dev.tireless.meh.component.UnorderedList
import dev.tireless.meh.theme.MehTheme

@Composable
fun ListPreview() {
  val items = listOf("List item 1", "List item 2", "List item 3")
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
      UnorderedList(items = items)
      OrderedList(items = items)
      ContainedList(title = "Contained list title", items = items)
    }
  }
}
