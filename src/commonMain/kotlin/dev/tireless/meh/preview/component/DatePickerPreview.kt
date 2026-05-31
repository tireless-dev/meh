// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.DatePicker
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "DatePicker", showBackground = true)
@Composable
internal fun DatePickerPreview() {
  PreviewTheme {
    DatePicker(
      value = "",
      onValueChange = {},
      label = "Date picker label",
      helper = "mm/dd/yyyy"
    )
  }
}
