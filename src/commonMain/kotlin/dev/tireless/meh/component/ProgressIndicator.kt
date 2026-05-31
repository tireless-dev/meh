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
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Composable
fun ProgressIndicator(
  currentIndex: Int,
  steps: List<String>,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier.fillMaxWidth(),
    verticalAlignment = Alignment.Top
  ) {
    steps.forEachIndexed { index, step ->
      val isComplete = index < currentIndex
      val isCurrent = index == currentIndex

      Column(
        modifier = Modifier.weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        Box(
          modifier = Modifier
            .size(24.dp)
            .clip(CircleShape)
            .background(if (isComplete || isCurrent) MehTheme.colors.interactive else MehTheme.colors.borderStrong01),
          contentAlignment = Alignment.Center
        ) {
          if (isComplete) {
            Icon(
              image = Icons.Checkmark,
              size = IconSize.XSmall,
              tint = MehTheme.colors.background
            )
          } else if (isCurrent) {
             Box(
               modifier = Modifier
                 .size(8.dp)
                 .clip(CircleShape)
                 .background(MehTheme.colors.background)
             )
          }
        }

        Text(
          text = step,
          style = MehTheme.typography.label01,
          modifier = Modifier.padding(top = MehTheme.spacing.spacing03)
        )
      }
    }
  }
}
