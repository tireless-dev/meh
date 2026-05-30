// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Partnership: ImageVector
  get() {
    val current = _partnership
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Partnership",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 9 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m16 6 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m2 27 h-4 a2 2 0 0 1 -2 -2 v-7 h2 v7 h4 v-9 h2 v-6 a1 1 0 0 0 -1 -1 h-6.42 L16 20 l-4.58 -8 H5 a1 1 0 0 0 -1 1 v6 h2 v9 h4 v-7 h2 v7 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 -2 -2 v-6 a3 3 0 0 1 3 -3 h7.58 L16 16 l3.42 -6 H27 a3 3 0 0 1 3 3 v6 a2 2 0 0 1 -2 2 v7 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
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
          // m 16 6
          moveToRelative(dx = 16.0f, dy = 6.0f)
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
          // m 2 27
          moveToRelative(dx = 2.0f, dy = 27.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h -6.42
          horizontalLineToRelative(dx = -6.42f)
          // L 16 20
          lineTo(x = 16.0f, y = 20.0f)
          // l -4.58 -8
          lineToRelative(dx = -4.58f, dy = -8.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // h 7.58
          horizontalLineToRelative(dx = 7.58f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // l 3.42 -6
          lineToRelative(dx = 3.42f, dy = -6.0f)
          // H 27
          horizontalLineTo(x = 27.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
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
      .also { _partnership = it }
  }

@Suppress("ObjectPropertyName")
private var _partnership: ImageVector? = null
