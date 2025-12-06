// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Process: ImageVector
  get() {
    val current = _process
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Process",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 25 a2 2 0 0 0 -1.72 1 H4.65 l2.65 -5.1 A2.97 2.97 0 0 0 11 18 a3 3 0 0 0 -6 0 q.02 1.04 .62 1.8 l-3.5 6.74 A1 1 0 0 0 3 28 h7.28 A2 2 0 0 0 14 27 a2 2 0 0 0 -2 -2 m-4 -8 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m21.89 9.54 -4.04 -7.77 A2 2 0 1 0 24 20 l.22 -.02 L27.35 26 h-4.53 a3 3 0 1 0 0 2 H29 a1 1 0 0 0 .89 -1.46 M20 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m1 -20 a3 3 0 0 0 -.7 .1 l-3.41 -6.56 C16.72 1.2 16.36 1 16 1 s-.72 .2 -.89 .54 l-3.89 7.48 L11 9 a2 2 0 1 0 1.85 1.23 L16 4.17 l2.62 5.03 A3 3 0 1 0 21 8 m0 4 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 25
          moveTo(x = 12.0f, y = 25.0f)
          // a 2 2 0 0 0 -1.72 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.72f,
            dy1 = 1.0f,
          )
          // H 4.65
          horizontalLineTo(x = 4.65f)
          // l 2.65 -5.1
          lineToRelative(dx = 2.65f, dy = -5.1f)
          // A 2.97 2.97 0 0 0 11 18
          arcTo(
            horizontalEllipseRadius = 2.97f,
            verticalEllipseRadius = 2.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 18.0f,
          )
          // a 3 3 0 0 0 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // q 0.02 1.04 0.62 1.8
          quadToRelative(
            dx1 = 0.02f,
            dy1 = 1.04f,
            dx2 = 0.62f,
            dy2 = 1.8f,
          )
          // l -3.5 6.74
          lineToRelative(dx = -3.5f, dy = 6.74f)
          // A 1 1 0 0 0 3 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 28.0f,
          )
          // h 7.28
          horizontalLineToRelative(dx = 7.28f)
          // A 2 2 0 0 0 14 27
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 27.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -4 -8
          moveToRelative(dx = -4.0f, dy = -8.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // m 21.89 9.54
          moveToRelative(dx = 21.89f, dy = 9.54f)
          // l -4.04 -7.77
          lineToRelative(dx = -4.04f, dy = -7.77f)
          // A 2 2 0 1 0 24 20
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 20.0f,
          )
          // l 0.22 -0.02
          lineToRelative(dx = 0.22f, dy = -0.02f)
          // L 27.35 26
          lineTo(x = 27.35f, y = 26.0f)
          // h -4.53
          horizontalLineToRelative(dx = -4.53f)
          // a 3 3 0 1 0 0 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
          // a 1 1 0 0 0 0.89 -1.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.89f,
            dy1 = -1.46f,
          )
          // M 20 28
          moveTo(x = 20.0f, y = 28.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 1 -20
          moveToRelative(dx = 1.0f, dy = -20.0f)
          // a 3 3 0 0 0 -0.7 0.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 0.1f,
          )
          // l -3.41 -6.56
          lineToRelative(dx = -3.41f, dy = -6.56f)
          // C 16.72 1.2 16.36 1 16 1
          curveTo(
            x1 = 16.72f,
            y1 = 1.2f,
            x2 = 16.36f,
            y2 = 1.0f,
            x3 = 16.0f,
            y3 = 1.0f,
          )
          // s -0.72 0.2 -0.89 0.54
          reflectiveCurveToRelative(
            dx1 = -0.72f,
            dy1 = 0.2f,
            dx2 = -0.89f,
            dy2 = 0.54f,
          )
          // l -3.89 7.48
          lineToRelative(dx = -3.89f, dy = 7.48f)
          // L 11 9
          lineTo(x = 11.0f, y = 9.0f)
          // a 2 2 0 1 0 1.85 1.23
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.85f,
            dy1 = 1.23f,
          )
          // L 16 4.17
          lineTo(x = 16.0f, y = 4.17f)
          // l 2.62 5.03
          lineToRelative(dx = 2.62f, dy = 5.03f)
          // A 3 3 0 1 0 21 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 8.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
          dx1 = 0.0f,
          dy1 = 2.0f,
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
      .also { _process = it }
  }

@Suppress("ObjectPropertyName")
private var _process: ImageVector? = null
