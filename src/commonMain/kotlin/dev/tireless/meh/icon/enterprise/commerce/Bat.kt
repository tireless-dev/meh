// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bat: ImageVector
  get() {
    val current = _bat
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bat",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M31.9 6.58 A1 1 0 0 0 31 6 c-4.77 0 -8.26 .89 -11 2.84 V3 h-2 v3 h-4 V3 h-2 v5.84 C9.26 6.9 5.77 6 1 6 a1 1 0 0 0 -.76 1.65 C1.94 9.62 3 11.7 3 16 a1 1 0 0 0 1 1 c2.77 0 6 1.31 6 5 a1 1 0 0 0 .93 1 c.42 .03 4.07 .39 4.07 4 a1 1 0 0 0 2 0 c0 -3.61 3.65 -3.97 4.06 -4 A1 1 0 0 0 22 22 c0 -3.69 3.23 -5 6 -5 a1 1 0 0 0 1 -1 c0 -4.3 1.05 -6.38 2.76 -8.35 a1 1 0 0 0 .15 -1.07 m-4.88 8.46 c-3.39 .31 -6.56 2.23 -6.97 6.08 A6.6 6.6 0 0 0 16 23.61 a6.6 6.6 0 0 0 -4.05 -2.49 c-.41 -3.85 -3.58 -5.77 -6.97 -6.08 a13 13 0 0 0 -1.93 -6.98 c4.13 .28 7.03 1.43 9.24 3.65 A1 1 0 0 0 14 11 V8 h4 v3 a1 1 0 0 0 1.7 .7 c2.22 -2.2 5.12 -3.36 9.26 -3.64 a13 13 0 0 0 -1.94 6.98
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.9 6.58
          moveTo(x = 31.9f, y = 6.58f)
          // A 1 1 0 0 0 31 6
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 31.0f,
            y1 = 6.0f,
          )
          // c -4.77 0 -8.26 0.89 -11 2.84
          curveToRelative(
            dx1 = -4.77f,
            dy1 = 0.0f,
            dx2 = -8.26f,
            dy2 = 0.89f,
            dx3 = -11.0f,
            dy3 = 2.84f,
          )
          // V 3
          verticalLineTo(y = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5.84
          verticalLineToRelative(dy = 5.84f)
          // C 9.26 6.9 5.77 6 1 6
          curveTo(
            x1 = 9.26f,
            y1 = 6.9f,
            x2 = 5.77f,
            y2 = 6.0f,
            x3 = 1.0f,
            y3 = 6.0f,
          )
          // a 1 1 0 0 0 -0.76 1.65
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.76f,
            dy1 = 1.65f,
          )
          // C 1.94 9.62 3 11.7 3 16
          curveTo(
            x1 = 1.94f,
            y1 = 9.62f,
            x2 = 3.0f,
            y2 = 11.7f,
            x3 = 3.0f,
            y3 = 16.0f,
          )
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // c 2.77 0 6 1.31 6 5
          curveToRelative(
            dx1 = 2.77f,
            dy1 = 0.0f,
            dx2 = 6.0f,
            dy2 = 1.31f,
            dx3 = 6.0f,
            dy3 = 5.0f,
          )
          // a 1 1 0 0 0 0.93 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.93f,
            dy1 = 1.0f,
          )
          // c 0.42 0.03 4.07 0.39 4.07 4
          curveToRelative(
            dx1 = 0.42f,
            dy1 = 0.03f,
            dx2 = 4.07f,
            dy2 = 0.39f,
            dx3 = 4.07f,
            dy3 = 4.0f,
          )
          // a 1 1 0 0 0 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // c 0 -3.61 3.65 -3.97 4.06 -4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.61f,
            dx2 = 3.65f,
            dy2 = -3.97f,
            dx3 = 4.06f,
            dy3 = -4.0f,
          )
          // A 1 1 0 0 0 22 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 22.0f,
          )
          // c 0 -3.69 3.23 -5 6 -5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.69f,
            dx2 = 3.23f,
            dy2 = -5.0f,
            dx3 = 6.0f,
            dy3 = -5.0f,
          )
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // c 0 -4.3 1.05 -6.38 2.76 -8.35
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.3f,
            dx2 = 1.05f,
            dy2 = -6.38f,
            dx3 = 2.76f,
            dy3 = -8.35f,
          )
          // a 1 1 0 0 0 0.15 -1.07
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.15f,
            dy1 = -1.07f,
          )
          // m -4.88 8.46
          moveToRelative(dx = -4.88f, dy = 8.46f)
          // c -3.39 0.31 -6.56 2.23 -6.97 6.08
          curveToRelative(
            dx1 = -3.39f,
            dy1 = 0.31f,
            dx2 = -6.56f,
            dy2 = 2.23f,
            dx3 = -6.97f,
            dy3 = 6.08f,
          )
          // A 6.6 6.6 0 0 0 16 23.61
          arcTo(
            horizontalEllipseRadius = 6.6f,
            verticalEllipseRadius = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 23.61f,
          )
          // a 6.6 6.6 0 0 0 -4.05 -2.49
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.05f,
            dy1 = -2.49f,
          )
          // c -0.41 -3.85 -3.58 -5.77 -6.97 -6.08
          curveToRelative(
            dx1 = -0.41f,
            dy1 = -3.85f,
            dx2 = -3.58f,
            dy2 = -5.77f,
            dx3 = -6.97f,
            dy3 = -6.08f,
          )
          // a 13 13 0 0 0 -1.93 -6.98
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.93f,
            dy1 = -6.98f,
          )
          // c 4.13 0.28 7.03 1.43 9.24 3.65
          curveToRelative(
            dx1 = 4.13f,
            dy1 = 0.28f,
            dx2 = 7.03f,
            dy2 = 1.43f,
            dx3 = 9.24f,
            dy3 = 3.65f,
          )
          // A 1 1 0 0 0 14 11
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 11.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 0 1.7 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.7f,
            dy1 = 0.7f,
          )
          // c 2.22 -2.2 5.12 -3.36 9.26 -3.64
          curveToRelative(
            dx1 = 2.22f,
            dy1 = -2.2f,
            dx2 = 5.12f,
            dy2 = -3.36f,
            dx3 = 9.26f,
            dy3 = -3.64f,
          )
          // a 13 13 0 0 0 -1.94 6.98
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -1.94f,
          dy1 = 6.98f,
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
      .also { _bat = it }
  }

@Suppress("ObjectPropertyName")
private var _bat: ImageVector? = null
