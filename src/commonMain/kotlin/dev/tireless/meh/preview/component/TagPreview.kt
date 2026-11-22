// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.DismissibleTag
import dev.tireless.meh.component.OperationalTag
import dev.tireless.meh.component.OperationalTagType
import dev.tireless.meh.component.SelectableTag
import dev.tireless.meh.component.Tag
import dev.tireless.meh.component.TagType
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.TagSize

@Preview(name = "Light", widthDp = 700)
@Preview(name = "Dark", widthDp = 700, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TagReadOnlyPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      allTagTypes.forEach { (name, type) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          Tag(
            text = name,
            type = type,
          )
          Tag(
            text = name,
            type = type,
            icon = Icons.Add,
          )
          Tag(
            text = "$name (Disabled)",
            type = type,
            enabled = false,
          )
          Tag(
            text = "$name (Disabled)",
            type = type,
            icon = Icons.Add,
            enabled = false,
          )
        }
      }
    }
  }
}

@Preview(name = "Light", widthDp = 1200)
@Preview(name = "Dark", widthDp = 1200, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun DismissibleTagPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      allTagTypes.forEach { (name, type) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          DismissibleTag(
            text = name,
            type = type,
            onClose = {},
            interactionSource = rememberPreviewInteractionSource(),
          )
          DismissibleTag(
            text = name,
            type = type,
            icon = Icons.Add,
            onClose = {},
            interactionSource = rememberPreviewInteractionSource(),
          )
          DismissibleTag(
            text = "$name (Disabled)",
            type = type,
            enabled = false,
            onClose = {},
          )
          PreviewInteractionState.entries.forEach { state ->
            DismissibleTag(
              text = "$name (${state.name})",
              type = type,
              onClose = {},
              interactionSource = rememberPreviewInteractionSource(state),
            )
          }
        }
      }
    }
  }
}

@Preview(name = "Light", widthDp = 1000)
@Preview(name = "Dark", widthDp = 1000, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun SelectableTagPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      listOf(false, true).forEach { selected ->
        val stateLabel = if (selected) "Selected" else "Unselected"
        listOf(false, true).forEach { showIcon ->
          val icon = if (showIcon) Icons.Add else null
          Row(
            horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
            verticalAlignment = Alignment.CenterVertically,
          ) {
            SelectableTag(
              text = stateLabel,
              selected = selected,
              icon = icon,
              onSelectedChange = {},
              interactionSource = rememberPreviewInteractionSource(),
            )
            SelectableTag(
              text = "$stateLabel (Disabled)",
              selected = selected,
              enabled = false,
              icon = icon,
              onSelectedChange = {},
            )
            PreviewInteractionState.entries.forEach { state ->
              SelectableTag(
                text = "$stateLabel (${state.name})",
                selected = selected,
                icon = icon,
                onSelectedChange = {},
                interactionSource = rememberPreviewInteractionSource(state),
              )
            }
          }
        }
      }
    }
  }
}

@Preview(name = "Light", widthDp = 1100)
@Preview(name = "Dark", widthDp = 1100, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun OperationalTagPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      operationalTagTypes.forEach { (name, type) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          OperationalTag(
            text = name,
            type = type,
            onClick = {},
            interactionSource = rememberPreviewInteractionSource(),
          )
          OperationalTag(
            text = name,
            type = type,
            icon = Icons.Add,
            onClick = {},
            interactionSource = rememberPreviewInteractionSource(),
          )
          OperationalTag(
            text = "$name (Disabled)",
            type = type,
            enabled = false,
            onClick = {},
          )
          PreviewInteractionState.entries.forEach { state ->
            OperationalTag(
              text = "$name (${state.name})",
              type = type,
              onClick = {},
              interactionSource = rememberPreviewInteractionSource(state),
            )
          }
        }
      }
    }
  }
}

@Preview(widthDp = 1000)
@Composable
internal fun TagSizesPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      tagSizeSpecs.forEach { (label, size) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          Tag(
            text = "1",
            size = size,
          )
          Tag(
            text = label,
            size = size,
          )
          Tag(
            text = "$label Icon",
            size = size,
            icon = Icons.Add,
          )
          DismissibleTag(
            text = "$label Dismiss",
            size = size,
            icon = Icons.Add,
            onClose = {},
          )
          SelectableTag(
            text = "$label Select",
            selected = false,
            size = size,
            icon = Icons.Add,
            onSelectedChange = {},
          )
          OperationalTag(
            text = "$label Action",
            size = size,
            icon = Icons.Add,
            onClick = {},
          )
          DismissibleTag(
            text = "$label tag with a very long truncated label that exceeds max width",
            size = size,
            icon = Icons.Add,
            onClose = {},
          )
        }
      }
    }
  }
}

private val operationalTagTypes: List<Pair<String, OperationalTagType>> = listOf(
  "Red" to TagType.Red,
  "Magenta" to TagType.Magenta,
  "Purple" to TagType.Purple,
  "Blue" to TagType.Blue,
  "Cyan" to TagType.Cyan,
  "Teal" to TagType.Teal,
  "Green" to TagType.Green,
  "Gray" to TagType.Gray,
  "Cool gray" to TagType.CoolGray,
  "Warm gray" to TagType.WarmGray,
)

private val allTagTypes: List<Pair<String, TagType>> = operationalTagTypes + listOf(
  "High contrast" to TagType.HighContrast,
  "Outline" to TagType.Outline,
)

private val tagSizeSpecs = listOf(
  "Small" to TagSize.Small,
  "Medium" to TagSize.Medium,
  "Large" to TagSize.Large,
)
