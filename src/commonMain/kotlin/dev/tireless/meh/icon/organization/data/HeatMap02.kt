// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeatMap02: ImageVector
  get() {
    val current = _heatMap02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HeatMap02",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="21.0" cy="20.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 20
          moveTo(x = 21.0f, y = 20.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="14.0" cy="12.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 12
          moveTo(x = 14.0f, y = 12.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="29.0" cy="19.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 19
          moveTo(x = 29.0f, y = 19.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M26.5 30 a3.5 3.5 0 1 1 3.5 -3.5 3.5 3.5 0 0 1 -3.5 3.5 m0 -5 a1.5 1.5 0 1 0 1.5 1.5 1.5 1.5 0 0 0 -1.5 -1.5 M14 30 a4 4 0 0 1 -2.13 -.62 7 7 0 1 1 4.11 -6.84 A4 4 0 0 1 14 30 m-1.88 -3.03 .53 .5 a2 2 0 1 0 2 -3.35 l-.68 -.24 .03 -.85 a5 5 0 1 0 -2.52 4.3Z M24 16 a6 6 0 0 1 -6 -6 l.03 -.53 A4 4 0 0 1 16 6 a4 4 0 0 1 4 -4 4 4 0 0 1 3.47 2.03 L24 4 a6 6 0 0 1 0 12 M20 4 a2 2 0 0 0 -2 2 2 2 0 0 0 1.43 1.9 l.9 .27 -.21 .92 A4 4 0 1 0 24 6 a4 4 0 0 0 -.91 .12 l-.92 .21 -.27 -.9 A2 2 0 0 0 20 4 M6.5 11 A4.5 4.5 0 1 1 11 6.5 4.5 4.5 0 0 1 6.5 11 m0 -7 A2.5 2.5 0 1 0 9 6.5 2.5 2.5 0 0 0 6.5 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.5 30
          moveTo(x = 26.5f, y = 30.0f)
          // a 3.5 3.5 0 1 1 3.5 -3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.5f,
            dy1 = -3.5f,
          )
          // a 3.5 3.5 0 0 1 -3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.5f,
            dy1 = 3.5f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // a 1.5 1.5 0 1 0 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // a 1.5 1.5 0 0 0 -1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.5f,
            dy1 = -1.5f,
          )
          // M 14 30
          moveTo(x = 14.0f, y = 30.0f)
          // a 4 4 0 0 1 -2.13 -0.62
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.13f,
            dy1 = -0.62f,
          )
          // a 7 7 0 1 1 4.11 -6.84
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.11f,
            dy1 = -6.84f,
          )
          // A 4 4 0 0 1 14 30
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 30.0f,
          )
          // m -1.88 -3.03
          moveToRelative(dx = -1.88f, dy = -3.03f)
          // l 0.53 0.5
          lineToRelative(dx = 0.53f, dy = 0.5f)
          // a 2 2 0 1 0 2 -3.35
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -3.35f,
          )
          // l -0.68 -0.24
          lineToRelative(dx = -0.68f, dy = -0.24f)
          // l 0.03 -0.85
          lineToRelative(dx = 0.03f, dy = -0.85f)
          // a 5 5 0 1 0 -2.52 4.3z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.52f,
            dy1 = 4.3f,
          )
          close()
          // M 24 16
          moveTo(x = 24.0f, y = 16.0f)
          // a 6 6 0 0 1 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // l 0.03 -0.53
          lineToRelative(dx = 0.03f, dy = -0.53f)
          // A 4 4 0 0 1 16 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 6.0f,
          )
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 3.47 2.03
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.47f,
            dy1 = 2.03f,
          )
          // L 24 4
          lineTo(x = 24.0f, y = 4.0f)
          // a 6 6 0 0 1 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // M 20 4
          moveTo(x = 20.0f, y = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 0 1.43 1.9
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.43f,
            dy1 = 1.9f,
          )
          // l 0.9 0.27
          lineToRelative(dx = 0.9f, dy = 0.27f)
          // l -0.21 0.92
          lineToRelative(dx = -0.21f, dy = 0.92f)
          // A 4 4 0 1 0 24 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 6.0f,
          )
          // a 4 4 0 0 0 -0.91 0.12
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.91f,
            dy1 = 0.12f,
          )
          // l -0.92 0.21
          lineToRelative(dx = -0.92f, dy = 0.21f)
          // l -0.27 -0.9
          lineToRelative(dx = -0.27f, dy = -0.9f)
          // A 2 2 0 0 0 20 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 4.0f,
          )
          // M 6.5 11
          moveTo(x = 6.5f, y = 11.0f)
          // A 4.5 4.5 0 1 1 11 6.5
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 6.5f,
          )
          // A 4.5 4.5 0 0 1 6.5 11
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.5f,
            y1 = 11.0f,
          )
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // A 2.5 2.5 0 1 0 9 6.5
          arcTo(
            horizontalEllipseRadius = 2.5f,
            verticalEllipseRadius = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 6.5f,
          )
          // A 2.5 2.5 0 0 0 6.5 4
        arcTo(
          horizontalEllipseRadius = 2.5f,
          verticalEllipseRadius = 2.5f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          x1 = 6.5f,
          y1 = 4.0f,
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
      .also { _heatMap02 = it }
  }

@Suppress("ObjectPropertyName")
private var _heatMap02: ImageVector? = null
