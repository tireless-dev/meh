// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartHighLow: ImageVector
  get() {
    val current = _chartHighLow
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartHighLow",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.0 8.0 12.0 8.0 12.0 6.0 10.0 6.0 10.0 20.0 7.0 20.0 7.0 22.0 10.0 22.0 10.0 24.0 12.0 24.0 12.0 10.0 15.0 10.0 15.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 8
          moveTo(x = 15.0f, y = 8.0f)
          // L 12 8
          lineTo(x = 12.0f, y = 8.0f)
          // L 12 6
          lineTo(x = 12.0f, y = 6.0f)
          // L 10 6
          lineTo(x = 10.0f, y = 6.0f)
          // L 10 20
          lineTo(x = 10.0f, y = 20.0f)
          // L 7 20
          lineTo(x = 7.0f, y = 20.0f)
          // L 7 22
          lineTo(x = 7.0f, y = 22.0f)
          // L 10 22
          lineTo(x = 10.0f, y = 22.0f)
          // L 10 24
          lineTo(x = 10.0f, y = 24.0f)
          // L 12 24
          lineTo(x = 12.0f, y = 24.0f)
          // L 12 10
          lineTo(x = 12.0f, y = 10.0f)
          // L 15 10
          lineTo(x = 15.0f, y = 10.0f)
          // L 15 8z
          lineTo(x = 15.0f, y = 8.0f)
          close()
        }
        // <polygon points="27.0 10.0 24.0 10.0 24.0 6.0 22.0 6.0 22.0 18.0 19.0 18.0 19.0 20.0 22.0 20.0 22.0 24.0 24.0 24.0 24.0 12.0 27.0 12.0 27.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 10
          moveTo(x = 27.0f, y = 10.0f)
          // L 24 10
          lineTo(x = 24.0f, y = 10.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // L 19 18
          lineTo(x = 19.0f, y = 18.0f)
          // L 19 20
          lineTo(x = 19.0f, y = 20.0f)
          // L 22 20
          lineTo(x = 22.0f, y = 20.0f)
          // L 22 24
          lineTo(x = 22.0f, y = 24.0f)
          // L 24 24
          lineTo(x = 24.0f, y = 24.0f)
          // L 24 12
          lineTo(x = 24.0f, y = 12.0f)
          // L 27 12
          lineTo(x = 27.0f, y = 12.0f)
          // L 27 10z
          lineTo(x = 27.0f, y = 10.0f)
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
      .also { _chartHighLow = it }
  }

@Suppress("ObjectPropertyName")
private var _chartHighLow: ImageVector? = null
