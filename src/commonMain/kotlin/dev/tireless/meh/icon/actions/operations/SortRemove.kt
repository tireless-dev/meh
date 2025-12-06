// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortRemove: ImageVector
  get() {
    val current = _sortRemove
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SortRemove",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 19.415 28.586 18.0 25.0 21.587 21.414 18.0 20.0 19.415 23.586 23.0 20.0 26.586 21.414 28.0 25.0 24.414 28.586 28.0 30.0 26.586 26.414 23.0 30.0 19.415" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 19.415
          moveTo(x = 30.0f, y = 19.415f)
          // L 28.586 18
          lineTo(x = 28.586f, y = 18.0f)
          // L 25 21.587
          lineTo(x = 25.0f, y = 21.587f)
          // L 21.414 18
          lineTo(x = 21.414f, y = 18.0f)
          // L 20 19.415
          lineTo(x = 20.0f, y = 19.415f)
          // L 23.586 23
          lineTo(x = 23.586f, y = 23.0f)
          // L 20 26.586
          lineTo(x = 20.0f, y = 26.586f)
          // L 21.414 28
          lineTo(x = 21.414f, y = 28.0f)
          // L 25 24.414
          lineTo(x = 25.0f, y = 24.414f)
          // L 28.586 28
          lineTo(x = 28.586f, y = 28.0f)
          // L 30 26.586
          lineTo(x = 30.0f, y = 26.586f)
          // L 26.414 23
          lineTo(x = 26.414f, y = 23.0f)
          // L 30 19.415z
          lineTo(x = 30.0f, y = 19.415f)
          close()
        }
        // <rect width="6" height="2" x="10.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 18
          moveTo(x = 10.0f, y = 18.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 6
          moveTo(x = 2.0f, y = 6.0f)
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
      .also { _sortRemove = it }
  }

@Suppress("ObjectPropertyName")
private var _sortRemove: ImageVector? = null
