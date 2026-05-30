// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartAreaStepper: ImageVector
  get() {
    val current = _chartAreaStepper
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartAreaStepper",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 10 V6 H10 v6 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 V10Z m-10 4 V8 h8 v4 h8 v10 h-6 v-6 H12 v6 H4 v-8Z M4 28 v-4 h10 v-6 h6 v6 h8 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 10
          moveTo(x = 22.0f, y = 10.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // V 10z
          verticalLineTo(y = 10.0f)
          close()
          // m -10 4
          moveToRelative(dx = -10.0f, dy = 4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _chartAreaStepper = it }
  }

@Suppress("ObjectPropertyName")
private var _chartAreaStepper: ImageVector? = null
