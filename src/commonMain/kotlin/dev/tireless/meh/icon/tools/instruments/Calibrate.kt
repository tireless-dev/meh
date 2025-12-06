// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Calibrate: ImageVector
  get() {
    val current = _calibrate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Calibrate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.83 21.17 25 17.37 l.67 -.67 a1 1 0 0 0 0 -1.41 l-6 -6 a1 1 0 0 0 -1.41 0 l-.79 .79 -6.76 -6.79 a1 1 0 0 0 -1.41 0 l-4 4 -.12 .15 -4 6 A1 1 0 0 0 1.3 14.7 l3 3 a1 1 0 0 0 1.42 0 L10 13.41 l2.09 2.09 -4.8 4.79 a1 1 0 0 0 0 1.41 l2 2 A1 1 0 0 0 10 24 a1 1 0 0 0 .52 -.15 l4.33 -2.6 2.44 2.45 a1 1 0 0 0 1.41 0 l.67 -.7 3.79 3.83 a4 4 0 0 0 5.66 -5.66Z M10 10.58 l-5 5 -1.71 -1.71 3.49 -5.24 L10 5.41 l6.09 6.09 -2.59 2.58Z m8 11 -2.84 -2.84 -5 3 L9.42 21 19 11.41 23.59 16Z m9.42 3.83 a2 2 0 0 1 -2.83 0 l-3.8 -3.79 2.83 -2.83 3.8 3.79 a2 2 0 0 1 0 2.83
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.83 21.17
          moveTo(x = 28.83f, y = 21.17f)
          // L 25 17.37
          lineTo(x = 25.0f, y = 17.37f)
          // l 0.67 -0.67
          lineToRelative(dx = 0.67f, dy = -0.67f)
          // a 1 1 0 0 0 0 -1.41
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.41f,
          )
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // a 1 1 0 0 0 -1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 0.0f,
          )
          // l -0.79 0.79
          lineToRelative(dx = -0.79f, dy = 0.79f)
          // l -6.76 -6.79
          lineToRelative(dx = -6.76f, dy = -6.79f)
          // a 1 1 0 0 0 -1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 0.0f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // l -0.12 0.15
          lineToRelative(dx = -0.12f, dy = 0.15f)
          // l -4 6
          lineToRelative(dx = -4.0f, dy = 6.0f)
          // A 1 1 0 0 0 1.3 14.7
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.3f,
            y1 = 14.7f,
          )
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // a 1 1 0 0 0 1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 0.0f,
          )
          // L 10 13.41
          lineTo(x = 10.0f, y = 13.41f)
          // l 2.09 2.09
          lineToRelative(dx = 2.09f, dy = 2.09f)
          // l -4.8 4.79
          lineToRelative(dx = -4.8f, dy = 4.79f)
          // a 1 1 0 0 0 0 1.41
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.41f,
          )
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // A 1 1 0 0 0 10 24
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 24.0f,
          )
          // a 1 1 0 0 0 0.52 -0.15
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.52f,
            dy1 = -0.15f,
          )
          // l 4.33 -2.6
          lineToRelative(dx = 4.33f, dy = -2.6f)
          // l 2.44 2.45
          lineToRelative(dx = 2.44f, dy = 2.45f)
          // a 1 1 0 0 0 1.41 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 0.0f,
          )
          // l 0.67 -0.7
          lineToRelative(dx = 0.67f, dy = -0.7f)
          // l 3.79 3.83
          lineToRelative(dx = 3.79f, dy = 3.83f)
          // a 4 4 0 0 0 5.66 -5.66z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.66f,
            dy1 = -5.66f,
          )
          close()
          // M 10 10.58
          moveTo(x = 10.0f, y = 10.58f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l -1.71 -1.71
          lineToRelative(dx = -1.71f, dy = -1.71f)
          // l 3.49 -5.24
          lineToRelative(dx = 3.49f, dy = -5.24f)
          // L 10 5.41
          lineTo(x = 10.0f, y = 5.41f)
          // l 6.09 6.09
          lineToRelative(dx = 6.09f, dy = 6.09f)
          // l -2.59 2.58z
          lineToRelative(dx = -2.59f, dy = 2.58f)
          close()
          // m 8 11
          moveToRelative(dx = 8.0f, dy = 11.0f)
          // l -2.84 -2.84
          lineToRelative(dx = -2.84f, dy = -2.84f)
          // l -5 3
          lineToRelative(dx = -5.0f, dy = 3.0f)
          // L 9.42 21
          lineTo(x = 9.42f, y = 21.0f)
          // L 19 11.41
          lineTo(x = 19.0f, y = 11.41f)
          // L 23.59 16z
          lineTo(x = 23.59f, y = 16.0f)
          close()
          // m 9.42 3.83
          moveToRelative(dx = 9.42f, dy = 3.83f)
          // a 2 2 0 0 1 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -3.8 -3.79
          lineToRelative(dx = -3.8f, dy = -3.79f)
          // l 2.83 -2.83
          lineToRelative(dx = 2.83f, dy = -2.83f)
          // l 3.8 3.79
          lineToRelative(dx = 3.8f, dy = 3.79f)
          // a 2 2 0 0 1 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.83f,
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
      .also { _calibrate = it }
  }

@Suppress("ObjectPropertyName")
private var _calibrate: ImageVector? = null
