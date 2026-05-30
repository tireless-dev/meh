// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextWrap: ImageVector
  get() {
    val current = _textWrap
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextWrap",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="4.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 23
          moveTo(x = 4.0f, y = 23.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M24.52 14 H4 v2 h20.5 a3.5 3.5 0 0 1 0 7 h-5.67 l2.58 -2.59 L20 19 l-5 5 5 5 1.41 -1.41 L18.83 25 h5.7 a5.5 5.5 0 0 0 0 -11
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.52 14
          moveTo(x = 24.52f, y = 14.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 20.5
          horizontalLineToRelative(dx = 20.5f)
          // a 3.5 3.5 0 0 1 0 7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 7.0f,
          )
          // h -5.67
          horizontalLineToRelative(dx = -5.67f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 20 19
          lineTo(x = 20.0f, y = 19.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 18.83 25
          lineTo(x = 18.83f, y = 25.0f)
          // h 5.7
          horizontalLineToRelative(dx = 5.7f)
          // a 5.5 5.5 0 0 0 0 -11
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -11.0f,
          )
        }
        // <rect width="24" height="2" x="4.0" y="5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 5
          moveTo(x = 4.0f, y = 5.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -24z
          horizontalLineToRelative(dx = -24.0f)
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
      .also { _textWrap = it }
  }

@Suppress("ObjectPropertyName")
private var _textWrap: ImageVector? = null
