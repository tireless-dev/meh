// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

object ToggletipDefaults {
  val MaxWidth: Dp = 288.dp
  val ContentPadding: PaddingValues = PaddingValues(16.dp)
  val TriggerSize: Dp = 24.dp
}

/**
 * Carbon v11 Toggletip trigger icon button (`$icon-secondary` at rest, `$icon-primary` on hover or
 * open, `$focus` border on focus).
 */
@Composable
fun ToggletipTrigger(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean = false,
  icon: ImageVector = Icons.Information,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val iconTint = if (hovered || expanded) colors.iconPrimary else colors.iconSecondary

  Box(
    modifier = modifier
      .size(ToggletipDefaults.TriggerSize)
      .drawBehind {
        if (focused) {
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
      .clickable(
        interactionSource = interactionSource,
        indication = null,
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
 * Styled Carbon v11 Toggletip surface: inverse background (`$background-inverse`), inverse text,
 * directional caret tip, `288.dp` (`18rem`) max width, `16.dp` padding, and optional [actions] row.
 */
@Composable
fun ToggletipSurface(
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Top,
  caret: Boolean = true,
  maxWidth: Dp = ToggletipDefaults.MaxWidth,
  actions: (@Composable RowScope.() -> Unit)? = null,
  content: @Composable () -> Unit,
) {
  val spacing = MehTheme.spacing

  PopoverSurface(
    modifier = modifier,
    align = align,
    caret = caret,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding = ToggletipDefaults.ContentPadding,
    maxWidth = maxWidth,
  ) {
    Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing05)) {
      content()
      if (actions != null) {
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
          verticalAlignment = Alignment.CenterVertically,
          content = actions,
        )
      }
    }
  }
}

/**
 * Carbon Design System v11 Toggletip: reveals supplemental interactive content in an inverse
 * popover when the user activates the trigger button (via click, Enter, or Space).
 */
@Composable
fun Toggletip(
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  label: String? = null,
  align: PopoverAlign = PopoverAlign.Top,
  autoAlign: Boolean = true,
  caret: Boolean = true,
  icon: ImageVector = Icons.Information,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  actions: (@Composable RowScope.() -> Unit)? = null,
  content: @Composable () -> Unit,
) {
  var internalExpanded by remember { mutableStateOf(false) }
  val isExpanded = expanded ?: internalExpanded
  val setExpanded: (Boolean) -> Unit = { next ->
    internalExpanded = next
    onExpandedChange?.invoke(next)
  }

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (label != null) {
      BasicText(
        text = label,
        style = MehTheme.typography.label01.copy(color = colors.textSecondary),
      )
      Spacer(modifier = Modifier.width(spacing.spacing03))
    }

    Popover(
      expanded = isExpanded,
      onDismissRequest = { setExpanded(false) },
      align = align,
      autoAlign = autoAlign,
      caret = caret,
      dropShadow = false,
      highContrast = true,
      border = false,
      tabTip = false,
      contentPadding = ToggletipDefaults.ContentPadding,
      maxWidth = ToggletipDefaults.MaxWidth,
      properties = PopupProperties(focusable = true),
      trigger = {
        ToggletipTrigger(
          onClick = { setExpanded(!isExpanded) },
          expanded = isExpanded,
          icon = icon,
          interactionSource = interactionSource,
        )
      },
    ) {
      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing05)) {
        content()
        if (actions != null) {
          Row(
            horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
            verticalAlignment = Alignment.CenterVertically,
            content = actions,
          )
        }
      }
    }
  }
}

/**
 * Controlled [Toggletip] anchored to its parent container bounds.
 */
@Composable
fun Toggletip(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Top,
  autoAlign: Boolean = true,
  caret: Boolean = true,
  actions: (@Composable RowScope.() -> Unit)? = null,
  content: @Composable () -> Unit,
) {
  val spacing = MehTheme.spacing

  Popover(
    expanded = expanded,
    onDismissRequest = onDismissRequest,
    modifier = modifier,
    align = align,
    autoAlign = autoAlign,
    caret = caret,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding = ToggletipDefaults.ContentPadding,
    maxWidth = ToggletipDefaults.MaxWidth,
    properties = PopupProperties(focusable = true),
  ) {
    Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing05)) {
      content()
      if (actions != null) {
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
          verticalAlignment = Alignment.CenterVertically,
          content = actions,
        )
      }
    }
  }
}
