// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UpdateComplete: ImageVector
  get() {
    val current = _updateComplete
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UpdateComplete",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 C8.28 30 2 23.72 2 16 h2 c0 6.62 5.38 12 12 12z M12 8 H7.08 C9.34 5.48 12.55 4 16 4 c6.62 0 12 5.38 12 12 h2 c0 -7.72 -6.28 -14 -14 -14 -3.83 0 -7.4 1.56 -10 4.23 V2 H4 v8 h8z m10 19.18 -2.59 -2.59 L18 26 l4 4 8 -8 -1.41 -1.41z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // C 8.28 30 2 23.72 2 16
          curveTo(
            x1 = 8.28f,
            y1 = 30.0f,
            x2 = 2.0f,
            y2 = 23.72f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 6.62 5.38 12 12 12z
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 6.62f,
            dx2 = 5.38f,
            dy2 = 12.0f,
            dx3 = 12.0f,
            dy3 = 12.0f,
          )
          close()
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // H 7.08
          horizontalLineTo(x = 7.08f)
          // C 9.34 5.48 12.55 4 16 4
          curveTo(
            x1 = 9.34f,
            y1 = 5.48f,
            x2 = 12.55f,
            y2 = 4.0f,
            x3 = 16.0f,
            y3 = 4.0f,
          )
          // c 6.62 0 12 5.38 12 12
          curveToRelative(
            dx1 = 6.62f,
            dy1 = 0.0f,
            dx2 = 12.0f,
            dy2 = 5.38f,
            dx3 = 12.0f,
            dy3 = 12.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -7.72 -6.28 -14 -14 -14
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -7.72f,
            dx2 = -6.28f,
            dy2 = -14.0f,
            dx3 = -14.0f,
            dy3 = -14.0f,
          )
          // c -3.83 0 -7.4 1.56 -10 4.23
          curveToRelative(
            dx1 = -3.83f,
            dy1 = 0.0f,
            dx2 = -7.4f,
            dy2 = 1.56f,
            dx3 = -10.0f,
            dy3 = 4.23f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 10 19.18
          moveToRelative(dx = 10.0f, dy = 19.18f)
          // l -2.59 -2.59
          lineToRelative(dx = -2.59f, dy = -2.59f)
          // L 18 26
          lineTo(x = 18.0f, y = 26.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // l -1.41 -1.41z
          lineToRelative(dx = -1.41f, dy = -1.41f)
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
      .also { _updateComplete = it }
  }

@Suppress("ObjectPropertyName")
private var _updateComplete: ImageVector? = null
