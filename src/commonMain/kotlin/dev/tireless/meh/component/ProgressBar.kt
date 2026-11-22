// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.semantics.ProgressBarRangeInfo
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.progressBarRangeInfo
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ProgressBarSize
import dev.tireless.meh.theme.dp

enum class ProgressBarStatus {
  Active,
  Finished,
  Error,
}

enum class ProgressBarType {
  Default,
  Inline,
  Indented,
}

@Composable
fun ProgressBar(
  modifier: Modifier = Modifier,
  label: String? = null,
  value: Float? = null,
  max: Float = 100f,
  helperText: String? = null,
  size: ProgressBarSize = ProgressBarSize.Big,
  status: ProgressBarStatus = ProgressBarStatus.Active,
  type: ProgressBarType = ProgressBarType.Default,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val isFinished = status == ProgressBarStatus.Finished
  val isError = status == ProgressBarStatus.Error
  val indeterminate = !isFinished && !isError && value == null

  val safeMax = max.coerceAtLeast(1f)
  val cappedValue =
    when {
      isError -> 0f
      isFinished -> safeMax
      value != null -> value.coerceIn(0f, safeMax)
      else -> null
    }

  val targetFraction =
    when {
      isFinished || isError -> 1f
      cappedValue != null -> (cappedValue / safeMax).coerceIn(0f, 1f)
      else -> 0f
    }

  val animatedFraction by animateFloatAsState(
    targetValue = targetFraction,
    animationSpec = tween(durationMillis = 110),
    label = "ProgressBarFraction",
  )

  val indeterminateProgress =
    if (indeterminate) {
      val infiniteTransition = rememberInfiniteTransition(label = "ProgressBarIndeterminate")
      val progress by
        infiniteTransition.animateFloat(
          initialValue = 0f,
          targetValue = 1f,
          animationSpec =
          infiniteRepeatable(
            animation = tween(durationMillis = 1400, easing = LinearEasing),
            repeatMode = RepeatMode.Restart,
          ),
          label = "ProgressBarSweep",
        )
      progress
    } else {
      0f
    }

  val barColor =
    when (status) {
      ProgressBarStatus.Active -> colors.borderInteractive
      ProgressBarStatus.Finished -> colors.supportSuccess
      ProgressBarStatus.Error -> colors.supportError
    }
  val trackColor = colors.borderSubtle01
  val helperColor = if (isError) colors.textError else colors.textHelper

  val trackSemantics =
    Modifier.semantics {
      if (label != null) {
        contentDescription = label
      }
      if (isError) {
        error(helperText ?: "Error")
      }
      progressBarRangeInfo =
        if (indeterminate) {
          ProgressBarRangeInfo.Indeterminate
        } else {
          ProgressBarRangeInfo(
            current = cappedValue ?: 0f,
            range = 0f..safeMax,
          )
        }
    }

  val track: @Composable (Modifier) -> Unit = { trackModifier ->
    Canvas(
      modifier =
      trackModifier
        .defaultMinSize(minWidth = spacing.spacing09)
        .height(size.dp)
        .clipToBounds()
        .then(trackSemantics),
    ) {
      drawProgressTrack(
        trackColor = trackColor,
        barColor = barColor,
        indeterminate = indeterminate,
        fraction = animatedFraction,
        indeterminateProgress = indeterminateProgress,
      )
    }
  }

  val statusIcon: (@Composable () -> Unit)? =
    when (status) {
      ProgressBarStatus.Finished -> {
        {
          Icon(
            image = Icons.CheckmarkFilled,
            size = IconSize.Small,
            tint = colors.supportSuccess,
          )
        }
      }

      ProgressBarStatus.Error -> {
        {
          Icon(
            image = Icons.ErrorFilled,
            size = IconSize.Small,
            tint = colors.supportError,
          )
        }
      }

      ProgressBarStatus.Active -> null
    }

  if (type == ProgressBarType.Inline) {
    val hideInlineTrack = isFinished || isError
    Row(
      modifier = modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      if (label != null || statusIcon != null) {
        Row(
          modifier =
          if (!hideInlineTrack) {
            Modifier.padding(end = spacing.spacing05)
          } else {
            Modifier
          },
          verticalAlignment = Alignment.CenterVertically,
        ) {
          if (label != null) {
            BasicText(
              text = label,
              maxLines = 1,
              overflow = TextOverflow.Ellipsis,
              style = typography.bodyCompact01.copy(color = colors.textPrimary),
              modifier = Modifier.weight(1f, fill = false),
            )
          }
          if (statusIcon != null) {
            if (label != null) {
              Spacer(modifier = Modifier.width(spacing.spacing05))
            }
            statusIcon()
          }
        }
      }

      if (!hideInlineTrack) {
        track(Modifier.weight(1f))
      }
    }
  } else {
    val horizontalInset =
      if (type == ProgressBarType.Indented) spacing.spacing05 else spacing.spacing00

    Column(modifier = modifier.fillMaxWidth()) {
      if (label != null || statusIcon != null) {
        Row(
          modifier =
          Modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalInset)
            .padding(bottom = spacing.spacing03),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically,
        ) {
          if (label != null) {
            BasicText(
              text = label,
              maxLines = 1,
              overflow = TextOverflow.Ellipsis,
              style = typography.bodyCompact01.copy(color = colors.textPrimary),
              modifier = Modifier.weight(1f),
            )
          } else {
            Spacer(modifier = Modifier.weight(1f))
          }

          if (statusIcon != null) {
            Spacer(modifier = Modifier.width(spacing.spacing05))
            statusIcon()
          }
        }
      }

      track(Modifier.fillMaxWidth())

      if (helperText != null) {
        BasicText(
          text = helperText,
          style = typography.label01.copy(color = helperColor),
          modifier =
          Modifier
            .padding(horizontal = horizontalInset)
            .padding(top = spacing.spacing03),
        )
      }
    }
  }
}

private fun DrawScope.drawProgressTrack(
  trackColor: Color,
  barColor: Color,
  indeterminate: Boolean,
  fraction: Float,
  indeterminateProgress: Float,
) {
  drawRect(color = trackColor)

  if (indeterminate) {
    val barWidth = size.width * 0.25f
    val phase = (indeterminateProgress + 0.35f) % 1f
    val sweepFraction = (phase / 0.8f).coerceAtMost(1f)
    val startX = -barWidth + (size.width + barWidth * 1.2f) * sweepFraction
    drawRect(
      color = barColor,
      topLeft = Offset(x = startX, y = 0f),
      size = Size(width = barWidth, height = size.height),
    )
  } else if (fraction > 0f) {
    drawRect(
      color = barColor,
      size = Size(width = size.width * fraction, height = size.height),
    )
  }
}
