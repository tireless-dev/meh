// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContinuousIntegration: ImageVector
  get() {
    val current = _continuousIntegration
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContinuousIntegration",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m31.9 15.5 -5.7 -10 C25.9 5.2 25.6 5 25.3 5 H6.7 C6.4 5 6.1 5.2 5.9 5.5 l-5.7 10 C0 15.7 0 15.8 0 16 s0 .3 .1 .5 l5.7 10 C6.1 26.8 6.4 27 6.7 27 h18.5 c.4 0 .7 -.2 .9 -.5 l5.7 -10 C32 16.3 32 16.2 32 16 s0 -.3 -.1 -.5 M17.8 15 h-8 l4 -7z m-2.3 -8 h8 l-4 7z m2.3 10 -4 7 -4 -7z m1.7 1 4 7 h-8z m1.7 -1 h8 l-4 7z m0 -2 4 -7 4 7z M7.3 7 H12 l-4.6 8 H2.7z m0 18 -4.6 -8 h4.7 l4.6 8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.9 15.5
          moveTo(x = 31.9f, y = 15.5f)
          // l -5.7 -10
          lineToRelative(dx = -5.7f, dy = -10.0f)
          // C 25.9 5.2 25.6 5 25.3 5
          curveTo(
            x1 = 25.9f,
            y1 = 5.2f,
            x2 = 25.6f,
            y2 = 5.0f,
            x3 = 25.3f,
            y3 = 5.0f,
          )
          // H 6.7
          horizontalLineTo(x = 6.7f)
          // C 6.4 5 6.1 5.2 5.9 5.5
          curveTo(
            x1 = 6.4f,
            y1 = 5.0f,
            x2 = 6.1f,
            y2 = 5.2f,
            x3 = 5.9f,
            y3 = 5.5f,
          )
          // l -5.7 10
          lineToRelative(dx = -5.7f, dy = 10.0f)
          // C 0 15.7 0 15.8 0 16
          curveTo(
            x1 = 0.0f,
            y1 = 15.7f,
            x2 = 0.0f,
            y2 = 15.8f,
            x3 = 0.0f,
            y3 = 16.0f,
          )
          // s 0 0.3 0.1 0.5
          reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = 0.3f,
            dx2 = 0.1f,
            dy2 = 0.5f,
          )
          // l 5.7 10
          lineToRelative(dx = 5.7f, dy = 10.0f)
          // C 6.1 26.8 6.4 27 6.7 27
          curveTo(
            x1 = 6.1f,
            y1 = 26.8f,
            x2 = 6.4f,
            y2 = 27.0f,
            x3 = 6.7f,
            y3 = 27.0f,
          )
          // h 18.5
          horizontalLineToRelative(dx = 18.5f)
          // c 0.4 0 0.7 -0.2 0.9 -0.5
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 0.0f,
            dx2 = 0.7f,
            dy2 = -0.2f,
            dx3 = 0.9f,
            dy3 = -0.5f,
          )
          // l 5.7 -10
          lineToRelative(dx = 5.7f, dy = -10.0f)
          // C 32 16.3 32 16.2 32 16
          curveTo(
            x1 = 32.0f,
            y1 = 16.3f,
            x2 = 32.0f,
            y2 = 16.2f,
            x3 = 32.0f,
            y3 = 16.0f,
          )
          // s 0 -0.3 -0.1 -0.5
          reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
          )
          // M 17.8 15
          moveTo(x = 17.8f, y = 15.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // l 4 -7z
          lineToRelative(dx = 4.0f, dy = -7.0f)
          close()
          // m -2.3 -8
          moveToRelative(dx = -2.3f, dy = -8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // l -4 7z
          lineToRelative(dx = -4.0f, dy = 7.0f)
          close()
          // m 2.3 10
          moveToRelative(dx = 2.3f, dy = 10.0f)
          // l -4 7
          lineToRelative(dx = -4.0f, dy = 7.0f)
          // l -4 -7z
          lineToRelative(dx = -4.0f, dy = -7.0f)
          close()
          // m 1.7 1
          moveToRelative(dx = 1.7f, dy = 1.0f)
          // l 4 7
          lineToRelative(dx = 4.0f, dy = 7.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 1.7 -1
          moveToRelative(dx = 1.7f, dy = -1.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // l -4 7z
          lineToRelative(dx = -4.0f, dy = 7.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // l 4 -7
          lineToRelative(dx = 4.0f, dy = -7.0f)
          // l 4 7z
          lineToRelative(dx = 4.0f, dy = 7.0f)
          close()
          // M 7.3 7
          moveTo(x = 7.3f, y = 7.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // l -4.6 8
          lineToRelative(dx = -4.6f, dy = 8.0f)
          // H 2.7z
          horizontalLineTo(x = 2.7f)
          close()
          // m 0 18
          moveToRelative(dx = 0.0f, dy = 18.0f)
          // l -4.6 -8
          lineToRelative(dx = -4.6f, dy = -8.0f)
          // h 4.7
          horizontalLineToRelative(dx = 4.7f)
          // l 4.6 8z
          lineToRelative(dx = 4.6f, dy = 8.0f)
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
      .also { _continuousIntegration = it }
  }

@Suppress("ObjectPropertyName")
private var _continuousIntegration: ImageVector? = null
