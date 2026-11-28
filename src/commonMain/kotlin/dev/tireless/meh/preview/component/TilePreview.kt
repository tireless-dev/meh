// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ClickableTile
import dev.tireless.meh.component.ExpandableTile
import dev.tireless.meh.component.RadioTile
import dev.tireless.meh.component.SelectableTile
import dev.tireless.meh.component.Tile
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TilePreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val titleStyle = typography.headingCompact01.copy(color = colors.textPrimary)
    val bodyStyle = typography.bodyCompact01.copy(color = colors.textPrimary)
    val secondaryStyle = typography.bodyCompact01.copy(color = colors.textSecondary)
    val disabledStyle = typography.bodyCompact01.copy(color = colors.textDisabled)

    val clickableHover = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val clickableFocus = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Base & Clickable Tiles", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        Tile(modifier = Modifier.weight(1f)) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Base tile", style = titleStyle)
            BasicText(text = "Static container surface for grouping content.", style = secondaryStyle)
          }
        }
        ClickableTile(onClick = {}, modifier = Modifier.weight(1f)) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Clickable tile", style = titleStyle)
            BasicText(text = "Default state with navigation arrow.", style = secondaryStyle)
          }
        }
        ClickableTile(
          onClick = {},
          modifier = Modifier.weight(1f),
          interactionSource = clickableHover,
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Clickable hover", style = titleStyle)
            BasicText(text = "Hover surface feedback.", style = secondaryStyle)
          }
        }
        ClickableTile(
          onClick = {},
          modifier = Modifier.weight(1f),
          interactionSource = clickableFocus,
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Clickable focus", style = titleStyle)
            BasicText(text = "2px focus outline.", style = secondaryStyle)
          }
        }
      }

      BasicText(text = "Selectable & Radio Tiles", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        SelectableTile(
          selected = false,
          onSelectedChange = {},
          modifier = Modifier.weight(1f),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Unselected", style = titleStyle)
            BasicText(text = "Multi-select option.", style = secondaryStyle)
          }
        }
        SelectableTile(
          selected = true,
          onSelectedChange = {},
          modifier = Modifier.weight(1f),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Selected", style = titleStyle)
            BasicText(text = "Inverse border + filled checkmark.", style = secondaryStyle)
          }
        }
        RadioTile(
          selected = true,
          onClick = {},
          modifier = Modifier.weight(1f),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Radio selected", style = titleStyle)
            BasicText(text = "Single-select radio tile.", style = secondaryStyle)
          }
        }
        SelectableTile(
          selected = true,
          onSelectedChange = {},
          enabled = false,
          modifier = Modifier.weight(1f),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Disabled", style = disabledStyle)
            BasicText(text = "Non-interactive selected tile.", style = disabledStyle)
          }
        }
      }

      BasicText(text = "Expandable Tiles", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ExpandableTile(
          modifier = Modifier.weight(1f),
          expanded = false,
          aboveTheFoldContent = {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Collapsed expandable tile", style = titleStyle)
              BasicText(
                text = "Above-the-fold summary visible before expanding.",
                style = secondaryStyle,
              )
            }
          },
          belowTheFoldContent = {
            BasicText(text = "Hidden detail content.", style = bodyStyle)
          },
        )

        ExpandableTile(
          modifier = Modifier.weight(1f),
          expanded = true,
          aboveTheFoldContent = {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Expanded tile", style = titleStyle)
              BasicText(
                text = "Above-the-fold summary.",
                style = secondaryStyle,
              )
            }
          },
          belowTheFoldContent = {
            BasicText(
              text = "Below-the-fold detail content revealed when the tile is expanded.",
              style = bodyStyle,
            )
          },
        )
      }
    }
  }
}
