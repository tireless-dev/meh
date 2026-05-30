// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoTwitter: ImageVector
  get() {
    val current = _logoTwitter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoTwitter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11.55 25.75 c9.05 0 14 -7.5 14 -14 V11.1 Q27 10.05 28 8.56 a10 10 0 0 1 -2.83 .77 5 5 0 0 0 2.17 -2.72 10 10 0 0 1 -3.13 1.2 4.93 4.93 0 0 0 -8.4 4.48 A14 14 0 0 1 5.68 7.15 a4.93 4.93 0 0 0 1.52 6.57 5 5 0 0 1 -2.23 -.61 v.06 A4.9 4.9 0 0 0 8.91 18 a5 5 0 0 1 -2.22 .08 c.64 2 2.49 3.38 4.6 3.42 A10 10 0 0 1 4 23.54 a14 14 0 0 0 7.55 2.2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.55 25.75
          moveTo(x = 11.55f, y = 25.75f)
          // c 9.05 0 14 -7.5 14 -14
          curveToRelative(
            dx1 = 9.05f,
            dy1 = 0.0f,
            dx2 = 14.0f,
            dy2 = -7.5f,
            dx3 = 14.0f,
            dy3 = -14.0f,
          )
          // V 11.1
          verticalLineTo(y = 11.1f)
          // Q 27 10.05 28 8.56
          quadTo(
            x1 = 27.0f,
            y1 = 10.05f,
            x2 = 28.0f,
            y2 = 8.56f,
          )
          // a 10 10 0 0 1 -2.83 0.77
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.83f,
            dy1 = 0.77f,
          )
          // a 5 5 0 0 0 2.17 -2.72
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.17f,
            dy1 = -2.72f,
          )
          // a 10 10 0 0 1 -3.13 1.2
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.13f,
            dy1 = 1.2f,
          )
          // a 4.93 4.93 0 0 0 -8.4 4.48
          arcToRelative(
            a = 4.93f,
            b = 4.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.4f,
            dy1 = 4.48f,
          )
          // A 14 14 0 0 1 5.68 7.15
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.68f,
            y1 = 7.15f,
          )
          // a 4.93 4.93 0 0 0 1.52 6.57
          arcToRelative(
            a = 4.93f,
            b = 4.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.52f,
            dy1 = 6.57f,
          )
          // a 5 5 0 0 1 -2.23 -0.61
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.23f,
            dy1 = -0.61f,
          )
          // v 0.06
          verticalLineToRelative(dy = 0.06f)
          // A 4.9 4.9 0 0 0 8.91 18
          arcTo(
            horizontalEllipseRadius = 4.9f,
            verticalEllipseRadius = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.91f,
            y1 = 18.0f,
          )
          // a 5 5 0 0 1 -2.22 0.08
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.22f,
            dy1 = 0.08f,
          )
          // c 0.64 2 2.49 3.38 4.6 3.42
          curveToRelative(
            dx1 = 0.64f,
            dy1 = 2.0f,
            dx2 = 2.49f,
            dy2 = 3.38f,
            dx3 = 4.6f,
            dy3 = 3.42f,
          )
          // A 10 10 0 0 1 4 23.54
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 23.54f,
          )
          // a 14 14 0 0 0 7.55 2.2
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.55f,
            dy1 = 2.2f,
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
      .also { _logoTwitter = it }
  }

@Suppress("ObjectPropertyName")
private var _logoTwitter: ImageVector? = null
