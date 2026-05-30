// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartWinLoss: ImageVector
  get() {
    val current = _chartWinLoss
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartWinLoss",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15 H16 V6 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v9 H2 v2 h14 v9 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-9 h2Z M6 6 h8 v9 H6Z m20 20 h-8 v-9 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 20 20
          moveToRelative(dx = 20.0f, dy = 20.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _chartWinLoss = it }
  }

@Suppress("ObjectPropertyName")
private var _chartWinLoss: ImageVector? = null
