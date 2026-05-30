// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Pagination
import dev.tireless.meh.theme.MehTheme

@Composable
fun PaginationPreview() {
  MehTheme {
    Pagination(
      page = 1,
      totalItems = 103,
      pageSize = 10,
      onPageChange = {},
      onPageSizeChange = {},
      modifier = Modifier.padding(16.dp)
    )
  }
}
