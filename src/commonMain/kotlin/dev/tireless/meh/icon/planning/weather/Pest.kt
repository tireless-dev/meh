// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pest: ImageVector
  get() {
    val current = _pest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Pest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="7.5" cy="9.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.5 9.5
          moveTo(x = 7.5f, y = 9.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="13.0" cy="13.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 13
          moveTo(x = 13.0f, y = 13.0f)
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
        // <circle cx="22.0" cy="21.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 21
          moveTo(x = 22.0f, y = 21.0f)
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
        // M25 14 a9 9 0 0 0 -7 3.36 V13 a11 11 0 0 0 -1 -4.58 l-.37 -.78 -.82 .23 A3 3 0 0 1 15 8 a3 3 0 0 1 -3 -3 3 3 0 0 1 .13 -.81 l.23 -.82 L11.58 3 A11 11 0 0 0 7 2 H2 v7 a11 11 0 0 0 2.23 6.63 l.4 .42 .53 -.03 a5.5 5.5 0 0 1 5.37 3.25 l.22 .5 .53 .08 A11 11 0 0 0 13 20 h3 v10 h2 v-4 h3 a9 9 0 0 0 9 -9 v-3Z m-12.9 3.95 A7.5 7.5 0 0 0 5.53 14 9 9 0 0 1 4 9 V4 h3 a9 9 0 0 1 3.03 .53 L10 5 a4.97 4.97 0 0 0 5.47 4.97 A9 9 0 0 1 16 13 v5 h-3 a8 8 0 0 1 -.9 -.05 M28 17 a7 7 0 0 1 -7 7 h-3 v-1 a7 7 0 0 1 5.02 -6.71 A1.5 1.5 0 1 0 26 16.5 a2 2 0 0 0 -.1 -.5 H28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 14
          moveTo(x = 25.0f, y = 14.0f)
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
          // V 13
          verticalLineTo(y = 13.0f)
          // a 11 11 0 0 0 -1 -4.58
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -4.58f,
          )
          // l -0.37 -0.78
          lineToRelative(dx = -0.37f, dy = -0.78f)
          // l -0.82 0.23
          lineToRelative(dx = -0.82f, dy = 0.23f)
          // A 3 3 0 0 1 15 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 8.0f,
          )
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 0.13 -0.81
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.13f,
            dy1 = -0.81f,
          )
          // l 0.23 -0.82
          lineToRelative(dx = 0.23f, dy = -0.82f)
          // L 11.58 3
          lineTo(x = 11.58f, y = 3.0f)
          // A 11 11 0 0 0 7 2
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 2.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 11 11 0 0 0 2.23 6.63
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.23f,
            dy1 = 6.63f,
          )
          // l 0.4 0.42
          lineToRelative(dx = 0.4f, dy = 0.42f)
          // l 0.53 -0.03
          lineToRelative(dx = 0.53f, dy = -0.03f)
          // a 5.5 5.5 0 0 1 5.37 3.25
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.37f,
            dy1 = 3.25f,
          )
          // l 0.22 0.5
          lineToRelative(dx = 0.22f, dy = 0.5f)
          // l 0.53 0.08
          lineToRelative(dx = 0.53f, dy = 0.08f)
          // A 11 11 0 0 0 13 20
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 20.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 9 9 0 0 0 9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.0f,
            dy1 = -9.0f,
          )
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -12.9 3.95
          moveToRelative(dx = -12.9f, dy = 3.95f)
          // A 7.5 7.5 0 0 0 5.53 14
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.53f,
            y1 = 14.0f,
          )
          // A 9 9 0 0 1 4 9
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 9.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 9 9 0 0 1 3.03 0.53
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.03f,
            dy1 = 0.53f,
          )
          // L 10 5
          lineTo(x = 10.0f, y = 5.0f)
          // a 4.97 4.97 0 0 0 5.47 4.97
          arcToRelative(
            a = 4.97f,
            b = 4.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.47f,
            dy1 = 4.97f,
          )
          // A 9 9 0 0 1 16 13
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 13.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 8 8 0 0 1 -0.9 -0.05
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -0.05f,
          )
          // M 28 17
          moveTo(x = 28.0f, y = 17.0f)
          // a 7 7 0 0 1 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 7 7 0 0 1 5.02 -6.71
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.02f,
            dy1 = -6.71f,
          )
          // A 1.5 1.5 0 1 0 26 16.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 16.5f,
          )
          // a 2 2 0 0 0 -0.1 -0.5
          arcToRelative(
            a = 2.0f,
          b = 2.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -0.1f,
          dy1 = -0.5f,
        )
        // H 28z
        horizontalLineTo(x = 28.0f)
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
      .also { _pest = it }
  }

@Suppress("ObjectPropertyName")
private var _pest: ImageVector? = null
