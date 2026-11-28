// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

/**
 * Carbon Design System v11 Unordered List supporting nested levels and productive/expressive type.
 */
@Composable
fun UnorderedList(
  items: List<String>,
  modifier: Modifier = Modifier,
  nested: Boolean = false,
  expressive: Boolean = false,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val textStyle =
    (if (expressive) MehTheme.typography.bodyCompact02 else MehTheme.typography.body01)
      .copy(color = colors.textPrimary)
  val marker = if (nested) "▪" else "–"

  Column(
    modifier = modifier.padding(start = if (nested) spacing.spacing06 else 0.dp),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
  ) {
    items.forEach { item ->
      Row(verticalAlignment = Alignment.Top) {
        BasicText(
          text = marker,
          style = textStyle,
          modifier = Modifier.width(spacing.spacing05),
        )
        BasicText(
          text = item,
          style = textStyle,
          modifier = Modifier.weight(1f, fill = false),
        )
      }
    }
  }
}

/**
 * Carbon Design System v11 Ordered List supporting numbered (top-level) and alphabetic (nested)
 * markers and productive/expressive typography.
 */
@Composable
fun OrderedList(
  items: List<String>,
  modifier: Modifier = Modifier,
  nested: Boolean = false,
  expressive: Boolean = false,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val textStyle =
    (if (expressive) MehTheme.typography.bodyCompact02 else MehTheme.typography.body01)
      .copy(color = colors.textPrimary)

  Column(
    modifier = modifier.padding(start = if (nested) spacing.spacing06 else 0.dp),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
  ) {
    items.forEachIndexed { index, item ->
      val marker =
        if (nested) {
          "${('a' + (index % 26))}."
        } else {
          "${index + 1}."
        }
      Row(verticalAlignment = Alignment.Top) {
        BasicText(
          text = marker,
          style = textStyle,
          modifier = Modifier.padding(end = spacing.spacing03),
        )
        BasicText(
          text = item,
          style = textStyle,
          modifier = Modifier.weight(1f, fill = false),
        )
      }
    }
  }
}

enum class ContainedListKind {
  OnPage,
  Disclosed,
}

private fun ControlSize.toContainedListSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large, ControlSize.XLarge -> this
  else -> ControlSize.Large
}

/**
 * Carbon Design System v11 Contained List (`OnPage` or `Disclosed`, `sm`/`md`/`lg`/`xl` row sizes,
 * optional header action slot, and custom [ContainedListItem] rows).
 */
@Composable
fun ContainedList(
  title: String,
  modifier: Modifier = Modifier,
  kind: ContainedListKind = ContainedListKind.OnPage,
  headerAction: (@Composable () -> Unit)? = null,
  content: @Composable ColumnScope.() -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val headerBg =
    when (kind) {
      ContainedListKind.OnPage -> Color.Transparent
      ContainedListKind.Disclosed -> colors.layer01
    }

  Column(modifier = modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .defaultMinSize(minHeight = 48.dp)
        .background(headerBg)
        .padding(horizontal = spacing.spacing05, vertical = spacing.spacing03),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      BasicText(
        text = title,
        style = typography.headingCompact01.copy(color = colors.textPrimary),
        modifier = Modifier.weight(1f),
      )
      if (headerAction != null) {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        headerAction()
      }
    }

    Column(
      modifier = Modifier
        .fillMaxWidth()
        .background(colors.layer01),
      content = content,
    )
  }
}

/**
 * Convenience overload for [ContainedList] rendering a list of string labels.
 */
@Composable
fun ContainedList(
  title: String,
  items: List<String>,
  modifier: Modifier = Modifier,
  kind: ContainedListKind = ContainedListKind.OnPage,
  size: ControlSize = ControlSize.Large,
  onItemClick: ((Int) -> Unit)? = null,
) {
  ContainedList(
    title = title,
    modifier = modifier,
    kind = kind,
  ) {
    items.forEachIndexed { index, item ->
      ContainedListItem(
        text = item,
        size = size,
        showTopDivider = index > 0 || kind == ContainedListKind.Disclosed,
        onClick = onItemClick?.let { callback -> { callback(index) } },
      )
    }
  }
}

/**
 * Carbon Design System v11 Contained List item with optional click interaction, hover/active/focus
 * states, disabled state, and trailing action slot.
 */
@Composable
fun ContainedListItem(
  text: String,
  modifier: Modifier = Modifier,
  size: ControlSize = ControlSize.Large,
  enabled: Boolean = true,
  isInset: Boolean = false,
  showTopDivider: Boolean = true,
  onClick: (() -> Unit)? = null,
  action: (@Composable () -> Unit)? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toContainedListSize()
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      onClick == null || !enabled -> Color.Transparent
      pressed -> colors.layerActive01
      hovered -> colors.layerHover01
      else -> Color.Transparent
    }
  val textColor = if (enabled) colors.textPrimary else colors.textDisabled

  Column(modifier = modifier.fillMaxWidth()) {
    if (showTopDivider) {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = if (isInset) spacing.spacing05 else 0.dp)
          .height(1.dp)
          .background(colors.borderSubtle01),
      )
    }

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .defaultMinSize(minHeight = effectiveSize.dp)
        .background(backgroundColor)
        .drawBehind {
          if (focused && enabled && onClick != null) {
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
        .then(
          if (onClick != null) {
            Modifier.clickable(
              interactionSource = interactionSource,
              indication = null,
              enabled = enabled,
              role = Role.Button,
              onClick = onClick,
            )
          } else {
            Modifier
          },
        )
        .padding(horizontal = spacing.spacing05, vertical = spacing.spacing03),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      BasicText(
        text = text,
        style = typography.bodyCompact01.copy(color = textColor),
        modifier = Modifier.weight(1f),
      )
      if (action != null) {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        action()
      }
    }
  }
}
