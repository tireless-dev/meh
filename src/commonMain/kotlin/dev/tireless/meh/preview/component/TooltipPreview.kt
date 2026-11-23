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
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.DefinitionTooltipTrigger
import dev.tireless.meh.component.IconButton
import dev.tireless.meh.component.PopoverAlign
import dev.tireless.meh.component.TooltipSurface
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TooltipPreview() {
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
      BasicText(text = "Standard Tooltip", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
        verticalAlignment = Alignment.Top,
      ) {
        // Single-line icon label tooltip (Top)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          BasicText(text = "Single-line (Top)", style = labelStyle)
          TooltipSurface(
            text = "Close",
            align = PopoverAlign.Top,
            singleLine = true,
          )
          IconButton(
            icon = Icons.Close,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
        }

        // Single-line icon label tooltip (Bottom)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          BasicText(text = "Single-line (Bottom)", style = labelStyle)
          IconButton(
            icon = Icons.Settings,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
          TooltipSurface(
            text = "Display settings",
            align = PopoverAlign.Bottom,
            singleLine = true,
          )
        }

        // Multi-line tooltip (BottomStart)
        Column(
          modifier = Modifier.weight(1.4f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "Multi-line (max 288dp)", style = labelStyle)
          IconButton(
            icon = Icons.Information,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
          TooltipSurface(
            text = "Occasionally, tooltips are used to provide a short description of an icon button or control.",
            align = PopoverAlign.BottomStart,
            singleLine = false,
          )
        }
      }

      BasicText(text = "Definition Tooltip", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
        verticalAlignment = Alignment.Top,
      ) {
        // Trigger states
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Default trigger", style = labelStyle)
            DefinitionTooltipTrigger(term = "Uniform Resource Locator")
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Hover trigger", style = labelStyle)
            DefinitionTooltipTrigger(
              term = "Uniform Resource Locator",
              interactionSource = hoverSource,
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Focus trigger", style = labelStyle)
            DefinitionTooltipTrigger(
              term = "Uniform Resource Locator",
              interactionSource = focusSource,
            )
          }
        }

        // Open definition tooltip (BottomStart)
        Column(
          modifier = Modifier.weight(1.3f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "Open definition (BottomStart)", style = labelStyle)
          DefinitionTooltipTrigger(
            term = "Uniform Resource Locator",
            open = true,
          )
          TooltipSurface(
            text = "Uniform Resource Locator; the address of a resource (such as a document or website) on the internet.",
            align = PopoverAlign.BottomStart,
            singleLine = false,
          )
        }

        // Open definition tooltip (TopStart)
        Column(
          modifier = Modifier.weight(1.3f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "Open definition (TopStart)", style = labelStyle)
          TooltipSurface(
            text = "Application Programming Interface; a set of definitions and protocols for building software.",
            align = PopoverAlign.TopStart,
            singleLine = false,
          )
          DefinitionTooltipTrigger(
            term = "API",
            open = true,
          )
        }
      }
    }
  }
}
