// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyEuro: ImageVector
  get() {
    val current = _currencyEuro
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyEuro",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 26 c-3.62 0 -6.33 -2.3 -7.45 -6 H19 v-2 H9.13 A15 15 0 0 1 9 16 l.03 -1 H19 v-2 H9.24 C9.84 9.35 11.8 6 17 6 c3.85 0 5.53 1.65 7.13 4.49 l1.74 -.98 C24.27 6.65 22.07 4 17 4 10.64 4 7 8.37 7 16 c0 7.07 4.11 12 10 12 5.08 0 7.26 -2.65 8.87 -5.51 l-1.74 -.98 C22.53 24.35 20.85 26 17 26
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 26
          moveTo(x = 17.0f, y = 26.0f)
          // c -3.62 0 -6.33 -2.3 -7.45 -6
          curveToRelative(
            dx1 = -3.62f,
            dy1 = 0.0f,
            dx2 = -6.33f,
            dy2 = -2.3f,
            dx3 = -7.45f,
            dy3 = -6.0f,
          )
          // H 19
          horizontalLineTo(x = 19.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 9.13
          horizontalLineTo(x = 9.13f)
          // A 15 15 0 0 1 9 16
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 16.0f,
          )
          // l 0.03 -1
          lineToRelative(dx = 0.03f, dy = -1.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 9.24
          horizontalLineTo(x = 9.24f)
          // C 9.84 9.35 11.8 6 17 6
          curveTo(
            x1 = 9.84f,
            y1 = 9.35f,
            x2 = 11.8f,
            y2 = 6.0f,
            x3 = 17.0f,
            y3 = 6.0f,
          )
          // c 3.85 0 5.53 1.65 7.13 4.49
          curveToRelative(
            dx1 = 3.85f,
            dy1 = 0.0f,
            dx2 = 5.53f,
            dy2 = 1.65f,
            dx3 = 7.13f,
            dy3 = 4.49f,
          )
          // l 1.74 -0.98
          lineToRelative(dx = 1.74f, dy = -0.98f)
          // C 24.27 6.65 22.07 4 17 4
          curveTo(
            x1 = 24.27f,
            y1 = 6.65f,
            x2 = 22.07f,
            y2 = 4.0f,
            x3 = 17.0f,
            y3 = 4.0f,
          )
          // C 10.64 4 7 8.37 7 16
          curveTo(
            x1 = 10.64f,
            y1 = 4.0f,
            x2 = 7.0f,
            y2 = 8.37f,
            x3 = 7.0f,
            y3 = 16.0f,
          )
          // c 0 7.07 4.11 12 10 12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 7.07f,
            dx2 = 4.11f,
            dy2 = 12.0f,
            dx3 = 10.0f,
            dy3 = 12.0f,
          )
          // c 5.08 0 7.26 -2.65 8.87 -5.51
          curveToRelative(
            dx1 = 5.08f,
            dy1 = 0.0f,
            dx2 = 7.26f,
            dy2 = -2.65f,
            dx3 = 8.87f,
            dy3 = -5.51f,
          )
          // l -1.74 -0.98
          lineToRelative(dx = -1.74f, dy = -0.98f)
          // C 22.53 24.35 20.85 26 17 26
          curveTo(
            x1 = 22.53f,
            y1 = 24.35f,
            x2 = 20.85f,
            y2 = 26.0f,
            x3 = 17.0f,
            y3 = 26.0f,
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
      .also { _currencyEuro = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyEuro: ImageVector? = null
