// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WeatherFrontWarm: ImageVector
  get() {
    val current = _weatherFrontWarm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WeatherFrontWarm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.17 2 a13 13 0 0 0 -12.55 9.58 l-1.17 4.31 A11 11 0 0 1 3.83 24 H2 v2 h1.83 a13 13 0 0 0 3.47 -.48 4 4 0 1 0 6.59 -4.29 13 13 0 0 0 1.62 -2.53 4 4 0 1 0 2.37 -7.6 11 11 0 0 1 1.73 -3 3.98 3.98 0 0 0 6.9 -3.97 A11 11 0 0 1 28.17 4 H30 V2Z M11 26 a2 2 0 0 1 -1.81 -1.17 13 13 0 0 0 3.3 -2.14 A1.98 1.98 0 0 1 11 26 m8 -11 a2 2 0 0 1 -2.76 1.85 l.14 -.43 .92 -3.39 A2 2 0 0 1 19 15 m6 -9 a2 2 0 0 1 -3.9 .59 11 11 0 0 1 3.36 -1.94 A2 2 0 0 1 25 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.17 2
          moveTo(x = 28.17f, y = 2.0f)
          // a 13 13 0 0 0 -12.55 9.58
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.55f,
            dy1 = 9.58f,
          )
          // l -1.17 4.31
          lineToRelative(dx = -1.17f, dy = 4.31f)
          // A 11 11 0 0 1 3.83 24
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.83f,
            y1 = 24.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 1.83
          horizontalLineToRelative(dx = 1.83f)
          // a 13 13 0 0 0 3.47 -0.48
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.47f,
            dy1 = -0.48f,
          )
          // a 4 4 0 1 0 6.59 -4.29
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.59f,
            dy1 = -4.29f,
          )
          // a 13 13 0 0 0 1.62 -2.53
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.62f,
            dy1 = -2.53f,
          )
          // a 4 4 0 1 0 2.37 -7.6
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.37f,
            dy1 = -7.6f,
          )
          // a 11 11 0 0 1 1.73 -3
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.73f,
            dy1 = -3.0f,
          )
          // a 3.98 3.98 0 0 0 6.9 -3.97
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.9f,
            dy1 = -3.97f,
          )
          // A 11 11 0 0 1 28.17 4
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.17f,
            y1 = 4.0f,
          )
          // H 30
          horizontalLineTo(x = 30.0f)
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // M 11 26
          moveTo(x = 11.0f, y = 26.0f)
          // a 2 2 0 0 1 -1.81 -1.17
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.81f,
            dy1 = -1.17f,
          )
          // a 13 13 0 0 0 3.3 -2.14
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.3f,
            dy1 = -2.14f,
          )
          // A 1.98 1.98 0 0 1 11 26
          arcTo(
            horizontalEllipseRadius = 1.98f,
            verticalEllipseRadius = 1.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 26.0f,
          )
          // m 8 -11
          moveToRelative(dx = 8.0f, dy = -11.0f)
          // a 2 2 0 0 1 -2.76 1.85
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.76f,
            dy1 = 1.85f,
          )
          // l 0.14 -0.43
          lineToRelative(dx = 0.14f, dy = -0.43f)
          // l 0.92 -3.39
          lineToRelative(dx = 0.92f, dy = -3.39f)
          // A 2 2 0 0 1 19 15
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 15.0f,
          )
          // m 6 -9
          moveToRelative(dx = 6.0f, dy = -9.0f)
          // a 2 2 0 0 1 -3.9 0.59
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.9f,
            dy1 = 0.59f,
          )
          // a 11 11 0 0 1 3.36 -1.94
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.36f,
            dy1 = -1.94f,
          )
          // A 2 2 0 0 1 25 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 6.0f,
          )
        }
        // <polygon points="10.0 4.0 10.0 8.586 3.414 2.0 2.0 3.414 8.586 10.0 4.0 10.0 4.0 12.0 12.0 12.0 12.0 4.0 10.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 4
          moveTo(x = 10.0f, y = 4.0f)
          // L 10 8.586
          lineTo(x = 10.0f, y = 8.586f)
          // L 3.414 2
          lineTo(x = 3.414f, y = 2.0f)
          // L 2 3.414
          lineTo(x = 2.0f, y = 3.414f)
          // L 8.586 10
          lineTo(x = 8.586f, y = 10.0f)
          // L 4 10
          lineTo(x = 4.0f, y = 10.0f)
          // L 4 12
          lineTo(x = 4.0f, y = 12.0f)
          // L 12 12
          lineTo(x = 12.0f, y = 12.0f)
          // L 12 4
          lineTo(x = 12.0f, y = 4.0f)
          // L 10 4z
          lineTo(x = 10.0f, y = 4.0f)
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
      .also { _weatherFrontWarm = it }
  }

@Suppress("ObjectPropertyName")
private var _weatherFrontWarm: ImageVector? = null
