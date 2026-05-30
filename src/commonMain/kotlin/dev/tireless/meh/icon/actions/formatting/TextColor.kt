// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextColor: ImageVector
  get() {
    val current = _textColor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextColor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 21 h2 L17 4 h-2 L8 21 h2 l1.61 -4 h8.74Z m-9.57 -6 3.44 -8.37 h.26 L19.54 15Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 21
          moveTo(x = 22.0f, y = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 17 4
          lineTo(x = 17.0f, y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1.61 -4
          lineToRelative(dx = 1.61f, dy = -4.0f)
          // h 8.74z
          horizontalLineToRelative(dx = 8.74f)
          close()
          // m -9.57 -6
          moveToRelative(dx = -9.57f, dy = -6.0f)
          // l 3.44 -8.37
          lineToRelative(dx = 3.44f, dy = -8.37f)
          // h 0.26
          horizontalLineToRelative(dx = 0.26f)
          // L 19.54 15z
          lineTo(x = 19.54f, y = 15.0f)
          close()
        }
        // <rect width="20" height="4" x="6.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 24
          moveTo(x = 6.0f, y = 24.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -20z
          horizontalLineToRelative(dx = -20.0f)
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
      .also { _textColor = it }
  }

@Suppress("ObjectPropertyName")
private var _textColor: ImageVector? = null
