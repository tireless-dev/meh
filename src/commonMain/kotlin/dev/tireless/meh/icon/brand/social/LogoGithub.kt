// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoGithub: ImageVector
  get() {
    val current = _logoGithub
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoGithub",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 0 0 -4.43 27.28 c.7 .13 1 -.3 1 -.67 v-2.38 c-3.89 .84 -4.71 -1.88 -4.71 -1.88 a3.7 3.7 0 0 0 -1.62 -2.05 c-1.27 -.86 .1 -.85 .1 -.85 a3 3 0 0 1 2.14 1.45 3 3 0 0 0 4.08 1.16 3 3 0 0 1 .88 -1.87 c-3.1 -.36 -6.37 -1.56 -6.37 -6.92 a5.4 5.4 0 0 1 1.44 -3.76 5 5 0 0 1 .14 -3.7 s1.17 -.38 3.85 1.43 a13.3 13.3 0 0 1 7 0 c2.67 -1.81 3.84 -1.43 3.84 -1.43 a5 5 0 0 1 .14 3.7 5.4 5.4 0 0 1 1.44 3.76 c0 5.38 -3.27 6.56 -6.39 6.91 a3.3 3.3 0 0 1 .95 2.59 v3.84 c0 .46 .25 .81 1 .67 A14 14 0 0 0 16 2
        path(
          pathFillType = PathFillType.EvenOdd,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 0 0 -4.43 27.28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.43f,
            dy1 = 27.28f,
          )
          // c 0.7 0.13 1 -0.3 1 -0.67
          curveToRelative(
            dx1 = 0.7f,
            dy1 = 0.13f,
            dx2 = 1.0f,
            dy2 = -0.3f,
            dx3 = 1.0f,
            dy3 = -0.67f,
          )
          // v -2.38
          verticalLineToRelative(dy = -2.38f)
          // c -3.89 0.84 -4.71 -1.88 -4.71 -1.88
          curveToRelative(
            dx1 = -3.89f,
            dy1 = 0.84f,
            dx2 = -4.71f,
            dy2 = -1.88f,
            dx3 = -4.71f,
            dy3 = -1.88f,
          )
          // a 3.7 3.7 0 0 0 -1.62 -2.05
          arcToRelative(
            a = 3.7f,
            b = 3.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.62f,
            dy1 = -2.05f,
          )
          // c -1.27 -0.86 0.1 -0.85 0.1 -0.85
          curveToRelative(
            dx1 = -1.27f,
            dy1 = -0.86f,
            dx2 = 0.1f,
            dy2 = -0.85f,
            dx3 = 0.1f,
            dy3 = -0.85f,
          )
          // a 3 3 0 0 1 2.14 1.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.14f,
            dy1 = 1.45f,
          )
          // a 3 3 0 0 0 4.08 1.16
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.08f,
            dy1 = 1.16f,
          )
          // a 3 3 0 0 1 0.88 -1.87
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.88f,
            dy1 = -1.87f,
          )
          // c -3.1 -0.36 -6.37 -1.56 -6.37 -6.92
          curveToRelative(
            dx1 = -3.1f,
            dy1 = -0.36f,
            dx2 = -6.37f,
            dy2 = -1.56f,
            dx3 = -6.37f,
            dy3 = -6.92f,
          )
          // a 5.4 5.4 0 0 1 1.44 -3.76
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.44f,
            dy1 = -3.76f,
          )
          // a 5 5 0 0 1 0.14 -3.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.14f,
            dy1 = -3.7f,
          )
          // s 1.17 -0.38 3.85 1.43
          reflectiveCurveToRelative(
            dx1 = 1.17f,
            dy1 = -0.38f,
            dx2 = 3.85f,
            dy2 = 1.43f,
          )
          // a 13.3 13.3 0 0 1 7 0
          arcToRelative(
            a = 13.3f,
            b = 13.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 0.0f,
          )
          // c 2.67 -1.81 3.84 -1.43 3.84 -1.43
          curveToRelative(
            dx1 = 2.67f,
            dy1 = -1.81f,
            dx2 = 3.84f,
            dy2 = -1.43f,
            dx3 = 3.84f,
            dy3 = -1.43f,
          )
          // a 5 5 0 0 1 0.14 3.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.14f,
            dy1 = 3.7f,
          )
          // a 5.4 5.4 0 0 1 1.44 3.76
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.44f,
            dy1 = 3.76f,
          )
          // c 0 5.38 -3.27 6.56 -6.39 6.91
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.38f,
            dx2 = -3.27f,
            dy2 = 6.56f,
            dx3 = -6.39f,
            dy3 = 6.91f,
          )
          // a 3.3 3.3 0 0 1 0.95 2.59
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.95f,
            dy1 = 2.59f,
          )
          // v 3.84
          verticalLineToRelative(dy = 3.84f)
          // c 0 0.46 0.25 0.81 1 0.67
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.46f,
            dx2 = 0.25f,
            dy2 = 0.81f,
            dx3 = 1.0f,
            dy3 = 0.67f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
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
      .also { _logoGithub = it }
  }

@Suppress("ObjectPropertyName")
private var _logoGithub: ImageVector? = null
