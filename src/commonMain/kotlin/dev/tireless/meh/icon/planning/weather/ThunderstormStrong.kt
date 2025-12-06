// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThunderstormStrong: ImageVector
  get() {
    val current = _thunderstormStrong
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ThunderstormStrong",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 30 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 21 30 M9 32 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 9 32
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.9 -1.45
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -1.45f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.8 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.8f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 21 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 30.0f,
          )
          // M 9 32
          moveTo(x = 9.0f, y = 32.0f)
          // a 1 1 0 0 1 -0.9 -1.45
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -1.45f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.8 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.8f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 9 32
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 32.0f,
          )
        }
        // <polygon points="15.901 30.496 14.165 29.504 17.31 24.0 11.31 24.0 16.165 15.504 17.901 16.496 14.756 22.0 20.757 22.0 15.901 30.496" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.901 30.496
          moveTo(x = 15.901f, y = 30.496f)
          // L 14.165 29.504
          lineTo(x = 14.165f, y = 29.504f)
          // L 17.31 24
          lineTo(x = 17.31f, y = 24.0f)
          // L 11.31 24
          lineTo(x = 11.31f, y = 24.0f)
          // L 16.165 15.504
          lineTo(x = 16.165f, y = 15.504f)
          // L 17.901 16.496
          lineTo(x = 17.901f, y = 16.496f)
          // L 14.756 22
          lineTo(x = 14.756f, y = 22.0f)
          // L 20.757 22
          lineTo(x = 20.757f, y = 22.0f)
          // L 15.901 30.496z
          lineTo(x = 15.901f, y = 30.496f)
          close()
        }
        // M24.8 9.14 a9 9 0 0 0 -17.6 0 A6.5 6.5 0 0 0 7.43 21.9 l-1.32 2.65 a1 1 0 1 0 1.78 .9 l2 -4 a1 1 0 0 0 -.44 -1.34 A1 1 0 0 0 9 20 V20 H8.5 a4.5 4.5 0 0 1 -.36 -8.98 l.82 -.06 .1 -.82 a7 7 0 0 1 13.88 0 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 20 H23 v2 h.5 a6.5 6.5 0 0 0 1.3 -12.86
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.8 9.14
          moveTo(x = 24.8f, y = 9.14f)
          // a 9 9 0 0 0 -17.6 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -17.6f,
            dy1 = 0.0f,
          )
          // A 6.5 6.5 0 0 0 7.43 21.9
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.43f,
            y1 = 21.9f,
          )
          // l -1.32 2.65
          lineToRelative(dx = -1.32f, dy = 2.65f)
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
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 0 0 -0.44 -1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.44f,
            dy1 = -1.34f,
          )
          // A 1 1 0 0 0 9 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 20.0f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // a 4.5 4.5 0 0 1 -0.36 -8.98
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.36f,
            dy1 = -8.98f,
          )
          // l 0.82 -0.06
          lineToRelative(dx = 0.82f, dy = -0.06f)
          // l 0.1 -0.82
          lineToRelative(dx = 0.1f, dy = -0.82f)
          // a 7 7 0 0 1 13.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 13.88f,
            dy1 = 0.0f,
          )
          // l 0.1 0.82
          lineToRelative(dx = 0.1f, dy = 0.82f)
          // l 0.82 0.06
          lineToRelative(dx = 0.82f, dy = 0.06f)
          // A 4.5 4.5 0 0 1 23.5 20
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.5f,
            y1 = 20.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 6.5 6.5 0 0 0 1.3 -12.86
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.3f,
            dy1 = -12.86f,
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
      .also { _thunderstormStrong = it }
  }

@Suppress("ObjectPropertyName")
private var _thunderstormStrong: ImageVector? = null
