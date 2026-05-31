// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Multiselect
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Multiselect", showBackground = true)
@Composable
internal fun MultiselectPreview() {
  PreviewTheme {
    Multiselect(
      selectedOptions = listOf("Option 1", "Option 2"),
      label = "Multiselect label",
      helper = "Optional helper text",
      onClick = {}
    )
  }
}
