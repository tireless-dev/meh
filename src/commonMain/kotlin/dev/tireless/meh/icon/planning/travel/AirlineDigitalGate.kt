// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirlineDigitalGate: ImageVector
  get() {
    val current = _airlineDigitalGate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AirlineDigitalGate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 23 h-2 v-2 a3 3 0 0 0 -3 -3 H9 a3 3 0 0 0 -3 3 v2 H4 v-2 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M11 6 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 5 5 0 0 1 5 5z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          close()
          // M 11 6
          moveTo(x = 11.0f, y = 6.0f)
          // a 3 3 0 1 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5 5 0 1 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
        }
        // <rect width="28" height="2" x="2.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 26
          moveTo(x = 2.0f, y = 26.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M31.97 11.74 a1 1 0 0 0 -1.23 -.7 l-3.08 .82 L24 7 l-1 .27 1.46 5.45 -2.77 .74 L20 11.2 l-1 .26 .93 3.5 a1 1 0 0 0 1.23 .7 l10.1 -2.7 a1 1 0 0 0 .7 -1.23
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.97 11.74
          moveTo(x = 31.97f, y = 11.74f)
          // a 1 1 0 0 0 -1.23 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.23f,
            dy1 = -0.7f,
          )
          // l -3.08 0.82
          lineToRelative(dx = -3.08f, dy = 0.82f)
          // L 24 7
          lineTo(x = 24.0f, y = 7.0f)
          // l -1 0.27
          lineToRelative(dx = -1.0f, dy = 0.27f)
          // l 1.46 5.45
          lineToRelative(dx = 1.46f, dy = 5.45f)
          // l -2.77 0.74
          lineToRelative(dx = -2.77f, dy = 0.74f)
          // L 20 11.2
          lineTo(x = 20.0f, y = 11.2f)
          // l -1 0.26
          lineToRelative(dx = -1.0f, dy = 0.26f)
          // l 0.93 3.5
          lineToRelative(dx = 0.93f, dy = 3.5f)
          // a 1 1 0 0 0 1.23 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.23f,
            dy1 = 0.7f,
          )
          // l 10.1 -2.7
          lineToRelative(dx = 10.1f, dy = -2.7f)
          // a 1 1 0 0 0 0.7 -1.23
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.7f,
            dy1 = -1.23f,
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
      .also { _airlineDigitalGate = it }
  }

@Suppress("ObjectPropertyName")
private var _airlineDigitalGate: ImageVector? = null
