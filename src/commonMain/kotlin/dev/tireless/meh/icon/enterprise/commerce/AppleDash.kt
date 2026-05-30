// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AppleDash: ImageVector
  get() {
    val current = _appleDash
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AppleDash",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m7.08 11.67 -1.67 -1.1 A10 10 0 0 0 4 15.92 h2 a8 8 0 0 1 1.08 -4.24 m-1 6.15 L4.1 18 a15 15 0 0 0 1.4 5.16 l1.8 -.9 a13 13 0 0 1 -1.2 -4.45 m2.16 5.98 -1.57 1.24 a7.4 7.4 0 0 0 4.84 2.93 l.2 -1.99 a5.5 5.5 0 0 1 -3.47 -2.18 M16 25 a7 7 0 0 0 -2.2 .53 l-.55 .2 .65 1.9 .58 -.22 C15.04 27.21 15.62 27 16 27 s.96 .21 1.51 .41 l.55 .2 .65 -1.9 -.51 -.18 C17.48 25.27 16.73 25 16 25 m4.25 .99 .19 1.99 a7.3 7.3 0 0 0 4.86 -2.9 l-1.56 -1.26 A5.4 5.4 0 0 1 20.25 26 m4.45 -3.68 1.79 .9 a15 15 0 0 0 1.41 -5.16 l-1.99 -.2 a13 13 0 0 1 -1.21 4.46 m3.3 -6.36 c0 -2.1 -.49 -3.94 -1.38 -5.33 l-1.68 1.08 A8 8 0 0 1 26 15.96z M20 4 h-1 a2 2 0 0 0 -2 2 v1 h1 a2 2 0 0 0 2 -2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.08 11.67
          moveTo(x = 7.08f, y = 11.67f)
          // l -1.67 -1.1
          lineToRelative(dx = -1.67f, dy = -1.1f)
          // A 10 10 0 0 0 4 15.92
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 15.92f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 0 1 1.08 -4.24
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.08f,
            dy1 = -4.24f,
          )
          // m -1 6.15
          moveToRelative(dx = -1.0f, dy = 6.15f)
          // L 4.1 18
          lineTo(x = 4.1f, y = 18.0f)
          // a 15 15 0 0 0 1.4 5.16
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 5.16f,
          )
          // l 1.8 -0.9
          lineToRelative(dx = 1.8f, dy = -0.9f)
          // a 13 13 0 0 1 -1.2 -4.45
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.2f,
            dy1 = -4.45f,
          )
          // m 2.16 5.98
          moveToRelative(dx = 2.16f, dy = 5.98f)
          // l -1.57 1.24
          lineToRelative(dx = -1.57f, dy = 1.24f)
          // a 7.4 7.4 0 0 0 4.84 2.93
          arcToRelative(
            a = 7.4f,
            b = 7.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.84f,
            dy1 = 2.93f,
          )
          // l 0.2 -1.99
          lineToRelative(dx = 0.2f, dy = -1.99f)
          // a 5.5 5.5 0 0 1 -3.47 -2.18
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.47f,
            dy1 = -2.18f,
          )
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // a 7 7 0 0 0 -2.2 0.53
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.2f,
            dy1 = 0.53f,
          )
          // l -0.55 0.2
          lineToRelative(dx = -0.55f, dy = 0.2f)
          // l 0.65 1.9
          lineToRelative(dx = 0.65f, dy = 1.9f)
          // l 0.58 -0.22
          lineToRelative(dx = 0.58f, dy = -0.22f)
          // C 15.04 27.21 15.62 27 16 27
          curveTo(
            x1 = 15.04f,
            y1 = 27.21f,
            x2 = 15.62f,
            y2 = 27.0f,
            x3 = 16.0f,
            y3 = 27.0f,
          )
          // s 0.96 0.21 1.51 0.41
          reflectiveCurveToRelative(
            dx1 = 0.96f,
            dy1 = 0.21f,
            dx2 = 1.51f,
            dy2 = 0.41f,
          )
          // l 0.55 0.2
          lineToRelative(dx = 0.55f, dy = 0.2f)
          // l 0.65 -1.9
          lineToRelative(dx = 0.65f, dy = -1.9f)
          // l -0.51 -0.18
          lineToRelative(dx = -0.51f, dy = -0.18f)
          // C 17.48 25.27 16.73 25 16 25
          curveTo(
            x1 = 17.48f,
            y1 = 25.27f,
            x2 = 16.73f,
            y2 = 25.0f,
            x3 = 16.0f,
            y3 = 25.0f,
          )
          // m 4.25 0.99
          moveToRelative(dx = 4.25f, dy = 0.99f)
          // l 0.19 1.99
          lineToRelative(dx = 0.19f, dy = 1.99f)
          // a 7.3 7.3 0 0 0 4.86 -2.9
          arcToRelative(
            a = 7.3f,
            b = 7.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.86f,
            dy1 = -2.9f,
          )
          // l -1.56 -1.26
          lineToRelative(dx = -1.56f, dy = -1.26f)
          // A 5.4 5.4 0 0 1 20.25 26
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.25f,
            y1 = 26.0f,
          )
          // m 4.45 -3.68
          moveToRelative(dx = 4.45f, dy = -3.68f)
          // l 1.79 0.9
          lineToRelative(dx = 1.79f, dy = 0.9f)
          // a 15 15 0 0 0 1.41 -5.16
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = -5.16f,
          )
          // l -1.99 -0.2
          lineToRelative(dx = -1.99f, dy = -0.2f)
          // a 13 13 0 0 1 -1.21 4.46
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.21f,
            dy1 = 4.46f,
          )
          // m 3.3 -6.36
          moveToRelative(dx = 3.3f, dy = -6.36f)
          // c 0 -2.1 -0.49 -3.94 -1.38 -5.33
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.1f,
            dx2 = -0.49f,
            dy2 = -3.94f,
            dx3 = -1.38f,
            dy3 = -5.33f,
          )
          // l -1.68 1.08
          lineToRelative(dx = -1.68f, dy = 1.08f)
          // A 8 8 0 0 1 26 15.96z
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 15.96f,
          )
          close()
          // M 20 4
          moveTo(x = 20.0f, y = 4.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 2 2 0 0 0 2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          close()
        }
        // m23.81 10.53 1.1 -1.67 A5 5 0 0 0 22 8 c-1.42 0 -2.42 .29 -3.3 .54 a11 11 0 0 1 -1.8 .4 A6 6 0 0 0 11 4 v2 a4 4 0 0 1 3.83 2.9 13 13 0 0 1 -1.53 -.36 C12.42 8.3 11.42 8 10 8 a5 5 0 0 0 -2.92 .86 l1.1 1.67 A3.2 3.2 0 0 1 10 10 c1.13 0 1.92 .23 2.75 .46 C13.67 10.73 14.6 11 16 11 s2.33 -.27 3.25 -.54 C20.08 10.23 20.87 10 22 10 a3.2 3.2 0 0 1 1.81 .53
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.81 10.53
          moveTo(x = 23.81f, y = 10.53f)
          // l 1.1 -1.67
          lineToRelative(dx = 1.1f, dy = -1.67f)
          // A 5 5 0 0 0 22 8
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 8.0f,
          )
          // c -1.42 0 -2.42 0.29 -3.3 0.54
          curveToRelative(
            dx1 = -1.42f,
            dy1 = 0.0f,
            dx2 = -2.42f,
            dy2 = 0.29f,
            dx3 = -3.3f,
            dy3 = 0.54f,
          )
          // a 11 11 0 0 1 -1.8 0.4
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.8f,
            dy1 = 0.4f,
          )
          // A 6 6 0 0 0 11 4
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 4.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 4 4 0 0 1 3.83 2.9
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.83f,
            dy1 = 2.9f,
          )
          // a 13 13 0 0 1 -1.53 -0.36
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.53f,
            dy1 = -0.36f,
          )
          // C 12.42 8.3 11.42 8 10 8
          curveTo(
            x1 = 12.42f,
            y1 = 8.3f,
            x2 = 11.42f,
            y2 = 8.0f,
            x3 = 10.0f,
            y3 = 8.0f,
          )
          // a 5 5 0 0 0 -2.92 0.86
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.92f,
            dy1 = 0.86f,
          )
          // l 1.1 1.67
          lineToRelative(dx = 1.1f, dy = 1.67f)
          // A 3.2 3.2 0 0 1 10 10
          arcTo(
            horizontalEllipseRadius = 3.2f,
            verticalEllipseRadius = 3.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 10.0f,
          )
          // c 1.13 0 1.92 0.23 2.75 0.46
          curveToRelative(
            dx1 = 1.13f,
            dy1 = 0.0f,
            dx2 = 1.92f,
            dy2 = 0.23f,
            dx3 = 2.75f,
            dy3 = 0.46f,
          )
          // C 13.67 10.73 14.6 11 16 11
          curveTo(
            x1 = 13.67f,
            y1 = 10.73f,
            x2 = 14.6f,
            y2 = 11.0f,
            x3 = 16.0f,
            y3 = 11.0f,
          )
          // s 2.33 -0.27 3.25 -0.54
          reflectiveCurveToRelative(
            dx1 = 2.33f,
            dy1 = -0.27f,
            dx2 = 3.25f,
            dy2 = -0.54f,
          )
          // C 20.08 10.23 20.87 10 22 10
          curveTo(
            x1 = 20.08f,
            y1 = 10.23f,
            x2 = 20.87f,
            y2 = 10.0f,
            x3 = 22.0f,
            y3 = 10.0f,
          )
          // a 3.2 3.2 0 0 1 1.81 0.53
          arcToRelative(
            a = 3.2f,
            b = 3.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.81f,
            dy1 = 0.53f,
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
      .also { _appleDash = it }
  }

@Suppress("ObjectPropertyName")
private var _appleDash: ImageVector? = null
