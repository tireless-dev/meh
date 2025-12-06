// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindyStrong: ImageVector
  get() {
    val current = _windyStrong
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WindyStrong",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 30 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 H4 v-2 h9 a5 5 0 0 1 0 10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 30
          moveTo(x = 13.0f, y = 30.0f)
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
          // h 9
          horizontalLineToRelative(dx = 9.0f)
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
        // M25 25 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 H2 v-2 h23 a5 5 0 0 1 0 10 m-4 -13 H6 v-2 h15 a3 3 0 1 0 -3 -3 h-2 a5 5 0 1 1 5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 25
          moveTo(x = 25.0f, y = 25.0f)
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
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 23
          horizontalLineToRelative(dx = 23.0f)
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
          // m -4 -13
          moveToRelative(dx = -4.0f, dy = -13.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
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
      .also { _windyStrong = it }
  }

@Suppress("ObjectPropertyName")
private var _windyStrong: ImageVector? = null
