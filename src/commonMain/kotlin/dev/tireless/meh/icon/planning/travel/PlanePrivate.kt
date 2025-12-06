// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlanePrivate: ImageVector
  get() {
    val current = _planePrivate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PlanePrivate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28.58 14.59 -3.12 -1.88 A5 5 0 0 0 22.9 12 H7.8 L7.15 9.52 A2 2 0 0 0 5.22 8 H4 a2 2 0 0 0 -2 2 v7 a3 3 0 0 0 3 3 h7 v6 a2 2 0 0 0 2 2 h1.3 a2 2 0 0 0 1.88 -1.3 l2.51 -6.7 h7.4 a2.92 2.92 0 0 0 1.5 -5.41 M27.08 18 h-8.77 l-3 8 H14 v-8 H5 a1 1 0 0 1 -1 -1 v-7 h1.22 l1 4 H10 v2 h2 v-2 h3 v2 h2 v-2 h3 v2 h2 v-2 h.9 a3 3 0 0 1 1.54 .43 l3.12 1.87 a.92 .92 0 0 1 -.48 1.7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.58 14.59
          moveTo(x = 28.58f, y = 14.59f)
          // l -3.12 -1.88
          lineToRelative(dx = -3.12f, dy = -1.88f)
          // A 5 5 0 0 0 22.9 12
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.9f,
            y1 = 12.0f,
          )
          // H 7.8
          horizontalLineTo(x = 7.8f)
          // L 7.15 9.52
          lineTo(x = 7.15f, y = 9.52f)
          // A 2 2 0 0 0 5.22 8
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.22f,
            y1 = 8.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 1.3
          horizontalLineToRelative(dx = 1.3f)
          // a 2 2 0 0 0 1.88 -1.3
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.88f,
            dy1 = -1.3f,
          )
          // l 2.51 -6.7
          lineToRelative(dx = 2.51f, dy = -6.7f)
          // h 7.4
          horizontalLineToRelative(dx = 7.4f)
          // a 2.92 2.92 0 0 0 1.5 -5.41
          arcToRelative(
            a = 2.92f,
            b = 2.92f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = -5.41f,
          )
          // M 27.08 18
          moveTo(x = 27.08f, y = 18.0f)
          // h -8.77
          horizontalLineToRelative(dx = -8.77f)
          // l -3 8
          lineToRelative(dx = -3.0f, dy = 8.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 1.22
          horizontalLineToRelative(dx = 1.22f)
          // l 1 4
          lineToRelative(dx = 1.0f, dy = 4.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 0.9
          horizontalLineToRelative(dx = 0.9f)
          // a 3 3 0 0 1 1.54 0.43
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.54f,
            dy1 = 0.43f,
          )
          // l 3.12 1.87
          lineToRelative(dx = 3.12f, dy = 1.87f)
          // a 0.92 0.92 0 0 1 -0.48 1.7
          arcToRelative(
            a = 0.92f,
            b = 0.92f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.48f,
            dy1 = 1.7f,
          )
        }
        // M14 4 h1.32 l2.4 6 h2.16 l-2.7 -6.74 A2 2 0 0 0 15.32 2 H14 a2 2 0 0 0 -2 2 v6 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 4
          moveTo(x = 14.0f, y = 4.0f)
          // h 1.32
          horizontalLineToRelative(dx = 1.32f)
          // l 2.4 6
          lineToRelative(dx = 2.4f, dy = 6.0f)
          // h 2.16
          horizontalLineToRelative(dx = 2.16f)
          // l -2.7 -6.74
          lineToRelative(dx = -2.7f, dy = -6.74f)
          // A 2 2 0 0 0 15.32 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.32f,
            y1 = 2.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _planePrivate = it }
  }

@Suppress("ObjectPropertyName")
private var _planePrivate: ImageVector? = null
