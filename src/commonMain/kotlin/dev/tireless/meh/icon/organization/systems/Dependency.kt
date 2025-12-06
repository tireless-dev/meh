// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dependency: ImageVector
  get() {
    val current = _dependency
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Dependency",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 16.4 13.4 20 12 18.57 l3.6 -3.6 M10.57 20 7 23.58 8.4 25 l3.6 -3.6 M5.58 25 2 28.58 3.4 30 7 26.4 M20.6 9.98 l-3.6 3.6 L18.4 15 l3.62 -3.6 M14 2 v2 h12.57 L22 8.59 23.4 10 28 5.42 V18 h2 L29.99 2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 16.4
          moveTo(x = 17.0f, y = 16.4f)
          // L 13.4 20
          lineTo(x = 13.4f, y = 20.0f)
          // L 12 18.57
          lineTo(x = 12.0f, y = 18.57f)
          // l 3.6 -3.6
          lineToRelative(dx = 3.6f, dy = -3.6f)
          // M 10.57 20
          moveTo(x = 10.57f, y = 20.0f)
          // L 7 23.58
          lineTo(x = 7.0f, y = 23.58f)
          // L 8.4 25
          lineTo(x = 8.4f, y = 25.0f)
          // l 3.6 -3.6
          lineToRelative(dx = 3.6f, dy = -3.6f)
          // M 5.58 25
          moveTo(x = 5.58f, y = 25.0f)
          // L 2 28.58
          lineTo(x = 2.0f, y = 28.58f)
          // L 3.4 30
          lineTo(x = 3.4f, y = 30.0f)
          // L 7 26.4
          lineTo(x = 7.0f, y = 26.4f)
          // M 20.6 9.98
          moveTo(x = 20.6f, y = 9.98f)
          // l -3.6 3.6
          lineToRelative(dx = -3.6f, dy = 3.6f)
          // L 18.4 15
          lineTo(x = 18.4f, y = 15.0f)
          // l 3.62 -3.6
          lineToRelative(dx = 3.62f, dy = -3.6f)
          // M 14 2
          moveTo(x = 14.0f, y = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 12.57
          horizontalLineToRelative(dx = 12.57f)
          // L 22 8.59
          lineTo(x = 22.0f, y = 8.59f)
          // L 23.4 10
          lineTo(x = 23.4f, y = 10.0f)
          // L 28 5.42
          lineTo(x = 28.0f, y = 5.42f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 29.99 2z
          lineTo(x = 29.99f, y = 2.0f)
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
      .also { _dependency = it }
  }

@Suppress("ObjectPropertyName")
private var _dependency: ImageVector? = null
