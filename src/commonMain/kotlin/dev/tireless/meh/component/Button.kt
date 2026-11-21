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
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
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
  val active by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val hovered by interactionSource.collectIsHoveredAsState()

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val ghost = kind == ButtonKind.Ghost || kind == ButtonKind.Danger.Ghost
  val effectiveSize = if (size == ControlSize.Unspecified) ControlSize.Large else size
  val effectiveExpressive = expressive && effectiveSize == ControlSize.Large
  val tall = effectiveSize == ControlSize.XLarge || effectiveSize == ControlSize.XXLarge

  val buttonColors = resolveButtonColors(
    kind = kind,
    colors = colors,
    enabled = enabled,
    hovered = hovered,
    active = active,
    focused = focused,
  )

  val labelStyle = if (effectiveExpressive) MehTheme.typography.bodyCompact02 else MehTheme.typography.bodyCompact01
  val iconSize = if (effectiveExpressive) IconSize.Expressive else IconSize.Small
  val endPadding = if (ghost || icon != null) spacing.spacing05 else spacing.spacing10
  val iconGap = if (ghost) spacing.spacing03 else spacing.spacing07
  val verticalPadding = when (effectiveSize) {
    ControlSize.XSmall -> 3.dp
    ControlSize.Small -> 7.dp
    ControlSize.Medium -> 11.dp
    ControlSize.Large -> if (effectiveExpressive) 13.dp else 15.dp
    else -> 15.dp
  }

  Row(
    modifier =
    modifier
      .defaultMinSize(minHeight = effectiveSize.dp)
      .background(buttonColors.container)
      .then(
        when {
          focused && enabled -> Modifier.focusBorder(
            focusColor = colors.focus,
            focusInsetColor = colors.focusInset.takeIf { buttonColors.container != Color.Transparent },
          )

          buttonColors.border != Color.Transparent -> Modifier.border(
            width = 1.dp,
            color = buttonColors.border,
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
      style = labelStyle.copy(color = buttonColors.label),
      modifier = Modifier.weight(1f, fill = false),
    )
    if (icon != null) {
      Icon(
        image = icon,
        size = iconSize,
        tint = buttonColors.icon,
        modifier =
        if (ghost && !tall) {
          Modifier.align(Alignment.CenterVertically).padding(start = iconGap)
        } else {
          Modifier.padding(start = iconGap, top = 1.dp)
        },
      )
    }
  }
}

@Immutable
private data class ButtonColors(
  val label: Color,
  val icon: Color,
  val container: Color,
  val border: Color = Color.Transparent,
)

private fun resolveButtonColors(
  kind: ButtonKind,
  colors: Colors,
  enabled: Boolean,
  hovered: Boolean,
  active: Boolean,
  focused: Boolean,
): ButtonColors {
  if (!enabled) {
    return when (kind) {
      ButtonKind.Primary, ButtonKind.Secondary, ButtonKind.Danger.Primary -> ButtonColors(
        label = colors.textOnColorDisabled,
        icon = colors.iconOnColorDisabled,
        container = colors.buttonDisabled,
      )

      ButtonKind.Tertiary, ButtonKind.Danger.Tertiary -> ButtonColors(
        label = colors.textDisabled,
        icon = colors.iconDisabled,
        container = Color.Transparent,
        border = colors.buttonDisabled,
      )

      ButtonKind.Ghost, ButtonKind.Danger.Ghost -> ButtonColors(
        label = colors.textDisabled,
        icon = colors.iconDisabled,
        container = Color.Transparent,
      )
    }
  }

  return when (kind) {
    ButtonKind.Primary -> ButtonColors(
      label = colors.textOnColor,
      icon = colors.iconOnColor,
      container = when {
        active -> colors.buttonPrimaryActive
        hovered -> colors.buttonPrimaryHover
        else -> colors.buttonPrimary
      },
    )

    ButtonKind.Secondary -> ButtonColors(
      label = colors.textOnColor,
      icon = colors.iconOnColor,
      container = when {
        active -> colors.buttonSecondaryActive
        hovered -> colors.buttonSecondaryHover
        else -> colors.buttonSecondary
      },
    )

    ButtonKind.Tertiary -> {
      val filled = hovered || active || focused
      ButtonColors(
        label = if (filled) colors.textInverse else colors.buttonTertiary,
        icon = if (filled) colors.iconInverse else colors.buttonTertiary,
        container = when {
          active -> colors.buttonTertiaryActive
          hovered -> colors.buttonTertiaryHover
          focused -> colors.buttonTertiary
          else -> Color.Transparent
        },
        border = if (filled) Color.Transparent else colors.buttonTertiary,
      )
    }

    ButtonKind.Ghost -> {
      val content = if (hovered || active) colors.linkPrimaryHover else colors.linkPrimary
      ButtonColors(
        label = content,
        icon = content,
        container = when {
          active -> colors.backgroundActive
          hovered -> colors.backgroundHover
          else -> Color.Transparent
        },
      )
    }

    is ButtonKind.Danger -> {
      val filled =
        kind == ButtonKind.Danger.Primary ||
          hovered ||
          active ||
          (kind == ButtonKind.Danger.Tertiary && focused)
      ButtonColors(
        label = if (filled) colors.textOnColor else colors.buttonDangerSecondary,
        icon = if (filled) colors.iconOnColor else colors.buttonDangerSecondary,
        container = when {
          active -> colors.buttonDangerActive
          hovered -> colors.buttonDangerHover
          filled -> colors.buttonDangerPrimary
          else -> Color.Transparent
        },
        border = if (!filled && kind == ButtonKind.Danger.Tertiary) {
          colors.buttonDangerSecondary
        } else {
          Color.Transparent
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
  drawInsetBorder(color = focusColor, strokeWidthPx = outerPx)
  if (focusInsetColor != null) {
    drawInsetBorder(
      color = focusInsetColor,
      strokeWidthPx = 1.dp.toPx(),
      insetPx = outerPx,
    )
  }
}

private fun DrawScope.drawInsetBorder(
  color: Color,
  strokeWidthPx: Float,
  insetPx: Float = 0f,
) {
  val offset = insetPx + strokeWidthPx / 2f
  drawRect(
    color = color,
    topLeft = Offset(offset, offset),
    size = Size(size.width - offset * 2f, size.height - offset * 2f),
    style = Stroke(width = strokeWidthPx),
  )
}
