// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureMax: ImageVector
  get() {
    val current = _temperatureMax
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TemperatureMax",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="7" height="2" x="20.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="10" height="2" x="20.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="7" height="2" x="20.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // M10 20.18 V7 H8 v13.18 a3 3 0 1 0 2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 20.18
          moveTo(x = 10.0f, y = 20.18f)
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
        // M30 4 H12.97 A4.98 4.98 0 0 0 4 7 v11.11 a7 7 0 1 0 10 0 V7 a5 5 0 0 0 -.1 -1 H30Z M9 28 a5 5 0 0 1 -3.33 -8.72 L6 18.98 V7 a3 3 0 0 1 6 0 v11.98 l.33 .3 A5 5 0 0 1 9 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 4
          moveTo(x = 30.0f, y = 4.0f)
          // H 12.97
          horizontalLineTo(x = 12.97f)
          // A 4.98 4.98 0 0 0 4 7
          arcTo(
            horizontalEllipseRadius = 4.98f,
            verticalEllipseRadius = 4.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 7.0f,
          )
          // v 11.11
          verticalLineToRelative(dy = 11.11f)
          // a 7 7 0 1 0 10 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 10.0f,
            dy1 = 0.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 5 5 0 0 0 -0.1 -1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.1f,
            dy1 = -1.0f,
          )
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 9 28
          moveTo(x = 9.0f, y = 28.0f)
          // a 5 5 0 0 1 -3.33 -8.72
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.33f,
            dy1 = -8.72f,
          )
          // L 6 18.98
          lineTo(x = 6.0f, y = 18.98f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 3 3 0 0 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // v 11.98
          verticalLineToRelative(dy = 11.98f)
          // l 0.33 0.3
          lineToRelative(dx = 0.33f, dy = 0.3f)
          // A 5 5 0 0 1 9 28
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
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
      .also { _temperatureMax = it }
  }

@Suppress("ObjectPropertyName")
private var _temperatureMax: ImageVector? = null
