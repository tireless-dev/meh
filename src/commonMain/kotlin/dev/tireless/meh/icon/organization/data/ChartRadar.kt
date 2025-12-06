// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRadar: ImageVector
  get() {
    val current = _chartRadar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartRadar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 2 13 l6 17 h16 l6 -17Z m2.58 19.27 L12.6 22.6 l-1.43 -7.83 4.91 -4.2 5.44 4.07Z m.2 2 L21.33 28 H10.67 l1.8 -3.33Z m-9.19 -9.78 -3.85 -.88 L15 5.33 v3.53Z M17 8.75 V5.33 l9.26 7.28 -3.15 .72Z M4.61 14.4 l4.66 1.07 1.48 8.17 -1.74 3.22Z M23 26.86 l-2.58 -4.78 3 -6.77 3.98 -.91Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // L 2 13
          lineTo(x = 2.0f, y = 13.0f)
          // l 6 17
          lineToRelative(dx = 6.0f, dy = 17.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // l 6 -17z
          lineToRelative(dx = 6.0f, dy = -17.0f)
          close()
          // m 2.58 19.27
          moveToRelative(dx = 2.58f, dy = 19.27f)
          // L 12.6 22.6
          lineTo(x = 12.6f, y = 22.6f)
          // l -1.43 -7.83
          lineToRelative(dx = -1.43f, dy = -7.83f)
          // l 4.91 -4.2
          lineToRelative(dx = 4.91f, dy = -4.2f)
          // l 5.44 4.07z
          lineToRelative(dx = 5.44f, dy = 4.07f)
          close()
          // m 0.2 2
          moveToRelative(dx = 0.2f, dy = 2.0f)
          // L 21.33 28
          lineTo(x = 21.33f, y = 28.0f)
          // H 10.67
          horizontalLineTo(x = 10.67f)
          // l 1.8 -3.33z
          lineToRelative(dx = 1.8f, dy = -3.33f)
          close()
          // m -9.19 -9.78
          moveToRelative(dx = -9.19f, dy = -9.78f)
          // l -3.85 -0.88
          lineToRelative(dx = -3.85f, dy = -0.88f)
          // L 15 5.33
          lineTo(x = 15.0f, y = 5.33f)
          // v 3.53z
          verticalLineToRelative(dy = 3.53f)
          close()
          // M 17 8.75
          moveTo(x = 17.0f, y = 8.75f)
          // V 5.33
          verticalLineTo(y = 5.33f)
          // l 9.26 7.28
          lineToRelative(dx = 9.26f, dy = 7.28f)
          // l -3.15 0.72z
          lineToRelative(dx = -3.15f, dy = 0.72f)
          close()
          // M 4.61 14.4
          moveTo(x = 4.61f, y = 14.4f)
          // l 4.66 1.07
          lineToRelative(dx = 4.66f, dy = 1.07f)
          // l 1.48 8.17
          lineToRelative(dx = 1.48f, dy = 8.17f)
          // l -1.74 3.22z
          lineToRelative(dx = -1.74f, dy = 3.22f)
          close()
          // M 23 26.86
          moveTo(x = 23.0f, y = 26.86f)
          // l -2.58 -4.78
          lineToRelative(dx = -2.58f, dy = -4.78f)
          // l 3 -6.77
          lineToRelative(dx = 3.0f, dy = -6.77f)
          // l 3.98 -0.91z
          lineToRelative(dx = 3.98f, dy = -0.91f)
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
      .also { _chartRadar = it }
  }

@Suppress("ObjectPropertyName")
private var _chartRadar: ImageVector? = null
