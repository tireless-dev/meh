// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Outage: ImageVector
  get() {
    val current = _outage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Outage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="9" height="2" x="12.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
        }
        // <rect width="6" height="2" x="13.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // m8.78 18.97 1.42 -1.41 A7 7 0 0 1 8 12 a7.99 7.99 0 0 1 13.53 -5.77 l1.41 -1.41 A9.99 9.99 0 0 0 6 12 a9 9 0 0 0 2.78 6.97 M30 3.41 28.59 2 2 28.59 3.41 30 23.66 9.75 A8 8 0 0 1 24 12 a7.2 7.2 0 0 1 -2.82 6.14 C20.1 19.14 19 20.16 19 22 h2 c0 -.92 .53 -1.45 1.54 -2.39 A9.2 9.2 0 0 0 26 12 a10 10 0 0 0 -.78 -3.81Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.78 18.97
          moveTo(x = 8.78f, y = 18.97f)
          // l 1.42 -1.41
          lineToRelative(dx = 1.42f, dy = -1.41f)
          // A 7 7 0 0 1 8 12
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 12.0f,
          )
          // a 7.99 7.99 0 0 1 13.53 -5.77
          arcToRelative(
            a = 7.99f,
            b = 7.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 13.53f,
            dy1 = -5.77f,
          )
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // A 9.99 9.99 0 0 0 6 12
          arcTo(
            horizontalEllipseRadius = 9.99f,
            verticalEllipseRadius = 9.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 12.0f,
          )
          // a 9 9 0 0 0 2.78 6.97
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.78f,
            dy1 = 6.97f,
          )
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // L 23.66 9.75
          lineTo(x = 23.66f, y = 9.75f)
          // A 8 8 0 0 1 24 12
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 12.0f,
          )
          // a 7.2 7.2 0 0 1 -2.82 6.14
          arcToRelative(
            a = 7.2f,
            b = 7.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = 6.14f,
          )
          // C 20.1 19.14 19 20.16 19 22
          curveTo(
            x1 = 20.1f,
            y1 = 19.14f,
            x2 = 19.0f,
            y2 = 20.16f,
            x3 = 19.0f,
            y3 = 22.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -0.92 0.53 -1.45 1.54 -2.39
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.92f,
            dx2 = 0.53f,
            dy2 = -1.45f,
            dx3 = 1.54f,
            dy3 = -2.39f,
          )
          // A 9.2 9.2 0 0 0 26 12
          arcTo(
            horizontalEllipseRadius = 9.2f,
            verticalEllipseRadius = 9.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 12.0f,
          )
          // a 10 10 0 0 0 -0.78 -3.81z
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.78f,
            dy1 = -3.81f,
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
      .also { _outage = it }
  }

@Suppress("ObjectPropertyName")
private var _outage: ImageVector? = null
