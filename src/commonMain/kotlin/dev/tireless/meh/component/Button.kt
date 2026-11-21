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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Tone
import dev.tireless.meh.theme.dp

sealed interface ButtonKind {
  data object Primary : ButtonKind
  data object Secondary : ButtonKind
  data object Tertiary : ButtonKind
  data object Ghost : ButtonKind

  sealed interface Danger : ButtonKind {
    data object Primary : Danger
    data object Tertiary : Danger
    data object Ghost : Danger
  }
}

@Composable
fun Button(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  kind: ButtonKind = ButtonKind.Primary,
  size: ControlSize = ControlSize.Large,
  expressive: Boolean = MehTheme.tone == Tone.Expressive,
  icon: ImageVector? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val isActive by interactionSource.collectIsPressedAsState()
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isHovered by interactionSource.collectIsHoveredAsState()
  val isDisabled = !enabled

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val isFilled =
    kind == ButtonKind.Primary || kind == ButtonKind.Secondary || kind == ButtonKind.Danger.Primary
  val isGhost = kind == ButtonKind.Ghost || kind == ButtonKind.Danger.Ghost
  val effectiveSize = if (size == ControlSize.Unspecified) ControlSize.Large else size
  val isExpressive = expressive && effectiveSize == ControlSize.Large
  val isTall = effectiveSize == ControlSize.XLarge || effectiveSize == ControlSize.XXLarge

  val labelColor = if (isDisabled) {
    if (isFilled) colors.textOnColorDisabled else colors.textDisabled
  } else {
    when (kind) {
      ButtonKind.Primary, ButtonKind.Secondary, ButtonKind.Danger.Primary -> colors.textOnColor
      ButtonKind.Tertiary -> if (isHovered || isActive || isFocused) colors.textInverse else colors.buttonTertiary
      ButtonKind.Ghost -> if (isHovered || isActive) colors.linkPrimaryHover else colors.linkPrimary
      ButtonKind.Danger.Tertiary -> if (isHovered || isActive || isFocused) colors.textOnColor else colors.buttonDangerSecondary
      ButtonKind.Danger.Ghost -> if (isHovered || isActive) colors.textOnColor else colors.buttonDangerSecondary
    }
  }
  val iconColor = if (isDisabled) {
    if (isFilled) colors.iconOnColorDisabled else colors.iconDisabled
  } else {
    when (kind) {
      ButtonKind.Primary, ButtonKind.Secondary, ButtonKind.Danger.Primary -> colors.iconOnColor
      ButtonKind.Tertiary -> if (isHovered || isActive || isFocused) colors.iconInverse else colors.buttonTertiary
      ButtonKind.Ghost -> if (isHovered || isActive) colors.linkPrimaryHover else colors.linkPrimary
      ButtonKind.Danger.Tertiary -> if (isHovered || isActive || isFocused) colors.iconOnColor else colors.buttonDangerSecondary
      ButtonKind.Danger.Ghost -> if (isHovered || isActive) colors.iconOnColor else colors.buttonDangerSecondary
    }
  }
  val containerColor = if (isDisabled) {
    if (isFilled) colors.buttonDisabled else Color.Transparent
  } else {
    when (kind) {
      ButtonKind.Primary -> when {
        isActive -> colors.buttonPrimaryActive
        isHovered -> colors.buttonPrimaryHover
        else -> colors.buttonPrimary
      }

      ButtonKind.Secondary -> when {
        isActive -> colors.buttonSecondaryActive
        isHovered -> colors.buttonSecondaryHover
        else -> colors.buttonSecondary
      }

      ButtonKind.Tertiary -> when {
        isActive -> colors.buttonTertiaryActive
        isHovered -> colors.buttonTertiaryHover
        isFocused -> colors.buttonTertiary
        else -> Color.Transparent
      }

      ButtonKind.Ghost -> when {
        isActive -> colors.backgroundActive
        isHovered -> colors.backgroundHover
        else -> Color.Transparent
      }

      is ButtonKind.Danger -> when {
        isActive -> colors.buttonDangerActive
        isHovered -> colors.buttonDangerHover
        kind == ButtonKind.Danger.Primary || (kind == ButtonKind.Danger.Tertiary && isFocused) -> colors.buttonDangerPrimary
        else -> Color.Transparent
      }
    }
  }
  val containerBorderColor = when {
    isFocused && enabled -> Color.Transparent

    kind == ButtonKind.Tertiary || kind == ButtonKind.Danger.Tertiary -> when {
      isDisabled -> colors.buttonDisabled
      isActive || isHovered -> Color.Transparent
      kind == ButtonKind.Tertiary -> colors.buttonTertiary
      else -> colors.buttonDangerSecondary
    }

    else -> Color.Transparent
  }

  val labelStyle = if (isExpressive) MehTheme.typography.bodyCompact02 else MehTheme.typography.bodyCompact01
  val iconSize = if (isExpressive) IconSize.Expressive else IconSize.Small
  val endPadding = if (isGhost || icon != null) spacing.spacing05 else spacing.spacing10
  val iconGap = if (isGhost) spacing.spacing03 else spacing.spacing07
  val verticalPadding = when (effectiveSize) {
    ControlSize.XSmall -> 3.dp
    ControlSize.Small -> 7.dp
    ControlSize.Medium -> 11.dp
    ControlSize.Large -> if (isExpressive) 13.dp else 15.dp
    else -> 15.dp
  }

  Row(
    modifier =
    modifier
      .defaultMinSize(minHeight = effectiveSize.dp)
      .background(containerColor)
      .then(
        when {
          isFocused && enabled -> Modifier.focusBorder(
            focusColor = colors.focus,
            focusInsetColor = colors.focusInset.takeIf { containerColor != Color.Transparent },
          )

          containerBorderColor != Color.Transparent -> Modifier.border(
            width = 1.dp,
            color = containerBorderColor,
          )

          else -> Modifier
        },
      )
      .clickable(
        enabled = enabled,
        onClick = onClick,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = null,
      )
      .padding(
        start = spacing.spacing05,
        end = endPadding,
        top = verticalPadding,
        bottom = verticalPadding,
      ),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.Top,
  ) {
    BasicText(
      text = text,
      style = labelStyle.copy(color = labelColor),
      modifier = Modifier.weight(1f, fill = false),
    )
    if (icon != null) {
      Icon(
        image = icon,
        size = iconSize,
        tint = iconColor,
        modifier =
        if (isGhost && !isTall) {
          Modifier.align(Alignment.CenterVertically).padding(start = iconGap)
        } else {
          Modifier.padding(start = iconGap, top = 1.dp)
        },
      )
    }
  }
}

private fun Modifier.focusBorder(
  focusColor: Color,
  focusInsetColor: Color?,
): Modifier = drawBehind {
  val outerPx = 2.dp.toPx()
  drawRect(
    color = focusColor,
    topLeft = Offset(outerPx / 2f, outerPx / 2f),
    size = Size(size.width - outerPx, size.height - outerPx),
    style = Stroke(width = outerPx),
  )
  if (focusInsetColor != null) {
    val insetPx = 1.dp.toPx()
    val insetOffset = outerPx + insetPx / 2f
    drawRect(
      color = focusInsetColor,
      topLeft = Offset(insetOffset, insetOffset),
      size = Size(size.width - insetOffset * 2f, size.height - insetOffset * 2f),
      style = Stroke(width = insetPx),
    )
  }
}
