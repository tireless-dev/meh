// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextMining: ImageVector
  get() {
    val current = _textMining
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextMining",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="18.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 24
          moveTo(x = 18.0f, y = 24.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <polygon points="16.001 26.473 16.0 26.473 4.284 12.955 9.5 6.0 22.5 6.0 27.716 12.955 24.476 16.692 25.989 18.002 30.284 13.045 23.5 4.0 8.5 4.0 1.716 13.045 14.488 27.782 16.001 26.473" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.001 26.473
          moveTo(x = 16.001f, y = 26.473f)
          // L 16 26.473
          lineTo(x = 16.0f, y = 26.473f)
          // L 4.284 12.955
          lineTo(x = 4.284f, y = 12.955f)
          // L 9.5 6
          lineTo(x = 9.5f, y = 6.0f)
          // L 22.5 6
          lineTo(x = 22.5f, y = 6.0f)
          // L 27.716 12.955
          lineTo(x = 27.716f, y = 12.955f)
          // L 24.476 16.692
          lineTo(x = 24.476f, y = 16.692f)
          // L 25.989 18.002
          lineTo(x = 25.989f, y = 18.002f)
          // L 30.284 13.045
          lineTo(x = 30.284f, y = 13.045f)
          // L 23.5 4
          lineTo(x = 23.5f, y = 4.0f)
          // L 8.5 4
          lineTo(x = 8.5f, y = 4.0f)
          // L 1.716 13.045
          lineTo(x = 1.716f, y = 13.045f)
          // L 14.488 27.782
          lineTo(x = 14.488f, y = 27.782f)
          // L 16.001 26.473z
          lineTo(x = 16.001f, y = 26.473f)
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
      .also { _textMining = it }
  }

@Suppress("ObjectPropertyName")
private var _textMining: ImageVector? = null
