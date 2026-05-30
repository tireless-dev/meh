// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SignalStrength: ImageVector
  get() {
    val current = _signalStrength
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SignalStrength",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="20" x="26.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="15" x="18.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 11
          moveTo(x = 18.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="11.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="6" x="4.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _signalStrength = it }
  }

@Suppress("ObjectPropertyName")
private var _signalStrength: ImageVector? = null
