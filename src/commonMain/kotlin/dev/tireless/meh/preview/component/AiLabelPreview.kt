// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.AiLabel
import dev.tireless.meh.theme.MehTheme

@Composable
fun AiLabelPreview() {
  MehTheme {
    AiLabel(modifier = Modifier.padding(16.dp))
  }
}
