// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureFeelsLike: ImageVector
  get() {
    val current = _temperatureFeelsLike
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TemperatureFeelsLike",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 h-4 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 -2 -2 v-6 a2.95 2.95 0 0 1 3 -3 h6 a2.95 2.95 0 0 1 3 3 v6 a2 2 0 0 1 -2 2 v7 a2 2 0 0 1 -2 2 m-5 -18 a.94 .94 0 0 0 -1 1 v6 h2 v9 h4 v-9 h2 v-6 a.94 .94 0 0 0 -1 -1Z m3 -3 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 M10 20.18 V12 H8 v8.18 a3 3 0 1 0 2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2.95 2.95 0 0 1 3 -3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2.95 2.95 0 0 1 3 3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
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
          // v 7
          verticalLineToRelative(dy = 7.0f)
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
          // m -5 -18
          moveToRelative(dx = -5.0f, dy = -18.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 0.94 0.94 0 0 0 -1 -1z
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          close()
          // m 3 -3
          moveToRelative(dx = 3.0f, dy = -3.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
          // M 10 20.18
          moveTo(x = 10.0f, y = 20.18f)
          // V 12
          verticalLineTo(y = 12.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 8.18
          verticalLineToRelative(dy = 8.18f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
        }
        // M9 30 a7 7 0 0 1 -5 -11.89 V7 a5 5 0 0 1 10 0 v11.11 A7 7 0 0 1 9 30 M9 4 a3 3 0 0 0 -3 3 v11.98 l-.33 .3 a5 5 0 1 0 6.66 0 L12 18.98 V7 a3 3 0 0 0 -3 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 30
          moveTo(x = 9.0f, y = 30.0f)
          // a 7 7 0 0 1 -5 -11.89
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -11.89f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 5 5 0 0 1 10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = 0.0f,
          )
          // v 11.11
          verticalLineToRelative(dy = 11.11f)
          // A 7 7 0 0 1 9 30
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 30.0f,
          )
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 11.98
          verticalLineToRelative(dy = 11.98f)
          // l -0.33 0.3
          lineToRelative(dx = -0.33f, dy = 0.3f)
          // a 5 5 0 1 0 6.66 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.66f,
            dy1 = 0.0f,
          )
          // L 12 18.98
          lineTo(x = 12.0f, y = 18.98f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          dx1 = -3.0f,
          dy1 = -3.0f,
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
      .also { _temperatureFeelsLike = it }
  }

@Suppress("ObjectPropertyName")
private var _temperatureFeelsLike: ImageVector? = null
