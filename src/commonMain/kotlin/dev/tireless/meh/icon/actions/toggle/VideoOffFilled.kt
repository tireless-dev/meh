// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoOffFilled: ImageVector
  get() {
    val current = _videoOffFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VideoOffFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.31 6 H4 a2 2 0 0 0 -2 2 v16.29Z m9.15 2.11 a1 1 0 0 0 -1 .08 L23 12.06 v-1.62 l7 -7 L28.56 2 2 28.56 3.44 30 l4 -4 H21 a2 2 0 0 0 2 -2 v-4.06 l5.42 3.87 A1 1 0 0 0 30 23 V9 a1 1 0 0 0 -.54 -.89
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.31 6
          moveTo(x = 20.31f, y = 6.0f)
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
          // v 16.29z
          verticalLineToRelative(dy = 16.29f)
          close()
          // m 9.15 2.11
          moveToRelative(dx = 9.15f, dy = 2.11f)
          // a 1 1 0 0 0 -1 0.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.08f,
          )
          // L 23 12.06
          lineTo(x = 23.0f, y = 12.06f)
          // v -1.62
          verticalLineToRelative(dy = -1.62f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // L 28.56 2
          lineTo(x = 28.56f, y = 2.0f)
          // L 2 28.56
          lineTo(x = 2.0f, y = 28.56f)
          // L 3.44 30
          lineTo(x = 3.44f, y = 30.0f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // H 21
          horizontalLineTo(x = 21.0f)
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
          // v -4.06
          verticalLineToRelative(dy = -4.06f)
          // l 5.42 3.87
          lineToRelative(dx = 5.42f, dy = 3.87f)
          // A 1 1 0 0 0 30 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 23.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 0 -0.54 -0.89
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.54f,
            dy1 = -0.89f,
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
      .also { _videoOffFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _videoOffFilled: ImageVector? = null
