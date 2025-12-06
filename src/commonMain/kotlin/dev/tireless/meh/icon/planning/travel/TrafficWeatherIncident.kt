// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrafficWeatherIncident: ImageVector
  get() {
    val current = _trafficWeatherIncident
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrafficWeatherIncident",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="6" x="2.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 24
          moveTo(x = 2.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="28" x="28.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 2
          moveTo(x = 15.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 10
          moveTo(x = 15.0f, y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 18
          moveTo(x = 15.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="15.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 26
          moveTo(x = 15.0f, y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M6 12 a3.9 3.9 0 0 1 -4 -3.78 4 4 0 0 1 .65 -2.06 L5.17 2.4 a1.04 1.04 0 0 1 1.66 0 l2.49 3.7 A4 4 0 0 1 10 8.22 3.9 3.9 0 0 1 6 12 m0 -7.24 L4.34 7.23 a2 2 0 0 0 -.34 1 A1.9 1.9 0 0 0 6 10 a1.9 1.9 0 0 0 2 -1.78 2 2 0 0 0 -.37 -1.04Z m5 7 -1.66 2.47 a2 2 0 0 0 -.34 1 A1.9 1.9 0 0 0 11 17 a1.9 1.9 0 0 0 2 -1.78 2 2 0 0 0 -.37 -1.04Z m-5 4 -1.66 2.47 a2 2 0 0 0 -.34 1 A1.9 1.9 0 0 0 6 21 a1.9 1.9 0 0 0 2 -1.78 2 2 0 0 0 -.37 -1.04Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // a 3.9 3.9 0 0 1 -4 -3.78
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -3.78f,
          )
          // a 4 4 0 0 1 0.65 -2.06
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.65f,
            dy1 = -2.06f,
          )
          // L 5.17 2.4
          lineTo(x = 5.17f, y = 2.4f)
          // a 1.04 1.04 0 0 1 1.66 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.66f,
            dy1 = 0.0f,
          )
          // l 2.49 3.7
          lineToRelative(dx = 2.49f, dy = 3.7f)
          // A 4 4 0 0 1 10 8.22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 8.22f,
          )
          // A 3.9 3.9 0 0 1 6 12
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 12.0f,
          )
          // m 0 -7.24
          moveToRelative(dx = 0.0f, dy = -7.24f)
          // L 4.34 7.23
          lineTo(x = 4.34f, y = 7.23f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // A 1.9 1.9 0 0 0 6 10
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 10.0f,
          )
          // a 1.9 1.9 0 0 0 2 -1.78
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.78f,
          )
          // a 2 2 0 0 0 -0.37 -1.04z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -1.04f,
          )
          close()
          // m 5 7
          moveToRelative(dx = 5.0f, dy = 7.0f)
          // l -1.66 2.47
          lineToRelative(dx = -1.66f, dy = 2.47f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // A 1.9 1.9 0 0 0 11 17
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 17.0f,
          )
          // a 1.9 1.9 0 0 0 2 -1.78
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.78f,
          )
          // a 2 2 0 0 0 -0.37 -1.04z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -1.04f,
          )
          close()
          // m -5 4
          moveToRelative(dx = -5.0f, dy = 4.0f)
          // l -1.66 2.47
          lineToRelative(dx = -1.66f, dy = 2.47f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // A 1.9 1.9 0 0 0 6 21
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 21.0f,
          )
          // a 1.9 1.9 0 0 0 2 -1.78
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.78f,
          )
          // a 2 2 0 0 0 -0.37 -1.04z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          dx1 = -0.37f,
          dy1 = -1.04f,
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
      .also { _trafficWeatherIncident = it }
  }

@Suppress("ObjectPropertyName")
private var _trafficWeatherIncident: ImageVector? = null
