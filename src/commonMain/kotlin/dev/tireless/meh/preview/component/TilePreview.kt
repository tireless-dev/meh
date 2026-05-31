// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.ClickableTile
import dev.tireless.meh.component.Text
import dev.tireless.meh.component.Tile
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Tile", showBackground = true)
@Composable
internal fun TilePreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Tile {
        Text("This is a default tile.")
      }

      ClickableTile(onClick = {}) {
        Text("This is a clickable tile.")
      }
    }
  }
}
