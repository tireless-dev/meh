// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoDiscord: ImageVector
  get() {
    val current = _logoDiscord
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoDiscord",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.7 7.1 Q23 5.9 20 5.3 h-.1 c-.2 .4 -.5 1 -.7 1.5 -2.2 -.3 -4.3 -.3 -6.4 0 -.2 -.5 -.5 -1 -.7 -1.5 H12 Q9 5.75 6.3 7.1 A23.6 23.6 0 0 0 2.2 23 v.1 c2.4 1.8 4.7 2.8 7 3.5 h.1 c.5 -.7 1 -1.5 1.4 -2.3 v-.1 c-.8 -.3 -1.5 -.6 -2.2 -1 -.1 0 -.1 -.1 0 -.1 .1 -.1 .3 -.2 .4 -.3 H9 c4.6 2.1 9.5 2.1 14.1 0 h.1 c.1 .1 .3 .2 .4 .3 .1 0 0 .1 0 .1 a9 9 0 0 1 -2.2 1 s-.1 .1 0 .1 c.4 .8 .9 1.6 1.4 2.3 h.1 c2.3 -.7 4.6 -1.8 7 -3.5 V23 c.6 -6 -1 -11.2 -4.2 -15.9 M11.4 19.9 c-1.4 0 -2.5 -1.3 -2.5 -2.8 s1.1 -2.8 2.5 -2.8 2.5 1.3 2.5 2.8 -1.1 2.8 -2.5 2.8 m9.3 0 c-1.4 0 -2.5 -1.3 -2.5 -2.8 s1.1 -2.8 2.5 -2.8 2.5 1.3 2.5 2.8 -1.1 2.8 -2.5 2.8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.7 7.1
          moveTo(x = 25.7f, y = 7.1f)
          // Q 23 5.9 20 5.3
          quadTo(
            x1 = 23.0f,
            y1 = 5.9f,
            x2 = 20.0f,
            y2 = 5.3f,
          )
          // h -0.1
          horizontalLineToRelative(dx = -0.1f)
          // c -0.2 0.4 -0.5 1 -0.7 1.5
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.4f,
            dx2 = -0.5f,
            dy2 = 1.0f,
            dx3 = -0.7f,
            dy3 = 1.5f,
          )
          // c -2.2 -0.3 -4.3 -0.3 -6.4 0
          curveToRelative(
            dx1 = -2.2f,
            dy1 = -0.3f,
            dx2 = -4.3f,
            dy2 = -0.3f,
            dx3 = -6.4f,
            dy3 = 0.0f,
          )
          // c -0.2 -0.5 -0.5 -1 -0.7 -1.5
          curveToRelative(
            dx1 = -0.2f,
            dy1 = -0.5f,
            dx2 = -0.5f,
            dy2 = -1.0f,
            dx3 = -0.7f,
            dy3 = -1.5f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // Q 9 5.75 6.3 7.1
          quadTo(
            x1 = 9.0f,
            y1 = 5.75f,
            x2 = 6.3f,
            y2 = 7.1f,
          )
          // A 23.6 23.6 0 0 0 2.2 23
          arcTo(
            horizontalEllipseRadius = 23.6f,
            verticalEllipseRadius = 23.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.2f,
            y1 = 23.0f,
          )
          // v 0.1
          verticalLineToRelative(dy = 0.1f)
          // c 2.4 1.8 4.7 2.8 7 3.5
          curveToRelative(
            dx1 = 2.4f,
            dy1 = 1.8f,
            dx2 = 4.7f,
            dy2 = 2.8f,
            dx3 = 7.0f,
            dy3 = 3.5f,
          )
          // h 0.1
          horizontalLineToRelative(dx = 0.1f)
          // c 0.5 -0.7 1 -1.5 1.4 -2.3
          curveToRelative(
            dx1 = 0.5f,
            dy1 = -0.7f,
            dx2 = 1.0f,
            dy2 = -1.5f,
            dx3 = 1.4f,
            dy3 = -2.3f,
          )
          // v -0.1
          verticalLineToRelative(dy = -0.1f)
          // c -0.8 -0.3 -1.5 -0.6 -2.2 -1
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -0.3f,
            dx2 = -1.5f,
            dy2 = -0.6f,
            dx3 = -2.2f,
            dy3 = -1.0f,
          )
          // c -0.1 0 -0.1 -0.1 0 -0.1
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.0f,
            dx2 = -0.1f,
            dy2 = -0.1f,
            dx3 = 0.0f,
            dy3 = -0.1f,
          )
          // c 0.1 -0.1 0.3 -0.2 0.4 -0.3
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -0.1f,
            dx2 = 0.3f,
            dy2 = -0.2f,
            dx3 = 0.4f,
            dy3 = -0.3f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // c 4.6 2.1 9.5 2.1 14.1 0
          curveToRelative(
            dx1 = 4.6f,
            dy1 = 2.1f,
            dx2 = 9.5f,
            dy2 = 2.1f,
            dx3 = 14.1f,
            dy3 = 0.0f,
          )
          // h 0.1
          horizontalLineToRelative(dx = 0.1f)
          // c 0.1 0.1 0.3 0.2 0.4 0.3
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.1f,
            dx2 = 0.3f,
            dy2 = 0.2f,
            dx3 = 0.4f,
            dy3 = 0.3f,
          )
          // c 0.1 0 0 0.1 0 0.1
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.0f,
            dy2 = 0.1f,
            dx3 = 0.0f,
            dy3 = 0.1f,
          )
          // a 9 9 0 0 1 -2.2 1
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.2f,
            dy1 = 1.0f,
          )
          // s -0.1 0.1 0 0.1
          reflectiveCurveToRelative(
            dx1 = -0.1f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.1f,
          )
          // c 0.4 0.8 0.9 1.6 1.4 2.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 0.8f,
            dx2 = 0.9f,
            dy2 = 1.6f,
            dx3 = 1.4f,
            dy3 = 2.3f,
          )
          // h 0.1
          horizontalLineToRelative(dx = 0.1f)
          // c 2.3 -0.7 4.6 -1.8 7 -3.5
          curveToRelative(
            dx1 = 2.3f,
            dy1 = -0.7f,
            dx2 = 4.6f,
            dy2 = -1.8f,
            dx3 = 7.0f,
            dy3 = -3.5f,
          )
          // V 23
          verticalLineTo(y = 23.0f)
          // c 0.6 -6 -1 -11.2 -4.2 -15.9
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -6.0f,
            dx2 = -1.0f,
            dy2 = -11.2f,
            dx3 = -4.2f,
            dy3 = -15.9f,
          )
          // M 11.4 19.9
          moveTo(x = 11.4f, y = 19.9f)
          // c -1.4 0 -2.5 -1.3 -2.5 -2.8
          curveToRelative(
            dx1 = -1.4f,
            dy1 = 0.0f,
            dx2 = -2.5f,
            dy2 = -1.3f,
            dx3 = -2.5f,
            dy3 = -2.8f,
          )
          // s 1.1 -2.8 2.5 -2.8
          reflectiveCurveToRelative(
            dx1 = 1.1f,
            dy1 = -2.8f,
            dx2 = 2.5f,
            dy2 = -2.8f,
          )
          // s 2.5 1.3 2.5 2.8
          reflectiveCurveToRelative(
            dx1 = 2.5f,
            dy1 = 1.3f,
            dx2 = 2.5f,
            dy2 = 2.8f,
          )
          // s -1.1 2.8 -2.5 2.8
          reflectiveCurveToRelative(
            dx1 = -1.1f,
            dy1 = 2.8f,
            dx2 = -2.5f,
            dy2 = 2.8f,
          )
          // m 9.3 0
          moveToRelative(dx = 9.3f, dy = 0.0f)
          // c -1.4 0 -2.5 -1.3 -2.5 -2.8
          curveToRelative(
            dx1 = -1.4f,
            dy1 = 0.0f,
            dx2 = -2.5f,
            dy2 = -1.3f,
            dx3 = -2.5f,
            dy3 = -2.8f,
          )
          // s 1.1 -2.8 2.5 -2.8
          reflectiveCurveToRelative(
            dx1 = 1.1f,
            dy1 = -2.8f,
            dx2 = 2.5f,
            dy2 = -2.8f,
          )
          // s 2.5 1.3 2.5 2.8
          reflectiveCurveToRelative(
            dx1 = 2.5f,
            dy1 = 1.3f,
            dx2 = 2.5f,
            dy2 = 2.8f,
          )
          // s -1.1 2.8 -2.5 2.8
          reflectiveCurveToRelative(
            dx1 = -1.1f,
            dy1 = 2.8f,
          dx2 = -2.5f,
          dy2 = 2.8f,
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
      .also { _logoDiscord = it }
  }

@Suppress("ObjectPropertyName")
private var _logoDiscord: ImageVector? = null
