// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pen: ImageVector
  get() {
    val current = _pen
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Pen",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.3 6.1 30 3.42 28.59 2 l-2.7 2.7 -1.09 -1.1 a1.93 1.93 0 0 0 -2.8 0 l-18 18 V28 h6.4 l18 -18 a1.93 1.93 0 0 0 0 -2.8Z M9.6 26 H6 v-3.6 L23.4 5 27 8.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.3 6.1
          moveTo(x = 27.3f, y = 6.1f)
          // L 30 3.42
          lineTo(x = 30.0f, y = 3.42f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // l -2.7 2.7
          lineToRelative(dx = -2.7f, dy = 2.7f)
          // l -1.09 -1.1
          lineToRelative(dx = -1.09f, dy = -1.1f)
          // a 1.93 1.93 0 0 0 -2.8 0
          arcToRelative(
            a = 1.93f,
            b = 1.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.8f,
            dy1 = 0.0f,
          )
          // l -18 18
          lineToRelative(dx = -18.0f, dy = 18.0f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h 6.4
          horizontalLineToRelative(dx = 6.4f)
          // l 18 -18
          lineToRelative(dx = 18.0f, dy = -18.0f)
          // a 1.93 1.93 0 0 0 0 -2.8z
          arcToRelative(
            a = 1.93f,
            b = 1.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.8f,
          )
          close()
          // M 9.6 26
          moveTo(x = 9.6f, y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -3.6
          verticalLineToRelative(dy = -3.6f)
          // L 23.4 5
          lineTo(x = 23.4f, y = 5.0f)
          // L 27 8.6z
          lineTo(x = 27.0f, y = 8.6f)
          close()
        }
        // <rect width="11" height="2" x="8.136" y="7.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.999972 11.585814
          moveTo(x = 8.999972f, y = 11.585814f)
          // l 7.7781744 -7.7781744
          lineToRelative(dx = 7.7781744f, dy = -7.7781744f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -7.7781744 7.7781744z
          lineToRelative(dx = -7.7781744f, dy = 7.7781744f)
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
      .also { _pen = it }
  }

@Suppress("ObjectPropertyName")
private var _pen: ImageVector? = null
