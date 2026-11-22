// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.LinkSize
import dev.tireless.meh.theme.MehTheme

@Immutable
private data class ResolvedLinkColors(
  val text: Color,
  val icon: Color,
)

@Composable
fun Link(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  inline: Boolean = false,
  visited: Boolean = false,
  size: LinkSize = LinkSize.Medium,
  icon: ImageVector? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val resolvedColors =
    resolveLinkColors(
      colors = colors,
      enabled = enabled,
      visited = visited,
      hovered = hovered,
      pressed = pressed,
    )

  val textStyle =
    when (size) {
      LinkSize.Small -> typography.label01
      LinkSize.Medium -> typography.bodyCompact01
      LinkSize.Large -> typography.bodyCompact02
    }

  val underline =
    inline || (enabled && (hovered || focused || pressed))

  val showOutline = enabled && (focused || pressed)
  val focusColor = colors.focus

  val outlineModifier =
    if (showOutline) {
      Modifier.drawBehind {
        val strokeWidth = 1.dp.toPx()
        val halfStroke = strokeWidth / 2f
        drawRect(
          color = focusColor,
          topLeft = Offset(halfStroke, halfStroke),
          size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
          style = Stroke(width = strokeWidth),
        )
      }
    } else {
      Modifier
    }

  Row(
    modifier =
    modifier
      .then(outlineModifier)
      .clickable(
        enabled = enabled,
        interactionSource = interactionSource,
        indication = null,
        onClick = onClick,
      ),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    BasicText(
      text = text,
      style =
      textStyle.copy(
        color = resolvedColors.text,
        textDecoration = if (underline) TextDecoration.Underline else TextDecoration.None,
      ),
    )

    if (!inline && icon != null) {
      Spacer(modifier = Modifier.width(spacing.spacing03))
      Icon(
        image = icon,
        size = if (size == LinkSize.Large) IconSize.Expressive else IconSize.Small,
        tint = resolvedColors.icon,
      )
    }
  }
}

private fun resolveLinkColors(
  colors: Colors,
  enabled: Boolean,
  visited: Boolean,
  hovered: Boolean,
  pressed: Boolean,
): ResolvedLinkColors = when {
  !enabled ->
    ResolvedLinkColors(
      text = colors.textDisabled,
      icon = colors.iconDisabled,
    )

  pressed ->
    ResolvedLinkColors(
      text = colors.linkPrimary,
      icon = colors.linkPrimary,
    )

  hovered ->
    ResolvedLinkColors(
      text = colors.linkPrimaryHover,
      icon = colors.linkPrimaryHover,
    )

  visited ->
    ResolvedLinkColors(
      text = colors.linkVisited,
      icon = colors.linkVisited,
    )

  else ->
    ResolvedLinkColors(
      text = colors.linkPrimary,
      icon = colors.linkPrimary,
    )
}
