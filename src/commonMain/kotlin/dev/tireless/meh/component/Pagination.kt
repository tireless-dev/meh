// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toPaginationSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Large
}

/**
 * Carbon Design System v11 Pagination bar with items-per-page selector, item range summary,
 * page indicator, and previous/next controls (`sm` 32dp, `md` 40dp, `lg` 48dp).
 */
@Composable
fun Pagination(
  page: Int,
  totalItems: Int,
  pageSize: Int,
  onPageChange: (Int) -> Unit,
  onPageSizeChange: (Int) -> Unit,
  modifier: Modifier = Modifier,
  pageSizes: List<Int> = listOf(10, 20, 30, 40, 50),
  size: ControlSize = ControlSize.Large,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toPaginationSize()

  val safePageSize = pageSize.coerceAtLeast(1)
  val totalPages = ((totalItems + safePageSize - 1) / safePageSize).coerceAtLeast(1)
  val currentPage = page.coerceIn(1, totalPages)
  val startItem = if (totalItems == 0) 0 else (currentPage - 1) * safePageSize + 1
  val endItem = if (totalItems == 0) 0 else (startItem + safePageSize - 1).coerceAtMost(totalItems)

  var pageSizeMenuOpen by remember { mutableStateOf(false) }

  val textColor = if (enabled) colors.textPrimary else colors.textDisabled
  val secondaryTextColor = if (enabled) colors.textSecondary else colors.textDisabled

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(effectiveSize.dp)
      .background(colors.layer01)
      .drawBehind {
        val strokeWidth = 1.dp.toPx()
        drawLine(
          color = colors.borderSubtle01,
          start = Offset(0f, strokeWidth / 2f),
          end = Offset(this.size.width, strokeWidth / 2f),
          strokeWidth = strokeWidth,
        )
      },
    verticalAlignment = Alignment.CenterVertically,
  ) {
    // Items per page
    Row(
      modifier = Modifier
        .fillMaxHeight()
        .padding(start = spacing.spacing05, end = spacing.spacing03),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      BasicText(
        text = "Items per page:",
        style = typography.bodyCompact01.copy(color = secondaryTextColor),
      )
      Spacer(modifier = Modifier.width(spacing.spacing02))
      Box {
        Row(
          modifier = Modifier
            .fillMaxHeight()
            .clickable(enabled = enabled, role = Role.DropdownList) {
              pageSizeMenuOpen = !pageSizeMenuOpen
            }
            .padding(horizontal = spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          BasicText(
            text = safePageSize.toString(),
            style = typography.bodyCompact01.copy(color = textColor),
          )
          Spacer(modifier = Modifier.width(spacing.spacing02))
          Icon(
            image = Icons.ChevronDown,
            size = IconSize.Small,
            tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
          )
        }
        Menu(
          expanded = pageSizeMenuOpen,
          onDismissRequest = { pageSizeMenuOpen = false },
          size = ControlSize.Small,
        ) {
          pageSizes.forEach { candidate ->
            MenuSelectableItem(
              text = candidate.toString(),
              selected = candidate == safePageSize,
              onSelectedChange = {
                onPageSizeChange(candidate)
                pageSizeMenuOpen = false
              },
            )
          }
        }
      }
    }

    PaginationVerticalDivider()

    // Item range
    BasicText(
      text = "$startItem–$endItem of $totalItems items",
      style = typography.bodyCompact01.copy(color = secondaryTextColor),
      modifier = Modifier.padding(horizontal = spacing.spacing05),
    )

    Spacer(modifier = Modifier.weight(1f))

    PaginationVerticalDivider()

    // Page summary
    BasicText(
      text = "$currentPage of $totalPages pages",
      style = typography.bodyCompact01.copy(color = secondaryTextColor),
      modifier = Modifier.padding(horizontal = spacing.spacing05),
    )

    PaginationVerticalDivider()

    PaginationNavIconButton(
      icon = Icons.CaretLeft,
      contentDescription = "Previous page",
      enabled = enabled && currentPage > 1,
      size = effectiveSize,
      onClick = { onPageChange(currentPage - 1) },
    )

    PaginationVerticalDivider()

    PaginationNavIconButton(
      icon = Icons.CaretRight,
      contentDescription = "Next page",
      enabled = enabled && currentPage < totalPages,
      size = effectiveSize,
      onClick = { onPageChange(currentPage + 1) },
    )
  }
}

/**
 * Carbon Design System v11 Pagination Nav for navigating directly across numbered pages.
 */
