// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronDown: ImageVector
  get() {
    val current = _chevronDown
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronDown",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 22.0 6.0 12.0 7.4 10.6 16.0 19.2 24.6 10.6 26.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // L 6 12
          lineTo(x = 6.0f, y = 12.0f)
          // L 7.4 10.6
          lineTo(x = 7.4f, y = 10.6f)
          // L 16 19.2
          lineTo(x = 16.0f, y = 19.2f)
          // L 24.6 10.6
          lineTo(x = 24.6f, y = 10.6f)
          // L 26 12z
          lineTo(x = 26.0f, y = 12.0f)
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
      .also { _chevronDown = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronDown: ImageVector? = null
