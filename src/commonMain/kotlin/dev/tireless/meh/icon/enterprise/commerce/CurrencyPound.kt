// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyPound: ImageVector
  get() {
    val current = _currencyPound
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyPound",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12.45 25 A8.8 8.8 0 0 0 14 20 a11 11 0 0 0 -.18 -2 H22 v-2 h-8.78 l-.26 -.62 A10 10 0 0 1 12 11 a4.8 4.8 0 0 1 5 -5 6.1 6.1 0 0 1 5.22 2.63 l1.56 -1.26 A8.1 8.1 0 0 0 17 4 a6.8 6.8 0 0 0 -7 7 12 12 0 0 0 1.06 5 H8 v2 h3.77 A8 8 0 0 1 12 20 c0 2.52 -1.49 5 -3 5 v2 h15 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.45 25
          moveTo(x = 12.45f, y = 25.0f)
          // A 8.8 8.8 0 0 0 14 20
          arcTo(
            horizontalEllipseRadius = 8.8f,
            verticalEllipseRadius = 8.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 20.0f,
          )
          // a 11 11 0 0 0 -0.18 -2
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.18f,
            dy1 = -2.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -8.78
          horizontalLineToRelative(dx = -8.78f)
          // l -0.26 -0.62
          lineToRelative(dx = -0.26f, dy = -0.62f)
          // A 10 10 0 0 1 12 11
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 11.0f,
          )
          // a 4.8 4.8 0 0 1 5 -5
          arcToRelative(
            a = 4.8f,
            b = 4.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // a 6.1 6.1 0 0 1 5.22 2.63
          arcToRelative(
            a = 6.1f,
            b = 6.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.22f,
            dy1 = 2.63f,
          )
          // l 1.56 -1.26
          lineToRelative(dx = 1.56f, dy = -1.26f)
          // A 8.1 8.1 0 0 0 17 4
          arcTo(
            horizontalEllipseRadius = 8.1f,
            verticalEllipseRadius = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 4.0f,
          )
          // a 6.8 6.8 0 0 0 -7 7
          arcToRelative(
            a = 6.8f,
            b = 6.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // a 12 12 0 0 0 1.06 5
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.06f,
            dy1 = 5.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.77
          horizontalLineToRelative(dx = 3.77f)
          // A 8 8 0 0 1 12 20
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 20.0f,
          )
          // c 0 2.52 -1.49 5 -3 5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.52f,
            dx2 = -1.49f,
            dy2 = 5.0f,
            dx3 = -3.0f,
            dy3 = 5.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _currencyPound = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyPound: ImageVector? = null
