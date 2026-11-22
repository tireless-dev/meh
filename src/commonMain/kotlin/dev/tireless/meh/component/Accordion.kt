// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.AccordionSize
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp
import kotlin.math.roundToInt

enum class AccordionAlign {
  Start,
  End,
}

@DslMarker
annotation class AccordionDsl

internal data class AccordionItemEntry(
  val title: String,
  val expanded: Boolean?,
  val initiallyExpanded: Boolean,
  val onExpandedChange: ((Boolean) -> Unit)?,
  val enabled: Boolean?,
  val interactionSource: MutableInteractionSource?,
  val content: @Composable () -> Unit,
)

@AccordionDsl
class AccordionScope internal constructor() {
  internal val items = mutableListOf<AccordionItemEntry>()

  fun item(
    title: String,
    expanded: Boolean? = null,
    initiallyExpanded: Boolean = false,
    onExpandedChange: ((Boolean) -> Unit)? = null,
    enabled: Boolean? = null,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit,
  ) {
    items += AccordionItemEntry(
      title = title,
      expanded = expanded,
      initiallyExpanded = initiallyExpanded,
      onExpandedChange = onExpandedChange,
      enabled = enabled,
      interactionSource = interactionSource,
      content = content,
    )
  }
}

private data class AccordionItemState(
  val entry: AccordionItemEntry,
  val interactionSource: MutableInteractionSource,
  val enabled: Boolean,
  val expanded: Boolean,
  val hovered: Boolean,
  val focused: Boolean,
  val pressed: Boolean,
  val onToggle: () -> Unit,
)

@Immutable
private data class ResolvedAccordionItemColors(
  val headingBackground: Color,
  val title: Color,
  val icon: Color,
  val focusOutline: Color?,
)

@Composable
fun Accordion(
  modifier: Modifier = Modifier,
  align: AccordionAlign = AccordionAlign.End,
  size: AccordionSize = AccordionSize.Medium,
  isFlush: Boolean = false,
  enabled: Boolean = true,
  content: AccordionScope.() -> Unit,
) {
  val scope = AccordionScope().apply(content)
  val effectiveFlush = isFlush && align == AccordionAlign.End

  val itemStates =
    scope.items.mapIndexed { index, entry ->
      val interactionSource = entry.interactionSource ?: remember(index) { MutableInteractionSource() }
      var internalExpanded by remember(index, entry.initiallyExpanded) {
        mutableStateOf(entry.initiallyExpanded)
      }
      val itemEnabled = entry.enabled ?: enabled
      val isExpanded = (entry.expanded ?: internalExpanded) && itemEnabled
      val hovered by interactionSource.collectIsHoveredAsState()
      val focused by interactionSource.collectIsFocusedAsState()
      val pressed by interactionSource.collectIsPressedAsState()

      AccordionItemState(
        entry = entry,
        interactionSource = interactionSource,
        enabled = itemEnabled,
        expanded = isExpanded,
        hovered = hovered && itemEnabled,
        focused = focused && itemEnabled,
        pressed = pressed && itemEnabled,
        onToggle = {
          if (itemEnabled) {
            val next = !isExpanded
            if (entry.expanded == null) {
              internalExpanded = next
            }
            entry.onExpandedChange?.invoke(next)
          }
        },
      )
    }

  Column(modifier = modifier.fillMaxWidth()) {
    itemStates.forEachIndexed { index, state ->
      AccordionItemRow(
        state = state,
        previous = itemStates.getOrNull(index - 1),
        isLast = index == itemStates.lastIndex,
        align = align,
        size = size,
        isFlush = effectiveFlush,
      )
    }
  }
}

