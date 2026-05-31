// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Pagination
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "Pagination", showBackground = true)
@Composable
internal fun PaginationPreview() {
  PreviewTheme {
    Pagination(
      page = 1,
      totalItems = 103,
      pageSize = 10,
      onPageChange = {},
      onPageSizeChange = {}
    )
  }
}
