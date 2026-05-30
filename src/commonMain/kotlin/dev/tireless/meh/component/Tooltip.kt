// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.gray80

@Composable
fun Tooltip(
  text: String,
  expanded: Boolean,
  modifier: Modifier = Modifier,
) {
  if (expanded) {
    Popup {
      Box(
        modifier = modifier
          .clip(RoundedCornerShape(2.dp))
          .background(gray80)
          .padding(MehTheme.spacing.spacing03)
      ) {
        Text(
          text = text,
          style = MehTheme.typography.label01,
          color = MehTheme.colors.textOnColor
        )
      }
    }
  }
}

@Composable
fun Toggletip(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Popover(
    expanded = expanded,
    onDismissRequest = onDismissRequest,
    modifier = modifier,
    content = content
  )
}
