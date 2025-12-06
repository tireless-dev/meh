// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionSharpTurnFilled: ImageVector
  get() {
    val current = _directionSharpTurnFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionSharpTurnFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-2 24 H16 v-2 h6.59 L8 9.41 V26 H6 V7 a1 1 0 0 1 1.7 -.7 L24 22.58 V16 h2Z
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
          // m -2 24
          moveToRelative(dx = -2.0f, dy = 24.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // L 8 9.41
          lineTo(x = 8.0f, y = 9.41f)
          // V 26
          verticalLineTo(y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 1 1.7 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.7f,
            dy1 = -0.7f,
          )
          // L 24 22.58
          lineTo(x = 24.0f, y = 22.58f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M26 26 H16 v-2 h6.59 L8 9.41 V26 H6 V7 a1 1 0 0 1 1.7 -.7 L24 22.58 V16 h2Z
        path {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // L 8 9.41
          lineTo(x = 8.0f, y = 9.41f)
          // V 26
          verticalLineTo(y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 1 1.7 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.7f,
            dy1 = -0.7f,
          )
          // L 24 22.58
          lineTo(x = 24.0f, y = 22.58f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _directionSharpTurnFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionSharpTurnFilled: ImageVector? = null
