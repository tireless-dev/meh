// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cut: ImageVector
  get() {
    val current = _cut
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Cut",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.5 19.63 20.24 16 l6.26 -3.63 a5 5 0 0 0 -1.21 -9.2 A5 5 0 0 0 24 3 a5 5 0 0 0 -4.33 7.53 5 5 0 0 0 2.39 2.1 l-3.82 2.21 L4 6.6 3 8.34 16.24 16 3 23.68 l1 1.74 14.24 -8.26 3.82 2.21 a5 5 0 0 0 -2.39 2.1 A5 5 0 0 0 24 29 a5 5 0 0 0 1.29 -.17 5 5 0 0 0 1.21 -9.2 m-5.1 -10.1 a3 3 0 0 1 1.1 -4.12 3 3 0 0 1 4.1 1.11 3 3 0 0 1 -1.1 4.11 3 3 0 0 1 -4.1 -1.1 m5.2 16 a3 3 0 0 1 -4.1 1.11 3 3 0 0 1 -1.1 -4.12 3 3 0 0 1 4.1 -1.1 3 3 0 0 1 1.1 4.06Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.5 19.63
          moveTo(x = 26.5f, y = 19.63f)
          // L 20.24 16
          lineTo(x = 20.24f, y = 16.0f)
          // l 6.26 -3.63
          lineToRelative(dx = 6.26f, dy = -3.63f)
          // a 5 5 0 0 0 -1.21 -9.2
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.21f,
            dy1 = -9.2f,
          )
          // A 5 5 0 0 0 24 3
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 3.0f,
          )
          // a 5 5 0 0 0 -4.33 7.53
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.33f,
            dy1 = 7.53f,
          )
          // a 5 5 0 0 0 2.39 2.1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.39f,
            dy1 = 2.1f,
          )
          // l -3.82 2.21
          lineToRelative(dx = -3.82f, dy = 2.21f)
          // L 4 6.6
          lineTo(x = 4.0f, y = 6.6f)
          // L 3 8.34
          lineTo(x = 3.0f, y = 8.34f)
          // L 16.24 16
          lineTo(x = 16.24f, y = 16.0f)
          // L 3 23.68
          lineTo(x = 3.0f, y = 23.68f)
          // l 1 1.74
          lineToRelative(dx = 1.0f, dy = 1.74f)
          // l 14.24 -8.26
          lineToRelative(dx = 14.24f, dy = -8.26f)
          // l 3.82 2.21
          lineToRelative(dx = 3.82f, dy = 2.21f)
          // a 5 5 0 0 0 -2.39 2.1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.39f,
            dy1 = 2.1f,
          )
          // A 5 5 0 0 0 24 29
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 29.0f,
          )
          // a 5 5 0 0 0 1.29 -0.17
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.29f,
            dy1 = -0.17f,
          )
          // a 5 5 0 0 0 1.21 -9.2
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.21f,
            dy1 = -9.2f,
          )
          // m -5.1 -10.1
          moveToRelative(dx = -5.1f, dy = -10.1f)
          // a 3 3 0 0 1 1.1 -4.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.1f,
            dy1 = -4.12f,
          )
          // a 3 3 0 0 1 4.1 1.11
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.1f,
            dy1 = 1.11f,
          )
          // a 3 3 0 0 1 -1.1 4.11
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.1f,
            dy1 = 4.11f,
          )
          // a 3 3 0 0 1 -4.1 -1.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.1f,
            dy1 = -1.1f,
          )
          // m 5.2 16
          moveToRelative(dx = 5.2f, dy = 16.0f)
          // a 3 3 0 0 1 -4.1 1.11
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.1f,
            dy1 = 1.11f,
          )
          // a 3 3 0 0 1 -1.1 -4.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.1f,
            dy1 = -4.12f,
          )
          // a 3 3 0 0 1 4.1 -1.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.1f,
            dy1 = -1.1f,
          )
          // a 3 3 0 0 1 1.1 4.06z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.1f,
            dy1 = 4.06f,
          )
          close()
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
      .also { _cut = it }
  }

@Suppress("ObjectPropertyName")
private var _cut: ImageVector? = null
