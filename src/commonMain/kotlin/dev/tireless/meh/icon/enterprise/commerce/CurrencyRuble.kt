// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyRuble: ImageVector
  get() {
    val current = _currencyRuble
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyRuble",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 4 h-9 v11 H7 v2 h3 v3 H7 v2 h3 v6 h2 v-6 h9 v-2 h-9 v-3 h7 a6 6 0 0 0 6 -6 v-1 a6 6 0 0 0 -6 -6 m4 7 a4 4 0 0 1 -4 4 h-7 V6 h7 a4 4 0 0 1 4 4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 4
          moveTo(x = 19.0f, y = 4.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // m 4 7
          moveToRelative(dx = 4.0f, dy = 7.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 4 4 0 0 1 4 4z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
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
      .also { _currencyRuble = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyRuble: ImageVector? = null
