// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.MehTheme

object TooltipDefaults {
  val SingleLineMaxWidth: Dp = 208.dp
  val MultiLineMaxWidth: Dp = 288.dp
  val SingleLineMinHeight: Dp = 24.dp
  val SingleLinePadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 2.dp)
  val MultiLinePadding: PaddingValues = PaddingValues(16.dp)
}

/**
 * The styled Carbon v11 Tooltip container surface: inverse background (`$background-inverse`),
 * inverse text (`$text-inverse`), directional caret tip, and no drop shadow.
 */
@Composable
fun TooltipSurface(
  text: String,
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Top,
  singleLine: Boolean = true,
  caret: Boolean = true,
  maxWidth: Dp =
    if (singleLine) TooltipDefaults.SingleLineMaxWidth else TooltipDefaults.MultiLineMaxWidth,
) {
  val colors = MehTheme.colors
  val textStyle =
    (if (singleLine) MehTheme.typography.bodyCompact01 else MehTheme.typography.body01)
      .copy(color = colors.textInverse)

  PopoverSurface(
    modifier = modifier,
    align = align,
    caret = caret,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding =
    if (singleLine) TooltipDefaults.SingleLinePadding else TooltipDefaults.MultiLinePadding,
    maxWidth = maxWidth,
  ) {
    Box(
      modifier =
      if (singleLine) {
        Modifier.defaultMinSize(minHeight = TooltipDefaults.SingleLineMinHeight)
      } else {
        Modifier
      },
      contentAlignment = Alignment.CenterStart,
    ) {
      BasicText(
        text = text,
        style = textStyle,
      )
    }
  }
}

/**
 * Carbon Design System v11 Tooltip anchored to a [trigger] composable.
 *
 * When [expanded] is null, the tooltip opens automatically when [interactionSource] is hovered or
 * focused. Pass a non-null [expanded] value to control visibility explicitly.
 */
@Composable
fun Tooltip(
  text: String,
  trigger: @Composable () -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  align: PopoverAlign = PopoverAlign.Top,
  autoAlign: Boolean = true,
  singleLine: Boolean = true,
  caret: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val isExpanded = expanded ?: (hovered || focused)

  Popover(
    expanded = isExpanded,
    onDismissRequest = {},
    modifier = modifier,
    align = align,
    autoAlign = autoAlign,
    caret = caret,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding =
    if (singleLine) TooltipDefaults.SingleLinePadding else TooltipDefaults.MultiLinePadding,
    maxWidth =
    if (singleLine) TooltipDefaults.SingleLineMaxWidth else TooltipDefaults.MultiLineMaxWidth,
    properties = PopupProperties(focusable = false),
    trigger = {
      Box(
        modifier = Modifier
          .hoverable(interactionSource)
          .focusable(interactionSource = interactionSource),
      ) {
        trigger()
      }
    },
  ) {
    val colors = MehTheme.colors
    val textStyle =
      (if (singleLine) MehTheme.typography.bodyCompact01 else MehTheme.typography.body01)
        .copy(color = colors.textInverse)
    Box(
      modifier =
      if (singleLine) {
        Modifier.defaultMinSize(minHeight = TooltipDefaults.SingleLineMinHeight)
      } else {
        Modifier
      },
      contentAlignment = Alignment.CenterStart,
    ) {
      BasicText(
        text = text,
        style = textStyle,
      )
    }
  }
}

/**
 * Controlled Carbon v11 Tooltip anchored to its parent container bounds.
 */
