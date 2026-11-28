// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

enum class DataTableSortDirection {
  None,
  Ascending,
  Descending,
}

private fun ControlSize.toDataTableRowSize(): ControlSize = when (this) {
  ControlSize.XSmall,
  ControlSize.Small,
  ControlSize.Medium,
  ControlSize.Large,
  ControlSize.XLarge,
  -> this

  else -> ControlSize.Large
}

/**
 * Carbon Design System v11 Data Table supporting title/description header, toolbar & batch action
 * bar, sortable columns, row selection, zebra striping, and `xs`/`sm`/`md`/`lg`/`xl` row densities.
 */
@Composable
fun DataTable(
  headers: List<String>,
  rows: List<List<String>>,
  modifier: Modifier = Modifier,
  title: String? = null,
  description: String? = null,
  size: ControlSize = ControlSize.Large,
  useZebraStyles: Boolean = false,
  sortColumnIndex: Int? = null,
  sortDirection: DataTableSortDirection = DataTableSortDirection.None,
  onSort: ((Int) -> Unit)? = null,
  selectedRows: Set<Int> = emptySet(),
  onRowSelectionChange: ((Set<Int>) -> Unit)? = null,
  batchActions: (@Composable RowScope.() -> Unit)? = null,
  toolbar: (@Composable RowScope.() -> Unit)? = null,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val rowSize = size.toDataTableRowSize()
  val selectable = onRowSelectionChange != null

  Column(modifier = modifier.fillMaxWidth()) {
    // Optional title & description header
    if (title != null || description != null) {
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .background(colors.layer01)
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing05),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing01),
      ) {
        if (title != null) {
          BasicText(
            text = title,
            style = typography.heading03.copy(color = colors.textPrimary),
          )
        }
        if (description != null) {
          BasicText(
            text = description,
            style = typography.bodyCompact01.copy(color = colors.textSecondary),
          )
        }
      }
    }

    // Batch action bar or toolbar
    if (selectable && selectedRows.isNotEmpty()) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(48.dp)
          .background(colors.backgroundBrand)
          .padding(horizontal = spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        BasicText(
          text = "${selectedRows.size} item${if (selectedRows.size == 1) "" else "s"} selected",
          style = typography.bodyCompact01.copy(color = colors.textOnColor),
          modifier = Modifier.weight(1f),
        )
        if (batchActions != null) {
          Row(
            horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
            verticalAlignment = Alignment.CenterVertically,
            content = batchActions,
          )
          Spacer(modifier = Modifier.width(spacing.spacing04))
        }
        Box(
          modifier = Modifier
            .clickable(role = Role.Button) { onRowSelectionChange(emptySet()) }
            .padding(horizontal = spacing.spacing04, vertical = spacing.spacing03),
        ) {
          BasicText(
            text = "Cancel",
            style = typography.bodyCompact01.copy(color = colors.textOnColor),
          )
        }
      }
    } else if (toolbar != null) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(48.dp)
          .background(colors.layer01),
        verticalAlignment = Alignment.CenterVertically,
        content = toolbar,
      )
    }

    // Column headers
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(rowSize.dp)
        .background(colors.layerAccent01),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      if (selectable) {
        val allSelected = rows.isNotEmpty() && selectedRows.size == rows.size
        Box(
          modifier = Modifier.width(48.dp),
          contentAlignment = Alignment.Center,
        ) {
          Checkbox(
            checked = allSelected,
            label = "Select all rows",
            indeterminate = selectedRows.isNotEmpty() && !allSelected,
            hideLabel = true,
            onCheckedChange = { checked ->
              onRowSelectionChange(if (checked) rows.indices.toSet() else emptySet())
            },
          )
        }
      }

      headers.forEachIndexed { colIndex, header ->
        val isSorted = sortColumnIndex == colIndex && sortDirection != DataTableSortDirection.None
        Row(
          modifier = Modifier
            .weight(1f)
            .height(rowSize.dp)
            .then(
              if (onSort != null) {
                Modifier.clickable(role = Role.Button) { onSort(colIndex) }
              } else {
                Modifier
              },
            )
            .padding(horizontal = spacing.spacing05),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          BasicText(
            text = header,
            style = typography.headingCompact01.copy(color = colors.textPrimary),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f, fill = false),
          )
          if (onSort != null) {
            Spacer(modifier = Modifier.width(spacing.spacing03))
            val sortIcon =
              when {
                isSorted && sortDirection == DataTableSortDirection.Ascending -> Icons.ArrowUp
                isSorted && sortDirection == DataTableSortDirection.Descending -> Icons.ArrowDown
                else -> Icons.ArrowsVertical
              }
            Icon(
              image = sortIcon,
              size = IconSize.Small,
              tint = if (isSorted) colors.iconPrimary else colors.iconSecondary,
            )
          }
        }
      }
    }

    // Data rows
    rows.forEachIndexed { rowIndex, row ->
      val isSelected = rowIndex in selectedRows
      val interactionSource = remember(rowIndex) { MutableInteractionSource() }
      val hovered by interactionSource.collectIsHoveredAsState()

      val rowBg =
        when {
          isSelected -> colors.layerSelected01
          hovered -> colors.layerHover01
          useZebraStyles && rowIndex % 2 == 1 -> colors.layer01
          else -> colors.layer01.takeIf { !useZebraStyles } ?: colors.background
        }

      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(1.dp)
          .background(colors.borderSubtle01),
      )

      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(rowSize.dp)
          .background(rowBg)
          .then(
            if (selectable) {
              Modifier.clickable(
                interactionSource = interactionSource,
                indication = null,
                role = Role.Checkbox,
              ) {
                val next =
                  if (isSelected) selectedRows - rowIndex else selectedRows + rowIndex
                onRowSelectionChange(next)
              }
            } else {
              Modifier
            },
          ),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        if (selectable) {
          Box(
            modifier = Modifier.width(48.dp),
            contentAlignment = Alignment.Center,
          ) {
            Checkbox(
              checked = isSelected,
              label = "Select row ${rowIndex + 1}",
              hideLabel = true,
              onCheckedChange = { checked ->
                val next = if (checked) selectedRows + rowIndex else selectedRows - rowIndex
                onRowSelectionChange(next)
              },
            )
          }
        }

        row.forEach { cell ->
          Box(
            modifier = Modifier
              .weight(1f)
              .padding(horizontal = spacing.spacing05),
            contentAlignment = Alignment.CenterStart,
          ) {
            BasicText(
              text = cell,
              style = typography.bodyCompact01.copy(color = colors.textPrimary),
              maxLines = 1,
              overflow = TextOverflow.Ellipsis,
            )
          }
        }
      }
    }
  }
}
