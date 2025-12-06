// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureFahrenheitAlt: ImageVector
  get() {
    val current = _temperatureFahrenheitAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TemperatureFahrenheitAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.0 11.0 26.0 9.0 15.0 9.0 15.0 27.0 17.0 27.0 17.0 19.0 25.0 19.0 25.0 17.0 17.0 17.0 17.0 11.0 26.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 11
          moveTo(x = 26.0f, y = 11.0f)
          // L 26 9
          lineTo(x = 26.0f, y = 9.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 15 27
          lineTo(x = 15.0f, y = 27.0f)
          // L 17 27
          lineTo(x = 17.0f, y = 27.0f)
          // L 17 19
          lineTo(x = 17.0f, y = 19.0f)
          // L 25 19
          lineTo(x = 25.0f, y = 19.0f)
          // L 25 17
          lineTo(x = 25.0f, y = 17.0f)
          // L 17 17
          lineTo(x = 17.0f, y = 17.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 26 11z
          lineTo(x = 26.0f, y = 11.0f)
          close()
        }
        // M8 13 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 13
          moveTo(x = 8.0f, y = 13.0f)
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
      .also { _temperatureFahrenheitAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _temperatureFahrenheitAlt: ImageVector? = null
