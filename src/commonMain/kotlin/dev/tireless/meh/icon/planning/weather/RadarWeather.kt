// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RadarWeather: ImageVector
  get() {
    val current = _radarWeather
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RadarWeather",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 3.41 28.59 2 l-11.3 11.3 a1 1 0 1 0 1.42 1.4 l3.45 -3.45 a4.96 4.96 0 0 1 -3.88 7.72 7 7 0 0 0 -5.14 -3.87 A4.94 4.94 0 0 1 18 9 V7 a6.96 6.96 0 0 0 -6.9 8.08 7 7 0 0 0 -2.86 1.06 A9.97 9.97 0 0 1 18 4 V2 A11.98 11.98 0 0 0 6.57 17.64 a7 7 0 0 0 -1.36 2.7 A5 5 0 0 0 7 30 h10 a5 5 0 0 0 4.97 -4.68 A12 12 0 0 0 30 14 a12 12 0 0 0 -2.84 -7.75Z M17 28 H7 a3 3 0 0 1 -.7 -5.9 l.66 -.17 .1 -.67 a5 5 0 0 1 9.88 0 l.1 .67 .66 .16 A3 3 0 0 1 17 28 m11 -14 a10 10 0 0 1 -6.31 9.3 5 5 0 0 0 -2.02 -2.5 7 7 0 0 0 3.94 -11 l2.13 -2.12 A10 10 0 0 1 28 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // l -11.3 11.3
          lineToRelative(dx = -11.3f, dy = 11.3f)
          // a 1 1 0 1 0 1.42 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 1.4f,
          )
          // l 3.45 -3.45
          lineToRelative(dx = 3.45f, dy = -3.45f)
          // a 4.96 4.96 0 0 1 -3.88 7.72
          arcToRelative(
            a = 4.96f,
            b = 4.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.88f,
            dy1 = 7.72f,
          )
          // a 7 7 0 0 0 -5.14 -3.87
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.14f,
            dy1 = -3.87f,
          )
          // A 4.94 4.94 0 0 1 18 9
          arcTo(
            horizontalEllipseRadius = 4.94f,
            verticalEllipseRadius = 4.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 9.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 6.96 6.96 0 0 0 -6.9 8.08
          arcToRelative(
            a = 6.96f,
            b = 6.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.9f,
            dy1 = 8.08f,
          )
          // a 7 7 0 0 0 -2.86 1.06
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.86f,
            dy1 = 1.06f,
          )
          // A 9.97 9.97 0 0 1 18 4
          arcTo(
            horizontalEllipseRadius = 9.97f,
            verticalEllipseRadius = 9.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // A 11.98 11.98 0 0 0 6.57 17.64
          arcTo(
            horizontalEllipseRadius = 11.98f,
            verticalEllipseRadius = 11.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.57f,
            y1 = 17.64f,
          )
          // a 7 7 0 0 0 -1.36 2.7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.36f,
            dy1 = 2.7f,
          )
          // A 5 5 0 0 0 7 30
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 5 5 0 0 0 4.97 -4.68
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.97f,
            dy1 = -4.68f,
          )
          // A 12 12 0 0 0 30 14
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 14.0f,
          )
          // a 12 12 0 0 0 -2.84 -7.75z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.84f,
            dy1 = -7.75f,
          )
          close()
          // M 17 28
          moveTo(x = 17.0f, y = 28.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // A 3 3 0 0 1 17 28
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 28.0f,
          )
          // m 11 -14
          moveToRelative(dx = 11.0f, dy = -14.0f)
          // a 10 10 0 0 1 -6.31 9.3
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.31f,
            dy1 = 9.3f,
          )
          // a 5 5 0 0 0 -2.02 -2.5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.02f,
            dy1 = -2.5f,
          )
          // a 7 7 0 0 0 3.94 -11
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.94f,
            dy1 = -11.0f,
          )
          // l 2.13 -2.12
          lineToRelative(dx = 2.13f, dy = -2.12f)
          // A 10 10 0 0 1 28 14
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 14.0f,
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
      .also { _radarWeather = it }
  }

@Suppress("ObjectPropertyName")
private var _radarWeather: ImageVector? = null
