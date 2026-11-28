// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import kotlin.math.abs
import kotlin.math.roundToInt

object SliderDefaults {
  val TrackHeight: Dp = 4.dp
  val ThumbSize: Dp = 14.dp
  val ActiveThumbSize: Dp = 20.dp
  val InputWidth: Dp = 64.dp
  val InputWithIconWidth: Dp = 80.dp
  val InputHeight: Dp = 40.dp
}

private fun formatSliderValue(value: Float): String = if (value % 1f == 0f) value.roundToInt().toString() else value.toString()

private fun snapValue(
  raw: Float,
  min: Float,
  max: Float,
  step: Float,
): Float {
  val clamped = raw.coerceIn(min, max)
  if (step <= 0f) return clamped
  val steps = ((clamped - min) / step).roundToInt()
  return (min + steps * step).coerceIn(min, max)
}

/**
 * Carbon Design System v11 Slider with interactive track/thumb, min/max range labels, optional
 * synchronized numeric input box, and focus/active/invalid/warning/read-only/disabled states.
 */
@Composable
fun Slider(
  value: Float,
  onValueChange: (Float) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  min: Float = 0f,
  max: Float = 100f,
  step: Float = 1f,
  minLabel: String? = null,
  maxLabel: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  hideTextInput: Boolean = false,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isPressed by interactionSource.collectIsPressedAsState()
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val range = (max - min).coerceAtLeast(0.0001f)
  val fraction = ((value - min) / range).coerceIn(0f, 1f)
  val labelColor = if (enabled) colors.textSecondary else colors.textDisabled
  val rangeTextColor = if (enabled) colors.textPrimary else colors.textDisabled
  val trackColor = if (enabled) colors.borderSubtle01 else colors.borderDisabled
  val filledTrackColor =
    when {
      !enabled -> colors.borderDisabled
      isFocused || isPressed -> colors.interactive
      else -> colors.borderInverse
    }
  val thumbColor =
    when {
      !enabled -> colors.borderDisabled
      isPressed -> colors.interactive
      else -> colors.iconPrimary
    }

  var trackWidthPx by remember { mutableIntStateOf(1) }

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = labelColor),
        modifier = Modifier.padding(bottom = spacing.spacing03),
      )
    }

    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      BasicText(
        text = minLabel ?: formatSliderValue(min),
        style = typography.bodyCompact01.copy(color = rangeTextColor),
      )

      Spacer(modifier = Modifier.width(spacing.spacing05))

      // Track + Thumb
      Box(
        modifier = Modifier
          .weight(1f)
          .height(SliderDefaults.InputHeight)
          .onSizeChanged { trackWidthPx = it.width.coerceAtLeast(1) }
          .then(
            if (isInteractive) {
              Modifier
                .pointerInput(min, max, step, trackWidthPx) {
                  detectTapGestures { offset ->
                    val newFraction = (offset.x / trackWidthPx).coerceIn(0f, 1f)
                    onValueChange(snapValue(min + newFraction * range, min, max, step))
                  }
                }
                .pointerInput(min, max, step, trackWidthPx) {
                  detectHorizontalDragGestures { change, _ ->
                    change.consume()
                    val newFraction = (change.position.x / trackWidthPx).coerceIn(0f, 1f)
                    onValueChange(snapValue(min + newFraction * range, min, max, step))
                  }
                }
            } else {
              Modifier
            },
          ),
        contentAlignment = Alignment.CenterStart,
      ) {
        Canvas(
          modifier = Modifier
            .fillMaxWidth()
            .height(SliderDefaults.InputHeight),
        ) {
          val centerY = size.height / 2f
          val trackHeightPx = SliderDefaults.TrackHeight.toPx()
          val thumbRadius =
            (if (isPressed && isInteractive) SliderDefaults.ActiveThumbSize else SliderDefaults.ThumbSize)
              .toPx() / 2f
          val usableWidth = (size.width - thumbRadius * 2f).coerceAtLeast(0f)
          val thumbX = thumbRadius + fraction * usableWidth

          // Unfilled track
          drawRect(
            color = trackColor,
            topLeft = Offset(0f, centerY - trackHeightPx / 2f),
            size = Size(size.width, trackHeightPx),
          )
          // Filled track
          drawRect(
            color = filledTrackColor,
            topLeft = Offset(0f, centerY - trackHeightPx / 2f),
            size = Size(thumbX, trackHeightPx),
          )
          // Focus ring
          if (isFocused && isInteractive) {
            drawCircle(
              color = colors.focus,
              radius = thumbRadius + 3.dp.toPx(),
              center = Offset(thumbX, centerY),
              style = Stroke(width = 2.dp.toPx()),
            )
          }
          // Thumb
          drawCircle(
            color = thumbColor,
            radius = thumbRadius,
            center = Offset(thumbX, centerY),
          )
        }
      }

      Spacer(modifier = Modifier.width(spacing.spacing05))

      BasicText(
        text = maxLabel ?: formatSliderValue(max),
        style = typography.bodyCompact01.copy(color = rangeTextColor),
      )

      if (!hideTextInput) {
        Spacer(modifier = Modifier.width(spacing.spacing05))
        SliderNumberBox(
          value = value,
          onValueChange = { parsed -> onValueChange(snapValue(parsed, min, max, step)) },
          enabled = enabled,
          readOnly = readOnly,
          isInvalid = isInvalid,
          isWarning = isWarning,
        )
      }
    }

    SliderValidationMessage(
      error = error,
      warning = warning,
      helper = helper,
      enabled = enabled,
      readOnly = readOnly,
    )
  }
}

