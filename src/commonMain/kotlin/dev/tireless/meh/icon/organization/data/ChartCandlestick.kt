// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartCandlestick: ImageVector
  get() {
    val current = _chartCandlestick
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartCandlestick",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 10 h-2 V6 h-2 v4 h-2 v12 h2 v4 h2 v-4 h2Z m-2 10 h-2 v-8 h2Z M14 8 h-2 V4 h-2 v4 H8 v10 h2 v4 h2 v-4 h2Z m-2 8 h-2 v-6 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 10
          moveTo(x = 26.0f, y = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 14 8
          moveTo(x = 14.0f, y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -2 8
          moveToRelative(dx = -2.0f, dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M30 30 H4 a2 2 0 0 1 -2 -2 V2 h2 v26 h26Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // h 26z
          horizontalLineToRelative(dx = 26.0f)
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
      .also { _chartCandlestick = it }
  }

@Suppress("ObjectPropertyName")
private var _chartCandlestick: ImageVector? = null
