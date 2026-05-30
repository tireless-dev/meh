// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.dp

@Composable
fun Icon(
  image: ImageVector,
  modifier: Modifier = Modifier,
  contentDescription: String? = null,
  size: IconSize = IconSize.Medium,
  tint: Color = Color.Unspecified,
) {
  Image(
    painter = rememberVectorPainter(image),
    contentDescription = contentDescription,
    modifier =
    if (size == IconSize.Unspecified) {
      modifier
    } else {
      modifier.size(size.dp)
    },
    colorFilter = if (tint == Color.Unspecified) null else ColorFilter.tint(tint),
  )
}
