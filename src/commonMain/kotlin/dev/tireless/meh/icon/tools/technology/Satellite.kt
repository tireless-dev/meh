// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Satellite: ImageVector
  get() {
    val current = _satellite
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Satellite",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m22.91 16.5 2.8 -2.8 a1 1 0 0 0 0 -1.4 L23.4 10 l2.09 -2.09 L28.59 11 30 9.59 22.41 2 21 3.41 l3.09 3.09 L22 8.59 l-2.3 -2.3 a1 1 0 0 0 -1.4 0 l-2.8 2.8 -6.8 -6.8 a1 1 0 0 0 -1.4 0 l-5 5 a1 1 0 0 0 0 1.42 l6.79 6.79 -2.8 2.8 a1 1 0 0 0 0 1.4 L8.6 22 6.5 24.09 3.41 21 2 22.41 9.59 30 11 28.59 7.91 25.5 10 23.41 l2.3 2.3 a1 1 0 0 0 1.4 0 l2.8 -2.8 6.8 6.8 a1 1 0 0 0 1.4 0 l5 -5 a1 1 0 0 0 0 -1.42Z M4.41 8 8 4.41 l2.09 2.09 -3.59 3.59Z m3.5 3.5 3.59 -3.59 2.59 2.59 -3.59 3.59Z M13 23.59 8.41 19 19 8.41 23.59 13Z m4.91 -2.09 3.59 -3.59 2.59 2.59 -3.59 3.59Z M24 27.59 l-2.09 -2.09 3.59 -3.59 L27.59 24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.91 16.5
          moveTo(x = 22.91f, y = 16.5f)
          // l 2.8 -2.8
          lineToRelative(dx = 2.8f, dy = -2.8f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // L 23.4 10
          lineTo(x = 23.4f, y = 10.0f)
          // l 2.09 -2.09
          lineToRelative(dx = 2.09f, dy = -2.09f)
          // L 28.59 11
          lineTo(x = 28.59f, y = 11.0f)
          // L 30 9.59
          lineTo(x = 30.0f, y = 9.59f)
          // L 22.41 2
          lineTo(x = 22.41f, y = 2.0f)
          // L 21 3.41
          lineTo(x = 21.0f, y = 3.41f)
          // l 3.09 3.09
          lineToRelative(dx = 3.09f, dy = 3.09f)
          // L 22 8.59
          lineTo(x = 22.0f, y = 8.59f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // l -2.8 2.8
          lineToRelative(dx = -2.8f, dy = 2.8f)
          // l -6.8 -6.8
          lineToRelative(dx = -6.8f, dy = -6.8f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l 6.79 6.79
          lineToRelative(dx = 6.79f, dy = 6.79f)
          // l -2.8 2.8
          lineToRelative(dx = -2.8f, dy = 2.8f)
          // a 1 1 0 0 0 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // L 8.6 22
          lineTo(x = 8.6f, y = 22.0f)
          // L 6.5 24.09
          lineTo(x = 6.5f, y = 24.09f)
          // L 3.41 21
          lineTo(x = 3.41f, y = 21.0f)
          // L 2 22.41
          lineTo(x = 2.0f, y = 22.41f)
          // L 9.59 30
          lineTo(x = 9.59f, y = 30.0f)
          // L 11 28.59
          lineTo(x = 11.0f, y = 28.59f)
          // L 7.91 25.5
          lineTo(x = 7.91f, y = 25.5f)
          // L 10 23.41
          lineTo(x = 10.0f, y = 23.41f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 2.8 -2.8
          lineToRelative(dx = 2.8f, dy = -2.8f)
          // l 6.8 6.8
          lineToRelative(dx = 6.8f, dy = 6.8f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 1 1 0 0 0 0 -1.42z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          close()
          // M 4.41 8
          moveTo(x = 4.41f, y = 8.0f)
          // L 8 4.41
          lineTo(x = 8.0f, y = 4.41f)
          // l 2.09 2.09
          lineToRelative(dx = 2.09f, dy = 2.09f)
          // l -3.59 3.59z
          lineToRelative(dx = -3.59f, dy = 3.59f)
          close()
          // m 3.5 3.5
          moveToRelative(dx = 3.5f, dy = 3.5f)
          // l 3.59 -3.59
          lineToRelative(dx = 3.59f, dy = -3.59f)
          // l 2.59 2.59
          lineToRelative(dx = 2.59f, dy = 2.59f)
          // l -3.59 3.59z
          lineToRelative(dx = -3.59f, dy = 3.59f)
          close()
          // M 13 23.59
          moveTo(x = 13.0f, y = 23.59f)
          // L 8.41 19
          lineTo(x = 8.41f, y = 19.0f)
          // L 19 8.41
          lineTo(x = 19.0f, y = 8.41f)
          // L 23.59 13z
          lineTo(x = 23.59f, y = 13.0f)
          close()
          // m 4.91 -2.09
          moveToRelative(dx = 4.91f, dy = -2.09f)
          // l 3.59 -3.59
          lineToRelative(dx = 3.59f, dy = -3.59f)
          // l 2.59 2.59
          lineToRelative(dx = 2.59f, dy = 2.59f)
          // l -3.59 3.59z
          lineToRelative(dx = -3.59f, dy = 3.59f)
          close()
          // M 24 27.59
          moveTo(x = 24.0f, y = 27.59f)
          // l -2.09 -2.09
          lineToRelative(dx = -2.09f, dy = -2.09f)
          // l 3.59 -3.59
          lineToRelative(dx = 3.59f, dy = -3.59f)
          // L 27.59 24z
          lineTo(x = 27.59f, y = 24.0f)
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
      .also { _satellite = it }
  }

@Suppress("ObjectPropertyName")
private var _satellite: ImageVector? = null
