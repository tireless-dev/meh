// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleRightOutline: ImageVector
  get() {
    val current = _triangleRightOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleRightOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m4.49 29.88 23.99 -13.02 A1 1 0 0 0 29 16 a1 1 0 0 0 -.52 -.86 l-24 -13.01 A1 1 0 0 0 4 2 a1 1 0 0 0 -1 .98 v26.04 A1 1 0 0 0 4 30 a1 1 0 0 0 .49 -.12 M5 4.68 25.87 16 5 27.32z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.49 29.88
          moveTo(x = 4.49f, y = 29.88f)
          // l 23.99 -13.02
          lineToRelative(dx = 23.99f, dy = -13.02f)
          // A 1 1 0 0 0 29 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 16.0f,
          )
          // a 1 1 0 0 0 -0.52 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.52f,
            dy1 = -0.86f,
          )
          // l -24 -13.01
          lineToRelative(dx = -24.0f, dy = -13.01f)
          // A 1 1 0 0 0 4 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 2.0f,
          )
          // a 1 1 0 0 0 -1 0.98
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.98f,
          )
          // v 26.04
          verticalLineToRelative(dy = 26.04f)
          // A 1 1 0 0 0 4 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 0 0.49 -0.12
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.49f,
            dy1 = -0.12f,
          )
          // M 5 4.68
          moveTo(x = 5.0f, y = 4.68f)
          // L 25.87 16
          lineTo(x = 25.87f, y = 16.0f)
          // L 5 27.32z
          lineTo(x = 5.0f, y = 27.32f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 0 32
          moveTo(x = 0.0f, y = 32.0f)
          // l -1.3987644E-6 -32
          lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
          // l 32 -1.3987644E-6
          lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
        // l 1.3987644E-6 32z
        lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
        close()
      }
    }.build()
      .also { _triangleRightOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleRightOutline: ImageVector? = null
