// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TIF: ImageVector
  get() {
    val current = _tIF
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TIF",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 11.0 30.0 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 17.0 29.0 17.0 29.0 15.0 24.0 15.0 24.0 11.0 30.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11
          moveTo(x = 30.0f, y = 11.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 29 17
          lineTo(x = 29.0f, y = 17.0f)
          // L 29 15
          lineTo(x = 29.0f, y = 15.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 24 11
          lineTo(x = 24.0f, y = 11.0f)
          // L 30 11z
          lineTo(x = 30.0f, y = 11.0f)
          close()
        }
        // <polygon points="12.0 11.0 15.0 11.0 15.0 21.0 12.0 21.0 12.0 23.0 20.0 23.0 20.0 21.0 17.0 21.0 17.0 11.0 20.0 11.0 20.0 9.0 12.0 9.0 12.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 11
          moveTo(x = 12.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 11z
          lineTo(x = 12.0f, y = 11.0f)
          close()
        }
        // <polygon points="2.0 11.0 5.0 11.0 5.0 23.0 7.0 23.0 7.0 11.0 10.0 11.0 10.0 9.0 2.0 9.0 2.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 11
          moveTo(x = 2.0f, y = 11.0f)
          // L 5 11
          lineTo(x = 5.0f, y = 11.0f)
          // L 5 23
          lineTo(x = 5.0f, y = 23.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 7 11
          lineTo(x = 7.0f, y = 11.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 2 11z
          lineTo(x = 2.0f, y = 11.0f)
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
      .also { _tIF = it }
  }

@Suppress("ObjectPropertyName")
private var _tIF: ImageVector? = null