/**
 * Carbon Design System v11 dual-thumb Range Slider with start and end numeric input boxes.
 */
@Composable
fun RangeSlider(
  value: ClosedFloatingPointRange<Float>,
  onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  min: Float = 0f,
  max: Float = 100f,
  step: Float = 1f,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  hideTextInput: Boolean = false,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val range = (max - min).coerceAtLeast(0.0001f)
  val startFraction = ((value.start - min) / range).coerceIn(0f, 1f)
  val endFraction = ((value.endInclusive - min) / range).coerceIn(startFraction, 1f)
  val labelColor = if (enabled) colors.textSecondary else colors.textDisabled
  val trackColor = if (enabled) colors.borderSubtle01 else colors.borderDisabled
  val filledTrackColor = if (enabled) colors.borderInverse else colors.borderDisabled
  val thumbColor = if (enabled) colors.iconPrimary else colors.borderDisabled

  var trackWidthPx by remember { mutableIntStateOf(1) }

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = labelColor),
        modifier = Modifier.padding(bottom = spacing.spacing03),
      )
    }

    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      if (!hideTextInput) {
        SliderNumberBox(
          value = value.start,
          onValueChange = { parsed ->
            val snapped = snapValue(parsed, min, value.endInclusive, step)
            onValueChange(snapped..value.endInclusive)
          },
          enabled = enabled,
          readOnly = readOnly,
          isInvalid = isInvalid,
          isWarning = false,
        )
        Spacer(modifier = Modifier.width(spacing.spacing05))
      }

      Box(
        modifier = Modifier
          .weight(1f)
          .height(SliderDefaults.InputHeight)
          .onSizeChanged { trackWidthPx = it.width.coerceAtLeast(1) }
          .then(
            if (isInteractive) {
              Modifier.pointerInput(value, min, max, step, trackWidthPx) {
                detectTapGestures { offset ->
                  val tapped = snapValue(min + (offset.x / trackWidthPx).coerceIn(0f, 1f) * range, min, max, step)
                  if (abs(tapped - value.start) <= abs(tapped - value.endInclusive)) {
                    onValueChange(tapped.coerceAtMost(value.endInclusive)..value.endInclusive)
                  } else {
                    onValueChange(value.start..tapped.coerceAtLeast(value.start))
                  }
                }
              }
            } else {
              Modifier
            },
          ),
        contentAlignment = Alignment.CenterStart,
      ) {
        Canvas(
          modifier = Modifier
            .fillMaxWidth()
            .height(SliderDefaults.InputHeight),
        ) {
          val centerY = size.height / 2f
          val trackHeightPx = SliderDefaults.TrackHeight.toPx()
          val thumbRadius = SliderDefaults.ThumbSize.toPx() / 2f
          val usableWidth = (size.width - thumbRadius * 2f).coerceAtLeast(0f)
          val startX = thumbRadius + startFraction * usableWidth
          val endX = thumbRadius + endFraction * usableWidth

          drawRect(
            color = trackColor,
            topLeft = Offset(0f, centerY - trackHeightPx / 2f),
            size = Size(size.width, trackHeightPx),
          )
          drawRect(
            color = filledTrackColor,
            topLeft = Offset(startX, centerY - trackHeightPx / 2f),
            size = Size((endX - startX).coerceAtLeast(0f), trackHeightPx),
          )
          drawCircle(
            color = thumbColor,
            radius = thumbRadius,
            center = Offset(startX, centerY),
          )
          drawCircle(
            color = thumbColor,
            radius = thumbRadius,
            center = Offset(endX, centerY),
          )
        }
      }

      if (!hideTextInput) {
        Spacer(modifier = Modifier.width(spacing.spacing05))
        SliderNumberBox(
          value = value.endInclusive,
          onValueChange = { parsed ->
            val snapped = snapValue(parsed, value.start, max, step)
            onValueChange(value.start..snapped)
          },
          enabled = enabled,
          readOnly = readOnly,
          isInvalid = isInvalid,
          isWarning = isWarning,
        )
      }
    }

    SliderValidationMessage(
      error = error,
      warning = warning,
      helper = helper,
      enabled = enabled,
      readOnly = readOnly,
    )
  }
}

