// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.component.GroupLayout
import dev.tireless.meh.component.Radio
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(name = "Radio – Horizontal", showBackground = true)
@Composable
internal fun RadioPreviewHorizontal() {
  PreviewTheme {
    Radio(
      value = 1,
      onValueChange = {},
      values = listOf("Email", "Push", "SMS"),
      label = "Notification channel",
      helper = "Choose the default channel",
      layout = GroupLayout.Horizontal,
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(MehTheme.spacing.spacing04),
    )
  }
}

@Preview(name = "Radio – Vertical", showBackground = true)
@Composable
internal fun RadioPreviewVertical() {
  PreviewTheme {
    Radio(
      value = 0,
      onValueChange = {},
      values = listOf("Daily", "Weekly", "Monthly"),
      label = "Digest frequency",
      helper = "Disabled layout example",
      layout = GroupLayout.Vertical,
      enabled = false,
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(MehTheme.spacing.spacing04),
    )
  }
}
