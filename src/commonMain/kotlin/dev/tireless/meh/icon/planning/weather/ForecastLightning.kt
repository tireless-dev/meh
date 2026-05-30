// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForecastLightning: ImageVector
  get() {
    val current = _forecastLightning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ForecastLightning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.67 24.0 13.934 23.0 16.221 19.0 12.332 19.0 16.325 12.0 18.062 13.0 15.778 17.0 19.668 17.0 15.67 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.67 24
          moveTo(x = 15.67f, y = 24.0f)
          // L 13.934 23
          lineTo(x = 13.934f, y = 23.0f)
          // L 16.221 19
          lineTo(x = 16.221f, y = 19.0f)
          // L 12.332 19
          lineTo(x = 12.332f, y = 19.0f)
          // L 16.325 12
          lineTo(x = 16.325f, y = 12.0f)
          // L 18.062 13
          lineTo(x = 18.062f, y = 13.0f)
          // L 15.778 17
          lineTo(x = 15.778f, y = 17.0f)
          // L 19.668 17
          lineTo(x = 19.668f, y = 17.0f)
          // L 15.67 24z
          lineTo(x = 15.67f, y = 24.0f)
          close()
        }
        // M26 18 A10 10 0 1 1 16 8 h4 v5 l6 -6 -6 -6 v5 h-4 a12 12 0 1 0 12 12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // A 10 10 0 1 1 16 8
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 12 12 0 1 0 12 12z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
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
      .also { _forecastLightning = it }
  }

@Suppress("ObjectPropertyName")
private var _forecastLightning: ImageVector? = null
