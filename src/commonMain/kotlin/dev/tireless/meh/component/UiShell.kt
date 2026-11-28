// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.blue50
import dev.tireless.meh.theme.gray10
import dev.tireless.meh.theme.gray100
import dev.tireless.meh.theme.gray30
import dev.tireless.meh.theme.gray50
import dev.tireless.meh.theme.gray80
import dev.tireless.meh.theme.gray90
import dev.tireless.meh.theme.gray90Hover
import dev.tireless.meh.theme.white

private val HeaderHeight = 48.dp
private val SideNavExpandedWidth = 256.dp
private val SideNavRailWidth = 48.dp
private val HeaderPanelDefaultWidth = 256.dp
private val NavItemHeight = 32.dp
private val ActiveIndicatorThickness = 3.dp

/**
 * Carbon UI Shell header bar (`48.dp` height, `gray100` dark surface).
 */
@Composable
fun Header(
  title: String,
  modifier: Modifier = Modifier,
  prefix: String? = null,
  isMenuExpanded: Boolean = false,
  onMenuClick: (() -> Unit)? = null,
  navigation: (@Composable RowScope.() -> Unit)? = null,
  actions: @Composable RowScope.() -> Unit = {},
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(HeaderHeight)
      .background(gray100)
      .drawBehind {
        val stroke = 1.dp.toPx()
        drawLine(
          color = gray80,
          start = Offset(0f, size.height - stroke / 2f),
          end = Offset(size.width, size.height - stroke / 2f),
          strokeWidth = stroke,
        )
      },
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (onMenuClick != null) {
      HeaderGlobalAction(
        icon = if (isMenuExpanded) MehTheme.icons.Close else MehTheme.icons.Menu,
        contentDescription = if (isMenuExpanded) "Close menu" else "Open menu",
        onClick = onMenuClick,
        active = isMenuExpanded,
      )
    }

    Row(
      modifier = Modifier
        .fillMaxHeight()
        .padding(
          start = if (onMenuClick != null) MehTheme.spacing.spacing03 else MehTheme.spacing.spacing05,
          end = MehTheme.spacing.spacing06,
        ),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing02),
    ) {
      if (!prefix.isNullOrBlank()) {
        BasicText(
          text = prefix,
          style = MehTheme.typography.bodyCompact01.copy(color = gray10),
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
        )
      }
      BasicText(
        text = title,
        style = MehTheme.typography.headingCompact01.copy(color = white),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
      )
    }

    if (navigation != null) {
      Box(
        modifier = Modifier
          .width(1.dp)
          .height(24.dp)
          .background(gray80),
      )
      Row(
        modifier = Modifier.fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        navigation()
      }
    }

    Spacer(Modifier.weight(1f))

    Row(
      modifier = Modifier.fillMaxHeight(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      actions()
    }
  }
}

/**
 * Horizontal navigation link inside a Carbon UI Shell [Header].
 */
@Composable
fun HeaderNavItem(
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  selected: Boolean = false,
  enabled: Boolean = true,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()
  val backgroundColor = when {
    !enabled -> Color.Transparent
    isHovered -> gray90Hover
    else -> Color.Transparent
  }
  val textColor = when {
    !enabled -> gray50
    selected || isHovered -> white
    else -> gray30
  }

  Box(
    modifier = modifier
      .fillMaxHeight()
      .background(backgroundColor)
      .drawBehind {
        if (selected) {
          val indicator = ActiveIndicatorThickness.toPx()
          drawRect(
            color = blue50,
            topLeft = Offset(0f, size.height - indicator),
            size = androidx.compose.ui.geometry.Size(size.width, indicator),
          )
        }
      }
      .hoverable(interactionSource = interactionSource, enabled = enabled)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Tab,
        onClick = onClick,
      )
      .semantics { this.selected = selected }
      .padding(horizontal = MehTheme.spacing.spacing05),
    contentAlignment = Alignment.Center,
  ) {
    BasicText(
      text = label,
      style = MehTheme.typography.bodyCompact01.copy(color = textColor),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
    )
  }
}

