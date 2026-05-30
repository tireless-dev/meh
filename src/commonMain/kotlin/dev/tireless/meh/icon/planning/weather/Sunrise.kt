// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sunrise: ImageVector
  get() {
    val current = _sunrise
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Sunrise",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 27
          moveTo(x = 2.0f, y = 27.0f)
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
        // <rect width="5" height="2" x="25.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 22
          moveTo(x = 25.0f, y = 22.0f)
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
          // M 21.68668 16.899105
          moveTo(x = 21.68668f, y = 16.899105f)
          // l 3.535534 -3.535534
          lineToRelative(dx = 3.535534f, dy = -3.535534f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -3.535534 3.535534z
          lineToRelative(dx = -3.535534f, dy = 3.535534f)
          close()
        }
        // <polygon points="16.0 4.0 11.0 9.0 12.41 10.41 15.0 7.83 15.0 8.0 15.0 15.0 17.0 15.0 17.0 8.0 17.0 7.83 19.59 10.41 21.0 9.0 16.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // L 11 9
          lineTo(x = 11.0f, y = 9.0f)
          // L 12.41 10.41
          lineTo(x = 12.41f, y = 10.41f)
          // L 15 7.83
          lineTo(x = 15.0f, y = 7.83f)
          // L 15 8
          lineTo(x = 15.0f, y = 8.0f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // L 17 15
          lineTo(x = 17.0f, y = 15.0f)
          // L 17 8
          lineTo(x = 17.0f, y = 8.0f)
          // L 17 7.83
          lineTo(x = 17.0f, y = 7.83f)
          // L 19.59 10.41
          lineTo(x = 19.59f, y = 10.41f)
          // L 21 9
          lineTo(x = 21.0f, y = 9.0f)
          // L 16 4z
          lineTo(x = 16.0f, y = 4.0f)
          close()
        }
        // <rect width="2" height="5" x="6.854" y="13.374" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.3932676 14.807481
          moveTo(x = 5.3932676f, y = 14.807481f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="5" height="2" x="2.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 22
          moveTo(x = 2.0f, y = 22.0f)
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
      .also { _sunrise = it }
  }

@Suppress("ObjectPropertyName")
private var _sunrise: ImageVector? = null
