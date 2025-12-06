// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolsAlt: ImageVector
  get() {
    val current = _toolsAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ToolsAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23.1 16 6.3 -6.3 c.8 -.8 .8 -2 0 -2.8 l-4.2 -4.2 c-.8 -.8 -2 -.8 -2.8 0 L16 8.9 9.7 2.6 c-.8 -.8 -2 -.8 -2.8 0 L2.6 6.8 c-.8 .8 -.8 2 0 2.8 L8.9 16 2 22.9 V30 h7.1 l6.9 -6.9 6.3 6.3 c.8 .8 2 .8 2.8 0 l4.2 -4.2 c.8 -.8 .8 -2 0 -2.8z m.7 -12 L28 8.2 l-6.3 6.3 -4.2 -4.2z M8.2 28 H4 v-4.2 l6.3 -6.3 4.2 4.2z m15.6 0 L4 8.2 8.2 4 l3.5 3.5 -2.1 2.1 L11 11 l2.1 -2.1 4.2 4.2 -2.1 2.1 1.4 1.4 2.1 -2.1 4.2 4.2 -1.9 2.2 1.4 1.4 2.1 -2.1 3.5 3.5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.1 16
          moveTo(x = 23.1f, y = 16.0f)
          // l 6.3 -6.3
          lineToRelative(dx = 6.3f, dy = -6.3f)
          // c 0.8 -0.8 0.8 -2 0 -2.8
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.8f,
            dx2 = 0.8f,
            dy2 = -2.0f,
            dx3 = 0.0f,
            dy3 = -2.8f,
          )
          // l -4.2 -4.2
          lineToRelative(dx = -4.2f, dy = -4.2f)
          // c -0.8 -0.8 -2 -0.8 -2.8 0
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -0.8f,
            dx2 = -2.0f,
            dy2 = -0.8f,
            dx3 = -2.8f,
            dy3 = 0.0f,
          )
          // L 16 8.9
          lineTo(x = 16.0f, y = 8.9f)
          // L 9.7 2.6
          lineTo(x = 9.7f, y = 2.6f)
          // c -0.8 -0.8 -2 -0.8 -2.8 0
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -0.8f,
            dx2 = -2.0f,
            dy2 = -0.8f,
            dx3 = -2.8f,
            dy3 = 0.0f,
          )
          // L 2.6 6.8
          lineTo(x = 2.6f, y = 6.8f)
          // c -0.8 0.8 -0.8 2 0 2.8
          curveToRelative(
            dx1 = -0.8f,
            dy1 = 0.8f,
            dx2 = -0.8f,
            dy2 = 2.0f,
            dx3 = 0.0f,
            dy3 = 2.8f,
          )
          // L 8.9 16
          lineTo(x = 8.9f, y = 16.0f)
          // L 2 22.9
          lineTo(x = 2.0f, y = 22.9f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 7.1
          horizontalLineToRelative(dx = 7.1f)
          // l 6.9 -6.9
          lineToRelative(dx = 6.9f, dy = -6.9f)
          // l 6.3 6.3
          lineToRelative(dx = 6.3f, dy = 6.3f)
          // c 0.8 0.8 2 0.8 2.8 0
          curveToRelative(
            dx1 = 0.8f,
            dy1 = 0.8f,
            dx2 = 2.0f,
            dy2 = 0.8f,
            dx3 = 2.8f,
            dy3 = 0.0f,
          )
          // l 4.2 -4.2
          lineToRelative(dx = 4.2f, dy = -4.2f)
          // c 0.8 -0.8 0.8 -2 0 -2.8z
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.8f,
            dx2 = 0.8f,
            dy2 = -2.0f,
            dx3 = 0.0f,
            dy3 = -2.8f,
          )
          close()
          // m 0.7 -12
          moveToRelative(dx = 0.7f, dy = -12.0f)
          // L 28 8.2
          lineTo(x = 28.0f, y = 8.2f)
          // l -6.3 6.3
          lineToRelative(dx = -6.3f, dy = 6.3f)
          // l -4.2 -4.2z
          lineToRelative(dx = -4.2f, dy = -4.2f)
          close()
          // M 8.2 28
          moveTo(x = 8.2f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4.2
          verticalLineToRelative(dy = -4.2f)
          // l 6.3 -6.3
          lineToRelative(dx = 6.3f, dy = -6.3f)
          // l 4.2 4.2z
          lineToRelative(dx = 4.2f, dy = 4.2f)
          close()
          // m 15.6 0
          moveToRelative(dx = 15.6f, dy = 0.0f)
          // L 4 8.2
          lineTo(x = 4.0f, y = 8.2f)
          // L 8.2 4
          lineTo(x = 8.2f, y = 4.0f)
          // l 3.5 3.5
          lineToRelative(dx = 3.5f, dy = 3.5f)
          // l -2.1 2.1
          lineToRelative(dx = -2.1f, dy = 2.1f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // l 2.1 -2.1
          lineToRelative(dx = 2.1f, dy = -2.1f)
          // l 4.2 4.2
          lineToRelative(dx = 4.2f, dy = 4.2f)
          // l -2.1 2.1
          lineToRelative(dx = -2.1f, dy = 2.1f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 2.1 -2.1
          lineToRelative(dx = 2.1f, dy = -2.1f)
          // l 4.2 4.2
          lineToRelative(dx = 4.2f, dy = 4.2f)
          // l -1.9 2.2
          lineToRelative(dx = -1.9f, dy = 2.2f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 2.1 -2.1
          lineToRelative(dx = 2.1f, dy = -2.1f)
          // l 3.5 3.5z
          lineToRelative(dx = 3.5f, dy = 3.5f)
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
      .also { _toolsAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _toolsAlt: ImageVector? = null
