// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CenterSquare: ImageVector
  get() {
    val current = _centerSquare
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CenterSquare",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="6.0 12.0 4.0 12.0 4.0 4.0 12.0 4.0 12.0 6.0 6.0 6.0 6.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // L 4 12
          lineTo(x = 4.0f, y = 12.0f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 12 4
          lineTo(x = 12.0f, y = 4.0f)
          // L 12 6
          lineTo(x = 12.0f, y = 6.0f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // L 6 12z
          lineTo(x = 6.0f, y = 12.0f)
          close()
        }
        // <polygon points="28.0 12.0 26.0 12.0 26.0 6.0 20.0 6.0 20.0 4.0 28.0 4.0 28.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 28 4
          lineTo(x = 28.0f, y = 4.0f)
          // L 28 12z
          lineTo(x = 28.0f, y = 12.0f)
          close()
        }
        // <polygon points="12.0 28.0 4.0 28.0 4.0 20.0 6.0 20.0 6.0 26.0 12.0 26.0 12.0 28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // L 4 28
          lineTo(x = 4.0f, y = 28.0f)
          // L 4 20
          lineTo(x = 4.0f, y = 20.0f)
          // L 6 20
          lineTo(x = 6.0f, y = 20.0f)
          // L 6 26
          lineTo(x = 6.0f, y = 26.0f)
          // L 12 26
          lineTo(x = 12.0f, y = 26.0f)
          // L 12 28z
          lineTo(x = 12.0f, y = 28.0f)
          close()
        }
        // <polygon points="28.0 28.0 20.0 28.0 20.0 26.0 26.0 26.0 26.0 20.0 28.0 20.0 28.0 28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // L 20 28
          lineTo(x = 20.0f, y = 28.0f)
          // L 20 26
          lineTo(x = 20.0f, y = 26.0f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 28 20
          lineTo(x = 28.0f, y = 20.0f)
          // L 28 28z
          lineTo(x = 28.0f, y = 28.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 10
          moveTo(x = 15.0f, y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="10.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 15
          moveTo(x = 10.0f, y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="18.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 15
          moveTo(x = 18.0f, y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 18
          moveTo(x = 15.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
      .also { _centerSquare = it }
  }

@Suppress("ObjectPropertyName")
private var _centerSquare: ImageVector? = null
