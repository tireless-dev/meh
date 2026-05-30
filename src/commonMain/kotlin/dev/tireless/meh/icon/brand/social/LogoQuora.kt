// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoQuora: ImageVector
  get() {
    val current = _logoQuora
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoQuora",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 23.86 h-2 a1.7 1.7 0 0 1 -1.73 1.72 c-1.15 0 -1.82 -.86 -2.58 -2 a11 11 0 0 0 4.79 -9.1 c.09 -7.19 -5.85 -11.89 -12.17 -11.89 S3 7.37 3 14.37 s6 11.79 12.17 11.79 a11 11 0 0 0 3.07 -.48 c1.15 2.11 2.59 3.74 5.46 3.74 a5 5 0 0 0 5.3 -5.56 m-8.14 -3.45 a6.3 6.3 0 0 0 -5.56 -3.16 6 6 0 0 0 -3.74 1.15 L12.2 20 a3 3 0 0 1 .86 -.1 c1.82 0 3 1.53 4.12 3.64 a8 8 0 0 1 -1.91 .19 C10.86 23.76 9 20.6 9 14.47 s1.91 -9.3 6.23 -9.3 6.32 3.16 6.32 9.3 a21 21 0 0 1 -.72 5.94Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 23.86
          moveTo(x = 29.0f, y = 23.86f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 1.7 1.7 0 0 1 -1.73 1.72
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.73f,
            dy1 = 1.72f,
          )
          // c -1.15 0 -1.82 -0.86 -2.58 -2
          curveToRelative(
            dx1 = -1.15f,
            dy1 = 0.0f,
            dx2 = -1.82f,
            dy2 = -0.86f,
            dx3 = -2.58f,
            dy3 = -2.0f,
          )
          // a 11 11 0 0 0 4.79 -9.1
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.79f,
            dy1 = -9.1f,
          )
          // c 0.09 -7.19 -5.85 -11.89 -12.17 -11.89
          curveToRelative(
            dx1 = 0.09f,
            dy1 = -7.19f,
            dx2 = -5.85f,
            dy2 = -11.89f,
            dx3 = -12.17f,
            dy3 = -11.89f,
          )
          // S 3 7.37 3 14.37
          reflectiveCurveTo(
            x1 = 3.0f,
            y1 = 7.37f,
            x2 = 3.0f,
            y2 = 14.37f,
          )
          // s 6 11.79 12.17 11.79
          reflectiveCurveToRelative(
            dx1 = 6.0f,
            dy1 = 11.79f,
            dx2 = 12.17f,
            dy2 = 11.79f,
          )
          // a 11 11 0 0 0 3.07 -0.48
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.07f,
            dy1 = -0.48f,
          )
          // c 1.15 2.11 2.59 3.74 5.46 3.74
          curveToRelative(
            dx1 = 1.15f,
            dy1 = 2.11f,
            dx2 = 2.59f,
            dy2 = 3.74f,
            dx3 = 5.46f,
            dy3 = 3.74f,
          )
          // a 5 5 0 0 0 5.3 -5.56
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.3f,
            dy1 = -5.56f,
          )
          // m -8.14 -3.45
          moveToRelative(dx = -8.14f, dy = -3.45f)
          // a 6.3 6.3 0 0 0 -5.56 -3.16
          arcToRelative(
            a = 6.3f,
            b = 6.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.56f,
            dy1 = -3.16f,
          )
          // a 6 6 0 0 0 -3.74 1.15
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.74f,
            dy1 = 1.15f,
          )
          // L 12.2 20
          lineTo(x = 12.2f, y = 20.0f)
          // a 3 3 0 0 1 0.86 -0.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.86f,
            dy1 = -0.1f,
          )
          // c 1.82 0 3 1.53 4.12 3.64
          curveToRelative(
            dx1 = 1.82f,
            dy1 = 0.0f,
            dx2 = 3.0f,
            dy2 = 1.53f,
            dx3 = 4.12f,
            dy3 = 3.64f,
          )
          // a 8 8 0 0 1 -1.91 0.19
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.91f,
            dy1 = 0.19f,
          )
          // C 10.86 23.76 9 20.6 9 14.47
          curveTo(
            x1 = 10.86f,
            y1 = 23.76f,
            x2 = 9.0f,
            y2 = 20.6f,
            x3 = 9.0f,
            y3 = 14.47f,
          )
          // s 1.91 -9.3 6.23 -9.3
          reflectiveCurveToRelative(
            dx1 = 1.91f,
            dy1 = -9.3f,
            dx2 = 6.23f,
            dy2 = -9.3f,
          )
          // s 6.32 3.16 6.32 9.3
          reflectiveCurveToRelative(
            dx1 = 6.32f,
            dy1 = 3.16f,
            dx2 = 6.32f,
            dy2 = 9.3f,
          )
          // a 21 21 0 0 1 -0.72 5.94z
          arcToRelative(
            a = 21.0f,
            b = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.72f,
            dy1 = 5.94f,
          )
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
      .also { _logoQuora = it }
  }

@Suppress("ObjectPropertyName")
private var _logoQuora: ImageVector? = null
