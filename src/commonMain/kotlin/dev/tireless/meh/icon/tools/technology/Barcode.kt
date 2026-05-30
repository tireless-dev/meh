// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Barcode: ImageVector
  get() {
    val current = _barcode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Barcode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="22" x="2.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 6
          moveTo(x = 2.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="20" x="12.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 6
          moveTo(x = 12.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="20" x="6.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="20" x="16.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 6
          moveTo(x = 16.0f, y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="20" x="22.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 6
          moveTo(x = 22.0f, y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="2" height="22" x="28.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
      .also { _barcode = it }
  }

@Suppress("ObjectPropertyName")
private var _barcode: ImageVector? = null
