// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidVhfor: ImageVector
  get() {
    val current = _navaidVhfor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NavaidVhfor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 28 H10 a1 1 0 0 1 -.84 -.46 l-7 -11 a1 1 0 0 1 0 -1.08 l7 -11 A1 1 0 0 1 10 4 h12 a1 1 0 0 1 .84 .46 l7 11 a1 1 0 0 1 0 1.08 l-7 11 A1 1 0 0 1 22 28 m-11.45 -2 h10.9 l6.36 -10 -6.36 -10 h-10.9 L4.19 16Z
        path(
          fill = SolidColor(Color(0xFF171717)),
        ) {
          // M 22 28
          moveTo(x = 22.0f, y = 28.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 1 1 0 0 1 -0.84 -0.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.84f,
            dy1 = -0.46f,
          )
          // l -7 -11
          lineToRelative(dx = -7.0f, dy = -11.0f)
          // a 1 1 0 0 1 0 -1.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.08f,
          )
          // l 7 -11
          lineToRelative(dx = 7.0f, dy = -11.0f)
          // A 1 1 0 0 1 10 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 4.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 1 1 0 0 1 0.84 0.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.84f,
            dy1 = 0.46f,
          )
          // l 7 11
          lineToRelative(dx = 7.0f, dy = 11.0f)
          // a 1 1 0 0 1 0 1.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.08f,
          )
          // l -7 11
          lineToRelative(dx = -7.0f, dy = 11.0f)
          // A 1 1 0 0 1 22 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 28.0f,
          )
          // m -11.45 -2
          moveToRelative(dx = -11.45f, dy = -2.0f)
          // h 10.9
          horizontalLineToRelative(dx = 10.9f)
          // l 6.36 -10
          lineToRelative(dx = 6.36f, dy = -10.0f)
          // l -6.36 -10
          lineToRelative(dx = -6.36f, dy = -10.0f)
          // h -10.9
          horizontalLineToRelative(dx = -10.9f)
          // L 4.19 16z
          lineTo(x = 4.19f, y = 16.0f)
          close()
        }
        // M19.5 24 h-7 a1 1 0 0 1 -.84 -.46 l-4.5 -7 a1 1 0 0 1 0 -1.08 l4.5 -7 A1 1 0 0 1 12.5 8 h7 a1 1 0 0 1 .84 .46 l4.5 7 a1 1 0 0 1 0 1.08 l-4.5 7 A1 1 0 0 1 19.5 24 m-6.45 -2 h5.9 l3.86 -6 -3.86 -6 h-5.9 l-3.86 6Z
        path(
          fill = SolidColor(Color(0xFF171717)),
        ) {
          // M 19.5 24
          moveTo(x = 19.5f, y = 24.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 1 1 0 0 1 -0.84 -0.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.84f,
            dy1 = -0.46f,
          )
          // l -4.5 -7
          lineToRelative(dx = -4.5f, dy = -7.0f)
          // a 1 1 0 0 1 0 -1.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.08f,
          )
          // l 4.5 -7
          lineToRelative(dx = 4.5f, dy = -7.0f)
          // A 1 1 0 0 1 12.5 8
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.5f,
            y1 = 8.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 1 1 0 0 1 0.84 0.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.84f,
            dy1 = 0.46f,
          )
          // l 4.5 7
          lineToRelative(dx = 4.5f, dy = 7.0f)
          // a 1 1 0 0 1 0 1.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.08f,
          )
          // l -4.5 7
          lineToRelative(dx = -4.5f, dy = 7.0f)
          // A 1 1 0 0 1 19.5 24
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.5f,
            y1 = 24.0f,
          )
          // m -6.45 -2
          moveToRelative(dx = -6.45f, dy = -2.0f)
          // h 5.9
          horizontalLineToRelative(dx = 5.9f)
          // l 3.86 -6
          lineToRelative(dx = 3.86f, dy = -6.0f)
          // l -3.86 -6
          lineToRelative(dx = -3.86f, dy = -6.0f)
          // h -5.9
          horizontalLineToRelative(dx = -5.9f)
          // l -3.86 6z
          lineToRelative(dx = -3.86f, dy = 6.0f)
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
      .also { _navaidVhfor = it }
  }

@Suppress("ObjectPropertyName")
private var _navaidVhfor: ImageVector? = null
