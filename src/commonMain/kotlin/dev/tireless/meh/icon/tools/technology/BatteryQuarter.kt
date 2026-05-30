// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryQuarter: ImageVector
  get() {
    val current = _batteryQuarter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BatteryQuarter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 24 H6 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v1 h1 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 h-1 v1 a2 2 0 0 1 -2 2 M6 10 v12 h18 v-3 h3 v-6 h-3 v-3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 6 10
          moveTo(x = 6.0f, y = 10.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
        }
        // <rect width="8" height="4" x="6.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 12
          moveTo(x = 12.0f, y = 12.0f)
          // l -3.496911E-7 8
          lineToRelative(dx = -3.496911E-7f, dy = 8.0f)
          // l -4 -1.7484555E-7
          lineToRelative(dx = -4.0f, dy = -1.7484555E-7f)
          // l 3.496911E-7 -8z
          lineToRelative(dx = 3.496911E-7f, dy = -8.0f)
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
      .also { _batteryQuarter = it }
  }

@Suppress("ObjectPropertyName")
private var _batteryQuarter: ImageVector? = null
