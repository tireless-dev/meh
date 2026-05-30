// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoLivestream: ImageVector
  get() {
    val current = _logoLivestream
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoLivestream",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.49 23.71 h-7.54 a3.1 3.1 0 0 1 -2.41 -1 A15 15 0 0 1 10 18.88 c-1.3 -2.6 -2.54 -5.22 -3.82 -7.82 A29 29 0 0 0 4.9 8.74 8 8 0 0 0 2 5.6 h3.57 a46 46 0 0 1 7 .61 8.1 8.1 0 0 1 6.34 5.09 49 49 0 0 1 2.17 7.36 26 26 0 0 0 1.41 5.05 m5.61 2.67 a2.9 2.9 0 0 1 -2.74 -2.64 42 42 0 0 1 -.14 -4.9 48 48 0 0 0 -.61 -7.58 3.8 3.8 0 0 0 -.83 -2 h2.65 c.54 0 .73 .37 .89 .78 A12 12 0 0 1 28 13.28 c.29 2.72 .31 5.45 .33 8.18 a11 11 0 0 0 0 1.15 c.09 .78 .4 1.1 1.17 1.08 .5 0 .5 -.06 .5 -.06 v2.69 a9 9 0 0 1 -1.9 .06
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.49 23.71
          moveTo(x = 22.49f, y = 23.71f)
          // h -7.54
          horizontalLineToRelative(dx = -7.54f)
          // a 3.1 3.1 0 0 1 -2.41 -1
          arcToRelative(
            a = 3.1f,
            b = 3.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.41f,
            dy1 = -1.0f,
          )
          // A 15 15 0 0 1 10 18.88
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 18.88f,
          )
          // c -1.3 -2.6 -2.54 -5.22 -3.82 -7.82
          curveToRelative(
            dx1 = -1.3f,
            dy1 = -2.6f,
            dx2 = -2.54f,
            dy2 = -5.22f,
            dx3 = -3.82f,
            dy3 = -7.82f,
          )
          // A 29 29 0 0 0 4.9 8.74
          arcTo(
            horizontalEllipseRadius = 29.0f,
            verticalEllipseRadius = 29.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.9f,
            y1 = 8.74f,
          )
          // A 8 8 0 0 0 2 5.6
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 5.6f,
          )
          // h 3.57
          horizontalLineToRelative(dx = 3.57f)
          // a 46 46 0 0 1 7 0.61
          arcToRelative(
            a = 46.0f,
            b = 46.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 0.61f,
          )
          // a 8.1 8.1 0 0 1 6.34 5.09
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.34f,
            dy1 = 5.09f,
          )
          // a 49 49 0 0 1 2.17 7.36
          arcToRelative(
            a = 49.0f,
            b = 49.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.17f,
            dy1 = 7.36f,
          )
          // a 26 26 0 0 0 1.41 5.05
          arcToRelative(
            a = 26.0f,
            b = 26.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 5.05f,
          )
          // m 5.61 2.67
          moveToRelative(dx = 5.61f, dy = 2.67f)
          // a 2.9 2.9 0 0 1 -2.74 -2.64
          arcToRelative(
            a = 2.9f,
            b = 2.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.74f,
            dy1 = -2.64f,
          )
          // a 42 42 0 0 1 -0.14 -4.9
          arcToRelative(
            a = 42.0f,
            b = 42.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.14f,
            dy1 = -4.9f,
          )
          // a 48 48 0 0 0 -0.61 -7.58
          arcToRelative(
            a = 48.0f,
            b = 48.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.61f,
            dy1 = -7.58f,
          )
          // a 3.8 3.8 0 0 0 -0.83 -2
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.83f,
            dy1 = -2.0f,
          )
          // h 2.65
          horizontalLineToRelative(dx = 2.65f)
          // c 0.54 0 0.73 0.37 0.89 0.78
          curveToRelative(
            dx1 = 0.54f,
            dy1 = 0.0f,
            dx2 = 0.73f,
            dy2 = 0.37f,
            dx3 = 0.89f,
            dy3 = 0.78f,
          )
          // A 12 12 0 0 1 28 13.28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 13.28f,
          )
          // c 0.29 2.72 0.31 5.45 0.33 8.18
          curveToRelative(
            dx1 = 0.29f,
            dy1 = 2.72f,
            dx2 = 0.31f,
            dy2 = 5.45f,
            dx3 = 0.33f,
            dy3 = 8.18f,
          )
          // a 11 11 0 0 0 0 1.15
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.15f,
          )
          // c 0.09 0.78 0.4 1.1 1.17 1.08
          curveToRelative(
            dx1 = 0.09f,
            dy1 = 0.78f,
            dx2 = 0.4f,
            dy2 = 1.1f,
            dx3 = 1.17f,
            dy3 = 1.08f,
          )
          // c 0.5 0 0.5 -0.06 0.5 -0.06
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.0f,
            dx2 = 0.5f,
            dy2 = -0.06f,
            dx3 = 0.5f,
            dy3 = -0.06f,
          )
          // v 2.69
          verticalLineToRelative(dy = 2.69f)
          // a 9 9 0 0 1 -1.9 0.06
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.9f,
            dy1 = 0.06f,
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
      .also { _logoLivestream = it }
  }

@Suppress("ObjectPropertyName")
private var _logoLivestream: ImageVector? = null
