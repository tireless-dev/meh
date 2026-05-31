// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Tag
import dev.tireless.meh.component.TagType
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.TagSize

@OptIn(ExperimentalLayoutApi::class)
@Preview(name = "Tag", showBackground = true)
@Composable
internal fun TagPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
      ) {
        Tag(text = "Gray", type = TagType.Gray)
        Tag(text = "Red", type = TagType.Red)
        Tag(text = "Magenta", type = TagType.Magenta)
        Tag(text = "Purple", type = TagType.Purple)
        Tag(text = "Blue", type = TagType.Blue)
        Tag(text = "Cyan", type = TagType.Cyan)
        Tag(text = "Teal", type = TagType.Teal)
        Tag(text = "Green", type = TagType.Green)
        Tag(text = "High contrast", type = TagType.HighContrast)
      }

      FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
      ) {
        Tag(text = "Small", size = TagSize.Small)
        Tag(text = "Dismissible", onClose = {})
      }
    }
  }
}