@Composable
private fun SliderNumberBox(
  value: Float,
  onValueChange: (Float) -> Unit,
  enabled: Boolean,
  readOnly: Boolean,
  isInvalid: Boolean,
  isWarning: Boolean,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val inputInteractionSource = remember { MutableInteractionSource() }
  val isFocused by inputInteractionSource.collectIsFocusedAsState()

  val background =
    when {
      !enabled -> colors.field01
      readOnly -> Color.Transparent
      else -> colors.field01
    }
  val outlineColor =
    when {
      !enabled -> null
      isFocused -> colors.focus
      isInvalid -> colors.supportError
      else -> null
    }
  val bottomBorderColor =
    when {
      !enabled || outlineColor != null -> null
      readOnly -> colors.borderSubtle01
      else -> colors.borderStrong01
    }
  val textColor = if (enabled) colors.textPrimary else colors.textDisabled
  val boxWidth =
    if (isInvalid || isWarning) SliderDefaults.InputWithIconWidth else SliderDefaults.InputWidth

  Row(
    modifier = Modifier
      .width(boxWidth)
      .height(SliderDefaults.InputHeight)
      .background(background)
      .drawBehind {
        bottomBorderColor?.let { borderColor ->
          val strokeWidth = 1.dp.toPx()
          val y = size.height - strokeWidth / 2f
          drawLine(
            color = borderColor,
            start = Offset(0f, y),
            end = Offset(size.width, y),
            strokeWidth = strokeWidth,
          )
        }
        outlineColor?.let { outline ->
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = outline,
            topLeft = Offset(half, half),
            size = Size(size.width - strokeWidth, size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .padding(horizontal = spacing.spacing04),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    BasicTextField(
      value = formatSliderValue(value),
      onValueChange = { raw -> raw.toFloatOrNull()?.let(onValueChange) },
      modifier = Modifier.weight(1f),
      enabled = enabled,
      readOnly = readOnly,
      textStyle = typography.bodyCompact01.copy(color = textColor),
      cursorBrush = SolidColor(colors.textPrimary),
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
      interactionSource = inputInteractionSource,
      singleLine = true,
    )
    if (isInvalid) {
      Icon(
        image = Icons.WarningFilled,
        size = IconSize.Small,
        tint = colors.supportError,
      )
    } else if (isWarning) {
      Icon(
        image = Icons.WarningAltFilled,
        size = IconSize.Small,
        tint = colors.supportWarning,
      )
    }
  }
}

@Composable
private fun SliderValidationMessage(
  error: String?,
  warning: String?,
  helper: String?,
  enabled: Boolean,
  readOnly: Boolean,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val message: String?
  val messageColor: Color
  when {
    isInvalid -> {
      message = error
      messageColor = colors.textError
    }

    isWarning -> {
      message = warning
      messageColor = colors.textPrimary
    }

    helper != null -> {
      message = helper
      messageColor = if (enabled) colors.textHelper else colors.textDisabled
    }

    else -> return
  }

  BasicText(
    text = message,
    style = typography.label01.copy(color = messageColor),
    modifier = Modifier.padding(top = spacing.spacing02),
  )
}
