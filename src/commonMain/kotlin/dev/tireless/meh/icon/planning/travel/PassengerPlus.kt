// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PassengerPlus: ImageVector
  get() {
    val current = _passengerPlus
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PassengerPlus",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10.5 9 A3.5 3.5 0 1 1 14 5.5 3.5 3.5 0 0 1 10.5 9 m0 -5 A1.5 1.5 0 1 0 12 5.5 1.5 1.5 0 0 0 10.5 4 m11.97 27.31 L19.34 24 h-7.1 a4 4 0 0 1 -3.87 -2.97 L6.74 14.9 a3.9 3.9 0 0 1 7.53 -2 L15.1 16 H21 v2 h-7.44 l-1.22 -4.6 a1.9 1.9 0 0 0 -3.67 .99 l1.63 6.12 A2 2 0 0 0 12.24 22 h8.42 l3.65 8.53Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.5 9
          moveTo(x = 10.5f, y = 9.0f)
          // A 3.5 3.5 0 1 1 14 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 5.5f,
          )
          // A 3.5 3.5 0 0 1 10.5 9
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.5f,
            y1 = 9.0f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // A 1.5 1.5 0 1 0 12 5.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 5.5f,
          )
          // A 1.5 1.5 0 0 0 10.5 4
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.5f,
            y1 = 4.0f,
          )
          // m 11.97 27.31
          moveToRelative(dx = 11.97f, dy = 27.31f)
          // L 19.34 24
          lineTo(x = 19.34f, y = 24.0f)
          // h -7.1
          horizontalLineToRelative(dx = -7.1f)
          // a 4 4 0 0 1 -3.87 -2.97
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.87f,
            dy1 = -2.97f,
          )
          // L 6.74 14.9
          lineTo(x = 6.74f, y = 14.9f)
          // a 3.9 3.9 0 0 1 7.53 -2
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.53f,
            dy1 = -2.0f,
          )
          // L 15.1 16
          lineTo(x = 15.1f, y = 16.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7.44
          horizontalLineToRelative(dx = -7.44f)
          // l -1.22 -4.6
          lineToRelative(dx = -1.22f, dy = -4.6f)
          // a 1.9 1.9 0 0 0 -3.67 0.99
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.67f,
            dy1 = 0.99f,
          )
          // l 1.63 6.12
          lineToRelative(dx = 1.63f, dy = 6.12f)
          // A 2 2 0 0 0 12.24 22
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.24f,
            y1 = 22.0f,
          )
          // h 8.42
          horizontalLineToRelative(dx = 8.42f)
          // l 3.65 8.53z
          lineToRelative(dx = 3.65f, dy = 8.53f)
          close()
        }
        // <polygon points="30.0 6.0 26.0 6.0 26.0 2.0 24.0 2.0 24.0 6.0 20.0 6.0 20.0 8.0 24.0 8.0 24.0 12.0 26.0 12.0 26.0 8.0 30.0 8.0 30.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 26 2
          lineTo(x = 26.0f, y = 2.0f)
          // L 24 2
          lineTo(x = 24.0f, y = 2.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 20 8
          lineTo(x = 20.0f, y = 8.0f)
          // L 24 8
          lineTo(x = 24.0f, y = 8.0f)
          // L 24 12
          lineTo(x = 24.0f, y = 12.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 26 8
          lineTo(x = 26.0f, y = 8.0f)
          // L 30 8
          lineTo(x = 30.0f, y = 8.0f)
          // L 30 6z
          lineTo(x = 30.0f, y = 6.0f)
          close()
        }
        // M18 28 H7.77 a2 2 0 0 1 -1.93 -1.48 l-3.8 -14.26 1.93 -.52 L7.77 26 H18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // H 7.77
          horizontalLineTo(x = 7.77f)
          // a 2 2 0 0 1 -1.93 -1.48
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.93f,
            dy1 = -1.48f,
          )
          // l -3.8 -14.26
          lineToRelative(dx = -3.8f, dy = -14.26f)
          // l 1.93 -0.52
          lineToRelative(dx = 1.93f, dy = -0.52f)
          // L 7.77 26
          lineTo(x = 7.77f, y = 26.0f)
          // H 18z
          horizontalLineTo(x = 18.0f)
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
      .also { _passengerPlus = it }
  }

@Suppress("ObjectPropertyName")
private var _passengerPlus: ImageVector? = null
