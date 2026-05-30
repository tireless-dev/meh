// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoXing: ImageVector
  get() {
    val current = _logoXing
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoXing",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11.42 8.29 a1.3 1.3 0 0 0 -1.13 -.76 h-4 a.7 .7 0 0 0 -.55 .25 .6 .6 0 0 0 0 .62 l2.73 4.73 -4.3 7.59 a.6 .6 0 0 0 0 .62 .6 .6 0 0 0 .52 .28 h4 a1.2 1.2 0 0 0 1.1 -.78 l4.36 -7.71z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.42 8.29
          moveTo(x = 11.42f, y = 8.29f)
          // a 1.3 1.3 0 0 0 -1.13 -0.76
          arcToRelative(
            a = 1.3f,
            b = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.13f,
            dy1 = -0.76f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 0.7 0.7 0 0 0 -0.55 0.25
          arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = 0.25f,
          )
          // a 0.6 0.6 0 0 0 0 0.62
          arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.62f,
          )
          // l 2.73 4.73
          lineToRelative(dx = 2.73f, dy = 4.73f)
          // l -4.3 7.59
          lineToRelative(dx = -4.3f, dy = 7.59f)
          // a 0.6 0.6 0 0 0 0 0.62
          arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.62f,
          )
          // a 0.6 0.6 0 0 0 0.52 0.28
          arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.52f,
            dy1 = 0.28f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1.2 1.2 0 0 0 1.1 -0.78
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.1f,
            dy1 = -0.78f,
          )
          // l 4.36 -7.71z
          lineToRelative(dx = 4.36f, dy = -7.71f)
          close()
        }
        // M27.83 2.88 a.7 .7 0 0 0 0 -.62 A.6 .6 0 0 0 27.3 2 h-4.08 a1.2 1.2 0 0 0 -1.08 .77 s-8.7 15.43 -9 15.93 l5.74 10.53 A1.3 1.3 0 0 0 20 30 h4 a.6 .6 0 0 0 .54 -.26 .6 .6 0 0 0 0 -.62 l-5.69 -10.4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.83 2.88
          moveTo(x = 27.83f, y = 2.88f)
          // a 0.7 0.7 0 0 0 0 -0.62
          arcToRelative(
            a = 0.7f,
            b = 0.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.62f,
          )
          // A 0.6 0.6 0 0 0 27.3 2
          arcTo(
            horizontalEllipseRadius = 0.6f,
            verticalEllipseRadius = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.3f,
            y1 = 2.0f,
          )
          // h -4.08
          horizontalLineToRelative(dx = -4.08f)
          // a 1.2 1.2 0 0 0 -1.08 0.77
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.08f,
            dy1 = 0.77f,
          )
          // s -8.7 15.43 -9 15.93
          reflectiveCurveToRelative(
            dx1 = -8.7f,
            dy1 = 15.43f,
            dx2 = -9.0f,
            dy2 = 15.93f,
          )
          // l 5.74 10.53
          lineToRelative(dx = 5.74f, dy = 10.53f)
          // A 1.3 1.3 0 0 0 20 30
          arcTo(
            horizontalEllipseRadius = 1.3f,
            verticalEllipseRadius = 1.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 30.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 0.6 0.6 0 0 0 0.54 -0.26
          arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.54f,
            dy1 = -0.26f,
          )
          // a 0.6 0.6 0 0 0 0 -0.62
          arcToRelative(
            a = 0.6f,
            b = 0.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.62f,
          )
          // l -5.69 -10.4z
          lineToRelative(dx = -5.69f, dy = -10.4f)
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
      .also { _logoXing = it }
  }

@Suppress("ObjectPropertyName")
private var _logoXing: ImageVector? = null
