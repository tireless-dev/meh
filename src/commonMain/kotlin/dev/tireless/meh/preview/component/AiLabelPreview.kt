// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.AiLabel
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "AiLabel", showBackground = true)
@Composable
internal fun AiLabelPreview() {
  PreviewTheme {
    AiLabel()
  }
}
