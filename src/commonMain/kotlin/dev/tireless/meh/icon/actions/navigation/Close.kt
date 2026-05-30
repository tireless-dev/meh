// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Close: ImageVector
  get() {
    val current = _close
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Close",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.4141 16.0 24.0 9.4141 22.5859 8.0 16.0 14.5859 9.4143 8.0 8.0 9.4141 14.5859 16.0 8.0 22.5859 9.4143 24.0 16.0 17.4141 22.5859 24.0 24.0 22.5859 17.4141 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.4141 16
          moveTo(x = 17.4141f, y = 16.0f)
          // L 24 9.4141
          lineTo(x = 24.0f, y = 9.4141f)
          // L 22.5859 8
          lineTo(x = 22.5859f, y = 8.0f)
          // L 16 14.5859
          lineTo(x = 16.0f, y = 14.5859f)
          // L 9.4143 8
          lineTo(x = 9.4143f, y = 8.0f)
          // L 8 9.4141
          lineTo(x = 8.0f, y = 9.4141f)
          // L 14.5859 16
          lineTo(x = 14.5859f, y = 16.0f)
          // L 8 22.5859
          lineTo(x = 8.0f, y = 22.5859f)
          // L 9.4143 24
          lineTo(x = 9.4143f, y = 24.0f)
          // L 16 17.4141
          lineTo(x = 16.0f, y = 17.4141f)
          // L 22.5859 24
          lineTo(x = 22.5859f, y = 24.0f)
          // L 24 22.5859
          lineTo(x = 24.0f, y = 22.5859f)
          // L 17.4141 16z
          lineTo(x = 17.4141f, y = 16.0f)
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
      .also { _close = it }
  }

@Suppress("ObjectPropertyName")
private var _close: ImageVector? = null
