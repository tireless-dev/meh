// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinRightOuter: ImageVector
  get() {
    val current = _joinRightOuter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinRightOuter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28.01 16 -5 5 -1.41 -1.41 L24.19 17 h-8.16 c-5.52 0 -10.02 4.11 -10.02 9.17 V28 h-2 v-1.83 c0 -4.45 2.82 -8.29 6.89 -10.09 a13 13 0 0 1 -1.26 -.69 l1.02 -1.74 a10 10 0 0 0 3.35 1.34 h10.17 l-2.59 -2.59 L23 10.99 l5 5Z M6.36 7.81 a11 11 0 0 1 -.39 -2.85 V4 H4.02 v.96 q0 1.75 .47 3.43z m1.54 6.23 1.31 -1.51 a10 10 0 0 1 -2.19 -2.97 l-1.74 .92 a12 12 0 0 0 2.62 3.56
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.01 16
          moveTo(x = 28.01f, y = 16.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 24.19 17
          lineTo(x = 24.19f, y = 17.0f)
          // h -8.16
          horizontalLineToRelative(dx = -8.16f)
          // c -5.52 0 -10.02 4.11 -10.02 9.17
          curveToRelative(
            dx1 = -5.52f,
            dy1 = 0.0f,
            dx2 = -10.02f,
            dy2 = 4.11f,
            dx3 = -10.02f,
            dy3 = 9.17f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1.83
          verticalLineToRelative(dy = -1.83f)
          // c 0 -4.45 2.82 -8.29 6.89 -10.09
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.45f,
            dx2 = 2.82f,
            dy2 = -8.29f,
            dx3 = 6.89f,
            dy3 = -10.09f,
          )
          // a 13 13 0 0 1 -1.26 -0.69
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.26f,
            dy1 = -0.69f,
          )
          // l 1.02 -1.74
          lineToRelative(dx = 1.02f, dy = -1.74f)
          // a 10 10 0 0 0 3.35 1.34
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.35f,
            dy1 = 1.34f,
          )
          // h 10.17
          horizontalLineToRelative(dx = 10.17f)
          // l -2.59 -2.59
          lineToRelative(dx = -2.59f, dy = -2.59f)
          // L 23 10.99
          lineTo(x = 23.0f, y = 10.99f)
          // l 5 5z
          lineToRelative(dx = 5.0f, dy = 5.0f)
          close()
          // M 6.36 7.81
          moveTo(x = 6.36f, y = 7.81f)
          // a 11 11 0 0 1 -0.39 -2.85
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.39f,
            dy1 = -2.85f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4.02
          horizontalLineTo(x = 4.02f)
          // v 0.96
          verticalLineToRelative(dy = 0.96f)
          // q 0 1.75 0.47 3.43z
          quadToRelative(
            dx1 = 0.0f,
            dy1 = 1.75f,
            dx2 = 0.47f,
            dy2 = 3.43f,
          )
          close()
          // m 1.54 6.23
          moveToRelative(dx = 1.54f, dy = 6.23f)
          // l 1.31 -1.51
          lineToRelative(dx = 1.31f, dy = -1.51f)
          // a 10 10 0 0 1 -2.19 -2.97
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.19f,
            dy1 = -2.97f,
          )
          // l -1.74 0.92
          lineToRelative(dx = -1.74f, dy = 0.92f)
          // a 12 12 0 0 0 2.62 3.56
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.62f,
            dy1 = 3.56f,
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
      .also { _joinRightOuter = it }
  }

@Suppress("ObjectPropertyName")
private var _joinRightOuter: ImageVector? = null
