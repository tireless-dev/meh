// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Router: ImageVector
  get() {
    val current = _router
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Router",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="21.0 7.0 16.0 2.0 11.0 7.0 12.409 8.419 15.0 5.847 15.0 13.0 17.0 13.0 17.0 5.794 19.591 8.419 21.0 7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 7
          moveTo(x = 21.0f, y = 7.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 11 7
          lineTo(x = 11.0f, y = 7.0f)
          // L 12.409 8.419
          lineTo(x = 12.409f, y = 8.419f)
          // L 15 5.847
          lineTo(x = 15.0f, y = 5.847f)
          // L 15 13
          lineTo(x = 15.0f, y = 13.0f)
          // L 17 13
          lineTo(x = 17.0f, y = 13.0f)
          // L 17 5.794
          lineTo(x = 17.0f, y = 5.794f)
          // L 19.591 8.419
          lineTo(x = 19.591f, y = 8.419f)
          // L 21 7z
          lineTo(x = 21.0f, y = 7.0f)
          close()
        }
        // <polygon points="21.0 25.0 16.0 30.0 11.0 25.0 12.409 23.581 15.0 26.153 15.0 19.0 17.0 19.0 17.0 26.206 19.591 23.581 21.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 25
          moveTo(x = 21.0f, y = 25.0f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 12.409 23.581
          lineTo(x = 12.409f, y = 23.581f)
          // L 15 26.153
          lineTo(x = 15.0f, y = 26.153f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 17 19
          lineTo(x = 17.0f, y = 19.0f)
          // L 17 26.206
          lineTo(x = 17.0f, y = 26.206f)
          // L 19.591 23.581
          lineTo(x = 19.591f, y = 23.581f)
          // L 21 25z
          lineTo(x = 21.0f, y = 25.0f)
          close()
        }
        // <polygon points="24.0 11.0 19.0 16.0 24.0 21.0 25.419 19.591 22.847 17.0 30.0 17.0 30.0 15.0 22.794 15.0 25.419 12.409 24.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 11
          moveTo(x = 24.0f, y = 11.0f)
          // L 19 16
          lineTo(x = 19.0f, y = 16.0f)
          // L 24 21
          lineTo(x = 24.0f, y = 21.0f)
          // L 25.419 19.591
          lineTo(x = 25.419f, y = 19.591f)
          // L 22.847 17
          lineTo(x = 22.847f, y = 17.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 30 15
          lineTo(x = 30.0f, y = 15.0f)
          // L 22.794 15
          lineTo(x = 22.794f, y = 15.0f)
          // L 25.419 12.409
          lineTo(x = 25.419f, y = 12.409f)
          // L 24 11z
          lineTo(x = 24.0f, y = 11.0f)
          close()
        }
        // <polygon points="8.0 11.0 13.0 16.0 8.0 21.0 6.581 19.591 9.153 17.0 2.0 17.0 2.0 15.0 9.206 15.0 6.581 12.409 8.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 11
          moveTo(x = 8.0f, y = 11.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // L 6.581 19.591
          lineTo(x = 6.581f, y = 19.591f)
          // L 9.153 17
          lineTo(x = 9.153f, y = 17.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 9.206 15
          lineTo(x = 9.206f, y = 15.0f)
          // L 6.581 12.409
          lineTo(x = 6.581f, y = 12.409f)
          // L 8 11z
          lineTo(x = 8.0f, y = 11.0f)
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
      .also { _router = it }
  }

@Suppress("ObjectPropertyName")
private var _router: ImageVector? = null
