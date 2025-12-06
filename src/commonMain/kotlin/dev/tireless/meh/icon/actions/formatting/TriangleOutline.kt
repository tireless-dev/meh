// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleOutline: ImageVector
  get() {
    val current = _triangleOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.88 27.51 16.86 3.52 A1 1 0 0 0 16 3 a1 1 0 0 0 -.86 .52 l-13.01 24 A1 1 0 0 0 2 28 a1 1 0 0 0 .98 1 h26.04 A1 1 0 0 0 30 28 a1 1 0 0 0 -.12 -.49 M4.68 27 16 6.13 27.32 27z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.88 27.51
          moveTo(x = 29.88f, y = 27.51f)
          // L 16.86 3.52
          lineTo(x = 16.86f, y = 3.52f)
          // A 1 1 0 0 0 16 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 3.0f,
          )
          // a 1 1 0 0 0 -0.86 0.52
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.86f,
            dy1 = 0.52f,
          )
          // l -13.01 24
          lineToRelative(dx = -13.01f, dy = 24.0f)
          // A 1 1 0 0 0 2 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 0 0.98 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.98f,
            dy1 = 1.0f,
          )
          // h 26.04
          horizontalLineToRelative(dx = 26.04f)
          // A 1 1 0 0 0 30 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 0 -0.12 -0.49
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.12f,
            dy1 = -0.49f,
          )
          // M 4.68 27
          moveTo(x = 4.68f, y = 27.0f)
          // L 16 6.13
          lineTo(x = 16.0f, y = 6.13f)
          // L 27.32 27z
          lineTo(x = 27.32f, y = 27.0f)
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
      .also { _triangleOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleOutline: ImageVector? = null
