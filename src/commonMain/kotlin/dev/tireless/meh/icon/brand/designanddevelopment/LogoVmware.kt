// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoVmware: ImageVector
  get() {
    val current = _logoVmware
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoVmware",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M3.4 11 C3 10.1 2 9.7 1 10.2 s-1.3 1.4 -.9 2.3 l4 8.5 c.6 1.3 1.3 2 2.5 2 1.3 0 1.9 -.8 2.5 -2 0 0 3.4 -7.4 3.4 -7.5 s.1 -.3 .5 -.3 c.3 0 .5 .2 .5 .6 V21 c0 1.1 .6 2 1.8 2 s1.8 -.9 1.8 -2 v-6 c0 -1.1 .8 -1.9 1.9 -1.9 s1.9 .8 1.9 1.9 v6 c0 1.1 .6 2 1.8 2 s1.8 -.9 1.8 -2 v-6 c0 -1.1 .8 -1.9 1.9 -1.9 s1.9 .8 1.9 1.9 v6 c0 1.1 .6 2 1.8 2 s1.8 -.9 1.8 -2 v-6.8 c0 -2.5 -2 -4.2 -4.4 -4.2 s-3.9 1.7 -3.9 1.7 c-.8 -1 -1.9 -1.7 -3.8 -1.7 -2 0 -3.7 1.7 -3.7 1.7 -.8 -1 -2.2 -1.7 -3.3 -1.7 -1.7 0 -3.1 .8 -4 2.7 l-2.5 5.9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3.4 11
          moveTo(x = 3.4f, y = 11.0f)
          // C 3 10.1 2 9.7 1 10.2
          curveTo(
            x1 = 3.0f,
            y1 = 10.1f,
            x2 = 2.0f,
            y2 = 9.7f,
            x3 = 1.0f,
            y3 = 10.2f,
          )
          // s -1.3 1.4 -0.9 2.3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = 1.4f,
            dx2 = -0.9f,
            dy2 = 2.3f,
          )
          // l 4 8.5
          lineToRelative(dx = 4.0f, dy = 8.5f)
          // c 0.6 1.3 1.3 2 2.5 2
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 1.3f,
            dx2 = 1.3f,
            dy2 = 2.0f,
            dx3 = 2.5f,
            dy3 = 2.0f,
          )
          // c 1.3 0 1.9 -0.8 2.5 -2
          curveToRelative(
            dx1 = 1.3f,
            dy1 = 0.0f,
            dx2 = 1.9f,
            dy2 = -0.8f,
            dx3 = 2.5f,
            dy3 = -2.0f,
          )
          // c 0 0 3.4 -7.4 3.4 -7.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = 3.4f,
            dy2 = -7.4f,
            dx3 = 3.4f,
            dy3 = -7.5f,
          )
          // s 0.1 -0.3 0.5 -0.3
          reflectiveCurveToRelative(
            dx1 = 0.1f,
            dy1 = -0.3f,
            dx2 = 0.5f,
            dy2 = -0.3f,
          )
          // c 0.3 0 0.5 0.2 0.5 0.6
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.0f,
            dx2 = 0.5f,
            dy2 = 0.2f,
            dx3 = 0.5f,
            dy3 = 0.6f,
          )
          // V 21
          verticalLineTo(y = 21.0f)
          // c 0 1.1 0.6 2 1.8 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.1f,
            dx2 = 0.6f,
            dy2 = 2.0f,
            dx3 = 1.8f,
            dy3 = 2.0f,
          )
          // s 1.8 -0.9 1.8 -2
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = -0.9f,
            dx2 = 1.8f,
            dy2 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // c 0 -1.1 0.8 -1.9 1.9 -1.9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.1f,
            dx2 = 0.8f,
            dy2 = -1.9f,
            dx3 = 1.9f,
            dy3 = -1.9f,
          )
          // s 1.9 0.8 1.9 1.9
          reflectiveCurveToRelative(
            dx1 = 1.9f,
            dy1 = 0.8f,
            dx2 = 1.9f,
            dy2 = 1.9f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // c 0 1.1 0.6 2 1.8 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.1f,
            dx2 = 0.6f,
            dy2 = 2.0f,
            dx3 = 1.8f,
            dy3 = 2.0f,
          )
          // s 1.8 -0.9 1.8 -2
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = -0.9f,
            dx2 = 1.8f,
            dy2 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // c 0 -1.1 0.8 -1.9 1.9 -1.9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.1f,
            dx2 = 0.8f,
            dy2 = -1.9f,
            dx3 = 1.9f,
            dy3 = -1.9f,
          )
          // s 1.9 0.8 1.9 1.9
          reflectiveCurveToRelative(
            dx1 = 1.9f,
            dy1 = 0.8f,
            dx2 = 1.9f,
            dy2 = 1.9f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // c 0 1.1 0.6 2 1.8 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.1f,
            dx2 = 0.6f,
            dy2 = 2.0f,
            dx3 = 1.8f,
            dy3 = 2.0f,
          )
          // s 1.8 -0.9 1.8 -2
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = -0.9f,
            dx2 = 1.8f,
            dy2 = -2.0f,
          )
          // v -6.8
          verticalLineToRelative(dy = -6.8f)
          // c 0 -2.5 -2 -4.2 -4.4 -4.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.5f,
            dx2 = -2.0f,
            dy2 = -4.2f,
            dx3 = -4.4f,
            dy3 = -4.2f,
          )
          // s -3.9 1.7 -3.9 1.7
          reflectiveCurveToRelative(
            dx1 = -3.9f,
            dy1 = 1.7f,
            dx2 = -3.9f,
            dy2 = 1.7f,
          )
          // c -0.8 -1 -1.9 -1.7 -3.8 -1.7
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -1.0f,
            dx2 = -1.9f,
            dy2 = -1.7f,
            dx3 = -3.8f,
            dy3 = -1.7f,
          )
          // c -2 0 -3.7 1.7 -3.7 1.7
          curveToRelative(
            dx1 = -2.0f,
            dy1 = 0.0f,
            dx2 = -3.7f,
            dy2 = 1.7f,
            dx3 = -3.7f,
            dy3 = 1.7f,
          )
          // c -0.8 -1 -2.2 -1.7 -3.3 -1.7
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -1.0f,
            dx2 = -2.2f,
            dy2 = -1.7f,
            dx3 = -3.3f,
            dy3 = -1.7f,
          )
          // c -1.7 0 -3.1 0.8 -4 2.7
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.1f,
            dy2 = 0.8f,
            dx3 = -4.0f,
            dy3 = 2.7f,
          )
          // l -2.5 5.9z
          lineToRelative(dx = -2.5f, dy = 5.9f)
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
      .also { _logoVmware = it }
  }

@Suppress("ObjectPropertyName")
private var _logoVmware: ImageVector? = null
