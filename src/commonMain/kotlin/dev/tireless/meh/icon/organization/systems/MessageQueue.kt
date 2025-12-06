// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageQueue: ImageVector
  get() {
    val current = _messageQueue
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MessageQueue",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 28 H4 a2 2 0 0 1 -2 -2 v-5 h2 v5 h24 v-5 h2 v5 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
        }
        // <rect width="18" height="2" x="7.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 21
          moveTo(x = 7.0f, y = 21.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="7.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 16
          moveTo(x = 7.0f, y = 16.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="7.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="7.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 6
          moveTo(x = 7.0f, y = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
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
      .also { _messageQueue = it }
  }

@Suppress("ObjectPropertyName")
private var _messageQueue: ImageVector? = null
