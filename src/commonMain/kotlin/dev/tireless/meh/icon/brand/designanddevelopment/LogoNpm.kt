// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoNpm: ImageVector
  get() {
    val current = _logoNpm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoNpm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 28 V4 h24 v24z M8.5 8.5 v15 H16 v-12 h4.5 v12 h3 v-15z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 24z
          verticalLineToRelative(dy = 24.0f)
          close()
          // M 8.5 8.5
          moveTo(x = 8.5f, y = 8.5f)
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -12
          verticalLineToRelative(dy = -12.0f)
          // h 4.5
          horizontalLineToRelative(dx = 4.5f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -15z
          verticalLineToRelative(dy = -15.0f)
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
      .also { _logoNpm = it }
  }

@Suppress("ObjectPropertyName")
private var _logoNpm: ImageVector? = null
