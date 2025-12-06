// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUpLeft: ImageVector
  get() {
    val current = _arrowUpLeft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrowUpLeft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 6.0 22.0 8.0 9.41 8.0 26.0 24.59 24.59 26.0 8.0 9.41 8.0 22.0 6.0 22.0 6.0 6.0 22.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 6
          moveTo(x = 22.0f, y = 6.0f)
          // L 22 8
          lineTo(x = 22.0f, y = 8.0f)
          // L 9.41 8
          lineTo(x = 9.41f, y = 8.0f)
          // L 26 24.59
          lineTo(x = 26.0f, y = 24.59f)
          // L 24.59 26
          lineTo(x = 24.59f, y = 26.0f)
          // L 8 9.41
          lineTo(x = 8.0f, y = 9.41f)
          // L 8 22
          lineTo(x = 8.0f, y = 22.0f)
          // L 6 22
          lineTo(x = 6.0f, y = 22.0f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // L 22 6z
          lineTo(x = 22.0f, y = 6.0f)
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
      .also { _arrowUpLeft = it }
  }

@Suppress("ObjectPropertyName")
private var _arrowUpLeft: ImageVector? = null
