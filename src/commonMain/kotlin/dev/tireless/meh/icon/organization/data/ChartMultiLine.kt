// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartMultiLine: ImageVector
  get() {
    val current = _chartMultiLine
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartMultiLine",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m4.59 28 7.17 -6 8 1.94 a2 2 0 0 0 1.31 -.12 L28 20.58 l-.85 -1.81 L20.24 22 l-8 -1.94 a2 2 0 0 0 -1.74 .38 L4 25.88 V20.5 L11.76 14 l8 1.94 a2 2 0 0 0 1.31 -.12 L28 12.58 l-.85 -1.81 L20.24 14 l-8 -1.94 a2 2 0 0 0 -1.74 .38 L4 17.88 V12.5 L11.76 6 l8 1.94 a2 2 0 0 0 1.31 -.12 L28 4.59 l-.85 -1.82 L20.24 6 l-8 -1.94 a2 2 0 0 0 -1.74 .38 L4 9.88 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.59 28
          moveTo(x = 4.59f, y = 28.0f)
          // l 7.17 -6
          lineToRelative(dx = 7.17f, dy = -6.0f)
          // l 8 1.94
          lineToRelative(dx = 8.0f, dy = 1.94f)
          // a 2 2 0 0 0 1.31 -0.12
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.31f,
            dy1 = -0.12f,
          )
          // L 28 20.58
          lineTo(x = 28.0f, y = 20.58f)
          // l -0.85 -1.81
          lineToRelative(dx = -0.85f, dy = -1.81f)
          // L 20.24 22
          lineTo(x = 20.24f, y = 22.0f)
          // l -8 -1.94
          lineToRelative(dx = -8.0f, dy = -1.94f)
          // a 2 2 0 0 0 -1.74 0.38
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.74f,
            dy1 = 0.38f,
          )
          // L 4 25.88
          lineTo(x = 4.0f, y = 25.88f)
          // V 20.5
          verticalLineTo(y = 20.5f)
          // L 11.76 14
          lineTo(x = 11.76f, y = 14.0f)
          // l 8 1.94
          lineToRelative(dx = 8.0f, dy = 1.94f)
          // a 2 2 0 0 0 1.31 -0.12
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.31f,
            dy1 = -0.12f,
          )
          // L 28 12.58
          lineTo(x = 28.0f, y = 12.58f)
          // l -0.85 -1.81
          lineToRelative(dx = -0.85f, dy = -1.81f)
          // L 20.24 14
          lineTo(x = 20.24f, y = 14.0f)
          // l -8 -1.94
          lineToRelative(dx = -8.0f, dy = -1.94f)
          // a 2 2 0 0 0 -1.74 0.38
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.74f,
            dy1 = 0.38f,
          )
          // L 4 17.88
          lineTo(x = 4.0f, y = 17.88f)
          // V 12.5
          verticalLineTo(y = 12.5f)
          // L 11.76 6
          lineTo(x = 11.76f, y = 6.0f)
          // l 8 1.94
          lineToRelative(dx = 8.0f, dy = 1.94f)
          // a 2 2 0 0 0 1.31 -0.12
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.31f,
            dy1 = -0.12f,
          )
          // L 28 4.59
          lineTo(x = 28.0f, y = 4.59f)
          // l -0.85 -1.82
          lineToRelative(dx = -0.85f, dy = -1.82f)
          // L 20.24 6
          lineTo(x = 20.24f, y = 6.0f)
          // l -8 -1.94
          lineToRelative(dx = -8.0f, dy = -1.94f)
          // a 2 2 0 0 0 -1.74 0.38
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.74f,
            dy1 = 0.38f,
          )
          // L 4 9.88
          lineTo(x = 4.0f, y = 9.88f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _chartMultiLine = it }
  }

@Suppress("ObjectPropertyName")
private var _chartMultiLine: ImageVector? = null
