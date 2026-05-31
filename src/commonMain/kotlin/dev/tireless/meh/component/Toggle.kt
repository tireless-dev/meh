// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ToggleSize
import dev.tireless.meh.theme.dp

@Composable
fun Toggle(
  toggled: Boolean,
  onToggledChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  readOnly: Boolean = false,
  enabled: Boolean = true,
  size: ToggleSize = ToggleSize.Default,
  labelOff: String = "Off",
  labelOn: String = "On",
) {
  val interactionSource = remember { MutableInteractionSource() }
  val trackHeight = size.dp
  val trackWidth = if (size == ToggleSize.Default) 48.dp else 32.dp
  val thumbSize = if (size == ToggleSize.Default) 18.dp else 12.dp
  val padding = (trackHeight - thumbSize) / 2

  val thumbOffset by
    animateDpAsState(
      targetValue = if (toggled) trackWidth - thumbSize - padding else padding,
      label = "ToggleThumbOffset",
    )

  Column(modifier = modifier) {
    label?.let {
      FormLabel(text = it, enabled = enabled, modifier = Modifier.padding(bottom = MehTheme.spacing.spacing03))
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
      Box(
        modifier =
        Modifier
          .size(width = trackWidth, height = trackHeight)
          .clip(CircleShape)
          .background(
            if (toggled) {
              if (enabled) MehTheme.colors.supportSuccess else MehTheme.colors.supportSuccess.copy(alpha = 0.5f)
            } else {
              if (enabled) MehTheme.colors.toggleOff else MehTheme.colors.toggleOff.copy(alpha = 0.5f)
            },
          )
          .clickable(
            enabled = enabled && !readOnly,
            interactionSource = interactionSource,
            indication = null,
            onClick = { onToggledChange(!toggled) },
          ),
      ) {
        Box(
          modifier =
          Modifier
            .offset(x = thumbOffset)
            .align(Alignment.CenterStart)
            .size(thumbSize)
            .clip(CircleShape)
            .background(if (enabled) MehTheme.colors.background else MehTheme.colors.background.copy(alpha = 0.5f)),
        )
      }

      Spacer(Modifier.size(MehTheme.spacing.spacing04))

      Text(
        text = if (toggled) labelOn else labelOff,
        style = MehTheme.typography.bodyCompact01,
        enabled = enabled,
      )
    }
  }
}
