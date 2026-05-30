// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarHalf: ImageVector
  get() {
    val current = _starHalf
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StarHalf",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="11.45 11.22 1.28 12.7 8.64 19.87 6.9 30.0 16.0 25.22 16.0 2.0 11.45 11.22" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.45 11.22
          moveTo(x = 11.45f, y = 11.22f)
          // L 1.28 12.7
          lineTo(x = 1.28f, y = 12.7f)
          // L 8.64 19.87
          lineTo(x = 8.64f, y = 19.87f)
          // L 6.9 30
          lineTo(x = 6.9f, y = 30.0f)
          // L 16 25.22
          lineTo(x = 16.0f, y = 25.22f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 11.45 11.22z
          lineTo(x = 11.45f, y = 11.22f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _starHalf = it }
  }

@Suppress("ObjectPropertyName")
private var _starHalf: ImageVector? = null
