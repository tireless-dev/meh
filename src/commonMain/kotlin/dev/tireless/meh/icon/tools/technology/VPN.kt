// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VPN: ImageVector
  get() {
    val current = _vPN
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VPN",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 23 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 23
          moveTo(x = 14.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="28.0 19.0 24.32 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 13.0 27.68 23.0 30.0 23.0 30.0 9.0 28.0 9.0 28.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 19
          moveTo(x = 28.0f, y = 19.0f)
          // L 24.32 9
          lineTo(x = 24.32f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 13
          lineTo(x = 24.0f, y = 13.0f)
          // L 27.68 23
          lineTo(x = 27.68f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 28 9
          lineTo(x = 28.0f, y = 9.0f)
          // L 28 19z
          lineTo(x = 28.0f, y = 19.0f)
          close()
        }
        // <polygon points="8.0 9.0 6.0 22.0 4.0 9.0 2.0 9.0 4.52 23.0 7.48 23.0 10.0 9.0 8.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // L 6 22
          lineTo(x = 6.0f, y = 22.0f)
          // L 4 9
          lineTo(x = 4.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 4.52 23
          lineTo(x = 4.52f, y = 23.0f)
          // L 7.48 23
          lineTo(x = 7.48f, y = 23.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 8 9z
          lineTo(x = 8.0f, y = 9.0f)
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
      .also { _vPN = it }
  }

@Suppress("ObjectPropertyName")
private var _vPN: ImageVector? = null
