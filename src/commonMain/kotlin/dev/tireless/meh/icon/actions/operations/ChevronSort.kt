// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronSort: ImageVector
  get() {
    val current = _chevronSort
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronSort",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 28.0 9.0 21.0 10.41 19.59 16.0 25.17 21.59 19.59 23.0 21.0 16.0 28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // L 9 21
          lineTo(x = 9.0f, y = 21.0f)
          // L 10.41 19.59
          lineTo(x = 10.41f, y = 19.59f)
          // L 16 25.17
          lineTo(x = 16.0f, y = 25.17f)
          // L 21.59 19.59
          lineTo(x = 21.59f, y = 19.59f)
          // L 23 21
          lineTo(x = 23.0f, y = 21.0f)
          // L 16 28z
          lineTo(x = 16.0f, y = 28.0f)
          close()
        }
        // <polygon points="16.0 4.0 23.0 11.0 21.59 12.41 16.0 6.83 10.41 12.41 9.0 11.0 16.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // L 23 11
          lineTo(x = 23.0f, y = 11.0f)
          // L 21.59 12.41
          lineTo(x = 21.59f, y = 12.41f)
          // L 16 6.83
          lineTo(x = 16.0f, y = 6.83f)
          // L 10.41 12.41
          lineTo(x = 10.41f, y = 12.41f)
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // L 16 4z
          lineTo(x = 16.0f, y = 4.0f)
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
      .also { _chevronSort = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronSort: ImageVector? = null
