// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize

@Composable
fun MenuButton(
  text: String,
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  kind: ButtonKind = ButtonKind.Primary,
  size: ControlSize = ControlSize.Large,
  content: @Composable () -> Unit,
) {
  Box(modifier = modifier) {
    Button(
      text = text,
      enabled = enabled,
      kind = kind,
      size = size,
      modifier = Modifier.padding(end = 0.dp), // Avoid padding issue if we added an icon
      onClick = { onExpandedChange(!expanded) },
    )
    // Carbon menu button often has a chevron
    Menu(
      expanded = expanded,
      onDismissRequest = { onExpandedChange(false) },
      content = content,
    )
  }
}
