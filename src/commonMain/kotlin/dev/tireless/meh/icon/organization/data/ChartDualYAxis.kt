// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartDualYAxis: ImageVector
  get() {
    val current = _chartDualYAxis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartDualYAxis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 v5.72 l-7.53 6.95 -8.09 -8.08 a2 2 0 0 0 -2.73 -.1 L4 11.45 V2 H2 v26 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V2z m0 8.44 v11.77 l-6.12 -6.12z M10.97 8 19 16.03 15.78 19 l-3.41 -3.42 a2 2 0 0 0 -2.73 -.09 L4 20.43 V14.1z M4 28 v-4.92 L10.95 17 l3.42 3.41 a2 2 0 0 0 2.77 .06 l3.27 -3.02 L28 25.03 V28z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // v 5.72
          verticalLineToRelative(dy = 5.72f)
          // l -7.53 6.95
          lineToRelative(dx = -7.53f, dy = 6.95f)
          // l -8.09 -8.08
          lineToRelative(dx = -8.09f, dy = -8.08f)
          // a 2 2 0 0 0 -2.73 -0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.73f,
            dy1 = -0.1f,
          )
          // L 4 11.45
          lineTo(x = 4.0f, y = 11.45f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // m 0 8.44
          moveToRelative(dx = 0.0f, dy = 8.44f)
          // v 11.77
          verticalLineToRelative(dy = 11.77f)
          // l -6.12 -6.12z
          lineToRelative(dx = -6.12f, dy = -6.12f)
          close()
          // M 10.97 8
          moveTo(x = 10.97f, y = 8.0f)
          // L 19 16.03
          lineTo(x = 19.0f, y = 16.03f)
          // L 15.78 19
          lineTo(x = 15.78f, y = 19.0f)
          // l -3.41 -3.42
          lineToRelative(dx = -3.41f, dy = -3.42f)
          // a 2 2 0 0 0 -2.73 -0.09
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.73f,
            dy1 = -0.09f,
          )
          // L 4 20.43
          lineTo(x = 4.0f, y = 20.43f)
          // V 14.1z
          verticalLineTo(y = 14.1f)
          close()
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -4.92
          verticalLineToRelative(dy = -4.92f)
          // L 10.95 17
          lineTo(x = 10.95f, y = 17.0f)
          // l 3.42 3.41
          lineToRelative(dx = 3.42f, dy = 3.41f)
          // a 2 2 0 0 0 2.77 0.06
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.77f,
            dy1 = 0.06f,
          )
          // l 3.27 -3.02
          lineToRelative(dx = 3.27f, dy = -3.02f)
          // L 28 25.03
          lineTo(x = 28.0f, y = 25.03f)
          // V 28z
          verticalLineTo(y = 28.0f)
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
      .also { _chartDualYAxis = it }
  }

@Suppress("ObjectPropertyName")
private var _chartDualYAxis: ImageVector? = null
