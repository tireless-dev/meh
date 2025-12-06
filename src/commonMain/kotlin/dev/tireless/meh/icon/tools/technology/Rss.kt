// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rss: ImageVector
  get() {
    val current = _rss
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Rss",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 18 c-3.3 0 -6 2.7 -6 6 s2.7 6 6 6 6 -2.7 6 -6 -2.7 -6 -6 -6 m0 10 c-2.2 0 -4 -1.8 -4 -4 s1.8 -4 4 -4 4 1.8 4 4 -1.8 4 -4 4 m22 -4 h-2 C28 13 19 4 8 4 V2 c12.1 0 22 9.9 22 22
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // c -3.3 0 -6 2.7 -6 6
          curveToRelative(
            dx1 = -3.3f,
            dy1 = 0.0f,
            dx2 = -6.0f,
            dy2 = 2.7f,
            dx3 = -6.0f,
            dy3 = 6.0f,
          )
          // s 2.7 6 6 6
          reflectiveCurveToRelative(
            dx1 = 2.7f,
            dy1 = 6.0f,
            dx2 = 6.0f,
            dy2 = 6.0f,
          )
          // s 6 -2.7 6 -6
          reflectiveCurveToRelative(
            dx1 = 6.0f,
            dy1 = -2.7f,
            dx2 = 6.0f,
            dy2 = -6.0f,
          )
          // s -2.7 -6 -6 -6
          reflectiveCurveToRelative(
            dx1 = -2.7f,
            dy1 = -6.0f,
            dx2 = -6.0f,
            dy2 = -6.0f,
          )
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
          // c -2.2 0 -4 -1.8 -4 -4
          curveToRelative(
            dx1 = -2.2f,
            dy1 = 0.0f,
            dx2 = -4.0f,
            dy2 = -1.8f,
            dx3 = -4.0f,
            dy3 = -4.0f,
          )
          // s 1.8 -4 4 -4
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = -4.0f,
            dx2 = 4.0f,
            dy2 = -4.0f,
          )
          // s 4 1.8 4 4
          reflectiveCurveToRelative(
            dx1 = 4.0f,
            dy1 = 1.8f,
            dx2 = 4.0f,
            dy2 = 4.0f,
          )
          // s -1.8 4 -4 4
          reflectiveCurveToRelative(
            dx1 = -1.8f,
            dy1 = 4.0f,
            dx2 = -4.0f,
            dy2 = 4.0f,
          )
          // m 22 -4
          moveToRelative(dx = 22.0f, dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // C 28 13 19 4 8 4
          curveTo(
            x1 = 28.0f,
            y1 = 13.0f,
            x2 = 19.0f,
            y2 = 4.0f,
            x3 = 8.0f,
            y3 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // c 12.1 0 22 9.9 22 22
          curveToRelative(
            dx1 = 12.1f,
            dy1 = 0.0f,
            dx2 = 22.0f,
            dy2 = 9.9f,
            dx3 = 22.0f,
            dy3 = 22.0f,
          )
        }
        // M22 24 h-2 c0 -6.6 -5.4 -12 -12 -12 v-2 c7.7 0 14 6.3 14 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 24
          moveTo(x = 22.0f, y = 24.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // c 0 -6.6 -5.4 -12 -12 -12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -6.6f,
            dx2 = -5.4f,
            dy2 = -12.0f,
            dx3 = -12.0f,
            dy3 = -12.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // c 7.7 0 14 6.3 14 14
          curveToRelative(
            dx1 = 7.7f,
            dy1 = 0.0f,
            dx2 = 14.0f,
            dy2 = 6.3f,
            dx3 = 14.0f,
            dy3 = 14.0f,
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
      .also { _rss = it }
  }

@Suppress("ObjectPropertyName")
private var _rss: ImageVector? = null
