// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hearing: ImageVector
  get() {
    val current = _hearing
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Hearing",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 30 v-2 a10 10 0 0 0 10 -10 h2 a12 12 0 0 1 -12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 30
          moveTo(x = 18.0f, y = 30.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 10 10 0 0 0 10 -10
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.0f,
            dy1 = -10.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12 12 0 0 1 -12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -12.0f,
            dy1 = 12.0f,
          )
        }
        // M18 26 v-2 a6 6 0 0 0 6 -6 h2 a8 8 0 0 1 -8 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 26
          moveTo(x = 18.0f, y = 26.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 0 1 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 8.0f,
          )
        }
        // M18 22 v-2 a2 2 0 0 0 2 -2 h2 a4 4 0 0 1 -4 4 M10 2 a9 9 0 0 0 -9 9 h2 a7 7 0 0 1 14 0 7.1 7.1 0 0 1 -3.5 6.13 l-.5 .3 v3.07 a3 3 0 0 1 -.9 2.15 4.2 4.2 0 0 1 -4.63 1.03 A4.1 4.1 0 0 1 5 20 H3 a6.1 6.1 0 0 0 3.67 5.51 A6 6 0 0 0 8.98 26 a6.6 6.6 0 0 0 4.48 -1.89 A5 5 0 0 0 15 20.5 v-1.95 A9.1 9.1 0 0 0 19 11 a9 9 0 0 0 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 22
          moveTo(x = 18.0f, y = 22.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // M 10 2
          moveTo(x = 10.0f, y = 2.0f)
          // a 9 9 0 0 0 -9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = 9.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 7 7 0 0 1 14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          // a 7.1 7.1 0 0 1 -3.5 6.13
          arcToRelative(
            a = 7.1f,
            b = 7.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.5f,
            dy1 = 6.13f,
          )
          // l -0.5 0.3
          lineToRelative(dx = -0.5f, dy = 0.3f)
          // v 3.07
          verticalLineToRelative(dy = 3.07f)
          // a 3 3 0 0 1 -0.9 2.15
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = 2.15f,
          )
          // a 4.2 4.2 0 0 1 -4.63 1.03
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.63f,
            dy1 = 1.03f,
          )
          // A 4.1 4.1 0 0 1 5 20
          arcTo(
            horizontalEllipseRadius = 4.1f,
            verticalEllipseRadius = 4.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 20.0f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 6.1 6.1 0 0 0 3.67 5.51
          arcToRelative(
            a = 6.1f,
            b = 6.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.67f,
            dy1 = 5.51f,
          )
          // A 6 6 0 0 0 8.98 26
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.98f,
            y1 = 26.0f,
          )
          // a 6.6 6.6 0 0 0 4.48 -1.89
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.48f,
            dy1 = -1.89f,
          )
          // A 5 5 0 0 0 15 20.5
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 20.5f,
          )
          // v -1.95
          verticalLineToRelative(dy = -1.95f)
          // A 9.1 9.1 0 0 0 19 11
          arcTo(
            horizontalEllipseRadius = 9.1f,
            verticalEllipseRadius = 9.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 11.0f,
          )
          // a 9 9 0 0 0 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
        }
        // M9.28 8.08 A3 3 0 0 1 13 11 h2 a5 5 0 0 0 -1.88 -3.91 5 5 0 0 0 -4.28 -.96 5 5 0 0 0 -3.7 3.7 5 5 0 0 0 2.3 5.46 A3.1 3.1 0 0 1 9 17.92 V20 h2 v-2.08 a5 5 0 0 0 -2.54 -4.34 3 3 0 0 1 .82 -5.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.28 8.08
          moveTo(x = 9.28f, y = 8.08f)
          // A 3 3 0 0 1 13 11
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 11.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 5 5 0 0 0 -1.88 -3.91
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.88f,
            dy1 = -3.91f,
          )
          // a 5 5 0 0 0 -4.28 -0.96
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.28f,
            dy1 = -0.96f,
          )
          // a 5 5 0 0 0 -3.7 3.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.7f,
            dy1 = 3.7f,
          )
          // a 5 5 0 0 0 2.3 5.46
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.3f,
            dy1 = 5.46f,
          )
          // A 3.1 3.1 0 0 1 9 17.92
          arcTo(
            horizontalEllipseRadius = 3.1f,
            verticalEllipseRadius = 3.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 17.92f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.08
          verticalLineToRelative(dy = -2.08f)
          // a 5 5 0 0 0 -2.54 -4.34
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.54f,
            dy1 = -4.34f,
          )
          // a 3 3 0 0 1 0.82 -5.5
          arcToRelative(
          a = 3.0f,
          b = 3.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = 0.82f,
          dy1 = -5.5f,
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
      .also { _hearing = it }
  }

@Suppress("ObjectPropertyName")
private var _hearing: ImageVector? = null
