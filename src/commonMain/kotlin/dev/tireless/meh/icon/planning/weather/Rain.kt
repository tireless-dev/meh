// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rain: ImageVector
  get() {
    val current = _rain
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Rain",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.5 22 h-15 A6.5 6.5 0 0 1 7.2 9.14 a9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 22 M16 4 a7 7 0 0 0 -6.94 6.14 L9 11 H8.14 a4.5 4.5 0 0 0 .36 9 h15 a4.5 4.5 0 0 0 .36 -9 H23 l-.1 -.82 A7 7 0 0 0 16 4 m-2 26 a1 1 0 0 1 -.45 -.11 1 1 0 0 1 -.44 -1.34 l2 -4 a1 1 0 1 1 1.78 .9 l-2 4 A1 1 0 0 1 14 30 m6 0 a1 1 0 0 1 -.45 -.11 1 1 0 0 1 -.44 -1.34 l2 -4 a1 1 0 1 1 1.78 .9 l-2 4 A1 1 0 0 1 20 30 M8 30 a1 1 0 0 1 -.45 -.11 1 1 0 0 1 -.44 -1.34 l2 -4 a1 1 0 1 1 1.78 .9 l-2 4 A1 1 0 0 1 8 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 22
          moveTo(x = 23.5f, y = 22.0f)
          // h -15
          horizontalLineToRelative(dx = -15.0f)
          // A 6.5 6.5 0 0 1 7.2 9.14
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.2f,
            y1 = 9.14f,
          )
          // a 9 9 0 0 1 17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.6f,
            dy1 = 0.0f,
          )
          // A 6.5 6.5 0 0 1 23.5 22
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 22.0f,
          )
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // a 7 7 0 0 0 -6.94 6.14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.94f,
            dy1 = 6.14f,
          )
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // H 8.14
          horizontalLineTo(x = 8.14f)
          // a 4.5 4.5 0 0 0 0.36 9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = 9.0f,
          )
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // a 4.5 4.5 0 0 0 0.36 -9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = -9.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // l -0.1 -0.82
          lineToRelative(dx = -0.1f, dy = -0.82f)
          // A 7 7 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // m -2 26
          moveToRelative(dx = -2.0f, dy = 26.0f)
          // a 1 1 0 0 1 -0.45 -0.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.11f,
          )
          // a 1 1 0 0 1 -0.44 -1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = -1.34f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.78 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.78f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 14 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 30.0f,
          )
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // a 1 1 0 0 1 -0.45 -0.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.11f,
          )
          // a 1 1 0 0 1 -0.44 -1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = -1.34f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.78 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.78f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 20 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 30.0f,
          )
          // M 8 30
          moveTo(x = 8.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.45 -0.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.11f,
          )
          // a 1 1 0 0 1 -0.44 -1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = -1.34f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.78 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.78f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 8 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 30.0f,
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
      .also { _rain = it }
  }

@Suppress("ObjectPropertyName")
private var _rain: ImageVector? = null
