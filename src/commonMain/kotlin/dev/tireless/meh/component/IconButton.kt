// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

enum class HorizontalPaddingScale {
  Default,
  Dense,
  Compact,
  Thin,
  Unspecified,
}

@Composable
fun IconButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Unspecified,
  scale: HorizontalPaddingScale = HorizontalPaddingScale.Default,
  content: @Composable () -> Unit,
) {
  val padding =
    when (scale) {
      HorizontalPaddingScale.Default -> MehTheme.spacing.spacing05
      HorizontalPaddingScale.Dense -> MehTheme.spacing.spacing04
      HorizontalPaddingScale.Compact -> MehTheme.spacing.spacing03
      HorizontalPaddingScale.Thin -> MehTheme.spacing.spacing01
      HorizontalPaddingScale.Unspecified -> Dp.Unspecified
    }
  Box(
    modifier =
    if (size == ControlSize.Unspecified) {
      modifier
    } else {
      modifier.height(size.dp)
    }
      then
      Modifier.clickable(
        onClick = onClick,
        enabled = enabled,
        role = Role.Button,
      )
      then
      Modifier
        .padding(horizontal = padding),
    contentAlignment = Alignment.Center,
  ) {
    CompositionLocalProvider(content = content)
  }
}

@Composable
fun MonoIconButton(
  onClick: () -> Unit,
  icon: ImageVector,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  iconSize: IconSize = IconSize.Unspecified,
  size: ControlSize = ControlSize.Small,
  gap: HorizontalPaddingScale = HorizontalPaddingScale.Default,
  color: Color = Color.Unspecified,
) {
  IconButton(
    onClick = onClick,
    modifier = modifier,
    size = size,
    scale = gap,
    enabled = enabled,
  ) {
    Icon(
      image = icon,
      tint =
      if (enabled) {
        if (color == Color.Unspecified) MehTheme.colors.iconPrimary else color
      } else {
        MehTheme.colors.iconDisabled
      },
      size = if (iconSize == IconSize.Unspecified) IconSize.Medium else iconSize,
    )
  }
}

@Composable
fun FocusableIconButton(
  onClick: () -> Unit,
  icon: ImageVector,
  active: Boolean,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Small,
  gap: HorizontalPaddingScale = HorizontalPaddingScale.Default,
) {
  IconButton(
    onClick = onClick,
    modifier = modifier,
    size = size,
    scale = gap,
  ) {
    Icon(
      image = icon,
      tint =
      if (enabled) {
        if (active) MehTheme.colors.iconPrimary else MehTheme.colors.iconSecondary
      } else {
        MehTheme.colors.iconDisabled
      },
      size = IconSize.Medium,
    )
  }
}

@Composable
fun <T> ToggleIconButton(
  onClick: (T) -> Unit,
  state: T,
  on: Pair<T, ImageVector>,
  off: Pair<T, ImageVector>,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  iconSize: IconSize = IconSize.Unspecified,
  size: ControlSize = ControlSize.Small,
  gap: HorizontalPaddingScale = HorizontalPaddingScale.Default,
  offColor: Color = Color.Unspecified,
) {
  IconButton(
    onClick = {
      onClick(if (state == on.first) off.first else on.first)
    },
    modifier = modifier,
    size = size,
    scale = gap,
    enabled = enabled,
  ) {
    Crossfade(targetState = state) { current ->
      val icon = if (current == on.first) on.second else off.second
      val color =
        if (enabled) {
          when (current) {
            on.first -> {
              MehTheme.colors.iconSecondary
            }

            off.first -> {
              if (offColor == Color.Unspecified) {
                MehTheme.colors.iconPrimary
              } else {
                offColor
              }
            }

            else -> {
              MehTheme.colors.iconDisabled
            }
          }
        } else {
          MehTheme.colors.iconDisabled
        }
      Icon(
        image = icon,
        tint = color,
        size = iconSize,
      )
    }
  }
}
