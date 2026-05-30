// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QueryQueue: ImageVector
  get() {
    val current = _queryQueue
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.QueryQueue",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="18" height="2" x="10.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 6
          moveTo(x = 10.0f, y = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="10.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 12
          moveTo(x = 10.0f, y = 12.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="13" height="2" x="15.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 18
          moveTo(x = 15.0f, y = 18.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -13z
          horizontalLineToRelative(dx = -13.0f)
          close()
        }
        // <rect width="18" height="2" x="10.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 24
          moveTo(x = 10.0f, y = 24.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <polygon points="4.0 14.0 11.0 19.0 4.0 24.0 4.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 14
          moveTo(x = 4.0f, y = 14.0f)
          // L 11 19
          lineTo(x = 11.0f, y = 19.0f)
          // L 4 24
          lineTo(x = 4.0f, y = 24.0f)
          // L 4 14z
          lineTo(x = 4.0f, y = 14.0f)
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
      .also { _queryQueue = it }
  }

@Suppress("ObjectPropertyName")
private var _queryQueue: ImageVector? = null
