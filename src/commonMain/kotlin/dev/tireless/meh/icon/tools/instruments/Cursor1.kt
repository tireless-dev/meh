// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cursor1: ImageVector
  get() {
    val current = _cursor1
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Cursor1",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 28 a1 1 0 0 1 -.71 -.29 l-6.13 -6.14 -3.33 5 a1 1 0 0 1 -1 .44 1 1 0 0 1 -.81 -.7 l-6 -20 A1 1 0 0 1 6.29 5 l20 6 a1 1 0 0 1 .7 .81 1 1 0 0 1 -.44 1 l-5 3.33 6.14 6.13 a1 1 0 0 1 0 1.42 l-4 4 A1 1 0 0 1 23 28 m0 -2.41 L25.59 23 l-7.16 -7.15 5.25 -3.5 L7.49 7.49 l4.86 16.19 3.5 -5.25Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 28
          moveTo(x = 23.0f, y = 28.0f)
          // a 1 1 0 0 1 -0.71 -0.29
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.71f,
            dy1 = -0.29f,
          )
          // l -6.13 -6.14
          lineToRelative(dx = -6.13f, dy = -6.14f)
          // l -3.33 5
          lineToRelative(dx = -3.33f, dy = 5.0f)
          // a 1 1 0 0 1 -1 0.44
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 0.44f,
          )
          // a 1 1 0 0 1 -0.81 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.81f,
            dy1 = -0.7f,
          )
          // l -6 -20
          lineToRelative(dx = -6.0f, dy = -20.0f)
          // A 1 1 0 0 1 6.29 5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.29f,
            y1 = 5.0f,
          )
          // l 20 6
          lineToRelative(dx = 20.0f, dy = 6.0f)
          // a 1 1 0 0 1 0.7 0.81
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = 0.81f,
          )
          // a 1 1 0 0 1 -0.44 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = 1.0f,
          )
          // l -5 3.33
          lineToRelative(dx = -5.0f, dy = 3.33f)
          // l 6.14 6.13
          lineToRelative(dx = 6.14f, dy = 6.13f)
          // a 1 1 0 0 1 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // A 1 1 0 0 1 23 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 28.0f,
          )
          // m 0 -2.41
          moveToRelative(dx = 0.0f, dy = -2.41f)
          // L 25.59 23
          lineTo(x = 25.59f, y = 23.0f)
          // l -7.16 -7.15
          lineToRelative(dx = -7.16f, dy = -7.15f)
          // l 5.25 -3.5
          lineToRelative(dx = 5.25f, dy = -3.5f)
          // L 7.49 7.49
          lineTo(x = 7.49f, y = 7.49f)
          // l 4.86 16.19
          lineToRelative(dx = 4.86f, dy = 16.19f)
          // l 3.5 -5.25z
          lineToRelative(dx = 3.5f, dy = -5.25f)
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
      .also { _cursor1 = it }
  }

@Suppress("ObjectPropertyName")
private var _cursor1: ImageVector? = null
