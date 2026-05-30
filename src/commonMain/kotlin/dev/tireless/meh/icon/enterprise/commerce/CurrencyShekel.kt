// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyShekel: ImageVector
  get() {
    val current = _currencyShekel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyShekel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M9 27 H7 V5 h8 a5 5 0 0 1 5 5 v12 h-2 V10 a3 3 0 0 0 -3 -3 H9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 27
          moveTo(x = 9.0f, y = 27.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // H 9z
          horizontalLineTo(x = 9.0f)
          close()
        }
        // M20 27 h-8 V10 h2 v15 h6 a3 3 0 0 0 3 -3 V5 h2 v17 a5 5 0 0 1 -5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 27
          moveTo(x = 20.0f, y = 27.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
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
      .also { _currencyShekel = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyShekel: ImageVector? = null
