// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrival: ImageVector
  get() {
    val current = _arrival
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Arrival",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28
          moveTo(x = 2.0f, y = 28.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // m17.21 5.23 1.39 .38 1 11.29 5.87 1.57 A2 2 0 0 1 27 20.62 a1.9 1.9 0 0 1 -1.37 1.52 2 2 0 0 1 -1 0 l-18.7 -5 a1.9 1.9 0 0 1 -1.33 -2.3 l1.75 -6.5 1.44 .38 .61 5.18 6 1.62z m-1 -2.2 a1 1 0 0 0 -.68 .69 L13 13.07 l-2.81 -.75 -.5 -4.53 A1 1 0 0 0 9 7 L5.87 6.14 a1 1 0 0 0 -.5 0 1 1 0 0 0 -.68 .68 l-2 7.49 a3.87 3.87 0 0 0 2.74 4.74 l18.71 5 A3.87 3.87 0 0 0 29 21 a4 4 0 0 0 -3 -4.42 l-4.52 -1.21 -.95 -10.66 a1 1 0 0 0 -.72 -.85 L16.73 3 a1 1 0 0 0 -.5 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.21 5.23
          moveTo(x = 17.21f, y = 5.23f)
          // l 1.39 0.38
          lineToRelative(dx = 1.39f, dy = 0.38f)
          // l 1 11.29
          lineToRelative(dx = 1.0f, dy = 11.29f)
          // l 5.87 1.57
          lineToRelative(dx = 5.87f, dy = 1.57f)
          // A 2 2 0 0 1 27 20.62
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 20.62f,
          )
          // a 1.9 1.9 0 0 1 -1.37 1.52
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.37f,
            dy1 = 1.52f,
          )
          // a 2 2 0 0 1 -1 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // l -18.7 -5
          lineToRelative(dx = -18.7f, dy = -5.0f)
          // a 1.9 1.9 0 0 1 -1.33 -2.3
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.33f,
            dy1 = -2.3f,
          )
          // l 1.75 -6.5
          lineToRelative(dx = 1.75f, dy = -6.5f)
          // l 1.44 0.38
          lineToRelative(dx = 1.44f, dy = 0.38f)
          // l 0.61 5.18
          lineToRelative(dx = 0.61f, dy = 5.18f)
          // l 6 1.62z
          lineToRelative(dx = 6.0f, dy = 1.62f)
          close()
          // m -1 -2.2
          moveToRelative(dx = -1.0f, dy = -2.2f)
          // a 1 1 0 0 0 -0.68 0.69
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.68f,
            dy1 = 0.69f,
          )
          // L 13 13.07
          lineTo(x = 13.0f, y = 13.07f)
          // l -2.81 -0.75
          lineToRelative(dx = -2.81f, dy = -0.75f)
          // l -0.5 -4.53
          lineToRelative(dx = -0.5f, dy = -4.53f)
          // A 1 1 0 0 0 9 7
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 7.0f,
          )
          // L 5.87 6.14
          lineTo(x = 5.87f, y = 6.14f)
          // a 1 1 0 0 0 -0.5 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 0 -0.68 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.68f,
            dy1 = 0.68f,
          )
          // l -2 7.49
          lineToRelative(dx = -2.0f, dy = 7.49f)
          // a 3.87 3.87 0 0 0 2.74 4.74
          arcToRelative(
            a = 3.87f,
            b = 3.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.74f,
            dy1 = 4.74f,
          )
          // l 18.71 5
          lineToRelative(dx = 18.71f, dy = 5.0f)
          // A 3.87 3.87 0 0 0 29 21
          arcTo(
            horizontalEllipseRadius = 3.87f,
            verticalEllipseRadius = 3.87f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 21.0f,
          )
          // a 4 4 0 0 0 -3 -4.42
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -4.42f,
          )
          // l -4.52 -1.21
          lineToRelative(dx = -4.52f, dy = -1.21f)
          // l -0.95 -10.66
          lineToRelative(dx = -0.95f, dy = -10.66f)
          // a 1 1 0 0 0 -0.72 -0.85
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.72f,
            dy1 = -0.85f,
          )
          // L 16.73 3
          lineTo(x = 16.73f, y = 3.0f)
          // a 1 1 0 0 0 -0.5 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = 0.0f,
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
      .also { _arrival = it }
  }

@Suppress("ObjectPropertyName")
private var _arrival: ImageVector? = null
