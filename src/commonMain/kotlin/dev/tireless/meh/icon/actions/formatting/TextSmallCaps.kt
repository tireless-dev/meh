// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextSmallCaps: ImageVector
  get() {
    val current = _textSmallCaps
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextSmallCaps",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.0 27.0 23.0 15.0 18.0 15.0 18.0 13.0 30.0 13.0 30.0 15.0 25.0 15.0 25.0 27.0 23.0 27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 27
          moveTo(x = 23.0f, y = 27.0f)
          // L 23 15
          lineTo(x = 23.0f, y = 15.0f)
          // L 18 15
          lineTo(x = 18.0f, y = 15.0f)
          // L 18 13
          lineTo(x = 18.0f, y = 13.0f)
          // L 30 13
          lineTo(x = 30.0f, y = 13.0f)
          // L 30 15
          lineTo(x = 30.0f, y = 15.0f)
          // L 25 15
          lineTo(x = 25.0f, y = 15.0f)
          // L 25 27
          lineTo(x = 25.0f, y = 27.0f)
          // L 23 27z
          lineTo(x = 23.0f, y = 27.0f)
          close()
        }
        // <polygon points="11.0 27.0 11.0 8.0 2.0 8.0 2.0 6.0 22.0 6.0 22.0 8.0 13.0 8.0 13.0 27.0 11.0 27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 27
          moveTo(x = 11.0f, y = 27.0f)
          // L 11 8
          lineTo(x = 11.0f, y = 8.0f)
          // L 2 8
          lineTo(x = 2.0f, y = 8.0f)
          // L 2 6
          lineTo(x = 2.0f, y = 6.0f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // L 22 8
          lineTo(x = 22.0f, y = 8.0f)
          // L 13 8
          lineTo(x = 13.0f, y = 8.0f)
          // L 13 27
          lineTo(x = 13.0f, y = 27.0f)
          // L 11 27z
          lineTo(x = 11.0f, y = 27.0f)
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
      .also { _textSmallCaps = it }
  }

@Suppress("ObjectPropertyName")
private var _textSmallCaps: ImageVector? = null
