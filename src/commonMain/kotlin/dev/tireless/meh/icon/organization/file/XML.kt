// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val XML: ImageVector
  get() {
    val current = _xML
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.XML",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 21.0 24.0 9.0 22.0 9.0 22.0 23.0 30.0 23.0 30.0 21.0 24.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 21
          moveTo(x = 24.0f, y = 21.0f)
          // L 24 9
          lineTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 30 21
          lineTo(x = 30.0f, y = 21.0f)
          // L 24 21z
          lineTo(x = 24.0f, y = 21.0f)
          close()
        }
        // <polygon points="18.0 9.0 16.48 14.0 16.0 15.98 15.54 14.0 14.0 9.0 12.0 9.0 12.0 23.0 14.0 23.0 14.0 15.0 13.84 13.0 14.42 15.0 16.0 19.63 17.58 15.0 18.16 13.0 18.0 15.0 18.0 23.0 20.0 23.0 20.0 9.0 18.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 9
          moveTo(x = 18.0f, y = 9.0f)
          // L 16.48 14
          lineTo(x = 16.48f, y = 14.0f)
          // L 16 15.98
          lineTo(x = 16.0f, y = 15.98f)
          // L 15.54 14
          lineTo(x = 15.54f, y = 14.0f)
          // L 14 9
          lineTo(x = 14.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 14 23
          lineTo(x = 14.0f, y = 23.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 13.84 13
          lineTo(x = 13.84f, y = 13.0f)
          // L 14.42 15
          lineTo(x = 14.42f, y = 15.0f)
          // L 16 19.63
          lineTo(x = 16.0f, y = 19.63f)
          // L 17.58 15
          lineTo(x = 17.58f, y = 15.0f)
          // L 18.16 13
          lineTo(x = 18.16f, y = 13.0f)
          // L 18 15
          lineTo(x = 18.0f, y = 15.0f)
          // L 18 23
          lineTo(x = 18.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 18 9z
          lineTo(x = 18.0f, y = 9.0f)
          close()
        }
        // <polygon points="10.0 9.0 8.0 9.0 6.0 15.0 4.0 9.0 2.0 9.0 4.75 16.0 2.0 23.0 4.0 23.0 6.0 17.0 8.0 23.0 10.0 23.0 7.25 16.0 10.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 9
          moveTo(x = 10.0f, y = 9.0f)
          // L 8 9
          lineTo(x = 8.0f, y = 9.0f)
          // L 6 15
          lineTo(x = 6.0f, y = 15.0f)
          // L 4 9
          lineTo(x = 4.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 4.75 16
          lineTo(x = 4.75f, y = 16.0f)
          // L 2 23
          lineTo(x = 2.0f, y = 23.0f)
          // L 4 23
          lineTo(x = 4.0f, y = 23.0f)
          // L 6 17
          lineTo(x = 6.0f, y = 17.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 7.25 16
          lineTo(x = 7.25f, y = 16.0f)
          // L 10 9z
          lineTo(x = 10.0f, y = 9.0f)
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
      .also { _xML = it }
  }

@Suppress("ObjectPropertyName")
private var _xML: ImageVector? = null
