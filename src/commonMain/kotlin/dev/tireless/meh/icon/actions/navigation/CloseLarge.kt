// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloseLarge: ImageVector
  get() {
    val current = _closeLarge
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloseLarge",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.4141 16.0 26.0 7.4141 24.5859 6.0 16.0 14.5859 7.4143 6.0 6.0 7.4141 14.5859 16.0 6.0 24.5859 7.4143 26.0 16.0 17.4141 24.5859 26.0 26.0 24.5859 17.4141 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.4141 16
          moveTo(x = 17.4141f, y = 16.0f)
          // L 26 7.4141
          lineTo(x = 26.0f, y = 7.4141f)
          // L 24.5859 6
          lineTo(x = 24.5859f, y = 6.0f)
          // L 16 14.5859
          lineTo(x = 16.0f, y = 14.5859f)
          // L 7.4143 6
          lineTo(x = 7.4143f, y = 6.0f)
          // L 6 7.4141
          lineTo(x = 6.0f, y = 7.4141f)
          // L 14.5859 16
          lineTo(x = 14.5859f, y = 16.0f)
          // L 6 24.5859
          lineTo(x = 6.0f, y = 24.5859f)
          // L 7.4143 26
          lineTo(x = 7.4143f, y = 26.0f)
          // L 16 17.4141
          lineTo(x = 16.0f, y = 17.4141f)
          // L 24.5859 26
          lineTo(x = 24.5859f, y = 26.0f)
          // L 26 24.5859
          lineTo(x = 26.0f, y = 24.5859f)
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
      .also { _closeLarge = it }
  }

@Suppress("ObjectPropertyName")
private var _closeLarge: ImageVector? = null
