// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListDropdown: ImageVector
  get() {
    val current = _listDropdown
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ListDropdown",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 6 V2 H2 v10 h9 v18 h19 V6Z M4 10 V4 h20 v2 H11 v4Z m24 18 H13 V8 h15Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 19
          horizontalLineToRelative(dx = 19.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 24 18
          moveToRelative(dx = 24.0f, dy = 18.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 15z
          horizontalLineToRelative(dx = 15.0f)
          close()
        }
        // <rect width="2" height="2" x="15.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 11
          moveTo(x = 15.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 11
          moveTo(x = 19.0f, y = 11.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="2" height="2" x="15.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 17
          moveTo(x = 15.0f, y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 17
          moveTo(x = 19.0f, y = 17.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="2" height="2" x="15.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 23
          moveTo(x = 15.0f, y = 23.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 23
          moveTo(x = 19.0f, y = 23.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
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
      .also { _listDropdown = it }
  }

@Suppress("ObjectPropertyName")
private var _listDropdown: ImageVector? = null
