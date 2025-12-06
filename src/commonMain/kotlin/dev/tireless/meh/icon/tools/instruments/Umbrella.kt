// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Umbrella: ImageVector
  get() {
    val current = _umbrella
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Umbrella",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.99 15.83 A14.4 14.4 0 0 0 17 4.05 V2 h-2 v2.05 A14.4 14.4 0 0 0 2.01 15.83 a1 1 0 0 0 1.5 1.03 A5 5 0 0 1 6 16 a4.9 4.9 0 0 1 4.14 2.51 1.04 1.04 0 0 0 1.72 0 A5 5 0 0 1 15 16.13 v9.37 a2.5 2.5 0 0 1 -5 0 V25 H8 v.5 a4.5 4.5 0 0 0 9 0 v-9.37 a5 5 0 0 1 3.14 2.38 1 1 0 0 0 1.72 0 A4.9 4.9 0 0 1 26 16 a5 5 0 0 1 2.49 .86 1 1 0 0 0 1.5 -1.03 M6 14 a5 5 0 0 0 -1.5 .21 12.4 12.4 0 0 1 8.48 -7.81 14.5 14.5 0 0 0 -3.04 8.93 A6.5 6.5 0 0 0 6 14 m10 0 a6.6 6.6 0 0 0 -4.06 1.43 c.04 -2.22 .61 -6.49 4.06 -9.18 3.43 2.68 4 6.95 4.05 9.18 A6.6 6.6 0 0 0 16 14 m10 0 a6.5 6.5 0 0 0 -3.94 1.33 14.5 14.5 0 0 0 -3.04 -8.93 12.4 12.4 0 0 1 8.48 7.81 A5 5 0 0 0 26 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.99 15.83
          moveTo(x = 29.99f, y = 15.83f)
          // A 14.4 14.4 0 0 0 17 4.05
          arcTo(
            horizontalEllipseRadius = 14.4f,
            verticalEllipseRadius = 14.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 4.05f,
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
          // M 6 14
          moveTo(x = 6.0f, y = 14.0f)
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
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
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
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
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
          // a 12.4 12.4 0 0 1 8.48 7.81
          arcToRelative(
            a = 12.4f,
            b = 12.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.48f,
            dy1 = 7.81f,
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
      .also { _umbrella = it }
  }

@Suppress("ObjectPropertyName")
private var _umbrella: ImageVector? = null
