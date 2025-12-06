// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionUTurnFilled: ImageVector
  get() {
    val current = _directionUTurnFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionUTurnFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.59 17.59 22 22.17 V14 a8 8 0 0 0 -16 0 v12 h2 V14 a6 6 0 0 1 12 0 v8.17 l-4.59 -4.58 L14 19 l7 7 7 -7Z
        path {
          // M 26.59 17.59
          moveTo(x = 26.59f, y = 17.59f)
          // L 22 22.17
          lineTo(x = 22.0f, y = 22.17f)
          // V 14
          verticalLineTo(y = 14.0f)
          // a 8 8 0 0 0 -16 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -16.0f,
            dy1 = 0.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // a 6 6 0 0 1 12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 12.0f,
            dy1 = 0.0f,
          )
          // v 8.17
          verticalLineToRelative(dy = 8.17f)
          // l -4.59 -4.58
          lineToRelative(dx = -4.59f, dy = -4.58f)
          // L 14 19
          lineTo(x = 14.0f, y = 19.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-7 24 -7 -7 1.41 -1.41 L20 22.17 V14 a6 6 0 0 0 -12 0 v12 H6 V14 a8 8 0 0 1 16 0 v8.17 l4.59 -4.58 L28 19Z
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
          // m -7 24
          moveToRelative(dx = -7.0f, dy = 24.0f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 20 22.17
          lineTo(x = 20.0f, y = 22.17f)
          // V 14
          verticalLineTo(y = 14.0f)
          // a 6 6 0 0 0 -12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // a 8 8 0 0 1 16 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 16.0f,
            dy1 = 0.0f,
          )
          // v 8.17
          verticalLineToRelative(dy = 8.17f)
          // l 4.59 -4.58
          lineToRelative(dx = 4.59f, dy = -4.58f)
          // L 28 19z
          lineTo(x = 28.0f, y = 19.0f)
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
      .also { _directionUTurnFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionUTurnFilled: ImageVector? = null
