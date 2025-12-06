// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DogWalker: ImageVector
  get() {
    val current = _dogWalker
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DogWalker",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="10" x="20.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="7" x="4.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 23
          moveTo(x = 4.0f, y = 23.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M16 30 h-2 v-4 a1 1 0 0 0 -1 -1 h-2 v5 H9 v-7 h4 a3 3 0 0 1 3 3Z m-8.5 -8 A3.5 3.5 0 0 1 4 18.5 V17 H2 v-2 h4 v3.5 a1.5 1.5 0 0 0 3 0 V15 h4 v2 h-2 v1.5 A3.5 3.5 0 0 1 7.5 22 M27 10 h-5.65 a3 3 0 0 0 -2.78 1.89 l-1.44 3.6 L13.52 20 l1.56 1.25 3.7 -4.62 1.65 -4 A1 1 0 0 1 21.35 12 H27 a1 1 0 0 1 1 1 v7 h-3 v10 h2 v-8 h1 a2 2 0 0 0 2 -2 v-7 a3 3 0 0 0 -3 -3 m-3 -1 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          close()
          // m -8.5 -8
          moveToRelative(dx = -8.5f, dy = -8.0f)
          // A 3.5 3.5 0 0 1 4 18.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 18.5f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3.5
          verticalLineToRelative(dy = 3.5f)
          // a 1.5 1.5 0 0 0 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1.5
          verticalLineToRelative(dy = 1.5f)
          // A 3.5 3.5 0 0 1 7.5 22
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.5f,
            y1 = 22.0f,
          )
          // M 27 10
          moveTo(x = 27.0f, y = 10.0f)
          // h -5.65
          horizontalLineToRelative(dx = -5.65f)
          // a 3 3 0 0 0 -2.78 1.89
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.78f,
            dy1 = 1.89f,
          )
          // l -1.44 3.6
          lineToRelative(dx = -1.44f, dy = 3.6f)
          // L 13.52 20
          lineTo(x = 13.52f, y = 20.0f)
          // l 1.56 1.25
          lineToRelative(dx = 1.56f, dy = 1.25f)
          // l 3.7 -4.62
          lineToRelative(dx = 3.7f, dy = -4.62f)
          // l 1.65 -4
          lineToRelative(dx = 1.65f, dy = -4.0f)
          // A 1 1 0 0 1 21.35 12
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.35f,
            y1 = 12.0f,
          )
          // H 27
          horizontalLineTo(x = 27.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
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
          // m -3 -1
          moveToRelative(dx = -3.0f, dy = -1.0f)
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
      .also { _dogWalker = it }
  }

@Suppress("ObjectPropertyName")
private var _dogWalker: ImageVector? = null
