// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarFilled: ImageVector
  get() {
    val current = _starFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StarFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 2 -4.55 9.22 -10.17 1.47 7.36 7.18 L6.9 30 l9.1 -4.78 L25.1 30 l-1.74 -10.13 7.36 -7.17 -10.17 -1.48Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // l -4.55 9.22
          lineToRelative(dx = -4.55f, dy = 9.22f)
          // l -10.17 1.47
          lineToRelative(dx = -10.17f, dy = 1.47f)
          // l 7.36 7.18
          lineToRelative(dx = 7.36f, dy = 7.18f)
          // L 6.9 30
          lineTo(x = 6.9f, y = 30.0f)
          // l 9.1 -4.78
          lineToRelative(dx = 9.1f, dy = -4.78f)
          // L 25.1 30
          lineTo(x = 25.1f, y = 30.0f)
          // l -1.74 -10.13
          lineToRelative(dx = -1.74f, dy = -10.13f)
          // l 7.36 -7.17
          lineToRelative(dx = 7.36f, dy = -7.17f)
          // l -10.17 -1.48z
          lineToRelative(dx = -10.17f, dy = -1.48f)
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
      .also { _starFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _starFilled: ImageVector? = null
