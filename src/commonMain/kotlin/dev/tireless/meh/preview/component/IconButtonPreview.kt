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
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.IconButton
import dev.tireless.meh.component.IconButtonKind
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light")
@Preview(name = "Dark", uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun IconButtonKindsPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      iconButtonKinds.forEach { (name, kind) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          IconButton(
            icon = Icons.Add,
            label = name,
            kind = kind,
            onClick = {},
            interactionSource = rememberPreviewInteractionSource(),
          )
          IconButton(
            icon = Icons.Add,
            label = "$name (Disabled)",
            kind = kind,
            onClick = {},
            enabled = false,
          )
          PreviewInteractionState.entries.forEach { state ->
            IconButton(
              icon = Icons.Add,
              label = "$name (${state.name})",
              kind = kind,
              onClick = {},
              interactionSource = rememberPreviewInteractionSource(state),
            )
          }
          if (kind == ButtonKind.Ghost) {
            IconButton(
              icon = Icons.Add,
              label = "$name (Selected)",
              kind = kind,
              selected = true,
              onClick = {},
              interactionSource = rememberPreviewInteractionSource(),
            )
          }
        }
      }
    }
  }
}

@Preview
@Composable
internal fun IconButtonSizesPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      iconButtonSizeSpecs.forEach { (label, size) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
          verticalAlignment = Alignment.CenterVertically,
        ) {
          iconButtonKinds.forEach { (kindName, kind) ->
            IconButton(
              icon = Icons.Add,
              label = "$label $kindName",
              kind = kind,
              size = size,
              onClick = {},
              interactionSource = rememberPreviewInteractionSource(),
            )
          }
        }
      }
    }
  }
}

private val iconButtonKinds: List<Pair<String, IconButtonKind>> = listOf(
  "Primary" to ButtonKind.Primary,
  "Secondary" to ButtonKind.Secondary,
  "Tertiary" to ButtonKind.Tertiary,
  "Ghost" to ButtonKind.Ghost,
)

private val iconButtonSizeSpecs = listOf(
  "XSmall" to ControlSize.XSmall,
  "Small" to ControlSize.Small,
  "Medium" to ControlSize.Medium,
  "Large" to ControlSize.Large,
)
