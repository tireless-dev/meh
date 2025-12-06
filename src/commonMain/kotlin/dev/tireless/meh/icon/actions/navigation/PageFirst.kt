// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PageFirst: ImageVector
  get() {
    val current = _pageFirst
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PageFirst",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="14.0 16.0 24.0 6.0 25.4 7.4 16.8 16.0 25.4 24.6 24.0 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 16
          moveTo(x = 14.0f, y = 16.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 25.4 7.4
          lineTo(x = 25.4f, y = 7.4f)
          // L 16.8 16
          lineTo(x = 16.8f, y = 16.0f)
          // L 25.4 24.6
          lineTo(x = 25.4f, y = 24.6f)
          // L 24 26z
          lineTo(x = 24.0f, y = 26.0f)
          close()
        }
        // <rect width="2" height="24" x="8.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 4
          moveTo(x = 8.0f, y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _pageFirst = it }
  }

@Suppress("ObjectPropertyName")
private var _pageFirst: ImageVector? = null
