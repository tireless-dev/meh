// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoke: ImageVector
  get() {
    val current = _smoke
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Smoke",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 28 a1 1 0 0 1 -.8 -.4 l-.81 -1.09 a9 9 0 0 1 -1.6 -7.28 l1.47 -6.88 A7 7 0 0 0 24 6.7 L23.2 5.6 a1 1 0 1 1 1.6 -1.2 l.81 1.09 a9 9 0 0 1 1.6 7.28 l-1.47 6.88 A7 7 0 0 0 27 25.3 l.81 1.09 A1 1 0 0 1 27 28 m-5 0 a1 1 0 0 1 -.8 -.4 l-.81 -1.09 a9 9 0 0 1 -1.6 -7.28 l1.47 -6.88 A7 7 0 0 0 19 6.7 L18.2 5.6 a1 1 0 1 1 1.6 -1.2 l.81 1.09 a9 9 0 0 1 1.6 7.28 l-1.47 6.88 A7 7 0 0 0 22 25.3 l.81 1.09 A1 1 0 0 1 22 28 m-5 0 a1 1 0 0 1 -.8 -.4 l-.81 -1.09 a9 9 0 0 1 -1.6 -7.28 l1.47 -6.88 A7 7 0 0 0 14 6.7 L13.2 5.6 a1 1 0 1 1 1.6 -1.2 l.81 1.09 a9 9 0 0 1 1.6 7.28 l-1.47 6.88 A7 7 0 0 0 17 25.3 l.81 1.09 A1 1 0 0 1 17 28 m-5 0 a1 1 0 0 1 -.8 -.4 l-.81 -1.09 a9 9 0 0 1 -1.6 -7.28 l1.47 -6.88 A7 7 0 0 0 9 6.7 L8.2 5.6 a1 1 0 1 1 1.6 -1.2 l.81 1.09 a9 9 0 0 1 1.6 7.28 l-1.47 6.88 A7 7 0 0 0 12 25.3 l.81 1.09 A1 1 0 0 1 12 28 m-5 0 a1 1 0 0 1 -.8 -.4 l-.81 -1.09 a9 9 0 0 1 -1.6 -7.28 l1.47 -6.88 A7 7 0 0 0 4 6.7 L3.2 5.6 a1 1 0 1 1 1.6 -1.2 l.81 1.09 a9 9 0 0 1 1.6 7.28 l-1.47 6.88 A7 7 0 0 0 7 25.3 L7.8 26.4 A1 1 0 0 1 7 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 28
          moveTo(x = 27.0f, y = 28.0f)
          // a 1 1 0 0 1 -0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = -0.4f,
          )
          // l -0.81 -1.09
          lineToRelative(dx = -0.81f, dy = -1.09f)
          // a 9 9 0 0 1 -1.6 -7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -7.28f,
          )
          // l 1.47 -6.88
          lineToRelative(dx = 1.47f, dy = -6.88f)
          // A 7 7 0 0 0 24 6.7
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 6.7f,
          )
          // L 23.2 5.6
          lineTo(x = 23.2f, y = 5.6f)
          // a 1 1 0 1 1 1.6 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -1.2f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // a 9 9 0 0 1 1.6 7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = 7.28f,
          )
          // l -1.47 6.88
          lineToRelative(dx = -1.47f, dy = 6.88f)
          // A 7 7 0 0 0 27 25.3
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 25.3f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // A 1 1 0 0 1 27 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 28.0f,
          )
          // m -5 0
          moveToRelative(dx = -5.0f, dy = 0.0f)
          // a 1 1 0 0 1 -0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = -0.4f,
          )
          // l -0.81 -1.09
          lineToRelative(dx = -0.81f, dy = -1.09f)
          // a 9 9 0 0 1 -1.6 -7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -7.28f,
          )
          // l 1.47 -6.88
          lineToRelative(dx = 1.47f, dy = -6.88f)
          // A 7 7 0 0 0 19 6.7
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 6.7f,
          )
          // L 18.2 5.6
          lineTo(x = 18.2f, y = 5.6f)
          // a 1 1 0 1 1 1.6 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -1.2f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // a 9 9 0 0 1 1.6 7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = 7.28f,
          )
          // l -1.47 6.88
          lineToRelative(dx = -1.47f, dy = 6.88f)
          // A 7 7 0 0 0 22 25.3
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 25.3f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // A 1 1 0 0 1 22 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 28.0f,
          )
          // m -5 0
          moveToRelative(dx = -5.0f, dy = 0.0f)
          // a 1 1 0 0 1 -0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = -0.4f,
          )
          // l -0.81 -1.09
          lineToRelative(dx = -0.81f, dy = -1.09f)
          // a 9 9 0 0 1 -1.6 -7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -7.28f,
          )
          // l 1.47 -6.88
          lineToRelative(dx = 1.47f, dy = -6.88f)
          // A 7 7 0 0 0 14 6.7
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 6.7f,
          )
          // L 13.2 5.6
          lineTo(x = 13.2f, y = 5.6f)
          // a 1 1 0 1 1 1.6 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -1.2f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // a 9 9 0 0 1 1.6 7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = 7.28f,
          )
          // l -1.47 6.88
          lineToRelative(dx = -1.47f, dy = 6.88f)
          // A 7 7 0 0 0 17 25.3
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 25.3f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // A 1 1 0 0 1 17 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 28.0f,
          )
          // m -5 0
          moveToRelative(dx = -5.0f, dy = 0.0f)
          // a 1 1 0 0 1 -0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = -0.4f,
          )
          // l -0.81 -1.09
          lineToRelative(dx = -0.81f, dy = -1.09f)
          // a 9 9 0 0 1 -1.6 -7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -7.28f,
          )
          // l 1.47 -6.88
          lineToRelative(dx = 1.47f, dy = -6.88f)
          // A 7 7 0 0 0 9 6.7
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 6.7f,
          )
          // L 8.2 5.6
          lineTo(x = 8.2f, y = 5.6f)
          // a 1 1 0 1 1 1.6 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -1.2f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // a 9 9 0 0 1 1.6 7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = 7.28f,
          )
          // l -1.47 6.88
          lineToRelative(dx = -1.47f, dy = 6.88f)
          // A 7 7 0 0 0 12 25.3
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 25.3f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // A 1 1 0 0 1 12 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 28.0f,
          )
          // m -5 0
          moveToRelative(dx = -5.0f, dy = 0.0f)
          // a 1 1 0 0 1 -0.8 -0.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.8f,
            dy1 = -0.4f,
          )
          // l -0.81 -1.09
          lineToRelative(dx = -0.81f, dy = -1.09f)
          // a 9 9 0 0 1 -1.6 -7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -7.28f,
          )
          // l 1.47 -6.88
          lineToRelative(dx = 1.47f, dy = -6.88f)
          // A 7 7 0 0 0 4 6.7
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 6.7f,
          )
          // L 3.2 5.6
          lineTo(x = 3.2f, y = 5.6f)
          // a 1 1 0 1 1 1.6 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -1.2f,
          )
          // l 0.81 1.09
          lineToRelative(dx = 0.81f, dy = 1.09f)
          // a 9 9 0 0 1 1.6 7.28
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = 7.28f,
          )
          // l -1.47 6.88
          lineToRelative(dx = -1.47f, dy = 6.88f)
          // A 7 7 0 0 0 7 25.3
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          x1 = 7.0f,
          y1 = 25.3f,
        )
        // L 7.8 26.4
        lineTo(x = 7.8f, y = 26.4f)
        // A 1 1 0 0 1 7 28
        arcTo(
          horizontalEllipseRadius = 1.0f,
          verticalEllipseRadius = 1.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          x1 = 7.0f,
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
      .also { _smoke = it }
  }

@Suppress("ObjectPropertyName")
private var _smoke: ImageVector? = null
