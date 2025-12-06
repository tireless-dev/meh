// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleSolid: ImageVector
  get() {
    val current = _triangleSolid
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleSolid",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M2.98 29 A1 1 0 0 1 2 28 a1 1 0 0 1 .12 -.49 L15.14 3.52 C15.34 3.18 15.67 3 16 3 s.67 .18 .86 .52 l13.02 24 A1 1 0 0 1 30 28 a1 1 0 0 1 -.98 1z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2.98 29
          moveTo(x = 2.98f, y = 29.0f)
          // A 1 1 0 0 1 2 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 1 0.12 -0.49
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.12f,
            dy1 = -0.49f,
          )
          // L 15.14 3.52
          lineTo(x = 15.14f, y = 3.52f)
          // C 15.34 3.18 15.67 3 16 3
          curveTo(
            x1 = 15.34f,
            y1 = 3.18f,
            x2 = 15.67f,
            y2 = 3.0f,
            x3 = 16.0f,
            y3 = 3.0f,
          )
          // s 0.67 0.18 0.86 0.52
          reflectiveCurveToRelative(
            dx1 = 0.67f,
            dy1 = 0.18f,
            dx2 = 0.86f,
            dy2 = 0.52f,
          )
          // l 13.02 24
          lineToRelative(dx = 13.02f, dy = 24.0f)
          // A 1 1 0 0 1 30 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 1 -0.98 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.98f,
            dy1 = 1.0f,
          )
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
      .also { _triangleSolid = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleSolid: ImageVector? = null
