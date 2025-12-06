// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DewPointFilled: ImageVector
  get() {
    val current = _dewPointFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DewPointFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 10 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m-9.5 26 A5.5 5.5 0 0 1 9 24.52 c0 -3.44 4.34 -21.01 4.53 -21.76 a1 1 0 0 1 1.94 0 C15.66 3.51 20 21.08 20 24.52 A5.5 5.5 0 0 1 14.5 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 10
          moveTo(x = 24.0f, y = 10.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -9.5 26
          moveToRelative(dx = -9.5f, dy = 26.0f)
          // A 5.5 5.5 0 0 1 9 24.52
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 24.52f,
          )
          // c 0 -3.44 4.34 -21.01 4.53 -21.76
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.44f,
            dx2 = 4.34f,
            dy2 = -21.01f,
            dx3 = 4.53f,
            dy3 = -21.76f,
          )
          // a 1 1 0 0 1 1.94 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.94f,
            dy1 = 0.0f,
          )
          // C 15.66 3.51 20 21.08 20 24.52
          curveTo(
            x1 = 15.66f,
            y1 = 3.51f,
            x2 = 20.0f,
            y2 = 21.08f,
            x3 = 20.0f,
            y3 = 24.52f,
          )
          // A 5.5 5.5 0 0 1 14.5 30
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.5f,
            y1 = 30.0f,
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
      .also { _dewPointFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _dewPointFilled: ImageVector? = null
