// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme

@Composable
fun Link(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  inline: Boolean = false,
  icon: ImageVector? = null,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isHovered by interactionSource.collectIsHoveredAsState()

  Row(
    modifier =
    modifier.clickable(
      enabled = enabled,
      interactionSource = interactionSource,
      indication = null,
      onClick = onClick,
    ),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = text,
      style =
      if (inline) {
        MehTheme.typography.body01
      } else {
        MehTheme.typography.bodyCompact01
      },
      color = if (enabled) MehTheme.colors.linkPrimary else MehTheme.colors.textDisabled,
      textDecoration = if (isHovered && enabled) TextDecoration.Underline else TextDecoration.None,
    )

    if (icon != null) {
      Spacer(Modifier.size(4.dp))
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = if (enabled) MehTheme.colors.linkPrimary else MehTheme.colors.textDisabled,
      )
    }
  }
}
