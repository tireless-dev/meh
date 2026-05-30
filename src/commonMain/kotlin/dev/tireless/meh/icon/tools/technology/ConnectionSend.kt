// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectionSend: ImageVector
  get() {
    val current = _connectionSend
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectionSend",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="4" x="8.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 8
          moveTo(x = 8.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="8.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="14.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 8
          moveTo(x = 14.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="14.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 14
          moveTo(x = 14.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="8.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 20
          moveTo(x = 8.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="14.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 20
          moveTo(x = 14.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="18.0 14.0 26.17 14.0 23.59 16.59 25.0 18.0 30.0 13.0 25.0 8.0 23.59 9.41 26.17 12.0 18.0 12.0 18.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 14
          moveTo(x = 18.0f, y = 14.0f)
          // L 26.17 14
          lineTo(x = 26.17f, y = 14.0f)
          // L 23.59 16.59
          lineTo(x = 23.59f, y = 16.59f)
          // L 25 18
          lineTo(x = 25.0f, y = 18.0f)
          // L 30 13
          lineTo(x = 30.0f, y = 13.0f)
          // L 25 8
          lineTo(x = 25.0f, y = 8.0f)
          // L 23.59 9.41
          lineTo(x = 23.59f, y = 9.41f)
          // L 26.17 12
          lineTo(x = 26.17f, y = 12.0f)
          // L 18 12
          lineTo(x = 18.0f, y = 12.0f)
          // L 18 14z
          lineTo(x = 18.0f, y = 14.0f)
          close()
        }
        // M28 20 v8 h-6 v-8 h-2 v8 H4 V4 h16 v2 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v26 h28 V20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 20
          moveTo(x = 28.0f, y = 20.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // V 20z
          verticalLineTo(y = 20.0f)
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
      .also { _connectionSend = it }
  }

@Suppress("ObjectPropertyName")
private var _connectionSend: ImageVector? = null
