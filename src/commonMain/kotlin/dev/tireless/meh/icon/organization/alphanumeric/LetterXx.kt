// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterXx: ImageVector
  get() {
    val current = _letterXx
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterXx",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.0 9.0 13.0 9.0 11.0 15.0 9.0 9.0 7.0 9.0 9.75 16.0 7.0 23.0 9.0 23.0 11.0 17.0 13.0 23.0 15.0 23.0 12.24 16.0 15.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 9
          moveTo(x = 15.0f, y = 9.0f)
          // L 13 9
          lineTo(x = 13.0f, y = 9.0f)
          // L 11 15
          lineTo(x = 11.0f, y = 15.0f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 9.75 16
          lineTo(x = 9.75f, y = 16.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 9 23
          lineTo(x = 9.0f, y = 23.0f)
          // L 11 17
          lineTo(x = 11.0f, y = 17.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 12.24 16
          lineTo(x = 12.24f, y = 16.0f)
          // L 15 9z
          lineTo(x = 15.0f, y = 9.0f)
          close()
        }
        // <polygon points="25.0 13.0 23.0 13.0 21.0 16.9 19.0 13.0 17.0 13.0 19.91 18.0 17.0 23.0 19.0 23.0 21.0 19.2 23.0 23.0 25.0 23.0 22.1 18.0 25.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 13
          moveTo(x = 25.0f, y = 13.0f)
          // L 23 13
          lineTo(x = 23.0f, y = 13.0f)
          // L 21 16.9
          lineTo(x = 21.0f, y = 16.9f)
          // L 19 13
          lineTo(x = 19.0f, y = 13.0f)
          // L 17 13
          lineTo(x = 17.0f, y = 13.0f)
          // L 19.91 18
          lineTo(x = 19.91f, y = 18.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 19 23
          lineTo(x = 19.0f, y = 23.0f)
          // L 21 19.2
          lineTo(x = 21.0f, y = 19.2f)
          // L 23 23
          lineTo(x = 23.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 22.1 18
          lineTo(x = 22.1f, y = 18.0f)
          // L 25 13z
          lineTo(x = 25.0f, y = 13.0f)
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
      .also { _letterXx = it }
  }

@Suppress("ObjectPropertyName")
private var _letterXx: ImageVector? = null
