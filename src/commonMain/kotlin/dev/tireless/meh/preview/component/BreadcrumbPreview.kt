// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Breadcrumb
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Breadcrumb", showBackground = true)
@Composable
internal fun BreadcrumbPreview() {
  val items = listOf("Home", "Components", "Breadcrumb")
  PreviewTheme {
    Breadcrumb(
      items = items,
      onItemClick = {},
    )
  }
}
