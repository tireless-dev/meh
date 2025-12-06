// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleDownSolid: ImageVector
  get() {
    val current = _triangleDownSolid
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleDownSolid",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.02 3 A1 1 0 0 1 30 4 a1 1 0 0 1 -.12 .49 L16.86 28.48 C16.66 28.82 16.33 29 16 29 s-.67 -.18 -.86 -.52 l-13.02 -24 A1 1 0 0 1 2 4 a1 1 0 0 1 .98 -1z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.02 3
          moveTo(x = 29.02f, y = 3.0f)
          // A 1 1 0 0 1 30 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 1 -0.12 0.49
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.12f,
            dy1 = 0.49f,
          )
          // L 16.86 28.48
          lineTo(x = 16.86f, y = 28.48f)
          // C 16.66 28.82 16.33 29 16 29
          curveTo(
            x1 = 16.66f,
            y1 = 28.82f,
            x2 = 16.33f,
            y2 = 29.0f,
            x3 = 16.0f,
            y3 = 29.0f,
          )
          // s -0.67 -0.18 -0.86 -0.52
          reflectiveCurveToRelative(
            dx1 = -0.67f,
            dy1 = -0.18f,
            dx2 = -0.86f,
            dy2 = -0.52f,
          )
          // l -13.02 -24
          lineToRelative(dx = -13.02f, dy = -24.0f)
          // A 1 1 0 0 1 2 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 1 0.98 -1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.98f,
            dy1 = -1.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _triangleDownSolid = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleDownSolid: ImageVector? = null
