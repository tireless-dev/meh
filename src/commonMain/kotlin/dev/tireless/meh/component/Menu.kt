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
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

enum class MenuItemKind {
  Default,
  Danger,
}

object MenuDefaults {
  val MinWidth: Dp = 160.dp
  val MaxWidth: Dp = 288.dp
  val VerticalPadding: Dp = 4.dp
  val DefaultSize: ControlSize = ControlSize.Small
}

class MenuScope internal constructor(
  val size: ControlSize,
  private val columnScope: ColumnScope,
) : ColumnScope by columnScope

private fun ControlSize.toMenuSize(): ControlSize = when (this) {
  ControlSize.XSmall, ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> MenuDefaults.DefaultSize
}

@Immutable
private data class ResolvedMenuItemColors(
  val background: Color,
  val text: Color,
  val shortcut: Color,
  val icon: Color,
  val focusOutline: Color?,
)

private fun resolveMenuItemColors(
  colors: Colors,
  kind: MenuItemKind,
  enabled: Boolean,
  hovered: Boolean,
  pressed: Boolean,
  focused: Boolean,
): ResolvedMenuItemColors {
  if (!enabled) {
    return ResolvedMenuItemColors(
      background = Color.Transparent,
      text = colors.textDisabled,
      shortcut = colors.textDisabled,
      icon = colors.iconDisabled,
      focusOutline = null,
    )
  }

  return when (kind) {
    MenuItemKind.Default -> ResolvedMenuItemColors(
      background =
      when {
        pressed -> colors.layerActive01
        hovered -> colors.layerHover01
        else -> Color.Transparent
      },
      text = colors.textPrimary,
      shortcut = colors.textSecondary,
      icon = colors.iconPrimary,
      focusOutline = colors.focus.takeIf { focused },
    )

    MenuItemKind.Danger -> {
      val highlighted = hovered || pressed
      ResolvedMenuItemColors(
        background =
        when {
          pressed -> colors.buttonDangerActive
          hovered -> colors.buttonDangerHover
          else -> Color.Transparent
        },
        text = if (highlighted) colors.textOnColor else colors.textError,
        shortcut = if (highlighted) colors.textOnColor else colors.textSecondary,
        icon = if (highlighted) colors.iconOnColor else colors.supportError,
        focusOutline = colors.focus.takeIf { focused },
      )
    }
  }
}

/**
 * Styled Carbon v11 Menu surface container (`160.dp`–`288.dp` width, `layer01` background,
 * sharp corners, drop shadow, `4.dp` top/bottom padding).
 */
@Composable
fun MenuSurface(
  modifier: Modifier = Modifier,
  size: ControlSize = MenuDefaults.DefaultSize,
  content: @Composable MenuScope.() -> Unit,
) {
  val menuSize = size.toMenuSize()

  PopoverSurface(
    modifier = modifier.widthIn(min = MenuDefaults.MinWidth, max = MenuDefaults.MaxWidth),
    align = PopoverAlign.BottomStart,
    caret = false,
    dropShadow = true,
    highContrast = false,
    border = false,
    tabTip = true,
    contentPadding = PaddingValues(vertical = MenuDefaults.VerticalPadding),
    maxWidth = MenuDefaults.MaxWidth,
  ) {
    Column(
      modifier = Modifier
        .width(IntrinsicSize.Max)
        .widthIn(min = MenuDefaults.MinWidth, max = MenuDefaults.MaxWidth),
    ) {
      val scope = remember(menuSize, this) { MenuScope(menuSize, this) }
      scope.content()
    }
  }
}

/**
 * Carbon Design System v11 floating [Menu] backed by [Popover].
 */
@Composable
fun Menu(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  size: ControlSize = MenuDefaults.DefaultSize,
  align: PopoverAlign = PopoverAlign.BottomStart,
  autoAlign: Boolean = true,
  properties: PopupProperties = PopupProperties(focusable = true),
  content: @Composable MenuScope.() -> Unit,
) {
  val menuSize = size.toMenuSize()

  Popover(
    expanded = expanded,
    onDismissRequest = onDismissRequest,
    modifier = modifier.widthIn(min = MenuDefaults.MinWidth, max = MenuDefaults.MaxWidth),
    align = align,
    autoAlign = autoAlign,
    caret = false,
    dropShadow = true,
    highContrast = false,
    border = false,
    tabTip = true,
    contentPadding = PaddingValues(vertical = MenuDefaults.VerticalPadding),
    maxWidth = MenuDefaults.MaxWidth,
    properties = properties,
  ) {
    Column(
      modifier = Modifier
        .width(IntrinsicSize.Max)
        .widthIn(min = MenuDefaults.MinWidth, max = MenuDefaults.MaxWidth),
    ) {
      val scope = remember(menuSize, this) { MenuScope(menuSize, this) }
      scope.content()
    }
  }
}

