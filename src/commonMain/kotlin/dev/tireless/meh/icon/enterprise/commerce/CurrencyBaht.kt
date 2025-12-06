// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyBaht: ImageVector
  get() {
    val current = _currencyBaht
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyBaht",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21.4 15.64 A5 5 0 0 0 23 12 v-1 a5 5 0 0 0 -5 -5 h-1 V3 h-2 v3 h-5 v20 h5 v3 h2 v-3 h2 a5 5 0 0 0 5 -5 v-1 a5 5 0 0 0 -2.6 -4.36 M12 8 h6 a3 3 0 0 1 3 3 v1 a3 3 0 0 1 -3 3 h-6Z m10 13 a3 3 0 0 1 -3 3 h-7 v-7 h7 a3 3 0 0 1 3 3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.4 15.64
          moveTo(x = 21.4f, y = 15.64f)
          // A 5 5 0 0 0 23 12
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 12.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 5 5 0 0 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 5 5 0 0 0 -2.6 -4.36
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.6f,
            dy1 = -4.36f,
          )
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // m 10 13
          moveToRelative(dx = 10.0f, dy = 13.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
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
      .also { _currencyBaht = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyBaht: ImageVector? = null