/**
 * Global utility icon button (`48.dp × 48.dp`) in the Carbon UI Shell [Header].
 */
@Composable
fun HeaderGlobalAction(
  icon: ImageVector,
  contentDescription: String?,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  active: Boolean = false,
  enabled: Boolean = true,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()
  val backgroundColor = when {
    !enabled -> Color.Transparent
    active -> gray90
    isHovered -> gray90Hover
    else -> Color.Transparent
  }
  val iconTint = when {
    !enabled -> gray50
    active || isHovered -> white
    else -> gray10
  }

  Box(
    modifier = modifier
      .size(HeaderHeight)
      .background(backgroundColor)
      .drawBehind {
        if (active) {
          val stroke = 1.dp.toPx()
          drawLine(
            color = gray80,
            start = Offset(stroke / 2f, 0f),
            end = Offset(stroke / 2f, size.height),
            strokeWidth = stroke,
          )
          drawLine(
            color = gray80,
            start = Offset(size.width - stroke / 2f, 0f),
            end = Offset(size.width - stroke / 2f, size.height),
            strokeWidth = stroke,
          )
        }
      }
      .hoverable(interactionSource = interactionSource, enabled = enabled)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .semantics { this.selected = active },
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = icon,
      contentDescription = contentDescription,
      tint = iconTint,
      modifier = Modifier.size(20.dp),
    )
  }
}

/**
 * Carbon UI Shell left navigation panel (`256.dp` expanded, `48.dp` rail).
 */
@Composable
fun SideNav(
  modifier: Modifier = Modifier,
  expanded: Boolean = true,
  isRail: Boolean = false,
  expandedWidth: Dp = SideNavExpandedWidth,
  content: @Composable ColumnScope.() -> Unit,
) {
  if (!expanded && !isRail) return

  val colors = MehTheme.colors
  val width = if (expanded) expandedWidth else SideNavRailWidth
  val borderColor = colors.borderSubtle01

  Column(
    modifier = modifier
      .width(width)
      .background(colors.background)
      .drawBehind {
        val stroke = 1.dp.toPx()
        drawLine(
          color = borderColor,
          start = Offset(size.width - stroke / 2f, 0f),
          end = Offset(size.width - stroke / 2f, size.height),
          strokeWidth = stroke,
        )
      }
      .padding(vertical = MehTheme.spacing.spacing05),
    content = content,
  )
}

/**
 * Navigation item inside a Carbon UI Shell [SideNav].
 */
@Composable
fun SideNavItem(
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  icon: ImageVector? = null,
  selected: Boolean = false,
  isRailCollapsed: Boolean = false,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()

  val backgroundColor = when {
    !enabled -> Color.Transparent
    selected && isHovered -> colors.layerSelectedHover01
    selected -> colors.layerSelected01
    isHovered -> colors.layerHover01
    else -> Color.Transparent
  }
  val textColor = when {
    !enabled -> colors.textDisabled
    selected || isHovered -> colors.textPrimary
    else -> colors.textSecondary
  }
  val iconTint = when {
    !enabled -> colors.iconDisabled
    selected || isHovered -> colors.iconPrimary
    else -> colors.iconSecondary
  }
  val indicatorColor = colors.borderInteractive

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(NavItemHeight)
      .background(backgroundColor)
      .drawBehind {
        if (selected) {
          drawRect(
            color = indicatorColor,
            topLeft = Offset.Zero,
            size = androidx.compose.ui.geometry.Size(ActiveIndicatorThickness.toPx(), size.height),
          )
        }
      }
      .hoverable(interactionSource = interactionSource, enabled = enabled)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .semantics { this.selected = selected }
      .padding(horizontal = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = if (isRailCollapsed) Arrangement.Center else Arrangement.Start,
  ) {
    if (icon != null) {
      Icon(
        image = icon,
        contentDescription = if (isRailCollapsed) label else null,
        tint = iconTint,
        modifier = Modifier.size(16.dp),
      )
      if (!isRailCollapsed) {
        Spacer(Modifier.width(MehTheme.spacing.spacing06))
      }
    }
    if (!isRailCollapsed) {
      val style = if (selected) MehTheme.typography.headingCompact01 else MehTheme.typography.bodyCompact01
      BasicText(
        text = label,
        style = style.copy(color = textColor),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
      )
    }
  }
}

