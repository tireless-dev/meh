// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Windy: ImageVector
  get() {
    val current = _windy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Windy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 15 H8 v-2 h13 a3 3 0 1 0 -3 -3 h-2 a5 5 0 1 1 5 5 m2 13 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 H4 v-2 h19 a5 5 0 0 1 0 10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 15
          moveTo(x = 21.0f, y = 15.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // a 3 3 0 1 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 5 5 0 1 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // m 2 13
          moveToRelative(dx = 2.0f, dy = 13.0f)
          // a 5 5 0 0 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 3 3 0 1 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 19
          horizontalLineToRelative(dx = 19.0f)
          // a 5 5 0 0 1 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
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
      .also { _windy = it }
  }

@Suppress("ObjectPropertyName")
private var _windy: ImageVector? = null
