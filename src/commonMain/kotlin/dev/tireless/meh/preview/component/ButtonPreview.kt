// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.resources.imageResource

@Preview(name = "Light", widthDp = 1600)
@Preview(name = "Dark", widthDp = 1600, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ButtonPreviewTypes() {
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

@PreviewLightDark
@Composable
internal fun ButtonPreviewSizes() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      ControlSize.entries.forEach {
        Button(text = it.name, onClick = {}, size = it)
      }
    }
  }
}

private val buttonKinds = setOf(
  "Primary" to ButtonKind.Primary,
  "Secondary" to ButtonKind.Secondary,
  "Tertiary" to ButtonKind.Tertiary,
  "Ghost" to ButtonKind.Ghost,
  "Danger Primary" to ButtonKind.Danger.Primary,
  "Danger Tertiary" to ButtonKind.Danger.Tertiary,
  "Danger Ghost" to ButtonKind.Danger.Ghost,
)
