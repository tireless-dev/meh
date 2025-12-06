// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StackLimitation: ImageVector
  get() {
    val current = _stackLimitation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StackLimitation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="8" x="8.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 22
          moveTo(x = 8.0f, y = 22.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M24 12 h-4 v2 h4 v2 h-3 v2 h3 v2 h-4 v2 h4 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-8 8 H8 v-8 h8Z m-6 -2 h4 v-4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 12
          moveTo(x = 24.0f, y = 12.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -8 8
          moveToRelative(dx = -8.0f, dy = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="16.0 3.41 14.59 2.0 12.0 4.59 9.41 2.0 8.0 3.41 10.59 6.0 8.0 8.59 9.41 10.0 12.0 7.41 14.59 10.0 16.0 8.59 13.41 6.0 16.0 3.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 3.41
          moveTo(x = 16.0f, y = 3.41f)
          // L 14.59 2
          lineTo(x = 14.59f, y = 2.0f)
          // L 12 4.59
          lineTo(x = 12.0f, y = 4.59f)
          // L 9.41 2
          lineTo(x = 9.41f, y = 2.0f)
          // L 8 3.41
          lineTo(x = 8.0f, y = 3.41f)
          // L 10.59 6
          lineTo(x = 10.59f, y = 6.0f)
          // L 8 8.59
          lineTo(x = 8.0f, y = 8.59f)
          // L 9.41 10
          lineTo(x = 9.41f, y = 10.0f)
          // L 12 7.41
          lineTo(x = 12.0f, y = 7.41f)
          // L 14.59 10
          lineTo(x = 14.59f, y = 10.0f)
          // L 16 8.59
          lineTo(x = 16.0f, y = 8.59f)
          // L 13.41 6
          lineTo(x = 13.41f, y = 6.0f)
          // L 16 3.41z
          lineTo(x = 16.0f, y = 3.41f)
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
      .also { _stackLimitation = it }
  }

@Suppress("ObjectPropertyName")
private var _stackLimitation: ImageVector? = null
