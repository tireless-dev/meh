// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryStraightFilled: ImageVector
  get() {
    val current = _directionRotaryStraightFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRotaryStraightFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="19.0" radius="3.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 19
          moveTo(x = 16.0f, y = 19.0f)
          // m -3 0
          moveToRelative(dx = -3.0f, dy = 0.0f)
          // a 3 3 0 1 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 1 1 -6 0z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-6.41 10.41 L17 7.83 v6.27 a5 5 0 0 1 0 9.8 V28 h-2 v-4.1 a5 5 0 0 1 0 -9.8 V7.83 l-4.59 4.58 L9 11 l7 -7 7 7Z
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
          // m -6.41 10.41
          moveToRelative(dx = -6.41f, dy = 10.41f)
          // L 17 7.83
          lineTo(x = 17.0f, y = 7.83f)
          // v 6.27
          verticalLineToRelative(dy = 6.27f)
          // a 5 5 0 0 1 0 9.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 9.8f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.1
          verticalLineToRelative(dy = -4.1f)
          // a 5 5 0 0 1 0 -9.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -9.8f,
          )
          // V 7.83
          verticalLineTo(y = 7.83f)
          // l -4.59 4.58
          lineToRelative(dx = -4.59f, dy = 4.58f)
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // M21.59 12.41 23 11 l-7 -7 -7 7 1.41 1.41 L15 7.83 v6.27 a5 5 0 0 0 0 9.8 V28 h2 v-4.1 a5 5 0 0 0 0 -9.8 V7.83Z M19 19 a3 3 0 1 1 -3 -3 3 3 0 0 1 3 3
        path {
          // M 21.59 12.41
          moveTo(x = 21.59f, y = 12.41f)
          // L 23 11
          lineTo(x = 23.0f, y = 11.0f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 15 7.83
          lineTo(x = 15.0f, y = 7.83f)
          // v 6.27
          verticalLineToRelative(dy = 6.27f)
          // a 5 5 0 0 0 0 9.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 9.8f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4.1
          verticalLineToRelative(dy = -4.1f)
          // a 5 5 0 0 0 0 -9.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -9.8f,
          )
          // V 7.83z
          verticalLineTo(y = 7.83f)
          close()
          // M 19 19
          moveTo(x = 19.0f, y = 19.0f)
          // a 3 3 0 1 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
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
      .also { _directionRotaryStraightFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRotaryStraightFilled: ImageVector? = null
