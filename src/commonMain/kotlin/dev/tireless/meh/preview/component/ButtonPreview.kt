// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonType
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(name = "Button – Types", showBackground = true)
@Composable
internal fun ButtonPreviewTypes() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing04),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      Button(text = "Primary", onClick = {})
      Button(text = "Secondary", type = ButtonType.Secondary, onClick = {})
      Button(text = "Danger", type = ButtonType.DangerPrimary, onClick = {})
      Button(text = "Ghost", type = ButtonType.Ghost, onClick = {})
      Button(text = "Disabled", onClick = {}, enabled = false)
    }
  }
}

@Preview(name = "Button – Sizes", showBackground = true)
@Composable
internal fun ButtonPreviewSizes() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing04),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      Button(text = "Small", onClick = {}, size = ControlSize.Small)
      Button(text = "Medium", onClick = {}, size = ControlSize.Medium)
      Button(text = "Large", onClick = {}, size = ControlSize.Large)
      Button(text = "XLarge", onClick = {}, size = ControlSize.XLarge)
      Button(text = "XXLarge", onClick = {}, size = ControlSize.XXLarge)
    }
  }
}
