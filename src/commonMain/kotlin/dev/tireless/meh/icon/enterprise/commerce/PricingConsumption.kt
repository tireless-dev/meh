// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PricingConsumption: ImageVector
  get() {
    val current = _pricingConsumption
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PricingConsumption",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 v2 a12 12 0 1 1 0 24 v2 a14 14 0 0 0 0 -28 M8.24 25.14 l-1.29 1.53 a14 14 0 0 0 4.18 2.44 l.68 -1.88 a12 12 0 0 1 -3.58 -2.09z M4.19 18 l-1.97 .41 a14 14 0 0 0 1.64 4.54 L5.59 22 a12 12 0 0 1 -1.4 -4 m1.4 -8 L3.86 9 a14 14 0 0 0 -1.64 4.59 l1.97 .35 a12 12 0 0 1 1.4 -3.93z m6.23 -5.24 -.68 -1.88 a14 14 0 0 0 -4.18 2.44 l1.29 1.53 a12 12 0 0 1 3.58 -2.09z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 12 12 0 1 1 0 24
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 24.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 14 14 0 0 0 0 -28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -28.0f,
          )
          // M 8.24 25.14
          moveTo(x = 8.24f, y = 25.14f)
          // l -1.29 1.53
          lineToRelative(dx = -1.29f, dy = 1.53f)
          // a 14 14 0 0 0 4.18 2.44
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.18f,
            dy1 = 2.44f,
          )
          // l 0.68 -1.88
          lineToRelative(dx = 0.68f, dy = -1.88f)
          // a 12 12 0 0 1 -3.58 -2.09z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.58f,
            dy1 = -2.09f,
          )
          close()
          // M 4.19 18
          moveTo(x = 4.19f, y = 18.0f)
          // l -1.97 0.41
          lineToRelative(dx = -1.97f, dy = 0.41f)
          // a 14 14 0 0 0 1.64 4.54
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.64f,
            dy1 = 4.54f,
          )
          // L 5.59 22
          lineTo(x = 5.59f, y = 22.0f)
          // a 12 12 0 0 1 -1.4 -4
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.4f,
            dy1 = -4.0f,
          )
          // m 1.4 -8
          moveToRelative(dx = 1.4f, dy = -8.0f)
          // L 3.86 9
          lineTo(x = 3.86f, y = 9.0f)
          // a 14 14 0 0 0 -1.64 4.59
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.64f,
            dy1 = 4.59f,
          )
          // l 1.97 0.35
          lineToRelative(dx = 1.97f, dy = 0.35f)
          // a 12 12 0 0 1 1.4 -3.93z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = -3.93f,
          )
          close()
          // m 6.23 -5.24
          moveToRelative(dx = 6.23f, dy = -5.24f)
          // l -0.68 -1.88
          lineToRelative(dx = -0.68f, dy = -1.88f)
          // a 14 14 0 0 0 -4.18 2.44
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.18f,
            dy1 = 2.44f,
          )
          // l 1.29 1.53
          lineToRelative(dx = 1.29f, dy = 1.53f)
          // a 12 12 0 0 1 3.58 -2.09z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.58f,
            dy1 = -2.09f,
          )
          close()
        }
        // M21 12 v-2 h-4 V7 h-2 v3 h-2 a2 2 0 0 0 -2 2 v3 a2 2 0 0 0 2 2 h6 v3 h-8 v2 h4 v3 h2 v-3 h2 a2 2 0 0 0 2 -2 v-3 a2 2 0 0 0 -2 -2 h-6 v-3z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 12
          moveTo(x = 21.0f, y = 12.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
      path(
        fill = SolidColor(Color.Transparent),
        strokeLineWidth = 0.0f,
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
      .also { _pricingConsumption = it }
  }

@Suppress("ObjectPropertyName")
private var _pricingConsumption: ImageVector? = null
