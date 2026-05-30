// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleLeftOutline: ImageVector
  get() {
    val current = _triangleLeftOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TriangleLeftOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.51 2.12 3.52 15.14 A1 1 0 0 0 3 16 a1 1 0 0 0 .52 .86 l24 13.02 A1 1 0 0 0 28 30 a1 1 0 0 0 1 -.98 V2.98 A1 1 0 0 0 28 2 a1 1 0 0 0 -.49 .12 M27 27.32 6.13 16 27 4.68z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.51 2.12
          moveTo(x = 27.51f, y = 2.12f)
          // L 3.52 15.14
          lineTo(x = 3.52f, y = 15.14f)
          // A 1 1 0 0 0 3 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 16.0f,
          )
          // a 1 1 0 0 0 0.52 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.52f,
            dy1 = 0.86f,
          )
          // l 24 13.02
          lineToRelative(dx = 24.0f, dy = 13.02f)
          // A 1 1 0 0 0 28 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 0 1 -0.98
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.98f,
          )
          // V 2.98
          verticalLineTo(y = 2.98f)
          // A 1 1 0 0 0 28 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 2.0f,
          )
          // a 1 1 0 0 0 -0.49 0.12
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.49f,
            dy1 = 0.12f,
          )
          // M 27 27.32
          moveTo(x = 27.0f, y = 27.32f)
          // L 6.13 16
          lineTo(x = 6.13f, y = 16.0f)
          // L 27 4.68z
          lineTo(x = 27.0f, y = 4.68f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 32 0
          moveTo(x = 32.0f, y = 0.0f)
          // l -1.3987644E-6 32
          lineToRelative(dx = -1.3987644E-6f, dy = 32.0f)
          // l -32 -1.3987644E-6
          lineToRelative(dx = -32.0f, dy = -1.3987644E-6f)
          // l 1.3987644E-6 -32z
          lineToRelative(dx = 1.3987644E-6f, dy = -32.0f)
          close()
        }
      }.build()
      .also { _triangleLeftOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _triangleLeftOutline: ImageVector? = null
