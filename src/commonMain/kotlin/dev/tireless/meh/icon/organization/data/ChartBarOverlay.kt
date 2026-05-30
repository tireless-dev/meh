// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBarOverlay: ImageVector
  get() {
    val current = _chartBarOverlay
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartBarOverlay",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 28 v-2 h22 V16 H4 v-2 h14 V4 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m20 -10 v6 H4 v-2 h16 v-2 H4 v-2Z M16 6 v6 H4 v-2 h8 V8 H4 V6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // m 20 -10
          moveToRelative(dx = 20.0f, dy = -10.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 16 6
          moveTo(x = 16.0f, y = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
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
      .also { _chartBarOverlay = it }
  }

@Suppress("ObjectPropertyName")
private var _chartBarOverlay: ImageVector? = null
