// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Haze: ImageVector
  get() {
    val current = _haze
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Haze",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 28 H3 a1 1 0 0 1 0 -2 h16 a1 1 0 0 1 0 2 m-4 -8 H3 a1 1 0 0 1 0 -2 h12 a1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 28
          moveTo(x = 19.0f, y = 28.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m -4 -8
          moveToRelative(dx = -4.0f, dy = -8.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
        }
        // <rect width="4" height="2" x="24.5" y="23.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.792894 22.37868
          moveTo(x = 25.792894f, y = 22.37868f)
          // l 2.828427 2.828427
          lineToRelative(dx = 2.828427f, dy = 2.828427f)
          // l -1.4142135 1.4142135
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          // l -2.828427 -2.828427z
          lineToRelative(dx = -2.828427f, dy = -2.828427f)
          close()
        }
        // <rect width="4" height="2" x="28.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 15
          moveTo(x = 28.0f, y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="24.5" y="6.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.37868 8.207106
          moveTo(x = 24.37868f, y = 8.207106f)
          // l 2.828427 -2.828427
          lineToRelative(dx = 2.828427f, dy = -2.828427f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.828427 2.828427z
          lineToRelative(dx = -2.828427f, dy = 2.828427f)
          close()
        }
        // <rect width="2" height="4" x="17.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 2
          moveTo(x = 17.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="7.5" y="6.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.207106 9.621321
          moveTo(x = 10.207106f, y = 9.621321f)
          // l -2.8284273 -2.8284268
          lineToRelative(dx = -2.8284273f, dy = -2.8284268f)
          // l 1.4142134 -1.4142137
          lineToRelative(dx = 1.4142134f, dy = -1.4142137f)
          // l 2.8284273 2.8284268z
          lineToRelative(dx = 2.8284273f, dy = 2.8284268f)
          close()
        }
        // M18 8 a8 8 0 0 0 -8 8 h2 a6 6 0 1 1 6 6 H7 a1 1 0 0 0 0 2 h11 a8 8 0 0 0 0 -16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 8
          moveTo(x = 18.0f, y = 8.0f)
          // a 8 8 0 0 0 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 8.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 1 1 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 1 1 0 0 0 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 8 8 0 0 0 0 -16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -16.0f,
          )
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
      .also { _haze = it }
  }

@Suppress("ObjectPropertyName")
private var _haze: ImageVector? = null
