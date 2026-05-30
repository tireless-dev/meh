// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUp: ImageVector
  get() {
    val current = _arrowUp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrowUp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 4.0 6.0 14.0 7.41 15.41 15.0 7.83 15.0 28.0 17.0 28.0 17.0 7.83 24.59 15.41 26.0 14.0 16.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // L 6 14
          lineTo(x = 6.0f, y = 14.0f)
          // L 7.41 15.41
          lineTo(x = 7.41f, y = 15.41f)
          // L 15 7.83
          lineTo(x = 15.0f, y = 7.83f)
          // L 15 28
          lineTo(x = 15.0f, y = 28.0f)
          // L 17 28
          lineTo(x = 17.0f, y = 28.0f)
          // L 17 7.83
          lineTo(x = 17.0f, y = 7.83f)
          // L 24.59 15.41
          lineTo(x = 24.59f, y = 15.41f)
          // L 26 14
          lineTo(x = 26.0f, y = 14.0f)
          // L 16 4z
          lineTo(x = 16.0f, y = 4.0f)
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
      .also { _arrowUp = it }
  }

@Suppress("ObjectPropertyName")
private var _arrowUp: ImageVector? = null
