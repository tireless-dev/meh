// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UvIndexFilled: ImageVector
  get() {
    val current = _uvIndexFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UvIndexFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 30 -3.46 -5.82 L6 26 l1.82 -6.54 L2 16 l5.82 -3.46 L6 6 l6.54 1.82 L16 2 l3.46 5.82 L26 6 l-1.82 6.54 L30 16 l-5.82 3.46 L26 26 l-6.54 -1.82Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // l -3.46 -5.82
          lineToRelative(dx = -3.46f, dy = -5.82f)
          // L 6 26
          lineTo(x = 6.0f, y = 26.0f)
          // l 1.82 -6.54
          lineToRelative(dx = 1.82f, dy = -6.54f)
          // L 2 16
          lineTo(x = 2.0f, y = 16.0f)
          // l 5.82 -3.46
          lineToRelative(dx = 5.82f, dy = -3.46f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // l 6.54 1.82
          lineToRelative(dx = 6.54f, dy = 1.82f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // l 3.46 5.82
          lineToRelative(dx = 3.46f, dy = 5.82f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // l -1.82 6.54
          lineToRelative(dx = -1.82f, dy = 6.54f)
          // L 30 16
          lineTo(x = 30.0f, y = 16.0f)
          // l -5.82 3.46
          lineToRelative(dx = -5.82f, dy = 3.46f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // l -6.54 -1.82z
          lineToRelative(dx = -6.54f, dy = -1.82f)
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
      .also { _uvIndexFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _uvIndexFilled: ImageVector? = null
