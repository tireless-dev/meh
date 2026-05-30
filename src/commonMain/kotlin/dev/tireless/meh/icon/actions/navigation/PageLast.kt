// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PageLast: ImageVector
  get() {
    val current = _pageLast
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PageLast",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.0 16.0 8.0 26.0 6.6 24.6 15.2 16.0 6.6 7.4 8.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 16
          moveTo(x = 18.0f, y = 16.0f)
          // L 8 26
          lineTo(x = 8.0f, y = 26.0f)
          // L 6.6 24.6
          lineTo(x = 6.6f, y = 24.6f)
          // L 15.2 16
          lineTo(x = 15.2f, y = 16.0f)
          // L 6.6 7.4
          lineTo(x = 6.6f, y = 7.4f)
          // L 8 6z
          lineTo(x = 8.0f, y = 6.0f)
          close()
        }
        // <rect width="2" height="24" x="22.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
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
      .also { _pageLast = it }
  }

@Suppress("ObjectPropertyName")
private var _pageLast: ImageVector? = null
