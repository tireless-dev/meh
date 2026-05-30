// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Watson: ImageVector
  get() {
    val current = _watson
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Watson",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.74 9.49 A11.4 11.4 0 0 0 16 8 a.76 .76 0 1 0 0 1.51 10 10 0 0 1 1.91 .21 c-2.26 1.08 -4.76 3.58 -6.73 7 a23 23 0 0 0 -2 4.44 A9.6 9.6 0 0 1 7 17.22 a3.4 3.4 0 0 1 .28 -2.66 c.79 -1.37 2.44 -2.15 4.63 -2.2 a.76 .76 0 0 0 .74 -.78 .75 .75 0 0 0 -.78 -.74 C9.19 10.88 7.1 11.92 6 13.74 a4.8 4.8 0 0 0 -.44 3.79 12 12 0 0 0 3.2 5.22 A11 11 0 0 0 8.52 26 a10 10 0 0 1 -2 -3.48 A.75 .75 0 0 0 5.57 22 a.76 .76 0 0 0 -.49 1 11.5 11.5 0 0 0 5.18 6.38 A11.4 11.4 0 0 0 16 30.92 a12 12 0 0 0 3 -.39 11.48 11.48 0 0 0 2.77 -21Z m-3.16 19.57 a10 10 0 0 1 -7.56 -1 c-.86 -.49 -1.21 -2 -.94 -4 a19 19 0 0 0 2.48 1.72 14 14 0 0 0 6.93 2 11 11 0 0 0 2.42 -.28 10 10 0 0 1 -3.33 1.56 m6.06 -4.66 c-2 2 -6.66 2.74 -11.32 .05 a17 17 0 0 1 -2.89 -2.12 21 21 0 0 1 2.08 -4.91 c2.94 -5.08 6.83 -7.57 8.47 -6.62 a10 10 0 0 1 3.66 13.6 M4.16 11.72 1.14 10 a.76 .76 0 1 0 -.76 1.31 L3.4 13 a1 1 0 0 0 .38 .1 .8 .8 0 0 0 .66 -.38 .76 .76 0 0 0 -.28 -1 m4.13 -4.13 A.7 .7 0 0 0 8.94 8 a1 1 0 0 0 .38 -.1 .76 .76 0 0 0 .28 -1 l-1.74 -3 a.76 .76 0 0 0 -1 -.27 .75 .75 0 0 0 -.28 1Z M16 6.08 a.76 .76 0 0 0 .76 -.76 V1.83 a.76 .76 0 0 0 -1.52 0 v3.49 A.76 .76 0 0 0 16 6.08 m6.68 1.79 a.75 .75 0 0 0 1 -.28 l1.75 -3 a.75 .75 0 0 0 -.28 -1 .76 .76 0 0 0 -1 .27 l-1.74 3 a.76 .76 0 0 0 .27 1.01 m9.22 2.38 a.76 .76 0 0 0 -1 -.27 l-3 1.74 a.76 .76 0 0 0 -.28 1 .8 .8 0 0 0 .66 .38 1 1 0 0 0 .38 -.1 l3 -1.75 a.76 .76 0 0 0 .24 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.74 9.49
          moveTo(x = 21.74f, y = 9.49f)
          // A 11.4 11.4 0 0 0 16 8
          arcTo(
            horizontalEllipseRadius = 11.4f,
            verticalEllipseRadius = 11.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // a 0.76 0.76 0 1 0 0 1.51
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.51f,
          )
          // a 10 10 0 0 1 1.91 0.21
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.91f,
            dy1 = 0.21f,
          )
          // c -2.26 1.08 -4.76 3.58 -6.73 7
          curveToRelative(
            dx1 = -2.26f,
            dy1 = 1.08f,
            dx2 = -4.76f,
            dy2 = 3.58f,
            dx3 = -6.73f,
            dy3 = 7.0f,
          )
          // a 23 23 0 0 0 -2 4.44
          arcToRelative(
            a = 23.0f,
            b = 23.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 4.44f,
          )
          // A 9.6 9.6 0 0 1 7 17.22
          arcTo(
            horizontalEllipseRadius = 9.6f,
            verticalEllipseRadius = 9.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.0f,
            y1 = 17.22f,
          )
          // a 3.4 3.4 0 0 1 0.28 -2.66
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.28f,
            dy1 = -2.66f,
          )
          // c 0.79 -1.37 2.44 -2.15 4.63 -2.2
          curveToRelative(
            dx1 = 0.79f,
            dy1 = -1.37f,
            dx2 = 2.44f,
            dy2 = -2.15f,
            dx3 = 4.63f,
            dy3 = -2.2f,
          )
          // a 0.76 0.76 0 0 0 0.74 -0.78
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.74f,
            dy1 = -0.78f,
          )
          // a 0.75 0.75 0 0 0 -0.78 -0.74
          arcToRelative(
            a = 0.75f,
            b = 0.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.78f,
            dy1 = -0.74f,
          )
          // C 9.19 10.88 7.1 11.92 6 13.74
          curveTo(
            x1 = 9.19f,
            y1 = 10.88f,
            x2 = 7.1f,
            y2 = 11.92f,
            x3 = 6.0f,
            y3 = 13.74f,
          )
          // a 4.8 4.8 0 0 0 -0.44 3.79
          arcToRelative(
            a = 4.8f,
            b = 4.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.44f,
            dy1 = 3.79f,
          )
          // a 12 12 0 0 0 3.2 5.22
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.2f,
            dy1 = 5.22f,
          )
          // A 11 11 0 0 0 8.52 26
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.52f,
            y1 = 26.0f,
          )
          // a 10 10 0 0 1 -2 -3.48
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -3.48f,
          )
          // A 0.75 0.75 0 0 0 5.57 22
          arcTo(
            horizontalEllipseRadius = 0.75f,
            verticalEllipseRadius = 0.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.57f,
            y1 = 22.0f,
          )
          // a 0.76 0.76 0 0 0 -0.49 1
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.49f,
            dy1 = 1.0f,
          )
          // a 11.5 11.5 0 0 0 5.18 6.38
          arcToRelative(
            a = 11.5f,
            b = 11.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.18f,
            dy1 = 6.38f,
          )
          // A 11.4 11.4 0 0 0 16 30.92
          arcTo(
            horizontalEllipseRadius = 11.4f,
            verticalEllipseRadius = 11.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 30.92f,
          )
          // a 12 12 0 0 0 3 -0.39
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -0.39f,
          )
          // a 11.48 11.48 0 0 0 2.77 -21z
          arcToRelative(
            a = 11.48f,
            b = 11.48f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.77f,
            dy1 = -21.0f,
          )
          close()
          // m -3.16 19.57
          moveToRelative(dx = -3.16f, dy = 19.57f)
          // a 10 10 0 0 1 -7.56 -1
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.56f,
            dy1 = -1.0f,
          )
          // c -0.86 -0.49 -1.21 -2 -0.94 -4
          curveToRelative(
            dx1 = -0.86f,
            dy1 = -0.49f,
            dx2 = -1.21f,
            dy2 = -2.0f,
            dx3 = -0.94f,
            dy3 = -4.0f,
          )
          // a 19 19 0 0 0 2.48 1.72
          arcToRelative(
            a = 19.0f,
            b = 19.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.48f,
            dy1 = 1.72f,
          )
          // a 14 14 0 0 0 6.93 2
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.93f,
            dy1 = 2.0f,
          )
          // a 11 11 0 0 0 2.42 -0.28
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.42f,
            dy1 = -0.28f,
          )
          // a 10 10 0 0 1 -3.33 1.56
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.33f,
            dy1 = 1.56f,
          )
          // m 6.06 -4.66
          moveToRelative(dx = 6.06f, dy = -4.66f)
          // c -2 2 -6.66 2.74 -11.32 0.05
          curveToRelative(
            dx1 = -2.0f,
            dy1 = 2.0f,
            dx2 = -6.66f,
            dy2 = 2.74f,
            dx3 = -11.32f,
            dy3 = 0.05f,
          )
          // a 17 17 0 0 1 -2.89 -2.12
          arcToRelative(
            a = 17.0f,
            b = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.89f,
            dy1 = -2.12f,
          )
          // a 21 21 0 0 1 2.08 -4.91
          arcToRelative(
            a = 21.0f,
            b = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.08f,
            dy1 = -4.91f,
          )
          // c 2.94 -5.08 6.83 -7.57 8.47 -6.62
          curveToRelative(
            dx1 = 2.94f,
            dy1 = -5.08f,
            dx2 = 6.83f,
            dy2 = -7.57f,
            dx3 = 8.47f,
            dy3 = -6.62f,
          )
          // a 10 10 0 0 1 3.66 13.6
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.66f,
            dy1 = 13.6f,
          )
          // M 4.16 11.72
          moveTo(x = 4.16f, y = 11.72f)
          // L 1.14 10
          lineTo(x = 1.14f, y = 10.0f)
          // a 0.76 0.76 0 1 0 -0.76 1.31
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -0.76f,
            dy1 = 1.31f,
          )
          // L 3.4 13
          lineTo(x = 3.4f, y = 13.0f)
          // a 1 1 0 0 0 0.38 0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.38f,
            dy1 = 0.1f,
          )
          // a 0.8 0.8 0 0 0 0.66 -0.38
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.66f,
            dy1 = -0.38f,
          )
          // a 0.76 0.76 0 0 0 -0.28 -1
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = -1.0f,
          )
          // m 4.13 -4.13
          moveToRelative(dx = 4.13f, dy = -4.13f)
          // A 0.7 0.7 0 0 0 8.94 8
          arcTo(
            horizontalEllipseRadius = 0.7f,
            verticalEllipseRadius = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.94f,
            y1 = 8.0f,
          )
          // a 1 1 0 0 0 0.38 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.38f,
            dy1 = -0.1f,
          )
          // a 0.76 0.76 0 0 0 0.28 -1
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = -1.0f,
          )
          // l -1.74 -3
          lineToRelative(dx = -1.74f, dy = -3.0f)
          // a 0.76 0.76 0 0 0 -1 -0.27
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -0.27f,
          )
          // a 0.75 0.75 0 0 0 -0.28 1z
          arcToRelative(
            a = 0.75f,
            b = 0.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = 1.0f,
          )
          close()
          // M 16 6.08
          moveTo(x = 16.0f, y = 6.08f)
          // a 0.76 0.76 0 0 0 0.76 -0.76
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.76f,
            dy1 = -0.76f,
          )
          // V 1.83
          verticalLineTo(y = 1.83f)
          // a 0.76 0.76 0 0 0 -1.52 0
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.52f,
            dy1 = 0.0f,
          )
          // v 3.49
          verticalLineToRelative(dy = 3.49f)
          // A 0.76 0.76 0 0 0 16 6.08
          arcTo(
            horizontalEllipseRadius = 0.76f,
            verticalEllipseRadius = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 6.08f,
          )
          // m 6.68 1.79
          moveToRelative(dx = 6.68f, dy = 1.79f)
          // a 0.75 0.75 0 0 0 1 -0.28
          arcToRelative(
            a = 0.75f,
            b = 0.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.28f,
          )
          // l 1.75 -3
          lineToRelative(dx = 1.75f, dy = -3.0f)
          // a 0.75 0.75 0 0 0 -0.28 -1
          arcToRelative(
            a = 0.75f,
            b = 0.75f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = -1.0f,
          )
          // a 0.76 0.76 0 0 0 -1 0.27
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.27f,
          )
          // l -1.74 3
          lineToRelative(dx = -1.74f, dy = 3.0f)
          // a 0.76 0.76 0 0 0 0.27 1.01
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.27f,
            dy1 = 1.01f,
          )
          // m 9.22 2.38
          moveToRelative(dx = 9.22f, dy = 2.38f)
          // a 0.76 0.76 0 0 0 -1 -0.27
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -0.27f,
          )
          // l -3 1.74
          lineToRelative(dx = -3.0f, dy = 1.74f)
          // a 0.76 0.76 0 0 0 -0.28 1
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.28f,
            dy1 = 1.0f,
          )
          // a 0.8 0.8 0 0 0 0.66 0.38
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.66f,
            dy1 = 0.38f,
          )
          // a 1 1 0 0 0 0.38 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.38f,
            dy1 = -0.1f,
          )
          // l 3 -1.75
          lineToRelative(dx = 3.0f, dy = -1.75f)
          // a 0.76 0.76 0 0 0 0.24 -1
          arcToRelative(
            a = 0.76f,
            b = 0.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.24f,
            dy1 = -1.0f,
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
      .also { _watson = it }
  }

@Suppress("ObjectPropertyName")
private var _watson: ImageVector? = null
