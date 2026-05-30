// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowsHorizontal: ImageVector
  get() {
    val current = _arrowsHorizontal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrowsHorizontal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="11.41 26.59 7.83 23.0 28.0 23.0 28.0 21.0 7.83 21.0 11.41 17.41 10.0 16.0 4.0 22.0 10.0 28.0 11.41 26.59" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.41 26.59
          moveTo(x = 11.41f, y = 26.59f)
          // L 7.83 23
          lineTo(x = 7.83f, y = 23.0f)
          // L 28 23
          lineTo(x = 28.0f, y = 23.0f)
          // L 28 21
          lineTo(x = 28.0f, y = 21.0f)
          // L 7.83 21
          lineTo(x = 7.83f, y = 21.0f)
          // L 11.41 17.41
          lineTo(x = 11.41f, y = 17.41f)
          // L 10 16
          lineTo(x = 10.0f, y = 16.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 11.41 26.59z
          lineTo(x = 11.41f, y = 26.59f)
          close()
        }
        // <polygon points="28.0 10.0 22.0 4.0 20.59 5.41 24.17 9.0 4.0 9.0 4.0 11.0 24.17 11.0 20.59 14.59 22.0 16.0 28.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 10
          moveTo(x = 28.0f, y = 10.0f)
          // L 22 4
          lineTo(x = 22.0f, y = 4.0f)
          // L 20.59 5.41
          lineTo(x = 20.59f, y = 5.41f)
          // L 24.17 9
          lineTo(x = 24.17f, y = 9.0f)
          // L 4 9
          lineTo(x = 4.0f, y = 9.0f)
          // L 4 11
          lineTo(x = 4.0f, y = 11.0f)
          // L 24.17 11
          lineTo(x = 24.17f, y = 11.0f)
          // L 20.59 14.59
          lineTo(x = 20.59f, y = 14.59f)
          // L 22 16
          lineTo(x = 22.0f, y = 16.0f)
          // L 28 10z
          lineTo(x = 28.0f, y = 10.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 0
          moveTo(x = 32.0f, y = 0.0f)
          // l -1.3987644E-6 32
          lineToRelative(dx = -1.3987644E-6f, dy = 32.0f)
          // l -32 -1.3987644E-6
          lineToRelative(dx = -32.0f, dy = -1.3987644E-6f)
          // l 1.3987644E-6 -32z
          lineToRelative(dx = 1.3987644E-6f, dy = -32.0f)
          close()
        }
      }.build()
      .also { _arrowsHorizontal = it }
  }

@Suppress("ObjectPropertyName")
private var _arrowsHorizontal: ImageVector? = null
