// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UvIndex: ImageVector
  get() {
    val current = _uvIndex
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UvIndex",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 5.91 1.74 2.93 .79 1.32 L20 9.75 l3.12 -.87 L22.25 12 l-.41 1.47 1.32 .79 L26.09 16 l-2.93 1.74 -1.32 .79 .41 1.47 .87 3.12 L20 22.25 l-1.47 -.41 -.79 1.32 L16 26.09 l-1.74 -2.93 -.79 -1.32 L12 22.25 l-3.12 .87 L9.75 20 l.41 -1.47 -1.32 -.79 L5.91 16 l2.93 -1.74 1.32 -.79 L9.75 12 8.88 8.88 12 9.75 l1.47 .41 .79 -1.32z M16 2 l-3.46 5.82 L6 6 l1.82 6.54 L2 16 l5.82 3.46 L6 26 l6.54 -1.82 L16 30 l3.46 -5.82 L26 26 l-1.82 -6.54 L30 16 l-5.82 -3.46 L26 6 l-6.54 1.82z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 5.91
          moveTo(x = 16.0f, y = 5.91f)
          // l 1.74 2.93
          lineToRelative(dx = 1.74f, dy = 2.93f)
          // l 0.79 1.32
          lineToRelative(dx = 0.79f, dy = 1.32f)
          // L 20 9.75
          lineTo(x = 20.0f, y = 9.75f)
          // l 3.12 -0.87
          lineToRelative(dx = 3.12f, dy = -0.87f)
          // L 22.25 12
          lineTo(x = 22.25f, y = 12.0f)
          // l -0.41 1.47
          lineToRelative(dx = -0.41f, dy = 1.47f)
          // l 1.32 0.79
          lineToRelative(dx = 1.32f, dy = 0.79f)
          // L 26.09 16
          lineTo(x = 26.09f, y = 16.0f)
          // l -2.93 1.74
          lineToRelative(dx = -2.93f, dy = 1.74f)
          // l -1.32 0.79
          lineToRelative(dx = -1.32f, dy = 0.79f)
          // l 0.41 1.47
          lineToRelative(dx = 0.41f, dy = 1.47f)
          // l 0.87 3.12
          lineToRelative(dx = 0.87f, dy = 3.12f)
          // L 20 22.25
          lineTo(x = 20.0f, y = 22.25f)
          // l -1.47 -0.41
          lineToRelative(dx = -1.47f, dy = -0.41f)
          // l -0.79 1.32
          lineToRelative(dx = -0.79f, dy = 1.32f)
          // L 16 26.09
          lineTo(x = 16.0f, y = 26.09f)
          // l -1.74 -2.93
          lineToRelative(dx = -1.74f, dy = -2.93f)
          // l -0.79 -1.32
          lineToRelative(dx = -0.79f, dy = -1.32f)
          // L 12 22.25
          lineTo(x = 12.0f, y = 22.25f)
          // l -3.12 0.87
          lineToRelative(dx = -3.12f, dy = 0.87f)
          // L 9.75 20
          lineTo(x = 9.75f, y = 20.0f)
          // l 0.41 -1.47
          lineToRelative(dx = 0.41f, dy = -1.47f)
          // l -1.32 -0.79
          lineToRelative(dx = -1.32f, dy = -0.79f)
          // L 5.91 16
          lineTo(x = 5.91f, y = 16.0f)
          // l 2.93 -1.74
          lineToRelative(dx = 2.93f, dy = -1.74f)
          // l 1.32 -0.79
          lineToRelative(dx = 1.32f, dy = -0.79f)
          // L 9.75 12
          lineTo(x = 9.75f, y = 12.0f)
          // L 8.88 8.88
          lineTo(x = 8.88f, y = 8.88f)
          // L 12 9.75
          lineTo(x = 12.0f, y = 9.75f)
          // l 1.47 0.41
          lineToRelative(dx = 1.47f, dy = 0.41f)
          // l 0.79 -1.32z
          lineToRelative(dx = 0.79f, dy = -1.32f)
          close()
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // l -3.46 5.82
          lineToRelative(dx = -3.46f, dy = 5.82f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // l 1.82 6.54
          lineToRelative(dx = 1.82f, dy = 6.54f)
          // L 2 16
          lineTo(x = 2.0f, y = 16.0f)
          // l 5.82 3.46
          lineToRelative(dx = 5.82f, dy = 3.46f)
          // L 6 26
          lineTo(x = 6.0f, y = 26.0f)
          // l 6.54 -1.82
          lineToRelative(dx = 6.54f, dy = -1.82f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // l 3.46 -5.82
          lineToRelative(dx = 3.46f, dy = -5.82f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // l -1.82 -6.54
          lineToRelative(dx = -1.82f, dy = -6.54f)
          // L 30 16
          lineTo(x = 30.0f, y = 16.0f)
          // l -5.82 -3.46
          lineToRelative(dx = -5.82f, dy = -3.46f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // l -6.54 1.82z
          lineToRelative(dx = -6.54f, dy = 1.82f)
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
      .also { _uvIndex = it }
  }

@Suppress("ObjectPropertyName")
private var _uvIndex: ImageVector? = null
