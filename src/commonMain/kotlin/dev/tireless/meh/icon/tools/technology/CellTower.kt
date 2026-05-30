// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CellTower: ImageVector
  get() {
    val current = _cellTower
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CellTower",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 11.0 25.0 16.0 17.0 16.0 17.0 11.0 15.0 11.0 15.0 16.0 7.0 16.0 7.0 11.0 5.0 11.0 5.0 23.0 7.0 23.0 7.0 18.0 10.0 18.0 10.0 30.0 12.0 30.0 12.0 18.0 15.0 18.0 15.0 23.0 17.0 23.0 17.0 18.0 20.0 18.0 20.0 30.0 22.0 30.0 22.0 18.0 25.0 18.0 25.0 23.0 27.0 23.0 27.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // L 25 16
          lineTo(x = 25.0f, y = 16.0f)
          // L 17 16
          lineTo(x = 17.0f, y = 16.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 16
          lineTo(x = 15.0f, y = 16.0f)
          // L 7 16
          lineTo(x = 7.0f, y = 16.0f)
          // L 7 11
          lineTo(x = 7.0f, y = 11.0f)
          // L 5 11
          lineTo(x = 5.0f, y = 11.0f)
          // L 5 23
          lineTo(x = 5.0f, y = 23.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 7 18
          lineTo(x = 7.0f, y = 18.0f)
          // L 10 18
          lineTo(x = 10.0f, y = 18.0f)
          // L 10 30
          lineTo(x = 10.0f, y = 30.0f)
          // L 12 30
          lineTo(x = 12.0f, y = 30.0f)
          // L 12 18
          lineTo(x = 12.0f, y = 18.0f)
          // L 15 18
          lineTo(x = 15.0f, y = 18.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 17 18
          lineTo(x = 17.0f, y = 18.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 20 30
          lineTo(x = 20.0f, y = 30.0f)
          // L 22 30
          lineTo(x = 22.0f, y = 30.0f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // L 25 18
          lineTo(x = 25.0f, y = 18.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 27 23
          lineTo(x = 27.0f, y = 23.0f)
          // L 27 11z
          lineTo(x = 27.0f, y = 11.0f)
          close()
        }
        // M16 6 c-1.7 0 -3.2 .7 -4.2 1.8 l1.4 1.4 C13.9 8.4 14.9 8 16 8 s2.1 .4 2.8 1.2 l1.4 -1.4 C19.2 6.7 17.7 6 16 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 6
          moveTo(x = 16.0f, y = 6.0f)
          // c -1.7 0 -3.2 0.7 -4.2 1.8
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.2f,
            dy2 = 0.7f,
            dx3 = -4.2f,
            dy3 = 1.8f,
          )
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // C 13.9 8.4 14.9 8 16 8
          curveTo(
            x1 = 13.9f,
            y1 = 8.4f,
            x2 = 14.9f,
            y2 = 8.0f,
            x3 = 16.0f,
            y3 = 8.0f,
          )
          // s 2.1 0.4 2.8 1.2
          reflectiveCurveToRelative(
            dx1 = 2.1f,
            dy1 = 0.4f,
            dx2 = 2.8f,
            dy2 = 1.2f,
          )
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // C 19.2 6.7 17.7 6 16 6
          curveTo(
            x1 = 19.2f,
            y1 = 6.7f,
            x2 = 17.7f,
            y2 = 6.0f,
            x3 = 16.0f,
            y3 = 6.0f,
          )
        }
        // m8.9 4.9 1.4 1.4 C11.8 4.9 13.8 4 16 4 s4.2 .9 5.7 2.3 l1.4 -1.4 C21.3 3.1 18.8 2 16 2 s-5.3 1.1 -7.1 2.9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.9 4.9
          moveTo(x = 8.9f, y = 4.9f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // C 11.8 4.9 13.8 4 16 4
          curveTo(
            x1 = 11.8f,
            y1 = 4.9f,
            x2 = 13.8f,
            y2 = 4.0f,
            x3 = 16.0f,
            y3 = 4.0f,
          )
          // s 4.2 0.9 5.7 2.3
          reflectiveCurveToRelative(
            dx1 = 4.2f,
            dy1 = 0.9f,
            dx2 = 5.7f,
            dy2 = 2.3f,
          )
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // C 21.3 3.1 18.8 2 16 2
          curveTo(
            x1 = 21.3f,
            y1 = 3.1f,
            x2 = 18.8f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s -5.3 1.1 -7.1 2.9
          reflectiveCurveToRelative(
            dx1 = -5.3f,
            dy1 = 1.1f,
            dx2 = -7.1f,
            dy2 = 2.9f,
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
      .also { _cellTower = it }
  }

@Suppress("ObjectPropertyName")
private var _cellTower: ImageVector? = null
