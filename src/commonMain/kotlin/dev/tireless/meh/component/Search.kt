// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toSearchSize(): ControlSize = when (this) {
  ControlSize.XSmall, ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Medium
}

/**
 * Carbon Design System v11 Search input with leading magnifying glass icon, trailing clear button
 * when non-empty, `xs`/`sm`/`md`/`lg` sizes, and focus/disabled states.
 */
@Composable
fun Search(
  value: String,
  onValueChange: (String) -> Unit,
  onClear: () -> Unit,
  modifier: Modifier = Modifier,
  placeholder: String = "Search",
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
  keyboardOptions: KeyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
  keyboardActions: KeyboardActions = KeyboardActions.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isFocused by interactionSource.collectIsFocusedAsState()
  val effectiveSize = size.toSearchSize()

  val textColor = if (enabled) colors.textPrimary else colors.textDisabled
  val placeholderColor = if (enabled) colors.textPlaceholder else colors.textDisabled
  val searchIconColor = if (enabled) colors.iconSecondary else colors.iconDisabled

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(effectiveSize.dp)
      .background(colors.field01)
      .drawBehind {
        if (enabled) {
          if (isFocused) {
            val strokeWidth = 2.dp.toPx()
            val half = strokeWidth / 2f
            drawRect(
              color = colors.focus,
              topLeft = Offset(half, half),
              size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
              style = Stroke(width = strokeWidth),
            )
          } else {
            val strokeWidth = 1.dp.toPx()
            val y = this.size.height - strokeWidth / 2f
            drawLine(
              color = colors.borderStrong01,
              start = Offset(0f, y),
              end = Offset(this.size.width, y),
              strokeWidth = strokeWidth,
            )
          }
        }
      },
    verticalAlignment = Alignment.CenterVertically,
  ) {
    // Leading search icon
    Box(
      modifier = Modifier
        .width(effectiveSize.dp)
        .fillMaxHeight(),
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = Icons.Search,
        size = IconSize.Small,
        tint = searchIconColor,
      )
    }

    // Input field
    Box(
      modifier = Modifier
        .weight(1f)
        .padding(end = if (value.isNotEmpty() && enabled) 0.dp else spacing.spacing05),
      contentAlignment = Alignment.CenterStart,
    ) {
      if (value.isEmpty()) {
        BasicText(
          text = placeholder,
          style = typography.bodyCompact01.copy(color = placeholderColor),
          maxLines = 1,
        )
      }
      BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        enabled = enabled,
        textStyle = typography.bodyCompact01.copy(color = textColor),
        cursorBrush = SolidColor(colors.textPrimary),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        singleLine = true,
      )
    }

    // Trailing clear button when query is non-empty
    if (value.isNotEmpty() && enabled) {
      val clearInteractionSource = remember { MutableInteractionSource() }
      val clearHovered by clearInteractionSource.collectIsHoveredAsState()

      Box(
        modifier = Modifier
          .width(effectiveSize.dp)
          .fillMaxHeight()
          .background(if (clearHovered) colors.backgroundHover else Color.Transparent)
          .semantics { contentDescription = "Clear search input" }
          .clickable(
            interactionSource = clearInteractionSource,
            indication = null,
            role = Role.Button,
            onClick = onClear,
          ),
        contentAlignment = Alignment.Center,
      ) {
        Icon(
          image = Icons.Close,
          size = IconSize.Small,
          tint = colors.iconPrimary,
        )
      }
    }
  }
}

/**
 * Carbon Design System v11 Expandable search: renders a compact search icon button when collapsed
 * and expands into a full [Search] input when [expanded] is true.
 */
@Composable
fun ExpandableSearch(
  value: String,
  onValueChange: (String) -> Unit,
  onClear: () -> Unit,
  expanded: Boolean,
  onExpandedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  placeholder: String = "Search",
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val effectiveSize = size.toSearchSize()
  val colors = MehTheme.colors

  if (expanded) {
    Search(
      value = value,
      onValueChange = onValueChange,
      onClear = {
        onClear()
        onExpandedChange(false)
      },
      modifier = modifier,
      placeholder = placeholder,
      enabled = enabled,
      size = effectiveSize,
      interactionSource = interactionSource,
    )
  } else {
    val hovered by interactionSource.collectIsHoveredAsState()
    val focused by interactionSource.collectIsFocusedAsState()

    Box(
      modifier = modifier
        .size(effectiveSize.dp)
        .background(if (hovered && enabled) colors.backgroundHover else Color.Transparent)
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
        .semantics { contentDescription = "Expand search" }
        .clickable(
          interactionSource = interactionSource,
          indication = null,
          enabled = enabled,
          role = Role.Button,
          onClick = { onExpandedChange(true) },
        ),
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = Icons.Search,
        size = IconSize.Small,
        tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
      )
    }
  }
}
