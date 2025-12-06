// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Anchor: ImageVector
  get() {
    val current = _anchor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Anchor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="2.257" y="25.5" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 2.4997463 28.08604
          moveTo(x = 2.4997463f, y = 28.08604f)
          // l 4.2426405 -4.2426405
          lineToRelative(dx = 4.2426405f, dy = -4.2426405f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -4.2426405 4.2426405z
          lineToRelative(dx = -4.2426405f, dy = 4.2426405f)
          close()
        }
        // <rect width="6" height="2" x="9.257" y="18.5" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 9.499746 21.08604
          moveTo(x = 9.499746f, y = 21.08604f)
          // l 4.2426405 -4.2426405
          lineToRelative(dx = 4.2426405f, dy = -4.2426405f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -4.2426405 4.2426405z
          lineToRelative(dx = -4.2426405f, dy = 4.2426405f)
          close()
        }
        // <rect width="6" height="2" x="16.257" y="11.5" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 16.499746 14.0860405
          moveTo(x = 16.499746f, y = 14.0860405f)
          // l 4.2426405 -4.2426405
          lineToRelative(dx = 4.2426405f, dy = -4.2426405f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -4.2426405 4.2426405z
          lineToRelative(dx = -4.2426405f, dy = 4.2426405f)
          close()
        }
        // <rect width="6" height="2" x="23.257" y="4.5" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 23.499746 7.0860386
          moveTo(x = 23.499746f, y = 7.0860386f)
          // l 4.2426405 -4.2426405
          lineToRelative(dx = 4.2426405f, dy = -4.2426405f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -4.2426405 4.2426405z
          lineToRelative(dx = -4.2426405f, dy = 4.2426405f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _anchor = it }
  }

@Suppress("ObjectPropertyName")
private var _anchor: ImageVector? = null
