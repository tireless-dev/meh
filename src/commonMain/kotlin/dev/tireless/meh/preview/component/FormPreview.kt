// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonKind
import dev.tireless.meh.component.Checkbox
import dev.tireless.meh.component.Form
import dev.tireless.meh.component.FormButtonGroup
import dev.tireless.meh.component.FormGroup
import dev.tireless.meh.component.Select
import dev.tireless.meh.component.TextArea
import dev.tireless.meh.component.TextInput
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun FormPreview() {
  PreviewTheme {
    Form(
      title = "Create workspace",
      description = "Configure your workspace identity and default deployment region.",
    ) {
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
      ) {
        TextInput(
          value = "Core Platform",
          onValueChange = {},
          label = "Workspace name",
          modifier = Modifier.weight(1f),
        )
        Select(
          selectedOption = "US East",
          label = "Region",
          modifier = Modifier.weight(1f),
        )
      }

      TextArea(
        value = "",
        onValueChange = {},
        label = "Description",
        placeholder = "Optional summary of this workspace",
        maxCount = 200,
      )

      FormGroup(
        legend = "Notifications",
        message = "You can update these preferences later in settings.",
      ) {
        Checkbox(
          checked = true,
          onCheckedChange = {},
          label = "Send deployment status alerts",
        )
        Checkbox(
          checked = false,
          onCheckedChange = {},
          label = "Include weekly usage digest",
        )
      }

      FormButtonGroup {
        Button(text = "Create workspace", onClick = {})
        Button(text = "Cancel", onClick = {}, kind = ButtonKind.Secondary)
      }
    }
  }
}
