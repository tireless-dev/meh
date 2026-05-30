// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortAscending: ImageVector
  get() {
    val current = _sortAscending
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SortAscending",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.0 22.0 19.414 20.586 23.0 24.172 23.0 4.0 25.0 4.0 25.0 24.172 28.586 20.586 30.0 22.0 24.0 28.0 18.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 22
          moveTo(x = 18.0f, y = 22.0f)
          // L 19.414 20.586
          lineTo(x = 19.414f, y = 20.586f)
          // L 23 24.172
          lineTo(x = 23.0f, y = 24.172f)
          // L 23 4
          lineTo(x = 23.0f, y = 4.0f)
          // L 25 4
          lineTo(x = 25.0f, y = 4.0f)
          // L 25 24.172
          lineTo(x = 25.0f, y = 24.172f)
          // L 28.586 20.586
          lineTo(x = 28.586f, y = 20.586f)
          // L 30 22
          lineTo(x = 30.0f, y = 22.0f)
          // L 24 28
          lineTo(x = 24.0f, y = 28.0f)
          // L 18 22z
          lineTo(x = 18.0f, y = 22.0f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 18
          moveTo(x = 2.0f, y = 18.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="10" height="2" x="6.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="6" height="2" x="10.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 6
          moveTo(x = 10.0f, y = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
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
      .also { _sortAscending = it }
  }

@Suppress("ObjectPropertyName")
private var _sortAscending: ImageVector? = null
