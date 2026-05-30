// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

enum class LoadingStatus {
  Active,
  Finished,
  Error,
}

@Composable
fun Loading(
  modifier: Modifier = Modifier,
  size: Dp = 88.dp,
  active: Boolean = true,
) {
  if (!active) return

  val infiniteTransition = rememberInfiniteTransition(label = "LoadingTransition")
  val rotation by
  infiniteTransition.animateFloat(
    initialValue = 0f,
    targetValue = 360f,
    animationSpec =
    infiniteRepeatable(
      animation = tween(1000, easing = LinearEasing),
      repeatMode = RepeatMode.Restart,
    ),
    label = "LoadingRotation",
  )

  val trackColor = MehTheme.colors.borderSubtle01
  val activeColor = MehTheme.colors.interactive

  Canvas(modifier = modifier.size(size)) {
    val strokeWidth = size.toPx() / 10
    // Background track
    drawCircle(
      color = trackColor,
      style = Stroke(width = strokeWidth),
    )
    // Active arc
    drawArc(
      color = activeColor,
      startAngle = rotation,
      sweepAngle = 270f,
      useCenter = false,
      style = Stroke(width = strokeWidth, cap = StrokeCap.Butt),
    )
  }
}

@Composable
fun InlineLoading(
  status: LoadingStatus,
  description: String,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    when (status) {
      LoadingStatus.Active -> {
        Loading(size = 16.dp, modifier = Modifier.size(16.dp))
      }
      LoadingStatus.Finished -> {
        Icon(
          image = Icons.CheckmarkFilled,
          size = IconSize.Small,
          tint = MehTheme.colors.supportSuccess,
        )
      }
      LoadingStatus.Error -> {
        Icon(
          image = Icons.ErrorFilled,
          size = IconSize.Small,
          tint = MehTheme.colors.supportError,
        )
      }
    }
    Spacer(Modifier.size(MehTheme.spacing.spacing04))
    Text(
      text = description,
      style = MehTheme.typography.bodyCompact01,
    )
  }
}