/**
 * Collapsible category group inside a Carbon UI Shell [SideNav].
 */
@Composable
fun SideNavMenu(
  title: String,
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  icon: ImageVector? = null,
  hasActiveChild: Boolean = false,
  isRailCollapsed: Boolean = false,
  enabled: Boolean = true,
  content: @Composable ColumnScope.() -> Unit,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()

  val backgroundColor = when {
    !enabled -> Color.Transparent
    isHovered -> colors.layerHover01
    else -> Color.Transparent
  }
  val textColor = when {
    !enabled -> colors.textDisabled
    hasActiveChild || isHovered -> colors.textPrimary
    else -> colors.textSecondary
  }
  val iconTint = when {
    !enabled -> colors.iconDisabled
    hasActiveChild || isHovered -> colors.iconPrimary
    else -> colors.iconSecondary
  }
  val indicatorColor = colors.borderInteractive

  Column(modifier = modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(NavItemHeight)
        .background(backgroundColor)
        .drawBehind {
          if (hasActiveChild && (!expanded || isRailCollapsed)) {
            drawRect(
              color = indicatorColor,
              topLeft = Offset.Zero,
              size = androidx.compose.ui.geometry.Size(ActiveIndicatorThickness.toPx(), size.height),
            )
          }
        }
        .hoverable(interactionSource = interactionSource, enabled = enabled)
        .clickable(
          interactionSource = interactionSource,
          indication = null,
          enabled = enabled,
          role = Role.Button,
          onClick = { onExpandedChange(!expanded) },
        )
        .padding(horizontal = MehTheme.spacing.spacing05),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = if (isRailCollapsed) Arrangement.Center else Arrangement.Start,
    ) {
      if (icon != null) {
        Icon(
          image = icon,
          contentDescription = if (isRailCollapsed) title else null,
          tint = iconTint,
          modifier = Modifier.size(16.dp),
        )
        if (!isRailCollapsed) {
          Spacer(Modifier.width(MehTheme.spacing.spacing06))
        }
      }
      if (!isRailCollapsed) {
        BasicText(
          text = title,
          style = MehTheme.typography.headingCompact01.copy(color = textColor),
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
          modifier = Modifier.weight(1f),
        )
        Icon(
          image = if (expanded) MehTheme.icons.ChevronUp else MehTheme.icons.ChevronDown,
          contentDescription = null,
          tint = iconTint,
          modifier = Modifier.size(16.dp),
        )
      }
    }

    if (expanded && !isRailCollapsed) {
      Column(
        modifier = Modifier.fillMaxWidth(),
        content = content,
      )
    }
  }
}

/**
 * Indented sub-item inside a [SideNavMenu].
 */
@Composable
fun SideNavMenuItem(
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  selected: Boolean = false,
  hasParentIcon: Boolean = true,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()

  val backgroundColor = when {
    !enabled -> Color.Transparent
    selected && isHovered -> colors.layerSelectedHover01
    selected -> colors.layerSelected01
    isHovered -> colors.layerHover01
    else -> Color.Transparent
  }
  val textColor = when {
    !enabled -> colors.textDisabled
    selected || isHovered -> colors.textPrimary
    else -> colors.textSecondary
  }
  val indicatorColor = colors.borderInteractive
  val startPadding = if (hasParentIcon) 56.dp else 32.dp

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(NavItemHeight)
      .background(backgroundColor)
      .drawBehind {
        if (selected) {
          drawRect(
            color = indicatorColor,
            topLeft = Offset.Zero,
            size = androidx.compose.ui.geometry.Size(ActiveIndicatorThickness.toPx(), size.height),
          )
        }
      }
      .hoverable(interactionSource = interactionSource, enabled = enabled)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .semantics { this.selected = selected }
      .padding(start = startPadding, end = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    val style = if (selected) MehTheme.typography.headingCompact01 else MehTheme.typography.bodyCompact01
    BasicText(
      text = label,
      style = style.copy(color = textColor),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
    )
  }
}

