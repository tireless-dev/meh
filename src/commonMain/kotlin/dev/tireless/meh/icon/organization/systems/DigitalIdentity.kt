// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DigitalIdentity: ImageVector
  get() {
    val current = _digitalIdentity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DigitalIdentity",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 19 v-1 c0 -1.7 -1.3 -3 -3 -3 h-6 c-1.7 0 -3 1.3 -3 3 v7 h2 v-7 a1 1 0 0 1 1 -1 h6 c.5 0 1 .5 1 1 v1z m-10 -9 c0 2.2 1.8 4 4 4 s4 -1.8 4 -4 -1.8 -4 -4 -4 -4 1.8 -4 4 m6 0 c0 1.1 -.9 2 -2 2 s-2 -.9 -2 -2 .9 -2 2 -2 2 .9 2 2 m11 11 c0 7.8 -7.7 8 -8 8 v2 s10 -.2 10 -10z m-8 6 c2.1 0 6 -1.3 6 -6 h-2 c0 3.9 -3.6 4 -4 4z M5 3 h18 v16 h2 V3 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v26 a2 2 0 0 0 2 2 h12 v-2 H5z m15 18 c.6 0 1 .4 1 1 s-.4 1 -1 1 -1 -.4 -1 -1 .4 -1 1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 19
          moveTo(x = 20.0f, y = 19.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // c 0 -1.7 -1.3 -3 -3 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.7f,
            dx2 = -1.3f,
            dy2 = -3.0f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // c -1.7 0 -3 1.3 -3 3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = 1.3f,
            dx3 = -3.0f,
            dy3 = 3.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // c 0.5 0 1 0.5 1 1
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = 0.5f,
            dx3 = 1.0f,
            dy3 = 1.0f,
          )
          // v 1z
          verticalLineToRelative(dy = 1.0f)
          close()
          // m -10 -9
          moveToRelative(dx = -10.0f, dy = -9.0f)
          // c 0 2.2 1.8 4 4 4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.2f,
            dx2 = 1.8f,
            dy2 = 4.0f,
            dx3 = 4.0f,
            dy3 = 4.0f,
          )
          // s 4 -1.8 4 -4
          reflectiveCurveToRelative(
            dx1 = 4.0f,
            dy1 = -1.8f,
            dx2 = 4.0f,
            dy2 = -4.0f,
          )
          // s -1.8 -4 -4 -4
          reflectiveCurveToRelative(
            dx1 = -1.8f,
            dy1 = -4.0f,
            dx2 = -4.0f,
            dy2 = -4.0f,
          )
          // s -4 1.8 -4 4
          reflectiveCurveToRelative(
            dx1 = -4.0f,
            dy1 = 1.8f,
            dx2 = -4.0f,
            dy2 = 4.0f,
          )
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // c 0 1.1 -0.9 2 -2 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.1f,
            dx2 = -0.9f,
            dy2 = 2.0f,
            dx3 = -2.0f,
            dy3 = 2.0f,
          )
          // s -2 -0.9 -2 -2
          reflectiveCurveToRelative(
            dx1 = -2.0f,
            dy1 = -0.9f,
            dx2 = -2.0f,
            dy2 = -2.0f,
          )
          // s 0.9 -2 2 -2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.0f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // m 11 11
          moveToRelative(dx = 11.0f, dy = 11.0f)
          // c 0 7.8 -7.7 8 -8 8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 7.8f,
            dx2 = -7.7f,
            dy2 = 8.0f,
            dx3 = -8.0f,
            dy3 = 8.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // s 10 -0.2 10 -10z
          reflectiveCurveToRelative(
            dx1 = 10.0f,
            dy1 = -0.2f,
            dx2 = 10.0f,
            dy2 = -10.0f,
          )
          close()
          // m -8 6
          moveToRelative(dx = -8.0f, dy = 6.0f)
          // c 2.1 0 6 -1.3 6 -6
          curveToRelative(
            dx1 = 2.1f,
            dy1 = 0.0f,
            dx2 = 6.0f,
            dy2 = -1.3f,
            dx3 = 6.0f,
            dy3 = -6.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // c 0 3.9 -3.6 4 -4 4z
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = -3.6f,
            dy2 = 4.0f,
            dx3 = -4.0f,
            dy3 = 4.0f,
          )
          close()
          // M 5 3
          moveTo(x = 5.0f, y = 3.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 15 18
          moveToRelative(dx = 15.0f, dy = 18.0f)
          // c 0.6 0 1 0.4 1 1
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = 0.4f,
            dx3 = 1.0f,
            dy3 = 1.0f,
          )
          // s -0.4 1 -1 1
          reflectiveCurveToRelative(
            dx1 = -0.4f,
            dy1 = 1.0f,
            dx2 = -1.0f,
            dy2 = 1.0f,
          )
          // s -1 -0.4 -1 -1
          reflectiveCurveToRelative(
            dx1 = -1.0f,
            dy1 = -0.4f,
            dx2 = -1.0f,
            dy2 = -1.0f,
          )
          // s 0.4 -1 1 -1
          reflectiveCurveToRelative(
            dx1 = 0.4f,
            dy1 = -1.0f,
            dx2 = 1.0f,
          dy2 = -1.0f,
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
      .also { _digitalIdentity = it }
  }

@Suppress("ObjectPropertyName")
private var _digitalIdentity: ImageVector? = null
