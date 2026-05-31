// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Slider
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Slider", showBackground = true)
@Composable
internal fun SliderPreview() {
  PreviewTheme {
    Slider(
      value = 50f,
      onValueChange = {},
      label = "Slider label",
      min = 0f,
      max = 100f
    )
  }
}
