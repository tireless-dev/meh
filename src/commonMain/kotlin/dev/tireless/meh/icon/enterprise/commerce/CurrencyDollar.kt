// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyDollar: ImageVector
  get() {
    val current = _currencyDollar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyDollar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 20.52 c0 -4.62 -3.78 -5.15 -6.82 -5.57 -3.3 -.46 -5.18 -.86 -5.18 -3.7 C11 8.84 13.5 8 15.65 8 a6.8 6.8 0 0 1 5.57 2.63 l1.56 -1.26 A8.7 8.7 0 0 0 17 6.1 V3 h-2 v3.02 c-3.62 .22 -6 2.26 -6 5.22 0 4.73 3.83 5.26 6.9 5.7 3.26 .44 5.1 .83 5.1 3.58 0 3.03 -3.13 3.48 -5 3.48 -3.43 0 -4.88 -.96 -6.22 -2.63 l-1.56 1.26 A8.4 8.4 0 0 0 15 25.96 V29 h2 v-3.04 c3.73 -.3 6 -2.33 6 -5.44
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 20.52
          moveTo(x = 23.0f, y = 20.52f)
          // c 0 -4.62 -3.78 -5.15 -6.82 -5.57
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.62f,
            dx2 = -3.78f,
            dy2 = -5.15f,
            dx3 = -6.82f,
            dy3 = -5.57f,
          )
          // c -3.3 -0.46 -5.18 -0.86 -5.18 -3.7
          curveToRelative(
            dx1 = -3.3f,
            dy1 = -0.46f,
            dx2 = -5.18f,
            dy2 = -0.86f,
            dx3 = -5.18f,
            dy3 = -3.7f,
          )
          // C 11 8.84 13.5 8 15.65 8
          curveTo(
            x1 = 11.0f,
            y1 = 8.84f,
            x2 = 13.5f,
            y2 = 8.0f,
            x3 = 15.65f,
            y3 = 8.0f,
          )
          // a 6.8 6.8 0 0 1 5.57 2.63
          arcToRelative(
            a = 6.8f,
            b = 6.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.57f,
            dy1 = 2.63f,
          )
          // l 1.56 -1.26
          lineToRelative(dx = 1.56f, dy = -1.26f)
          // A 8.7 8.7 0 0 0 17 6.1
          arcTo(
            horizontalEllipseRadius = 8.7f,
            verticalEllipseRadius = 8.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 6.1f,
          )
          // V 3
          verticalLineTo(y = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3.02
          verticalLineToRelative(dy = 3.02f)
          // c -3.62 0.22 -6 2.26 -6 5.22
          curveToRelative(
            dx1 = -3.62f,
            dy1 = 0.22f,
            dx2 = -6.0f,
            dy2 = 2.26f,
            dx3 = -6.0f,
            dy3 = 5.22f,
          )
          // c 0 4.73 3.83 5.26 6.9 5.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.73f,
            dx2 = 3.83f,
            dy2 = 5.26f,
            dx3 = 6.9f,
            dy3 = 5.7f,
          )
          // c 3.26 0.44 5.1 0.83 5.1 3.58
          curveToRelative(
            dx1 = 3.26f,
            dy1 = 0.44f,
            dx2 = 5.1f,
            dy2 = 0.83f,
            dx3 = 5.1f,
            dy3 = 3.58f,
          )
          // c 0 3.03 -3.13 3.48 -5 3.48
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.03f,
            dx2 = -3.13f,
            dy2 = 3.48f,
            dx3 = -5.0f,
            dy3 = 3.48f,
          )
          // c -3.43 0 -4.88 -0.96 -6.22 -2.63
          curveToRelative(
            dx1 = -3.43f,
            dy1 = 0.0f,
            dx2 = -4.88f,
            dy2 = -0.96f,
            dx3 = -6.22f,
            dy3 = -2.63f,
          )
          // l -1.56 1.26
          lineToRelative(dx = -1.56f, dy = 1.26f)
          // A 8.4 8.4 0 0 0 15 25.96
          arcTo(
            horizontalEllipseRadius = 8.4f,
            verticalEllipseRadius = 8.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 25.96f,
          )
          // V 29
          verticalLineTo(y = 29.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3.04
          verticalLineToRelative(dy = -3.04f)
          // c 3.73 -0.3 6 -2.33 6 -5.44
          curveToRelative(
            dx1 = 3.73f,
            dy1 = -0.3f,
            dx2 = 6.0f,
            dy2 = -2.33f,
            dx3 = 6.0f,
            dy3 = -5.44f,
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
      .also { _currencyDollar = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyDollar: ImageVector? = null
