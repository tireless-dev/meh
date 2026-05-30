// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SatelliteWeather: ImageVector
  get() {
    val current = _satelliteWeather
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SatelliteWeather",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.5 12 H19 a4 4 0 0 1 0 -8 h.08 A4.8 4.8 0 0 1 23 2 a5 5 0 0 1 4.65 3.2 A3.5 3.5 0 0 1 30 8.5 a3.5 3.5 0 0 1 -3.5 3.5 M19 6 a2 2 0 0 0 0 4 h7.5 A1.5 1.5 0 0 0 28 8.5 a1.5 1.5 0 0 0 -1.28 -1.47 l-.66 -.1 -.16 -.65 a2.96 2.96 0 0 0 -5.49 -.71 L20.11 6Z m-6 22 v-3.11 a8 8 0 0 0 4.7 -2.28 1 1 0 0 0 0 -1.42 l-4.24 -4.24 L16 14.41 14.59 13 l-2.54 2.54 -4.24 -4.25 a1 1 0 0 0 -1.42 0 8 8 0 0 0 0 11.32 l.5 .46 L4.44 28 H2 v2 h28 v-2Z m-2 0 H6.67 l1.92 -3.84 A8 8 0 0 0 11 24.87Z m-3.2 -6.8 a6 6 0 0 1 -.64 -7.73 l8.37 8.37 A6 6 0 0 1 7.8 21.2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.5 12
          moveTo(x = 26.5f, y = 12.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // h 0.08
          horizontalLineToRelative(dx = 0.08f)
          // A 4.8 4.8 0 0 1 23 2
          arcTo(
            horizontalEllipseRadius = 4.8f,
            verticalEllipseRadius = 4.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 2.0f,
          )
          // a 5 5 0 0 1 4.65 3.2
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.65f,
            dy1 = 3.2f,
          )
          // A 3.5 3.5 0 0 1 30 8.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 8.5f,
          )
          // a 3.5 3.5 0 0 1 -3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.5f,
            dy1 = 3.5f,
          )
          // M 19 6
          moveTo(x = 19.0f, y = 6.0f)
          // a 2 2 0 0 0 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // h 7.5
          horizontalLineToRelative(dx = 7.5f)
          // A 1.5 1.5 0 0 0 28 8.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 8.5f,
          )
          // a 1.5 1.5 0 0 0 -1.28 -1.47
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = -1.47f,
          )
          // l -0.66 -0.1
          lineToRelative(dx = -0.66f, dy = -0.1f)
          // l -0.16 -0.65
          lineToRelative(dx = -0.16f, dy = -0.65f)
          // a 2.96 2.96 0 0 0 -5.49 -0.71
          arcToRelative(
            a = 2.96f,
            b = 2.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.49f,
            dy1 = -0.71f,
          )
          // L 20.11 6z
          lineTo(x = 20.11f, y = 6.0f)
          close()
          // m -6 22
          moveToRelative(dx = -6.0f, dy = 22.0f)
          // v -3.11
          verticalLineToRelative(dy = -3.11f)
          // a 8 8 0 0 0 4.7 -2.28
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.7f,
            dy1 = -2.28f,
          )
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // l -4.24 -4.24
          lineToRelative(dx = -4.24f, dy = -4.24f)
          // L 16 14.41
          lineTo(x = 16.0f, y = 14.41f)
          // L 14.59 13
          lineTo(x = 14.59f, y = 13.0f)
          // l -2.54 2.54
          lineToRelative(dx = -2.54f, dy = 2.54f)
          // l -4.24 -4.25
          lineToRelative(dx = -4.24f, dy = -4.25f)
          // a 1 1 0 0 0 -1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 0.0f,
          )
          // a 8 8 0 0 0 0 11.32
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 11.32f,
          )
          // l 0.5 0.46
          lineToRelative(dx = 0.5f, dy = 0.46f)
          // L 4.44 28
          lineTo(x = 4.44f, y = 28.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // H 6.67
          horizontalLineTo(x = 6.67f)
          // l 1.92 -3.84
          lineToRelative(dx = 1.92f, dy = -3.84f)
          // A 8 8 0 0 0 11 24.87z
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 24.87f,
          )
          close()
          // m -3.2 -6.8
          moveToRelative(dx = -3.2f, dy = -6.8f)
          // a 6 6 0 0 1 -0.64 -7.73
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.64f,
            dy1 = -7.73f,
          )
          // l 8.37 8.37
          lineToRelative(dx = 8.37f, dy = 8.37f)
          // A 6 6 0 0 1 7.8 21.2
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.8f,
            y1 = 21.2f,
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
      .also { _satelliteWeather = it }
  }

@Suppress("ObjectPropertyName")
private var _satelliteWeather: ImageVector? = null
