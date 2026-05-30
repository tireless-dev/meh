// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolKit: ImageVector
  get() {
    val current = _toolKit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ToolKit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m8.91 24.5 4.26 -4.26 -1.41 -1.41 -4.26 4.26 -.8 -.8 a1 1 0 0 0 -1.4 0 l-4 4 a1 1 0 0 0 0 1.42 l3 3 a1 1 0 0 0 1.4 0 l4 -4 a1 1 0 0 0 0 -1.42Z M5 28.59 3.41 27 6 24.41 7.59 26Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.91 24.5
          moveTo(x = 8.91f, y = 24.5f)
          // l 4.26 -4.26
          lineToRelative(dx = 4.26f, dy = -4.26f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // l -4.26 4.26
          lineToRelative(dx = -4.26f, dy = 4.26f)
          // l -0.8 -0.8
          lineToRelative(dx = -0.8f, dy = -0.8f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // a 1 1 0 0 0 0 -1.42z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          close()
          // M 5 28.59
          moveTo(x = 5.0f, y = 28.59f)
          // L 3.41 27
          lineTo(x = 3.41f, y = 27.0f)
          // L 6 24.41
          lineTo(x = 6.0f, y = 24.41f)
          // L 7.59 26z
          lineTo(x = 7.59f, y = 26.0f)
          close()
        }
        // M24 30 a6 6 0 0 1 -6 -6 6 6 0 0 1 .21 -1.55 L9.55 13.8 A6 6 0 0 1 8 14 a5.98 5.98 0 0 1 -5.58 -8.18 l.56 -1.43 L6.3 7.71 a1 1 0 0 0 1.42 0 1 1 0 0 0 0 -1.42 L4.39 2.98 l1.43 -.56 A5.98 5.98 0 0 1 14 8 a6 6 0 0 1 -.21 1.55 l8.66 8.66 A6 6 0 0 1 24 18 a5.98 5.98 0 0 1 5.58 8.18 l-.56 1.43 -3.31 -3.32 a1 1 0 0 0 -1.42 0 1 1 0 0 0 0 1.42 l3.32 3.31 -1.43 .56 A6 6 0 0 1 24 30 M10.06 11.48 l10.46 10.46 -.24 .6 A3.98 3.98 0 0 0 23.75 28 l-.87 -.87 a3 3 0 0 1 0 -4.24 3.07 3.07 0 0 1 4.24 0 L28 23.75 a3.98 3.98 0 0 0 -5.44 -3.47 l-.61 .24 -10.46 -10.46 .24 -.6 A3.98 3.98 0 0 0 8.25 4 l.87 .87 a3 3 0 0 1 0 4.24 3.07 3.07 0 0 1 -4.24 0 L4 8.25 a3.98 3.98 0 0 0 5.44 3.47Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 30
          moveTo(x = 24.0f, y = 30.0f)
          // a 6 6 0 0 1 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 0.21 -1.55
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.21f,
            dy1 = -1.55f,
          )
          // L 9.55 13.8
          lineTo(x = 9.55f, y = 13.8f)
          // A 6 6 0 0 1 8 14
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 14.0f,
          )
          // a 5.98 5.98 0 0 1 -5.58 -8.18
          arcToRelative(
            a = 5.98f,
            b = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.58f,
            dy1 = -8.18f,
          )
          // l 0.56 -1.43
          lineToRelative(dx = 0.56f, dy = -1.43f)
          // L 6.3 7.71
          lineTo(x = 6.3f, y = 7.71f)
          // a 1 1 0 0 0 1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // L 4.39 2.98
          lineTo(x = 4.39f, y = 2.98f)
          // l 1.43 -0.56
          lineToRelative(dx = 1.43f, dy = -0.56f)
          // A 5.98 5.98 0 0 1 14 8
          arcTo(
            horizontalEllipseRadius = 5.98f,
            verticalEllipseRadius = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 8.0f,
          )
          // a 6 6 0 0 1 -0.21 1.55
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.21f,
            dy1 = 1.55f,
          )
          // l 8.66 8.66
          lineToRelative(dx = 8.66f, dy = 8.66f)
          // A 6 6 0 0 1 24 18
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 18.0f,
          )
          // a 5.98 5.98 0 0 1 5.58 8.18
          arcToRelative(
            a = 5.98f,
            b = 5.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.58f,
            dy1 = 8.18f,
          )
          // l -0.56 1.43
          lineToRelative(dx = -0.56f, dy = 1.43f)
          // l -3.31 -3.32
          lineToRelative(dx = -3.31f, dy = -3.32f)
          // a 1 1 0 0 0 -1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l 3.32 3.31
          lineToRelative(dx = 3.32f, dy = 3.31f)
          // l -1.43 0.56
          lineToRelative(dx = -1.43f, dy = 0.56f)
          // A 6 6 0 0 1 24 30
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 30.0f,
          )
          // M 10.06 11.48
          moveTo(x = 10.06f, y = 11.48f)
          // l 10.46 10.46
          lineToRelative(dx = 10.46f, dy = 10.46f)
          // l -0.24 0.6
          lineToRelative(dx = -0.24f, dy = 0.6f)
          // A 3.98 3.98 0 0 0 23.75 28
          arcTo(
            horizontalEllipseRadius = 3.98f,
            verticalEllipseRadius = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.75f,
            y1 = 28.0f,
          )
          // l -0.87 -0.87
          lineToRelative(dx = -0.87f, dy = -0.87f)
          // a 3 3 0 0 1 0 -4.24
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.24f,
          )
          // a 3.07 3.07 0 0 1 4.24 0
          arcToRelative(
            a = 3.07f,
            b = 3.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.24f,
            dy1 = 0.0f,
          )
          // L 28 23.75
          lineTo(x = 28.0f, y = 23.75f)
          // a 3.98 3.98 0 0 0 -5.44 -3.47
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.44f,
            dy1 = -3.47f,
          )
          // l -0.61 0.24
          lineToRelative(dx = -0.61f, dy = 0.24f)
          // l -10.46 -10.46
          lineToRelative(dx = -10.46f, dy = -10.46f)
          // l 0.24 -0.6
          lineToRelative(dx = 0.24f, dy = -0.6f)
          // A 3.98 3.98 0 0 0 8.25 4
          arcTo(
            horizontalEllipseRadius = 3.98f,
            verticalEllipseRadius = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.25f,
            y1 = 4.0f,
          )
          // l 0.87 0.87
          lineToRelative(dx = 0.87f, dy = 0.87f)
          // a 3 3 0 0 1 0 4.24
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.24f,
          )
          // a 3.07 3.07 0 0 1 -4.24 0
          arcToRelative(
            a = 3.07f,
            b = 3.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.24f,
            dy1 = 0.0f,
          )
          // L 4 8.25
          lineTo(x = 4.0f, y = 8.25f)
          // a 3.98 3.98 0 0 0 5.44 3.47z
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.44f,
            dy1 = 3.47f,
          )
          close()
        }
        // M29.12 2.85 a3.07 3.07 0 0 0 -4.24 0 l-7.48 7.48 1.41 1.41 7.48 -7.48 a1 1 0 0 1 1.42 0 1 1 0 0 1 0 1.42 l-7.48 7.48 1.41 1.41 7.48 -7.48 a3 3 0 0 0 0 -4.24
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.12 2.85
          moveTo(x = 29.12f, y = 2.85f)
          // a 3.07 3.07 0 0 0 -4.24 0
          arcToRelative(
            a = 3.07f,
            b = 3.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.24f,
            dy1 = 0.0f,
          )
          // l -7.48 7.48
          lineToRelative(dx = -7.48f, dy = 7.48f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 7.48 -7.48
          lineToRelative(dx = 7.48f, dy = -7.48f)
          // a 1 1 0 0 1 1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.42f,
            dy1 = 0.0f,
          )
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
          // l -7.48 7.48
          lineToRelative(dx = -7.48f, dy = 7.48f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 7.48 -7.48
          lineToRelative(dx = 7.48f, dy = -7.48f)
          // a 3 3 0 0 0 0 -4.24
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.24f,
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
      .also { _toolKit = it }
  }

@Suppress("ObjectPropertyName")
private var _toolKit: ImageVector? = null
