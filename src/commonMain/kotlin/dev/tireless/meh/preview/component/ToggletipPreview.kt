// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.PopoverAlign
import dev.tireless.meh.component.ToggletipSurface
import dev.tireless.meh.component.ToggletipTrigger
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ToggletipPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)
    val inverseBodyStyle = typography.body01.copy(color = colors.textInverse)
    val inverseLinkStyle = typography.bodyCompact01.copy(color = colors.linkInverse)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Toggletip Trigger States", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
          BasicText(text = "Default", style = labelStyle)
          Spacer(modifier = Modifier.width(spacing.spacing03))
          ToggletipTrigger(onClick = {})
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
          BasicText(text = "Hover", style = labelStyle)
          Spacer(modifier = Modifier.width(spacing.spacing03))
          ToggletipTrigger(onClick = {}, interactionSource = hoverSource)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
          BasicText(text = "Focus", style = labelStyle)
          Spacer(modifier = Modifier.width(spacing.spacing03))
          ToggletipTrigger(onClick = {}, interactionSource = focusSource)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
          BasicText(text = "Open", style = labelStyle)
          Spacer(modifier = Modifier.width(spacing.spacing03))
          ToggletipTrigger(onClick = {}, expanded = true)
        }
      }

      BasicText(text = "Toggletip Surfaces", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
        verticalAlignment = Alignment.Top,
      ) {
        // With link and primary button actions (BottomStart)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          Row(verticalAlignment = Alignment.CenterVertically) {
            BasicText(text = "Toggletip with actions", style = labelStyle)
            Spacer(modifier = Modifier.width(spacing.spacing03))
            ToggletipTrigger(onClick = {}, expanded = true)
          }
          ToggletipSurface(
            align = PopoverAlign.BottomStart,
            actions = {
              BasicText(text = "Learn more", style = inverseLinkStyle)
              Button(
                text = "Button",
                onClick = {},
                kind = ButtonKind.Primary,
                size = ControlSize.Small,
              )
            },
          ) {
            BasicText(
              text = "Lorem ipsum dolor sit amet, di os consectetur adipiscing elit, sed do eiusmod tempor incididunt ut fsil labore et dolore magna aliqua.",
              style = inverseBodyStyle,
            )
          }
        }

        // Body only (Top)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          BasicText(text = "Body only (Top)", style = labelStyle)
          ToggletipSurface(align = PopoverAlign.Top) {
            BasicText(
              text = "Toggletips stay open until dismissed by clicking outside, activating the trigger again, or pressing Escape.",
              style = inverseBodyStyle,
            )
          }
          ToggletipTrigger(onClick = {}, expanded = true)
        }
      }
    }
  }
}
