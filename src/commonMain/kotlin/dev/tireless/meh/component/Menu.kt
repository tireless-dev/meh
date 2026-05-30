// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

@Composable
fun Menu(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Popover(
    expanded = expanded,
    onDismissRequest = onDismissRequest,
    modifier = modifier.width(160.dp),
    content = {
      Column(modifier = Modifier.fillMaxWidth()) {
        content()
      }
    }
  )
}

@Composable
fun MenuItem(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .height(40.dp)
      .clickable(enabled = enabled, onClick = onClick)
      .padding(horizontal = MehTheme.spacing.spacing05),
    contentAlignment = Alignment.CenterStart
  ) {
    Text(
      text = text,
      style = MehTheme.typography.bodyCompact01,
      enabled = enabled
    )
  }
}

@Composable
fun OverflowMenu(
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Box(modifier = modifier) {
    MonoIconButton(
      icon = MehTheme.icons.OverflowMenuVertical,
      onClick = { onExpandedChange(!expanded) }
    )
    Menu(
      expanded = expanded,
      onDismissRequest = { onExpandedChange(false) },
      content = content
    )
  }
}
