// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinLeftOuter: ImageVector
  get() {
    val current = _joinLeftOuter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinLeftOuter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28 16 -5 5 -1.4 -1.4 2.6 -2.6 H14 c-1.2 .2 -2.3 .7 -3.4 1.3 l-1 -1.7 c.4 -.3 .8 -.5 1.3 -.7 C6.8 14.1 4 10.3 4 5.8 V4 h2 v1.8 c0 5.1 4.5 9.2 10 9.2 h8.2 l-2.6 -2.6 L23 11z M4 27 v1 h2 v-1 c0 -1 0 -1.9 .3 -2.9 l-1.9 -.6 c-.3 1.1 -.5 2.3 -.5 3.4Z m1.3 -5.5 L7 22.4 c.6 -1.1 1.3 -2.1 2.2 -3 l-1.3 -1.5 c-1.1 1 -2 2.2 -2.6 3.6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l 2.6 -2.6
          lineToRelative(dx = 2.6f, dy = -2.6f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // c -1.2 0.2 -2.3 0.7 -3.4 1.3
          curveToRelative(
            dx1 = -1.2f,
            dy1 = 0.2f,
            dx2 = -2.3f,
            dy2 = 0.7f,
            dx3 = -3.4f,
            dy3 = 1.3f,
          )
          // l -1 -1.7
          lineToRelative(dx = -1.0f, dy = -1.7f)
          // c 0.4 -0.3 0.8 -0.5 1.3 -0.7
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.3f,
            dx2 = 0.8f,
            dy2 = -0.5f,
            dx3 = 1.3f,
            dy3 = -0.7f,
          )
          // C 6.8 14.1 4 10.3 4 5.8
          curveTo(
            x1 = 6.8f,
            y1 = 14.1f,
            x2 = 4.0f,
            y2 = 10.3f,
            x3 = 4.0f,
            y3 = 5.8f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 1.8
          verticalLineToRelative(dy = 1.8f)
          // c 0 5.1 4.5 9.2 10 9.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.1f,
            dx2 = 4.5f,
            dy2 = 9.2f,
            dx3 = 10.0f,
            dy3 = 9.2f,
          )
          // h 8.2
          horizontalLineToRelative(dx = 8.2f)
          // l -2.6 -2.6
          lineToRelative(dx = -2.6f, dy = -2.6f)
          // L 23 11z
          lineTo(x = 23.0f, y = 11.0f)
          close()
          // M 4 27
          moveTo(x = 4.0f, y = 27.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // c 0 -1 0 -1.9 0.3 -2.9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.0f,
            dx2 = 0.0f,
            dy2 = -1.9f,
            dx3 = 0.3f,
            dy3 = -2.9f,
          )
          // l -1.9 -0.6
          lineToRelative(dx = -1.9f, dy = -0.6f)
          // c -0.3 1.1 -0.5 2.3 -0.5 3.4z
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 1.1f,
            dx2 = -0.5f,
            dy2 = 2.3f,
            dx3 = -0.5f,
            dy3 = 3.4f,
          )
          close()
          // m 1.3 -5.5
          moveToRelative(dx = 1.3f, dy = -5.5f)
          // L 7 22.4
          lineTo(x = 7.0f, y = 22.4f)
          // c 0.6 -1.1 1.3 -2.1 2.2 -3
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -1.1f,
            dx2 = 1.3f,
            dy2 = -2.1f,
            dx3 = 2.2f,
            dy3 = -3.0f,
          )
          // l -1.3 -1.5
          lineToRelative(dx = -1.3f, dy = -1.5f)
          // c -1.1 1 -2 2.2 -2.6 3.6
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 1.0f,
            dx2 = -2.0f,
            dy2 = 2.2f,
            dx3 = -2.6f,
            dy3 = 3.6f,
          )
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
      .also { _joinLeftOuter = it }
  }

@Suppress("ObjectPropertyName")
private var _joinLeftOuter: ImageVector? = null
