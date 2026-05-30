// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PersonFavorite: ImageVector
  get() {
    val current = _personFavorite
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PersonFavorite",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 31 H6 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 -2 -2 v-6 a2.95 2.95 0 0 1 3 -3 h6 a2.95 2.95 0 0 1 3 3 v6 a2 2 0 0 1 -2 2 v7 a2 2 0 0 1 -2 2 M5 13 a.94 .94 0 0 0 -1 1 v6 h2 v9 h4 v-9 h2 v-6 a.94 .94 0 0 0 -1 -1Z m3 -3 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m20.77 .26 A4.2 4.2 0 0 0 23 4.03 a4.2 4.2 0 0 0 -5.77 .23 4.3 4.3 0 0 0 0 6.04 L23 16.14 l5.77 -5.84 a4.3 4.3 0 0 0 0 -6.04 m-1.43 4.63 L23 13.3 l-4.34 -4.4 a2.3 2.3 0 0 1 0 -3.23 2.26 2.26 0 0 1 3.15 0 L23 6.86 l1.19 -1.2 a2.26 2.26 0 0 1 3.15 0 2.3 2.3 0 0 1 0 3.23
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 31
          moveTo(x = 10.0f, y = 31.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2.95 2.95 0 0 1 3 -3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2.95 2.95 0 0 1 3 3
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 5 13
          moveTo(x = 5.0f, y = 13.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 0.94 0.94 0 0 0 -1 -1z
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          close()
          // m 3 -3
          moveToRelative(dx = 3.0f, dy = -3.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 20.77 0.26
          moveToRelative(dx = 20.77f, dy = 0.26f)
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
      .also { _personFavorite = it }
  }

@Suppress("ObjectPropertyName")
private var _personFavorite: ImageVector? = null
