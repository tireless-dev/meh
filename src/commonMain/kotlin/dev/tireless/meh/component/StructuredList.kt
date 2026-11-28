// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

/**
 * Carbon Design System v11 Structured List supporting default read-only tables, condensed rows,
 * flush layout, and single-row selection with checkmark indicators.
 */
@Composable
fun StructuredList(
  headers: List<String>,
  rows: List<List<String>>,
  modifier: Modifier = Modifier,
  selectedIndex: Int? = null,
  onRowSelect: ((Int) -> Unit)? = null,
  isCondensed: Boolean = false,
  isFlush: Boolean = false,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val selectable = onRowSelect != null
  val cellHorizontalPadding = if (isFlush) 0.dp else spacing.spacing05
  val cellVerticalPadding = if (isCondensed) spacing.spacing03 else spacing.spacing05

  Column(modifier = modifier.fillMaxWidth()) {
    // Header row
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = spacing.spacing03),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      headers.forEachIndexed { colIndex, header ->
        Box(
          modifier = Modifier
            .weight(1f)
            .padding(
              start = if (colIndex == 0) cellHorizontalPadding else spacing.spacing05,
              end = spacing.spacing05,
            ),
          contentAlignment = Alignment.CenterStart,
        ) {
          BasicText(
            text = header,
            style = typography.headingCompact01.copy(color = colors.textPrimary),
          )
        }
      }
      if (selectable) {
        Spacer(modifier = Modifier.width(48.dp))
      }
    }

    // Header bottom rule
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(colors.borderSubtle01),
    )

    // Body rows
    rows.forEachIndexed { rowIndex, row ->
      val isSelected = selectable && rowIndex == selectedIndex
      val interactionSource = remember(rowIndex) { MutableInteractionSource() }
      val hovered by interactionSource.collectIsHoveredAsState()
      val focused by interactionSource.collectIsFocusedAsState()

      val rowBg =
        when {
          isSelected -> colors.layerSelected01
          selectable && hovered -> colors.layerHover01
          else -> Color.Transparent
        }

      Row(
        modifier = Modifier
          .fillMaxWidth()
          .defaultMinSize(minHeight = if (isCondensed) 40.dp else 48.dp)
          .background(rowBg)
          .drawBehind {
            if (focused && selectable) {
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
          .then(
            if (selectable) {
              Modifier
                .semantics { selected = isSelected }
                .clickable(
                  interactionSource = interactionSource,
                  indication = null,
                  role = Role.RadioButton,
                  onClick = { onRowSelect(rowIndex) },
                )
            } else {
              Modifier
            },
          )
          .padding(vertical = cellVerticalPadding),
        verticalAlignment = Alignment.Top,
      ) {
        row.forEachIndexed { colIndex, cell ->
          Box(
            modifier = Modifier
              .weight(1f)
              .padding(
                start = if (colIndex == 0) cellHorizontalPadding else spacing.spacing05,
                end = spacing.spacing05,
              ),
            contentAlignment = Alignment.CenterStart,
          ) {
            BasicText(
              text = cell,
              style = typography.body01.copy(color = colors.textPrimary),
            )
          }
        }

        if (selectable) {
          Box(
            modifier = Modifier.width(48.dp),
            contentAlignment = Alignment.Center,
          ) {
            if (isSelected) {
              Icon(
                image = Icons.CheckmarkFilled,
                size = IconSize.Small,
                tint = colors.iconPrimary,
              )
            } else if (hovered) {
              Icon(
                image = Icons.CheckmarkOutline,
                size = IconSize.Small,
                tint = colors.iconSecondary,
              )
            }
          }
        }
      }

      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(1.dp)
          .background(colors.borderSubtle01),
      )
    }
  }
}
