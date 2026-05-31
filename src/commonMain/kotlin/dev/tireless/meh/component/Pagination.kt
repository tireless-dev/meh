// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Composable
fun Pagination(
  page: Int,
  totalItems: Int,
  pageSize: Int,
  onPageChange: (Int) -> Unit,
  onPageSizeChange: (Int) -> Unit,
  modifier: Modifier = Modifier,
  pageSizes: List<Int> = listOf(10, 20, 30, 40, 50),
) {
  val totalPages = (totalItems + pageSize - 1) / pageSize
  val startItem = (page - 1) * pageSize + 1
  val endItem = (startItem + pageSize - 1).coerceAtMost(totalItems)

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(48.dp)
      .background(MehTheme.colors.background)
      .padding(horizontal = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = "Items per page: ",
      style = MehTheme.typography.label01,
      color = MehTheme.colors.textSecondary,
    )

    // Simplified select for page size
    Row(
      modifier = Modifier.clickable { /* Show menu */ },
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Text(text = pageSize.toString(), style = MehTheme.typography.label01)
      Icon(image = Icons.ChevronDown, size = IconSize.XSmall)
    }

    Spacer(Modifier.weight(1f))

    Text(
      text = "$startItem-$endItem of $totalItems items",
      style = MehTheme.typography.label01,
      color = MehTheme.colors.textSecondary,
    )

    Spacer(Modifier.padding(start = MehTheme.spacing.spacing07))

    Text(
      text = "$page of $totalPages pages",
      style = MehTheme.typography.label01,
      color = MehTheme.colors.textSecondary,
    )

    Spacer(Modifier.padding(start = MehTheme.spacing.spacing05))

    Icon(
      image = Icons.CaretLeft,
      size = IconSize.Small,
      tint = if (page > 1) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
      modifier = Modifier.clickable(enabled = page > 1) { onPageChange(page - 1) },
    )

    Spacer(Modifier.padding(start = MehTheme.spacing.spacing03))

    Icon(
      image = Icons.CaretRight,
      size = IconSize.Small,
      tint = if (page < totalPages) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
      modifier = Modifier.clickable(enabled = page < totalPages) { onPageChange(page + 1) },
    )
  }
}
