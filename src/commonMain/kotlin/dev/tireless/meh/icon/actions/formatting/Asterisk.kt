// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Asterisk: ImageVector
  get() {
    val current = _asterisk
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Asterisk",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.316 13.949 27.684 12.051 17.0 15.612 17.0 4.0 15.0 4.0 15.0 15.612 4.316 12.051 3.684 13.949 14.368 17.51 7.2 27.066 8.8 28.267 16.0 18.667 23.2 28.267 24.8 27.066 17.632 17.51 28.316 13.949" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.316 13.949
          moveTo(x = 28.316f, y = 13.949f)
          // L 27.684 12.051
          lineTo(x = 27.684f, y = 12.051f)
          // L 17 15.612
          lineTo(x = 17.0f, y = 15.612f)
          // L 17 4
          lineTo(x = 17.0f, y = 4.0f)
          // L 15 4
          lineTo(x = 15.0f, y = 4.0f)
          // L 15 15.612
          lineTo(x = 15.0f, y = 15.612f)
          // L 4.316 12.051
          lineTo(x = 4.316f, y = 12.051f)
          // L 3.684 13.949
          lineTo(x = 3.684f, y = 13.949f)
          // L 14.368 17.51
          lineTo(x = 14.368f, y = 17.51f)
          // L 7.2 27.066
          lineTo(x = 7.2f, y = 27.066f)
          // L 8.8 28.267
          lineTo(x = 8.8f, y = 28.267f)
          // L 16 18.667
          lineTo(x = 16.0f, y = 18.667f)
          // L 23.2 28.267
          lineTo(x = 23.2f, y = 28.267f)
          // L 24.8 27.066
          lineTo(x = 24.8f, y = 27.066f)
          // L 17.632 17.51
          lineTo(x = 17.632f, y = 17.51f)
          // L 28.316 13.949z
          lineTo(x = 28.316f, y = 13.949f)
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
      .also { _asterisk = it }
  }

@Suppress("ObjectPropertyName")
private var _asterisk: ImageVector? = null
