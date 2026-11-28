// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.AiLabelCallout
import dev.tireless.meh.component.AiLabelKind
import dev.tireless.meh.component.AiLabelSize
import dev.tireless.meh.component.AiLabelTrigger
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.IconButton
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun AiLabelPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)
    val titleStyle = typography.heading03.copy(color = colors.textPrimary)
    val bodyStyle = typography.bodyCompact01.copy(color = colors.textPrimary)
    val secondaryBodyStyle = typography.bodyCompact01.copy(color = colors.textSecondary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Default AI Label Sizes (mini → xl)", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalAlignment = Alignment.Bottom,
      ) {
        listOf(
          AiLabelSize.Mini to "mini",
          AiLabelSize.XXSmall to "2xs",
          AiLabelSize.XSmall to "xs",
          AiLabelSize.Small to "sm",
          AiLabelSize.Medium to "md",
          AiLabelSize.Large to "lg",
          AiLabelSize.XLarge to "xl",
        ).forEach { (size, label) ->
          Column(
            verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
            horizontalAlignment = Alignment.CenterHorizontally,
          ) {
            AiLabelTrigger(onClick = {}, size = size)
            BasicText(text = label, style = labelStyle)
          }
        }
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
        verticalAlignment = Alignment.Top,
      ) {
        // Trigger states & Inline variants
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
            BasicText(text = "Trigger States & Revert", style = sectionStyle)
            Row(
              horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
              verticalAlignment = Alignment.CenterVertically,
            ) {
              Column(
                verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
                horizontalAlignment = Alignment.CenterHorizontally,
              ) {
                AiLabelTrigger(onClick = {}, size = AiLabelSize.Small)
                BasicText(text = "Default", style = labelStyle)
              }
              Column(
                verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
                horizontalAlignment = Alignment.CenterHorizontally,
              ) {
                AiLabelTrigger(
                  onClick = {},
                  size = AiLabelSize.Small,
                  interactionSource = hoverSource,
                )
                BasicText(text = "Hover", style = labelStyle)
              }
              Column(
                verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
                horizontalAlignment = Alignment.CenterHorizontally,
              ) {
                AiLabelTrigger(
                  onClick = {},
                  size = AiLabelSize.Small,
                  interactionSource = focusSource,
                )
                BasicText(text = "Focus", style = labelStyle)
              }
              Column(
                verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
                horizontalAlignment = Alignment.CenterHorizontally,
              ) {
                AiLabelTrigger(
                  onClick = {},
                  size = AiLabelSize.Small,
                  revertActive = true,
                )
                BasicText(text = "Revert", style = labelStyle)
              }
            }
          }

          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
            BasicText(text = "Inline Variants (sm / md / lg)", style = sectionStyle)
            AiLabelTrigger(
              onClick = {},
              kind = AiLabelKind.Inline,
              size = AiLabelSize.Small,
              textLabel = "Text goes here (sm)",
            )
            AiLabelTrigger(
              onClick = {},
              kind = AiLabelKind.Inline,
              size = AiLabelSize.Medium,
              textLabel = "Text goes here (md)",
            )
            AiLabelTrigger(
              onClick = {},
              kind = AiLabelKind.Inline,
              size = AiLabelSize.Large,
              textLabel = "Text goes here (lg)",
            )
          }
        }

        // Explainability Callout Popover
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          BasicText(text = "Explainability Callout", style = sectionStyle)
          AiLabelCallout(
            actions = {
              IconButton(
                icon = Icons.View,
                onClick = {},
                kind = ButtonKind.Ghost,
                size = ControlSize.Small,
              )
              IconButton(
                icon = Icons.FolderOpen,
                onClick = {},
                kind = ButtonKind.Ghost,
                size = ControlSize.Small,
              )
              IconButton(
                icon = Icons.Folders,
                onClick = {},
                kind = ButtonKind.Ghost,
                size = ControlSize.Small,
              )
            },
          ) {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing01)) {
              BasicText(text = "AI Explained", style = labelStyle)
              BasicText(text = "84%", style = titleStyle)
              BasicText(text = "Confidence score", style = bodyStyle)
            }
            BasicText(
              text = "Generated using foundation model insights from verified workspace sources.",
              style = secondaryBodyStyle,
            )
            Box(
              modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(colors.borderSubtle01),
            )
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing01)) {
              BasicText(text = "Model type", style = labelStyle)
              BasicText(text = "Foundation model", style = bodyStyle)
            }
          }
        }
      }
    }
  }
}
