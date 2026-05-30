// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBubble: ImageVector
  get() {
    val current = _chartBubble
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartBubble",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
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
        // M10 16 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 m0 -2 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4 m11 -8 a4 4 0 1 1 -4 4 4 4 0 0 1 4 -4 m0 -2 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6 m3.5 17 a1.5 1.5 0 1 1 -1.5 1.5 1.5 1.5 0 0 1 1.5 -1.5 m0 -2 a3.5 3.5 0 1 0 3.5 3.5 3.5 3.5 0 0 0 -3.5 -3.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 4 4 0 1 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // m 11 -8
          moveToRelative(dx = 11.0f, dy = -8.0f)
          // a 4 4 0 1 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 6 6 0 1 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
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
          // m 3.5 17
          moveToRelative(dx = 3.5f, dy = 17.0f)
          // a 1.5 1.5 0 1 1 -1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = 1.5f,
          )
          // a 1.5 1.5 0 0 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 3.5 3.5 0 1 0 3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.5f,
            dy1 = 3.5f,
          )
          // a 3.5 3.5 0 0 0 -3.5 -3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.5f,
            dy1 = -3.5f,
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
      .also { _chartBubble = it }
  }

@Suppress("ObjectPropertyName")
private var _chartBubble: ImageVector? = null
