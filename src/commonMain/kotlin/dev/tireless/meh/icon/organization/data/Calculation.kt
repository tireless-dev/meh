// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Calculation: ImageVector
  get() {
    val current = _calculation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Calculation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="14.0 8.0 10.0 8.0 10.0 4.0 8.0 4.0 8.0 8.0 4.0 8.0 4.0 10.0 8.0 10.0 8.0 14.0 10.0 14.0 10.0 10.0 14.0 10.0 14.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 8
          moveTo(x = 14.0f, y = 8.0f)
          // L 10 8
          lineTo(x = 10.0f, y = 8.0f)
          // L 10 4
          lineTo(x = 10.0f, y = 4.0f)
          // L 8 4
          lineTo(x = 8.0f, y = 4.0f)
          // L 8 8
          lineTo(x = 8.0f, y = 8.0f)
          // L 4 8
          lineTo(x = 4.0f, y = 8.0f)
          // L 4 10
          lineTo(x = 4.0f, y = 10.0f)
          // L 8 10
          lineTo(x = 8.0f, y = 10.0f)
          // L 8 14
          lineTo(x = 8.0f, y = 14.0f)
          // L 10 14
          lineTo(x = 10.0f, y = 14.0f)
          // L 10 10
          lineTo(x = 10.0f, y = 10.0f)
          // L 14 10
          lineTo(x = 14.0f, y = 10.0f)
          // L 14 8z
          lineTo(x = 14.0f, y = 8.0f)
          close()
        }
        // <rect width="10" height="2" x="4.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 19
          moveTo(x = 4.0f, y = 19.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="4.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="18.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 8
          moveTo(x = 18.0f, y = 8.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <polygon points="24.41 22.0 28.0 18.41 26.59 17.0 23.0 20.59 19.41 17.0 18.0 18.41 21.59 22.0 18.0 25.59 19.41 27.0 23.0 23.41 26.59 27.0 28.0 25.59 24.41 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.41 22
          moveTo(x = 24.41f, y = 22.0f)
          // L 28 18.41
          lineTo(x = 28.0f, y = 18.41f)
          // L 26.59 17
          lineTo(x = 26.59f, y = 17.0f)
          // L 23 20.59
          lineTo(x = 23.0f, y = 20.59f)
          // L 19.41 17
          lineTo(x = 19.41f, y = 17.0f)
          // L 18 18.41
          lineTo(x = 18.0f, y = 18.41f)
          // L 21.59 22
          lineTo(x = 21.59f, y = 22.0f)
          // L 18 25.59
          lineTo(x = 18.0f, y = 25.59f)
          // L 19.41 27
          lineTo(x = 19.41f, y = 27.0f)
          // L 23 23.41
          lineTo(x = 23.0f, y = 23.41f)
          // L 26.59 27
          lineTo(x = 26.59f, y = 27.0f)
          // L 28 25.59
          lineTo(x = 28.0f, y = 25.59f)
          // L 24.41 22z
          lineTo(x = 24.41f, y = 22.0f)
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
      .also { _calculation = it }
  }

@Suppress("ObjectPropertyName")
private var _calculation: ImageVector? = null
