// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextKerning: ImageVector
  get() {
    val current = _textKerning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextKerning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 24.0 18.83 24.0 21.12 21.71 19.71 20.29 15.0 25.0 19.71 29.71 21.12 28.29 18.83 26.0 30.0 26.0 30.0 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 24
          moveTo(x = 30.0f, y = 24.0f)
          // L 18.83 24
          lineTo(x = 18.83f, y = 24.0f)
          // L 21.12 21.71
          lineTo(x = 21.12f, y = 21.71f)
          // L 19.71 20.29
          lineTo(x = 19.71f, y = 20.29f)
          // L 15 25
          lineTo(x = 15.0f, y = 25.0f)
          // L 19.71 29.71
          lineTo(x = 19.71f, y = 29.71f)
          // L 21.12 28.29
          lineTo(x = 21.12f, y = 28.29f)
          // L 18.83 26
          lineTo(x = 18.83f, y = 26.0f)
          // L 30 26
          lineTo(x = 30.0f, y = 26.0f)
          // L 30 24z
          lineTo(x = 30.0f, y = 24.0f)
          close()
        }
        // <polygon points="14.0 21.0 20.0 4.0 18.0 4.0 12.0 21.0 14.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 21
          moveTo(x = 14.0f, y = 21.0f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 18 4
          lineTo(x = 18.0f, y = 4.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 14 21z
          lineTo(x = 14.0f, y = 21.0f)
          close()
        }
        // <polygon points="13.0 4.0 9.0 16.0 5.0 4.0 3.0 4.0 8.0 18.0 10.0 18.0 15.0 4.0 13.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 4
          moveTo(x = 13.0f, y = 4.0f)
          // L 9 16
          lineTo(x = 9.0f, y = 16.0f)
          // L 5 4
          lineTo(x = 5.0f, y = 4.0f)
          // L 3 4
          lineTo(x = 3.0f, y = 4.0f)
          // L 8 18
          lineTo(x = 8.0f, y = 18.0f)
          // L 10 18
          lineTo(x = 10.0f, y = 18.0f)
          // L 15 4
          lineTo(x = 15.0f, y = 4.0f)
          // L 13 4z
          lineTo(x = 13.0f, y = 4.0f)
          close()
        }
        // M28 18 h2 L25 4 h-2 l-5 14 h2 l1 -3 h6Z m-6.33 -5 L24 6 l2.33 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 18
          moveTo(x = 28.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 25 4
          lineTo(x = 25.0f, y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l -5 14
          lineToRelative(dx = -5.0f, dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1 -3
          lineToRelative(dx = 1.0f, dy = -3.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -6.33 -5
          moveToRelative(dx = -6.33f, dy = -5.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // l 2.33 7z
          lineToRelative(dx = 2.33f, dy = 7.0f)
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
      .also { _textKerning = it }
  }

@Suppress("ObjectPropertyName")
private var _textKerning: ImageVector? = null
