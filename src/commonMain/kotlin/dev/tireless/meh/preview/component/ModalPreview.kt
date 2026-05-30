// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import dev.tireless.meh.component.Modal
import dev.tireless.meh.component.Text
import dev.tireless.meh.theme.MehTheme

@Composable
fun ModalPreview() {
  MehTheme {
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
