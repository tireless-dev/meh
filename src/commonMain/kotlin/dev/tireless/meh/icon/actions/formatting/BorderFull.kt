// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BorderFull: ImageVector
  get() {
    val current = _borderFull
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BorderFull",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="10" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="6" height="2" x="8.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 15
          moveTo(x = 8.0f, y = 15.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // M29 29 H3 V3 h26Z M5 27 h22 V5 H5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 29
          moveTo(x = 29.0f, y = 29.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 26z
          horizontalLineToRelative(dx = 26.0f)
          close()
          // M 5 27
          moveTo(x = 5.0f, y = 27.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
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
      .also { _borderFull = it }
  }

@Suppress("ObjectPropertyName")
private var _borderFull: ImageVector? = null
