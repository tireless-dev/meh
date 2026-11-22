// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Toggle
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ToggleSize

@Preview(name = "Light", widthDp = 720)
@Preview(name = "Dark", widthDp = 720, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TogglePreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        ToggleStateColumn(
          title = "Default Off",
          toggled = false,
          size = ToggleSize.Default,
        )
        ToggleStateColumn(
          title = "Default On",
          toggled = true,
          size = ToggleSize.Default,
        )
        ToggleStateColumn(
          title = "Small Off",
          toggled = false,
          size = ToggleSize.Small,
        )
        ToggleStateColumn(
          title = "Small On",
          toggled = true,
          size = ToggleSize.Small,
        )
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Toggle(
          toggled = false,
          onToggledChange = {},
        )
        Toggle(
          toggled = true,
          size = ToggleSize.Small,
          onToggledChange = {},
        )
        Toggle(
          toggled = true,
          labelOff = "",
          labelOn = "",
          onToggledChange = {},
        )
        Toggle(
          toggled = true,
          label = "Custom state text",
          labelOff = "Paused",
          labelOn = "Active",
          onToggledChange = {},
        )
      }
    }
  }
}

@Composable
private fun ToggleStateColumn(
  title: String,
  toggled: Boolean,
  size: ToggleSize,
) {
  val spacing = MehTheme.spacing
  Column(
    verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
  ) {
    Toggle(
      toggled = toggled,
      label = "$title (Enabled)",
      size = size,
      onToggledChange = {},
    )
    Toggle(
      toggled = toggled,
      label = "$title (Focus)",
      size = size,
      onToggledChange = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    Toggle(
      toggled = toggled,
      label = "$title (Disabled)",
      enabled = false,
      size = size,
      onToggledChange = {},
    )
    Toggle(
      toggled = toggled,
      label = "$title (Read-only)",
      readOnly = true,
      size = size,
      onToggledChange = {},
    )
    Toggle(
      toggled = toggled,
      label = "$title (Read-only Focus)",
      readOnly = true,
      size = size,
      onToggledChange = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
  }
}
