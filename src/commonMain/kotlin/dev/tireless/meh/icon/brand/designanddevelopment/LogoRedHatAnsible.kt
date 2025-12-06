// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoRedHatAnsible: ImageVector
  get() {
    val current = _logoRedHatAnsible
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoRedHatAnsible",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m21.91 20.59 -5 -11 a1 1 0 0 0 -1.82 0 l-5 11 a1 1 0 0 0 1.82 .83 l2 -4.4 6.5 4.79 a1 1 0 0 0 1.5 -1.22 M16 12.42 l2.5 5.5 -3.75 -2.76z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.91 20.59
          moveTo(x = 21.91f, y = 20.59f)
          // l -5 -11
          lineToRelative(dx = -5.0f, dy = -11.0f)
          // a 1 1 0 0 0 -1.82 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.82f,
            dy1 = 0.0f,
          )
          // l -5 11
          lineToRelative(dx = -5.0f, dy = 11.0f)
          // a 1 1 0 0 0 1.82 0.83
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.82f,
            dy1 = 0.83f,
          )
          // l 2 -4.4
          lineToRelative(dx = 2.0f, dy = -4.4f)
          // l 6.5 4.79
          lineToRelative(dx = 6.5f, dy = 4.79f)
          // a 1 1 0 0 0 1.5 -1.22
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = -1.22f,
          )
          // M 16 12.42
          moveTo(x = 16.0f, y = 12.42f)
          // l 2.5 5.5
          lineToRelative(dx = 2.5f, dy = 5.5f)
          // l -3.75 -2.76z
          lineToRelative(dx = -3.75f, dy = -2.76f)
          close()
        }
        // M16 30 C8.28 30 2 23.72 2 16 S8.28 2 16 2 s14 6.28 14 14 -6.28 14 -14 14 m0 -26 a12.01 12.01 0 1 0 12 12 c0 -6.62 -5.38 -12 -12 -12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // C 8.28 30 2 23.72 2 16
          curveTo(
            x1 = 8.28f,
            y1 = 30.0f,
            x2 = 2.0f,
            y2 = 23.72f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // S 8.28 2 16 2
          reflectiveCurveTo(
            x1 = 8.28f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // s 14 6.28 14 14
          reflectiveCurveToRelative(
            dx1 = 14.0f,
            dy1 = 6.28f,
            dx2 = 14.0f,
            dy2 = 14.0f,
          )
          // s -6.28 14 -14 14
          reflectiveCurveToRelative(
            dx1 = -6.28f,
            dy1 = 14.0f,
            dx2 = -14.0f,
            dy2 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12.01 12.01 0 1 0 12 12
          arcToRelative(
            a = 12.01f,
            b = 12.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // c 0 -6.62 -5.38 -12 -12 -12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -6.62f,
            dx2 = -5.38f,
            dy2 = -12.0f,
            dx3 = -12.0f,
            dy3 = -12.0f,
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
      .also { _logoRedHatAnsible = it }
  }

@Suppress("ObjectPropertyName")
private var _logoRedHatAnsible: ImageVector? = null
