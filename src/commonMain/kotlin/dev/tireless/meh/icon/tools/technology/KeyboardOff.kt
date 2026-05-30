// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeyboardOff: ImageVector
  get() {
    val current = _keyboardOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KeyboardOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="6.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="18.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 12
          moveTo(x = 18.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="6.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 20
          moveTo(x = 6.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="6.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 16
          moveTo(x = 6.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="10.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="22.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 12
          moveTo(x = 22.0f, y = 12.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="22.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 16
          moveTo(x = 22.0f, y = 16.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M14.2 10 H28 v13 h2 V10 a2 2 0 0 0 -2 -2 H12.2z M30 28.6 3.4 2 2 3.4 6.6 8 H4 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h20.6 l4 4z M4 24 V10 h4.6 l2 2 H10 v2 h2.6 l2 2 H14 v2 h2.6 l2 2 H10 v2 h10.6 l2 2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14.2 10
          moveTo(x = 14.2f, y = 10.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 10
          verticalLineTo(y = 10.0f)
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
          // H 12.2z
          horizontalLineTo(x = 12.2f)
          close()
          // M 30 28.6
          moveTo(x = 30.0f, y = 28.6f)
          // L 3.4 2
          lineTo(x = 3.4f, y = 2.0f)
          // L 2 3.4
          lineTo(x = 2.0f, y = 3.4f)
          // L 6.6 8
          lineTo(x = 6.6f, y = 8.0f)
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 20.6
          horizontalLineToRelative(dx = 20.6f)
          // l 4 4z
          lineToRelative(dx = 4.0f, dy = 4.0f)
          close()
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 4.6
          horizontalLineToRelative(dx = 4.6f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.6
          horizontalLineToRelative(dx = 2.6f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.6
          horizontalLineToRelative(dx = 2.6f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10.6
          horizontalLineToRelative(dx = 10.6f)
          // l 2 2z
          lineToRelative(dx = 2.0f, dy = 2.0f)
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
      .also { _keyboardOff = it }
  }

@Suppress("ObjectPropertyName")
private var _keyboardOff: ImageVector? = null
