// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ViewOff: ImageVector
  get() {
    val current = _viewOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ViewOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m5.24 22.51 1.43 -1.42 A14 14 0 0 1 3.07 16 C5.1 10.93 10.7 7 16 7 a12 12 0 0 1 4 .72 l1.55 -1.56 A15 15 0 0 0 16 5 16.7 16.7 0 0 0 1.06 15.66 a1 1 0 0 0 0 .68 16 16 0 0 0 4.18 6.17
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.24 22.51
          moveTo(x = 5.24f, y = 22.51f)
          // l 1.43 -1.42
          lineToRelative(dx = 1.43f, dy = -1.42f)
          // A 14 14 0 0 1 3.07 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.07f,
            y1 = 16.0f,
          )
          // C 5.1 10.93 10.7 7 16 7
          curveTo(
            x1 = 5.1f,
            y1 = 10.93f,
            x2 = 10.7f,
            y2 = 7.0f,
            x3 = 16.0f,
            y3 = 7.0f,
          )
          // a 12 12 0 0 1 4 0.72
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.72f,
          )
          // l 1.55 -1.56
          lineToRelative(dx = 1.55f, dy = -1.56f)
          // A 15 15 0 0 0 16 5
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 5.0f,
          )
          // A 16.7 16.7 0 0 0 1.06 15.66
          arcTo(
            horizontalEllipseRadius = 16.7f,
            verticalEllipseRadius = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.06f,
            y1 = 15.66f,
          )
          // a 1 1 0 0 0 0 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.68f,
          )
          // a 16 16 0 0 0 4.18 6.17
          arcToRelative(
            a = 16.0f,
            b = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.18f,
            dy1 = 6.17f,
          )
        }
        // M12 15.73 a4 4 0 0 1 3.7 -3.7 l1.81 -1.82 a6 6 0 0 0 -7.33 7.33Z m18.94 -.07 a16.4 16.4 0 0 0 -5.74 -7.44 L30 3.41 28.59 2 2 28.59 3.41 30 l5.1 -5.1 A15.3 15.3 0 0 0 16 27 a16.7 16.7 0 0 0 14.94 -10.66 1 1 0 0 0 0 -.68 M20 16 a4 4 0 0 1 -6 3.44 L19.44 14 A4 4 0 0 1 20 16 m-4 9 a13 13 0 0 1 -6 -1.58 l2.54 -2.54 a6 6 0 0 0 8.35 -8.35 l2.87 -2.87 A14.5 14.5 0 0 1 28.93 16 C26.9 21.07 21.3 25 16 25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 15.73
          moveTo(x = 12.0f, y = 15.73f)
          // a 4 4 0 0 1 3.7 -3.7
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.7f,
            dy1 = -3.7f,
          )
          // l 1.81 -1.82
          lineToRelative(dx = 1.81f, dy = -1.82f)
          // a 6 6 0 0 0 -7.33 7.33z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.33f,
            dy1 = 7.33f,
          )
          close()
          // m 18.94 -0.07
          moveToRelative(dx = 18.94f, dy = -0.07f)
          // a 16.4 16.4 0 0 0 -5.74 -7.44
          arcToRelative(
            a = 16.4f,
            b = 16.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.74f,
            dy1 = -7.44f,
          )
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 5.1 -5.1
          lineToRelative(dx = 5.1f, dy = -5.1f)
          // A 15.3 15.3 0 0 0 16 27
          arcTo(
            horizontalEllipseRadius = 15.3f,
            verticalEllipseRadius = 15.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 27.0f,
          )
          // a 16.7 16.7 0 0 0 14.94 -10.66
          arcToRelative(
            a = 16.7f,
            b = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.94f,
            dy1 = -10.66f,
          )
          // a 1 1 0 0 0 0 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.68f,
          )
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // a 4 4 0 0 1 -6 3.44
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 3.44f,
          )
          // L 19.44 14
          lineTo(x = 19.44f, y = 14.0f)
          // A 4 4 0 0 1 20 16
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 16.0f,
          )
          // m -4 9
          moveToRelative(dx = -4.0f, dy = 9.0f)
          // a 13 13 0 0 1 -6 -1.58
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -1.58f,
          )
          // l 2.54 -2.54
          lineToRelative(dx = 2.54f, dy = -2.54f)
          // a 6 6 0 0 0 8.35 -8.35
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.35f,
            dy1 = -8.35f,
          )
          // l 2.87 -2.87
          lineToRelative(dx = 2.87f, dy = -2.87f)
          // A 14.5 14.5 0 0 1 28.93 16
          arcTo(
            horizontalEllipseRadius = 14.5f,
            verticalEllipseRadius = 14.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.93f,
            y1 = 16.0f,
          )
          // C 26.9 21.07 21.3 25 16 25
          curveTo(
            x1 = 26.9f,
            y1 = 21.07f,
            x2 = 21.3f,
            y2 = 25.0f,
            x3 = 16.0f,
            y3 = 25.0f,
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
      .also { _viewOff = it }
  }

@Suppress("ObjectPropertyName")
private var _viewOff: ImageVector? = null
