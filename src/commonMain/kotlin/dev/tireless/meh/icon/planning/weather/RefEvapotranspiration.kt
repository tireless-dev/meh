// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefEvapotranspiration: ImageVector
  get() {
    val current = _refEvapotranspiration
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RefEvapotranspiration",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 12 a3.9 3.9 0 0 1 -4 -3.78 4 4 0 0 1 .65 -2.06 l2.52 -3.75 a1.04 1.04 0 0 1 1.66 0 l2.49 3.7 A4 4 0 0 1 18 8.22 3.9 3.9 0 0 1 14 12 m0 -7.24 -1.66 2.47 a2 2 0 0 0 -.34 1 A1.9 1.9 0 0 0 14 10 a1.9 1.9 0 0 0 2 -1.78 2 2 0 0 0 -.37 -1.04Z M7.5 26 A5.4 5.4 0 0 1 2 20.75 a5.4 5.4 0 0 1 .87 -2.83 l3.62 -5.38 a1.22 1.22 0 0 1 2.02 0 l3.55 5.28 A5.5 5.5 0 0 1 13 20.75 5.4 5.4 0 0 1 7.5 26 m0 -11.38 -2.94 4.37 A3.4 3.4 0 0 0 4 20.75 3.4 3.4 0 0 0 7.5 24 a3.4 3.4 0 0 0 3.5 -3.25 3.4 3.4 0 0 0 -.63 -1.87Z M25 2 l-5 5 1.41 1.41 L24 5.83 V16 a4 4 0 0 1 -4 4 h-4 v2 h4 a6 6 0 0 0 6 -6 V5.83 l2.59 2.58 L30 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 12
          moveTo(x = 14.0f, y = 12.0f)
          // a 3.9 3.9 0 0 1 -4 -3.78
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -3.78f,
          )
          // a 4 4 0 0 1 0.65 -2.06
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.65f,
            dy1 = -2.06f,
          )
          // l 2.52 -3.75
          lineToRelative(dx = 2.52f, dy = -3.75f)
          // a 1.04 1.04 0 0 1 1.66 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.66f,
            dy1 = 0.0f,
          )
          // l 2.49 3.7
          lineToRelative(dx = 2.49f, dy = 3.7f)
          // A 4 4 0 0 1 18 8.22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 18.0f,
            y1 = 8.22f,
          )
          // A 3.9 3.9 0 0 1 14 12
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 12.0f,
          )
          // m 0 -7.24
          moveToRelative(dx = 0.0f, dy = -7.24f)
          // l -1.66 2.47
          lineToRelative(dx = -1.66f, dy = 2.47f)
          // a 2 2 0 0 0 -0.34 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.34f,
            dy1 = 1.0f,
          )
          // A 1.9 1.9 0 0 0 14 10
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 10.0f,
          )
          // a 1.9 1.9 0 0 0 2 -1.78
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.78f,
          )
          // a 2 2 0 0 0 -0.37 -1.04z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = -1.04f,
          )
          close()
          // M 7.5 26
          moveTo(x = 7.5f, y = 26.0f)
          // A 5.4 5.4 0 0 1 2 20.75
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 20.75f,
          )
          // a 5.4 5.4 0 0 1 0.87 -2.83
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.87f,
            dy1 = -2.83f,
          )
          // l 3.62 -5.38
          lineToRelative(dx = 3.62f, dy = -5.38f)
          // a 1.22 1.22 0 0 1 2.02 0
          arcToRelative(
            a = 1.22f,
            b = 1.22f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.02f,
            dy1 = 0.0f,
          )
          // l 3.55 5.28
          lineToRelative(dx = 3.55f, dy = 5.28f)
          // A 5.5 5.5 0 0 1 13 20.75
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 20.75f,
          )
          // A 5.4 5.4 0 0 1 7.5 26
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.5f,
            y1 = 26.0f,
          )
          // m 0 -11.38
          moveToRelative(dx = 0.0f, dy = -11.38f)
          // l -2.94 4.37
          lineToRelative(dx = -2.94f, dy = 4.37f)
          // A 3.4 3.4 0 0 0 4 20.75
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 20.75f,
          )
          // A 3.4 3.4 0 0 0 7.5 24
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 24.0f,
          )
          // a 3.4 3.4 0 0 0 3.5 -3.25
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.5f,
            dy1 = -3.25f,
          )
          // a 3.4 3.4 0 0 0 -0.63 -1.87z
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.63f,
            dy1 = -1.87f,
          )
          close()
          // M 25 2
          moveTo(x = 25.0f, y = 2.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 24 5.83
          lineTo(x = 24.0f, y = 5.83f)
          // V 16
          verticalLineTo(y = 16.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // V 5.83
          verticalLineTo(y = 5.83f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 30 7z
          lineTo(x = 30.0f, y = 7.0f)
          close()
        }
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
      .also { _refEvapotranspiration = it }
  }

@Suppress("ObjectPropertyName")
private var _refEvapotranspiration: ImageVector? = null
