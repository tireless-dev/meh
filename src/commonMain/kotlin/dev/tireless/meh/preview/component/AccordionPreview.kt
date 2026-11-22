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
import dev.tireless.meh.component.Accordion
import dev.tireless.meh.component.AccordionAlign
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.AccordionSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun AccordionPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val bodyStyle = typography.body01.copy(color = colors.textPrimary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val flushHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val activeSource = rememberPreviewInteractionSource(PreviewInteractionState.Active)

    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
    ) {
      Column(
        modifier = Modifier.weight(1f),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Accordion {
          item(title = "Section 1 title", initiallyExpanded = true) {
            BasicText(
              text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
              style = bodyStyle,
            )
          }
          item(title = "Hover state", interactionSource = hoverSource) {
            BasicText(text = "Hidden section content.", style = bodyStyle)
          }
          item(title = "Focus state", interactionSource = focusSource) {
            BasicText(text = "Hidden section content.", style = bodyStyle)
          }
          item(title = "Disabled section", enabled = false) {
            BasicText(text = "Disabled section content.", style = bodyStyle)
          }
        }

        Accordion(isFlush = true) {
          item(title = "Flush section 1") {
            BasicText(text = "Flush section content.", style = bodyStyle)
          }
          item(title = "Flush hover", interactionSource = flushHoverSource) {
            BasicText(text = "Flush hover content.", style = bodyStyle)
          }
          item(title = "Flush expanded", initiallyExpanded = true) {
            BasicText(
              text = "Flush alignment aligns dividers with the heading text and chevron edges.",
              style = bodyStyle,
            )
          }
        }
      }

      Column(
        modifier = Modifier.weight(1f),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Accordion(align = AccordionAlign.Start) {
          item(title = "Start-aligned expanded", initiallyExpanded = true) {
            BasicText(
              text = "Panel content aligns directly beneath the heading title when the chevron is placed at the start.",
              style = bodyStyle,
            )
          }
          item(title = "Start-aligned collapsed") {
            BasicText(text = "Hidden section content.", style = bodyStyle)
          }
          item(title = "Start-aligned disabled", enabled = false) {
            BasicText(text = "Disabled section content.", style = bodyStyle)
          }
        }

        Accordion(size = AccordionSize.Small) {
          item(title = "Small size (32px)") {
            BasicText(text = "Small accordion content.", style = bodyStyle)
          }
          item(title = "Small active press", interactionSource = activeSource) {
            BasicText(text = "Small accordion content.", style = bodyStyle)
          }
        }

        Accordion(size = AccordionSize.Large) {
          item(title = "Large size (48px)") {
            BasicText(text = "Large accordion content.", style = bodyStyle)
          }
          item(title = "Large disabled", enabled = false) {
            BasicText(text = "Large accordion content.", style = bodyStyle)
          }
        }
      }
    }
  }
}
