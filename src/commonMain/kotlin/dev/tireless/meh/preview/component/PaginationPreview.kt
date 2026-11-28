// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Pagination
import dev.tireless.meh.component.PaginationNav
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun PaginationPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Pagination (Large / Medium / Disabled)", style = sectionStyle)

      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing04)) {
        Pagination(
          page = 1,
          totalItems = 103,
          pageSize = 10,
          onPageChange = {},
          onPageSizeChange = {},
        )
        Pagination(
          page = 4,
          totalItems = 103,
          pageSize = 20,
          onPageChange = {},
          onPageSizeChange = {},
          size = ControlSize.Medium,
        )
        Pagination(
          page = 1,
          totalItems = 50,
          pageSize = 10,
          onPageChange = {},
          onPageSizeChange = {},
          enabled = false,
        )
      }

      BasicText(text = "Pagination Nav", style = sectionStyle)

      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing04)) {
        PaginationNav(page = 1, totalPages = 5, onPageChange = {})
        PaginationNav(page = 5, totalPages = 12, onPageChange = {})
        PaginationNav(page = 3, totalPages = 5, onPageChange = {}, enabled = false)
      }
    }
  }
}
