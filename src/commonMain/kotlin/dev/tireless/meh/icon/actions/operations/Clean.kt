// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clean: ImageVector
  get() {
    val current = _clean
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Clean",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="20.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 20
          moveTo(x = 26.0f, y = 20.0f)
          // l -6 0
          lineToRelative(dx = -6.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 6 -0z
          lineToRelative(dx = 6.0f, dy = -0.0f)
          close()
        }
        // <rect width="6" height="2" x="24.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28
          moveTo(x = 30.0f, y = 28.0f)
          // l -6 0
          lineToRelative(dx = -6.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 6 -0z
          lineToRelative(dx = 6.0f, dy = -0.0f)
          close()
        }
        // <rect width="6" height="2" x="22.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // l -6 0
          lineToRelative(dx = -6.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 6 -0z
          lineToRelative(dx = 6.0f, dy = -0.0f)
          close()
        }
        // M17 20 a4.9 4.9 0 0 0 -2.4 -4.17 L22 3 l-1.73 -1 -7.58 13.13 a5.7 5.7 0 0 0 -5.24 1.5 C3.71 20.24 4 28.68 4.01 29.04 a1 1 0 0 0 1 .96 h15 a1 1 0 0 0 .6 -1.8 C17.05 25.54 17 20.05 17 20 m-5.07 -3 A3.1 3.1 0 0 1 15 20 l.02 .47 -5.9 -2.62 A3.8 3.8 0 0 1 11.93 17 m3.52 11 A5.2 5.2 0 0 1 14 25 h-2 a6.5 6.5 0 0 0 .97 3 h-2.22 A17 17 0 0 1 10 24 H8 a17 17 0 0 0 .67 4 H6 c.03 -1.84 .29 -5.9 1.8 -8.55 l7.54 3.35 A13 13 0 0 0 17.6 28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 20
          moveTo(x = 17.0f, y = 20.0f)
          // a 4.9 4.9 0 0 0 -2.4 -4.17
          arcToRelative(
            a = 4.9f,
            b = 4.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.4f,
            dy1 = -4.17f,
          )
          // L 22 3
          lineTo(x = 22.0f, y = 3.0f)
          // l -1.73 -1
          lineToRelative(dx = -1.73f, dy = -1.0f)
          // l -7.58 13.13
          lineToRelative(dx = -7.58f, dy = 13.13f)
          // a 5.7 5.7 0 0 0 -5.24 1.5
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.24f,
            dy1 = 1.5f,
          )
          // C 3.71 20.24 4 28.68 4.01 29.04
          curveTo(
            x1 = 3.71f,
            y1 = 20.24f,
            x2 = 4.0f,
            y2 = 28.68f,
            x3 = 4.01f,
            y3 = 29.04f,
          )
          // a 1 1 0 0 0 1 0.96
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.96f,
          )
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // a 1 1 0 0 0 0.6 -1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.6f,
            dy1 = -1.8f,
          )
          // C 17.05 25.54 17 20.05 17 20
          curveTo(
            x1 = 17.05f,
            y1 = 25.54f,
            x2 = 17.0f,
            y2 = 20.05f,
            x3 = 17.0f,
            y3 = 20.0f,
          )
          // m -5.07 -3
          moveToRelative(dx = -5.07f, dy = -3.0f)
          // A 3.1 3.1 0 0 1 15 20
          arcTo(
            horizontalEllipseRadius = 3.1f,
            verticalEllipseRadius = 3.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 20.0f,
          )
          // l 0.02 0.47
          lineToRelative(dx = 0.02f, dy = 0.47f)
          // l -5.9 -2.62
          lineToRelative(dx = -5.9f, dy = -2.62f)
          // A 3.8 3.8 0 0 1 11.93 17
          arcTo(
            horizontalEllipseRadius = 3.8f,
            verticalEllipseRadius = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.93f,
            y1 = 17.0f,
          )
          // m 3.52 11
          moveToRelative(dx = 3.52f, dy = 11.0f)
          // A 5.2 5.2 0 0 1 14 25
          arcTo(
            horizontalEllipseRadius = 5.2f,
            verticalEllipseRadius = 5.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 25.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 6.5 6.5 0 0 0 0.97 3
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.97f,
            dy1 = 3.0f,
          )
          // h -2.22
          horizontalLineToRelative(dx = -2.22f)
          // A 17 17 0 0 1 10 24
          arcTo(
            horizontalEllipseRadius = 17.0f,
            verticalEllipseRadius = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 24.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 17 17 0 0 0 0.67 4
          arcToRelative(
            a = 17.0f,
            b = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.67f,
            dy1 = 4.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
          // c 0.03 -1.84 0.29 -5.9 1.8 -8.55
          curveToRelative(
            dx1 = 0.03f,
            dy1 = -1.84f,
            dx2 = 0.29f,
            dy2 = -5.9f,
            dx3 = 1.8f,
            dy3 = -8.55f,
          )
          // l 7.54 3.35
          lineToRelative(dx = 7.54f, dy = 3.35f)
          // A 13 13 0 0 0 17.6 28z
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.6f,
            y1 = 28.0f,
          )
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
      .also { _clean = it }
  }

@Suppress("ObjectPropertyName")
private var _clean: ImageVector? = null
