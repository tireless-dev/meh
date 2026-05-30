// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionStraightFilled: ImageVector
  get() {
    val current = _directionStraightFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionStraightFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-6.41 11.41 L17 8.83 V26 h-2 V8.83 l-4.59 4.58 L9 12 l7 -7 7 7Z
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
          // m -6.41 11.41
          moveToRelative(dx = -6.41f, dy = 11.41f)
          // L 17 8.83
          lineTo(x = 17.0f, y = 8.83f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8.83
          verticalLineTo(y = 8.83f)
          // l -4.59 4.58
          lineToRelative(dx = -4.59f, dy = 4.58f)
          // L 9 12
          lineTo(x = 9.0f, y = 12.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // M21.59 13.41 17 8.83 V26 h-2 V8.83 l-4.59 4.58 L9 12 l7 -7 7 7Z
        path {
          // M 21.59 13.41
          moveTo(x = 21.59f, y = 13.41f)
          // L 17 8.83
          lineTo(x = 17.0f, y = 8.83f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8.83
          verticalLineTo(y = 8.83f)
          // l -4.59 4.58
          lineToRelative(dx = -4.59f, dy = 4.58f)
          // L 9 12
          lineTo(x = 9.0f, y = 12.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
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
      .also { _directionStraightFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionStraightFilled: ImageVector? = null
