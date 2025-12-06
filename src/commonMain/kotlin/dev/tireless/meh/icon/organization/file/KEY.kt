// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KEY: ImageVector
  get() {
    val current = _kEY
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KEY",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 9.0 28.0001 9.0 26.0 16.0 24.0001 9.0 22.0 9.0 25.0 17.9996 25.0 23.0 27.0 23.0 27.0 18.0 27.0001 18.0 30.0 9.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 30 9
          moveTo(x = 30.0f, y = 9.0f)
          // L 28.0001 9
          lineTo(x = 28.0001f, y = 9.0f)
          // L 26 16
          lineTo(x = 26.0f, y = 16.0f)
          // L 24.0001 9
          lineTo(x = 24.0001f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 25 17.9996
          lineTo(x = 25.0f, y = 17.9996f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 27 23
          lineTo(x = 27.0f, y = 23.0f)
          // L 27 18
          lineTo(x = 27.0f, y = 18.0f)
          // L 27.0001 18
          lineTo(x = 27.0001f, y = 18.0f)
          // L 30 9z
          lineTo(x = 30.0f, y = 9.0f)
          close()
        }
        // <polygon points="21.0 11.0 21.0 9.0 13.0 9.0 13.0 23.0 21.0 23.0 21.0 21.0 15.0 21.0 15.0 17.0 20.0 17.0 20.0 15.0 15.0 15.0 15.0 11.0 21.0 11.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 21 11
          moveTo(x = 21.0f, y = 11.0f)
          // L 21 9
          lineTo(x = 21.0f, y = 9.0f)
          // L 13 9
          lineTo(x = 13.0f, y = 9.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 21 23
          lineTo(x = 21.0f, y = 23.0f)
          // L 21 21
          lineTo(x = 21.0f, y = 21.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // L 20 17
          lineTo(x = 20.0f, y = 17.0f)
          // L 20 15
          lineTo(x = 20.0f, y = 15.0f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 21 11z
          lineTo(x = 21.0f, y = 11.0f)
          close()
        }
        // <polygon points="11.0 9.0 8.8941 9.0 5.0 15.5527 5.0 9.0 3.0 9.0 3.0 23.0 5.0 23.0 5.0 18.7062 5.9277 17.2208 8.8941 23.0 11.0 23.0 7.1093 15.4308 11.0 9.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 11 9
          moveTo(x = 11.0f, y = 9.0f)
          // L 8.8941 9
          lineTo(x = 8.8941f, y = 9.0f)
          // L 5 15.5527
          lineTo(x = 5.0f, y = 15.5527f)
          // L 5 9
          lineTo(x = 5.0f, y = 9.0f)
          // L 3 9
          lineTo(x = 3.0f, y = 9.0f)
          // L 3 23
          lineTo(x = 3.0f, y = 23.0f)
          // L 5 23
          lineTo(x = 5.0f, y = 23.0f)
          // L 5 18.7062
          lineTo(x = 5.0f, y = 18.7062f)
          // L 5.9277 17.2208
          lineTo(x = 5.9277f, y = 17.2208f)
          // L 8.8941 23
          lineTo(x = 8.8941f, y = 23.0f)
          // L 11 23
          lineTo(x = 11.0f, y = 23.0f)
          // L 7.1093 15.4308
          lineTo(x = 7.1093f, y = 15.4308f)
          // L 11 9z
          lineTo(x = 11.0f, y = 9.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _kEY = it }
  }

@Suppress("ObjectPropertyName")
private var _kEY: ImageVector? = null
