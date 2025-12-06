// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartSpiral: ImageVector
  get() {
    val current = _chartSpiral
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartSpiral",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 0 0 -8.68 3.03 L7 5 a2 2 0 0 0 -2 2 l.03 .32 A13.99 13.99 0 1 0 16 2 m0 26 A11.98 11.98 0 0 1 6.36 8.89 2 2 0 0 0 7.5 8.93 l1.47 1.46 a8.99 8.99 0 0 0 11.83 13.2 2 2 0 0 0 2.79 -2.78 8.9 8.9 0 0 0 0 -9.62 2 2 0 0 0 -2.8 -2.79 A8.9 8.9 0 0 0 10.4 8.98 L8.93 7.5 a2 2 0 0 0 -.04 -1.15 A12 12 0 1 1 16 28 m0 -14 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 m3.43 -.02 2.06 -2.05 .22 .04 a7 7 0 0 1 0 8.06 l-.22 .04 -2.06 -2.05 a3.9 3.9 0 0 0 0 -4.04 m.6 -3.7 .04 .23 -2.05 2.06 a3.9 3.9 0 0 0 -4.04 0 l-2.16 -2.17 a6.95 6.95 0 0 1 8.2 -.11 m-7.46 3.7 A4 4 0 0 0 12 16 a4 4 0 0 0 4 4 4 4 0 0 0 2.02 -.57 l2.05 2.06 -.04 .22 a6.99 6.99 0 0 1 -9.63 -9.9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 0 0 -8.68 3.03
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.68f,
            dy1 = 3.03f,
          )
          // L 7 5
          lineTo(x = 7.0f, y = 5.0f)
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
          // l 0.03 0.32
          lineToRelative(dx = 0.03f, dy = 0.32f)
          // A 13.99 13.99 0 1 0 16 2
          arcTo(
            horizontalEllipseRadius = 13.99f,
            verticalEllipseRadius = 13.99f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // A 11.98 11.98 0 0 1 6.36 8.89
          arcTo(
            horizontalEllipseRadius = 11.98f,
            verticalEllipseRadius = 11.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.36f,
            y1 = 8.89f,
          )
          // A 2 2 0 0 0 7.5 8.93
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 8.93f,
          )
          // l 1.47 1.46
          lineToRelative(dx = 1.47f, dy = 1.46f)
          // a 8.99 8.99 0 0 0 11.83 13.2
          arcToRelative(
            a = 8.99f,
            b = 8.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 11.83f,
            dy1 = 13.2f,
          )
          // a 2 2 0 0 0 2.79 -2.78
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.79f,
            dy1 = -2.78f,
          )
          // a 8.9 8.9 0 0 0 0 -9.62
          arcToRelative(
            a = 8.9f,
            b = 8.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -9.62f,
          )
          // a 2 2 0 0 0 -2.8 -2.79
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.8f,
            dy1 = -2.79f,
          )
          // A 8.9 8.9 0 0 0 10.4 8.98
          arcTo(
            horizontalEllipseRadius = 8.9f,
            verticalEllipseRadius = 8.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.4f,
            y1 = 8.98f,
          )
          // L 8.93 7.5
          lineTo(x = 8.93f, y = 7.5f)
          // a 2 2 0 0 0 -0.04 -1.15
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.04f,
            dy1 = -1.15f,
          )
          // A 12 12 0 1 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // m 0 -14
          moveToRelative(dx = 0.0f, dy = -14.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
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
          // m 3.43 -0.02
          moveToRelative(dx = 3.43f, dy = -0.02f)
          // l 2.06 -2.05
          lineToRelative(dx = 2.06f, dy = -2.05f)
          // l 0.22 0.04
          lineToRelative(dx = 0.22f, dy = 0.04f)
          // a 7 7 0 0 1 0 8.06
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.06f,
          )
          // l -0.22 0.04
          lineToRelative(dx = -0.22f, dy = 0.04f)
          // l -2.06 -2.05
          lineToRelative(dx = -2.06f, dy = -2.05f)
          // a 3.9 3.9 0 0 0 0 -4.04
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.04f,
          )
          // m 0.6 -3.7
          moveToRelative(dx = 0.6f, dy = -3.7f)
          // l 0.04 0.23
          lineToRelative(dx = 0.04f, dy = 0.23f)
          // l -2.05 2.06
          lineToRelative(dx = -2.05f, dy = 2.06f)
          // a 3.9 3.9 0 0 0 -4.04 0
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.04f,
            dy1 = 0.0f,
          )
          // l -2.16 -2.17
          lineToRelative(dx = -2.16f, dy = -2.17f)
          // a 6.95 6.95 0 0 1 8.2 -0.11
          arcToRelative(
            a = 6.95f,
            b = 6.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.2f,
            dy1 = -0.11f,
          )
          // m -7.46 3.7
          moveToRelative(dx = -7.46f, dy = 3.7f)
          // A 4 4 0 0 0 12 16
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 16.0f,
          )
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 2.02 -0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.02f,
            dy1 = -0.57f,
          )
          // l 2.05 2.06
          lineToRelative(dx = 2.05f, dy = 2.06f)
          // l -0.04 0.22
          lineToRelative(dx = -0.04f, dy = 0.22f)
          // a 6.99 6.99 0 0 1 -9.63 -9.9z
          arcToRelative(
            a = 6.99f,
            b = 6.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
          dx1 = -9.63f,
          dy1 = -9.9f,
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
      .also { _chartSpiral = it }
  }

@Suppress("ObjectPropertyName")
private var _chartSpiral: ImageVector? = null
