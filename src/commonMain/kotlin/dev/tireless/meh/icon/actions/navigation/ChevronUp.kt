// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronUp: ImageVector
  get() {
    val current = _chevronUp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronUp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 10.0 26.0 20.0 24.6 21.4 16.0 12.8 7.4 21.4 6.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 24.6 21.4
          lineTo(x = 24.6f, y = 21.4f)
          // L 16 12.8
          lineTo(x = 16.0f, y = 12.8f)
          // L 7.4 21.4
          lineTo(x = 7.4f, y = 21.4f)
          // L 6 20z
          lineTo(x = 6.0f, y = 20.0f)
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
      .also { _chevronUp = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronUp: ImageVector? = null
