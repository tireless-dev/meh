// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@Composable
fun IconButton(
  icon: ImageVector,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  enabled: Boolean = true,
  selected: Boolean = false,
  kind: IconButtonKind = ButtonKind.Primary,
  size: ControlSize = ControlSize.Large,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val active by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val hovered by interactionSource.collectIsHoveredAsState()

  val colors = MehTheme.colors
  val effectiveSize = when (size) {
    ControlSize.XSmall, ControlSize.Small, ControlSize.Medium, ControlSize.Large -> size
    ControlSize.XLarge, ControlSize.XXLarge, ControlSize.Unspecified -> ControlSize.Large
  }

  val buttonColors = resolveIconButtonColors(
    kind = kind,
    colors = colors,
    enabled = enabled,
    selected = selected,
    hovered = hovered,
    active = active,
    focused = focused,
  )

  val ghost = kind == ButtonKind.Ghost

  Box(
    modifier =
    modifier
      .size(effectiveSize.dp)
      .background(buttonColors.container)
      .then(
        when {
          focused && enabled -> Modifier.focusBorder(
            focusColor = colors.focus,
            focusInsetColor = colors.focusInset.takeIf {
              !ghost && buttonColors.container != Color.Transparent
            },
          )

          buttonColors.border != Color.Transparent -> Modifier.border(
            width = 1.dp,
            color = buttonColors.border,
          )

          else -> Modifier
        },
      )
      .then(
        if (label != null || (ghost && selected)) {
          Modifier.semantics {
            if (label != null) {
              contentDescription = label
            }
            if (ghost && selected) {
              this.selected = true
            }
          }
        } else {
          Modifier
        },
      )
      .clickable(
        enabled = enabled,
        onClick = onClick,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = null,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = icon,
      size = IconSize.Small,
      tint = buttonColors.icon,
    )
  }
}

@Immutable
private data class IconButtonColors(
  val icon: Color,
  val container: Color,
  val border: Color = Color.Transparent,
)

private fun resolveIconButtonColors(
  kind: IconButtonKind,
  colors: Colors,
  enabled: Boolean,
  selected: Boolean,
  hovered: Boolean,
  active: Boolean,
  focused: Boolean,
): IconButtonColors {
  if (!enabled) {
    return when (kind) {
      ButtonKind.Primary, ButtonKind.Secondary -> IconButtonColors(
        icon = colors.iconOnColorDisabled,
        container = colors.buttonDisabled,
      )

      ButtonKind.Tertiary -> IconButtonColors(
        icon = colors.iconDisabled,
        container = Color.Transparent,
        border = colors.buttonDisabled,
      )

      ButtonKind.Ghost -> IconButtonColors(
        icon = colors.iconDisabled,
        container = Color.Transparent,
      )
    }
  }

  return when (kind) {
    ButtonKind.Primary -> IconButtonColors(
      icon = colors.iconOnColor,
      container = when {
        active -> colors.buttonPrimaryActive
        hovered -> colors.buttonPrimaryHover
        else -> colors.buttonPrimary
      },
    )

    ButtonKind.Secondary -> IconButtonColors(
      icon = colors.iconOnColor,
      container = when {
        active -> colors.buttonSecondaryActive
        hovered -> colors.buttonSecondaryHover
        else -> colors.buttonSecondary
      },
    )

    ButtonKind.Tertiary -> {
      val filled = hovered || active || focused
      IconButtonColors(
        icon = if (filled) colors.iconInverse else colors.buttonTertiary,
        container = when {
          active -> colors.buttonTertiaryActive
          hovered -> colors.buttonTertiaryHover
          focused -> colors.buttonTertiary
          else -> Color.Transparent
        },
        border = if (filled) Color.Transparent else colors.buttonTertiary,
      )
    }

    ButtonKind.Ghost -> IconButtonColors(
      icon = colors.iconPrimary,
      container = when {
        active -> colors.backgroundActive
        hovered -> colors.backgroundHover
        selected -> colors.backgroundSelected
        else -> Color.Transparent
      },
    )
  }
}
