// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionLoopRight: ImageVector
  get() {
    val current = _directionLoopRight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionLoopRight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="8" x="14.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 20
          moveTo(x = 14.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M9 4 a7 7 0 0 1 7 7 v3 h-2 v-3 a5 5 0 1 0 -5 5 h17.17 l-4.58 -4.59 L23 10 l7 7 -7 7 -1.41 -1.41 L26.17 18 H9 A7 7 0 0 1 9 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // a 7 7 0 0 1 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // h 17.17
          horizontalLineToRelative(dx = 17.17f)
          // l -4.58 -4.59
          lineToRelative(dx = -4.58f, dy = -4.59f)
          // L 23 10
          lineTo(x = 23.0f, y = 10.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 26.17 18
          lineTo(x = 26.17f, y = 18.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // A 7 7 0 0 1 9 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 4.0f,
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
      .also { _directionLoopRight = it }
  }

@Suppress("ObjectPropertyName")
private var _directionLoopRight: ImageVector? = null
