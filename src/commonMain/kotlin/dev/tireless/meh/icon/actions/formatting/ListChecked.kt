// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListChecked: ImageVector
  get() {
    val current = _listChecked
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ListChecked",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="16.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="14.0 19.4 12.6 18.0 6.0 24.6 3.4 22.0 2.0 23.4 6.0 27.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 19.4
          moveTo(x = 14.0f, y = 19.4f)
          // L 12.6 18
          lineTo(x = 12.6f, y = 18.0f)
          // L 6 24.6
          lineTo(x = 6.0f, y = 24.6f)
          // L 3.4 22
          lineTo(x = 3.4f, y = 22.0f)
          // L 2 23.4
          lineTo(x = 2.0f, y = 23.4f)
          // L 6 27.4z
          lineTo(x = 6.0f, y = 27.4f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="14.0 5.4 12.6 4.0 6.0 10.6 3.4 8.0 2.0 9.4 6.0 13.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 5.4
          moveTo(x = 14.0f, y = 5.4f)
          // L 12.6 4
          lineTo(x = 12.6f, y = 4.0f)
          // L 6 10.6
          lineTo(x = 6.0f, y = 10.6f)
          // L 3.4 8
          lineTo(x = 3.4f, y = 8.0f)
          // L 2 9.4
          lineTo(x = 2.0f, y = 9.4f)
          // L 6 13.4z
          lineTo(x = 6.0f, y = 13.4f)
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
      .also { _listChecked = it }
  }

@Suppress("ObjectPropertyName")
private var _listChecked: ImageVector? = null
