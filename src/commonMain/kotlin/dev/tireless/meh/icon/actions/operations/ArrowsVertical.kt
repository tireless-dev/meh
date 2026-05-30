// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowsVertical: ImageVector
  get() {
    val current = _arrowsVertical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrowsVertical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="27.6 20.6 24.0 24.2 24.0 4.0 22.0 4.0 22.0 24.2 18.4 20.6 17.0 22.0 23.0 28.0 29.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.6 20.6
          moveTo(x = 27.6f, y = 20.6f)
          // L 24 24.2
          lineTo(x = 24.0f, y = 24.2f)
          // L 24 4
          lineTo(x = 24.0f, y = 4.0f)
          // L 22 4
          lineTo(x = 22.0f, y = 4.0f)
          // L 22 24.2
          lineTo(x = 22.0f, y = 24.2f)
          // L 18.4 20.6
          lineTo(x = 18.4f, y = 20.6f)
          // L 17 22
          lineTo(x = 17.0f, y = 22.0f)
          // L 23 28
          lineTo(x = 23.0f, y = 28.0f)
          // L 29 22z
          lineTo(x = 29.0f, y = 22.0f)
          close()
        }
        // <polygon points="9.0 4.0 3.0 10.0 4.4 11.4 8.0 7.8 8.0 28.0 10.0 28.0 10.0 7.8 13.6 11.4 15.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // L 3 10
          lineTo(x = 3.0f, y = 10.0f)
          // L 4.4 11.4
          lineTo(x = 4.4f, y = 11.4f)
          // L 8 7.8
          lineTo(x = 8.0f, y = 7.8f)
          // L 8 28
          lineTo(x = 8.0f, y = 28.0f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 10 7.8
          lineTo(x = 10.0f, y = 7.8f)
          // L 13.6 11.4
          lineTo(x = 13.6f, y = 11.4f)
          // L 15 10z
          lineTo(x = 15.0f, y = 10.0f)
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
      .also { _arrowsVertical = it }
  }

@Suppress("ObjectPropertyName")
private var _arrowsVertical: ImageVector? = null
