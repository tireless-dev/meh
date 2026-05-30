// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirlineRapidBoard: ImageVector
  get() {
    val current = _airlineRapidBoard
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AirlineRapidBoard",
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
        // <polygon points="30.0 8.0 28.0 8.0 28.0 6.0 26.0 6.0 26.0 4.0 30.0 4.0 30.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 8
          moveTo(x = 30.0f, y = 8.0f)
          // L 28 8
          lineTo(x = 28.0f, y = 8.0f)
          // L 28 6
          lineTo(x = 28.0f, y = 6.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 26 4
          lineTo(x = 26.0f, y = 4.0f)
          // L 30 4
          lineTo(x = 30.0f, y = 4.0f)
          // L 30 8z
          lineTo(x = 30.0f, y = 8.0f)
          close()
        }
        // <polygon points="19.0 4.0 23.0 4.0 23.0 6.0 21.0 6.0 21.0 8.0 19.0 8.0 19.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 4
          moveTo(x = 19.0f, y = 4.0f)
          // L 23 4
          lineTo(x = 23.0f, y = 4.0f)
          // L 23 6
          lineTo(x = 23.0f, y = 6.0f)
          // L 21 6
          lineTo(x = 21.0f, y = 6.0f)
          // L 21 8
          lineTo(x = 21.0f, y = 8.0f)
          // L 19 8
          lineTo(x = 19.0f, y = 8.0f)
          // L 19 4z
          lineTo(x = 19.0f, y = 4.0f)
          close()
        }
        // <rect width="2" height="2" x="28.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 13
          moveTo(x = 28.0f, y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="26.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 11
          moveTo(x = 26.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="19.0 11.0 21.0 11.0 21.0 13.0 23.0 13.0 23.0 15.0 19.0 15.0 19.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 11
          moveTo(x = 19.0f, y = 11.0f)
          // L 21 11
          lineTo(x = 21.0f, y = 11.0f)
          // L 21 13
          lineTo(x = 21.0f, y = 13.0f)
          // L 23 13
          lineTo(x = 23.0f, y = 13.0f)
          // L 23 15
          lineTo(x = 23.0f, y = 15.0f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 19 11z
          lineTo(x = 19.0f, y = 11.0f)
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
      .also { _airlineRapidBoard = it }
  }

@Suppress("ObjectPropertyName")
private var _airlineRapidBoard: ImageVector? = null
