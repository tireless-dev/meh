// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoPinterest: ImageVector
  get() {
    val current = _logoPinterest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoPinterest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 0 0 -5.1 27 13 13 0 0 1 0 -4 l1.65 -7 a5 5 0 0 1 -.38 -2 c0 -1.94 1.13 -3.4 2.53 -3.4 a1.76 1.76 0 0 1 1.77 2 c0 1.2 -.76 3 -1.16 4.66 a2 2 0 0 0 2.08 2.53 c2.48 0 4.4 -2.63 4.4 -6.41 a5.53 5.53 0 0 0 -5.85 -5.7 6.06 6.06 0 0 0 -6.32 6.08 5.4 5.4 0 0 0 1 3.19 .4 .4 0 0 1 .1 .4 l-.39 1.59 c-.04 .19 -.21 .31 -.47 .19 -1.75 -.82 -2.84 -3.37 -2.84 -5.43 0 -4.41 3.21 -8.47 9.25 -8.47 4.85 0 8.63 3.46 8.63 8.09 0 4.82 -3 8.7 -7.27 8.7 a3.8 3.8 0 0 1 -3.21 -1.6 l-.87 3.33 a16 16 0 0 1 -1.74 3.67 A14 14 0 0 0 16 30 a14 14 0 0 0 0 -28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 0 0 -5.1 27
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.1f,
            dy1 = 27.0f,
          )
          // a 13 13 0 0 1 0 -4
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // l 1.65 -7
          lineToRelative(dx = 1.65f, dy = -7.0f)
          // a 5 5 0 0 1 -0.38 -2
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.38f,
            dy1 = -2.0f,
          )
          // c 0 -1.94 1.13 -3.4 2.53 -3.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.94f,
            dx2 = 1.13f,
            dy2 = -3.4f,
            dx3 = 2.53f,
            dy3 = -3.4f,
          )
          // a 1.76 1.76 0 0 1 1.77 2
          arcToRelative(
            a = 1.76f,
            b = 1.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.77f,
            dy1 = 2.0f,
          )
          // c 0 1.2 -0.76 3 -1.16 4.66
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.2f,
            dx2 = -0.76f,
            dy2 = 3.0f,
            dx3 = -1.16f,
            dy3 = 4.66f,
          )
          // a 2 2 0 0 0 2.08 2.53
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.08f,
            dy1 = 2.53f,
          )
          // c 2.48 0 4.4 -2.63 4.4 -6.41
          curveToRelative(
            dx1 = 2.48f,
            dy1 = 0.0f,
            dx2 = 4.4f,
            dy2 = -2.63f,
            dx3 = 4.4f,
            dy3 = -6.41f,
          )
          // a 5.53 5.53 0 0 0 -5.85 -5.7
          arcToRelative(
            a = 5.53f,
            b = 5.53f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.85f,
            dy1 = -5.7f,
          )
          // a 6.06 6.06 0 0 0 -6.32 6.08
          arcToRelative(
            a = 6.06f,
            b = 6.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.32f,
            dy1 = 6.08f,
          )
          // a 5.4 5.4 0 0 0 1 3.19
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 3.19f,
          )
          // a 0.4 0.4 0 0 1 0.1 0.4
          arcToRelative(
            a = 0.4f,
            b = 0.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = 0.4f,
          )
          // l -0.39 1.59
          lineToRelative(dx = -0.39f, dy = 1.59f)
          // c -0.04 0.19 -0.21 0.31 -0.47 0.19
          curveToRelative(
            dx1 = -0.04f,
            dy1 = 0.19f,
            dx2 = -0.21f,
            dy2 = 0.31f,
            dx3 = -0.47f,
            dy3 = 0.19f,
          )
          // c -1.75 -0.82 -2.84 -3.37 -2.84 -5.43
          curveToRelative(
            dx1 = -1.75f,
            dy1 = -0.82f,
            dx2 = -2.84f,
            dy2 = -3.37f,
            dx3 = -2.84f,
            dy3 = -5.43f,
          )
          // c 0 -4.41 3.21 -8.47 9.25 -8.47
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.41f,
            dx2 = 3.21f,
            dy2 = -8.47f,
            dx3 = 9.25f,
            dy3 = -8.47f,
          )
          // c 4.85 0 8.63 3.46 8.63 8.09
          curveToRelative(
            dx1 = 4.85f,
            dy1 = 0.0f,
            dx2 = 8.63f,
            dy2 = 3.46f,
            dx3 = 8.63f,
            dy3 = 8.09f,
          )
          // c 0 4.82 -3 8.7 -7.27 8.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.82f,
            dx2 = -3.0f,
            dy2 = 8.7f,
            dx3 = -7.27f,
            dy3 = 8.7f,
          )
          // a 3.8 3.8 0 0 1 -3.21 -1.6
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.21f,
            dy1 = -1.6f,
          )
          // l -0.87 3.33
          lineToRelative(dx = -0.87f, dy = 3.33f)
          // a 16 16 0 0 1 -1.74 3.67
          arcToRelative(
            a = 16.0f,
            b = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.74f,
            dy1 = 3.67f,
          )
          // A 14 14 0 0 0 16 30
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // a 14 14 0 0 0 0 -28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -28.0f,
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
      .also { _logoPinterest = it }
  }

@Suppress("ObjectPropertyName")
private var _logoPinterest: ImageVector? = null
