// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoRScript: ImageVector
  get() {
    val current = _logoRScript
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoRScript",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 14.78 c0 -5.17 -6.27 -9.37 -14 -9.37 S2 9.6 2 14.78 c0 4.62 4.98 8.45 11.54 9.23 V27 h4.77 v-2.98 a19 19 0 0 0 3.34 -.66 L23.6 27 H29 l-3.25 -5.49 c2.62 -1.7 4.26 -4.08 4.26 -6.73 m-22.5 .7 c0 -3.54 4.77 -6.4 10.64 -6.4 s10.22 1.96 10.22 6.4 a5.5 5.5 0 0 1 -3.4 5.13 l-.3 -.17 a11 11 0 0 0 -1.34 -.51 s4.18 -.31 4.18 -4.47 -4.37 -4.23 -4.37 -4.23 h-9.6 v10.03 c-3.56 -1.04 -6.03 -3.23 -6.03 -5.78 m13.74 1.85 h-2.89 v-2.68 h2.9 a1.25 1.25 0 0 1 1.33 1.32 1.3 1.3 0 0 1 -1.34 1.36 m-2.93 3.5 h1.28 a1 1 0 0 1 .64 .28 3 3 0 0 1 .51 .63 22 22 0 0 1 -2.43 .15Z
        path(
          pathFillType = PathFillType.EvenOdd,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 14.78
          moveTo(x = 30.0f, y = 14.78f)
          // c 0 -5.17 -6.27 -9.37 -14 -9.37
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.17f,
            dx2 = -6.27f,
            dy2 = -9.37f,
            dx3 = -14.0f,
            dy3 = -9.37f,
          )
          // S 2 9.6 2 14.78
          reflectiveCurveTo(
            x1 = 2.0f,
            y1 = 9.6f,
            x2 = 2.0f,
            y2 = 14.78f,
          )
          // c 0 4.62 4.98 8.45 11.54 9.23
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.62f,
            dx2 = 4.98f,
            dy2 = 8.45f,
            dx3 = 11.54f,
            dy3 = 9.23f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
          // h 4.77
          horizontalLineToRelative(dx = 4.77f)
          // v -2.98
          verticalLineToRelative(dy = -2.98f)
          // a 19 19 0 0 0 3.34 -0.66
          arcToRelative(
            a = 19.0f,
            b = 19.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.34f,
            dy1 = -0.66f,
          )
          // L 23.6 27
          lineTo(x = 23.6f, y = 27.0f)
          // H 29
          horizontalLineTo(x = 29.0f)
          // l -3.25 -5.49
          lineToRelative(dx = -3.25f, dy = -5.49f)
          // c 2.62 -1.7 4.26 -4.08 4.26 -6.73
          curveToRelative(
            dx1 = 2.62f,
            dy1 = -1.7f,
            dx2 = 4.26f,
            dy2 = -4.08f,
            dx3 = 4.26f,
            dy3 = -6.73f,
          )
          // m -22.5 0.7
          moveToRelative(dx = -22.5f, dy = 0.7f)
          // c 0 -3.54 4.77 -6.4 10.64 -6.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.54f,
            dx2 = 4.77f,
            dy2 = -6.4f,
            dx3 = 10.64f,
            dy3 = -6.4f,
          )
          // s 10.22 1.96 10.22 6.4
          reflectiveCurveToRelative(
            dx1 = 10.22f,
            dy1 = 1.96f,
            dx2 = 10.22f,
            dy2 = 6.4f,
          )
          // a 5.5 5.5 0 0 1 -3.4 5.13
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.4f,
            dy1 = 5.13f,
          )
          // l -0.3 -0.17
          lineToRelative(dx = -0.3f, dy = -0.17f)
          // a 11 11 0 0 0 -1.34 -0.51
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.34f,
            dy1 = -0.51f,
          )
          // s 4.18 -0.31 4.18 -4.47
          reflectiveCurveToRelative(
            dx1 = 4.18f,
            dy1 = -0.31f,
            dx2 = 4.18f,
            dy2 = -4.47f,
          )
          // s -4.37 -4.23 -4.37 -4.23
          reflectiveCurveToRelative(
            dx1 = -4.37f,
            dy1 = -4.23f,
            dx2 = -4.37f,
            dy2 = -4.23f,
          )
          // h -9.6
          horizontalLineToRelative(dx = -9.6f)
          // v 10.03
          verticalLineToRelative(dy = 10.03f)
          // c -3.56 -1.04 -6.03 -3.23 -6.03 -5.78
          curveToRelative(
            dx1 = -3.56f,
            dy1 = -1.04f,
            dx2 = -6.03f,
            dy2 = -3.23f,
            dx3 = -6.03f,
            dy3 = -5.78f,
          )
          // m 13.74 1.85
          moveToRelative(dx = 13.74f, dy = 1.85f)
          // h -2.89
          horizontalLineToRelative(dx = -2.89f)
          // v -2.68
          verticalLineToRelative(dy = -2.68f)
          // h 2.9
          horizontalLineToRelative(dx = 2.9f)
          // a 1.25 1.25 0 0 1 1.33 1.32
          arcToRelative(
            a = 1.25f,
            b = 1.25f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.33f,
            dy1 = 1.32f,
          )
          // a 1.3 1.3 0 0 1 -1.34 1.36
          arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.34f,
            dy1 = 1.36f,
          )
          // m -2.93 3.5
          moveToRelative(dx = -2.93f, dy = 3.5f)
          // h 1.28
          horizontalLineToRelative(dx = 1.28f)
          // a 1 1 0 0 1 0.64 0.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.64f,
            dy1 = 0.28f,
          )
          // a 3 3 0 0 1 0.51 0.63
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.51f,
            dy1 = 0.63f,
          )
          // a 22 22 0 0 1 -2.43 0.15z
          arcToRelative(
            a = 22.0f,
            b = 22.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.43f,
            dy1 = 0.15f,
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
      .also { _logoRScript = it }
  }

@Suppress("ObjectPropertyName")
private var _logoRScript: ImageVector? = null
