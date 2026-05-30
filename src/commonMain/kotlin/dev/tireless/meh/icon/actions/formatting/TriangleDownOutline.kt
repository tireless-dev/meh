// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleDownOutline: ImageVector
  get() {
    val current = _triangleDownOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleDownOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m2.12 4.49 13.02 23.99 A1 1 0 0 0 16 29 a1 1 0 0 0 .86 -.52 l13.02 -24 A1 1 0 0 0 30 4 a1 1 0 0 0 -.98 -1 H2.98 A1 1 0 0 0 2 4 a1 1 0 0 0 .12 .49 M27.32 5 16 25.87 4.68 5z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2.12 4.49
          moveTo(x = 2.12f, y = 4.49f)
          // l 13.02 23.99
          lineToRelative(dx = 13.02f, dy = 23.99f)
          // A 1 1 0 0 0 16 29
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 29.0f,
          )
          // a 1 1 0 0 0 0.86 -0.52
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.86f,
            dy1 = -0.52f,
          )
          // l 13.02 -24
          lineToRelative(dx = 13.02f, dy = -24.0f)
          // A 1 1 0 0 0 30 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 0 -0.98 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.98f,
            dy1 = -1.0f,
          )
          // H 2.98
          horizontalLineTo(x = 2.98f)
          // A 1 1 0 0 0 2 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 0 0.12 0.49
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.12f,
            dy1 = 0.49f,
          )
          // M 27.32 5
          moveTo(x = 27.32f, y = 5.0f)
          // L 16 25.87
          lineTo(x = 16.0f, y = 25.87f)
          // L 4.68 5z
          lineTo(x = 4.68f, y = 5.0f)
          close()
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
      .also { _triangleDownOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleDownOutline: ImageVector? = null
