// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRight02Filled: ImageVector
  get() {
    val current = _directionRight02Filled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRight02Filled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M8 6 h2 v8 H8Z m11 18 -1.41 -1.41 L22.17 18 H10 v8 H8 v-8 a2 2 0 0 1 2 -2 h12.17 l-4.58 -4.59 L19 10 l7 7Z
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
          // M 8 6
          moveTo(x = 8.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 11 18
          moveToRelative(dx = 11.0f, dy = 18.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 22.17 18
          lineTo(x = 22.17f, y = 18.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // l -4.58 -4.59
          lineToRelative(dx = -4.58f, dy = -4.59f)
          // L 19 10
          lineTo(x = 19.0f, y = 10.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // M8 6 h2 v8 H8Z m11 18 -1.41 -1.41 L22.17 18 H10 v8 H8 v-8 a2 2 0 0 1 2 -2 h12.17 l-4.58 -4.59 L19 10 l7 7Z
        path {
          // M 8 6
          moveTo(x = 8.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 11 18
          moveToRelative(dx = 11.0f, dy = 18.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 22.17 18
          lineTo(x = 22.17f, y = 18.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // l -4.58 -4.59
          lineToRelative(dx = -4.58f, dy = -4.59f)
          // L 19 10
          lineTo(x = 19.0f, y = 10.0f)
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
      .also { _directionRight02Filled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRight02Filled: ImageVector? = null
