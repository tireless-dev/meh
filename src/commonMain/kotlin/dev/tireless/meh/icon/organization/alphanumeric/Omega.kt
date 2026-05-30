// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Omega: ImageVector
  get() {
    val current = _omega
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Omega",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.74 25 A14.3 14.3 0 0 0 27 15 c0 -6.58 -4.42 -11 -11 -11 S5 8.42 5 15 a14.3 14.3 0 0 0 4.26 10 H4 v2 h8 v-2.24 A12.6 12.6 0 0 1 7 15 c0 -5.47 3.53 -9 9 -9 s9 3.53 9 9 a12.6 12.6 0 0 1 -5 9.76 V27 h8 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.74 25
          moveTo(x = 22.74f, y = 25.0f)
          // A 14.3 14.3 0 0 0 27 15
          arcTo(
            horizontalEllipseRadius = 14.3f,
            verticalEllipseRadius = 14.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 15.0f,
          )
          // c 0 -6.58 -4.42 -11 -11 -11
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -6.58f,
            dx2 = -4.42f,
            dy2 = -11.0f,
            dx3 = -11.0f,
            dy3 = -11.0f,
          )
          // S 5 8.42 5 15
          reflectiveCurveTo(
            x1 = 5.0f,
            y1 = 8.42f,
            x2 = 5.0f,
            y2 = 15.0f,
          )
          // a 14.3 14.3 0 0 0 4.26 10
          arcToRelative(
            a = 14.3f,
            b = 14.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.26f,
            dy1 = 10.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2.24
          verticalLineToRelative(dy = -2.24f)
          // A 12.6 12.6 0 0 1 7 15
          arcTo(
            horizontalEllipseRadius = 12.6f,
            verticalEllipseRadius = 12.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.0f,
            y1 = 15.0f,
          )
          // c 0 -5.47 3.53 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.47f,
            dx2 = 3.53f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // s 9 3.53 9 9
          reflectiveCurveToRelative(
            dx1 = 9.0f,
            dy1 = 3.53f,
            dx2 = 9.0f,
            dy2 = 9.0f,
          )
          // a 12.6 12.6 0 0 1 -5 9.76
          arcToRelative(
            a = 12.6f,
            b = 12.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 9.76f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _omega = it }
  }

@Suppress("ObjectPropertyName")
private var _omega: ImageVector? = null
