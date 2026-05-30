// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Movement: ImageVector
  get() {
    val current = _movement
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Movement",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m24 20 -1.41 1.41 L26.17 25 H10 a4 4 0 0 1 0 -8 h12 a6 6 0 0 0 0 -12 H5.83 l3.58 -3.59 L8 0 2 6 l6 6 1.41 -1.41 L5.83 7 H22 a4 4 0 0 1 0 8 H10 a6 6 0 0 0 0 12 h16.17 l-3.58 3.59 L24 32 l6 -6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 20
          moveTo(x = 24.0f, y = 20.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 25
          lineTo(x = 26.17f, y = 25.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 6 6 0 0 0 0 -12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -12.0f,
          )
          // H 5.83
          horizontalLineTo(x = 5.83f)
          // l 3.58 -3.59
          lineToRelative(dx = 3.58f, dy = -3.59f)
          // L 8 0
          lineTo(x = 8.0f, y = 0.0f)
          // L 2 6
          lineTo(x = 2.0f, y = 6.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 5.83 7
          lineTo(x = 5.83f, y = 7.0f)
          // H 22
          horizontalLineTo(x = 22.0f)
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 6 6 0 0 0 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // h 16.17
          horizontalLineToRelative(dx = 16.17f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 24 32
          lineTo(x = 24.0f, y = 32.0f)
          // l 6 -6z
          lineToRelative(dx = 6.0f, dy = -6.0f)
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
      .also { _movement = it }
  }

@Suppress("ObjectPropertyName")
private var _movement: ImageVector? = null
