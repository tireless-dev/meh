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
import dev.tireless.meh.component.ModalSurface
import dev.tireless.meh.component.TextInput
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ModalSize

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun ModalPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val bodyStyle = typography.body01.copy(color = colors.textPrimary)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Transactional & Danger Modals", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ModalSurface(
          label = "Account resources",
          title = "Add a custom domain",
          onDismissRequest = {},
          size = ModalSize.Small,
          primaryButtonText = "Add",
          secondaryButtonText = "Cancel",
          modifier = Modifier.weight(1f),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing04)) {
            BasicText(
              text = "Custom domains direct requests for your apps in this Cloud Foundry organization.",
              style = bodyStyle,
            )
            TextInput(
              value = "",
              onValueChange = {},
              label = "Domain name",
              placeholder = "e.g. github.com",
            )
          }
        }

        ModalSurface(
          label = "Account resources",
          title = "Delete custom domain?",
          onDismissRequest = {},
          size = ModalSize.Small,
          danger = true,
          primaryButtonText = "Delete",
          secondaryButtonText = "Cancel",
          modifier = Modifier.weight(1f),
        ) {
          BasicText(
            text = "This action is permanent and cannot be undone. All routes associated with this domain will stop working.",
            style = bodyStyle,
          )
        }
      }

      BasicText(text = "Passive & 3-Button Modals", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ModalSurface(
          label = "System notice",
          title = "Scheduled maintenance",
          onDismissRequest = {},
          size = ModalSize.Small,
          passive = true,
          modifier = Modifier.weight(1f),
        ) {
          BasicText(
            text = "Maintenance will begin Sunday at 02:00 UTC and is expected to last 30 minutes.",
            style = bodyStyle,
          )
        }

        ModalSurface(
          title = "Unsaved changes",
          onDismissRequest = {},
          size = ModalSize.Small,
          secondaryButtonText = "Cancel",
          tertiaryButtonText = "Discard",
          primaryButtonText = "Save",
          modifier = Modifier.weight(1f),
        ) {
          BasicText(
            text = "You have unsaved changes. Save before closing or discard them.",
            style = bodyStyle,
          )
        }
      }
    }
  }
}
