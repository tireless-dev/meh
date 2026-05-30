// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sunset: ImageVector
  get() {
    val current = _sunset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Sunset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="27.005" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 27.005
          moveTo(x = 2.0f, y = 27.005f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M16 20 a4 4 0 0 1 4 4 h2 a6 6 0 0 0 -12 0 h2 a4 4 0 0 1 4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 0 0 -12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
        }
        // <rect width="5" height="2" x="25.0" y="22.005" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 22.005
          moveTo(x = 25.0f, y = 22.005f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
          close()
        }
        // <rect width="5" height="2" x="21.668" y="14.854" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.687023 16.903934
          moveTo(x = 21.687023f, y = 16.903934f)
          // l 3.535534 -3.535534
          lineToRelative(dx = 3.535534f, dy = -3.535534f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -3.535534 3.535534z
          lineToRelative(dx = -3.535534f, dy = 3.535534f)
          close()
        }
        // <polygon points="19.59 9.595 17.0 12.175 17.0 4.005 15.0 4.005 15.0 12.175 12.41 9.595 11.0 11.005 16.0 16.005 21.0 11.005 19.59 9.595" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.59 9.595
          moveTo(x = 19.59f, y = 9.595f)
          // L 17 12.175
          lineTo(x = 17.0f, y = 12.175f)
          // L 17 4.005
          lineTo(x = 17.0f, y = 4.005f)
          // L 15 4.005
          lineTo(x = 15.0f, y = 4.005f)
          // L 15 12.175
          lineTo(x = 15.0f, y = 12.175f)
          // L 12.41 9.595
          lineTo(x = 12.41f, y = 9.595f)
          // L 11 11.005
          lineTo(x = 11.0f, y = 11.005f)
          // L 16 16.005
          lineTo(x = 16.0f, y = 16.005f)
          // L 21 11.005
          lineTo(x = 21.0f, y = 11.005f)
          // L 19.59 9.595z
          lineTo(x = 19.59f, y = 9.595f)
          close()
        }
        // <rect width="2" height="5" x="6.854" y="13.374" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.393612 14.81231
          moveTo(x = 5.393612f, y = 14.81231f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="5" height="2" x="2.0" y="22.005" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 22.005
          moveTo(x = 2.0f, y = 22.005f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
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
      .also { _sunset = it }
  }

@Suppress("ObjectPropertyName")
private var _sunset: ImageVector? = null
