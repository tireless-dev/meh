// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronLeft: ImageVector
  get() {
    val current = _chevronLeft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronLeft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="10.0 16.0 20.0 6.0 21.4 7.4 12.8 16.0 21.4 24.6 20.0 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 21.4 7.4
          lineTo(x = 21.4f, y = 7.4f)
          // L 12.8 16
          lineTo(x = 12.8f, y = 16.0f)
          // L 21.4 24.6
          lineTo(x = 21.4f, y = 24.6f)
          // L 20 26z
          lineTo(x = 20.0f, y = 26.0f)
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
      .also { _chevronLeft = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronLeft: ImageVector? = null
