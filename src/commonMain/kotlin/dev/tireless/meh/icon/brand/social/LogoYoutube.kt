// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoYoutube: ImageVector
  get() {
    val current = _logoYoutube
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoYoutube",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.41 9.26 a3.5 3.5 0 0 0 -2.47 -2.47 C24.76 6.2 16 6.2 16 6.2 s-8.76 0 -10.94 .59 a3.5 3.5 0 0 0 -2.47 2.47 A36 36 0 0 0 2 16 a36 36 0 0 0 .59 6.74 3.5 3.5 0 0 0 2.47 2.47 C7.24 25.8 16 25.8 16 25.8 s8.76 0 10.94 -.59 a3.5 3.5 0 0 0 2.47 -2.47 A36 36 0 0 0 30 16 a36 36 0 0 0 -.59 -6.74 M13.2 20.2 v-8.4 l7.27 4.2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.41 9.26
          moveTo(x = 29.41f, y = 9.26f)
          // a 3.5 3.5 0 0 0 -2.47 -2.47
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.47f,
            dy1 = -2.47f,
          )
          // C 24.76 6.2 16 6.2 16 6.2
          curveTo(
            x1 = 24.76f,
            y1 = 6.2f,
            x2 = 16.0f,
            y2 = 6.2f,
            x3 = 16.0f,
            y3 = 6.2f,
          )
          // s -8.76 0 -10.94 0.59
          reflectiveCurveToRelative(
            dx1 = -8.76f,
            dy1 = 0.0f,
            dx2 = -10.94f,
            dy2 = 0.59f,
          )
          // a 3.5 3.5 0 0 0 -2.47 2.47
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.47f,
            dy1 = 2.47f,
          )
          // A 36 36 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 36.0f,
            verticalEllipseRadius = 36.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // a 36 36 0 0 0 0.59 6.74
          arcToRelative(
            a = 36.0f,
            b = 36.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.59f,
            dy1 = 6.74f,
          )
          // a 3.5 3.5 0 0 0 2.47 2.47
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.47f,
            dy1 = 2.47f,
          )
          // C 7.24 25.8 16 25.8 16 25.8
          curveTo(
            x1 = 7.24f,
            y1 = 25.8f,
            x2 = 16.0f,
            y2 = 25.8f,
            x3 = 16.0f,
            y3 = 25.8f,
          )
          // s 8.76 0 10.94 -0.59
          reflectiveCurveToRelative(
            dx1 = 8.76f,
            dy1 = 0.0f,
            dx2 = 10.94f,
            dy2 = -0.59f,
          )
          // a 3.5 3.5 0 0 0 2.47 -2.47
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.47f,
            dy1 = -2.47f,
          )
          // A 36 36 0 0 0 30 16
          arcTo(
            horizontalEllipseRadius = 36.0f,
            verticalEllipseRadius = 36.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          // a 36 36 0 0 0 -0.59 -6.74
          arcToRelative(
            a = 36.0f,
            b = 36.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = -6.74f,
          )
          // M 13.2 20.2
          moveTo(x = 13.2f, y = 20.2f)
          // v -8.4
          verticalLineToRelative(dy = -8.4f)
          // l 7.27 4.2z
          lineToRelative(dx = 7.27f, dy = 4.2f)
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
      .also { _logoYoutube = it }
  }

@Suppress("ObjectPropertyName")
private var _logoYoutube: ImageVector? = null
