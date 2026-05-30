// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.MehTheme

@Composable
fun Breadcrumb(
  items: List<String>,
  onItemClick: (Int) -> Unit,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically
  ) {
    items.forEachIndexed { index, title ->
      val isLast = index == items.size - 1

      if (isLast) {
        Text(
          text = title,
          style = MehTheme.typography.label01,
          color = MehTheme.colors.textPrimary,
          modifier = Modifier.padding(horizontal = MehTheme.spacing.spacing03)
        )
      } else {
        Link(
          text = title,
          onClick = { onItemClick(index) },
          modifier = Modifier.padding(horizontal = MehTheme.spacing.spacing03)
        )
        Text(
          text = "/",
          style = MehTheme.typography.label01,
          color = MehTheme.colors.textSecondary
        )
      }
    }
  }
}
