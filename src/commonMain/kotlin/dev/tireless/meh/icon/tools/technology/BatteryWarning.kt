// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryWarning: ImageVector
  get() {
    val current = _batteryWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BatteryWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 11 h-1 v-1 a2 2 0 0 0 -2 -2 H14 v2 h10 v3 h3 v6 h-3 v3 H6 v-5 H4 v5 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 v-1 h1 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-13 3 a1 1 0 0 0 -.08 -.39 L8.89 3.55 a1 1 0 0 0 -1.78 0 l-5 10 a1 1 0 0 0 .45 1.34 A1 1 0 0 0 3.01 15 h10 a1 1 0 0 0 1 -1z m-9.38 -1 L8 6.24 11.38 13z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 11
          moveTo(x = 27.0f, y = 11.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -13 3
          moveToRelative(dx = -13.0f, dy = 3.0f)
          // a 1 1 0 0 0 -0.08 -0.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.08f,
            dy1 = -0.39f,
          )
          // L 8.89 3.55
          lineTo(x = 8.89f, y = 3.55f)
          // a 1 1 0 0 0 -1.78 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.78f,
            dy1 = 0.0f,
          )
          // l -5 10
          lineToRelative(dx = -5.0f, dy = 10.0f)
          // a 1 1 0 0 0 0.45 1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.45f,
            dy1 = 1.34f,
          )
          // A 1 1 0 0 0 3.01 15
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.01f,
            y1 = 15.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 1 -1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          close()
          // m -9.38 -1
          moveToRelative(dx = -9.38f, dy = -1.0f)
          // L 8 6.24
          lineTo(x = 8.0f, y = 6.24f)
          // L 11.38 13z
          lineTo(x = 11.38f, y = 13.0f)
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
      .also { _batteryWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _batteryWarning: ImageVector? = null
