// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Watsonx: ImageVector
  get() {
    val current = _watsonx
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Watsonx",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.31 22.92 A15.02 15.02 0 0 0 6.8 4.17 2 2 0 0 0 4 6 a2 2 0 0 0 4 0 L7.98 5.78 a13 13 0 0 1 10.85 -2.46 8 8 0 0 0 -5.57 9.98 8 8 0 0 0 -2.19 -.33 8 8 0 0 0 -7.73 5.96 A13 13 0 0 1 4.46 10 L2.7 9.08 A15.02 15.02 0 0 0 25.2 27.83 2 2 0 0 0 28 26 a2 2 0 0 0 -4 0 l.02 .22 a13 13 0 0 1 -3.55 1.98 A4.9 4.9 0 0 0 19 22.02 a7.93 7.93 0 0 0 -.26 -3.3 7.93 7.93 0 0 0 9.93 -5.65 A13 13 0 0 1 27.54 22z m-17.8 5.26 a13 13 0 0 1 -4.82 -3.13 6 6 0 1 1 10.38 -4.08 l-.01 .15 a5 5 0 0 0 -5.54 7.06 M19 26 a3 3 0 1 1 -6 0 3 3 0 0 1 6 0 m1.93 -8.97 A6 6 0 1 1 24.7 6.37 q.46 .42 .87 .86 a6 6 0 0 1 -4.64 9.8
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.31 22.92
          moveTo(x = 29.31f, y = 22.92f)
          // A 15.02 15.02 0 0 0 6.8 4.17
          arcTo(
            horizontalEllipseRadius = 15.02f,
            verticalEllipseRadius = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.8f,
            y1 = 4.17f,
          )
          // A 2 2 0 0 0 4 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 6.0f,
          )
          // a 2 2 0 0 0 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // L 7.98 5.78
          lineTo(x = 7.98f, y = 5.78f)
          // a 13 13 0 0 1 10.85 -2.46
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.85f,
            dy1 = -2.46f,
          )
          // a 8 8 0 0 0 -5.57 9.98
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.57f,
            dy1 = 9.98f,
          )
          // a 8 8 0 0 0 -2.19 -0.33
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.19f,
            dy1 = -0.33f,
          )
          // a 8 8 0 0 0 -7.73 5.96
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.73f,
            dy1 = 5.96f,
          )
          // A 13 13 0 0 1 4.46 10
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.46f,
            y1 = 10.0f,
          )
          // L 2.7 9.08
          lineTo(x = 2.7f, y = 9.08f)
          // A 15.02 15.02 0 0 0 25.2 27.83
          arcTo(
            horizontalEllipseRadius = 15.02f,
            verticalEllipseRadius = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.2f,
            y1 = 27.83f,
          )
          // A 2 2 0 0 0 28 26
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.0f,
          )
          // a 2 2 0 0 0 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          // l 0.02 0.22
          lineToRelative(dx = 0.02f, dy = 0.22f)
          // a 13 13 0 0 1 -3.55 1.98
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.55f,
            dy1 = 1.98f,
          )
          // A 4.9 4.9 0 0 0 19 22.02
          arcTo(
            horizontalEllipseRadius = 4.9f,
            verticalEllipseRadius = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 22.02f,
          )
          // a 7.93 7.93 0 0 0 -0.26 -3.3
          arcToRelative(
            a = 7.93f,
            b = 7.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.26f,
            dy1 = -3.3f,
          )
          // a 7.93 7.93 0 0 0 9.93 -5.65
          arcToRelative(
            a = 7.93f,
            b = 7.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.93f,
            dy1 = -5.65f,
          )
          // A 13 13 0 0 1 27.54 22z
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.54f,
            y1 = 22.0f,
          )
          close()
          // m -17.8 5.26
          moveToRelative(dx = -17.8f, dy = 5.26f)
          // a 13 13 0 0 1 -4.82 -3.13
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.82f,
            dy1 = -3.13f,
          )
          // a 6 6 0 1 1 10.38 -4.08
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 10.38f,
            dy1 = -4.08f,
          )
          // l -0.01 0.15
          lineToRelative(dx = -0.01f, dy = 0.15f)
          // a 5 5 0 0 0 -5.54 7.06
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.54f,
            dy1 = 7.06f,
          )
          // M 19 26
          moveTo(x = 19.0f, y = 26.0f)
          // a 3 3 0 1 1 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 0 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // m 1.93 -8.97
          moveToRelative(dx = 1.93f, dy = -8.97f)
          // A 6 6 0 1 1 24.7 6.37
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 24.7f,
            y1 = 6.37f,
          )
          // q 0.46 0.42 0.87 0.86
          quadToRelative(
            dx1 = 0.46f,
            dy1 = 0.42f,
            dx2 = 0.87f,
            dy2 = 0.86f,
          )
          // a 6 6 0 0 1 -4.64 9.8
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.64f,
            dy1 = 9.8f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _watsonx = it }
  }

@Suppress("ObjectPropertyName")
private var _watsonx: ImageVector? = null
