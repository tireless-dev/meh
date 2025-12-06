// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoVue: ImageVector
  get() {
    val current = _logoVue
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoVue",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24.9 3.9 16 19.4 7.1 3.9 H2 l14 24.3 L30 3.9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.9 3.9
          moveTo(x = 24.9f, y = 3.9f)
          // L 16 19.4
          lineTo(x = 16.0f, y = 19.4f)
          // L 7.1 3.9
          lineTo(x = 7.1f, y = 3.9f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // l 14 24.3
          lineToRelative(dx = 14.0f, dy = 24.3f)
          // L 30 3.9z
          lineTo(x = 30.0f, y = 3.9f)
          close()
        }
        // m16 9.5 -3.2 -5.6 H8.1 L16 17.5 l7.9 -13.6 h-4.6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 9.5
          moveTo(x = 16.0f, y = 9.5f)
          // l -3.2 -5.6
          lineToRelative(dx = -3.2f, dy = -5.6f)
          // H 8.1
          horizontalLineTo(x = 8.1f)
          // L 16 17.5
          lineTo(x = 16.0f, y = 17.5f)
          // l 7.9 -13.6
          lineToRelative(dx = 7.9f, dy = -13.6f)
          // h -4.6z
          horizontalLineToRelative(dx = -4.6f)
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
      .also { _logoVue = it }
  }

@Suppress("ObjectPropertyName")
private var _logoVue: ImageVector? = null
