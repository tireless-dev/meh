// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Maximize: ImageVector
  get() {
    val current = _maximize
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Maximize",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 2.0 20.0 4.0 26.586 4.0 18.0 12.582 19.414 14.0 28.0 5.414 28.0 12.0 30.0 12.0 30.0 2.0 20.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 26.586 4
          lineTo(x = 26.586f, y = 4.0f)
          // L 18 12.582
          lineTo(x = 18.0f, y = 12.582f)
          // L 19.414 14
          lineTo(x = 19.414f, y = 14.0f)
          // L 28 5.414
          lineTo(x = 28.0f, y = 5.414f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 30 12
          lineTo(x = 30.0f, y = 12.0f)
          // L 30 2
          lineTo(x = 30.0f, y = 2.0f)
          // L 20 2z
          lineTo(x = 20.0f, y = 2.0f)
          close()
        }
        // <polygon points="14.0 19.416 12.592 18.0 4.0 26.586 4.0 20.0 2.0 20.0 2.0 30.0 12.0 30.0 12.0 28.0 5.414 28.0 14.0 19.416" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 19.416
          moveTo(x = 14.0f, y = 19.416f)
          // L 12.592 18
          lineTo(x = 12.592f, y = 18.0f)
          // L 4 26.586
          lineTo(x = 4.0f, y = 26.586f)
          // L 4 20
          lineTo(x = 4.0f, y = 20.0f)
          // L 2 20
          lineTo(x = 2.0f, y = 20.0f)
          // L 2 30
          lineTo(x = 2.0f, y = 30.0f)
          // L 12 30
          lineTo(x = 12.0f, y = 30.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 5.414 28
          lineTo(x = 5.414f, y = 28.0f)
          // L 14 19.416z
          lineTo(x = 14.0f, y = 19.416f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _maximize = it }
  }

@Suppress("ObjectPropertyName")
private var _maximize: ImageVector? = null
