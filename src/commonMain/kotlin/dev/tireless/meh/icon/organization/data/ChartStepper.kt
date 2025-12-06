// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartStepper: ImageVector
  get() {
    val current = _chartStepper
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartStepper",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 22 v-8 h8 V6 h8 V4 H20 v8 h-8 v8 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4 v-6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 22
          moveTo(x = 14.0f, y = 22.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
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
      .also { _chartStepper = it }
  }

@Suppress("ObjectPropertyName")
private var _chartStepper: ImageVector? = null
