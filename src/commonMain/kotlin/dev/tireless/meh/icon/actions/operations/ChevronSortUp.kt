// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronSortUp: ImageVector
  get() {
    val current = _chevronSortUp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronSortUp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 4.0 23.0 11.0 21.6 12.4 16.0 6.8 10.4 12.4 9.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // L 23 11
          lineTo(x = 23.0f, y = 11.0f)
          // L 21.6 12.4
          lineTo(x = 21.6f, y = 12.4f)
          // L 16 6.8
          lineTo(x = 16.0f, y = 6.8f)
          // L 10.4 12.4
          lineTo(x = 10.4f, y = 12.4f)
          // L 9 11z
          lineTo(x = 9.0f, y = 11.0f)
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
      .also { _chevronSortUp = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronSortUp: ImageVector? = null
