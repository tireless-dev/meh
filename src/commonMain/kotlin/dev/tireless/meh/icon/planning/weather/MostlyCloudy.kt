// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MostlyCloudy: ImageVector
  get() {
    val current = _mostlyCloudy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MostlyCloudy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.74 18.7 a6 6 0 0 0 1.06 -1.1 6 6 0 1 0 -10.73 -4.44 7.6 7.6 0 0 0 -5.72 5.09 A6 6 0 0 0 8 30 h11 a5.99 5.99 0 0 0 2.74 -11.32 M18 10 a4 4 0 0 1 4 4 4 4 0 0 1 -.8 2.4 4 4 0 0 1 -.94 .9 7.5 7.5 0 0 0 -6.13 -4.24 A4 4 0 0 1 18 10 m1 18 H8 a4 4 0 0 1 -.67 -7.93 l.66 -.1 .15 -.66 a5.5 5.5 0 0 1 10.72 0 l.15 .65 .66 .12 A4 4 0 0 1 19 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.74 18.7
          moveTo(x = 21.74f, y = 18.7f)
          // a 6 6 0 0 0 1.06 -1.1
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.06f,
            dy1 = -1.1f,
          )
          // a 6 6 0 1 0 -10.73 -4.44
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -10.73f,
            dy1 = -4.44f,
          )
          // a 7.6 7.6 0 0 0 -5.72 5.09
          arcToRelative(
            a = 7.6f,
            b = 7.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.72f,
            dy1 = 5.09f,
          )
          // A 6 6 0 0 0 8 30
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 30.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 5.99 5.99 0 0 0 2.74 -11.32
          arcToRelative(
            a = 5.99f,
            b = 5.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.74f,
            dy1 = -11.32f,
          )
          // M 18 10
          moveTo(x = 18.0f, y = 10.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 1 -0.8 2.4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = 2.4f,
          )
          // a 4 4 0 0 1 -0.94 0.9
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.94f,
            dy1 = 0.9f,
          )
          // a 7.5 7.5 0 0 0 -6.13 -4.24
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.13f,
            dy1 = -4.24f,
          )
          // A 4 4 0 0 1 18 10
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 10.0f,
          )
          // m 1 18
          moveToRelative(dx = 1.0f, dy = 18.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 4 4 0 0 1 -0.67 -7.93
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.67f,
            dy1 = -7.93f,
          )
          // l 0.66 -0.1
          lineToRelative(dx = 0.66f, dy = -0.1f)
          // l 0.15 -0.66
          lineToRelative(dx = 0.15f, dy = -0.66f)
          // a 5.5 5.5 0 0 1 10.72 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.72f,
            dy1 = 0.0f,
          )
          // l 0.15 0.65
          lineToRelative(dx = 0.15f, dy = 0.65f)
          // l 0.66 0.12
          lineToRelative(dx = 0.66f, dy = 0.12f)
          // A 4 4 0 0 1 19 28
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 28.0f,
          )
        }
        // <rect width="4" height="2" x="26.0" y="13.005" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 13.005
          moveTo(x = 26.0f, y = 13.005f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="23.071" y="5.929" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.950022 7.640936
          moveTo(x = 22.950022f, y = 7.640936f)
          // l 2.828427 -2.828427
          lineToRelative(dx = 2.828427f, dy = -2.828427f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.828427 2.828427z
          lineToRelative(dx = -2.828427f, dy = 2.828427f)
          close()
        }
        // <rect width="2" height="4" x="17.0" y="2.005" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 2.005
          moveTo(x = 17.0f, y = 2.005f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="9.929" y="4.929" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.8080225 6.2267227
          moveTo(x = 8.8080225f, y = 6.2267227f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.828427 2.828427
          lineToRelative(dx = 2.828427f, dy = 2.828427f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
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
      .also { _mostlyCloudy = it }
  }

@Suppress("ObjectPropertyName")
private var _mostlyCloudy: ImageVector? = null
