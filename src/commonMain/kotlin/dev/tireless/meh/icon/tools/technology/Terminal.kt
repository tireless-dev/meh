// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Terminal: ImageVector
  get() {
    val current = _terminal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Terminal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 4.01 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-20 a2 2 0 0 0 -2 -2 m0 2 v4 H6 v-4Z m-20 20 v-14 h20 v14Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4.01
          moveTo(x = 26.0f, y = 4.01f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v -20
          verticalLineToRelative(dy = -20.0f)
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m -20 20
          moveToRelative(dx = -20.0f, dy = 20.0f)
          // v -14
          verticalLineToRelative(dy = -14.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 14z
          verticalLineToRelative(dy = 14.0f)
          close()
        }
        // <polygon points="10.76 16.18 13.58 19.01 10.76 21.84 12.17 23.25 16.41 19.01 12.17 14.77 10.76 16.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.76 16.18
          moveTo(x = 10.76f, y = 16.18f)
          // L 13.58 19.01
          lineTo(x = 13.58f, y = 19.01f)
          // L 10.76 21.84
          lineTo(x = 10.76f, y = 21.84f)
          // L 12.17 23.25
          lineTo(x = 12.17f, y = 23.25f)
          // L 16.41 19.01
          lineTo(x = 16.41f, y = 19.01f)
          // L 12.17 14.77
          lineTo(x = 12.17f, y = 14.77f)
          // L 10.76 16.18z
          lineTo(x = 10.76f, y = 16.18f)
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
      .also { _terminal = it }
  }

@Suppress("ObjectPropertyName")
private var _terminal: ImageVector? = null
