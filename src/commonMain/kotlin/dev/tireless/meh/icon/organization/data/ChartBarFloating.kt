// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBarFloating: ImageVector
  get() {
    val current = _chartBarFloating
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartBarFloating",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 24 H14 v-8 h14Z m-12 -2 h10 v-4 H16Z m10 -10 H8 V4 h18Z m-16 -2 h14 V6 H10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
          // m -12 -2
          moveToRelative(dx = -12.0f, dy = -2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 16z
          horizontalLineTo(x = 16.0f)
          close()
          // m 10 -10
          moveToRelative(dx = 10.0f, dy = -10.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 18z
          horizontalLineToRelative(dx = 18.0f)
          close()
          // m -16 -2
          moveToRelative(dx = -16.0f, dy = -2.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
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
      .also { _chartBarFloating = it }
  }

@Suppress("ObjectPropertyName")
private var _chartBarFloating: ImageVector? = null
