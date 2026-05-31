// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Link
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.Icons

@Preview(name = "Link", showBackground = true)
@Composable
internal fun LinkPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
      Link(text = "Primary link", onClick = {})
      Link(text = "Link with icon", icon = Icons.ArrowRight, onClick = {})
      Link(text = "Inline link", inline = true, onClick = {})
      Link(text = "Disabled link", enabled = false, onClick = {})
    }
  }
}
