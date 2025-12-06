// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAccess: ImageVector
  get() {
    val current = _userAccess
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserAccess",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M9 10 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5 m21 4 a2 2 0 0 0 -.51 .07 l-1.06 -1.05 a3.9 3.9 0 0 0 0 -4.04 l1.06 -1.05 a2.03 2.03 0 1 0 -1.42 -1.42 l-1.05 1.06 a3.9 3.9 0 0 0 -4.04 0 L21.93 4.5 a2.03 2.03 0 1 0 -1.42 1.42 l1.06 1.05 a3.9 3.9 0 0 0 0 4.04 l-1.06 1.05 a2.03 2.03 0 1 0 1.42 1.42 l1.05 -1.06 a3.9 3.9 0 0 0 4.04 0 l1.05 1.06 A2 2 0 1 0 30 12 m-7 -3 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2
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
          // m 21 4
          moveToRelative(dx = 21.0f, dy = 4.0f)
          // a 2 2 0 0 0 -0.51 0.07
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = 0.07f,
          )
          // l -1.06 -1.05
          lineToRelative(dx = -1.06f, dy = -1.05f)
          // a 3.9 3.9 0 0 0 0 -4.04
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.04f,
          )
          // l 1.06 -1.05
          lineToRelative(dx = 1.06f, dy = -1.05f)
          // a 2.03 2.03 0 1 0 -1.42 -1.42
          arcToRelative(
            a = 2.03f,
            b = 2.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = -1.42f,
          )
          // l -1.05 1.06
          lineToRelative(dx = -1.05f, dy = 1.06f)
          // a 3.9 3.9 0 0 0 -4.04 0
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.04f,
            dy1 = 0.0f,
          )
          // L 21.93 4.5
          lineTo(x = 21.93f, y = 4.5f)
          // a 2.03 2.03 0 1 0 -1.42 1.42
          arcToRelative(
            a = 2.03f,
            b = 2.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 1.42f,
          )
          // l 1.06 1.05
          lineToRelative(dx = 1.06f, dy = 1.05f)
          // a 3.9 3.9 0 0 0 0 4.04
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 4.04f,
          )
          // l -1.06 1.05
          lineToRelative(dx = -1.06f, dy = 1.05f)
          // a 2.03 2.03 0 1 0 1.42 1.42
          arcToRelative(
            a = 2.03f,
            b = 2.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 1.42f,
          )
          // l 1.05 -1.06
          lineToRelative(dx = 1.05f, dy = -1.06f)
          // a 3.9 3.9 0 0 0 4.04 0
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.04f,
            dy1 = 0.0f,
          )
          // l 1.05 1.06
          lineToRelative(dx = 1.05f, dy = 1.06f)
          // A 2 2 0 1 0 30 12
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 12.0f,
          )
          // m -7 -3
          moveToRelative(dx = -7.0f, dy = -3.0f)
          // a 2 2 0 1 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
      .also { _userAccess = it }
  }

@Suppress("ObjectPropertyName")
private var _userAccess: ImageVector? = null
