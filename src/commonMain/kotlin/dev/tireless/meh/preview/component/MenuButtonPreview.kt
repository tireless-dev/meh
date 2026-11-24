// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ComboButton
import dev.tireless.meh.component.MenuButton
import dev.tireless.meh.component.MenuButtonKind
import dev.tireless.meh.component.MenuDivider
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.component.MenuItemKind
import dev.tireless.meh.component.MenuSurface
import dev.tireless.meh.component.OverflowMenu
import dev.tireless.meh.component.OverflowMenuTrigger
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun MenuButtonPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val overflowHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val overflowFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      // Menu Button kinds & sizes
      BasicText(text = "Menu Button", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        MenuButton(
          text = "Primary",
          expanded = false,
          onExpandedChange = {},
          kind = MenuButtonKind.Primary,
          size = ControlSize.Medium,
        ) {}
        MenuButton(
          text = "Tertiary",
          expanded = false,
          onExpandedChange = {},
          kind = MenuButtonKind.Tertiary,
          size = ControlSize.Medium,
        ) {}
        MenuButton(
          text = "Ghost",
          expanded = false,
          onExpandedChange = {},
          kind = MenuButtonKind.Ghost,
          size = ControlSize.Medium,
        ) {}
        MenuButton(
          text = "Disabled",
          expanded = false,
          onExpandedChange = {},
          enabled = false,
          size = ControlSize.Medium,
        ) {}
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        MenuButton(
          text = "XS (24)",
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.XSmall,
        ) {}
        MenuButton(
          text = "SM (32)",
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Small,
        ) {}
        MenuButton(
          text = "MD (40)",
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Medium,
        ) {}
        MenuButton(
          text = "LG (48)",
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Large,
        ) {}
      }

      // Combo Button states & sizes
      BasicText(text = "Combo Button", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        ComboButton(
          text = "Primary action",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Medium,
        ) {}
        ComboButton(
          text = "Hover",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Medium,
          primaryInteractionSource = hoverSource,
        ) {}
        ComboButton(
          text = "Focus",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Medium,
          triggerInteractionSource = focusSource,
        ) {}
        ComboButton(
          text = "Disabled",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          enabled = false,
          size = ControlSize.Medium,
        ) {}
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        ComboButton(
          text = "XS",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.XSmall,
        ) {}
        ComboButton(
          text = "SM",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Small,
        ) {}
        ComboButton(
          text = "MD",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Medium,
        ) {}
        ComboButton(
          text = "LG",
          onClick = {},
          expanded = false,
          onExpandedChange = {},
          size = ControlSize.Large,
        ) {}
      }

      // Overflow Menu states & open preview
      BasicText(text = "Overflow Menu", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
        verticalAlignment = Alignment.Top,
      ) {
        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
          BasicText(text = "Trigger states", style = labelStyle)
          Row(
            horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
            verticalAlignment = Alignment.CenterVertically,
          ) {
            OverflowMenu(expanded = false, onExpandedChange = {}) {}
            OverflowMenu(
              expanded = false,
              onExpandedChange = {},
              interactionSource = overflowHoverSource,
            ) {}
            OverflowMenu(
              expanded = false,
              onExpandedChange = {},
              interactionSource = overflowFocusSource,
            ) {}
            OverflowMenu(
              expanded = false,
              onExpandedChange = {},
              enabled = false,
            ) {}
            OverflowMenu(
              expanded = false,
              onExpandedChange = {},
              icon = Icons.OverflowMenuHorizontal,
            ) {}
          }
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Expanded overflow menu", style = labelStyle)
          Column {
            OverflowMenuTrigger(onClick = {}, expanded = true, size = ControlSize.Small)
            MenuSurface(size = ControlSize.Small) {
              MenuItem(text = "Stop app", onClick = {})
              MenuItem(text = "Restart app", onClick = {})
              MenuItem(text = "Rename app", onClick = {})
              MenuDivider()
              MenuItem(text = "Delete app", onClick = {}, kind = MenuItemKind.Danger)
            }
          }
        }
      }
    }
  }
}
