// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Modal
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Modal", showBackground = true)
@Composable
internal fun ModalPreview() {
  PreviewTheme {
    Modal(
      title = "Modal title",
      onDismissRequest = {},
      primaryButtonText = "Primary button",
      secondaryButtonText = "Secondary button"
    ) {
      Text("Modal content goes here. This is the body of the modal.")
    }
  }
}
