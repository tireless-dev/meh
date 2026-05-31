// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ProgressIndicator
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "ProgressIndicator", showBackground = true)
@Composable
internal fun ProgressIndicatorPreview() {
  val steps = listOf("Step 1", "Step 2", "Step 3")
  PreviewTheme {
    ProgressIndicator(
      currentIndex = 1,
      steps = steps
    )
  }
}
