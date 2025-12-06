// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
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
  contentDescription: String?,
  modifier: Modifier = Modifier,
  size: IconSize = IconSize.Medium,
  tint: Color = Color.Unspecified,
) {
  val sizedModifier =
    if (size == IconSize.Unspecified) {
      modifier
    } else {
      modifier.size(size.dp)
    }

  Image(
    painter = rememberVectorPainter(image),
    contentDescription = contentDescription,
    modifier = sizedModifier,
    colorFilter = if (tint == Color.Unspecified) null else ColorFilter.tint(tint),
  )
}
