// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Corn: ImageVector
  get() {
    val current = _corn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Corn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 16 q-.5 0 -1 .05 V16 c0 -7.88 -2.96 -14 -5.5 -14 S11 8.12 11 16 v5 H6 v3 a6 6 0 0 0 6 6 h3 a11 11 0 0 0 11 -11 v-3Z m-10 0 h2 v-2 h-1.93 a26 26 0 0 1 .57 -4 H16 V8 h-1.8 c.81 -2.4 1.81 -3.77 2.3 -3.99 .66 .3 2.28 2.7 3.07 6.99 H18 v2 h1.84 A29 29 0 0 1 20 16 v.43 A11 11 0 0 0 13.79 21 H13Z m-1 12 a4 4 0 0 1 -4 -4 v-1 h4.76 A11 11 0 0 0 12 27Z m12 -9 a9 9 0 0 1 -9 9 h-1 v-1 a9 9 0 0 1 9 -9 h1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 16
          moveTo(x = 23.0f, y = 16.0f)
          // q -0.5 0 -1 0.05
          quadToRelative(
            dx1 = -0.5f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = 0.05f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // c 0 -7.88 -2.96 -14 -5.5 -14
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -7.88f,
            dx2 = -2.96f,
            dy2 = -14.0f,
            dx3 = -5.5f,
            dy3 = -14.0f,
          )
          // S 11 8.12 11 16
          reflectiveCurveTo(
            x1 = 11.0f,
            y1 = 8.12f,
            x2 = 11.0f,
            y2 = 16.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 6 6 0 0 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 11 11 0 0 0 11 -11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 11.0f,
            dy1 = -11.0f,
          )
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -1.93
          horizontalLineToRelative(dx = -1.93f)
          // a 26 26 0 0 1 0.57 -4
          arcToRelative(
            a = 26.0f,
            b = 26.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.57f,
            dy1 = -4.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -1.8
          horizontalLineToRelative(dx = -1.8f)
          // c 0.81 -2.4 1.81 -3.77 2.3 -3.99
          curveToRelative(
            dx1 = 0.81f,
            dy1 = -2.4f,
            dx2 = 1.81f,
            dy2 = -3.77f,
            dx3 = 2.3f,
            dy3 = -3.99f,
          )
          // c 0.66 0.3 2.28 2.7 3.07 6.99
          curveToRelative(
            dx1 = 0.66f,
            dy1 = 0.3f,
            dx2 = 2.28f,
            dy2 = 2.7f,
            dx3 = 3.07f,
            dy3 = 6.99f,
          )
          // H 18
          horizontalLineTo(x = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 1.84
          horizontalLineToRelative(dx = 1.84f)
          // A 29 29 0 0 1 20 16
          arcTo(
            horizontalEllipseRadius = 29.0f,
            verticalEllipseRadius = 29.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 16.0f,
          )
          // v 0.43
          verticalLineToRelative(dy = 0.43f)
          // A 11 11 0 0 0 13.79 21
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.79f,
            y1 = 21.0f,
          )
          // H 13z
          horizontalLineTo(x = 13.0f)
          close()
          // m -1 12
          moveToRelative(dx = -1.0f, dy = 12.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 4.76
          horizontalLineToRelative(dx = 4.76f)
          // A 11 11 0 0 0 12 27z
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 27.0f,
          )
          close()
          // m 12 -9
          moveToRelative(dx = 12.0f, dy = -9.0f)
          // a 9 9 0 0 1 -9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.0f,
            dy1 = 9.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 9 9 0 0 1 9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.0f,
            dy1 = -9.0f,
          )
          // h 1z
          horizontalLineToRelative(dx = 1.0f)
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
      .also { _corn = it }
  }

@Suppress("ObjectPropertyName")
private var _corn: ImageVector? = null
