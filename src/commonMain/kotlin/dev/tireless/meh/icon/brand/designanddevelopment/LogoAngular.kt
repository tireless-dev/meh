// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoAngular: ImageVector
  get() {
    val current = _logoAngular
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoAngular",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13.5 16 h4.9 L16 10.8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13.5 16
          moveTo(x = 13.5f, y = 16.0f)
          // h 4.9
          horizontalLineToRelative(dx = 4.9f)
          // L 16 10.8z
          lineTo(x = 16.0f, y = 10.8f)
          close()
        }
        // M16 3 3 7.6 l2.7 15.8 L16 29 l10.3 -5.6 L29 7.6z m5.1 18.6 -1.5 -3.2 h-7.1 L11 21.6 H8.6 L16 5.3 l7.4 16.2 h-2.3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // L 3 7.6
          lineTo(x = 3.0f, y = 7.6f)
          // l 2.7 15.8
          lineToRelative(dx = 2.7f, dy = 15.8f)
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 10.3 -5.6
          lineToRelative(dx = 10.3f, dy = -5.6f)
          // L 29 7.6z
          lineTo(x = 29.0f, y = 7.6f)
          close()
          // m 5.1 18.6
          moveToRelative(dx = 5.1f, dy = 18.6f)
          // l -1.5 -3.2
          lineToRelative(dx = -1.5f, dy = -3.2f)
          // h -7.1
          horizontalLineToRelative(dx = -7.1f)
          // L 11 21.6
          lineTo(x = 11.0f, y = 21.6f)
          // H 8.6
          horizontalLineTo(x = 8.6f)
          // L 16 5.3
          lineTo(x = 16.0f, y = 5.3f)
          // l 7.4 16.2
          lineToRelative(dx = 7.4f, dy = 16.2f)
          // h -2.3z
          horizontalLineToRelative(dx = -2.3f)
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
      .also { _logoAngular = it }
  }

@Suppress("ObjectPropertyName")
private var _logoAngular: ImageVector? = null
