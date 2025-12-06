// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PanVertical: ImageVector
  get() {
    val current = _panVertical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PanVertical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="10.0 8.0 11.414 9.414 15.0 5.828 15.0 26.172 11.414 22.586 10.0 24.0 16.0 30.0 22.0 24.0 20.586 22.586 17.0 26.172 17.0 5.828 20.586 9.414 22.0 8.0 16.0 2.0 10.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 8
          moveTo(x = 10.0f, y = 8.0f)
          // L 11.414 9.414
          lineTo(x = 11.414f, y = 9.414f)
          // L 15 5.828
          lineTo(x = 15.0f, y = 5.828f)
          // L 15 26.172
          lineTo(x = 15.0f, y = 26.172f)
          // L 11.414 22.586
          lineTo(x = 11.414f, y = 22.586f)
          // L 10 24
          lineTo(x = 10.0f, y = 24.0f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 22 24
          lineTo(x = 22.0f, y = 24.0f)
          // L 20.586 22.586
          lineTo(x = 20.586f, y = 22.586f)
          // L 17 26.172
          lineTo(x = 17.0f, y = 26.172f)
          // L 17 5.828
          lineTo(x = 17.0f, y = 5.828f)
          // L 20.586 9.414
          lineTo(x = 20.586f, y = 9.414f)
          // L 22 8
          lineTo(x = 22.0f, y = 8.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 10 8z
          lineTo(x = 10.0f, y = 8.0f)
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
      .also { _panVertical = it }
  }

@Suppress("ObjectPropertyName")
private var _panVertical: ImageVector? = null
