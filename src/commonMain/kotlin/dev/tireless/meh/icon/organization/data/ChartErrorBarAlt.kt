// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartErrorBarAlt: ImageVector
  get() {
    val current = _chartErrorBarAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartErrorBarAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 10 V8 H8 v2 h2 v4.18 a2.98 2.98 0 0 0 0 5.64 V24 H8 v2 h6 v-2 h-2 v-4.18 a2.98 2.98 0 0 0 0 -5.64 V10Z m12 -4 V4 h-6 v2 h2 v2.18 a2.98 2.98 0 0 0 0 5.64 V18 h-2 v2 h6 v-2 h-2 v-4.18 a2.98 2.98 0 0 0 0 -5.64 V6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 10
          moveTo(x = 14.0f, y = 10.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4.18
          verticalLineToRelative(dy = 4.18f)
          // a 2.98 2.98 0 0 0 0 5.64
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 5.64f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.18
          verticalLineToRelative(dy = -4.18f)
          // a 2.98 2.98 0 0 0 0 -5.64
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -5.64f,
          )
          // V 10z
          verticalLineTo(y = 10.0f)
          close()
          // m 12 -4
          moveToRelative(dx = 12.0f, dy = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2.18
          verticalLineToRelative(dy = 2.18f)
          // a 2.98 2.98 0 0 0 0 5.64
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 5.64f,
          )
          // V 18
          verticalLineTo(y = 18.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.18
          verticalLineToRelative(dy = -4.18f)
          // a 2.98 2.98 0 0 0 0 -5.64
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -5.64f,
          )
          // V 6z
          verticalLineTo(y = 6.0f)
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
      .also { _chartErrorBarAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _chartErrorBarAlt: ImageVector? = null
