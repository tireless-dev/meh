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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

/**
 * Allowed button styles for a Carbon v11 [MenuButton]: Primary, Tertiary, and Ghost.
 */
enum class MenuButtonKind {
  Primary,
  Tertiary,
  Ghost,
}

private fun MenuButtonKind.toButtonKind(): ButtonKind = when (this) {
  MenuButtonKind.Primary -> ButtonKind.Primary
  MenuButtonKind.Tertiary -> ButtonKind.Tertiary
  MenuButtonKind.Ghost -> ButtonKind.Ghost
}

private fun ControlSize.toMenuButtonSize(): ControlSize = when (this) {
  ControlSize.XSmall, ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Large
}

/**
 * Carbon Design System v11 Menu button: displays a button with a trailing chevron that opens a
 * [Menu] of equally important actions.
 */
@Composable
fun MenuButton(
  text: String,
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  kind: MenuButtonKind = MenuButtonKind.Primary,
  size: ControlSize = ControlSize.Large,
  menuAlignment: PopoverAlign = PopoverAlign.BottomStart,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable MenuScope.() -> Unit,
) {
  val effectiveSize = size.toMenuButtonSize()

  Box(modifier = modifier) {
    Button(
      text = text,
      enabled = enabled,
      kind = kind.toButtonKind(),
      size = effectiveSize,
      icon = Icons.ChevronDown,
      interactionSource = interactionSource,
      onClick = { onExpandedChange(!expanded) },
    )
    Menu(
      expanded = expanded,
      onDismissRequest = { onExpandedChange(false) },
      size = effectiveSize,
      align = menuAlignment,
      content = content,
    )
  }
}

/**
 * Carbon Design System v11 Combo button: pairs a primary action button on the left with a
 * separated chevron trigger on the right that opens a [Menu] of secondary actions.
 */
@Composable
fun ComboButton(
  text: String,
  onClick: () -> Unit,
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
  menuAlignment: PopoverAlign = PopoverAlign.BottomEnd,
  primaryInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  triggerInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable MenuScope.() -> Unit,
) {
  val effectiveSize = size.toMenuButtonSize()
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  val primaryHovered by primaryInteractionSource.collectIsHoveredAsState()
  val primaryPressed by primaryInteractionSource.collectIsPressedAsState()
  val primaryFocused by primaryInteractionSource.collectIsFocusedAsState()

  val triggerHovered by triggerInteractionSource.collectIsHoveredAsState()
  val triggerPressed by triggerInteractionSource.collectIsPressedAsState()
  val triggerFocused by triggerInteractionSource.collectIsFocusedAsState()

  val primaryBg =
    when {
      !enabled -> colors.buttonDisabled
      primaryPressed -> colors.buttonPrimaryActive
      primaryHovered -> colors.buttonPrimaryHover
      else -> colors.buttonPrimary
    }
  val triggerBg =
    when {
      !enabled -> colors.buttonDisabled
      triggerPressed -> colors.buttonPrimaryActive
      triggerHovered -> colors.buttonPrimaryHover
      else -> colors.buttonPrimary
    }
  val labelColor = if (enabled) colors.textOnColor else colors.textOnColorDisabled
  val iconColor = if (enabled) colors.iconOnColor else colors.iconOnColorDisabled
  val separatorColor = if (enabled) colors.background else colors.borderDisabled

  Box(modifier = modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
      // Primary action segment
      Box(
        modifier = Modifier
          .defaultMinSize(minHeight = effectiveSize.dp)
          .height(effectiveSize.dp)
          .background(primaryBg)
          .drawBehind {
            if (primaryFocused && enabled) {
              drawComboFocusBorder(colors.focus, colors.focusInset)
            }
          }
          .clickable(
            interactionSource = primaryInteractionSource,
            indication = null,
            enabled = enabled,
            role = Role.Button,
            onClick = onClick,
          )
          .padding(horizontal = spacing.spacing05),
        contentAlignment = Alignment.CenterStart,
      ) {
        BasicText(
          text = text,
          style = MehTheme.typography.bodyCompact01.copy(color = labelColor),
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
        )
      }

      // 1px vertical separator between primary action and menu trigger
      Spacer(
        modifier = Modifier
          .width(1.dp)
          .height(effectiveSize.dp)
          .background(separatorColor),
      )

      // Menu trigger segment
      Box(
        modifier = Modifier
          .size(effectiveSize.dp)
          .background(triggerBg)
          .drawBehind {
            if (triggerFocused && enabled) {
              drawComboFocusBorder(colors.focus, colors.focusInset)
            }
          }
          .clickable(
            interactionSource = triggerInteractionSource,
            indication = null,
            enabled = enabled,
            role = Role.Button,
            onClick = { onExpandedChange(!expanded) },
          ),
        contentAlignment = Alignment.Center,
      ) {
        Icon(
          image = Icons.ChevronDown,
          size = IconSize.Small,
          tint = iconColor,
          modifier = Modifier.rotate(if (expanded) 180f else 0f),
        )
      }
    }

    Menu(
      expanded = expanded,
      onDismissRequest = { onExpandedChange(false) },
      size = effectiveSize,
      align = menuAlignment,
      content = content,
    )
  }
}

/**
 * Visual trigger button for a Carbon v11 [OverflowMenu].
 */
@Composable
fun OverflowMenuTrigger(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean = false,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Small,
  icon: ImageVector = Icons.OverflowMenuVertical,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val effectiveSize = size.toMenuButtonSize()
  val colors = MehTheme.colors
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val containerColor =
    when {
      !enabled -> Color.Transparent
      expanded -> colors.layer01
      pressed -> colors.backgroundActive
      hovered -> colors.backgroundHover
      else -> Color.Transparent
    }
  val iconTint = if (enabled) colors.iconPrimary else colors.iconDisabled

  Box(
    modifier = modifier
      .size(effectiveSize.dp)
      .background(containerColor)
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
      tint = iconTint,
    )
  }
}

/**
 * Carbon Design System v11 Overflow menu button: renders a ghost icon button when closed,
 * transitioning to the `layer01` surface when expanded to connect flush with its [Menu].
 */
@Composable
fun OverflowMenu(
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Small,
  icon: ImageVector = Icons.OverflowMenuVertical,
  menuAlignment: PopoverAlign = PopoverAlign.BottomStart,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  content: @Composable MenuScope.() -> Unit,
) {
  val effectiveSize = size.toMenuButtonSize()

  Box(modifier = modifier) {
    OverflowMenuTrigger(
      onClick = { onExpandedChange(!expanded) },
      expanded = expanded,
      enabled = enabled,
      size = effectiveSize,
      icon = icon,
      interactionSource = interactionSource,
    )

    Menu(
      expanded = expanded,
      onDismissRequest = { onExpandedChange(false) },
      size = effectiveSize,
      align = menuAlignment,
      content = content,
    )
  }
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawComboFocusBorder(
  focusColor: Color,
  focusInsetColor: Color,
) {
  val outerStroke = 2.dp.toPx()
  val outerHalf = outerStroke / 2f
  drawRect(
    color = focusColor,
    topLeft = Offset(outerHalf, outerHalf),
    size = Size(size.width - outerStroke, size.height - outerStroke),
    style = Stroke(width = outerStroke),
  )
  val insetStroke = 1.dp.toPx()
  val insetOffset = outerStroke + insetStroke / 2f
  drawRect(
    color = focusInsetColor,
    topLeft = Offset(insetOffset, insetOffset),
    size = Size(size.width - insetOffset * 2f, size.height - insetOffset * 2f),
    style = Stroke(width = insetStroke),
  )
}
