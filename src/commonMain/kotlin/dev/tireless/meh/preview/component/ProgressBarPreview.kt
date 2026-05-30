// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.ProgressBar
import dev.tireless.meh.theme.MehTheme

@Composable
fun ProgressBarPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
      ProgressBar(progress = 0.5f, label = "Progress bar label", helper = "Optional helper text")
      ProgressBar(progress = 1.0f, label = "Completed")
      ProgressBar(progress = 0.0f, indeterminate = true, label = "Indeterminate")
    }
  }
}
