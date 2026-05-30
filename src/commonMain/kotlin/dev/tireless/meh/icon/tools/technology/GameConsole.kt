// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GameConsole: ImageVector
  get() {
    val current = _gameConsole
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GameConsole",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M7.51 26 a6 6 0 0 1 -1.44 -.19 A5.6 5.6 0 0 1 2.19 19 l2.33 -8.84 a5.5 5.5 0 0 1 2.59 -3.43 5.4 5.4 0 0 1 4.15 -.54 A5.5 5.5 0 0 1 14.7 9 h2.6 a5.5 5.5 0 0 1 3.44 -2.81 5.4 5.4 0 0 1 4.15 .54 5.6 5.6 0 0 1 2.59 3.41 L29.81 19 a5.6 5.6 0 0 1 -3.89 6.83 5.4 5.4 0 0 1 -4.15 -.54 5.5 5.5 0 0 1 -2.59 -3.41 L19 21 h-6 l-.23 .86 a5.5 5.5 0 0 1 -2.59 3.41 A5.5 5.5 0 0 1 7.51 26 M9.83 8 a3.5 3.5 0 0 0 -1.72 .46 3.6 3.6 0 0 0 -1.66 2.19 l-2.33 8.84 a3.6 3.6 0 0 0 2.48 4.39 3.4 3.4 0 0 0 2.62 -.34 3.5 3.5 0 0 0 1.66 -2.19 L11.5 19 h9 l.61 2.35 a3.6 3.6 0 0 0 1.66 2.19 3.5 3.5 0 0 0 2.63 .34 3.6 3.6 0 0 0 2.47 -4.39 l-2.33 -8.84 a3.6 3.6 0 0 0 -1.65 -2.19 3.5 3.5 0 0 0 -2.63 -.34 3.6 3.6 0 0 0 -2.37 2.22 L18.65 11 h-5.3 l-.24 -.66 a3.6 3.6 0 0 0 -2.38 -2.22 A4 4 0 0 0 9.83 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.51 26
          moveTo(x = 7.51f, y = 26.0f)
          // a 6 6 0 0 1 -1.44 -0.19
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.44f,
            dy1 = -0.19f,
          )
          // A 5.6 5.6 0 0 1 2.19 19
          arcTo(
            horizontalEllipseRadius = 5.6f,
            verticalEllipseRadius = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.19f,
            y1 = 19.0f,
          )
          // l 2.33 -8.84
          lineToRelative(dx = 2.33f, dy = -8.84f)
          // a 5.5 5.5 0 0 1 2.59 -3.43
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.59f,
            dy1 = -3.43f,
          )
          // a 5.4 5.4 0 0 1 4.15 -0.54
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.15f,
            dy1 = -0.54f,
          )
          // A 5.5 5.5 0 0 1 14.7 9
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.7f,
            y1 = 9.0f,
          )
          // h 2.6
          horizontalLineToRelative(dx = 2.6f)
          // a 5.5 5.5 0 0 1 3.44 -2.81
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.44f,
            dy1 = -2.81f,
          )
          // a 5.4 5.4 0 0 1 4.15 0.54
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.15f,
            dy1 = 0.54f,
          )
          // a 5.6 5.6 0 0 1 2.59 3.41
          arcToRelative(
            a = 5.6f,
            b = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.59f,
            dy1 = 3.41f,
          )
          // L 29.81 19
          lineTo(x = 29.81f, y = 19.0f)
          // a 5.6 5.6 0 0 1 -3.89 6.83
          arcToRelative(
            a = 5.6f,
            b = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.89f,
            dy1 = 6.83f,
          )
          // a 5.4 5.4 0 0 1 -4.15 -0.54
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.15f,
            dy1 = -0.54f,
          )
          // a 5.5 5.5 0 0 1 -2.59 -3.41
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.59f,
            dy1 = -3.41f,
          )
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // l -0.23 0.86
          lineToRelative(dx = -0.23f, dy = 0.86f)
          // a 5.5 5.5 0 0 1 -2.59 3.41
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.59f,
            dy1 = 3.41f,
          )
          // A 5.5 5.5 0 0 1 7.51 26
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.51f,
            y1 = 26.0f,
          )
          // M 9.83 8
          moveTo(x = 9.83f, y = 8.0f)
          // a 3.5 3.5 0 0 0 -1.72 0.46
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.72f,
            dy1 = 0.46f,
          )
          // a 3.6 3.6 0 0 0 -1.66 2.19
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.66f,
            dy1 = 2.19f,
          )
          // l -2.33 8.84
          lineToRelative(dx = -2.33f, dy = 8.84f)
          // a 3.6 3.6 0 0 0 2.48 4.39
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.48f,
            dy1 = 4.39f,
          )
          // a 3.4 3.4 0 0 0 2.62 -0.34
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.62f,
            dy1 = -0.34f,
          )
          // a 3.5 3.5 0 0 0 1.66 -2.19
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.66f,
            dy1 = -2.19f,
          )
          // L 11.5 19
          lineTo(x = 11.5f, y = 19.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // l 0.61 2.35
          lineToRelative(dx = 0.61f, dy = 2.35f)
          // a 3.6 3.6 0 0 0 1.66 2.19
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.66f,
            dy1 = 2.19f,
          )
          // a 3.5 3.5 0 0 0 2.63 0.34
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.63f,
            dy1 = 0.34f,
          )
          // a 3.6 3.6 0 0 0 2.47 -4.39
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.47f,
            dy1 = -4.39f,
          )
          // l -2.33 -8.84
          lineToRelative(dx = -2.33f, dy = -8.84f)
          // a 3.6 3.6 0 0 0 -1.65 -2.19
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.65f,
            dy1 = -2.19f,
          )
          // a 3.5 3.5 0 0 0 -2.63 -0.34
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.63f,
            dy1 = -0.34f,
          )
          // a 3.6 3.6 0 0 0 -2.37 2.22
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.37f,
            dy1 = 2.22f,
          )
          // L 18.65 11
          lineTo(x = 18.65f, y = 11.0f)
          // h -5.3
          horizontalLineToRelative(dx = -5.3f)
          // l -0.24 -0.66
          lineToRelative(dx = -0.24f, dy = -0.66f)
          // a 3.6 3.6 0 0 0 -2.38 -2.22
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.38f,
            dy1 = -2.22f,
          )
          // A 4 4 0 0 0 9.83 8
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.83f,
            y1 = 8.0f,
          )
        }
        // M10 16 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m0 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
        }
        // <circle cx="22.0" cy="12.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 12
          moveTo(x = 22.0f, y = 12.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="22.0" cy="16.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 16
          moveTo(x = 22.0f, y = 16.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="20.0" cy="14.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 14
          moveTo(x = 20.0f, y = 14.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="24.0" cy="14.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
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
      .also { _gameConsole = it }
  }

@Suppress("ObjectPropertyName")
private var _gameConsole: ImageVector? = null
