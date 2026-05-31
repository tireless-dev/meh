// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp
import dev.tireless.meh.theme.gray80

@Composable
fun ContentSwitcher(
  selectedIndex: Int,
  options: List<String>,
  onOptionSelected: (Int) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(size.dp)
      .background(MehTheme.colors.layer01)
  ) {
    options.forEachIndexed { index, option ->
      val selected = index == selectedIndex
      Box(
        modifier = Modifier
          .weight(1f)
          .height(size.dp)
          .background(if (selected) gray80 else Color.Transparent)
          .clickable(enabled = enabled) { onOptionSelected(index) }
          .padding(horizontal = MehTheme.spacing.spacing05),
        contentAlignment = Alignment.Center
      ) {
        Text(
          text = option,
          style = MehTheme.typography.bodyCompact01,
          color = if (selected) MehTheme.colors.textOnColor else MehTheme.colors.textSecondary,
          enabled = enabled
        )
      }
    }
  }
}
