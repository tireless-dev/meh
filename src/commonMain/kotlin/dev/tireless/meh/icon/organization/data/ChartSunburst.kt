// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartSunburst: ImageVector
  get() {
    val current = _chartSunburst
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartSunburst",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a1 1 0 0 0 -1 1 v7.09 a6 6 0 0 0 -2.46 1.04 l-4.7 -4.7 a1.46 1.46 0 0 0 -2.09 .03 A14.05 14.05 0 0 0 9.8 28.6 a11 11 0 0 0 1.9 .76 14.1 14.1 0 0 0 13.85 -3.13 1.43 1.43 0 0 0 .03 -2.06 l-4.7 -4.7 A6 6 0 0 0 21.9 17 H29 a1 1 0 0 0 1 -1 A14 14 0 0 0 16 2 m0 10 a4 4 0 1 1 -4 4 4 4 0 0 1 4 -4 M6.83 8.25 l4.3 4.3 a5.9 5.9 0 0 0 -.02 6.92 l-4.27 4.28 a12 12 0 0 1 -.01 -15.5 m1.42 16.91 4.28 -4.27 A6 6 0 0 0 15 21.9 v6.04 a12 12 0 0 1 -6.75 -2.79 m8.75 2.8 V21.9 a6 6 0 0 0 2.46 -1.03 l4.28 4.28 a12 12 0 0 1 -6.74 2.8 M21.91 15 A6 6 0 0 0 17 10.09 V4.04 A12 12 0 0 1 27.96 15Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 7.09
          verticalLineToRelative(dy = 7.09f)
          // a 6 6 0 0 0 -2.46 1.04
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.46f,
            dy1 = 1.04f,
          )
          // l -4.7 -4.7
          lineToRelative(dx = -4.7f, dy = -4.7f)
          // a 1.46 1.46 0 0 0 -2.09 0.03
          arcToRelative(
            a = 1.46f,
            b = 1.46f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.09f,
            dy1 = 0.03f,
          )
          // A 14.05 14.05 0 0 0 9.8 28.6
          arcTo(
            horizontalEllipseRadius = 14.05f,
            verticalEllipseRadius = 14.05f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.8f,
            y1 = 28.6f,
          )
          // a 11 11 0 0 0 1.9 0.76
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.9f,
            dy1 = 0.76f,
          )
          // a 14.1 14.1 0 0 0 13.85 -3.13
          arcToRelative(
            a = 14.1f,
            b = 14.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 13.85f,
            dy1 = -3.13f,
          )
          // a 1.43 1.43 0 0 0 0.03 -2.06
          arcToRelative(
            a = 1.43f,
            b = 1.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.03f,
            dy1 = -2.06f,
          )
          // l -4.7 -4.7
          lineToRelative(dx = -4.7f, dy = -4.7f)
          // A 6 6 0 0 0 21.9 17
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.9f,
            y1 = 17.0f,
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
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
          // a 4 4 0 1 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // M 6.83 8.25
          moveTo(x = 6.83f, y = 8.25f)
          // l 4.3 4.3
          lineToRelative(dx = 4.3f, dy = 4.3f)
          // a 5.9 5.9 0 0 0 -0.02 6.92
          arcToRelative(
            a = 5.9f,
            b = 5.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.02f,
            dy1 = 6.92f,
          )
          // l -4.27 4.28
          lineToRelative(dx = -4.27f, dy = 4.28f)
          // a 12 12 0 0 1 -0.01 -15.5
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.01f,
            dy1 = -15.5f,
          )
          // m 1.42 16.91
          moveToRelative(dx = 1.42f, dy = 16.91f)
          // l 4.28 -4.27
          lineToRelative(dx = 4.28f, dy = -4.27f)
          // A 6 6 0 0 0 15 21.9
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 21.9f,
          )
          // v 6.04
          verticalLineToRelative(dy = 6.04f)
          // a 12 12 0 0 1 -6.75 -2.79
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.75f,
            dy1 = -2.79f,
          )
          // m 8.75 2.8
          moveToRelative(dx = 8.75f, dy = 2.8f)
          // V 21.9
          verticalLineTo(y = 21.9f)
          // a 6 6 0 0 0 2.46 -1.03
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.46f,
            dy1 = -1.03f,
          )
          // l 4.28 4.28
          lineToRelative(dx = 4.28f, dy = 4.28f)
          // a 12 12 0 0 1 -6.74 2.8
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.74f,
            dy1 = 2.8f,
          )
          // M 21.91 15
          moveTo(x = 21.91f, y = 15.0f)
          // A 6 6 0 0 0 17 10.09
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 10.09f,
          )
          // V 4.04
          verticalLineTo(y = 4.04f)
          // A 12 12 0 0 1 27.96 15z
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.96f,
            y1 = 15.0f,
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
      .also { _chartSunburst = it }
  }

@Suppress("ObjectPropertyName")
private var _chartSunburst: ImageVector? = null
