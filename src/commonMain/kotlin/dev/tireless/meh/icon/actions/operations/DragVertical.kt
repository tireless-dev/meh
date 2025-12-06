// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DragVertical: ImageVector
  get() {
    val current = _dragVertical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DragVertical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 15.0 20.0 15.0 26.17 12.41 23.59 11.0 25.0 16.0 30.0 21.0 25.0 19.59 23.59 17.0 26.17 17.0 20.0 28.0 20.0 28.0 18.0 4.0 18.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 15 20
          lineTo(x = 15.0f, y = 20.0f)
          // L 15 26.17
          lineTo(x = 15.0f, y = 26.17f)
          // L 12.41 23.59
          lineTo(x = 12.41f, y = 23.59f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 21 25
          lineTo(x = 21.0f, y = 25.0f)
          // L 19.59 23.59
          lineTo(x = 19.59f, y = 23.59f)
          // L 17 26.17
          lineTo(x = 17.0f, y = 26.17f)
          // L 17 20
          lineTo(x = 17.0f, y = 20.0f)
          // L 28 20
          lineTo(x = 28.0f, y = 20.0f)
          // L 28 18
          lineTo(x = 28.0f, y = 18.0f)
          // L 4 18
          lineTo(x = 4.0f, y = 18.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // <polygon points="11.0 7.0 12.41 8.41 15.0 5.83 15.0 12.0 4.0 12.0 4.0 14.0 28.0 14.0 28.0 12.0 17.0 12.0 17.0 5.83 19.59 8.41 21.0 7.0 16.0 2.0 11.0 7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 7
          moveTo(x = 11.0f, y = 7.0f)
          // L 12.41 8.41
          lineTo(x = 12.41f, y = 8.41f)
          // L 15 5.83
          lineTo(x = 15.0f, y = 5.83f)
          // L 15 12
          lineTo(x = 15.0f, y = 12.0f)
          // L 4 12
          lineTo(x = 4.0f, y = 12.0f)
          // L 4 14
          lineTo(x = 4.0f, y = 14.0f)
          // L 28 14
          lineTo(x = 28.0f, y = 14.0f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 17 12
          lineTo(x = 17.0f, y = 12.0f)
          // L 17 5.83
          lineTo(x = 17.0f, y = 5.83f)
          // L 19.59 8.41
          lineTo(x = 19.59f, y = 8.41f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 11 7z
          lineTo(x = 11.0f, y = 7.0f)
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
      .also { _dragVertical = it }
  }

@Suppress("ObjectPropertyName")
private var _dragVertical: ImageVector? = null
