// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

@Composable
fun Slider(
  value: Float,
  onValueChange: (Float) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  min: Float = 0f,
  max: Float = 100f,
  enabled: Boolean = true,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      Row(verticalAlignment = Alignment.Bottom) {
        FormLabel(text = label, enabled = enabled)
        Spacer(Modifier.weight(1f))
        Text(
          text = value.toInt().toString(),
          style = MehTheme.typography.label01,
          enabled = enabled,
        )
      }
      Spacer(Modifier.size(MehTheme.spacing.spacing03))
    }

    // Simplified slider visual
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(40.dp),
      contentAlignment = Alignment.CenterStart,
    ) {
      // Track
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(4.dp)
          .background(MehTheme.colors.borderSubtle01),
      )
      // Active Track
      Box(
        modifier = Modifier
          .fillMaxWidth((value - min) / (max - min))
          .height(4.dp)
          .background(if (enabled) MehTheme.colors.interactive else MehTheme.colors.iconDisabled),
      )
      // Thumb
      Box(
        modifier = Modifier
          .padding(start = ((value - min) / (max - min) * 300).dp) // very loose approx
          .size(16.dp)
          .clip(CircleShape)
          .background(if (enabled) MehTheme.colors.interactive else MehTheme.colors.iconDisabled),
      )
    }
  }
}
