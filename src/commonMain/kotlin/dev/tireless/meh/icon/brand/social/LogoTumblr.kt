// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoTumblr: ImageVector
  get() {
    val current = _logoTumblr
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoTumblr",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.6 28 h-4 c-3.59 0 -6.3 -1.86 -6.3 -6.3 v-7.12 H9 v-3.86 A7.2 7.2 0 0 0 14.3 4 h3.76 v6.12 h4.36 v4.46 h-4.36 v6.2 c0 1.86 .94 2.49 2.42 2.49 h2.12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.6 28
          moveTo(x = 22.6f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // c -3.59 0 -6.3 -1.86 -6.3 -6.3
          curveToRelative(
            dx1 = -3.59f,
            dy1 = 0.0f,
            dx2 = -6.3f,
            dy2 = -1.86f,
            dx3 = -6.3f,
            dy3 = -6.3f,
          )
          // v -7.12
          verticalLineToRelative(dy = -7.12f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -3.86
          verticalLineToRelative(dy = -3.86f)
          // A 7.2 7.2 0 0 0 14.3 4
          arcTo(
            horizontalEllipseRadius = 7.2f,
            verticalEllipseRadius = 7.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.3f,
            y1 = 4.0f,
          )
          // h 3.76
          horizontalLineToRelative(dx = 3.76f)
          // v 6.12
          verticalLineToRelative(dy = 6.12f)
          // h 4.36
          horizontalLineToRelative(dx = 4.36f)
          // v 4.46
          verticalLineToRelative(dy = 4.46f)
          // h -4.36
          horizontalLineToRelative(dx = -4.36f)
          // v 6.2
          verticalLineToRelative(dy = 6.2f)
          // c 0 1.86 0.94 2.49 2.42 2.49
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.86f,
            dx2 = 0.94f,
            dy2 = 2.49f,
            dx3 = 2.42f,
            dy3 = 2.49f,
          )
          // h 2.12z
          horizontalLineToRelative(dx = 2.12f)
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
      .also { _logoTumblr = it }
  }

@Suppress("ObjectPropertyName")
private var _logoTumblr: ImageVector? = null
