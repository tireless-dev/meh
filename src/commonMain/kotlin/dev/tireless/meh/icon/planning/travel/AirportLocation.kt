// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirportLocation: ImageVector
  get() {
    val current = _airportLocation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AirportLocation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15 h-6.07 A8 8 0 0 0 17 8.07 V2 h-2 v6.07 A8 8 0 0 0 8.07 15 H2 v2 h6.07 A8 8 0 0 0 15 23.93 V30 h2 v-6.07 A8 8 0 0 0 23.93 17 H30Z m-14 7 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
          // h -6.07
          horizontalLineToRelative(dx = -6.07f)
          // A 8 8 0 0 0 17 8.07
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 8.07f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6.07
          verticalLineToRelative(dy = 6.07f)
          // A 8 8 0 0 0 8.07 15
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.07f,
            y1 = 15.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.07
          horizontalLineToRelative(dx = 6.07f)
          // A 8 8 0 0 0 15 23.93
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 23.93f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6.07
          verticalLineToRelative(dy = -6.07f)
          // A 8 8 0 0 0 23.93 17
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.93f,
            y1 = 17.0f,
          )
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // m -14 7
          moveToRelative(dx = -14.0f, dy = 7.0f)
          // a 6 6 0 1 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
        // l 0 -32
        lineToRelative(dx = 0.0f, dy = -32.0f)
        // l 32 -0z
        lineToRelative(dx = 32.0f, dy = -0.0f)
        close()
      }
    }.build()
      .also { _airportLocation = it }
  }

@Suppress("ObjectPropertyName")
private var _airportLocation: ImageVector? = null
