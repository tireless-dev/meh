// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WavePeriod: ImageVector
  get() {
    val current = _wavePeriod
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WavePeriod",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 30 h-5 a7 7 0 0 1 -7 -7 6.7 6.7 0 0 1 2.02 -4.7 7 7 0 0 0 -2.01 -.3 C5.04 18.05 4 24.55 4 30 H2 c0 -11.5 4.35 -13.97 8 -14 a10 10 0 0 1 4.47 1.12 1 1 0 0 1 .06 1.73 A4.88 4.88 0 0 0 17 28 h5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 30
          moveTo(x = 22.0f, y = 30.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 7 7 0 0 1 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // a 6.7 6.7 0 0 1 2.02 -4.7
          arcToRelative(
            a = 6.7f,
            b = 6.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.02f,
            dy1 = -4.7f,
          )
          // a 7 7 0 0 0 -2.01 -0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.01f,
            dy1 = -0.3f,
          )
          // C 5.04 18.05 4 24.55 4 30
          curveTo(
            x1 = 5.04f,
            y1 = 18.05f,
            x2 = 4.0f,
            y2 = 24.55f,
            x3 = 4.0f,
            y3 = 30.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // c 0 -11.5 4.35 -13.97 8 -14
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -11.5f,
            dx2 = 4.35f,
            dy2 = -13.97f,
            dx3 = 8.0f,
            dy3 = -14.0f,
          )
          // a 10 10 0 0 1 4.47 1.12
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.47f,
            dy1 = 1.12f,
          )
          // a 1 1 0 0 1 0.06 1.73
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.06f,
            dy1 = 1.73f,
          )
          // A 4.88 4.88 0 0 0 17 28
          arcTo(
            horizontalEllipseRadius = 4.88f,
            verticalEllipseRadius = 4.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 28.0f,
          )
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
        }
        // <rect width="2" height="8" x="17.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 8
          moveTo(x = 17.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M28 5.41 26.59 4 l-2.27 2.26 A10 10 0 0 0 19 4.06 V2 h-2 v2.05 A10 10 0 0 0 8 14 h2 a8 8 0 1 1 8 8 v2 a10 10 0 0 0 7.74 -16.32Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 5.41
          moveTo(x = 28.0f, y = 5.41f)
          // L 26.59 4
          lineTo(x = 26.59f, y = 4.0f)
          // l -2.27 2.26
          lineToRelative(dx = -2.27f, dy = 2.26f)
          // A 10 10 0 0 0 19 4.06
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 4.06f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // A 10 10 0 0 0 8 14
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 14.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 1 1 8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 8.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 10 10 0 0 0 7.74 -16.32z
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.74f,
            dy1 = -16.32f,
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
      .also { _wavePeriod = it }
  }

@Suppress("ObjectPropertyName")
private var _wavePeriod: ImageVector? = null
