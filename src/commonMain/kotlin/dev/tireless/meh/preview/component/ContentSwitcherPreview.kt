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
import dev.tireless.meh.component.ContentSwitcher
import dev.tireless.meh.component.IconContentSwitcher
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ContentSwitcherPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Text Content Switcher", style = sectionStyle)

      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing04)) {
        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Default (Medium 40px) with hover & focus states", style = labelStyle)
          ContentSwitcher(
            selectedIndex = 0,
            options = listOf("First section", "Second (hover)", "Third (focus)"),
            onOptionSelect = {},
            itemInteractionSources = listOf(null, hoverSource, focusSource),
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Small (32px)", style = labelStyle)
          ContentSwitcher(
            selectedIndex = 1,
            options = listOf("All", "Read", "Unread"),
            onOptionSelect = {},
            size = ControlSize.Small,
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Large (48px)", style = labelStyle)
          ContentSwitcher(
            selectedIndex = 2,
            options = listOf("Table", "Grid", "Board"),
            onOptionSelect = {},
            size = ControlSize.Large,
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Disabled", style = labelStyle)
          ContentSwitcher(
            selectedIndex = 0,
            options = listOf("First section", "Second section", "Third section"),
            onOptionSelect = {},
            enabled = false,
          )
        }
      }

      BasicText(text = "Icon-only Content Switcher", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        val icons = listOf(Icons.List, Icons.Grid, Icons.TableSplit)
        val descriptions = listOf("List view", "Grid view", "Table view")

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Small", style = labelStyle)
          IconContentSwitcher(
            selectedIndex = 0,
            icons = icons,
            contentDescriptions = descriptions,
            onOptionSelect = {},
            size = ControlSize.Small,
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Medium", style = labelStyle)
          IconContentSwitcher(
            selectedIndex = 1,
            icons = icons,
            contentDescriptions = descriptions,
            onOptionSelect = {},
            size = ControlSize.Medium,
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Large", style = labelStyle)
          IconContentSwitcher(
            selectedIndex = 2,
            icons = icons,
            contentDescriptions = descriptions,
            onOptionSelect = {},
            size = ControlSize.Large,
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
          BasicText(text = "Disabled", style = labelStyle)
          IconContentSwitcher(
            selectedIndex = 0,
            icons = icons,
            contentDescriptions = descriptions,
            onOptionSelect = {},
            enabled = false,
          )
        }
      }
    }
  }
}
