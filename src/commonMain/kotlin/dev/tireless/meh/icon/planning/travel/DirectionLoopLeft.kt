// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionLoopLeft: ImageVector
  get() {
    val current = _directionLoopLeft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionLoopLeft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="8" x="16.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M23 4 a7 7 0 0 0 -7 7 v3 h2 v-3 a5 5 0 1 1 5 5 H5.83 l4.58 -4.59 L9 10 l-7 7 7 7 1.41 -1.41 L5.83 18 H23 a7 7 0 0 0 0 -14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 4
          moveTo(x = 23.0f, y = 4.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // H 5.83
          horizontalLineTo(x = 5.83f)
          // l 4.58 -4.59
          lineToRelative(dx = 4.58f, dy = -4.59f)
          // L 9 10
          lineTo(x = 9.0f, y = 10.0f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 5.83 18
          lineTo(x = 5.83f, y = 18.0f)
          // H 23
          horizontalLineTo(x = 23.0f)
          // a 7 7 0 0 0 0 -14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -14.0f,
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
      .also { _directionLoopLeft = it }
  }

@Suppress("ObjectPropertyName")
private var _directionLoopLeft: ImageVector? = null
