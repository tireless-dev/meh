// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionLoopLeftFilled: ImageVector
  get() {
    val current = _directionLoopLeftFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionLoopLeftFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 18 h2 v8 h-2Z M4 15 l7 7 1.41 -1.41 L7.83 16 H21 a5 5 0 1 0 -5 -5 v1 h2 v-1 a3 3 0 1 1 3 3 H7.83 l4.58 -4.59 L11 8Z
        path {
          // M 16 18
          moveTo(x = 16.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // M 4 15
          moveTo(x = 4.0f, y = 15.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 7.83 16
          lineTo(x = 7.83f, y = 16.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // a 5 5 0 1 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 3 3 0 1 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // H 7.83
          horizontalLineTo(x = 7.83f)
          // l 4.58 -4.59
          lineToRelative(dx = 4.58f, dy = -4.59f)
          // L 11 8z
          lineTo(x = 11.0f, y = 8.0f)
          close()
        }
        // M2 4 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 m14 14 h2 v8 h-2Z M4 15 l7 -7 1.41 1.41 L7.83 14 H21 a3 3 0 1 0 -3 -3 v1 h-2 v-1 a5 5 0 1 1 5 5 H7.83 l4.58 4.59 L11 22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 4
          moveTo(x = 2.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // m 14 14
          moveToRelative(dx = 14.0f, dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // M 4 15
          moveTo(x = 4.0f, y = 15.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 7.83 14
          lineTo(x = 7.83f, y = 14.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // a 3 3 0 1 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 5 5 0 1 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // H 7.83
          horizontalLineTo(x = 7.83f)
          // l 4.58 4.59
          lineToRelative(dx = 4.58f, dy = 4.59f)
          // L 11 22z
          lineTo(x = 11.0f, y = 22.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _directionLoopLeftFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionLoopLeftFilled: ImageVector? = null
