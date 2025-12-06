// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrightnessContrast: ImageVector
  get() {
    val current = _brightnessContrast
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BrightnessContrast",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="3" x="15.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 2
          moveTo(x = 15.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="3" height="2" x="27.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 15
          moveTo(x = 27.0f, y = 15.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // <rect width="2" height="3" x="15.0" y="27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 27
          moveTo(x = 15.0f, y = 27.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="3" height="2" x="2.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 15
          moveTo(x = 2.0f, y = 15.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // <rect width="2" height="3" x="6.22" y="5.73" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.45004 6.883154
          moveTo(x = 5.45004f, y = 6.883154f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.1213202 2.1213202
          lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="3" height="2" x="23.27" y="6.23" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.999647 7.581312
          moveTo(x = 22.999647f, y = 7.581312f)
          // l 2.1213202 -2.1213202
          lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.1213202 2.1213202z
          lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
          close()
        }
        // <rect width="2" height="3" x="23.77" y="23.27" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.002232 24.416447
          moveTo(x = 23.002232f, y = 24.416447f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.1213202 2.1213202
          lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <polygon points="5.47 25.13 7.59 23.0 9.0 24.42 6.88 26.54 5.47 25.13" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.47 25.13
          moveTo(x = 5.47f, y = 25.13f)
          // L 7.59 23
          lineTo(x = 7.59f, y = 23.0f)
          // L 9 24.42
          lineTo(x = 9.0f, y = 24.42f)
          // L 6.88 26.54
          lineTo(x = 6.88f, y = 26.54f)
          // L 5.47 25.13z
          lineTo(x = 5.47f, y = 25.13f)
          close()
        }
        // M16 8 a8 8 0 1 0 8 8 8 8 0 0 0 -8 -8 m0 14 a6 6 0 0 1 0 -12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // a 8 8 0 1 0 8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 8.0f,
          )
          // a 8 8 0 0 0 -8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = -8.0f,
          )
          // m 0 14
          moveToRelative(dx = 0.0f, dy = 14.0f)
          // a 6 6 0 0 1 0 -12z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -12.0f,
          )
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
      .also { _brightnessContrast = it }
  }

@Suppress("ObjectPropertyName")
private var _brightnessContrast: ImageVector? = null
