// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Model: ImageVector
  get() {
    val current = _model
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Model",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 24.18 V7.82 a3 3 0 1 0 -3.78 -1.71 L16 14.17 6.78 6.11 A3 3 0 1 0 1 5 a3 3 0 0 0 2 2.8 v16.37 a3 3 0 1 0 3.4 1.04 l5.34 -4.66 2.36 4.14 A2.98 2.98 0 0 0 16 30 a2.98 2.98 0 0 0 1.9 -5.3 l2.36 -4.14 5.34 4.66 A3 3 0 1 0 31 27 a3 3 0 0 0 -2 -2.82 M28 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m-3.82 5.67 -4.44 7.77 -2.22 -1.94z m-9.7 5.83 -2.22 1.94 -4.44 -7.77z M4 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m0 24 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m1 -4.2 V8.77 l5.73 10.02z M16 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m0 -4.02 -2.73 -4.77 L16 16.83 l2.73 2.38z M27 8.77 V23.8 l-5.73 -5.01z M28 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 24.18
          moveTo(x = 29.0f, y = 24.18f)
          // V 7.82
          verticalLineTo(y = 7.82f)
          // a 3 3 0 1 0 -3.78 -1.71
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.78f,
            dy1 = -1.71f,
          )
          // L 16 14.17
          lineTo(x = 16.0f, y = 14.17f)
          // L 6.78 6.11
          lineTo(x = 6.78f, y = 6.11f)
          // A 3 3 0 1 0 1 5
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 1.0f,
            y1 = 5.0f,
          )
          // a 3 3 0 0 0 2 2.8
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.8f,
          )
          // v 16.37
          verticalLineToRelative(dy = 16.37f)
          // a 3 3 0 1 0 3.4 1.04
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.4f,
            dy1 = 1.04f,
          )
          // l 5.34 -4.66
          lineToRelative(dx = 5.34f, dy = -4.66f)
          // l 2.36 4.14
          lineToRelative(dx = 2.36f, dy = 4.14f)
          // A 2.98 2.98 0 0 0 16 30
          arcTo(
            horizontalEllipseRadius = 2.98f,
            verticalEllipseRadius = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // a 2.98 2.98 0 0 0 1.9 -5.3
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.9f,
            dy1 = -5.3f,
          )
          // l 2.36 -4.14
          lineToRelative(dx = 2.36f, dy = -4.14f)
          // l 5.34 4.66
          lineToRelative(dx = 5.34f, dy = 4.66f)
          // A 3 3 0 1 0 31 27
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 31.0f,
            y1 = 27.0f,
          )
          // a 3 3 0 0 0 -2 -2.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.82f,
          )
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // m -3.82 5.67
          moveToRelative(dx = -3.82f, dy = 5.67f)
          // l -4.44 7.77
          lineToRelative(dx = -4.44f, dy = 7.77f)
          // l -2.22 -1.94z
          lineToRelative(dx = -2.22f, dy = -1.94f)
          close()
          // m -9.7 5.83
          moveToRelative(dx = -9.7f, dy = 5.83f)
          // l -2.22 1.94
          lineToRelative(dx = -2.22f, dy = 1.94f)
          // l -4.44 -7.77z
          lineToRelative(dx = -4.44f, dy = -7.77f)
          close()
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // m 0 24
          moveToRelative(dx = 0.0f, dy = 24.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 1 -4.2
          moveToRelative(dx = 1.0f, dy = -4.2f)
          // V 8.77
          verticalLineTo(y = 8.77f)
          // l 5.73 10.02z
          lineToRelative(dx = 5.73f, dy = 10.02f)
          close()
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 0 -4.02
          moveToRelative(dx = 0.0f, dy = -4.02f)
          // l -2.73 -4.77
          lineToRelative(dx = -2.73f, dy = -4.77f)
          // L 16 16.83
          lineTo(x = 16.0f, y = 16.83f)
          // l 2.73 2.38z
          lineToRelative(dx = 2.73f, dy = 2.38f)
          close()
          // M 27 8.77
          moveTo(x = 27.0f, y = 8.77f)
          // V 23.8
          verticalLineTo(y = 23.8f)
          // l -5.73 -5.01z
          lineToRelative(dx = -5.73f, dy = -5.01f)
          close()
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
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
      .also { _model = it }
  }

@Suppress("ObjectPropertyName")
private var _model: ImageVector? = null
