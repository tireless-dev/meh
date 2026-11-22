// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.toggleableState
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ToggleSize
import dev.tireless.meh.theme.dp

@Immutable
private data class ResolvedToggleColors(
  val track: Color,
  val trackBorder: Color,
  val thumb: Color,
  val checkmark: Color,
  val topLabel: Color,
  val sideLabel: Color,
)

@Composable
fun Toggle(
  toggled: Boolean,
  onToggledChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  labelOff: String = "Off",
  labelOn: String = "On",
  enabled: Boolean = true,
  readOnly: Boolean = false,
  size: ToggleSize = ToggleSize.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val trackHeight = size.dp
  val trackWidth = if (size == ToggleSize.Default) spacing.spacing09 else spacing.spacing07

  val thumbProgress by animateFloatAsState(
    targetValue = if (toggled) 1f else 0f,
    label = "ToggleThumbProgress",
  )

  val resolvedColors = resolveToggleColors(
    colors = colors,
    toggled = toggled,
    enabled = enabled,
    readOnly = readOnly,
  )

  val sideText = if (toggled) labelOn else labelOff

  val a11yDescription =
    buildList {
      if (!label.isNullOrEmpty()) add(label)
      if (sideText.isNotEmpty()) add(sideText)
    }.joinToString(", ")

  val interactionModifier =
    if (enabled && readOnly) {
      Modifier
        .focusable(enabled = true, interactionSource = interactionSource)
        .semantics(mergeDescendants = true) {
          role = Role.Switch
          toggleableState = ToggleableState(toggled)
          if (a11yDescription.isNotEmpty()) {
            contentDescription = a11yDescription
          }
        }
    } else {
      Modifier
        .toggleable(
          value = toggled,
          enabled = enabled,
          role = Role.Switch,
          interactionSource = interactionSource,
          indication = null,
          onValueChange = onToggledChange,
        )
        .semantics {
          if (a11yDescription.isNotEmpty()) {
            contentDescription = a11yDescription
          }
        }
    }

  Column(modifier = modifier.then(interactionModifier)) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = resolvedColors.topLabel),
        modifier = Modifier.padding(bottom = spacing.spacing05),
      )
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
      Canvas(modifier = Modifier.size(width = trackWidth, height = trackHeight)) {
        drawToggleSwitch(
          size = size,
          toggled = toggled,
          thumbProgress = thumbProgress,
          readOnly = readOnly,
          showFocusRing = (focused || pressed) && enabled,
          focusColor = colors.focus,
          resolvedColors = resolvedColors,
        )
      }

      if (sideText.isNotEmpty()) {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        BasicText(
          text = sideText,
          style = typography.bodyCompact01.copy(color = resolvedColors.sideLabel),
        )
      }
    }
  }
}

private fun DrawScope.drawToggleSwitch(
  size: ToggleSize,
  toggled: Boolean,
  thumbProgress: Float,
  readOnly: Boolean,
  showFocusRing: Boolean,
  focusColor: Color,
  resolvedColors: ResolvedToggleColors,
) {
  if (showFocusRing) {
    val focusStroke = 2.dp.toPx()
    val focusGap = 1.dp.toPx()
    val expand = focusGap + focusStroke / 2f
    drawRoundRect(
      color = focusColor,
      topLeft = Offset(-expand, -expand),
      size = Size(this.size.width + expand * 2f, this.size.height + expand * 2f),
      cornerRadius = CornerRadius(this.size.height / 2f + expand),
      style = Stroke(width = focusStroke),
    )
  }

  val trackRadius = CornerRadius(this.size.height / 2f)
  if (resolvedColors.track != Color.Transparent) {
    drawRoundRect(
      color = resolvedColors.track,
      cornerRadius = trackRadius,
    )
  }

  if (resolvedColors.trackBorder != Color.Transparent) {
    val borderWidth = 1.dp.toPx()
    val halfBorder = borderWidth / 2f
    drawRoundRect(
      color = resolvedColors.trackBorder,
      topLeft = Offset(halfBorder, halfBorder),
      size = Size(this.size.width - borderWidth, this.size.height - borderWidth),
      cornerRadius = CornerRadius((this.size.height - borderWidth) / 2f),
      style = Stroke(width = borderWidth),
    )
  }

  val thumbDiameter = (if (size == ToggleSize.Default) 18.dp else 10.dp).toPx()
  val thumbInset = 3.dp.toPx()
  val thumbTravel = this.size.width - thumbDiameter - thumbInset * 2f
  val thumbLeft = thumbInset + thumbTravel * thumbProgress
  val thumbRadius = thumbDiameter / 2f

  drawCircle(
    color = resolvedColors.thumb,
    radius = thumbRadius,
    center = Offset(x = thumbLeft + thumbRadius, y = this.size.height / 2f),
  )

  if (size == ToggleSize.Small && toggled && !readOnly) {
    val dpPx = 1.dp.toPx()
    val checkLeft = thumbLeft + 2.dp.toPx()
    val checkTop = thumbInset + 3.dp.toPx()
    val checkPath =
      Path().apply {
        moveTo(checkLeft + 2.2f * dpPx, checkTop + 2.7f * dpPx)
        lineTo(checkLeft + 5f * dpPx, checkTop)
        lineTo(checkLeft + 6f * dpPx, checkTop + 1f * dpPx)
        lineTo(checkLeft + 2.2f * dpPx, checkTop + 5f * dpPx)
        lineTo(checkLeft, checkTop + 2.7f * dpPx)
        lineTo(checkLeft + 1f * dpPx, checkTop + 1.5f * dpPx)
        close()
      }
    drawPath(
      path = checkPath,
      color = resolvedColors.checkmark,
    )
  }
}

private fun resolveToggleColors(
  colors: Colors,
  toggled: Boolean,
  enabled: Boolean,
  readOnly: Boolean,
): ResolvedToggleColors = when {
  !enabled ->
    ResolvedToggleColors(
      track = colors.buttonDisabled,
      trackBorder = Color.Transparent,
      thumb = colors.iconOnColorDisabled,
      checkmark = colors.buttonDisabled,
      topLabel = colors.textDisabled,
      sideLabel = colors.textDisabled,
    )

  readOnly ->
    ResolvedToggleColors(
      track = Color.Transparent,
      trackBorder = colors.iconDisabled,
      thumb = colors.iconPrimary,
      checkmark = Color.Transparent,
      topLabel = colors.textSecondary,
      sideLabel = colors.textPrimary,
    )

  else ->
    ResolvedToggleColors(
      track = if (toggled) colors.supportSuccess else colors.toggleOff,
      trackBorder = Color.Transparent,
      thumb = colors.iconOnColor,
      checkmark = colors.supportSuccess,
      topLabel = colors.textSecondary,
      sideLabel = colors.textPrimary,
    )
}
