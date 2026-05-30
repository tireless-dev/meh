// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionForkFilled: ImageVector
  get() {
    val current = _directionForkFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionForkFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="8.0 14.0 8.0 9.414 15.0 16.414 15.0 26.0 17.0 26.0 17.0 16.414 24.0 9.414 24.0 14.0 26.0 14.0 26.0 6.0 18.0 6.0 18.0 8.0 22.586 8.0 16.0 14.586 9.414 8.0 14.0 8.0 14.0 6.0 6.0 6.0 6.0 14.0 8.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // L 8 9.414
          lineTo(x = 8.0f, y = 9.414f)
          // L 15 16.414
          lineTo(x = 15.0f, y = 16.414f)
          // L 15 26
          lineTo(x = 15.0f, y = 26.0f)
          // L 17 26
          lineTo(x = 17.0f, y = 26.0f)
          // L 17 16.414
          lineTo(x = 17.0f, y = 16.414f)
          // L 24 9.414
          lineTo(x = 24.0f, y = 9.414f)
          // L 24 14
          lineTo(x = 24.0f, y = 14.0f)
          // L 26 14
          lineTo(x = 26.0f, y = 14.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 18 6
          lineTo(x = 18.0f, y = 6.0f)
          // L 18 8
          lineTo(x = 18.0f, y = 8.0f)
          // L 22.586 8
          lineTo(x = 22.586f, y = 8.0f)
          // L 16 14.586
          lineTo(x = 16.0f, y = 14.586f)
          // L 9.414 8
          lineTo(x = 9.414f, y = 8.0f)
          // L 14 8
          lineTo(x = 14.0f, y = 8.0f)
          // L 14 6
          lineTo(x = 14.0f, y = 6.0f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // L 6 14
          lineTo(x = 6.0f, y = 14.0f)
          // L 8 14z
          lineTo(x = 8.0f, y = 14.0f)
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-2 12 h-2 V9.41 l-7 7 V26 h-2 v-9.59 l-7 -7 V14 H6 V6 h8 v2 H9.41 L16 14.59 22.59 8 H18 V6 h8Z
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
          // m -2 12
          moveToRelative(dx = -2.0f, dy = 12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9.41
          verticalLineTo(y = 9.41f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -9.59
          verticalLineToRelative(dy = -9.59f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 9.41
          horizontalLineTo(x = 9.41f)
          // L 16 14.59
          lineTo(x = 16.0f, y = 14.59f)
          // L 22.59 8
          lineTo(x = 22.59f, y = 8.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _directionForkFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionForkFilled: ImageVector? = null
