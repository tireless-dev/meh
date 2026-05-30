// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListCheckedMirror: ImageVector
  get() {
    val current = _listCheckedMirror
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ListCheckedMirror",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 19.4 28.6 18.0 22.0 24.6 19.4 22.0 18.0 23.4 22.0 27.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 19.4
          moveTo(x = 30.0f, y = 19.4f)
          // L 28.6 18
          lineTo(x = 28.6f, y = 18.0f)
          // L 22 24.6
          lineTo(x = 22.0f, y = 24.6f)
          // L 19.4 22
          lineTo(x = 19.4f, y = 22.0f)
          // L 18 23.4
          lineTo(x = 18.0f, y = 23.4f)
          // L 22 27.4z
          lineTo(x = 22.0f, y = 27.4f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 22
          moveTo(x = 2.0f, y = 22.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="30.0 5.4 28.6 4.0 22.0 10.6 19.4 8.0 18.0 9.4 22.0 13.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 5.4
          moveTo(x = 30.0f, y = 5.4f)
          // L 28.6 4
          lineTo(x = 28.6f, y = 4.0f)
          // L 22 10.6
          lineTo(x = 22.0f, y = 10.6f)
          // L 19.4 8
          lineTo(x = 19.4f, y = 8.0f)
          // L 18 9.4
          lineTo(x = 18.0f, y = 9.4f)
          // L 22 13.4z
          lineTo(x = 22.0f, y = 13.4f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 8
          moveTo(x = 2.0f, y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
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
      .also { _listCheckedMirror = it }
  }

@Suppress("ObjectPropertyName")
private var _listCheckedMirror: ImageVector? = null
