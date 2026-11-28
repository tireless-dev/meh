// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

object TileDefaults {
  val MinWidth: Dp = 128.dp
  val MinHeight: Dp = 64.dp
}

private fun DrawScope.drawTileBorder(
  borderColor: Color?,
  borderWidth: Dp,
) {
  if (borderColor == null) return
  val strokeWidth = borderWidth.toPx()
  val half = strokeWidth / 2f
  drawRect(
    color = borderColor,
    topLeft = Offset(half, half),
    size = Size(size.width - strokeWidth, size.height - strokeWidth),
    style = Stroke(width = strokeWidth),
  )
}

/**
 * Carbon Design System v11 Base Tile: non-interactive container surface (`$layer`, `16.dp` padding,
 * `128.dp × 64.dp` minimum size).
 */
@Composable
fun Tile(
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minWidth = TileDefaults.MinWidth, minHeight = TileDefaults.MinHeight)
      .background(MehTheme.colors.layer01)
      .padding(MehTheme.spacing.spacing05),
  ) {
    content()
  }
}

/**
 * Carbon Design System v11 Clickable Tile: entire tile acts as a navigation/action target with
 * hover, active, focus, disabled states and an optional trailing icon at the bottom-end corner.
 */
@Composable
fun ClickableTile(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  icon: ImageVector? = Icons.ArrowRight,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable () -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      !enabled -> colors.layer01
      pressed -> colors.layerActive01
      hovered -> colors.layerHover01
      else -> colors.layer01
    }
  val iconTint = if (enabled) colors.iconPrimary else colors.iconDisabled

  Box(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minWidth = TileDefaults.MinWidth, minHeight = TileDefaults.MinHeight)
      .background(backgroundColor)
      .drawBehind {
        if (focused && enabled) {
          drawTileBorder(colors.focus, 2.dp)
        }
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .padding(spacing.spacing05),
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .padding(end = if (icon != null) spacing.spacing06 else 0.dp),
    ) {
      content()
    }

    if (icon != null) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = iconTint,
        modifier = Modifier.align(Alignment.BottomEnd),
      )
    }
  }
}

/**
 * Carbon Design System v11 Selectable Tile (multi-select checkbox behavior).
 */
@Composable
fun SelectableTile(
  selected: Boolean,
  onSelectedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable () -> Unit,
) {
  SelectableTileImpl(
    selected = selected,
    onClick = { onSelectedChange(!selected) },
    role = Role.Checkbox,
    modifier = modifier,
    enabled = enabled,
    interactionSource = interactionSource,
    content = content,
  )
}

/**
 * Carbon Design System v11 Radio Tile (single-select radio behavior).
 */
@Composable
fun RadioTile(
  selected: Boolean,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable () -> Unit,
) {
  SelectableTileImpl(
    selected = selected,
    onClick = onClick,
    role = Role.RadioButton,
    modifier = modifier,
    enabled = enabled,
    interactionSource = interactionSource,
    content = content,
  )
}

@Composable
private fun SelectableTileImpl(
  selected: Boolean,
  onClick: () -> Unit,
  role: Role,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable () -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      !enabled -> colors.layer01
      pressed -> colors.layerActive01
      hovered -> colors.layerHover01
      else -> colors.layer01
    }
  val borderColor =
    when {
      focused && enabled -> colors.focus
      selected && enabled -> colors.borderInverse
      selected && !enabled -> colors.borderDisabled
      else -> null
    }
  val borderWidth = if (focused && enabled) 2.dp else 1.dp

  val indicatorIcon =
    when {
      selected -> Icons.CheckmarkFilled
      hovered && enabled -> Icons.CheckmarkOutline
      else -> Icons.CheckmarkOutline
    }
  val indicatorTint =
    when {
      !enabled -> colors.iconDisabled
      selected -> colors.iconPrimary
      hovered -> colors.iconPrimary
      else -> colors.iconSecondary
    }

  Box(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minWidth = TileDefaults.MinWidth, minHeight = TileDefaults.MinHeight)
      .background(backgroundColor)
      .drawBehind { drawTileBorder(borderColor, borderWidth) }
      .semantics { this.selected = selected }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = role,
        onClick = onClick,
      )
      .padding(spacing.spacing05),
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .padding(end = spacing.spacing06),
    ) {
      content()
    }

    Icon(
      image = indicatorIcon,
      size = IconSize.Small,
      tint = indicatorTint,
      modifier = Modifier.align(Alignment.TopEnd),
    )
  }
}

/**
 * Carbon Design System v11 Expandable Tile: reveals [belowTheFoldContent] beneath
 * [aboveTheFoldContent] when expanded via the disclosure chevron.
 */
@Composable
fun ExpandableTile(
  aboveTheFoldContent: @Composable () -> Unit,
  belowTheFoldContent: @Composable () -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  initiallyExpanded: Boolean = false,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var internalExpanded by remember { mutableStateOf(initiallyExpanded) }
  val isExpanded = expanded ?: internalExpanded
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      !enabled -> colors.layer01
      pressed -> colors.layerActive01
      hovered -> colors.layerHover01
      else -> colors.layer01
    }

  Box(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minWidth = TileDefaults.MinWidth, minHeight = TileDefaults.MinHeight)
      .background(backgroundColor)
      .drawBehind {
        if (focused && enabled) {
          drawTileBorder(colors.focus, 2.dp)
        } else {
          val strokeWidth = 1.dp.toPx()
          val y = size.height - strokeWidth / 2f
          drawLine(
            color = colors.borderTile01,
            start = Offset(0f, y),
            end = Offset(size.width, y),
            strokeWidth = strokeWidth,
          )
        }
      }
      .semantics {
        stateDescription = if (isExpanded) "Expanded" else "Collapsed"
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = {
          val next = !isExpanded
          internalExpanded = next
          onExpandedChange?.invoke(next)
        },
      )
      .padding(spacing.spacing05),
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(end = spacing.spacing06),
    ) {
      aboveTheFoldContent()
      if (isExpanded) {
        Spacer(modifier = Modifier.height(spacing.spacing05))
        belowTheFoldContent()
      }
    }

    Icon(
      image = Icons.ChevronDown,
      size = IconSize.Small,
      tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
      modifier = Modifier
        .align(Alignment.BottomEnd)
        .rotate(if (isExpanded) 180f else 0f),
    )
  }
}
