// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArithmeticMedian: ImageVector
  get() {
    val current = _arithmeticMedian
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArithmeticMedian",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 9.0 22.0 9.0 16.0 17.5713 10.0 9.0 8.0 9.0 15.0 19.0 8.0 29.0 10.0 29.0 16.0 20.4287 22.0 29.0 24.0 29.0 17.0 19.0 24.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 9
          moveTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 16 17.5713
          lineTo(x = 16.0f, y = 17.5713f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 8 9
          lineTo(x = 8.0f, y = 9.0f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 8 29
          lineTo(x = 8.0f, y = 29.0f)
          // L 10 29
          lineTo(x = 10.0f, y = 29.0f)
          // L 16 20.4287
          lineTo(x = 16.0f, y = 20.4287f)
          // L 22 29
          lineTo(x = 22.0f, y = 29.0f)
          // L 24 29
          lineTo(x = 24.0f, y = 29.0f)
          // L 17 19
          lineTo(x = 17.0f, y = 19.0f)
          // L 24 9z
          lineTo(x = 24.0f, y = 9.0f)
          close()
        }
        // M20 7 c-1.78 0 -3.23 -.87 -4.51 -1.64 C14.32 4.66 13.22 4 12 4 c-1.4 0 -2.45 .86 -3.3 1.7 L7.3 4.3 C8.35 3.22 9.85 2 12 2 c1.78 0 3.23 .87 4.51 1.64 C17.68 4.34 18.78 5 20 5 c1.4 0 2.45 -.86 3.3 -1.7 l1.4 1.4 C23.65 5.78 22.15 7 20 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 7
          moveTo(x = 20.0f, y = 7.0f)
          // c -1.78 0 -3.23 -0.87 -4.51 -1.64
          curveToRelative(
            dx1 = -1.78f,
            dy1 = 0.0f,
            dx2 = -3.23f,
            dy2 = -0.87f,
            dx3 = -4.51f,
            dy3 = -1.64f,
          )
          // C 14.32 4.66 13.22 4 12 4
          curveTo(
            x1 = 14.32f,
            y1 = 4.66f,
            x2 = 13.22f,
            y2 = 4.0f,
            x3 = 12.0f,
            y3 = 4.0f,
          )
          // c -1.4 0 -2.45 0.86 -3.3 1.7
          curveToRelative(
            dx1 = -1.4f,
            dy1 = 0.0f,
            dx2 = -2.45f,
            dy2 = 0.86f,
            dx3 = -3.3f,
            dy3 = 1.7f,
          )
          // L 7.3 4.3
          lineTo(x = 7.3f, y = 4.3f)
          // C 8.35 3.22 9.85 2 12 2
          curveTo(
            x1 = 8.35f,
            y1 = 3.22f,
            x2 = 9.85f,
            y2 = 2.0f,
            x3 = 12.0f,
            y3 = 2.0f,
          )
          // c 1.78 0 3.23 0.87 4.51 1.64
          curveToRelative(
            dx1 = 1.78f,
            dy1 = 0.0f,
            dx2 = 3.23f,
            dy2 = 0.87f,
            dx3 = 4.51f,
            dy3 = 1.64f,
          )
          // C 17.68 4.34 18.78 5 20 5
          curveTo(
            x1 = 17.68f,
            y1 = 4.34f,
            x2 = 18.78f,
            y2 = 5.0f,
            x3 = 20.0f,
            y3 = 5.0f,
          )
          // c 1.4 0 2.45 -0.86 3.3 -1.7
          curveToRelative(
            dx1 = 1.4f,
            dy1 = 0.0f,
            dx2 = 2.45f,
            dy2 = -0.86f,
            dx3 = 3.3f,
            dy3 = -1.7f,
          )
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // C 23.65 5.78 22.15 7 20 7
          curveTo(
            x1 = 23.65f,
            y1 = 5.78f,
            x2 = 22.15f,
            y2 = 7.0f,
            x3 = 20.0f,
            y3 = 7.0f,
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
      .also { _arithmeticMedian = it }
  }

@Suppress("ObjectPropertyName")
private var _arithmeticMedian: ImageVector? = null
