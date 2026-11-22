// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Link
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.LinkSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 720)
@Preview(name = "Dark", widthDp = 720, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun LinkPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        LinkStateColumn(
          title = "Standalone",
          inline = false,
          icon = null,
        )
        LinkStateColumn(
          title = "With icon",
          inline = false,
          icon = Icons.ArrowRight,
        )
        LinkStateColumn(
          title = "Inline",
          inline = true,
          icon = null,
        )
      }

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        LinkSizeColumn(
          title = "Small",
          size = LinkSize.Small,
        )
        LinkSizeColumn(
          title = "Medium",
          size = LinkSize.Medium,
        )
        LinkSizeColumn(
          title = "Large",
          size = LinkSize.Large,
        )
      }
    }
  }
}

@Composable
private fun LinkStateColumn(
  title: String,
  inline: Boolean,
  icon: ImageVector?,
) {
  val spacing = MehTheme.spacing
  Column(
    verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
  ) {
    Link(
      text = "$title (Enabled)",
      inline = inline,
      icon = icon,
      onClick = {},
    )
    Link(
      text = "$title (Hover)",
      inline = inline,
      icon = icon,
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover),
    )
    Link(
      text = "$title (Focus)",
      inline = inline,
      icon = icon,
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus),
    )
    Link(
      text = "$title (Active)",
      inline = inline,
      icon = icon,
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Active),
    )
    Link(
      text = "$title (Visited)",
      inline = inline,
      visited = true,
      icon = icon,
      onClick = {},
    )
    Link(
      text = "$title (Visited Hover)",
      inline = inline,
      visited = true,
      icon = icon,
      onClick = {},
      interactionSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover),
    )
    Link(
      text = "$title (Disabled)",
      enabled = false,
      inline = inline,
      icon = icon,
      onClick = {},
    )
  }
}

@Composable
private fun LinkSizeColumn(
  title: String,
  size: LinkSize,
) {
  val spacing = MehTheme.spacing
  Column(
    verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
  ) {
    Link(
      text = "$title link",
      size = size,
      onClick = {},
    )
    Link(
      text = "$title link with icon",
      size = size,
      icon = Icons.ArrowRight,
      onClick = {},
    )
    Link(
      text = "$title inline link",
      size = size,
      inline = true,
      onClick = {},
    )
  }
}
