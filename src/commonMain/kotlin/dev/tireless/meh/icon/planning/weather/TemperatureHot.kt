// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureHot: ImageVector
  get() {
    val current = _temperatureHot
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TemperatureHot",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="2" x="26.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 13
          moveTo(x = 26.0f, y = 13.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="23.121" y="5.879" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.99968 7.5861063
          moveTo(x = 22.99968f, y = 7.5861063f)
          // l 2.828427 -2.828427
          lineToRelative(dx = 2.828427f, dy = -2.828427f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -2.828427 2.828427z
          lineToRelative(dx = -2.828427f, dy = 2.828427f)
          close()
        }
        // <rect width="2" height="4" x="24.121" y="19.121" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.99968 20.413895
          moveTo(x = 22.99968f, y = 20.413895f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.828427 2.828427
          lineToRelative(dx = 2.828427f, dy = 2.828427f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
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
        // M18 8 a6 6 0 0 0 -1 .09 v2.05 A4 4 0 0 1 18 10 a4 4 0 0 1 0 8 v2 a6 6 0 0 0 0 -12 m-8 12.18 V7 H8 v13.18 a3 3 0 1 0 2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 8
          moveTo(x = 18.0f, y = 8.0f)
          // a 6 6 0 0 0 -1 0.09
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.09f,
          )
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
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
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 6 6 0 0 0 0 -12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -12.0f,
          )
          // m -8 12.18
          moveToRelative(dx = -8.0f, dy = 12.18f)
          // V 7
          verticalLineTo(y = 7.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 13.18
          verticalLineToRelative(dy = 13.18f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
        }
        // M9 30 a7 7 0 0 1 -5 -11.89 V7 a5 5 0 0 1 10 0 v11.11 A7 7 0 0 1 9 30 M9 4 a3 3 0 0 0 -3 3 v11.98 l-.33 .3 a5 5 0 1 0 6.66 0 L12 18.98 V7 a3 3 0 0 0 -3 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 30
          moveTo(x = 9.0f, y = 30.0f)
          // a 7 7 0 0 1 -5 -11.89
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -11.89f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 5 5 0 0 1 10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = 0.0f,
          )
          // v 11.11
          verticalLineToRelative(dy = 11.11f)
          // A 7 7 0 0 1 9 30
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 30.0f,
          )
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 11.98
          verticalLineToRelative(dy = 11.98f)
          // l -0.33 0.3
          lineToRelative(dx = -0.33f, dy = 0.3f)
          // a 5 5 0 1 0 6.66 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.66f,
            dy1 = 0.0f,
          )
          // L 12 18.98
          lineTo(x = 12.0f, y = 18.98f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
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
      .also { _temperatureHot = it }
  }

@Suppress("ObjectPropertyName")
private var _temperatureHot: ImageVector? = null
