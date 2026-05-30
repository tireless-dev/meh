// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Star: ImageVector
  get() {
    val current = _star
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Star",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 6.52 2.76 5.58 .46 1 1 .15 6.16 .89 -4.38 4.3 -.75 .73 .18 1 1.05 6.13 -5.51 -2.89 L16 23 l-.93 .49 -5.51 2.85 1 -6.13 .18 -1 L10 18.44 l-4.42 -4.35 6.16 -.89 1 -.15 .46 -1z M16 2 l-4.55 9.22 -10.17 1.47 7.36 7.18 L6.9 30 l9.1 -4.78 L25.1 30 l-1.74 -10.13 7.36 -7.17 -10.17 -1.48Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 6.52
          moveTo(x = 16.0f, y = 6.52f)
          // l 2.76 5.58
          lineToRelative(dx = 2.76f, dy = 5.58f)
          // l 0.46 1
          lineToRelative(dx = 0.46f, dy = 1.0f)
          // l 1 0.15
          lineToRelative(dx = 1.0f, dy = 0.15f)
          // l 6.16 0.89
          lineToRelative(dx = 6.16f, dy = 0.89f)
          // l -4.38 4.3
          lineToRelative(dx = -4.38f, dy = 4.3f)
          // l -0.75 0.73
          lineToRelative(dx = -0.75f, dy = 0.73f)
          // l 0.18 1
          lineToRelative(dx = 0.18f, dy = 1.0f)
          // l 1.05 6.13
          lineToRelative(dx = 1.05f, dy = 6.13f)
          // l -5.51 -2.89
          lineToRelative(dx = -5.51f, dy = -2.89f)
          // L 16 23
          lineTo(x = 16.0f, y = 23.0f)
          // l -0.93 0.49
          lineToRelative(dx = -0.93f, dy = 0.49f)
          // l -5.51 2.85
          lineToRelative(dx = -5.51f, dy = 2.85f)
          // l 1 -6.13
          lineToRelative(dx = 1.0f, dy = -6.13f)
          // l 0.18 -1
          lineToRelative(dx = 0.18f, dy = -1.0f)
          // L 10 18.44
          lineTo(x = 10.0f, y = 18.44f)
          // l -4.42 -4.35
          lineToRelative(dx = -4.42f, dy = -4.35f)
          // l 6.16 -0.89
          lineToRelative(dx = 6.16f, dy = -0.89f)
          // l 1 -0.15
          lineToRelative(dx = 1.0f, dy = -0.15f)
          // l 0.46 -1z
          lineToRelative(dx = 0.46f, dy = -1.0f)
          close()
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // l -4.55 9.22
          lineToRelative(dx = -4.55f, dy = 9.22f)
          // l -10.17 1.47
          lineToRelative(dx = -10.17f, dy = 1.47f)
          // l 7.36 7.18
          lineToRelative(dx = 7.36f, dy = 7.18f)
          // L 6.9 30
          lineTo(x = 6.9f, y = 30.0f)
          // l 9.1 -4.78
          lineToRelative(dx = 9.1f, dy = -4.78f)
          // L 25.1 30
          lineTo(x = 25.1f, y = 30.0f)
          // l -1.74 -10.13
          lineToRelative(dx = -1.74f, dy = -10.13f)
          // l 7.36 -7.17
          lineToRelative(dx = 7.36f, dy = -7.17f)
          // l -10.17 -1.48z
          lineToRelative(dx = -10.17f, dy = -1.48f)
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
      .also { _star = it }
  }

@Suppress("ObjectPropertyName")
private var _star: ImageVector? = null
