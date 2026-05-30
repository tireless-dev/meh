// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextNewLine: ImageVector
  get() {
    val current = _textNewLine
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextNewLine",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.59 14.41 24.17 18 H6 V8 H4 v10 a2 2 0 0 0 2 2 h18.17 l-3.58 3.59 L22 25 l6 -6 -6 -6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.59 14.41
          moveTo(x = 20.59f, y = 14.41f)
          // L 24.17 18
          lineTo(x = 24.17f, y = 18.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 18.17
          horizontalLineToRelative(dx = 18.17f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 22 25
          lineTo(x = 22.0f, y = 25.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6z
          lineToRelative(dx = -6.0f, dy = -6.0f)
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
      .also { _textNewLine = it }
  }

@Suppress("ObjectPropertyName")
private var _textNewLine: ImageVector? = null
