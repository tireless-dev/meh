// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRight01: ImageVector
  get() {
    val current = _directionRight01
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRight01",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m19 4 -1.41 1.41 L22.17 10 H10 a2 2 0 0 0 -2 2 v16 h2 V12 h12.17 l-4.58 4.59 L19 18 l7 -7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 4
          moveTo(x = 19.0f, y = 4.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 22.17 10
          lineTo(x = 22.17f, y = 10.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // l -4.58 4.59
          lineToRelative(dx = -4.58f, dy = 4.59f)
          // L 19 18
          lineTo(x = 19.0f, y = 18.0f)
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
      .also { _directionRight01 = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRight01: ImageVector? = null
