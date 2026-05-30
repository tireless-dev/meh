// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tank: ImageVector
  get() {
    val current = _tank
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tank",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 13 v-2 H18.62 l-.73 -1.45 A1 1 0 0 0 17 9 H9 a1 1 0 0 0 -1 1 v5 H4 v2 h18.64 l3.6 3 H3 a1 1 0 0 0 -1 1 v2 a5 5 0 0 0 5 5 h18 a5 5 0 0 0 5 -5 v-2 a1 1 0 0 0 -.36 -.77 l-6 -5 A1 1 0 0 0 23 15 h-2.38 l-1 -2Z m-2 10 a3 3 0 0 1 -3 3 H7 a3 3 0 0 1 -3 -3 v-1 h24Z m-18 -8 v-4 h6.38 l2 4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 13
          moveTo(x = 30.0f, y = 13.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 18.62
          horizontalLineTo(x = 18.62f)
          // l -0.73 -1.45
          lineToRelative(dx = -0.73f, dy = -1.45f)
          // A 1 1 0 0 0 17 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 9.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 18.64
          horizontalLineToRelative(dx = 18.64f)
          // l 3.6 3
          lineToRelative(dx = 3.6f, dy = 3.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // a 5 5 0 0 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 0 -0.36 -0.77
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.36f,
            dy1 = -0.77f,
          )
          // l -6 -5
          lineToRelative(dx = -6.0f, dy = -5.0f)
          // A 1 1 0 0 0 23 15
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 15.0f,
          )
          // h -2.38
          horizontalLineToRelative(dx = -2.38f)
          // l -1 -2z
          lineToRelative(dx = -1.0f, dy = -2.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
          // m -18 -8
          moveToRelative(dx = -18.0f, dy = -8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6.38
          horizontalLineToRelative(dx = 6.38f)
          // l 2 4z
          lineToRelative(dx = 2.0f, dy = 4.0f)
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
      .also { _tank = it }
  }

@Suppress("ObjectPropertyName")
private var _tank: ImageVector? = null
