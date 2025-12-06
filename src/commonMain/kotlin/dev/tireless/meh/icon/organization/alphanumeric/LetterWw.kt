// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterWw: ImageVector
  get() {
    val current = _letterWw
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterWw",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.3 13.0 23.39 21.61 22.0 13.0 20.0 13.0 18.61 21.61 17.7 13.0 16.0 13.0 17.36 23.0 19.64 23.0 21.0 14.63 22.36 23.0 24.64 23.0 26.0 13.0 24.3 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.3 13
          moveTo(x = 24.3f, y = 13.0f)
          // L 23.39 21.61
          lineTo(x = 23.39f, y = 21.61f)
          // L 22 13
          lineTo(x = 22.0f, y = 13.0f)
          // L 20 13
          lineTo(x = 20.0f, y = 13.0f)
          // L 18.61 21.61
          lineTo(x = 18.61f, y = 21.61f)
          // L 17.7 13
          lineTo(x = 17.7f, y = 13.0f)
          // L 16 13
          lineTo(x = 16.0f, y = 13.0f)
          // L 17.36 23
          lineTo(x = 17.36f, y = 23.0f)
          // L 19.64 23
          lineTo(x = 19.64f, y = 23.0f)
          // L 21 14.63
          lineTo(x = 21.0f, y = 14.63f)
          // L 22.36 23
          lineTo(x = 22.36f, y = 23.0f)
          // L 24.64 23
          lineTo(x = 24.64f, y = 23.0f)
          // L 26 13
          lineTo(x = 26.0f, y = 13.0f)
          // L 24.3 13z
          lineTo(x = 24.3f, y = 13.0f)
          close()
        }
        // <polygon points="12.21 9.0 11.87 17.0 11.61 21.54 11.2 18.0 10.52 12.54 8.5 12.54 7.82 18.0 7.41 21.54 7.16 17.0 6.81 9.0 5.01 9.0 6.01 23.0 8.28 23.0 9.04 18.07 9.5 14.0 9.51 13.97 9.52 14.0 9.98 18.07 10.74 23.0 13.01 23.0 14.01 9.0 12.21 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.21 9
          moveTo(x = 12.21f, y = 9.0f)
          // L 11.87 17
          lineTo(x = 11.87f, y = 17.0f)
          // L 11.61 21.54
          lineTo(x = 11.61f, y = 21.54f)
          // L 11.2 18
          lineTo(x = 11.2f, y = 18.0f)
          // L 10.52 12.54
          lineTo(x = 10.52f, y = 12.54f)
          // L 8.5 12.54
          lineTo(x = 8.5f, y = 12.54f)
          // L 7.82 18
          lineTo(x = 7.82f, y = 18.0f)
          // L 7.41 21.54
          lineTo(x = 7.41f, y = 21.54f)
          // L 7.16 17
          lineTo(x = 7.16f, y = 17.0f)
          // L 6.81 9
          lineTo(x = 6.81f, y = 9.0f)
          // L 5.01 9
          lineTo(x = 5.01f, y = 9.0f)
          // L 6.01 23
          lineTo(x = 6.01f, y = 23.0f)
          // L 8.28 23
          lineTo(x = 8.28f, y = 23.0f)
          // L 9.04 18.07
          lineTo(x = 9.04f, y = 18.07f)
          // L 9.5 14
          lineTo(x = 9.5f, y = 14.0f)
          // L 9.51 13.97
          lineTo(x = 9.51f, y = 13.97f)
          // L 9.52 14
          lineTo(x = 9.52f, y = 14.0f)
          // L 9.98 18.07
          lineTo(x = 9.98f, y = 18.07f)
          // L 10.74 23
          lineTo(x = 10.74f, y = 23.0f)
          // L 13.01 23
          lineTo(x = 13.01f, y = 23.0f)
          // L 14.01 9
          lineTo(x = 14.01f, y = 9.0f)
          // L 12.21 9z
          lineTo(x = 12.21f, y = 9.0f)
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
      .also { _letterWw = it }
  }

@Suppress("ObjectPropertyName")
private var _letterWw: ImageVector? = null
