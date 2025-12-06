// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FavoriteFilled: ImageVector
  get() {
    val current = _favoriteFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FavoriteFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.5 4 c-2 0 -3.9 .8 -5.3 2.2 L16 7.4 l-1.1 -1.1 c-2.9 -3 -7.7 -3 -10.6 -.1 L4.2 6.3 c-3 3 -3 7.8 0 10.8 L16 29 l11.8 -11.9 c3 -3 3 -7.8 0 -10.8 A7.2 7.2 0 0 0 22.5 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 4
          moveTo(x = 22.5f, y = 4.0f)
          // c -2 0 -3.9 0.8 -5.3 2.2
          curveToRelative(
            dx1 = -2.0f,
            dy1 = 0.0f,
            dx2 = -3.9f,
            dy2 = 0.8f,
            dx3 = -5.3f,
            dy3 = 2.2f,
          )
          // L 16 7.4
          lineTo(x = 16.0f, y = 7.4f)
          // l -1.1 -1.1
          lineToRelative(dx = -1.1f, dy = -1.1f)
          // c -2.9 -3 -7.7 -3 -10.6 -0.1
          curveToRelative(
            dx1 = -2.9f,
            dy1 = -3.0f,
            dx2 = -7.7f,
            dy2 = -3.0f,
            dx3 = -10.6f,
            dy3 = -0.1f,
          )
          // L 4.2 6.3
          lineTo(x = 4.2f, y = 6.3f)
          // c -3 3 -3 7.8 0 10.8
          curveToRelative(
            dx1 = -3.0f,
            dy1 = 3.0f,
            dx2 = -3.0f,
            dy2 = 7.8f,
            dx3 = 0.0f,
            dy3 = 10.8f,
          )
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 11.8 -11.9
          lineToRelative(dx = 11.8f, dy = -11.9f)
          // c 3 -3 3 -7.8 0 -10.8
          curveToRelative(
            dx1 = 3.0f,
            dy1 = -3.0f,
            dx2 = 3.0f,
            dy2 = -7.8f,
            dx3 = 0.0f,
            dy3 = -10.8f,
          )
          // A 7.2 7.2 0 0 0 22.5 4
          arcTo(
            horizontalEllipseRadius = 7.2f,
            verticalEllipseRadius = 7.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.5f,
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
      .also { _favoriteFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _favoriteFilled: ImageVector? = null
