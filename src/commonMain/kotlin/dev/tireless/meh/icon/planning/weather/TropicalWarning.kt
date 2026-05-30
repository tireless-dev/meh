// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TropicalWarning: ImageVector
  get() {
    val current = _tropicalWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TropicalWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.95 25.68 a1 1 0 0 0 -1.9 0 A3.4 3.4 0 0 1 23 28 a3.4 3.4 0 0 1 -3.05 -2.32 1 1 0 0 0 -1.9 0 A3.4 3.4 0 0 1 15 28 h-.43 C13.92 26.8 12 22.31 12 12 v-.13 l1.12 .74 a7 7 0 0 1 1.31 1.18 l1 -1.84 a9 9 0 0 0 -1.2 -1 L12.8 10 h1.53 a7 7 0 0 1 2 .3 l.97 -1.79 A9 9 0 0 0 14.33 8 h-1.21 A7 7 0 0 1 18 6 h.67 l1.08 -2 H18 a9 9 0 0 0 -7 3.36 A9 9 0 0 0 4 4 H2 v2 h2 a7 7 0 0 1 4.88 2 H7.67 a9 9 0 0 0 -5.4 1.8 L.4 11.2 l1.2 1.6 1.87 -1.4 a7 7 0 0 1 4.2 -1.4 H9.2 l-1.43 .95 A8.5 8.5 0 0 0 4 18 h2 a6.5 6.5 0 0 1 2.88 -5.39 L10 11.87 V12 c0 8.94 1.4 13.75 2.36 16 H2 v2 h13 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 5 5 0 0 0 3 1.89 V27.8 a3.8 3.8 0 0 1 -2.05 -2.13
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.95 25.68
          moveTo(x = 27.95f, y = 25.68f)
          // a 1 1 0 0 0 -1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 1 23 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 28.0f,
          )
          // a 3.4 3.4 0 0 1 -3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.05f,
            dy1 = -2.32f,
          )
          // a 1 1 0 0 0 -1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 1 15 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 28.0f,
          )
          // h -0.43
          horizontalLineToRelative(dx = -0.43f)
          // C 13.92 26.8 12 22.31 12 12
          curveTo(
            x1 = 13.92f,
            y1 = 26.8f,
            x2 = 12.0f,
            y2 = 22.31f,
            x3 = 12.0f,
            y3 = 12.0f,
          )
          // v -0.13
          verticalLineToRelative(dy = -0.13f)
          // l 1.12 0.74
          lineToRelative(dx = 1.12f, dy = 0.74f)
          // a 7 7 0 0 1 1.31 1.18
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.31f,
            dy1 = 1.18f,
          )
          // l 1 -1.84
          lineToRelative(dx = 1.0f, dy = -1.84f)
          // a 9 9 0 0 0 -1.2 -1
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.2f,
            dy1 = -1.0f,
          )
          // L 12.8 10
          lineTo(x = 12.8f, y = 10.0f)
          // h 1.53
          horizontalLineToRelative(dx = 1.53f)
          // a 7 7 0 0 1 2 0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.3f,
          )
          // l 0.97 -1.79
          lineToRelative(dx = 0.97f, dy = -1.79f)
          // A 9 9 0 0 0 14.33 8
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.33f,
            y1 = 8.0f,
          )
          // h -1.21
          horizontalLineToRelative(dx = -1.21f)
          // A 7 7 0 0 1 18 6
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 6.0f,
          )
          // h 0.67
          horizontalLineToRelative(dx = 0.67f)
          // l 1.08 -2
          lineToRelative(dx = 1.08f, dy = -2.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // a 9 9 0 0 0 -7 3.36
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 3.36f,
          )
          // A 9 9 0 0 0 4 4
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 4.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 7 7 0 0 1 4.88 2
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.88f,
            dy1 = 2.0f,
          )
          // H 7.67
          horizontalLineTo(x = 7.67f)
          // a 9 9 0 0 0 -5.4 1.8
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.4f,
            dy1 = 1.8f,
          )
          // L 0.4 11.2
          lineTo(x = 0.4f, y = 11.2f)
          // l 1.2 1.6
          lineToRelative(dx = 1.2f, dy = 1.6f)
          // l 1.87 -1.4
          lineToRelative(dx = 1.87f, dy = -1.4f)
          // a 7 7 0 0 1 4.2 -1.4
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.2f,
            dy1 = -1.4f,
          )
          // H 9.2
          horizontalLineTo(x = 9.2f)
          // l -1.43 0.95
          lineToRelative(dx = -1.43f, dy = 0.95f)
          // A 8.5 8.5 0 0 0 4 18
          arcTo(
            horizontalEllipseRadius = 8.5f,
            verticalEllipseRadius = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 18.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6.5 6.5 0 0 1 2.88 -5.39
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.88f,
            dy1 = -5.39f,
          )
          // L 10 11.87
          lineTo(x = 10.0f, y = 11.87f)
          // V 12
          verticalLineTo(y = 12.0f)
          // c 0 8.94 1.4 13.75 2.36 16
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 8.94f,
            dx2 = 1.4f,
            dy2 = 13.75f,
            dx3 = 2.36f,
            dy3 = 16.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // a 5 5 0 0 0 4 -1.99
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -1.99f,
          )
          // a 5.02 5.02 0 0 0 8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 5 5 0 0 0 3 1.89
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 1.89f,
          )
          // V 27.8
          verticalLineTo(y = 27.8f)
          // a 3.8 3.8 0 0 1 -2.05 -2.13
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.05f,
            dy1 = -2.13f,
          )
        }
        // M23.75 10 h-1.5 V6 h1.5Z M23 11 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
        path {
          // M 23.75 10
          moveTo(x = 23.75f, y = 10.0f)
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 1.5z
          horizontalLineToRelative(dx = 1.5f)
          close()
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
        }
        // M29.91 13.94 23.63 2.37 a.72 .72 0 0 0 -1.26 0 L16.1 13.94 A.72 .72 0 0 0 16.72 15 h12.56 a.72 .72 0 0 0 .63 -1.06 M22.25 6 h1.5 v4 h-1.5Z M23 13 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.91 13.94
          moveTo(x = 29.91f, y = 13.94f)
          // L 23.63 2.37
          lineTo(x = 23.63f, y = 2.37f)
          // a 0.72 0.72 0 0 0 -1.26 0
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.26f,
            dy1 = 0.0f,
          )
          // L 16.1 13.94
          lineTo(x = 16.1f, y = 13.94f)
          // A 0.72 0.72 0 0 0 16.72 15
          arcTo(
            horizontalEllipseRadius = 0.72f,
            verticalEllipseRadius = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.72f,
            y1 = 15.0f,
          )
          // h 12.56
          horizontalLineToRelative(dx = 12.56f)
          // a 0.72 0.72 0 0 0 0.63 -1.06
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.63f,
            dy1 = -1.06f,
          )
          // M 22.25 6
          moveTo(x = 22.25f, y = 6.0f)
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1.5z
          horizontalLineToRelative(dx = -1.5f)
          close()
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _tropicalWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _tropicalWarning: ImageVector? = null
