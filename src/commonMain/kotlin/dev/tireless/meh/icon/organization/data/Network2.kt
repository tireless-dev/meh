// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Network2: ImageVector
  get() {
    val current = _network2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Network2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 17 h5.14 a4 4 0 1 0 0 -2 H17 V7 h5.14 a4 4 0 1 0 0 -2 H17 a2 2 0 0 0 -2 2 v8 H9.86 a4 4 0 1 0 0 2 H15 v8 a2 2 0 0 0 2 2 h5.14 a4 4 0 1 0 0 -2 H17Z m9 -3 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 m0 -10 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M6 18 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m20 6 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 17
          moveTo(x = 17.0f, y = 17.0f)
          // h 5.14
          horizontalLineToRelative(dx = 5.14f)
          // a 4 4 0 1 0 0 -2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 5.14
          horizontalLineToRelative(dx = 5.14f)
          // a 4 4 0 1 0 0 -2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // a 4 4 0 1 0 0 2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 5.14
          horizontalLineToRelative(dx = 5.14f)
          // a 4 4 0 1 0 0 -2
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // H 17z
          horizontalLineTo(x = 17.0f)
          close()
          // m 9 -3
          moveToRelative(dx = 9.0f, dy = -3.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // M 6 18
          moveTo(x = 6.0f, y = 18.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m 20 6
          moveToRelative(dx = 20.0f, dy = 6.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
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
      .also { _network2 = it }
  }

@Suppress("ObjectPropertyName")
private var _network2: ImageVector? = null
