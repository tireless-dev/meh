// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeepDry: ImageVector
  get() {
    val current = _keepDry
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KeepDry",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 10 a3.9 3.9 0 0 1 -4 -3.78 4 4 0 0 1 .65 -2.06 l2.52 -3.75 a1.04 1.04 0 0 1 1.66 0 l2.49 3.7 A4 4 0 0 1 29 6.22 3.9 3.9 0 0 1 25 10 m0 -7.24 -1.66 2.47 a2 2 0 0 0 -.34 1 2.01 2.01 0 0 0 4 0 2 2 0 0 0 -.37 -1.05Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 10
          moveTo(x = 25.0f, y = 10.0f)
          // a 3.9 3.9 0 0 1 -4 -3.78
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -3.78f,
          )
          // a 4 4 0 0 1 0.65 -2.06
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.65f,
            dy1 = -2.06f,
          )
          // l 2.52 -3.75
          lineToRelative(dx = 2.52f, dy = -3.75f)
          // a 1.04 1.04 0 0 1 1.66 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.66f,
            dy1 = 0.0f,
          )
          // l 2.49 3.7
          lineToRelative(dx = 2.49f, dy = 3.7f)
          // A 4 4 0 0 1 29 6.22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 6.22f,
          )
          // A 3.9 3.9 0 0 1 25 10
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 10.0f,
          )
          // m 0 -7.24
          moveToRelative(dx = 0.0f, dy = -7.24f)
          // l -1.66 2.47
          lineToRelative(dx = -1.66f, dy = 2.47f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // a 2.01 2.01 0 0 0 4 0
          arcToRelative(
            a = 2.01f,
            b = 2.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 0 -0.37 -1.05z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -1.05f,
          )
          close()
        }
        // M29.99 15.83 A14 14 0 0 0 28.17 11 l-1.74 1 a12 12 0 0 1 1.07 2.21 A5 5 0 0 0 26 14 a6.5 6.5 0 0 0 -3.94 1.33 14.5 14.5 0 0 0 -3.04 -8.93 14 14 0 0 0 -2.02 -2 V2 h-2 v2.05 A14.4 14.4 0 0 0 2.01 15.83 a1 1 0 0 0 1.5 1.03 A5 5 0 0 1 6 16 a4.9 4.9 0 0 1 4.14 2.51 1.04 1.04 0 0 0 1.72 0 A5 5 0 0 1 15 16.13 v9.37 a2.5 2.5 0 0 1 -5 0 V25 H8 v.5 a4.5 4.5 0 0 0 9 0 v-9.37 a5 5 0 0 1 3.14 2.38 1 1 0 0 0 1.72 0 A4.9 4.9 0 0 1 26 16 a5 5 0 0 1 2.49 .86 1 1 0 0 0 1.5 -1.03 m-20.05 -.5 A6.5 6.5 0 0 0 6 14 a5 5 0 0 0 -1.5 .21 12.4 12.4 0 0 1 8.48 -7.81 14.5 14.5 0 0 0 -3.04 8.93 M16 14 a6.6 6.6 0 0 0 -4.06 1.43 c.04 -2.22 .61 -6.49 4.06 -9.18 3.43 2.68 4 6.95 4.05 9.18 A6.6 6.6 0 0 0 16 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.99 15.83
          moveTo(x = 29.99f, y = 15.83f)
          // A 14 14 0 0 0 28.17 11
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.17f,
            y1 = 11.0f,
          )
          // l -1.74 1
          lineToRelative(dx = -1.74f, dy = 1.0f)
          // a 12 12 0 0 1 1.07 2.21
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.07f,
            dy1 = 2.21f,
          )
          // A 5 5 0 0 0 26 14
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 14.0f,
          )
          // a 6.5 6.5 0 0 0 -3.94 1.33
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.94f,
            dy1 = 1.33f,
          )
          // a 14.5 14.5 0 0 0 -3.04 -8.93
          arcToRelative(
            a = 14.5f,
            b = 14.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.04f,
            dy1 = -8.93f,
          )
          // a 14 14 0 0 0 -2.02 -2
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.02f,
            dy1 = -2.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // A 14.4 14.4 0 0 0 2.01 15.83
          arcTo(
            horizontalEllipseRadius = 14.4f,
            verticalEllipseRadius = 14.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.01f,
            y1 = 15.83f,
          )
          // a 1 1 0 0 0 1.5 1.03
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = 1.03f,
          )
          // A 5 5 0 0 1 6 16
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 16.0f,
          )
          // a 4.9 4.9 0 0 1 4.14 2.51
          arcToRelative(
            a = 4.9f,
            b = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.14f,
            dy1 = 2.51f,
          )
          // a 1.04 1.04 0 0 0 1.72 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.72f,
            dy1 = 0.0f,
          )
          // A 5 5 0 0 1 15 16.13
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 16.13f,
          )
          // v 9.37
          verticalLineToRelative(dy = 9.37f)
          // a 2.5 2.5 0 0 1 -5 0
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 0.0f,
          )
          // V 25
          verticalLineTo(y = 25.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 0.5
          verticalLineToRelative(dy = 0.5f)
          // a 4.5 4.5 0 0 0 9 0
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.0f,
            dy1 = 0.0f,
          )
          // v -9.37
          verticalLineToRelative(dy = -9.37f)
          // a 5 5 0 0 1 3.14 2.38
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.14f,
            dy1 = 2.38f,
          )
          // a 1 1 0 0 0 1.72 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.72f,
            dy1 = 0.0f,
          )
          // A 4.9 4.9 0 0 1 26 16
          arcTo(
            horizontalEllipseRadius = 4.9f,
            verticalEllipseRadius = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 16.0f,
          )
          // a 5 5 0 0 1 2.49 0.86
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.49f,
            dy1 = 0.86f,
          )
          // a 1 1 0 0 0 1.5 -1.03
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = -1.03f,
          )
          // m -20.05 -0.5
          moveToRelative(dx = -20.05f, dy = -0.5f)
          // A 6.5 6.5 0 0 0 6 14
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 14.0f,
          )
          // a 5 5 0 0 0 -1.5 0.21
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.5f,
            dy1 = 0.21f,
          )
          // a 12.4 12.4 0 0 1 8.48 -7.81
          arcToRelative(
            a = 12.4f,
            b = 12.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.48f,
            dy1 = -7.81f,
          )
          // a 14.5 14.5 0 0 0 -3.04 8.93
          arcToRelative(
            a = 14.5f,
            b = 14.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.04f,
            dy1 = 8.93f,
          )
          // M 16 14
          moveTo(x = 16.0f, y = 14.0f)
          // a 6.6 6.6 0 0 0 -4.06 1.43
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.06f,
            dy1 = 1.43f,
          )
          // c 0.04 -2.22 0.61 -6.49 4.06 -9.18
          curveToRelative(
            dx1 = 0.04f,
            dy1 = -2.22f,
            dx2 = 0.61f,
            dy2 = -6.49f,
            dx3 = 4.06f,
            dy3 = -9.18f,
          )
          // c 3.43 2.68 4 6.95 4.05 9.18
          curveToRelative(
            dx1 = 3.43f,
            dy1 = 2.68f,
            dx2 = 4.0f,
            dy2 = 6.95f,
            dx3 = 4.05f,
            dy3 = 9.18f,
          )
          // A 6.6 6.6 0 0 0 16 14
          arcTo(
            horizontalEllipseRadius = 6.6f,
            verticalEllipseRadius = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 14.0f,
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
      .also { _keepDry = it }
  }

@Suppress("ObjectPropertyName")
private var _keepDry: ImageVector? = null
