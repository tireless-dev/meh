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
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.LiveRegionMode
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.liveRegion
import androidx.compose.ui.semantics.semantics
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.LoadingSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp
import kotlinx.coroutines.delay

enum class LoadingStatus {
  Inactive,
  Active,
  Finished,
  Error,
}

@Composable
fun Loading(
  modifier: Modifier = Modifier,
  size: LoadingSize = LoadingSize.Large,
  active: Boolean = true,
  withOverlay: Boolean = false,
  description: String = "Loading",
) {
  if (!active) return

  val colors = MehTheme.colors
  val infiniteTransition = rememberInfiniteTransition(label = "LoadingTransition")
  val rotation by
    infiniteTransition.animateFloat(
      initialValue = 0f,
      targetValue = 360f,
      animationSpec =
      infiniteRepeatable(
        animation = tween(durationMillis = 690, easing = LinearEasing),
        repeatMode = RepeatMode.Restart,
      ),
      label = "LoadingRotation",
    )

  val activeColor = colors.interactive
  val trackColor = colors.layerAccent01
  val indicatorModifier =
    Modifier
      .size(size.dp)
      .semantics {
        contentDescription = description
        liveRegion = LiveRegionMode.Assertive
      }

  val spinner: @Composable (Modifier) -> Unit = { spinnerModifier ->
    Canvas(modifier = spinnerModifier) {
      drawLoadingSpinner(
        size = size,
        rotation = rotation,
        activeColor = activeColor,
        trackColor = trackColor,
      )
    }
  }

  if (withOverlay) {
    Box(
      modifier =
      modifier
        .fillMaxSize()
        .background(colors.overlay)
        .clickable(
          interactionSource = remember { MutableInteractionSource() },
          indication = null,
          onClick = {},
        ),
      contentAlignment = Alignment.Center,
    ) {
      spinner(indicatorModifier)
    }
  } else {
    spinner(modifier.then(indicatorModifier))
  }
}

private fun DrawScope.drawLoadingSpinner(
  size: LoadingSize,
  rotation: Float,
  activeColor: Color,
  trackColor: Color,
) {
  val diameter = this.size.minDimension
  val isSmall = size == LoadingSize.Small
  val strokeWidth = diameter * if (isSmall) 0.16f else 0.10f
  val radius = diameter * if (isSmall) 0.42f else 0.44f
  val arcDiameter = radius * 2f
  val topLeft =
    Offset(
      x = (this.size.width - arcDiameter) / 2f,
      y = (this.size.height - arcDiameter) / 2f,
    )
  val arcSize = Size(arcDiameter, arcDiameter)

  if (isSmall) {
    drawCircle(
      color = trackColor,
      radius = radius,
      style = Stroke(width = strokeWidth),
    )
  }

  val sweepAngle = if (isSmall) 0.48f * 360f else 0.81f * 360f
  drawArc(
    color = activeColor,
    startAngle = rotation - 90f,
    sweepAngle = sweepAngle,
    useCenter = false,
    topLeft = topLeft,
    size = arcSize,
    style = Stroke(width = strokeWidth, cap = StrokeCap.Butt),
  )
}

@Composable
fun InlineLoading(
  status: LoadingStatus,
  modifier: Modifier = Modifier,
  description: String? = null,
  iconDescription: String? = null,
  onSuccess: (() -> Unit)? = null,
  successDelayMillis: Long = 1500L,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  LaunchedEffect(status, onSuccess, successDelayMillis) {
    if (status == LoadingStatus.Finished && onSuccess != null) {
      delay(successDelayMillis)
      onSuccess()
    }
  }

  val semanticsModifier =
    if (status != LoadingStatus.Inactive) {
      Modifier.semantics(mergeDescendants = true) {
        liveRegion = LiveRegionMode.Assertive
      }
    } else {
      Modifier
    }

  Row(
    modifier =
    modifier
      .defaultMinSize(minHeight = ControlSize.Small.dp)
      .then(semanticsModifier),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    when (status) {
      LoadingStatus.Inactive -> Unit

      LoadingStatus.Active -> {
        Loading(
          size = LoadingSize.Small,
          description = iconDescription ?: "Loading",
        )
      }

      LoadingStatus.Finished -> {
        Icon(
          image = Icons.CheckmarkFilled,
          size = IconSize.Small,
          tint = colors.supportSuccess,
          contentDescription = iconDescription ?: "Finished",
        )
      }

      LoadingStatus.Error -> {
        Icon(
          image = Icons.ErrorFilled,
          size = IconSize.Small,
          tint = colors.supportError,
          contentDescription = iconDescription ?: "Error",
        )
      }
    }

    if (status != LoadingStatus.Inactive && description != null) {
      Spacer(modifier = Modifier.width(spacing.spacing03))
    }

    if (description != null) {
      BasicText(
        text = description,
        style = typography.bodyCompact01.copy(color = colors.textSecondary),
      )
    }
  }
}
