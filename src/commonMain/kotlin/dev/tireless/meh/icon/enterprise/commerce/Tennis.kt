// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tennis: ImageVector
  get() {
    val current = _tennis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tennis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="4" rx="2.0" x="20.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 4
          moveTo(x = 20.0f, y = 4.0f)
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
          // h 0
          horizontalLineToRelative(dx = 0.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 0
          verticalLineToRelative(dy = 0.0f)
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
          // h -0
          horizontalLineToRelative(dx = -0.0f)
          // a 2 2 0 0 1 -2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          close()
        }
        // M11 16 a1 1 0 0 1 -.7 -1.7 l7 -7 a1 1 0 1 1 1.4 1.4 l-7 7 A1 1 0 0 1 11 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
          // a 1 1 0 0 1 -0.7 -1.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -1.7f,
          )
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // a 1 1 0 1 1 1.4 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 1.4f,
          )
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // A 1 1 0 0 1 11 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 16.0f,
          )
        }
        // M23.7 24.3 A8.4 8.4 0 0 0 19 22.07 l.57 -.52 a9.2 9.2 0 0 0 1.74 -9.91 l-1.88 .7 c1.11 2.98 .64 5.9 -1.27 7.8 a6.7 6.7 0 0 1 -5.56 1.8 9.8 9.8 0 0 1 -5.77 -2.78 C3.84 16.2 2.74 10.94 5.84 7.85 c1.9 -1.9 4.82 -2.38 7.8 -1.27 l.7 -1.88 C10.66 3.33 6.86 4 4.42 6.43 c-3.94 3.94 -2.68 10.5 .98 14.15 a11.8 11.8 0 0 0 6.98 3.36 L13 23.98 V24 h5 a7 7 0 0 1 4.3 1.7 l4.29 4.3 L28 28.59Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.7 24.3
          moveTo(x = 23.7f, y = 24.3f)
          // A 8.4 8.4 0 0 0 19 22.07
          arcTo(
            horizontalEllipseRadius = 8.4f,
            verticalEllipseRadius = 8.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 22.07f,
          )
          // l 0.57 -0.52
          lineToRelative(dx = 0.57f, dy = -0.52f)
          // a 9.2 9.2 0 0 0 1.74 -9.91
          arcToRelative(
            a = 9.2f,
            b = 9.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.74f,
            dy1 = -9.91f,
          )
          // l -1.88 0.7
          lineToRelative(dx = -1.88f, dy = 0.7f)
          // c 1.11 2.98 0.64 5.9 -1.27 7.8
          curveToRelative(
            dx1 = 1.11f,
            dy1 = 2.98f,
            dx2 = 0.64f,
            dy2 = 5.9f,
            dx3 = -1.27f,
            dy3 = 7.8f,
          )
          // a 6.7 6.7 0 0 1 -5.56 1.8
          arcToRelative(
            a = 6.7f,
            b = 6.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.56f,
            dy1 = 1.8f,
          )
          // a 9.8 9.8 0 0 1 -5.77 -2.78
          arcToRelative(
            a = 9.8f,
            b = 9.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.77f,
            dy1 = -2.78f,
          )
          // C 3.84 16.2 2.74 10.94 5.84 7.85
          curveTo(
            x1 = 3.84f,
            y1 = 16.2f,
            x2 = 2.74f,
            y2 = 10.94f,
            x3 = 5.84f,
            y3 = 7.85f,
          )
          // c 1.9 -1.9 4.82 -2.38 7.8 -1.27
          curveToRelative(
            dx1 = 1.9f,
            dy1 = -1.9f,
            dx2 = 4.82f,
            dy2 = -2.38f,
            dx3 = 7.8f,
            dy3 = -1.27f,
          )
          // l 0.7 -1.88
          lineToRelative(dx = 0.7f, dy = -1.88f)
          // C 10.66 3.33 6.86 4 4.42 6.43
          curveTo(
            x1 = 10.66f,
            y1 = 3.33f,
            x2 = 6.86f,
            y2 = 4.0f,
            x3 = 4.42f,
            y3 = 6.43f,
          )
          // c -3.94 3.94 -2.68 10.5 0.98 14.15
          curveToRelative(
            dx1 = -3.94f,
            dy1 = 3.94f,
            dx2 = -2.68f,
            dy2 = 10.5f,
            dx3 = 0.98f,
            dy3 = 14.15f,
          )
          // a 11.8 11.8 0 0 0 6.98 3.36
          arcToRelative(
            a = 11.8f,
            b = 11.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.98f,
            dy1 = 3.36f,
          )
          // L 13 23.98
          lineTo(x = 13.0f, y = 23.98f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 7 7 0 0 1 4.3 1.7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.3f,
            dy1 = 1.7f,
          )
          // l 4.29 4.3
          lineToRelative(dx = 4.29f, dy = 4.3f)
          // L 28 28.59z
          lineTo(x = 28.0f, y = 28.59f)
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
      .also { _tennis = it }
  }

@Suppress("ObjectPropertyName")
private var _tennis: ImageVector? = null
