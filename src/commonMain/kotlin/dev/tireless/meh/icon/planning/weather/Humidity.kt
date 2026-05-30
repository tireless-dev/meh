// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Humidity: ImageVector
  get() {
    val current = _humidity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Humidity",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.48 14 16.85 3.43 a1.04 1.04 0 0 0 -1.7 0 L8.5 14.04 A10 10 0 0 0 7 19 a9 9 0 0 0 18 0 10 10 0 0 0 -1.52 -5 M16 26 a7 7 0 0 1 -7 -7 8 8 0 0 1 1.22 -3.94 l.93 -1.5 10.08 10.08 A7 7 0 0 1 16 26
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.48 14
          moveTo(x = 23.48f, y = 14.0f)
          // L 16.85 3.43
          lineTo(x = 16.85f, y = 3.43f)
          // a 1.04 1.04 0 0 0 -1.7 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.7f,
            dy1 = 0.0f,
          )
          // L 8.5 14.04
          lineTo(x = 8.5f, y = 14.04f)
          // A 10 10 0 0 0 7 19
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 19.0f,
          )
          // a 9 9 0 0 0 18 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 18.0f,
            dy1 = 0.0f,
          )
          // a 10 10 0 0 0 -1.52 -5
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.52f,
            dy1 = -5.0f,
          )
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // a 7 7 0 0 1 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // a 8 8 0 0 1 1.22 -3.94
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.22f,
            dy1 = -3.94f,
          )
          // l 0.93 -1.5
          lineToRelative(dx = 0.93f, dy = -1.5f)
          // l 10.08 10.08
          lineToRelative(dx = 10.08f, dy = 10.08f)
          // A 7 7 0 0 1 16 26
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 26.0f,
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
      .also { _humidity = it }
  }

@Suppress("ObjectPropertyName")
private var _humidity: ImageVector? = null
