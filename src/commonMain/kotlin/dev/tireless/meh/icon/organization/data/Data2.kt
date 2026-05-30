// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Data2: ImageVector
  get() {
    val current = _data2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Data2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="11" height="2" x="4.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -11z
          horizontalLineToRelative(dx = -11.0f)
          close()
        }
        // <rect width="10" height="2" x="18.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 6
          moveTo(x = 18.0f, y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="7" height="2" x="21.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 12
          moveTo(x = 21.0f, y = 12.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="7" height="2" x="11.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 12
          moveTo(x = 11.0f, y = 12.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="4" height="2" x="4.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 12
          moveTo(x = 4.0f, y = 12.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="24" height="2" x="4.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -24z
          horizontalLineToRelative(dx = -24.0f)
          close()
        }
        // <rect width="17" height="2" x="4.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // h 17
          horizontalLineToRelative(dx = 17.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -17z
          horizontalLineToRelative(dx = -17.0f)
          close()
        }
        // <rect width="4" height="2" x="24.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
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
      .also { _data2 = it }
  }

@Suppress("ObjectPropertyName")
private var _data2: ImageVector? = null
