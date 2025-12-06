// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forum: ImageVector
  get() {
    val current = _forum
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Forum",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 H8 C6.8 6 6 6.8 6 8 v14 c0 1.2 .8 2 2 2 h8 v-2 H8 V8 h20 v14 h-7.2 L16 28.8 l1.6 1.2 4.2 -6 H28 c1.2 0 2 -.8 2 -2 V8 c0 -1.2 -.8 -2 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // C 6.8 6 6 6.8 6 8
          curveTo(
            x1 = 6.8f,
            y1 = 6.0f,
            x2 = 6.0f,
            y2 = 6.8f,
            x3 = 6.0f,
            y3 = 8.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // c 0 1.2 0.8 2 2 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.2f,
            dx2 = 0.8f,
            dy2 = 2.0f,
            dx3 = 2.0f,
            dy3 = 2.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -7.2
          horizontalLineToRelative(dx = -7.2f)
          // L 16 28.8
          lineTo(x = 16.0f, y = 28.8f)
          // l 1.6 1.2
          lineToRelative(dx = 1.6f, dy = 1.2f)
          // l 4.2 -6
          lineToRelative(dx = 4.2f, dy = -6.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // c 1.2 0 2 -0.8 2 -2
          curveToRelative(
            dx1 = 1.2f,
            dy1 = 0.0f,
            dx2 = 2.0f,
            dy2 = -0.8f,
            dx3 = 2.0f,
            dy3 = -2.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // c 0 -1.2 -0.8 -2 -2 -2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.2f,
            dx2 = -0.8f,
            dy2 = -2.0f,
            dx3 = -2.0f,
            dy3 = -2.0f,
          )
        }
        // M4 18 H2 V5 c0 -1.7 1.3 -3 3 -3 h13 v2 H5 C4.4 4 4 4.4 4 5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // c 0 -1.7 1.3 -3 3 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.7f,
            dx2 = 1.3f,
            dy2 = -3.0f,
            dx3 = 3.0f,
            dy3 = -3.0f,
          )
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // C 4.4 4 4 4.4 4 5z
          curveTo(
            x1 = 4.4f,
            y1 = 4.0f,
            x2 = 4.0f,
            y2 = 4.4f,
            x3 = 4.0f,
            y3 = 5.0f,
          )
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
      .also { _forum = it }
  }

@Suppress("ObjectPropertyName")
private var _forum: ImageVector? = null
