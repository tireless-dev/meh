// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidVortac: ImageVector
  get() {
    val current = _navaidVortac
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NavaidVortac",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="14.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 14
          moveTo(x = 16.0f, y = 14.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // m29.87 10.5 -4 -7 a1 1 0 0 0 -1.38 -.36 L19.72 6 h-7.44 L7.5 3.14 A1 1 0 0 0 6.13 3.5 l-4 7 a1 1 0 0 0 .36 1.36 l4.77 2.86 L11 21.27 V27 a1 1 0 0 0 1 1 h8 a1 1 0 0 0 1 -1 v-5.73 l3.74 -6.55 4.77 -2.86 a1 1 0 0 0 .36 -1.36 M18.85 21 h-5.7 l-4.57 -8 2.85 -5 h9.14 l2.85 5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.87 10.5
          moveTo(x = 29.87f, y = 10.5f)
          // l -4 -7
          lineToRelative(dx = -4.0f, dy = -7.0f)
          // a 1 1 0 0 0 -1.38 -0.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.38f,
            dy1 = -0.36f,
          )
          // L 19.72 6
          lineTo(x = 19.72f, y = 6.0f)
          // h -7.44
          horizontalLineToRelative(dx = -7.44f)
          // L 7.5 3.14
          lineTo(x = 7.5f, y = 3.14f)
          // A 1 1 0 0 0 6.13 3.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.13f,
            y1 = 3.5f,
          )
          // l -4 7
          lineToRelative(dx = -4.0f, dy = 7.0f)
          // a 1 1 0 0 0 0.36 1.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = 1.36f,
          )
          // l 4.77 2.86
          lineToRelative(dx = 4.77f, dy = 2.86f)
          // L 11 21.27
          lineTo(x = 11.0f, y = 21.27f)
          // V 27
          verticalLineTo(y = 27.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v -5.73
          verticalLineToRelative(dy = -5.73f)
          // l 3.74 -6.55
          lineToRelative(dx = 3.74f, dy = -6.55f)
          // l 4.77 -2.86
          lineToRelative(dx = 4.77f, dy = -2.86f)
          // a 1 1 0 0 0 0.36 -1.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.36f,
            dy1 = -1.36f,
          )
          // M 18.85 21
          moveTo(x = 18.85f, y = 21.0f)
          // h -5.7
          horizontalLineToRelative(dx = -5.7f)
          // l -4.57 -8
          lineToRelative(dx = -4.57f, dy = -8.0f)
          // l 2.85 -5
          lineToRelative(dx = 2.85f, dy = -5.0f)
          // h 9.14
          horizontalLineToRelative(dx = 9.14f)
          // l 2.85 5z
          lineToRelative(dx = 2.85f, dy = 5.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _navaidVortac = it }
  }

@Suppress("ObjectPropertyName")
private var _navaidVortac: ImageVector? = null
