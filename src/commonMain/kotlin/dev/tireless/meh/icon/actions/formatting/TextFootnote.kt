// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextFootnote: ImageVector
  get() {
    val current = _textFootnote
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextFootnote",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="2.0 7.0 2.0 9.0 9.0 9.0 9.0 25.0 11.0 25.0 11.0 9.0 18.0 9.0 18.0 7.0 2.0 7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 7
          moveTo(x = 2.0f, y = 7.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 9 25
          lineTo(x = 9.0f, y = 25.0f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 11 9
          lineTo(x = 11.0f, y = 9.0f)
          // L 18 9
          lineTo(x = 18.0f, y = 9.0f)
          // L 18 7
          lineTo(x = 18.0f, y = 7.0f)
          // L 2 7z
          lineTo(x = 2.0f, y = 7.0f)
          close()
        }
        // <polygon points="30.0 11.076 29.256 9.219 26.0 10.522 26.0 7.0 24.0 7.0 24.0 10.523 20.744 9.22 20.0 11.077 23.417 12.444 20.9 15.8 22.5 17.0 25.0 13.667 27.5 17.0 29.1 15.8 26.583 12.443 30.0 11.076" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11.076
          moveTo(x = 30.0f, y = 11.076f)
          // L 29.256 9.219
          lineTo(x = 29.256f, y = 9.219f)
          // L 26 10.522
          lineTo(x = 26.0f, y = 10.522f)
          // L 26 7
          lineTo(x = 26.0f, y = 7.0f)
          // L 24 7
          lineTo(x = 24.0f, y = 7.0f)
          // L 24 10.523
          lineTo(x = 24.0f, y = 10.523f)
          // L 20.744 9.22
          lineTo(x = 20.744f, y = 9.22f)
          // L 20 11.077
          lineTo(x = 20.0f, y = 11.077f)
          // L 23.417 12.444
          lineTo(x = 23.417f, y = 12.444f)
          // L 20.9 15.8
          lineTo(x = 20.9f, y = 15.8f)
          // L 22.5 17
          lineTo(x = 22.5f, y = 17.0f)
          // L 25 13.667
          lineTo(x = 25.0f, y = 13.667f)
          // L 27.5 17
          lineTo(x = 27.5f, y = 17.0f)
          // L 29.1 15.8
          lineTo(x = 29.1f, y = 15.8f)
          // L 26.583 12.443
          lineTo(x = 26.583f, y = 12.443f)
          // L 30 11.076z
          lineTo(x = 30.0f, y = 11.076f)
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
      .also { _textFootnote = it }
  }

@Suppress("ObjectPropertyName")
private var _textFootnote: ImageVector? = null
