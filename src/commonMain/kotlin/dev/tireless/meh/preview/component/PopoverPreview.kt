// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.Icon
import dev.tireless.meh.component.IconButton
import dev.tireless.meh.component.PopoverAlign
import dev.tireless.meh.component.PopoverSurface
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun PopoverPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val titleStyle = typography.headingCompact01.copy(color = colors.textPrimary)
    val bodyStyle = typography.bodyCompact01.copy(color = colors.textPrimary)
    val inverseTitleStyle = typography.headingCompact01.copy(color = colors.textInverse)
    val inverseBodyStyle = typography.bodyCompact01.copy(color = colors.textInverse)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Variants", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalAlignment = Alignment.Top,
      ) {
        // Default: Caret tip + drop shadow
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          BasicText(text = "Caret tip (default)", style = labelStyle)
          IconButton(
            icon = Icons.Information,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
          PopoverSurface(
            align = PopoverAlign.Bottom,
            caret = true,
            dropShadow = true,
          ) {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Available storage", style = titleStyle)
              BasicText(
                text = "This server has 150 GB of block storage remaining.",
                style = bodyStyle,
              )
            }
          }
        }

        // No tip
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "No tip", style = labelStyle)
          IconButton(
            icon = Icons.Settings,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
          PopoverSurface(
            align = PopoverAlign.BottomStart,
            caret = false,
            dropShadow = true,
          ) {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Display settings", style = titleStyle)
              BasicText(
                text = "Used when the trigger already has a clear down state.",
                style = bodyStyle,
              )
            }
          }
        }

        // High contrast
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          BasicText(text = "High contrast", style = labelStyle)
          IconButton(
            icon = Icons.Help,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = ControlSize.Small,
          )
          PopoverSurface(
            align = PopoverAlign.Bottom,
            caret = true,
            dropShadow = true,
            highContrast = true,
          ) {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Inverse surface", style = inverseTitleStyle)
              BasicText(
                text = "Uses inverse background and text tokens for high contrast.",
                style = inverseBodyStyle,
              )
            }
          }
        }
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalAlignment = Alignment.Top,
      ) {
        // Border without drop shadow
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "Border, no shadow", style = labelStyle)
          PopoverSurface(
            align = PopoverAlign.BottomStart,
            caret = true,
            dropShadow = false,
            border = true,
          ) {
            Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
              BasicText(text = "Bordered popover", style = titleStyle)
              BasicText(
                text = "Subtle 1px outline wraps both the container and caret.",
                style = bodyStyle,
              )
            }
          }
        }

        // Tab tip (BottomStart)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.Start,
        ) {
          BasicText(text = "Tab tip (BottomStart)", style = labelStyle)
          Column(horizontalAlignment = Alignment.Start) {
            Box(
              modifier = Modifier
                .size(40.dp)
                .background(colors.layer01),
              contentAlignment = Alignment.Center,
            ) {
              Icon(image = Icons.Settings, size = IconSize.Small, tint = colors.iconPrimary)
            }
            PopoverSurface(
              align = PopoverAlign.BottomStart,
              tabTip = true,
              dropShadow = true,
            ) {
              Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
                BasicText(text = "Toolbar options", style = titleStyle)
                BasicText(
                  text = "Sharp corners flush with the tab-tip trigger.",
                  style = bodyStyle,
                )
              }
            }
          }
        }

        // Tab tip (BottomEnd)
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
          horizontalAlignment = Alignment.End,
        ) {
          BasicText(text = "Tab tip (BottomEnd)", style = labelStyle)
          Column(horizontalAlignment = Alignment.End) {
            Box(
              modifier = Modifier
                .size(40.dp)
                .background(colors.layer01),
              contentAlignment = Alignment.Center,
            ) {
              Icon(image = Icons.Filter, size = IconSize.Small, tint = colors.iconPrimary)
            }
            PopoverSurface(
              align = PopoverAlign.BottomEnd,
              tabTip = true,
              dropShadow = true,
            ) {
              Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
                BasicText(text = "Filter results", style = titleStyle)
                BasicText(
                  text = "Aligned to the trailing edge of the toolbar button.",
                  style = bodyStyle,
                )
              }
            }
          }
        }
      }

      BasicText(text = "Caret Alignments (12 directions)", style = sectionStyle)

      // Top & Bottom alignments
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
      ) {
        listOf(
          PopoverAlign.TopStart to "TopStart",
          PopoverAlign.Top to "Top",
          PopoverAlign.TopEnd to "TopEnd",
        ).forEach { (align, label) ->
          PopoverSurface(
            modifier = Modifier.weight(1f),
            align = align,
            caret = true,
            border = true,
            dropShadow = false,
            contentPadding = PaddingValues(horizontal = spacing.spacing04, vertical = spacing.spacing03),
          ) {
            BasicText(text = label, style = bodyStyle)
          }
        }
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing04),
      ) {
        listOf(
          PopoverAlign.BottomStart to "BottomStart",
          PopoverAlign.Bottom to "Bottom",
          PopoverAlign.BottomEnd to "BottomEnd",
        ).forEach { (align, label) ->
          PopoverSurface(
            modifier = Modifier.weight(1f),
            align = align,
            caret = true,
            border = true,
            dropShadow = false,
            contentPadding = PaddingValues(horizontal = spacing.spacing04, vertical = spacing.spacing03),
          ) {
            BasicText(text = label, style = bodyStyle)
          }
        }
      }

      // Left & Right alignments
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          listOf(
            PopoverAlign.LeftTop to "LeftTop",
            PopoverAlign.Left to "Left",
            PopoverAlign.LeftBottom to "LeftBottom",
          ).forEach { (align, label) ->
            PopoverSurface(
              modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 64.dp),
              align = align,
              caret = true,
              border = true,
              dropShadow = false,
              contentPadding = PaddingValues(horizontal = spacing.spacing04, vertical = spacing.spacing04),
            ) {
              BasicText(text = label, style = bodyStyle)
            }
          }
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          listOf(
            PopoverAlign.RightTop to "RightTop",
            PopoverAlign.Right to "Right",
            PopoverAlign.RightBottom to "RightBottom",
          ).forEach { (align, label) ->
            PopoverSurface(
              modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 64.dp),
              align = align,
              caret = true,
              border = true,
              dropShadow = false,
              contentPadding = PaddingValues(horizontal = spacing.spacing04, vertical = spacing.spacing04),
            ) {
              BasicText(text = label, style = bodyStyle)
            }
          }
        }
      }
    }
  }
}
