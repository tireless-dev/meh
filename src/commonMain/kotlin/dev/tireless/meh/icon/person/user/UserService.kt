// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserService: ImageVector
  get() {
    val current = _userService
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserService",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.02 10.43 A4 4 0 0 1 21 11 a4 4 0 0 1 -3.85 -5.02 l2.44 2.43 A2 2 0 0 0 23 7 a2 2 0 0 0 -.59 -1.41 l-2.43 -2.44 A4 4 0 0 1 25 7 a4 4 0 0 1 -.57 2.02 L30 14.59 28.59 16z M16 30 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5z M9 10 a3 3 0 1 1 0 6 3 3 0 0 1 0 -6 m0 -2 a5 5 0 1 0 0 10 A5 5 0 0 0 9 8
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.02 10.43
          moveTo(x = 23.02f, y = 10.43f)
          // A 4 4 0 0 1 21 11
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 11.0f,
          )
          // a 4 4 0 0 1 -3.85 -5.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.85f,
            dy1 = -5.02f,
          )
          // l 2.44 2.43
          lineToRelative(dx = 2.44f, dy = 2.43f)
          // A 2 2 0 0 0 23 7
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 7.0f,
          )
          // a 2 2 0 0 0 -0.59 -1.41
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.59f,
            dy1 = -1.41f,
          )
          // l -2.43 -2.44
          lineToRelative(dx = -2.43f, dy = -2.44f)
          // A 4 4 0 0 1 25 7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 7.0f,
          )
          // a 4 4 0 0 1 -0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.57f,
            dy1 = 2.02f,
          )
          // L 30 14.59
          lineTo(x = 30.0f, y = 14.59f)
          // L 28.59 16z
          lineTo(x = 28.59f, y = 16.0f)
          close()
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
          // a 3 3 0 1 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5 5 0 1 0 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
          // A 5 5 0 0 0 9 8
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 8.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _userService = it }
  }

@Suppress("ObjectPropertyName")
private var _userService: ImageVector? = null
