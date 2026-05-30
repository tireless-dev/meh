// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterZz: ImageVector
  get() {
    val current = _letterZz
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterZz",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 15.0 25.0 13.0 17.0 13.0 17.0 15.0 22.5 15.0 17.0 21.0 17.0 23.0 25.0 23.0 25.0 21.0 19.51 21.0 25.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 15
          moveTo(x = 25.0f, y = 15.0f)
          // L 25 13
          lineTo(x = 25.0f, y = 13.0f)
          // L 17 13
          lineTo(x = 17.0f, y = 13.0f)
          // L 17 15
          lineTo(x = 17.0f, y = 15.0f)
          // L 22.5 15
          lineTo(x = 22.5f, y = 15.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 19.51 21
          lineTo(x = 19.51f, y = 21.0f)
          // L 25 15z
          lineTo(x = 25.0f, y = 15.0f)
          close()
        }
        // <polygon points="15.0 9.0 7.0 9.0 7.0 11.0 13.0 11.0 7.0 21.0 7.0 23.0 15.0 23.0 15.0 21.0 9.0 21.0 15.0 11.0 15.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 9
          moveTo(x = 15.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 7 11
          lineTo(x = 7.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 7 21
          lineTo(x = 7.0f, y = 21.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 9 21
          lineTo(x = 9.0f, y = 21.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 9z
          lineTo(x = 15.0f, y = 9.0f)
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
      .also { _letterZz = it }
  }

@Suppress("ObjectPropertyName")
private var _letterZz: ImageVector? = null