@Composable
private fun AccordionItemRow(
  state: AccordionItemState,
  previous: AccordionItemState?,
  isLast: Boolean,
  align: AccordionAlign,
  size: AccordionSize,
  isFlush: Boolean,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val resolvedColors =
    resolveAccordionItemColors(
      colors = colors,
      enabled = state.enabled,
      hovered = state.hovered,
      focused = state.focused,
      pressed = state.pressed,
    )

  val rotation by animateFloatAsState(
    targetValue = if (state.expanded) -180f else 0f,
    animationSpec = tween(durationMillis = 110),
    label = "AccordionChevronRotation",
  )

  val topDividerColor =
    resolveDividerColor(
      colors = colors,
      hidden = state.focused || (previous != null && !previous.expanded && previous.focused),
      pressed = state.pressed || (previous != null && !previous.expanded && previous.pressed),
      hovered = state.hovered || (previous != null && !previous.expanded && previous.hovered),
    )
  val topDividerInset =
    if (isFlush && topDividerColor == colors.borderSubtle01) spacing.spacing05 else spacing.spacing00

  val bottomDividerColor =
    if (isLast) {
      resolveDividerColor(
        colors = colors,
        hidden = !state.expanded && state.focused,
        pressed = !state.expanded && state.pressed,
        hovered = !state.expanded && state.hovered,
      )
    } else {
      null
    }
  val bottomDividerInset =
    if (isFlush && bottomDividerColor == colors.borderSubtle01) spacing.spacing05 else spacing.spacing00

  val headingVerticalPadding =
    when (size) {
      AccordionSize.Small -> spacing.spacing02
      AccordionSize.Medium -> spacing.spacing03
      AccordionSize.Large -> spacing.spacing03
    }

  val contentStartPadding =
    if (align == AccordionAlign.Start) {
      spacing.spacing05 + IconSize.Small.dp + spacing.spacing05
    } else {
      spacing.spacing05
    }

  Column(
    modifier =
    Modifier
      .fillMaxWidth()
      .drawBehind {
        if (topDividerColor != null) {
          drawAccordionDivider(
            color = topDividerColor,
            y = 0f,
            horizontalInset = topDividerInset,
          )
        }
        if (bottomDividerColor != null) {
          drawAccordionDivider(
            color = bottomDividerColor,
            y = this.size.height - 1.dp.toPx(),
            horizontalInset = bottomDividerInset,
          )
        }
      },
  ) {
    Row(
      modifier =
      Modifier
        .fillMaxWidth()
        .defaultMinSize(minHeight = size.dp)
        .background(resolvedColors.headingBackground)
        .drawWithContent {
          drawContent()
          val focusOutline = resolvedColors.focusOutline
          if (focusOutline != null) {
            drawAccordionFocusOutline(color = focusOutline)
          }
        }
        .clickable(
          enabled = state.enabled,
          role = Role.Button,
          interactionSource = state.interactionSource,
          indication = null,
          onClick = state.onToggle,
        )
        .semantics {
          stateDescription = if (state.expanded) "Expanded" else "Collapsed"
          if (!state.enabled) {
            disabled()
          }
        }
        .padding(
          start = spacing.spacing05,
          end = spacing.spacing05,
          top = headingVerticalPadding,
          bottom = headingVerticalPadding,
        ),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      if (align == AccordionAlign.Start) {
        Icon(
          image = Icons.ChevronDown,
          size = IconSize.Small,
          tint = resolvedColors.icon,
          modifier = Modifier.rotate(rotation),
        )
        Spacer(modifier = Modifier.width(spacing.spacing05))
        BasicText(
          text = state.entry.title,
          style = typography.body01.copy(color = resolvedColors.title),
          modifier = Modifier.weight(1f),
        )
      } else {
        BasicText(
          text = state.entry.title,
          style = typography.body01.copy(color = resolvedColors.title),
          modifier = Modifier.weight(1f),
        )
        Spacer(modifier = Modifier.width(spacing.spacing05))
        Icon(
          image = Icons.ChevronDown,
          size = IconSize.Small,
          tint = resolvedColors.icon,
          modifier = Modifier.rotate(rotation),
        )
      }
    }

    AnimatedVisibility(
      visible = state.expanded,
      enter = expandVertically(animationSpec = tween(durationMillis = 110)) + fadeIn(tween(110)),
      exit = shrinkVertically(animationSpec = tween(durationMillis = 110)) + fadeOut(tween(110)),
    ) {
      Box(
        modifier =
        Modifier
          .fillMaxWidth()
          .accordionContentPadding(
            start = contentStartPadding,
            top = spacing.spacing03,
            bottom = spacing.spacing06,
            compactEnd = spacing.spacing05,
            mediumEnd = spacing.spacing09,
          ),
      ) {
        state.entry.content()
      }
    }
  }
}

