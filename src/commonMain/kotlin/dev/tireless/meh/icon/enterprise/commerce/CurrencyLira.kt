// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyLira: ImageVector
  get() {
    val current = _currencyLira
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyLira",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 19 a6 6 0 0 1 -6 6 h-4 v-6.9 l8.21 -3.1 v-2 L13 16.1 v-3 l8.21 -3.1 V8 L13 11.1 V5 h-2 v6.86 L8 13 v2 l3 -1.14 v3 L8 18 v2 l3 -1.14 V27 h6 a8 8 0 0 0 8 -8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 19
          moveTo(x = 23.0f, y = 19.0f)
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6.9
          verticalLineToRelative(dy = -6.9f)
          // l 8.21 -3.1
          lineToRelative(dx = 8.21f, dy = -3.1f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // L 13 16.1
          lineTo(x = 13.0f, y = 16.1f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // l 8.21 -3.1
          lineToRelative(dx = 8.21f, dy = -3.1f)
          // V 8
          verticalLineTo(y = 8.0f)
          // L 13 11.1
          lineTo(x = 13.0f, y = 11.1f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6.86
          verticalLineToRelative(dy = 6.86f)
          // L 8 13
          lineTo(x = 8.0f, y = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // l 3 -1.14
          lineToRelative(dx = 3.0f, dy = -1.14f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // L 8 18
          lineTo(x = 8.0f, y = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // l 3 -1.14
          lineToRelative(dx = 3.0f, dy = -1.14f)
          // V 27
          verticalLineTo(y = 27.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 8 8 0 0 0 8 -8z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = -8.0f,
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
      .also { _currencyLira = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyLira: ImageVector? = null
