// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryError: ImageVector
  get() {
    val current = _batteryError
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BatteryError",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 11 h-1 v-1 a2 2 0 0 0 -2 -2 h-7 v2 h7 v3 h3 v6 h-3 v3 H6 v-5 H4 v5 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 v-1 h1 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 M9 15 A6 6 0 1 0 8.99 2.99 6 6 0 0 0 9 15 M9 5 a4 4 0 0 1 3.43 6.02 L6.98 5.57 A4 4 0 0 1 9 5 M5.57 6.98 l5.45 5.45 a4 4 0 0 1 -5.45 -5.45
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
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
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
          // M 9 15
          moveTo(x = 9.0f, y = 15.0f)
          // A 6 6 0 1 0 8.99 2.99
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 8.99f,
            y1 = 2.99f,
          )
          // A 6 6 0 0 0 9 15
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 15.0f,
          )
          // M 9 5
          moveTo(x = 9.0f, y = 5.0f)
          // a 4 4 0 0 1 3.43 6.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.43f,
            dy1 = 6.02f,
          )
          // L 6.98 5.57
          lineTo(x = 6.98f, y = 5.57f)
          // A 4 4 0 0 1 9 5
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 5.0f,
          )
          // M 5.57 6.98
          moveTo(x = 5.57f, y = 6.98f)
          // l 5.45 5.45
          lineToRelative(dx = 5.45f, dy = 5.45f)
          // a 4 4 0 0 1 -5.45 -5.45
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.45f,
            dy1 = -5.45f,
          )
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
      .also { _batteryError = it }
  }

@Suppress("ObjectPropertyName")
private var _batteryError: ImageVector? = null
