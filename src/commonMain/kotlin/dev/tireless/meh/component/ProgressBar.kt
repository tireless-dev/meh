// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

@Composable
fun ProgressBar(
  progress: Float,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  indeterminate: Boolean = false,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      Row(verticalAlignment = Alignment.Bottom) {
        FormLabel(text = label)
        if (!indeterminate) {
          Spacer(Modifier.weight(1f))
          Text(
            text = "${(progress * 100).toInt()}%",
            style = MehTheme.typography.label01,
          )
        }
      }
      Spacer(Modifier.size(MehTheme.spacing.spacing03))
    }

    Box(
      modifier =
      Modifier
        .fillMaxWidth()
        .height(4.dp)
        .background(MehTheme.colors.borderSubtle01),
    ) {
      if (indeterminate) {
        val infiniteTransition = rememberInfiniteTransition(label = "ProgressTransition")
        val translation by
          infiniteTransition.animateFloat(
            initialValue = -1f,
            targetValue = 1f,
            animationSpec =
            infiniteRepeatable(
              animation = tween(1500, easing = LinearEasing),
              repeatMode = RepeatMode.Restart,
            ),
            label = "ProgressTranslation",
          )

        Box(
          modifier =
          Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight()
            .align(Alignment.CenterStart)
            .offset(x = (translation * 200).dp) // simplistic approximation
            .background(MehTheme.colors.interactive),
        )
      } else {
        Box(
          modifier =
          Modifier
            .fillMaxWidth(progress.coerceIn(0f, 1f))
            .fillMaxHeight()
            .background(MehTheme.colors.interactive),
        )
      }
    }

    if (helper != null) {
      Spacer(Modifier.size(MehTheme.spacing.spacing02))
      FormHelper(text = helper)
    }
  }
}
