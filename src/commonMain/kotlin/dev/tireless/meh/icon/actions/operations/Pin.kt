// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pin: ImageVector
  get() {
    val current = _pin
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Pin",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.59 13.31 30 11.9 20 2 l-1.31 1.42 1.18 1.18 -11.49 9.72 -1.72 -1.71 L5.25 14 l5.66 5.68 L2 28.58 3.41 30 l8.91 -8.91 L18 26.75 l1.39 -1.42 -1.71 -1.71 9.72 -11.49Z M16.26 22.2 9.8 15.74 21.29 6 26 10.71Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.59 13.31
          moveTo(x = 28.59f, y = 13.31f)
          // L 30 11.9
          lineTo(x = 30.0f, y = 11.9f)
          // L 20 2
          lineTo(x = 20.0f, y = 2.0f)
          // l -1.31 1.42
          lineToRelative(dx = -1.31f, dy = 1.42f)
          // l 1.18 1.18
          lineToRelative(dx = 1.18f, dy = 1.18f)
          // l -11.49 9.72
          lineToRelative(dx = -11.49f, dy = 9.72f)
          // l -1.72 -1.71
          lineToRelative(dx = -1.72f, dy = -1.71f)
          // L 5.25 14
          lineTo(x = 5.25f, y = 14.0f)
          // l 5.66 5.68
          lineToRelative(dx = 5.66f, dy = 5.68f)
          // L 2 28.58
          lineTo(x = 2.0f, y = 28.58f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 8.91 -8.91
          lineToRelative(dx = 8.91f, dy = -8.91f)
          // L 18 26.75
          lineTo(x = 18.0f, y = 26.75f)
          // l 1.39 -1.42
          lineToRelative(dx = 1.39f, dy = -1.42f)
          // l -1.71 -1.71
          lineToRelative(dx = -1.71f, dy = -1.71f)
          // l 9.72 -11.49z
          lineToRelative(dx = 9.72f, dy = -11.49f)
          close()
          // M 16.26 22.2
          moveTo(x = 16.26f, y = 22.2f)
          // L 9.8 15.74
          lineTo(x = 9.8f, y = 15.74f)
          // L 21.29 6
          lineTo(x = 21.29f, y = 6.0f)
          // L 26 10.71z
          lineTo(x = 26.0f, y = 10.71f)
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
      .also { _pin = it }
  }

@Suppress("ObjectPropertyName")
private var _pin: ImageVector? = null
