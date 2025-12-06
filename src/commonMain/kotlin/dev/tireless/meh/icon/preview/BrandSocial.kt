// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.preview

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
  name = "Icon Pack - Brand / Social",
  showBackground = true,
  widthDp = PREVIEW_WIDTH_DP,
  heightDp = PREVIEW_HEIGHT_DP,
)
@Composable
private fun IconPackBrandSocialPreview() {
  IconSubcategoryPreview(
    categoryName = "Brand",
    subcategoryName = "Social",
  )
}
