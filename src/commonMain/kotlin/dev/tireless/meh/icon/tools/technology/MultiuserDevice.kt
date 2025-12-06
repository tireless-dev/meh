// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MultiuserDevice: ImageVector
  get() {
    val current = _multiuserDevice
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MultiuserDevice",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 25 h-6 a3 3 0 0 0 -3 3 v2 h2 v-2 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 1 1 v2 h2 v-2 a3 3 0 0 0 -3 -3 m-7 -5 a4 4 0 1 0 8 0 4 4 0 0 0 -8 0 m6 0 c0 1.1 -.9 2 -2 2 s-2 -.9 -2 -2 .9 -2 2 -2 2 .9 2 2 m3 -2 c1.1 0 2 .9 2 2 s-.9 2 -2 2 v2 a4 4 0 1 0 0 -8z m3 7 h-1 v2 h1 a1 1 0 0 1 1 1 v2 h2 v-2 a3 3 0 0 0 -3 -3 M6 4 h16 v10 h2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h3 v-2 H6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 25
          moveTo(x = 20.0f, y = 25.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m -7 -5
          moveToRelative(dx = -7.0f, dy = -5.0f)
          // a 4 4 0 1 0 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
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
          // m 3 -2
          moveToRelative(dx = 3.0f, dy = -2.0f)
          // c 1.1 0 2 0.9 2 2
          curveToRelative(
            dx1 = 1.1f,
            dy1 = 0.0f,
            dx2 = 2.0f,
            dy2 = 0.9f,
            dx3 = 2.0f,
            dy3 = 2.0f,
          )
          // s -0.9 2 -2 2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = 2.0f,
            dx2 = -2.0f,
            dy2 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 4 4 0 1 0 0 -8z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          close()
          // m 3 7
          moveToRelative(dx = 3.0f, dy = 7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
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
      .also { _multiuserDevice = it }
  }

@Suppress("ObjectPropertyName")
private var _multiuserDevice: ImageVector? = null
