// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartErrorBar: ImageVector
  get() {
    val current = _chartErrorBar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartErrorBar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 28 V12 h-4 V8 h2 V6 h-6 v2 h2 v4 h-4 v16 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m-8 -14 h2 v4 h-2Z m6 14 h-6 v-8 h6Z m0 -10 h-2 v-4 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 28
          moveTo(x = 22.0f, y = 28.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // m -8 -14
          moveToRelative(dx = -8.0f, dy = -14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 6 14
          moveToRelative(dx = 6.0f, dy = 14.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _chartErrorBar = it }
  }

@Suppress("ObjectPropertyName")
private var _chartErrorBar: ImageVector? = null
