// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Touch1: ImageVector
  get() {
    val current = _touch1
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Touch1",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 8 h-2 A5 5 0 0 0 8 8 H6 a7 7 0 0 1 14 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 8
          moveTo(x = 20.0f, y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // A 5 5 0 0 0 8 8
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 8.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
        }
        // M25 15 a3 3 0 0 0 -1.47 .4 A3 3 0 0 0 21 14 a3 3 0 0 0 -1.47 .4 A3 3 0 0 0 16 13.18 V8 a3 3 0 0 0 -6 0 v11.1 l-2.23 -1.52 A3 3 0 0 0 6 17 a3 3 0 0 0 -2.12 5.13 l8 7.3 A6.2 6.2 0 0 0 16 31 h5 a7 7 0 0 0 7 -7 v-6 a3 3 0 0 0 -3 -3 m1 9 a5 5 0 0 1 -5 5 h-5 a4.2 4.2 0 0 1 -2.76 -1 l-7.95 -7.3 A1 1 0 0 1 5 20 a1 1 0 0 1 1.6 -.8 l5.4 3.7 V8 a1 1 0 0 1 2 0 v11 h2 v-3 a1 1 0 0 1 2 0 v3 h2 v-2 a1 1 0 0 1 2 0 v2 h2 v-1 a1 1 0 0 1 2 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 15
          moveTo(x = 25.0f, y = 15.0f)
          // a 3 3 0 0 0 -1.47 0.4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.47f,
            dy1 = 0.4f,
          )
          // A 3 3 0 0 0 21 14
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 14.0f,
          )
          // a 3 3 0 0 0 -1.47 0.4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.47f,
            dy1 = 0.4f,
          )
          // A 3 3 0 0 0 16 13.18
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 13.18f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 3 3 0 0 0 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // v 11.1
          verticalLineToRelative(dy = 11.1f)
          // l -2.23 -1.52
          lineToRelative(dx = -2.23f, dy = -1.52f)
          // A 3 3 0 0 0 6 17
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 17.0f,
          )
          // a 3 3 0 0 0 -2.12 5.13
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = 5.13f,
          )
          // l 8 7.3
          lineToRelative(dx = 8.0f, dy = 7.3f)
          // A 6.2 6.2 0 0 0 16 31
          arcTo(
            horizontalEllipseRadius = 6.2f,
            verticalEllipseRadius = 6.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 31.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m 1 9
          moveToRelative(dx = 1.0f, dy = 9.0f)
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 4.2 4.2 0 0 1 -2.76 -1
          arcToRelative(
            a = 4.2f,
            b = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.76f,
            dy1 = -1.0f,
          )
          // l -7.95 -7.3
          lineToRelative(dx = -7.95f, dy = -7.3f)
          // A 1 1 0 0 1 5 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 20.0f,
          )
          // a 1 1 0 0 1 1.6 -0.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.6f,
            dy1 = -0.8f,
          )
          // l 5.4 3.7
          lineToRelative(dx = 5.4f, dy = 3.7f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 1 1 0 0 1 2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
          dx1 = 2.0f,
          dy1 = 0.0f,
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
      .also { _touch1 = it }
  }

@Suppress("ObjectPropertyName")
private var _touch1: ImageVector? = null
