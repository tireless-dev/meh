// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloudy: ImageVector
  get() {
    val current = _cloudy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Cloudy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15.5 a6.5 6.5 0 0 0 -5.2 -6.36 9 9 0 0 0 -17.6 0 A6.5 6.5 0 0 0 2 15.5 a6.5 6.5 0 0 0 1.69 4.35 A5.98 5.98 0 0 0 8 30 h11 a5.98 5.98 0 0 0 5.6 -8.1 6.5 6.5 0 0 0 5.4 -6.4 M19 28 H8 a4 4 0 0 1 -.67 -7.93 l.66 -.11 .15 -.66 a5.5 5.5 0 0 1 10.73 0 L19 19.96 l.66 .11 A4 4 0 0 1 19 28 m4.5 -8 h-.06 a6 6 0 0 0 -2.8 -1.76 7.5 7.5 0 0 0 -14.29 0 6 6 0 0 0 -1.03 .41 A4.4 4.4 0 0 1 4 15.5 a4.5 4.5 0 0 1 4.14 -4.48 l.82 -.06 .1 -.82 a7 7 0 0 1 13.88 0 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 20
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15.5
          moveTo(x = 30.0f, y = 15.5f)
          // a 6.5 6.5 0 0 0 -5.2 -6.36
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.2f,
            dy1 = -6.36f,
          )
          // a 9 9 0 0 0 -17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -17.6f,
            dy1 = 0.0f,
          )
          // A 6.5 6.5 0 0 0 2 15.5
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 15.5f,
          )
          // a 6.5 6.5 0 0 0 1.69 4.35
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.69f,
            dy1 = 4.35f,
          )
          // A 5.98 5.98 0 0 0 8 30
          arcTo(
            horizontalEllipseRadius = 5.98f,
            verticalEllipseRadius = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 30.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 5.98 5.98 0 0 0 5.6 -8.1
          arcToRelative(
            a = 5.98f,
            b = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.6f,
            dy1 = -8.1f,
          )
          // a 6.5 6.5 0 0 0 5.4 -6.4
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.4f,
            dy1 = -6.4f,
          )
          // M 19 28
          moveTo(x = 19.0f, y = 28.0f)
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
          // l 0.66 -0.11
          lineToRelative(dx = 0.66f, dy = -0.11f)
          // l 0.15 -0.66
          lineToRelative(dx = 0.15f, dy = -0.66f)
          // a 5.5 5.5 0 0 1 10.73 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.73f,
            dy1 = 0.0f,
          )
          // L 19 19.96
          lineTo(x = 19.0f, y = 19.96f)
          // l 0.66 0.11
          lineToRelative(dx = 0.66f, dy = 0.11f)
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
          // m 4.5 -8
          moveToRelative(dx = 4.5f, dy = -8.0f)
          // h -0.06
          horizontalLineToRelative(dx = -0.06f)
          // a 6 6 0 0 0 -2.8 -1.76
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.8f,
            dy1 = -1.76f,
          )
          // a 7.5 7.5 0 0 0 -14.29 0
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -14.29f,
            dy1 = 0.0f,
          )
          // a 6 6 0 0 0 -1.03 0.41
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.03f,
            dy1 = 0.41f,
          )
          // A 4.4 4.4 0 0 1 4 15.5
          arcTo(
            horizontalEllipseRadius = 4.4f,
            verticalEllipseRadius = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 15.5f,
          )
          // a 4.5 4.5 0 0 1 4.14 -4.48
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.14f,
            dy1 = -4.48f,
          )
          // l 0.82 -0.06
          lineToRelative(dx = 0.82f, dy = -0.06f)
          // l 0.1 -0.82
          lineToRelative(dx = 0.1f, dy = -0.82f)
          // a 7 7 0 0 1 13.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 13.88f,
            dy1 = 0.0f,
          )
          // l 0.1 0.82
          lineToRelative(dx = 0.1f, dy = 0.82f)
          // l 0.82 0.06
          lineToRelative(dx = 0.82f, dy = 0.06f)
          // A 4.5 4.5 0 0 1 23.5 20
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 20.0f,
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
      .also { _cloudy = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudy: ImageVector? = null