/**
 * Carbon Design System v11 Menu action option inside a [MenuScope].
 */
@Composable
fun MenuScope.MenuItem(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  kind: MenuItemKind = MenuItemKind.Default,
  shortcut: String? = null,
  icon: ImageVector? = null,
  hasSubmenu: Boolean = false,
  reserveLeadingSlot: Boolean = false,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  MenuItem(
    text = text,
    onClick = onClick,
    modifier = modifier,
    enabled = enabled,
    kind = kind,
    shortcut = shortcut,
    icon = icon,
    hasSubmenu = hasSubmenu,
    reserveLeadingSlot = reserveLeadingSlot,
    size = size,
    interactionSource = interactionSource,
  )
}

/**
 * Carbon Design System v11 Menu action option.
 */
@Composable
fun MenuItem(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  kind: MenuItemKind = MenuItemKind.Default,
  shortcut: String? = null,
  icon: ImageVector? = null,
  hasSubmenu: Boolean = false,
  reserveLeadingSlot: Boolean = false,
  size: ControlSize = MenuDefaults.DefaultSize,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val itemColors =
    resolveMenuItemColors(
      colors = colors,
      kind = kind,
      enabled = enabled,
      hovered = hovered,
      pressed = pressed,
      focused = focused,
    )

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(size.toMenuSize().dp)
      .background(itemColors.background)
      .drawBehind {
        itemColors.focusOutline?.let { focusColor ->
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = focusColor,
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
      )
      .padding(horizontal = spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (icon != null) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = itemColors.icon,
      )
      Spacer(modifier = Modifier.width(spacing.spacing03))
    } else if (reserveLeadingSlot) {
      Spacer(modifier = Modifier.size(IconSize.Small.dp))
      Spacer(modifier = Modifier.width(spacing.spacing03))
    }

    BasicText(
      text = text,
      style = typography.bodyCompact01.copy(color = itemColors.text),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      modifier = Modifier.weight(1f),
    )

    if (shortcut != null) {
      Spacer(modifier = Modifier.width(spacing.spacing05))
      BasicText(
        text = shortcut,
        style = typography.bodyCompact01.copy(color = itemColors.shortcut),
        maxLines = 1,
      )
    }

    if (hasSubmenu) {
      Spacer(modifier = Modifier.width(spacing.spacing03))
      Icon(
        image = Icons.CaretRight,
        size = IconSize.Small,
        tint = itemColors.icon,
      )
    }
  }
}

/**
 * Carbon Design System v11 selectable [MenuItem] inside a [MenuScope].
 */
@Composable
fun MenuScope.MenuSelectableItem(
  text: String,
  selected: Boolean,
  onSelectedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  shortcut: String? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  MenuSelectableItem(
    text = text,
    selected = selected,
    onSelectedChange = onSelectedChange,
    modifier = modifier,
    enabled = enabled,
    shortcut = shortcut,
    size = size,
    interactionSource = interactionSource,
  )
}

/**
 * Carbon Design System v11 selectable [MenuItem] displaying a leading checkmark when [selected].
 */
@Composable
fun MenuSelectableItem(
  text: String,
  selected: Boolean,
  onSelectedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  shortcut: String? = null,
  size: ControlSize = MenuDefaults.DefaultSize,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  MenuItem(
    text = text,
    onClick = { onSelectedChange(!selected) },
    modifier = modifier.semantics { this.selected = selected },
    enabled = enabled,
    shortcut = shortcut,
    icon = if (selected) Icons.Checkmark else null,
    reserveLeadingSlot = true,
    size = size,
    interactionSource = interactionSource,
  )
}

/**
 * Carbon Design System v11 horizontal menu divider (`1.dp` `$border-subtle-01` with `4.dp`
 * vertical margin above and below).
 */
@Composable
fun MenuDivider(modifier: Modifier = Modifier) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .padding(vertical = MehTheme.spacing.spacing02)
      .height(1.dp)
      .background(MehTheme.colors.borderSubtle01),
  )
}
