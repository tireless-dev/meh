// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Campsite: ImageVector
  get() {
    val current = _campsite
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Campsite",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.56 26 17.17 8.93 l2.37 -3.89 L17.83 4 16 7 l-1.83 -3 -1.7 1.04 2.36 3.89 L4.43 26 H2 v2 h28 v-2Z M16 10.85 25.22 26 H17 v-8 h-2 v8 H6.78Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.56 26
          moveTo(x = 27.56f, y = 26.0f)
          // L 17.17 8.93
          lineTo(x = 17.17f, y = 8.93f)
          // l 2.37 -3.89
          lineToRelative(dx = 2.37f, dy = -3.89f)
          // L 17.83 4
          lineTo(x = 17.83f, y = 4.0f)
          // L 16 7
          lineTo(x = 16.0f, y = 7.0f)
          // l -1.83 -3
          lineToRelative(dx = -1.83f, dy = -3.0f)
          // l -1.7 1.04
          lineToRelative(dx = -1.7f, dy = 1.04f)
          // l 2.36 3.89
          lineToRelative(dx = 2.36f, dy = 3.89f)
          // L 4.43 26
          lineTo(x = 4.43f, y = 26.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 16 10.85
          moveTo(x = 16.0f, y = 10.85f)
          // L 25.22 26
          lineTo(x = 25.22f, y = 26.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 6.78z
          horizontalLineTo(x = 6.78f)
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
      .also { _campsite = it }
  }

@Suppress("ObjectPropertyName")
private var _campsite: ImageVector? = null