private fun Modifier.accordionContentPadding(
  start: Dp,
  top: Dp,
  bottom: Dp,
  compactEnd: Dp,
  mediumEnd: Dp,
): Modifier = layout { measurable, constraints ->
  val maxWidthPx = constraints.maxWidth
  val endPx =
    when {
      maxWidthPx == Constraints.Infinity -> compactEnd.roundToPx()
      maxWidthPx >= 640.dp.roundToPx() -> (maxWidthPx * 0.25f).roundToInt()
      maxWidthPx >= 480.dp.roundToPx() -> mediumEnd.roundToPx()
      else -> compactEnd.roundToPx()
    }
  val startPx = start.roundToPx()
  val topPx = top.roundToPx()
  val bottomPx = bottom.roundToPx()
  val horizontalPx = startPx + endPx
  val verticalPx = topPx + bottomPx

  val childConstraints =
    constraints.copy(
      minWidth = (constraints.minWidth - horizontalPx).coerceAtLeast(0),
      maxWidth =
      if (constraints.maxWidth == Constraints.Infinity) {
        Constraints.Infinity
      } else {
        (constraints.maxWidth - horizontalPx).coerceAtLeast(0)
      },
      minHeight = (constraints.minHeight - verticalPx).coerceAtLeast(0),
      maxHeight =
      if (constraints.maxHeight == Constraints.Infinity) {
        Constraints.Infinity
      } else {
        (constraints.maxHeight - verticalPx).coerceAtLeast(0)
      },
    )

  val placeable = measurable.measure(childConstraints)
  val width = (placeable.width + horizontalPx).coerceIn(constraints.minWidth, constraints.maxWidth)
  val height = (placeable.height + verticalPx).coerceIn(constraints.minHeight, constraints.maxHeight)

  layout(width, height) {
    placeable.placeRelative(startPx, topPx)
  }
}

private fun DrawScope.drawAccordionDivider(
  color: Color,
  y: Float,
  horizontalInset: Dp,
) {
  val insetPx = horizontalInset.toPx()
  val strokeHeight = 1.dp.toPx()
  drawRect(
    color = color,
    topLeft = Offset(insetPx, y),
    size = Size(width = (size.width - insetPx * 2f).coerceAtLeast(0f), height = strokeHeight),
  )
}

private fun DrawScope.drawAccordionFocusOutline(color: Color) {
  val strokeWidth = 2.dp.toPx()
  val halfStroke = strokeWidth / 2f
  drawRect(
    color = color,
    topLeft = Offset(halfStroke, halfStroke),
    size = Size(width = size.width - strokeWidth, height = size.height - strokeWidth),
    style = Stroke(width = strokeWidth),
  )
}

private fun resolveDividerColor(
  colors: Colors,
  hidden: Boolean,
  pressed: Boolean,
  hovered: Boolean,
): Color? = when {
  hidden -> null
  pressed -> colors.layerActive01
  hovered -> colors.layerHover01
  else -> colors.borderSubtle01
}

private fun resolveAccordionItemColors(
  colors: Colors,
  enabled: Boolean,
  hovered: Boolean,
  focused: Boolean,
  pressed: Boolean,
): ResolvedAccordionItemColors {
  val headingBackground =
    when {
      !enabled -> Color.Transparent
      pressed -> colors.layerActive01
      hovered -> colors.layerHover01
      else -> Color.Transparent
    }
  val title = if (enabled) colors.textPrimary else colors.textDisabled
  val icon = if (enabled) colors.iconPrimary else colors.iconDisabled
  val focusOutline = if (enabled && focused) colors.focus else null

  return ResolvedAccordionItemColors(
    headingBackground = headingBackground,
    title = title,
    icon = icon,
    focusOutline = focusOutline,
  )
}
