// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserFavoriteAlt: ImageVector
  get() {
    val current = _userFavoriteAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserFavoriteAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.77 4.26 A4.2 4.2 0 0 0 23 4.03 a4.2 4.2 0 0 0 -5.77 .23 4.3 4.3 0 0 0 0 6.04 L23 16.14 l5.77 -5.84 a4.3 4.3 0 0 0 0 -6.04 m-1.43 4.63 L23 13.3 l-4.34 -4.4 a2.3 2.3 0 0 1 0 -3.23 2.26 2.26 0 0 1 3.15 0 L23 6.86 l1.19 -1.2 a2.26 2.26 0 0 1 3.15 0 2.3 2.3 0 0 1 0 3.23 M16 30 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M9 10 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.77 4.26
          moveTo(x = 28.77f, y = 4.26f)
          // A 4.2 4.2 0 0 0 23 4.03
          arcTo(
            horizontalEllipseRadius = 4.2f,
            verticalEllipseRadius = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 4.03f,
          )
          // a 4.2 4.2 0 0 0 -5.77 0.23
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.77f,
            dy1 = 0.23f,
          )
          // a 4.3 4.3 0 0 0 0 6.04
          arcToRelative(
            a = 4.3f,
            b = 4.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.04f,
          )
          // L 23 16.14
          lineTo(x = 23.0f, y = 16.14f)
          // l 5.77 -5.84
          lineToRelative(dx = 5.77f, dy = -5.84f)
          // a 4.3 4.3 0 0 0 0 -6.04
          arcToRelative(
            a = 4.3f,
            b = 4.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.04f,
          )
          // m -1.43 4.63
          moveToRelative(dx = -1.43f, dy = 4.63f)
          // L 23 13.3
          lineTo(x = 23.0f, y = 13.3f)
          // l -4.34 -4.4
          lineToRelative(dx = -4.34f, dy = -4.4f)
          // a 2.3 2.3 0 0 1 0 -3.23
          arcToRelative(
            a = 2.3f,
            b = 2.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.23f,
          )
          // a 2.26 2.26 0 0 1 3.15 0
          arcToRelative(
            a = 2.26f,
            b = 2.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.15f,
            dy1 = 0.0f,
          )
          // L 23 6.86
          lineTo(x = 23.0f, y = 6.86f)
          // l 1.19 -1.2
          lineToRelative(dx = 1.19f, dy = -1.2f)
          // a 2.26 2.26 0 0 1 3.15 0
          arcToRelative(
            a = 2.26f,
            b = 2.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.15f,
            dy1 = 0.0f,
          )
          // a 2.3 2.3 0 0 1 0 3.23
          arcToRelative(
            a = 2.3f,
            b = 2.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.23f,
          )
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
      .also { _userFavoriteAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _userFavoriteAlt: ImageVector? = null
