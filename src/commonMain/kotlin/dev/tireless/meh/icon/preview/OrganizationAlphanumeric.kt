// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
  name = "Icon Pack - Organization / Alphanumeric",
  showBackground = true,
  widthDp = PREVIEW_WIDTH_DP,
  heightDp = PREVIEW_HEIGHT_DP,
)
@Composable
private fun IconPackOrganizationAlphanumericPreview() {
  IconSubcategoryPreview(
    categoryName = "Organization",
    subcategoryName = "Alphanumeric",
  )
}
