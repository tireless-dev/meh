// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapCenter: ImageVector
  get() {
    val current = _mapCenter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MapCenter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="4" x="23.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 26
          moveTo(x = 23.0f, y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="23.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 18
          moveTo(x = 23.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="26.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 23
          moveTo(x = 26.0f, y = 23.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="18.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // m25.34 10.06 -22 -8 a1 1 0 0 0 -1.28 1.28 l8 22 A1 1 0 0 0 10.98 26 H11 a1 1 0 0 0 .93 -.63 l3.84 -9.6 9.6 -3.84 a1 1 0 0 0 -.03 -1.87 m-10.71 4.01 -.4 .16 -.16 .4 -3.03 7.57 L4.67 4.67 l17.53 6.37Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.34 10.06
          moveTo(x = 25.34f, y = 10.06f)
          // l -22 -8
          lineToRelative(dx = -22.0f, dy = -8.0f)
          // a 1 1 0 0 0 -1.28 1.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = 1.28f,
          )
          // l 8 22
          lineToRelative(dx = 8.0f, dy = 22.0f)
          // A 1 1 0 0 0 10.98 26
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.98f,
            y1 = 26.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 1 1 0 0 0 0.93 -0.63
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.93f,
            dy1 = -0.63f,
          )
          // l 3.84 -9.6
          lineToRelative(dx = 3.84f, dy = -9.6f)
          // l 9.6 -3.84
          lineToRelative(dx = 9.6f, dy = -3.84f)
          // a 1 1 0 0 0 -0.03 -1.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.03f,
            dy1 = -1.87f,
          )
          // m -10.71 4.01
          moveToRelative(dx = -10.71f, dy = 4.01f)
          // l -0.4 0.16
          lineToRelative(dx = -0.4f, dy = 0.16f)
          // l -0.16 0.4
          lineToRelative(dx = -0.16f, dy = 0.4f)
          // l -3.03 7.57
          lineToRelative(dx = -3.03f, dy = 7.57f)
          // L 4.67 4.67
          lineTo(x = 4.67f, y = 4.67f)
          // l 17.53 6.37z
          lineToRelative(dx = 17.53f, dy = 6.37f)
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
      .also { _mapCenter = it }
  }

@Suppress("ObjectPropertyName")
private var _mapCenter: ImageVector? = null
