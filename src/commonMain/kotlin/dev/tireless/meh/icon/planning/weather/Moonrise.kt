// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moonrise: ImageVector
  get() {
    val current = _moonrise
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Moonrise",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28
          moveTo(x = 2.0f, y = 28.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M26 26 h-2 a8 8 0 0 0 -2.04 -5.33 l1.5 -1.34 A10 10 0 0 1 26 26 m-10 0 h-2 a10 10 0 0 1 3.75 -7.8 A8 8 0 0 0 16 18 a8 8 0 0 0 -8 8 H6 a10 10 0 0 1 10 -10 10 10 0 0 1 4.45 1.05 1 1 0 0 1 0 1.8 A8 8 0 0 0 16 26
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 8 8 0 0 0 -2.04 -5.33
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.04f,
            dy1 = -5.33f,
          )
          // l 1.5 -1.34
          lineToRelative(dx = 1.5f, dy = -1.34f)
          // A 10 10 0 0 1 26 26
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 26.0f,
          )
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 10 10 0 0 1 3.75 -7.8
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.75f,
            dy1 = -7.8f,
          )
          // A 8 8 0 0 0 16 18
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 18.0f,
          )
          // a 8 8 0 0 0 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 8.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 10 10 0 0 1 10 -10
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = -10.0f,
          )
          // a 10 10 0 0 1 4.45 1.05
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.45f,
            dy1 = 1.05f,
          )
          // a 1 1 0 0 1 0 1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.8f,
          )
          // A 8 8 0 0 0 16 26
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 26.0f,
          )
        }
        // <polygon points="16.0 2.0 11.0 7.0 12.41 8.41 15.0 5.83 15.0 6.0 15.0 14.0 17.0 14.0 17.0 6.0 17.0 5.83 19.59 8.41 21.0 7.0 16.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // L 11 7
          lineTo(x = 11.0f, y = 7.0f)
          // L 12.41 8.41
          lineTo(x = 12.41f, y = 8.41f)
          // L 15 5.83
          lineTo(x = 15.0f, y = 5.83f)
          // L 15 6
          lineTo(x = 15.0f, y = 6.0f)
          // L 15 14
          lineTo(x = 15.0f, y = 14.0f)
          // L 17 14
          lineTo(x = 17.0f, y = 14.0f)
          // L 17 6
          lineTo(x = 17.0f, y = 6.0f)
          // L 17 5.83
          lineTo(x = 17.0f, y = 5.83f)
          // L 19.59 8.41
          lineTo(x = 19.59f, y = 8.41f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // L 16 2z
          lineTo(x = 16.0f, y = 2.0f)
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
      .also { _moonrise = it }
  }

@Suppress("ObjectPropertyName")
private var _moonrise: ImageVector? = null
