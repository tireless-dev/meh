// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionLoopRightFilled: ImageVector
  get() {
    val current = _directionLoopRightFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionLoopRightFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 26 h-2 v-8 h2Z m5 -18 -1.41 1.41 L24.17 14 H11 a3 3 0 1 1 3 -3 v1 h2 v-1 a5 5 0 1 0 -5 5 h13.17 l-4.58 4.59 L21 22 l7 -7Z
        path {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 5 -18
          moveToRelative(dx = 5.0f, dy = -18.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 24.17 14
          lineTo(x = 24.17f, y = 14.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 5 5 0 1 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // h 13.17
          horizontalLineToRelative(dx = 13.17f)
          // l -4.58 4.59
          lineToRelative(dx = -4.58f, dy = 4.59f)
          // L 21 22
          lineTo(x = 21.0f, y = 22.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M16 26 h-2 v-8 h2Z m5 -4 -1.41 -1.41 L24.17 16 H11 a5 5 0 1 1 5 -5 v1 h-2 v-1 a3 3 0 1 0 -3 3 h13.17 L19.6 9.41 21 8 l7 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
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
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 5 -4
          moveToRelative(dx = 5.0f, dy = -4.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 24.17 16
          lineTo(x = 24.17f, y = 16.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 5 5 0 1 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 3 3 0 1 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // h 13.17
          horizontalLineToRelative(dx = 13.17f)
          // L 19.6 9.41
          lineTo(x = 19.6f, y = 9.41f)
          // L 21 8
          lineTo(x = 21.0f, y = 8.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _directionLoopRightFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionLoopRightFilled: ImageVector? = null
