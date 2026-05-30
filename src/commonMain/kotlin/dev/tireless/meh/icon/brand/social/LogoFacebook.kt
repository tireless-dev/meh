// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoFacebook: ImageVector
  get() {
    val current = _logoFacebook
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoFacebook",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.67 4 H5.33 A1.34 1.34 0 0 0 4 5.33 v21.34 A1.34 1.34 0 0 0 5.33 28 h11.49 v-9.28 H13.7 v-3.63 h3.12 v-2.67 c0 -3.1 1.89 -4.79 4.67 -4.79 .93 0 1.86 0 2.79 .14 V11 h-1.91 c-1.51 0 -1.8 .72 -1.8 1.77 v2.31 h3.6 l-.47 3.63 h-3.13 V28 h6.1 A1.34 1.34 0 0 0 28 26.67 V5.33 A1.34 1.34 0 0 0 26.67 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.67 4
          moveTo(x = 26.67f, y = 4.0f)
          // H 5.33
          horizontalLineTo(x = 5.33f)
          // A 1.34 1.34 0 0 0 4 5.33
          arcTo(
            horizontalEllipseRadius = 1.34f,
            verticalEllipseRadius = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 5.33f,
          )
          // v 21.34
          verticalLineToRelative(dy = 21.34f)
          // A 1.34 1.34 0 0 0 5.33 28
          arcTo(
            horizontalEllipseRadius = 1.34f,
            verticalEllipseRadius = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.33f,
            y1 = 28.0f,
          )
          // h 11.49
          horizontalLineToRelative(dx = 11.49f)
          // v -9.28
          verticalLineToRelative(dy = -9.28f)
          // H 13.7
          horizontalLineTo(x = 13.7f)
          // v -3.63
          verticalLineToRelative(dy = -3.63f)
          // h 3.12
          horizontalLineToRelative(dx = 3.12f)
          // v -2.67
          verticalLineToRelative(dy = -2.67f)
          // c 0 -3.1 1.89 -4.79 4.67 -4.79
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.1f,
            dx2 = 1.89f,
            dy2 = -4.79f,
            dx3 = 4.67f,
            dy3 = -4.79f,
          )
          // c 0.93 0 1.86 0 2.79 0.14
          curveToRelative(
            dx1 = 0.93f,
            dy1 = 0.0f,
            dx2 = 1.86f,
            dy2 = 0.0f,
            dx3 = 2.79f,
            dy3 = 0.14f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // h -1.91
          horizontalLineToRelative(dx = -1.91f)
          // c -1.51 0 -1.8 0.72 -1.8 1.77
          curveToRelative(
            dx1 = -1.51f,
            dy1 = 0.0f,
            dx2 = -1.8f,
            dy2 = 0.72f,
            dx3 = -1.8f,
            dy3 = 1.77f,
          )
          // v 2.31
          verticalLineToRelative(dy = 2.31f)
          // h 3.6
          horizontalLineToRelative(dx = 3.6f)
          // l -0.47 3.63
          lineToRelative(dx = -0.47f, dy = 3.63f)
          // h -3.13
          horizontalLineToRelative(dx = -3.13f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h 6.1
          horizontalLineToRelative(dx = 6.1f)
          // A 1.34 1.34 0 0 0 28 26.67
          arcTo(
            horizontalEllipseRadius = 1.34f,
            verticalEllipseRadius = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.67f,
          )
          // V 5.33
          verticalLineTo(y = 5.33f)
          // A 1.34 1.34 0 0 0 26.67 4
          arcTo(
            horizontalEllipseRadius = 1.34f,
            verticalEllipseRadius = 1.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.67f,
            y1 = 4.0f,
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
      .also { _logoFacebook = it }
  }

@Suppress("ObjectPropertyName")
private var _logoFacebook: ImageVector? = null
