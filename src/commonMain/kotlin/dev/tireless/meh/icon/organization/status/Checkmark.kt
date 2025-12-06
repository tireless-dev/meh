// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Checkmark: ImageVector
  get() {
    val current = _checkmark
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Checkmark",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="13.0 24.0 4.0 15.0 5.414 13.586 13.0 21.171 26.586 7.586 28.0 9.0 13.0 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 24
          moveTo(x = 13.0f, y = 24.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 5.414 13.586
          lineTo(x = 5.414f, y = 13.586f)
          // L 13 21.171
          lineTo(x = 13.0f, y = 21.171f)
          // L 26.586 7.586
          lineTo(x = 26.586f, y = 7.586f)
          // L 28 9
          lineTo(x = 28.0f, y = 9.0f)
          // L 13 24z
          lineTo(x = 13.0f, y = 24.0f)
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
      .also { _checkmark = it }
  }

@Suppress("ObjectPropertyName")
private var _checkmark: ImageVector? = null