/**
 * Horizontal divider inside a Carbon UI Shell [SideNav].
 */
@Composable
fun SideNavDivider(
  modifier: Modifier = Modifier,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .padding(
        horizontal = MehTheme.spacing.spacing05,
        vertical = MehTheme.spacing.spacing03,
      )
      .height(1.dp)
      .background(MehTheme.colors.borderSubtle01),
  )
}

/**
 * Carbon UI Shell right panel (`256.dp` width) anchored to the global header actions.
 */
@Composable
fun HeaderPanel(
  expanded: Boolean,
  modifier: Modifier = Modifier,
  width: Dp = HeaderPanelDefaultWidth,
  darkSurface: Boolean = true,
  content: @Composable ColumnScope.() -> Unit,
) {
  if (!expanded) return

  val colors = MehTheme.colors
  val surfaceColor = if (darkSurface) gray100 else colors.layer01
  val borderColor = if (darkSurface) gray80 else colors.borderSubtle01

  Column(
    modifier = modifier
      .width(width)
      .background(surfaceColor)
      .drawBehind {
        val stroke = 1.dp.toPx()
        drawLine(
          color = borderColor,
          start = Offset(stroke / 2f, 0f),
          end = Offset(stroke / 2f, size.height),
          strokeWidth = stroke,
        )
      }
      .padding(vertical = MehTheme.spacing.spacing05),
    content = content,
  )
}

/**
 * Link row inside a Carbon UI Shell [HeaderPanel] app switcher.
 */
@Composable
fun SwitcherItem(
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  selected: Boolean = false,
  darkSurface: Boolean = true,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()

  val backgroundColor = when {
    !enabled -> Color.Transparent
    darkSurface && selected -> gray90
    darkSurface && isHovered -> gray90Hover
    !darkSurface && selected -> colors.layerSelected01
    !darkSurface && isHovered -> colors.layerHover01
    else -> Color.Transparent
  }
  val textColor = when {
    !enabled -> if (darkSurface) gray50 else colors.textDisabled
    darkSurface && (selected || isHovered) -> white
    darkSurface -> gray30
    selected || isHovered -> colors.textPrimary
    else -> colors.textSecondary
  }
  val indicatorColor = if (darkSurface) blue50 else colors.borderInteractive

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(NavItemHeight)
      .background(backgroundColor)
      .drawBehind {
        if (selected) {
          drawRect(
            color = indicatorColor,
            topLeft = Offset.Zero,
            size = androidx.compose.ui.geometry.Size(ActiveIndicatorThickness.toPx(), size.height),
          )
        }
      }
      .hoverable(interactionSource = interactionSource, enabled = enabled)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .semantics { this.selected = selected }
      .padding(horizontal = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    BasicText(
      text = label,
      style = MehTheme.typography.headingCompact01.copy(color = textColor),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
    )
  }
}

/**
 * Horizontal divider inside a Carbon UI Shell [HeaderPanel] switcher.
 */
@Composable
fun SwitcherDivider(
  modifier: Modifier = Modifier,
  darkSurface: Boolean = true,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .padding(
        horizontal = MehTheme.spacing.spacing05,
        vertical = MehTheme.spacing.spacing03,
      )
      .height(1.dp)
      .background(if (darkSurface) gray80 else MehTheme.colors.borderSubtle01),
  )
}
