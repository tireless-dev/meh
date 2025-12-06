// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionUTurn: ImageVector
  get() {
    val current = _directionUTurn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionUTurn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.59 19.59 22 24.17 V12 a8 8 0 0 0 -16 0 v16 h2 V12 a6 6 0 0 1 12 0 v12.17 l-4.59 -4.58 L14 21 l7 7 7 -7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.59 19.59
          moveTo(x = 26.59f, y = 19.59f)
          // L 22 24.17
          lineTo(x = 22.0f, y = 24.17f)
          // V 12
          verticalLineTo(y = 12.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 12
          verticalLineTo(y = 12.0f)
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
          // v 12.17
          verticalLineToRelative(dy = 12.17f)
          // l -4.59 -4.58
          lineToRelative(dx = -4.59f, dy = -4.58f)
          // L 14 21
          lineTo(x = 14.0f, y = 21.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
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
      .also { _directionUTurn = it }
  }

@Suppress("ObjectPropertyName")
private var _directionUTurn: ImageVector? = null
