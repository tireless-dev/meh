// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextLeading: ImageVector
  get() {
    val current = _textLeading
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextLeading",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="16" height="2" x="14.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 13
          moveTo(x = 14.0f, y = 13.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
        // <rect width="15" height="2" x="15.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 28
          moveTo(x = 15.0f, y = 28.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -15z
          horizontalLineToRelative(dx = -15.0f)
          close()
        }
        // M25.85 27 H28 l-4.36 -10 h-2.28 L17 27 h2.15 l.8 -2 h5.1Z m-5.1 -4 1.75 -4.37 L24.25 23Z m5.1 -11 H28 L23.64 2 h-2.28 L17 12 h2.15 l.8 -2 h5.1Z m-5.1 -4 1.75 -4.37 L24.25 8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.85 27
          moveTo(x = 25.85f, y = 27.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // l -4.36 -10
          lineToRelative(dx = -4.36f, dy = -10.0f)
          // h -2.28
          horizontalLineToRelative(dx = -2.28f)
          // L 17 27
          lineTo(x = 17.0f, y = 27.0f)
          // h 2.15
          horizontalLineToRelative(dx = 2.15f)
          // l 0.8 -2
          lineToRelative(dx = 0.8f, dy = -2.0f)
          // h 5.1z
          horizontalLineToRelative(dx = 5.1f)
          close()
          // m -5.1 -4
          moveToRelative(dx = -5.1f, dy = -4.0f)
          // l 1.75 -4.37
          lineToRelative(dx = 1.75f, dy = -4.37f)
          // L 24.25 23z
          lineTo(x = 24.25f, y = 23.0f)
          close()
          // m 5.1 -11
          moveToRelative(dx = 5.1f, dy = -11.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // L 23.64 2
          lineTo(x = 23.64f, y = 2.0f)
          // h -2.28
          horizontalLineToRelative(dx = -2.28f)
          // L 17 12
          lineTo(x = 17.0f, y = 12.0f)
          // h 2.15
          horizontalLineToRelative(dx = 2.15f)
          // l 0.8 -2
          lineToRelative(dx = 0.8f, dy = -2.0f)
          // h 5.1z
          horizontalLineToRelative(dx = 5.1f)
          close()
          // m -5.1 -4
          moveToRelative(dx = -5.1f, dy = -4.0f)
          // l 1.75 -4.37
          lineToRelative(dx = 1.75f, dy = -4.37f)
          // L 24.25 8z
          lineTo(x = 24.25f, y = 8.0f)
          close()
        }
        // <polygon points="6.0 15.83 8.58 18.41 10.0 17.0 6.0 13.0 2.0 17.0 3.41 18.42 6.0 15.83" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 15.83
          moveTo(x = 6.0f, y = 15.83f)
          // L 8.58 18.41
          lineTo(x = 8.58f, y = 18.41f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 6 13
          lineTo(x = 6.0f, y = 13.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 3.41 18.42
          lineTo(x = 3.41f, y = 18.42f)
          // L 6 15.83z
          lineTo(x = 6.0f, y = 15.83f)
          close()
        }
        // <polygon points="6.0 27.17 3.42 24.59 2.0 26.0 6.0 30.0 10.0 26.0 8.59 24.58 6.0 27.17" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 27.17
          moveTo(x = 6.0f, y = 27.17f)
          // L 3.42 24.59
          lineTo(x = 3.42f, y = 24.59f)
          // L 2 26
          lineTo(x = 2.0f, y = 26.0f)
          // L 6 30
          lineTo(x = 6.0f, y = 30.0f)
          // L 10 26
          lineTo(x = 10.0f, y = 26.0f)
          // L 8.59 24.58
          lineTo(x = 8.59f, y = 24.58f)
          // L 6 27.17z
          lineTo(x = 6.0f, y = 27.17f)
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
      .also { _textLeading = it }
  }

@Suppress("ObjectPropertyName")
private var _textLeading: ImageVector? = null
