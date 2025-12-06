// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LassoPolygon: ImageVector
  get() {
    val current = _lassoPolygon
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LassoPolygon",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.62 2.22 a1 1 0 0 0 -1.1 -.1 L17.95 7.8 3.37 2.07 A1 1 0 0 0 2.09 3.4 l6.43 14.48 a3.97 3.97 0 0 0 1.4 6.94 A4 4 0 0 1 6 28 H4 v2 h2 a6 6 0 0 0 5.93 -5.12 A4 4 0 0 0 14.86 22 h8.38 a2 2 0 0 0 1.93 -1.46 l4.8 -17.27 a1 1 0 0 0 -.35 -1.05 M11 23 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m12.24 -3 h-8.38 a3.9 3.9 0 0 0 -4.51 -2.93 L4.9 4.82 18.06 10 l9.35 -5.01Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.62 2.22
          moveTo(x = 29.62f, y = 2.22f)
          // a 1 1 0 0 0 -1.1 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.1f,
            dy1 = -0.1f,
          )
          // L 17.95 7.8
          lineTo(x = 17.95f, y = 7.8f)
          // L 3.37 2.07
          lineTo(x = 3.37f, y = 2.07f)
          // A 1 1 0 0 0 2.09 3.4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.09f,
            y1 = 3.4f,
          )
          // l 6.43 14.48
          lineToRelative(dx = 6.43f, dy = 14.48f)
          // a 3.97 3.97 0 0 0 1.4 6.94
          arcToRelative(
            a = 3.97f,
            b = 3.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 6.94f,
          )
          // A 4 4 0 0 1 6 28
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 28.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 0 0 5.93 -5.12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.93f,
            dy1 = -5.12f,
          )
          // A 4 4 0 0 0 14.86 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.86f,
            y1 = 22.0f,
          )
          // h 8.38
          horizontalLineToRelative(dx = 8.38f)
          // a 2 2 0 0 0 1.93 -1.46
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.93f,
            dy1 = -1.46f,
          )
          // l 4.8 -17.27
          lineToRelative(dx = 4.8f, dy = -17.27f)
          // a 1 1 0 0 0 -0.35 -1.05
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.35f,
            dy1 = -1.05f,
          )
          // M 11 23
          moveTo(x = 11.0f, y = 23.0f)
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
          // m 12.24 -3
          moveToRelative(dx = 12.24f, dy = -3.0f)
          // h -8.38
          horizontalLineToRelative(dx = -8.38f)
          // a 3.9 3.9 0 0 0 -4.51 -2.93
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.51f,
            dy1 = -2.93f,
          )
          // L 4.9 4.82
          lineTo(x = 4.9f, y = 4.82f)
          // L 18.06 10
          lineTo(x = 18.06f, y = 10.0f)
          // l 9.35 -5.01z
          lineToRelative(dx = 9.35f, dy = -5.01f)
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
      .also { _lassoPolygon = it }
  }

@Suppress("ObjectPropertyName")
private var _lassoPolygon: ImageVector? = null
