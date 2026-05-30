// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RainScatteredNight: ImageVector
  get() {
    val current = _rainScatteredNight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RainScatteredNight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8.5 32 a1 1 0 0 1 -.44 -.1 1 1 0 0 1 -.45 -1.35 l1.5 -3 a1 1 0 0 1 1.79 .9 l-1.5 3 A1 1 0 0 1 8.5 32 m21.34 -18.97 a1.5 1.5 0 0 0 -1.23 -.86 5.4 5.4 0 0 1 -3.4 -1.72 6.5 6.5 0 0 1 -1.3 -6.39 1.6 1.6 0 0 0 -.3 -1.55 1.5 1.5 0 0 0 -1.35 -.49 h-.02 a7.85 7.85 0 0 0 -6.1 6.48 A7 7 0 0 0 13.5 8 a7.55 7.55 0 0 0 -7.15 5.24 A6 6 0 0 0 8 25 h7.38 l-1.27 2.55 a1 1 0 1 0 1.78 .9 L17.62 25 H19 a5.95 5.95 0 0 0 5.88 -7.15 7.5 7.5 0 0 0 4.87 -3.3 1.5 1.5 0 0 0 .1 -1.52 M19 23 H8 a4 4 0 0 1 -.67 -7.93 l.66 -.11 .15 -.66 a5.5 5.5 0 0 1 10.72 0 l.15 .66 .66 .11 A4 4 0 0 1 19 23 m5.15 -7.05 a6 6 0 0 0 -3.5 -2.7 7.5 7.5 0 0 0 -2.62 -3.7 6 6 0 0 1 3.77 -5.33 8.5 8.5 0 0 0 1.94 7.6 7.4 7.4 0 0 0 3.9 2.22 5.4 5.4 0 0 1 -3.49 1.91
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.5 32
          moveTo(x = 8.5f, y = 32.0f)
          // a 1 1 0 0 1 -0.44 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = -0.1f,
          )
          // a 1 1 0 0 1 -0.45 -1.35
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -1.35f,
          )
          // l 1.5 -3
          lineToRelative(dx = 1.5f, dy = -3.0f)
          // a 1 1 0 0 1 1.79 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.79f,
            dy1 = 0.9f,
          )
          // l -1.5 3
          lineToRelative(dx = -1.5f, dy = 3.0f)
          // A 1 1 0 0 1 8.5 32
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.5f,
            y1 = 32.0f,
          )
          // m 21.34 -18.97
          moveToRelative(dx = 21.34f, dy = -18.97f)
          // a 1.5 1.5 0 0 0 -1.23 -0.86
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.23f,
            dy1 = -0.86f,
          )
          // a 5.4 5.4 0 0 1 -3.4 -1.72
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.4f,
            dy1 = -1.72f,
          )
          // a 6.5 6.5 0 0 1 -1.3 -6.39
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.3f,
            dy1 = -6.39f,
          )
          // a 1.6 1.6 0 0 0 -0.3 -1.55
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -1.55f,
          )
          // a 1.5 1.5 0 0 0 -1.35 -0.49
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.35f,
            dy1 = -0.49f,
          )
          // h -0.02
          horizontalLineToRelative(dx = -0.02f)
          // a 7.85 7.85 0 0 0 -6.1 6.48
          arcToRelative(
            a = 7.85f,
            b = 7.85f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.1f,
            dy1 = 6.48f,
          )
          // A 7 7 0 0 0 13.5 8
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.5f,
            y1 = 8.0f,
          )
          // a 7.55 7.55 0 0 0 -7.15 5.24
          arcToRelative(
            a = 7.55f,
            b = 7.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.15f,
            dy1 = 5.24f,
          )
          // A 6 6 0 0 0 8 25
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 25.0f,
          )
          // h 7.38
          horizontalLineToRelative(dx = 7.38f)
          // l -1.27 2.55
          lineToRelative(dx = -1.27f, dy = 2.55f)
          // a 1 1 0 1 0 1.78 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.78f,
            dy1 = 0.9f,
          )
          // L 17.62 25
          lineTo(x = 17.62f, y = 25.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // a 5.95 5.95 0 0 0 5.88 -7.15
          arcToRelative(
            a = 5.95f,
            b = 5.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.88f,
            dy1 = -7.15f,
          )
          // a 7.5 7.5 0 0 0 4.87 -3.3
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.87f,
            dy1 = -3.3f,
          )
          // a 1.5 1.5 0 0 0 0.1 -1.52
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -1.52f,
          )
          // M 19 23
          moveTo(x = 19.0f, y = 23.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 4 4 0 0 1 -0.67 -7.93
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.67f,
            dy1 = -7.93f,
          )
          // l 0.66 -0.11
          lineToRelative(dx = 0.66f, dy = -0.11f)
          // l 0.15 -0.66
          lineToRelative(dx = 0.15f, dy = -0.66f)
          // a 5.5 5.5 0 0 1 10.72 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.72f,
            dy1 = 0.0f,
          )
          // l 0.15 0.66
          lineToRelative(dx = 0.15f, dy = 0.66f)
          // l 0.66 0.11
          lineToRelative(dx = 0.66f, dy = 0.11f)
          // A 4 4 0 0 1 19 23
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 23.0f,
          )
          // m 5.15 -7.05
          moveToRelative(dx = 5.15f, dy = -7.05f)
          // a 6 6 0 0 0 -3.5 -2.7
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.5f,
            dy1 = -2.7f,
          )
          // a 7.5 7.5 0 0 0 -2.62 -3.7
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.62f,
            dy1 = -3.7f,
          )
          // a 6 6 0 0 1 3.77 -5.33
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.77f,
            dy1 = -5.33f,
          )
          // a 8.5 8.5 0 0 0 1.94 7.6
          arcToRelative(
            a = 8.5f,
            b = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.94f,
            dy1 = 7.6f,
          )
          // a 7.4 7.4 0 0 0 3.9 2.22
          arcToRelative(
            a = 7.4f,
            b = 7.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.9f,
            dy1 = 2.22f,
          )
          // a 5.4 5.4 0 0 1 -3.49 1.91
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.49f,
            dy1 = 1.91f,
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
      .also { _rainScatteredNight = it }
  }

@Suppress("ObjectPropertyName")
private var _rainScatteredNight: ImageVector? = null
