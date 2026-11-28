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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

data class TreeNode(
  val id: String,
  val label: String,
  val icon: ImageVector? = null,
  val enabled: Boolean = true,
  val initiallyExpanded: Boolean = false,
  val children: List<TreeNode> = emptyList(),
)

private fun ControlSize.toTreeViewSize(): ControlSize = when (this) {
  ControlSize.XSmall, ControlSize.Small -> this
  else -> ControlSize.Small
}

/**
 * Carbon Design System v11 Tree View with collapsible nested nodes, optional leading icons,
 * selection state (`$layer-selected` + `$border-interactive` left bar), and `xs`/`sm` sizes.
 */
@Composable
fun TreeView(
  nodes: List<TreeNode>,
  modifier: Modifier = Modifier,
  label: String? = null,
  selectedId: String? = null,
  onSelect: ((TreeNode) -> Unit)? = null,
  size: ControlSize = ControlSize.Small,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val effectiveSize = size.toTreeViewSize()

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = MehTheme.typography.label01.copy(color = colors.textSecondary),
        modifier = Modifier.padding(
          horizontal = spacing.spacing05,
          vertical = spacing.spacing03,
        ),
      )
    }

    nodes.forEach { node ->
      TreeViewNodeRow(
        node = node,
        level = 0,
        selectedId = selectedId,
        onSelect = onSelect,
        size = effectiveSize,
      )
    }
  }
}

@Composable
private fun TreeViewNodeRow(
  node: TreeNode,
  level: Int,
  selectedId: String?,
  onSelect: ((TreeNode) -> Unit)?,
  size: ControlSize,
) {
  var expanded by remember(node.id, node.initiallyExpanded) { mutableStateOf(node.initiallyExpanded) }
  val hasChildren = node.children.isNotEmpty()
  val isSelected = node.id == selectedId
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val interactionSource = remember(node.id) { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      !node.enabled -> Color.Transparent
      isSelected -> colors.layerSelected01
      hovered -> colors.layerHover01
      else -> Color.Transparent
    }
  val textColor =
    when {
      !node.enabled -> colors.textDisabled
      isSelected -> colors.textPrimary
      else -> colors.textSecondary
    }
  val iconTint =
    when {
      !node.enabled -> colors.iconDisabled
      isSelected -> colors.iconPrimary
      else -> colors.iconSecondary
    }

  Column(modifier = Modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(size.dp)
        .background(backgroundColor)
        .drawBehind {
          if (isSelected && node.enabled) {
            drawRect(
              color = colors.borderInteractive,
              topLeft = Offset.Zero,
              size = Size(2.dp.toPx(), this.size.height),
            )
          }
          if (focused && node.enabled) {
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
        .semantics { selected = isSelected }
        .clickable(
          interactionSource = interactionSource,
          indication = null,
          enabled = node.enabled,
          role = Role.Button,
          onClick = {
            if (hasChildren) expanded = !expanded
            onSelect?.invoke(node)
          },
        )
        .padding(
          start = spacing.spacing05 + (level * 16).dp,
          end = spacing.spacing05,
        ),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      if (hasChildren) {
        Box(
          modifier = Modifier.size(16.dp),
          contentAlignment = Alignment.Center,
        ) {
          Icon(
            image = Icons.CaretDown,
            size = IconSize.XSmall,
            tint = iconTint,
            modifier = Modifier.rotate(if (expanded) 0f else -90f),
          )
        }
      } else {
        Spacer(modifier = Modifier.size(16.dp))
      }

      if (node.icon != null) {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        Icon(
          image = node.icon,
          size = IconSize.Small,
          tint = iconTint,
        )
      }

      Spacer(modifier = Modifier.width(spacing.spacing03))
      BasicText(
        text = node.label,
        style = (if (isSelected) typography.headingCompact01 else typography.bodyCompact01)
          .copy(color = textColor),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.weight(1f),
      )
    }

    if (hasChildren && expanded) {
      node.children.forEach { child ->
        TreeViewNodeRow(
          node = child,
          level = level + 1,
          selectedId = selectedId,
          onSelect = onSelect,
          size = size,
        )
      }
    }
  }
}
