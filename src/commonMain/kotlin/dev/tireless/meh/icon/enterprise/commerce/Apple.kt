// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apple: ImageVector
  get() {
    val current = _apple
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Apple",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.78 8 a12 12 0 0 0 -3.06 .53 15 15 0 0 1 -1.82 .42 A6 6 0 0 0 11 4 v2 a4 4 0 0 1 3.83 2.9 20 20 0 0 1 -1.62 -.36 A13 13 0 0 0 10.03 8 C6.31 8 4 11.07 4 16 c0 7.51 4.07 12 8 12 a7 7 0 0 0 2.5 -.59 A5 5 0 0 1 16 27 a5 5 0 0 1 1.51 .41 A7 7 0 0 0 20 28 c3.93 0 8 -4.49 8 -12 0 -3.7 -1.63 -8 -6.22 -8 M20 26 a6 6 0 0 1 -1.79 -.46 A6 6 0 0 0 16 25 a6 6 0 0 0 -2.2 .54 A6 6 0 0 1 12 26 c-2.95 0 -6 -3.74 -6 -10 0 -1.8 .4 -6 4.03 -6 a11 11 0 0 1 2.68 .47 A13 13 0 0 0 15.76 11 h.5 a12 12 0 0 0 2.99 -.54 A10 10 0 0 1 21.78 10 C25.8 10 26 15 26 16 c0 6.26 -3.05 10 -6 10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.78 8
          moveTo(x = 21.78f, y = 8.0f)
          // a 12 12 0 0 0 -3.06 0.53
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.06f,
            dy1 = 0.53f,
          )
          // a 15 15 0 0 1 -1.82 0.42
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.82f,
            dy1 = 0.42f,
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
          // a 20 20 0 0 1 -1.62 -0.36
          arcToRelative(
            a = 20.0f,
            b = 20.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.62f,
            dy1 = -0.36f,
          )
          // A 13 13 0 0 0 10.03 8
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.03f,
            y1 = 8.0f,
          )
          // C 6.31 8 4 11.07 4 16
          curveTo(
            x1 = 6.31f,
            y1 = 8.0f,
            x2 = 4.0f,
            y2 = 11.07f,
            x3 = 4.0f,
            y3 = 16.0f,
          )
          // c 0 7.51 4.07 12 8 12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 7.51f,
            dx2 = 4.07f,
            dy2 = 12.0f,
            dx3 = 8.0f,
            dy3 = 12.0f,
          )
          // a 7 7 0 0 0 2.5 -0.59
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = -0.59f,
          )
          // A 5 5 0 0 1 16 27
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 27.0f,
          )
          // a 5 5 0 0 1 1.51 0.41
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.51f,
            dy1 = 0.41f,
          )
          // A 7 7 0 0 0 20 28
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 28.0f,
          )
          // c 3.93 0 8 -4.49 8 -12
          curveToRelative(
            dx1 = 3.93f,
            dy1 = 0.0f,
            dx2 = 8.0f,
            dy2 = -4.49f,
            dx3 = 8.0f,
            dy3 = -12.0f,
          )
          // c 0 -3.7 -1.63 -8 -6.22 -8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.7f,
            dx2 = -1.63f,
            dy2 = -8.0f,
            dx3 = -6.22f,
            dy3 = -8.0f,
          )
          // M 20 26
          moveTo(x = 20.0f, y = 26.0f)
          // a 6 6 0 0 1 -1.79 -0.46
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.79f,
            dy1 = -0.46f,
          )
          // A 6 6 0 0 0 16 25
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 25.0f,
          )
          // a 6 6 0 0 0 -2.2 0.54
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.2f,
            dy1 = 0.54f,
          )
          // A 6 6 0 0 1 12 26
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 26.0f,
          )
          // c -2.95 0 -6 -3.74 -6 -10
          curveToRelative(
            dx1 = -2.95f,
            dy1 = 0.0f,
            dx2 = -6.0f,
            dy2 = -3.74f,
            dx3 = -6.0f,
            dy3 = -10.0f,
          )
          // c 0 -1.8 0.4 -6 4.03 -6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.8f,
            dx2 = 0.4f,
            dy2 = -6.0f,
            dx3 = 4.03f,
            dy3 = -6.0f,
          )
          // a 11 11 0 0 1 2.68 0.47
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.68f,
            dy1 = 0.47f,
          )
          // A 13 13 0 0 0 15.76 11
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.76f,
            y1 = 11.0f,
          )
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 12 12 0 0 0 2.99 -0.54
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.99f,
            dy1 = -0.54f,
          )
          // A 10 10 0 0 1 21.78 10
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.78f,
            y1 = 10.0f,
          )
          // C 25.8 10 26 15 26 16
          curveTo(
            x1 = 25.8f,
            y1 = 10.0f,
            x2 = 26.0f,
            y2 = 15.0f,
            x3 = 26.0f,
            y3 = 16.0f,
          )
          // c 0 6.26 -3.05 10 -6 10
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 6.26f,
            dx2 = -3.05f,
            dy2 = 10.0f,
            dx3 = -6.0f,
            dy3 = 10.0f,
          )
        }
        // M18 7 h-1 V6 a2 2 0 0 1 2 -2 h1 v1 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 7
          moveTo(x = 18.0f, y = 7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
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
      .also { _apple = it }
  }

@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
