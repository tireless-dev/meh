// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Minimize: ImageVector
  get() {
    val current = _minimize
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Minimize",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 18.0 4.0 20.0 10.586 20.0 2.0 28.582 3.414 30.0 12.0 21.414 12.0 28.0 14.0 28.0 14.0 18.0 4.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // L 4 20
          lineTo(x = 4.0f, y = 20.0f)
          // L 10.586 20
          lineTo(x = 10.586f, y = 20.0f)
          // L 2 28.582
          lineTo(x = 2.0f, y = 28.582f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 12 21.414
          lineTo(x = 12.0f, y = 21.414f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 14 28
          lineTo(x = 14.0f, y = 28.0f)
          // L 14 18
          lineTo(x = 14.0f, y = 18.0f)
          // L 4 18z
          lineTo(x = 4.0f, y = 18.0f)
          close()
        }
        // <polygon points="30.0 3.416 28.592 2.0 20.0 10.586 20.0 4.0 18.0 4.0 18.0 14.0 28.0 14.0 28.0 12.0 21.414 12.0 30.0 3.416" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.416
          moveTo(x = 30.0f, y = 3.416f)
          // L 28.592 2
          lineTo(x = 28.592f, y = 2.0f)
          // L 20 10.586
          lineTo(x = 20.0f, y = 10.586f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 18 4
          lineTo(x = 18.0f, y = 4.0f)
          // L 18 14
          lineTo(x = 18.0f, y = 14.0f)
          // L 28 14
          lineTo(x = 28.0f, y = 14.0f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 21.414 12
          lineTo(x = 21.414f, y = 12.0f)
          // L 30 3.416z
          lineTo(x = 30.0f, y = 3.416f)
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
      .also { _minimize = it }
  }

@Suppress("ObjectPropertyName")
private var _minimize: ImageVector? = null
