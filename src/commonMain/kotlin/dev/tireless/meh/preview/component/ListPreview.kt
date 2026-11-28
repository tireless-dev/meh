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
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.ContainedList
import dev.tireless.meh.component.ContainedListItem
import dev.tireless.meh.component.ContainedListKind
import dev.tireless.meh.component.IconButton
import dev.tireless.meh.component.OrderedList
import dev.tireless.meh.component.UnorderedList
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ListPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val hoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Unordered & Ordered Lists (including nested)", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          UnorderedList(items = listOf("Unordered list level 1", "Second level 1 item"))
          UnorderedList(
            items = listOf("Nested level 2 item", "Another nested item"),
            nested = true,
          )
        }
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          OrderedList(items = listOf("Ordered list level 1", "Second numbered item"))
          OrderedList(
            items = listOf("Nested alphabetic item", "Second nested item"),
            nested = true,
          )
        }
      }

      BasicText(text = "Contained Lists (On-page & Disclosed)", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ContainedList(
          title = "On-page contained list",
          kind = ContainedListKind.OnPage,
          modifier = Modifier.weight(1f),
        ) {
          ContainedListItem(
            text = "Interactive item (default)",
            showTopDivider = false,
            onClick = {},
          )
          ContainedListItem(
            text = "Interactive item (hover)",
            onClick = {},
            interactionSource = hoverSource,
          )
          ContainedListItem(
            text = "Interactive item (focus)",
            onClick = {},
            interactionSource = focusSource,
          )
          ContainedListItem(
            text = "Disabled item",
            onClick = {},
            enabled = false,
          )
        }

        ContainedList(
          title = "Disclosed list with actions",
          kind = ContainedListKind.Disclosed,
          headerAction = {
            IconButton(
              icon = Icons.Add,
              onClick = {},
              kind = ButtonKind.Ghost,
              size = ControlSize.Small,
            )
          },
          modifier = Modifier.weight(1f),
        ) {
          ContainedListItem(
            text = "Cluster us-east-1",
            action = {
              IconButton(
                icon = Icons.TrashCan,
                onClick = {},
                kind = ButtonKind.Ghost,
                size = ControlSize.Small,
              )
            },
          )
          ContainedListItem(
            text = "Cluster eu-central-1",
            action = {
              IconButton(
                icon = Icons.TrashCan,
                onClick = {},
                kind = ButtonKind.Ghost,
                size = ControlSize.Small,
              )
            },
          )
          ContainedListItem(
            text = "Cluster ap-northeast-1",
            size = ControlSize.Small,
          )
        }
      }
    }
  }
}