@Composable
fun PaginationNav(
  page: Int,
  totalPages: Int,
  onPageChange: (Int) -> Unit,
  modifier: Modifier = Modifier,
  itemsShown: Int = 5,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val typography = MehTheme.typography
  val safeTotal = totalPages.coerceAtLeast(1)
  val currentPage = page.coerceIn(1, safeTotal)

  val visiblePages =
    remember(currentPage, safeTotal, itemsShown) {
      buildVisiblePages(currentPage, safeTotal, itemsShown.coerceAtLeast(3))
    }

  Row(
    modifier = modifier.height(40.dp),
    horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing01),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    PaginationNavIconButton(
      icon = Icons.CaretLeft,
      contentDescription = "Previous page",
      enabled = enabled && currentPage > 1,
      size = ControlSize.Medium,
      onClick = { onPageChange(currentPage - 1) },
    )

    visiblePages.forEach { entry ->
      if (entry == null) {
        Box(
          modifier = Modifier.size(40.dp),
          contentAlignment = Alignment.Center,
        ) {
          BasicText(
            text = "…",
            style = typography.bodyCompact01.copy(
              color = if (enabled) colors.textSecondary else colors.textDisabled,
            ),
          )
        }
      } else {
        val isSelected = entry == currentPage
        val interactionSource = remember(entry) { MutableInteractionSource() }
        val hovered by interactionSource.collectIsHoveredAsState()
        val focused by interactionSource.collectIsFocusedAsState()

        Box(
          modifier = Modifier
            .size(40.dp)
            .background(if (hovered && enabled) colors.backgroundHover else Color.Transparent)
            .drawBehind {
              if (isSelected) {
                val indicatorHeight = 2.dp.toPx()
                drawRect(
                  color = if (enabled) colors.borderInteractive else colors.borderDisabled,
                  topLeft = Offset(0f, size.height - indicatorHeight),
                  size = Size(size.width, indicatorHeight),
                )
              }
              if (focused && enabled) {
                val strokeWidth = 2.dp.toPx()
                val half = strokeWidth / 2f
                drawRect(
                  color = colors.focus,
                  topLeft = Offset(half, half),
                  size = Size(size.width - strokeWidth, size.height - strokeWidth),
                  style = Stroke(width = strokeWidth),
                )
              }
            }
            .semantics { selected = isSelected }
            .clickable(
              interactionSource = interactionSource,
              indication = null,
              enabled = enabled,
              role = Role.Button,
              onClick = { onPageChange(entry) },
            ),
          contentAlignment = Alignment.Center,
        ) {
          BasicText(
            text = entry.toString(),
            style = (if (isSelected) typography.headingCompact01 else typography.bodyCompact01).copy(
              color =
              when {
                !enabled -> colors.textDisabled
                isSelected -> colors.textPrimary
                else -> colors.textSecondary
              },
            ),
          )
        }
      }
    }

    PaginationNavIconButton(
      icon = Icons.CaretRight,
      contentDescription = "Next page",
      enabled = enabled && currentPage < safeTotal,
      size = ControlSize.Medium,
      onClick = { onPageChange(currentPage + 1) },
    )
  }
}

private fun buildVisiblePages(
  current: Int,
  total: Int,
  maxSlots: Int,
): List<Int?> {
  if (total <= maxSlots) return (1..total).toList()
  val result = mutableListOf<Int?>()
  result += 1
  val windowSize = (maxSlots - 2).coerceAtLeast(1)
  var start = (current - windowSize / 2).coerceAtLeast(2)
  var end = (start + windowSize - 1).coerceAtMost(total - 1)
  start = (end - windowSize + 1).coerceAtLeast(2)

  if (start > 2) result += null
  for (p in start..end) result += p
  if (end < total - 1) result += null
  result += total
  return result
}

@Composable
private fun PaginationVerticalDivider() {
  Spacer(
    modifier = Modifier
      .width(1.dp)
      .fillMaxHeight()
      .background(MehTheme.colors.borderSubtle01),
  )
}

@Composable
private fun PaginationNavIconButton(
  icon: ImageVector,
  contentDescription: String,
  enabled: Boolean,
  size: ControlSize,
  onClick: () -> Unit,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  Box(
    modifier = Modifier
      .size(size.dp)
      .background(if (hovered && enabled) colors.backgroundHover else Color.Transparent)
      .drawBehind {
        if (focused && enabled) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .semantics { this.contentDescription = contentDescription }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = icon,
      size = IconSize.Small,
      tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
    )
  }
}
