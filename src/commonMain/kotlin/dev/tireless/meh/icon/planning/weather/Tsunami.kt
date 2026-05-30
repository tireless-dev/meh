// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tsunami: ImageVector
  get() {
    val current = _tsunami
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tsunami",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 26 h-6 a10.03 10.03 0 0 1 -6.93 -17.26 A12 12 0 0 0 13 8 a6.9 6.9 0 0 0 -6.03 3.42 C5 14.43 4 19.34 4 26 H2 c0 -7.05 1.1 -12.33 3.29 -15.67 A8.9 8.9 0 0 1 12.99 6 H13 a15 15 0 0 1 6.46 1.6 1 1 0 0 1 .09 1.71 A8.02 8.02 0 0 0 24 24 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 26
          moveTo(x = 30.0f, y = 26.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 10.03 10.03 0 0 1 -6.93 -17.26
          arcToRelative(
            a = 10.03f,
            b = 10.03f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.93f,
            dy1 = -17.26f,
          )
          // A 12 12 0 0 0 13 8
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 8.0f,
          )
          // a 6.9 6.9 0 0 0 -6.03 3.42
          arcToRelative(
            a = 6.9f,
            b = 6.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.03f,
            dy1 = 3.42f,
          )
          // C 5 14.43 4 19.34 4 26
          curveTo(
            x1 = 5.0f,
            y1 = 14.43f,
            x2 = 4.0f,
            y2 = 19.34f,
            x3 = 4.0f,
            y3 = 26.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // c 0 -7.05 1.1 -12.33 3.29 -15.67
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -7.05f,
            dx2 = 1.1f,
            dy2 = -12.33f,
            dx3 = 3.29f,
            dy3 = -15.67f,
          )
          // A 8.9 8.9 0 0 1 12.99 6
          arcTo(
            horizontalEllipseRadius = 8.9f,
            verticalEllipseRadius = 8.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.99f,
            y1 = 6.0f,
          )
          // H 13
          horizontalLineTo(x = 13.0f)
          // a 15 15 0 0 1 6.46 1.6
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.46f,
            dy1 = 1.6f,
          )
          // a 1 1 0 0 1 0.09 1.71
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.09f,
            dy1 = 1.71f,
          )
          // A 8.02 8.02 0 0 0 24 24
          arcTo(
            horizontalEllipseRadius = 8.02f,
            verticalEllipseRadius = 8.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 24.0f,
          )
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _tsunami = it }
  }

@Suppress("ObjectPropertyName")
private var _tsunami: ImageVector? = null
