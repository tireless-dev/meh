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
import dev.tireless.meh.component.MenuDivider
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.component.MenuItemKind
import dev.tireless.meh.component.MenuSelectableItem
import dev.tireless.meh.component.MenuSurface
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun MenuPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val activeSource = rememberPreviewInteractionSource(PreviewInteractionState.Active)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val dangerHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Menu Variants & States", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalAlignment = Alignment.Top,
      ) {
        // Actions, shortcuts, submenu, states, divider, danger
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          BasicText(text = "Actions, states & danger", style = labelStyle)
          MenuSurface(size = ControlSize.Small) {
            MenuItem(text = "Share with", onClick = {}, hasSubmenu = true)
            MenuItem(
              text = "Cut",
              onClick = {},
              shortcut = "⌘X",
              interactionSource = hoverSource,
            )
            MenuItem(
              text = "Copy",
              onClick = {},
              shortcut = "⌘C",
              interactionSource = activeSource,
            )
            MenuItem(
              text = "Paste",
              onClick = {},
              shortcut = "⌘V",
              interactionSource = focusSource,
            )
            MenuItem(text = "Duplicate", onClick = {}, enabled = false)
            MenuDivider()
            MenuItem(text = "Delete", onClick = {}, kind = MenuItemKind.Danger)
            MenuItem(
              text = "Delete permanently",
              onClick = {},
              kind = MenuItemKind.Danger,
              interactionSource = dangerHoverSource,
            )
          }
        }

        // Selectable items & icons
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          BasicText(text = "Selectable & icons", style = labelStyle)
          MenuSurface(size = ControlSize.Small) {
            MenuSelectableItem(text = "Publish", selected = true, onSelectedChange = {})
            MenuSelectableItem(text = "Show grid", selected = false, onSelectedChange = {})
            MenuSelectableItem(
              text = "Auto-save",
              selected = true,
              onSelectedChange = {},
              enabled = false,
            )
            MenuDivider()
            MenuItem(text = "Settings", onClick = {}, icon = Icons.Settings)
            MenuItem(text = "Export", onClick = {}, icon = Icons.Download, hasSubmenu = true)
            MenuItem(
              text = "Remove",
              onClick = {},
              icon = Icons.TrashCan,
              kind = MenuItemKind.Danger,
            )
          }
        }
      }

      BasicText(text = "Menu Sizes (xs / sm / md / lg)", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
        verticalAlignment = Alignment.Top,
      ) {
        listOf(
          ControlSize.XSmall to "Extra small (24px)",
          ControlSize.Small to "Small (32px)",
          ControlSize.Medium to "Medium (40px)",
          ControlSize.Large to "Large (48px)",
        ).forEach { (size, label) ->
          Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          ) {
            BasicText(text = label, style = labelStyle)
            MenuSurface(size = size) {
              MenuItem(text = "Option 1", onClick = {})
              MenuItem(text = "Option 2", onClick = {})
              MenuDivider()
              MenuItem(text = "Delete", onClick = {}, kind = MenuItemKind.Danger)
            }
          }
        }
      }
    }
  }
}
