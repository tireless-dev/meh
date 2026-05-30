// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartlyCloudy: ImageVector
  get() {
    val current = _partlyCloudy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PartlyCloudy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="2" x="27.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 15
          moveTo(x = 27.0f, y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="23.086" y="5.794" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.00012 7.586668
          moveTo(x = 23.00012f, y = 7.586668f)
          // l 2.828427 -2.828427
          lineToRelative(dx = 2.828427f, dy = -2.828427f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.828427 2.828427z
          lineToRelative(dx = -2.828427f, dy = 2.828427f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 1
          moveTo(x = 15.0f, y = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="4.672" y="24.208" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.5861206 26.000668
          moveTo(x = 4.5861206f, y = 26.000668f)
          // l 2.828427 -2.828427
          lineToRelative(dx = 2.828427f, dy = -2.828427f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.828427 2.828427z
          lineToRelative(dx = -2.828427f, dy = 2.828427f)
          close()
        }
        // <rect width="2" height="4" x="5.793" y="4.672" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.585413 6.0006266
          moveTo(x = 4.585413f, y = 6.0006266f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.828427 2.828427
          lineToRelative(dx = 2.828427f, dy = 2.828427f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="4" height="2" x="1.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 1 15
          moveTo(x = 1.0f, y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M26.8 20.34 a7 7 0 0 0 -1.87 -3.27 A9 9 0 0 0 25 16 a9 9 0 1 0 -14.58 7.03 A4.98 4.98 0 0 0 15 30 h10 a5 5 0 0 0 1.8 -9.66 M9 16 a7 7 0 0 1 13.98 -.3 A7 7 0 0 0 20 15 a7.04 7.04 0 0 0 -6.8 5.34 5 5 0 0 0 -1.64 1.05 A7 7 0 0 1 9 16 m16 12 H15 a3 3 0 0 1 -.7 -5.9 l.66 -.17 .1 -.67 a5 5 0 0 1 9.88 0 l.1 .67 .66 .16 A3 3 0 0 1 25 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.8 20.34
          moveTo(x = 26.8f, y = 20.34f)
          // a 7 7 0 0 0 -1.87 -3.27
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.87f,
            dy1 = -3.27f,
          )
          // A 9 9 0 0 0 25 16
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 16.0f,
          )
          // a 9 9 0 1 0 -14.58 7.03
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -14.58f,
            dy1 = 7.03f,
          )
          // A 4.98 4.98 0 0 0 15 30
          arcTo(
            horizontalEllipseRadius = 4.98f,
            verticalEllipseRadius = 4.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 5 5 0 0 0 1.8 -9.66
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.8f,
            dy1 = -9.66f,
          )
          // M 9 16
          moveTo(x = 9.0f, y = 16.0f)
          // a 7 7 0 0 1 13.98 -0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 13.98f,
            dy1 = -0.3f,
          )
          // A 7 7 0 0 0 20 15
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 15.0f,
          )
          // a 7.04 7.04 0 0 0 -6.8 5.34
          arcToRelative(
            a = 7.04f,
            b = 7.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.8f,
            dy1 = 5.34f,
          )
          // a 5 5 0 0 0 -1.64 1.05
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.64f,
            dy1 = 1.05f,
          )
          // A 7 7 0 0 1 9 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 16.0f,
          )
          // m 16 12
          moveToRelative(dx = 16.0f, dy = 12.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // a 3 3 0 0 1 -0.7 -5.9
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -5.9f,
          )
          // l 0.66 -0.17
          lineToRelative(dx = 0.66f, dy = -0.17f)
          // l 0.1 -0.67
          lineToRelative(dx = 0.1f, dy = -0.67f)
          // a 5 5 0 0 1 9.88 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.88f,
            dy1 = 0.0f,
          )
          // l 0.1 0.67
          lineToRelative(dx = 0.1f, dy = 0.67f)
          // l 0.66 0.16
          lineToRelative(dx = 0.66f, dy = 0.16f)
          // A 3 3 0 0 1 25 28
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 28.0f,
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
      .also { _partlyCloudy = it }
  }

@Suppress("ObjectPropertyName")
private var _partlyCloudy: ImageVector? = null
