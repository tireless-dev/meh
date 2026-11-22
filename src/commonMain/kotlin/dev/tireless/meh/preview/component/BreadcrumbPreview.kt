// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Breadcrumb
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.BreadcrumbSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 640)
@Preview(name = "Dark", widthDp = 640, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun BreadcrumbPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
    ) {
      Breadcrumb(
        items = listOf("Breadcrumb 1", "Breadcrumb 2", "Breadcrumb 3"),
        onItemClick = {},
        noTrailingSlash = false,
      )

      Breadcrumb(
        items = listOf("Home", "Components", "Breadcrumb"),
        onItemClick = {},
      )

      Breadcrumb(
        size = BreadcrumbSize.Small,
        noTrailingSlash = true,
      ) {
        item("Breadcrumb 1", onClick = {})
        item("Breadcrumb 2", onClick = {})
        item("Current page", isCurrentPage = true)
      }

      val linkHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
      val linkFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
      val linkActiveSource = rememberPreviewInteractionSource(PreviewInteractionState.Active)
      Breadcrumb(
        noTrailingSlash = true,
      ) {
        item("Enabled", onClick = {})
        item(
          text = "Hover",
          onClick = {},
          interactionSource = linkHoverSource,
        )
        item(
          text = "Focus",
          onClick = {},
          interactionSource = linkFocusSource,
        )
        item(
          text = "Active",
          onClick = {},
          interactionSource = linkActiveSource,
        )
        item("Current", isCurrentPage = true)
      }

      val overflowHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
      val overflowFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
      Breadcrumb(
        noTrailingSlash = true,
      ) {
        item("Breadcrumb 1", onClick = {})
        overflow(
          items = listOf("Breadcrumb 2", "Breadcrumb 3"),
          onItemClick = {},
        )
        overflow(
          items = listOf("Breadcrumb 2", "Breadcrumb 3"),
          onItemClick = {},
          interactionSource = overflowHoverSource,
        )
        overflow(
          items = listOf("Breadcrumb 2", "Breadcrumb 3"),
          onItemClick = {},
          interactionSource = overflowFocusSource,
        )
        item("Breadcrumb 4", onClick = {})
        item("Current page", isCurrentPage = true)
      }

      Breadcrumb(
        size = BreadcrumbSize.Small,
        noTrailingSlash = true,
      ) {
        item("Breadcrumb 1", onClick = {})
        overflow(
          items = listOf("Breadcrumb 2", "Breadcrumb 3"),
          onItemClick = {},
        )
        item("Breadcrumb 4", onClick = {})
        item("Current page", isCurrentPage = true)
      }

      Breadcrumb(
        items = listOf(
          "Enterprise platform",
          "Design systems",
          "Carbon v11",
          "Navigation components",
          "Breadcrumb",
        ),
        onItemClick = {},
        modifier = Modifier.width(320.dp),
      )
    }
  }
}
