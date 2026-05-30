// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.FormHelper
import dev.tireless.meh.component.FormLabel
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
internal fun TextPreview() {
  PreviewTheme {
    Column(
      modifier = Modifier.fillMaxWidth(),
      horizontalAlignment = Alignment.Start,
    ) {
      Text("Body 01")
      Text(text = "Disabled body", enabled = false)
      Spacer(Modifier.height(8.dp))
      FormLabel(text = "Label")
      FormHelper(text = "Helper text that wraps to multiple lines for inspection.")
    }
  }
}
