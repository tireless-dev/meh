// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Add: ImageVector
  get() {
    val current = _add
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Add",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 15.0 17.0 8.0 15.0 8.0 15.0 15.0 8.0 15.0 8.0 17.0 15.0 17.0 15.0 24.0 17.0 24.0 17.0 17.0 24.0 17.0 24.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 15
          moveTo(x = 17.0f, y = 15.0f)
          // L 17 8
          lineTo(x = 17.0f, y = 8.0f)
          // L 15 8
          lineTo(x = 15.0f, y = 8.0f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 8 17
          lineTo(x = 8.0f, y = 17.0f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // L 15 24
          lineTo(x = 15.0f, y = 24.0f)
          // L 17 24
          lineTo(x = 17.0f, y = 24.0f)
          // L 17 17
          lineTo(x = 17.0f, y = 17.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 24 15z
          lineTo(x = 24.0f, y = 15.0f)
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
      .also { _add = it }
  }

@Suppress("ObjectPropertyName")
private var _add: ImageVector? = null
