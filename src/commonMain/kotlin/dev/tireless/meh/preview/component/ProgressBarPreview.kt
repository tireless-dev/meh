// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ProgressBar
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "ProgressBar", showBackground = true)
@Composable
internal fun ProgressBarPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
      ProgressBar(progress = 0.5f, label = "Progress bar label", helper = "Optional helper text")
      ProgressBar(progress = 1.0f, label = "Completed")
      ProgressBar(progress = 0.0f, indeterminate = true, label = "Indeterminate")
    }
  }
}
