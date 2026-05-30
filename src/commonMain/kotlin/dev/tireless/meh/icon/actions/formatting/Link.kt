// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Link: ImageVector
  get() {
    val current = _link
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Link",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.25 6.76 a6 6 0 0 0 -8.5 0 l1.42 1.42 a4 4 0 1 1 5.67 5.67 l-8 8 a4 4 0 1 1 -5.67 -5.66 l1.41 -1.42 -1.41 -1.42 -1.42 1.42 a6 6 0 0 0 0 8.5 A6 6 0 0 0 17 25 a6 6 0 0 0 4.27 -1.76 l8 -8 a6 6 0 0 0 -.02 -8.48
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.25 6.76
          moveTo(x = 29.25f, y = 6.76f)
          // a 6 6 0 0 0 -8.5 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.5f,
            dy1 = 0.0f,
          )
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // a 4 4 0 1 1 5.67 5.67
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.67f,
            dy1 = 5.67f,
          )
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // a 4 4 0 1 1 -5.67 -5.66
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.67f,
            dy1 = -5.66f,
          )
          // l 1.41 -1.42
          lineToRelative(dx = 1.41f, dy = -1.42f)
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // a 6 6 0 0 0 0 8.5
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.5f,
          )
          // A 6 6 0 0 0 17 25
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 25.0f,
          )
          // a 6 6 0 0 0 4.27 -1.76
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.27f,
            dy1 = -1.76f,
          )
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // a 6 6 0 0 0 -0.02 -8.48
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.02f,
            dy1 = -8.48f,
          )
        }
        // M4.19 24.82 a4 4 0 0 1 0 -5.67 l8 -8 a4 4 0 0 1 5.67 0 A4 4 0 0 1 19 14 a4 4 0 0 1 -1.17 2.85 L15.71 19 l1.42 1.42 2.12 -2.12 a6 6 0 0 0 -8.51 -8.51 l-8 8 a6 6 0 0 0 0 8.51 A6 6 0 0 0 7 28 a6 6 0 0 0 4.28 -1.76 l-1.42 -1.42 a4 4 0 0 1 -5.67 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.19 24.82
          moveTo(x = 4.19f, y = 24.82f)
          // a 4 4 0 0 1 0 -5.67
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -5.67f,
          )
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // a 4 4 0 0 1 5.67 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.67f,
            dy1 = 0.0f,
          )
          // A 4 4 0 0 1 19 14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 14.0f,
          )
          // a 4 4 0 0 1 -1.17 2.85
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.17f,
            dy1 = 2.85f,
          )
          // L 15.71 19
          lineTo(x = 15.71f, y = 19.0f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // l 2.12 -2.12
          lineToRelative(dx = 2.12f, dy = -2.12f)
          // a 6 6 0 0 0 -8.51 -8.51
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.51f,
            dy1 = -8.51f,
          )
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // a 6 6 0 0 0 0 8.51
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.51f,
          )
          // A 6 6 0 0 0 7 28
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 28.0f,
          )
          // a 6 6 0 0 0 4.28 -1.76
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.28f,
            dy1 = -1.76f,
          )
          // l -1.42 -1.42
          lineToRelative(dx = -1.42f, dy = -1.42f)
          // a 4 4 0 0 1 -5.67 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.67f,
            dy1 = 0.0f,
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
      .also { _link = it }
  }

@Suppress("ObjectPropertyName")
private var _link: ImageVector? = null
