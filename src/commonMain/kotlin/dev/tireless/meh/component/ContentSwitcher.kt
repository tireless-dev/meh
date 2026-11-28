// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toContentSwitcherSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Medium
}

private fun ControlSize.contentSwitcherIconSize(): IconSize = when (this) {
  ControlSize.Large -> IconSize.Expressive
  else -> IconSize.Small
}

private fun ControlSize.contentSwitcherIconPadding(): Dp = when (this) {
  ControlSize.Small -> 8.dp
  ControlSize.Large -> 14.dp
  else -> 12.dp
}

/**
 * Carbon Design System v11 Content switcher for toggling between two or more mutually exclusive
 * content sections (`sm` 32dp, `md` 40dp default, `lg` 48dp).
 */
@Composable
fun ContentSwitcher(
  selectedIndex: Int,
  options: List<String>,
  onOptionSelect: (Int) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
  itemInteractionSources: List<MutableInteractionSource?> = emptyList(),
) {
  val effectiveSize = size.toContentSwitcherSize()
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val shape = RoundedCornerShape(4.dp)
  val borderColor = if (enabled) colors.borderInverse else colors.borderDisabled

  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(effectiveSize.dp)
      .clip(shape)
      .border(width = 1.dp, color = borderColor, shape = shape),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    options.forEachIndexed { index, option ->
      val isSelected = index == selectedIndex
      val interactionSource =
        itemInteractionSources.getOrNull(index) ?: remember(index) { MutableInteractionSource() }
      val hovered by interactionSource.collectIsHoveredAsState()
      val pressed by interactionSource.collectIsPressedAsState()
      val focused by interactionSource.collectIsFocusedAsState()

      val backgroundColor =
        when {
          !enabled && isSelected -> colors.buttonDisabled
          !enabled -> Color.Transparent
          isSelected -> colors.layerSelectedInverse
          pressed -> colors.layerActive01
          hovered -> colors.layerHover01
          else -> Color.Transparent
        }
      val textColor =
        when {
          !enabled && isSelected -> colors.textOnColorDisabled
          !enabled -> colors.textDisabled
          isSelected -> colors.textInverse
          hovered -> colors.textPrimary
          else -> colors.textSecondary
        }
      val textStyle =
        (if (isSelected) typography.headingCompact01 else typography.bodyCompact01)
          .copy(color = textColor)

      if (index > 0) {
        val showDivider = !isSelected && (index - 1) != selectedIndex
        if (showDivider) {
          Spacer(
            modifier = Modifier
              .width(1.dp)
              .height(16.dp)
              .background(if (enabled) colors.borderSubtle01 else colors.borderDisabled),
          )
        }
      }

      Box(
        modifier = Modifier
          .weight(1f)
          .fillMaxHeight()
          .background(backgroundColor)
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
              if (isSelected) {
                val insetWidth = 1.dp.toPx()
                val insetOffset = strokeWidth + insetWidth / 2f
                drawRect(
                  color = colors.focusInset,
                  topLeft = Offset(insetOffset, insetOffset),
                  size = Size(
                    this.size.width - insetOffset * 2f,
                    this.size.height - insetOffset * 2f,
                  ),
                  style = Stroke(width = insetWidth),
                )
              }
            }
          }
          .semantics { selected = isSelected }
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            enabled = enabled,
            role = Role.Tab,
            onClick = { onOptionSelect(index) },
          )
          .padding(horizontal = spacing.spacing05),
        contentAlignment = Alignment.CenterStart,
      ) {
        BasicText(
          text = option,
          style = textStyle,
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
        )
      }
    }
  }
}

/**
 * Carbon Design System v11 Icon-only Content switcher.
 */
@Composable
fun IconContentSwitcher(
  selectedIndex: Int,
  icons: List<ImageVector>,
  contentDescriptions: List<String>,
  onOptionSelect: (Int) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
  itemInteractionSources: List<MutableInteractionSource?> = emptyList(),
) {
  val effectiveSize = size.toContentSwitcherSize()
  val colors = MehTheme.colors
  val shape = RoundedCornerShape(4.dp)
  val borderColor = if (enabled) colors.borderInverse else colors.borderDisabled
  val iconSize = effectiveSize.contentSwitcherIconSize()
  val iconPadding = effectiveSize.contentSwitcherIconPadding()

  Row(
    modifier = modifier
      .height(effectiveSize.dp)
      .clip(shape)
      .border(width = 1.dp, color = borderColor, shape = shape),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    icons.forEachIndexed { index, icon ->
      val isSelected = index == selectedIndex
      val interactionSource =
        itemInteractionSources.getOrNull(index) ?: remember(index) { MutableInteractionSource() }
      val hovered by interactionSource.collectIsHoveredAsState()
      val pressed by interactionSource.collectIsPressedAsState()
      val focused by interactionSource.collectIsFocusedAsState()

      val backgroundColor =
        when {
          !enabled && isSelected -> colors.buttonDisabled
          !enabled -> Color.Transparent
          isSelected -> colors.layerSelectedInverse
          pressed -> colors.layerActive01
          hovered -> colors.layerHover01
          else -> Color.Transparent
        }
      val iconTint =
        when {
          !enabled && isSelected -> colors.iconOnColorDisabled
          !enabled -> colors.iconDisabled
          isSelected -> colors.iconInverse
          hovered -> colors.iconPrimary
          else -> colors.iconSecondary
        }

      if (index > 0) {
        val showDivider = !isSelected && (index - 1) != selectedIndex
        if (showDivider) {
          Spacer(
            modifier = Modifier
              .width(1.dp)
              .height(16.dp)
              .background(if (enabled) colors.borderSubtle01 else colors.borderDisabled),
          )
        }
      }

      Box(
        modifier = Modifier
          .fillMaxHeight()
          .background(backgroundColor)
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
          .semantics {
            selected = isSelected
            contentDescriptions.getOrNull(index)?.let { contentDescription = it }
          }
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            enabled = enabled,
            role = Role.Tab,
            onClick = { onOptionSelect(index) },
          )
          .padding(horizontal = iconPadding),
        contentAlignment = Alignment.Center,
      ) {
        Icon(
          image = icon,
          size = iconSize,
          tint = iconTint,
        )
      }
    }
  }
}
