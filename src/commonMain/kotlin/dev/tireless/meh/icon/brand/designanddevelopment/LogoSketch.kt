// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoSketch: ImageVector
  get() {
    val current = _logoSketch
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoSketch",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16.1 3.2 7.7 .9 c.2 0 .3 .1 .4 .2 l5.7 7.7 c.2 .2 .2 .5 0 .7 l-13.6 16 a.3 .3 0 0 1 -.4 0 l-13.6 -16 A.53 .53 0 0 1 2.1 12 l5.7 -7.7 C7.9 4.2 8 4.1 8.2 4.1 l7.7 -.9z m1.6 1.6 h-.2 s-.1 .1 0 .2 l4.3 5.4 c0 .1 .1 .1 .1 .2 q0 .3 -.3 .3 H10.4 c-.1 0 -.1 0 -.2 -.1 s-.1 -.3 -.1 -.4 L14.5 5 V4.8 h-.2 l-5.9 5.9 s-.1 .1 -.2 .1 S8 10.7 8 10.6 l.2 -4.3 c0 -.1 0 -.1 -.1 -.1 S8 6.2 8 6.3 l-1.1 4.9 c0 .2 -.2 .3 -.3 .3 l-2.8 .6 c-.1 0 -.1 .1 -.1 .1 0 .1 0 .1 .1 .1 h2.7 c.2 0 .3 .1 .4 .2 l6.6 11.8 c0 .1 .1 .1 .2 .1 s.1 -.1 .1 -.2 L8.6 12.9 v-.1 c0 -.2 .1 -.3 .3 -.4 h14.4 c.2 .1 .2 .3 .2 .4 l-5.3 11.3 c0 .1 0 .2 .1 .2 s.2 0 .2 -.1 L25 12.6 c.1 -.1 .2 -.2 .4 -.2 h2.7 c.1 0 .1 0 .1 -.1 s0 -.1 -.1 -.1 l-2.8 -.6 c-.2 0 -.3 -.2 -.4 -.3 l-.9 -5 c0 -.1 -.1 -.1 -.1 -.1 -.1 0 -.1 0 -.1 .1 l.2 4.3 c0 .1 0 .1 -.1 .2 q-.15 .15 -.3 0z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.1 3.2
          moveTo(x = 16.1f, y = 3.2f)
          // l 7.7 0.9
          lineToRelative(dx = 7.7f, dy = 0.9f)
          // c 0.2 0 0.3 0.1 0.4 0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.0f,
            dx2 = 0.3f,
            dy2 = 0.1f,
            dx3 = 0.4f,
            dy3 = 0.2f,
          )
          // l 5.7 7.7
          lineToRelative(dx = 5.7f, dy = 7.7f)
          // c 0.2 0.2 0.2 0.5 0 0.7
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.2f,
            dx2 = 0.2f,
            dy2 = 0.5f,
            dx3 = 0.0f,
            dy3 = 0.7f,
          )
          // l -13.6 16
          lineToRelative(dx = -13.6f, dy = 16.0f)
          // a 0.3 0.3 0 0 1 -0.4 0
          arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.4f,
            dy1 = 0.0f,
          )
          // l -13.6 -16
          lineToRelative(dx = -13.6f, dy = -16.0f)
          // A 0.53 0.53 0 0 1 2.1 12
          arcTo(
            horizontalEllipseRadius = 0.53f,
            verticalEllipseRadius = 0.53f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.1f,
            y1 = 12.0f,
          )
          // l 5.7 -7.7
          lineToRelative(dx = 5.7f, dy = -7.7f)
          // C 7.9 4.2 8 4.1 8.2 4.1
          curveTo(
            x1 = 7.9f,
            y1 = 4.2f,
            x2 = 8.0f,
            y2 = 4.1f,
            x3 = 8.2f,
            y3 = 4.1f,
          )
          // l 7.7 -0.9z
          lineToRelative(dx = 7.7f, dy = -0.9f)
          close()
          // m 1.6 1.6
          moveToRelative(dx = 1.6f, dy = 1.6f)
          // h -0.2
          horizontalLineToRelative(dx = -0.2f)
          // s -0.1 0.1 0 0.2
          reflectiveCurveToRelative(
            dx1 = -0.1f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.2f,
          )
          // l 4.3 5.4
          lineToRelative(dx = 4.3f, dy = 5.4f)
          // c 0 0.1 0.1 0.1 0.1 0.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.1f,
            dy2 = 0.1f,
            dx3 = 0.1f,
            dy3 = 0.2f,
          )
          // q 0 0.3 -0.3 0.3
          quadToRelative(
            dx1 = 0.0f,
            dy1 = 0.3f,
            dx2 = -0.3f,
            dy2 = 0.3f,
          )
          // H 10.4
          horizontalLineTo(x = 10.4f)
          // c -0.1 0 -0.1 0 -0.2 -0.1
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.0f,
            dx2 = -0.1f,
            dy2 = 0.0f,
            dx3 = -0.2f,
            dy3 = -0.1f,
          )
          // s -0.1 -0.3 -0.1 -0.4
          reflectiveCurveToRelative(
            dx1 = -0.1f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.4f,
          )
          // L 14.5 5
          lineTo(x = 14.5f, y = 5.0f)
          // V 4.8
          verticalLineTo(y = 4.8f)
          // h -0.2
          horizontalLineToRelative(dx = -0.2f)
          // l -5.9 5.9
          lineToRelative(dx = -5.9f, dy = 5.9f)
          // s -0.1 0.1 -0.2 0.1
          reflectiveCurveToRelative(
            dx1 = -0.1f,
            dy1 = 0.1f,
            dx2 = -0.2f,
            dy2 = 0.1f,
          )
          // S 8 10.7 8 10.6
          reflectiveCurveTo(
            x1 = 8.0f,
            y1 = 10.7f,
            x2 = 8.0f,
            y2 = 10.6f,
          )
          // l 0.2 -4.3
          lineToRelative(dx = 0.2f, dy = -4.3f)
          // c 0 -0.1 0 -0.1 -0.1 -0.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.1f,
            dx2 = 0.0f,
            dy2 = -0.1f,
            dx3 = -0.1f,
            dy3 = -0.1f,
          )
          // S 8 6.2 8 6.3
          reflectiveCurveTo(
            x1 = 8.0f,
            y1 = 6.2f,
            x2 = 8.0f,
            y2 = 6.3f,
          )
          // l -1.1 4.9
          lineToRelative(dx = -1.1f, dy = 4.9f)
          // c 0 0.2 -0.2 0.3 -0.3 0.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.2f,
            dx2 = -0.2f,
            dy2 = 0.3f,
            dx3 = -0.3f,
            dy3 = 0.3f,
          )
          // l -2.8 0.6
          lineToRelative(dx = -2.8f, dy = 0.6f)
          // c -0.1 0 -0.1 0.1 -0.1 0.1
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.0f,
            dx2 = -0.1f,
            dy2 = 0.1f,
            dx3 = -0.1f,
            dy3 = 0.1f,
          )
          // c 0 0.1 0 0.1 0.1 0.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.1f,
            dx3 = 0.1f,
            dy3 = 0.1f,
          )
          // h 2.7
          horizontalLineToRelative(dx = 2.7f)
          // c 0.2 0 0.3 0.1 0.4 0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.0f,
            dx2 = 0.3f,
            dy2 = 0.1f,
            dx3 = 0.4f,
            dy3 = 0.2f,
          )
          // l 6.6 11.8
          lineToRelative(dx = 6.6f, dy = 11.8f)
          // c 0 0.1 0.1 0.1 0.2 0.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.1f,
            dy2 = 0.1f,
            dx3 = 0.2f,
            dy3 = 0.1f,
          )
          // s 0.1 -0.1 0.1 -0.2
          reflectiveCurveToRelative(
            dx1 = 0.1f,
            dy1 = -0.1f,
            dx2 = 0.1f,
            dy2 = -0.2f,
          )
          // L 8.6 12.9
          lineTo(x = 8.6f, y = 12.9f)
          // v -0.1
          verticalLineToRelative(dy = -0.1f)
          // c 0 -0.2 0.1 -0.3 0.3 -0.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.2f,
            dx2 = 0.1f,
            dy2 = -0.3f,
            dx3 = 0.3f,
            dy3 = -0.4f,
          )
          // h 14.4
          horizontalLineToRelative(dx = 14.4f)
          // c 0.2 0.1 0.2 0.3 0.2 0.4
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.1f,
            dx2 = 0.2f,
            dy2 = 0.3f,
            dx3 = 0.2f,
            dy3 = 0.4f,
          )
          // l -5.3 11.3
          lineToRelative(dx = -5.3f, dy = 11.3f)
          // c 0 0.1 0 0.2 0.1 0.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.2f,
            dx3 = 0.1f,
            dy3 = 0.2f,
          )
          // s 0.2 0 0.2 -0.1
          reflectiveCurveToRelative(
            dx1 = 0.2f,
            dy1 = 0.0f,
            dx2 = 0.2f,
            dy2 = -0.1f,
          )
          // L 25 12.6
          lineTo(x = 25.0f, y = 12.6f)
          // c 0.1 -0.1 0.2 -0.2 0.4 -0.2
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -0.1f,
            dx2 = 0.2f,
            dy2 = -0.2f,
            dx3 = 0.4f,
            dy3 = -0.2f,
          )
          // h 2.7
          horizontalLineToRelative(dx = 2.7f)
          // c 0.1 0 0.1 0 0.1 -0.1
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.0f,
            dx2 = 0.1f,
            dy2 = 0.0f,
            dx3 = 0.1f,
            dy3 = -0.1f,
          )
          // s 0 -0.1 -0.1 -0.1
          reflectiveCurveToRelative(
            dx1 = 0.0f,
            dy1 = -0.1f,
            dx2 = -0.1f,
            dy2 = -0.1f,
          )
          // l -2.8 -0.6
          lineToRelative(dx = -2.8f, dy = -0.6f)
          // c -0.2 0 -0.3 -0.2 -0.4 -0.3
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.0f,
            dx2 = -0.3f,
            dy2 = -0.2f,
            dx3 = -0.4f,
            dy3 = -0.3f,
          )
          // l -0.9 -5
          lineToRelative(dx = -0.9f, dy = -5.0f)
          // c 0 -0.1 -0.1 -0.1 -0.1 -0.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.1f,
            dx2 = -0.1f,
            dy2 = -0.1f,
            dx3 = -0.1f,
            dy3 = -0.1f,
          )
          // c -0.1 0 -0.1 0 -0.1 0.1
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.0f,
            dx2 = -0.1f,
            dy2 = 0.0f,
            dx3 = -0.1f,
            dy3 = 0.1f,
          )
          // l 0.2 4.3
          lineToRelative(dx = 0.2f, dy = 4.3f)
          // c 0 0.1 0 0.1 -0.1 0.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.1f,
            dx3 = -0.1f,
            dy3 = 0.2f,
          )
          // q -0.15 0.15 -0.3 0z
          quadToRelative(
            dx1 = -0.15f,
            dy1 = 0.15f,
            dx2 = -0.3f,
            dy2 = 0.0f,
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
      .also { _logoSketch = it }
  }

@Suppress("ObjectPropertyName")
private var _logoSketch: ImageVector? = null
