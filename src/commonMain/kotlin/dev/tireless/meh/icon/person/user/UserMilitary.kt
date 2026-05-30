// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserMilitary: ImageVector
  get() {
    val current = _userMilitary
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserMilitary",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 13.0 23.407 16.0 20.0 16.414 22.5 18.667 22.0 22.0 25.0 20.125 28.0 22.0 27.5 18.667 30.0 16.414 26.5 16.0 25.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 13
          moveTo(x = 25.0f, y = 13.0f)
          // L 23.407 16
          lineTo(x = 23.407f, y = 16.0f)
          // L 20 16.414
          lineTo(x = 20.0f, y = 16.414f)
          // L 22.5 18.667
          lineTo(x = 22.5f, y = 18.667f)
          // L 22 22
          lineTo(x = 22.0f, y = 22.0f)
          // L 25 20.125
          lineTo(x = 25.0f, y = 20.125f)
          // L 28 22
          lineTo(x = 28.0f, y = 22.0f)
          // L 27.5 18.667
          lineTo(x = 27.5f, y = 18.667f)
          // L 30 16.414
          lineTo(x = 30.0f, y = 16.414f)
          // L 26.5 16
          lineTo(x = 26.5f, y = 16.0f)
          // L 25 13z
          lineTo(x = 25.0f, y = 13.0f)
          close()
        }
        // <polygon points="21.414 13.414 25.0 9.834 25.0 9.834 28.587 13.416 30.0 12.0 25.0 7.0 20.0 12.0 21.414 13.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.414 13.414
          moveTo(x = 21.414f, y = 13.414f)
          // L 25 9.834
          lineTo(x = 25.0f, y = 9.834f)
          // L 25 9.834
          lineTo(x = 25.0f, y = 9.834f)
          // L 28.587 13.416
          lineTo(x = 28.587f, y = 13.416f)
          // L 30 12
          lineTo(x = 30.0f, y = 12.0f)
          // L 25 7
          lineTo(x = 25.0f, y = 7.0f)
          // L 20 12
          lineTo(x = 20.0f, y = 12.0f)
          // L 21.414 13.414z
          lineTo(x = 21.414f, y = 13.414f)
          close()
        }
        // <polygon points="21.414 8.414 25.0 4.834 25.0 4.834 28.587 8.416 30.0 7.0 25.0 2.0 20.0 7.0 21.414 8.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.414 8.414
          moveTo(x = 21.414f, y = 8.414f)
          // L 25 4.834
          lineTo(x = 25.0f, y = 4.834f)
          // L 25 4.834
          lineTo(x = 25.0f, y = 4.834f)
          // L 28.587 8.416
          lineTo(x = 28.587f, y = 8.416f)
          // L 30 7
          lineTo(x = 30.0f, y = 7.0f)
          // L 25 2
          lineTo(x = 25.0f, y = 2.0f)
          // L 20 7
          lineTo(x = 20.0f, y = 7.0f)
          // L 21.414 8.414z
          lineTo(x = 21.414f, y = 8.414f)
          close()
        }
        // M16 30 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M9 10 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // M 9 10
          moveTo(x = 9.0f, y = 10.0f)
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
      .also { _userMilitary = it }
  }

@Suppress("ObjectPropertyName")
private var _userMilitary: ImageVector? = null
