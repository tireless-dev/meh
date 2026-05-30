// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TropicalStormModelTracks: ImageVector
  get() {
    val current = _tropicalStormModelTracks
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TropicalStormModelTracks",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 17 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 17
          moveTo(x = 10.0f, y = 17.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        }
        // M14.82 6.65 c.12 -.12 1.86 -1.92 2.89 -2.94 A1 1 0 0 0 17 2 C11.81 2 2 4.3 2 13 a7.9 7.9 0 0 0 3.18 6.35 c-.16 .17 -1.95 2 -2.89 2.94 A1 1 0 0 0 3 24 c5.19 0 15 -2.3 15 -11 a7.9 7.9 0 0 0 -3.18 -6.35 M9.7 20.79 a21 21 0 0 1 -4.1 .99 l2.77 -2.9 -1.17 -.61 A5.9 5.9 0 0 1 4 13 q.01 -5.52 6.3 -7.8 a21 21 0 0 1 4.09 -.98 l-2.77 2.9 1.17 .61 A5.9 5.9 0 0 1 16 13 q-.02 5.52 -6.3 7.8 M30 17 l-5 -5 -5 5 1.41 1.42 L24 15.83 V19 a9 9 0 0 1 -9 9 h-3 v2 h3 a11 11 0 0 0 11 -11 v-3.17 l2.59 2.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14.82 6.65
          moveTo(x = 14.82f, y = 6.65f)
          // c 0.12 -0.12 1.86 -1.92 2.89 -2.94
          curveToRelative(
            dx1 = 0.12f,
            dy1 = -0.12f,
            dx2 = 1.86f,
            dy2 = -1.92f,
            dx3 = 2.89f,
            dy3 = -2.94f,
          )
          // A 1 1 0 0 0 17 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 2.0f,
          )
          // C 11.81 2 2 4.3 2 13
          curveTo(
            x1 = 11.81f,
            y1 = 2.0f,
            x2 = 2.0f,
            y2 = 4.3f,
            x3 = 2.0f,
            y3 = 13.0f,
          )
          // a 7.9 7.9 0 0 0 3.18 6.35
          arcToRelative(
            a = 7.9f,
            b = 7.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.18f,
            dy1 = 6.35f,
          )
          // c -0.16 0.17 -1.95 2 -2.89 2.94
          curveToRelative(
            dx1 = -0.16f,
            dy1 = 0.17f,
            dx2 = -1.95f,
            dy2 = 2.0f,
            dx3 = -2.89f,
            dy3 = 2.94f,
          )
          // A 1 1 0 0 0 3 24
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 24.0f,
          )
          // c 5.19 0 15 -2.3 15 -11
          curveToRelative(
            dx1 = 5.19f,
            dy1 = 0.0f,
            dx2 = 15.0f,
            dy2 = -2.3f,
            dx3 = 15.0f,
            dy3 = -11.0f,
          )
          // a 7.9 7.9 0 0 0 -3.18 -6.35
          arcToRelative(
            a = 7.9f,
            b = 7.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.18f,
            dy1 = -6.35f,
          )
          // M 9.7 20.79
          moveTo(x = 9.7f, y = 20.79f)
          // a 21 21 0 0 1 -4.1 0.99
          arcToRelative(
            a = 21.0f,
            b = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.1f,
            dy1 = 0.99f,
          )
          // l 2.77 -2.9
          lineToRelative(dx = 2.77f, dy = -2.9f)
          // l -1.17 -0.61
          lineToRelative(dx = -1.17f, dy = -0.61f)
          // A 5.9 5.9 0 0 1 4 13
          arcTo(
            horizontalEllipseRadius = 5.9f,
            verticalEllipseRadius = 5.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 13.0f,
          )
          // q 0.01 -5.52 6.3 -7.8
          quadToRelative(
            dx1 = 0.01f,
            dy1 = -5.52f,
            dx2 = 6.3f,
            dy2 = -7.8f,
          )
          // a 21 21 0 0 1 4.09 -0.98
          arcToRelative(
            a = 21.0f,
            b = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.09f,
            dy1 = -0.98f,
          )
          // l -2.77 2.9
          lineToRelative(dx = -2.77f, dy = 2.9f)
          // l 1.17 0.61
          lineToRelative(dx = 1.17f, dy = 0.61f)
          // A 5.9 5.9 0 0 1 16 13
          arcTo(
            horizontalEllipseRadius = 5.9f,
            verticalEllipseRadius = 5.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 13.0f,
          )
          // q -0.02 5.52 -6.3 7.8
          quadToRelative(
            dx1 = -0.02f,
            dy1 = 5.52f,
            dx2 = -6.3f,
            dy2 = 7.8f,
          )
          // M 30 17
          moveTo(x = 30.0f, y = 17.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.42
          lineToRelative(dx = 1.41f, dy = 1.42f)
          // L 24 15.83
          lineTo(x = 24.0f, y = 15.83f)
          // V 19
          verticalLineTo(y = 19.0f)
          // a 9 9 0 0 1 -9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.0f,
            dy1 = 9.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 11 11 0 0 0 11 -11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 11.0f,
            dy1 = -11.0f,
          )
          // v -3.17
          verticalLineToRelative(dy = -3.17f)
          // l 2.59 2.58z
          lineToRelative(dx = 2.59f, dy = 2.58f)
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
      .also { _tropicalStormModelTracks = it }
  }

@Suppress("ObjectPropertyName")
private var _tropicalStormModelTracks: ImageVector? = null
