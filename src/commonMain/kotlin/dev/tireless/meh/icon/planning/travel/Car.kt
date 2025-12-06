// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Car: ImageVector
  get() {
    val current = _car
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Car",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.34 15.93 -7.73 -2.77 -3.24 -4.06 A3 3 0 0 0 16.05 8 h-8 a3 3 0 0 0 -2.47 1.31 L2.87 13.3 A5 5 0 0 0 2 16.11 V24 a1 1 0 0 0 1 1 h2.14 a3.98 3.98 0 0 0 7.72 0 h6.28 a3.98 3.98 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-7.12 a1 1 0 0 0 -.66 -.95 M9 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 0 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m5 -3 h-1.14 a3.98 3.98 0 0 0 -7.72 0 h-6.28 a3.98 3.98 0 0 0 -7.72 0 H4 v-6.9 a3 3 0 0 1 .52 -1.68 l2.71 -3.98 A1 1 0 0 1 8.06 10 h8 a1 1 0 0 1 .76 .35 l3.4 4.27 a1 1 0 0 0 .44 .32 L28 17.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.34 15.93
          moveTo(x = 29.34f, y = 15.93f)
          // l -7.73 -2.77
          lineToRelative(dx = -7.73f, dy = -2.77f)
          // l -3.24 -4.06
          lineToRelative(dx = -3.24f, dy = -4.06f)
          // A 3 3 0 0 0 16.05 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.05f,
            y1 = 8.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 3 3 0 0 0 -2.47 1.31
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.47f,
            dy1 = 1.31f,
          )
          // L 2.87 13.3
          lineTo(x = 2.87f, y = 13.3f)
          // A 5 5 0 0 0 2 16.11
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.11f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
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
          // h 2.14
          horizontalLineToRelative(dx = 2.14f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // h 6.28
          horizontalLineToRelative(dx = 6.28f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
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
          // v -7.12
          verticalLineToRelative(dy = -7.12f)
          // a 1 1 0 0 0 -0.66 -0.95
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.66f,
            dy1 = -0.95f,
          )
          // M 9 26
          moveTo(x = 9.0f, y = 26.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 14 0
          moveToRelative(dx = 14.0f, dy = 0.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 5 -3
          moveToRelative(dx = 5.0f, dy = -3.0f)
          // h -1.14
          horizontalLineToRelative(dx = -1.14f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // h -6.28
          horizontalLineToRelative(dx = -6.28f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6.9
          verticalLineToRelative(dy = -6.9f)
          // a 3 3 0 0 1 0.52 -1.68
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.52f,
            dy1 = -1.68f,
          )
          // l 2.71 -3.98
          lineToRelative(dx = 2.71f, dy = -3.98f)
          // A 1 1 0 0 1 8.06 10
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.06f,
            y1 = 10.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 1 1 0 0 1 0.76 0.35
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.76f,
            dy1 = 0.35f,
          )
          // l 3.4 4.27
          lineToRelative(dx = 3.4f, dy = 4.27f)
          // a 1 1 0 0 0 0.44 0.32
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.44f,
            dy1 = 0.32f,
          )
          // L 28 17.58z
          lineTo(x = 28.0f, y = 17.58f)
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
      .also { _car = it }
  }

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