@Composable
fun Tooltip(
  text: String,
  expanded: Boolean,
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Top,
  autoAlign: Boolean = true,
  singleLine: Boolean = true,
  caret: Boolean = true,
) {
  Popover(
    expanded = expanded,
    onDismissRequest = {},
    modifier = modifier,
    align = align,
    autoAlign = autoAlign,
    caret = caret,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding =
    if (singleLine) TooltipDefaults.SingleLinePadding else TooltipDefaults.MultiLinePadding,
    maxWidth =
    if (singleLine) TooltipDefaults.SingleLineMaxWidth else TooltipDefaults.MultiLineMaxWidth,
    properties = PopupProperties(focusable = false),
  ) {
    val colors = MehTheme.colors
    val textStyle =
      (if (singleLine) MehTheme.typography.bodyCompact01 else MehTheme.typography.body01)
        .copy(color = colors.textInverse)
    Box(
      modifier =
      if (singleLine) {
        Modifier.defaultMinSize(minHeight = TooltipDefaults.SingleLineMinHeight)
      } else {
        Modifier
      },
      contentAlignment = Alignment.CenterStart,
    ) {
      BasicText(
        text = text,
        style = textStyle,
      )
    }
  }
}

/**
 * Visual trigger for a Carbon v11 [DefinitionTooltip]: displays [term] with a dotted bottom border
 * (`$border-strong` at rest, `$border-interactive` on hover/open, and `$focus` outline on focus).
 */
@Composable
fun DefinitionTooltipTrigger(
  term: String,
  modifier: Modifier = Modifier,
  open: Boolean = false,
  onClick: (() -> Unit)? = null,
  textStyle: TextStyle = MehTheme.typography.body01,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val underlineColor =
    if (hovered || focused || open) colors.borderInteractive else colors.borderStrong01

  Box(
    modifier = modifier
      .then(
        if (onClick != null) {
          Modifier.clickable(
            interactionSource = interactionSource,
            indication = null,
            role = Role.Button,
            onClick = onClick,
          )
        } else {
          Modifier
            .hoverable(interactionSource)
            .focusable(interactionSource = interactionSource)
        },
      )
      .drawBehind {
        val strokeWidth = 1.dp.toPx()
        val dash = 2.dp.toPx()
        val y = size.height - strokeWidth / 2f
        drawLine(
          color = underlineColor,
          start = Offset(0f, y),
          end = Offset(size.width, y),
          strokeWidth = strokeWidth,
          pathEffect = PathEffect.dashPathEffect(floatArrayOf(dash, dash), 0f),
        )
        if (focused) {
          val focusWidth = 2.dp.toPx()
          val half = focusWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(size.width - focusWidth, size.height - focusWidth),
            style = Stroke(width = focusWidth),
          )
        }
      }
      .padding(bottom = 2.dp),
  ) {
    BasicText(
      text = term,
      style = textStyle.copy(color = colors.textPrimary),
    )
  }
}

/**
 * Carbon Design System v11 Definition Tooltip: underlines a [term] with a dotted border and reveals
 * a multi-line [definition] in an inverse tooltip on hover, focus, or click.
 */
@Composable
fun DefinitionTooltip(
  term: String,
  definition: String,
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  align: PopoverAlign = PopoverAlign.BottomStart,
  autoAlign: Boolean = true,
  textStyle: TextStyle = MehTheme.typography.body01,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var internalOpen by remember { mutableStateOf(false) }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val isOpen = expanded ?: (internalOpen || hovered || focused)

  Popover(
    expanded = isOpen,
    onDismissRequest = {
      internalOpen = false
      onExpandedChange?.invoke(false)
    },
    modifier = modifier,
    align = align,
    autoAlign = autoAlign,
    caret = true,
    dropShadow = false,
    highContrast = true,
    border = false,
    tabTip = false,
    contentPadding = TooltipDefaults.MultiLinePadding,
    maxWidth = TooltipDefaults.MultiLineMaxWidth,
    properties = PopupProperties(focusable = false),
    trigger = {
      DefinitionTooltipTrigger(
        term = term,
        open = isOpen,
        textStyle = textStyle,
        interactionSource = interactionSource,
        onClick = {
          val next = !isOpen
          internalOpen = next
          onExpandedChange?.invoke(next)
        },
      )
    },
  ) {
    BasicText(
      text = definition,
      style = MehTheme.typography.body01.copy(color = MehTheme.colors.textInverse),
    )
  }
}
