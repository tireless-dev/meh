// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 1600)
@Preview(name = "Dark", widthDp = 1600, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ButtonKindsPreview() {
  PreviewTheme {
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
    ) {
      buttonKinds.forEach {
        setOf(true, false).forEach { showIcon ->
          Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
          ) {
            Button(
              text = it.first,
              icon = if (showIcon) Icons.Add else null,
              kind = it.second,
              onClick = {},
              interactionSource = rememberPreviewInteractionSource(),
              modifier = Modifier.weight(1.0f),
            )
            Button(
              text = "${it.first} (Disabled)",
              icon = if (showIcon) Icons.Add else null,
              kind = it.second,
              onClick = {},
              enabled = false,
              modifier = Modifier.weight(1.0f),
            )
            PreviewInteractionState.entries.forEach { state ->
              Button(
                text = "${it.first} (${state.name})",
                icon = if (showIcon) Icons.Add else null,
                kind = it.second,
                onClick = {},
                interactionSource = rememberPreviewInteractionSource(state),
                modifier = Modifier.weight(1.0f),
              )
            }
          }
        }
      }
    }
  }
}

@Preview(widthDp = 1000)
@Composable
internal fun ButtonSizesPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      buttonSizeSpecs.forEach { (label, size, expressive) ->
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          Button(
            text = label,
            onClick = {},
            size = size,
            expressive = expressive,
            interactionSource = rememberPreviewInteractionSource(),
          )
          Button(
            text = label,
            onClick = {},
            size = size,
            expressive = expressive,
            icon = Icons.Add,
            interactionSource = rememberPreviewInteractionSource(),
          )
          Button(
            text = label,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = size,
            expressive = expressive,
            interactionSource = rememberPreviewInteractionSource(),
          )
          Button(
            text = label,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = size,
            expressive = expressive,
            icon = Icons.Add,
            interactionSource = rememberPreviewInteractionSource(),
          )
        }
      }
    }
  }
}

@Preview(widthDp = 900)
@Composable
internal fun ButtonOverflowPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    val narrowWidth = Modifier.width(180.dp)
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      buttonSizeSpecs.forEach { (label, size, expressive) ->
        val overflowText = "$label button with a long wrapping label"
        Row(
          horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          Button(
            text = overflowText,
            onClick = {},
            size = size,
            expressive = expressive,
            interactionSource = rememberPreviewInteractionSource(),
            modifier = narrowWidth,
          )
          Button(
            text = overflowText,
            onClick = {},
            size = size,
            expressive = expressive,
            icon = Icons.Add,
            interactionSource = rememberPreviewInteractionSource(),
            modifier = narrowWidth,
          )
          Button(
            text = overflowText,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = size,
            expressive = expressive,
            interactionSource = rememberPreviewInteractionSource(),
            modifier = narrowWidth,
          )
          Button(
            text = overflowText,
            onClick = {},
            kind = ButtonKind.Ghost,
            size = size,
            expressive = expressive,
            icon = Icons.Add,
            interactionSource = rememberPreviewInteractionSource(),
            modifier = narrowWidth,
          )
        }
      }
    }
  }
}

private val buttonSizeSpecs = listOf(
  Triple("XSmall", ControlSize.XSmall, false),
  Triple("Small", ControlSize.Small, false),
  Triple("Medium", ControlSize.Medium, false),
  Triple("Large", ControlSize.Large, false),
  Triple("Large (Expressive)", ControlSize.Large, true),
  Triple("XLarge", ControlSize.XLarge, false),
  Triple("XXLarge", ControlSize.XXLarge, false),
)

private val buttonKinds = setOf(
  "Primary" to ButtonKind.Primary,
  "Secondary" to ButtonKind.Secondary,
  "Tertiary" to ButtonKind.Tertiary,
  "Ghost" to ButtonKind.Ghost,
  "Danger Primary" to ButtonKind.Danger.Primary,
  "Danger Tertiary" to ButtonKind.Danger.Tertiary,
  "Danger Ghost" to ButtonKind.Danger.Ghost,
)
