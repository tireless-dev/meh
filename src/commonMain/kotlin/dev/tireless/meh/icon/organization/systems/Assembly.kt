// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Assembly: ImageVector
  get() {
    val current = _assembly
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Assembly",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 25.4 -8 -4.7 v-9.4 l8 -4.7 8 4.7 v9.4z m-6 -5.8 6 3.5 6 -3.5 v-7.1 L16 9 l-6 3.5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 25.4
          moveTo(x = 16.0f, y = 25.4f)
          // l -8 -4.7
          lineToRelative(dx = -8.0f, dy = -4.7f)
          // v -9.4
          verticalLineToRelative(dy = -9.4f)
          // l 8 -4.7
          lineToRelative(dx = 8.0f, dy = -4.7f)
          // l 8 4.7
          lineToRelative(dx = 8.0f, dy = 4.7f)
          // v 9.4z
          verticalLineToRelative(dy = 9.4f)
          close()
          // m -6 -5.8
          moveToRelative(dx = -6.0f, dy = -5.8f)
          // l 6 3.5
          lineToRelative(dx = 6.0f, dy = 3.5f)
          // l 6 -3.5
          lineToRelative(dx = 6.0f, dy = -3.5f)
          // v -7.1
          verticalLineToRelative(dy = -7.1f)
          // L 16 9
          lineTo(x = 16.0f, y = 9.0f)
          // l -6 3.5z
          lineToRelative(dx = -6.0f, dy = 3.5f)
          close()
        }
        // M27 8.2 17 2.3 C16.7 2.1 16.4 2 16 2 s-.7 .1 -1 .3 L5 8.2 c-.6 .4 -1 1 -1 1.7 v12.2 c0 .7 .4 1.4 1 1.7 l10 5.9 c.3 .2 .7 .3 1 .3 s.7 -.1 1 -.3 l10 -5.9 c.6 -.4 1 -1 1 -1.7 V9.9 c0 -.7 -.4 -1.4 -1 -1.7 m-1 13.9 L16 28 6 22.1 V9.9 L16 4 l10 5.9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 8.2
          moveTo(x = 27.0f, y = 8.2f)
          // L 17 2.3
          lineTo(x = 17.0f, y = 2.3f)
          // C 16.7 2.1 16.4 2 16 2
          curveTo(
            x1 = 16.7f,
            y1 = 2.1f,
            x2 = 16.4f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s -0.7 0.1 -1 0.3
          reflectiveCurveToRelative(
            dx1 = -0.7f,
            dy1 = 0.1f,
            dx2 = -1.0f,
            dy2 = 0.3f,
          )
          // L 5 8.2
          lineTo(x = 5.0f, y = 8.2f)
          // c -0.6 0.4 -1 1 -1 1.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.4f,
            dx2 = -1.0f,
            dy2 = 1.0f,
            dx3 = -1.0f,
            dy3 = 1.7f,
          )
          // v 12.2
          verticalLineToRelative(dy = 12.2f)
          // c 0 0.7 0.4 1.4 1 1.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.7f,
            dx2 = 0.4f,
            dy2 = 1.4f,
            dx3 = 1.0f,
            dy3 = 1.7f,
          )
          // l 10 5.9
          lineToRelative(dx = 10.0f, dy = 5.9f)
          // c 0.3 0.2 0.7 0.3 1 0.3
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.2f,
            dx2 = 0.7f,
            dy2 = 0.3f,
            dx3 = 1.0f,
            dy3 = 0.3f,
          )
          // s 0.7 -0.1 1 -0.3
          reflectiveCurveToRelative(
            dx1 = 0.7f,
            dy1 = -0.1f,
            dx2 = 1.0f,
            dy2 = -0.3f,
          )
          // l 10 -5.9
          lineToRelative(dx = 10.0f, dy = -5.9f)
          // c 0.6 -0.4 1 -1 1 -1.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -0.4f,
            dx2 = 1.0f,
            dy2 = -1.0f,
            dx3 = 1.0f,
            dy3 = -1.7f,
          )
          // V 9.9
          verticalLineTo(y = 9.9f)
          // c 0 -0.7 -0.4 -1.4 -1 -1.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = -0.4f,
            dy2 = -1.4f,
            dx3 = -1.0f,
            dy3 = -1.7f,
          )
          // m -1 13.9
          moveToRelative(dx = -1.0f, dy = 13.9f)
          // L 16 28
          lineTo(x = 16.0f, y = 28.0f)
          // L 6 22.1
          lineTo(x = 6.0f, y = 22.1f)
          // V 9.9
          verticalLineTo(y = 9.9f)
          // L 16 4
          lineTo(x = 16.0f, y = 4.0f)
          // l 10 5.9z
          lineToRelative(dx = 10.0f, dy = 5.9f)
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
      .also { _assembly = it }
  }

@Suppress("ObjectPropertyName")
private var _assembly: ImageVector? = null
