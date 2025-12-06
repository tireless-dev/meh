// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoGlassdoor: ImageVector
  get() {
    val current = _logoGlassdoor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoGlassdoor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10.83 28 h10.34 a3.43 3.43 0 0 0 3.43 -3.43 V10.33 h-3.43 v14.24 H7.4 A3.43 3.43 0 0 0 10.83 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.83 28
          moveTo(x = 10.83f, y = 28.0f)
          // h 10.34
          horizontalLineToRelative(dx = 10.34f)
          // a 3.43 3.43 0 0 0 3.43 -3.43
          arcToRelative(
            a = 3.43f,
            b = 3.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.43f,
            dy1 = -3.43f,
          )
          // V 10.33
          verticalLineTo(y = 10.33f)
          // h -3.43
          horizontalLineToRelative(dx = -3.43f)
          // v 14.24
          verticalLineToRelative(dy = 14.24f)
          // H 7.4
          horizontalLineTo(x = 7.4f)
          // A 3.43 3.43 0 0 0 10.83 28
          arcTo(
            horizontalEllipseRadius = 3.43f,
            verticalEllipseRadius = 3.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.83f,
            y1 = 28.0f,
          )
        }
        // M21.17 4 H10.83 A3.43 3.43 0 0 0 7.4 7.43 v14.24 h3.43 V7.43 H24.6 A3.43 3.43 0 0 0 21.17 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.17 4
          moveTo(x = 21.17f, y = 4.0f)
          // H 10.83
          horizontalLineTo(x = 10.83f)
          // A 3.43 3.43 0 0 0 7.4 7.43
          arcTo(
            horizontalEllipseRadius = 3.43f,
            verticalEllipseRadius = 3.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.4f,
            y1 = 7.43f,
          )
          // v 14.24
          verticalLineToRelative(dy = 14.24f)
          // h 3.43
          horizontalLineToRelative(dx = 3.43f)
          // V 7.43
          verticalLineTo(y = 7.43f)
          // H 24.6
          horizontalLineTo(x = 24.6f)
          // A 3.43 3.43 0 0 0 21.17 4
          arcTo(
            horizontalEllipseRadius = 3.43f,
            verticalEllipseRadius = 3.43f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.17f,
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
      .also { _logoGlassdoor = it }
  }

@Suppress("ObjectPropertyName")
private var _logoGlassdoor: ImageVector? = null
