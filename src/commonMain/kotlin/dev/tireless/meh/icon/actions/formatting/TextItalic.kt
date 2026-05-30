// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextItalic: ImageVector
  get() {
    val current = _textItalic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextItalic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 9.0 25.0 7.0 12.0 7.0 12.0 9.0 17.14 9.0 12.77 23.0 7.0 23.0 7.0 25.0 20.0 25.0 20.0 23.0 14.86 23.0 19.23 9.0 25.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 9
          moveTo(x = 25.0f, y = 9.0f)
          // L 25 7
          lineTo(x = 25.0f, y = 7.0f)
          // L 12 7
          lineTo(x = 12.0f, y = 7.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 17.14 9
          lineTo(x = 17.14f, y = 9.0f)
          // L 12.77 23
          lineTo(x = 12.77f, y = 23.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 7 25
          lineTo(x = 7.0f, y = 25.0f)
          // L 20 25
          lineTo(x = 20.0f, y = 25.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 14.86 23
          lineTo(x = 14.86f, y = 23.0f)
          // L 19.23 9
          lineTo(x = 19.23f, y = 9.0f)
          // L 25 9z
          lineTo(x = 25.0f, y = 9.0f)
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
      .also { _textItalic = it }
  }

@Suppress("ObjectPropertyName")
private var _textItalic: ImageVector? = null
