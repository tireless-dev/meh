// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterVv: ImageVector
  get() {
    val current = _letterVv
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterVv",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 13.0 23.25 13.0 21.0 22.03 18.79 13.0 17.0 13.0 19.5 23.0 22.5 23.0 25.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 13
          moveTo(x = 25.0f, y = 13.0f)
          // L 23.25 13
          lineTo(x = 23.25f, y = 13.0f)
          // L 21 22.03
          lineTo(x = 21.0f, y = 22.03f)
          // L 18.79 13
          lineTo(x = 18.79f, y = 13.0f)
          // L 17 13
          lineTo(x = 17.0f, y = 13.0f)
          // L 19.5 23
          lineTo(x = 19.5f, y = 23.0f)
          // L 22.5 23
          lineTo(x = 22.5f, y = 23.0f)
          // L 25 13z
          lineTo(x = 25.0f, y = 13.0f)
          close()
        }
        // <polygon points="13.0 9.0 11.0 22.0 9.0 9.0 7.0 9.0 9.52 23.0 12.48 23.0 15.0 9.0 13.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 9
          moveTo(x = 13.0f, y = 9.0f)
          // L 11 22
          lineTo(x = 11.0f, y = 22.0f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 9.52 23
          lineTo(x = 9.52f, y = 23.0f)
          // L 12.48 23
          lineTo(x = 12.48f, y = 23.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 13 9z
          lineTo(x = 13.0f, y = 9.0f)
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
      .also { _letterVv = it }
  }

@Suppress("ObjectPropertyName")
private var _letterVv: ImageVector? = null
