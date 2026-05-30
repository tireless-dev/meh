// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lasso: ImageVector
  get() {
    val current = _lasso
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Lasso",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 2 h-8 a9.98 9.98 0 0 0 -4.97 18.66 Q7.02 20.82 7 21 a4 4 0 0 0 2.91 3.83 A4 4 0 0 1 6 28 H4 v2 h2 a6 6 0 0 0 5.93 -5.12 A4 4 0 0 0 14.86 22 H20 a10 10 0 0 0 0 -20 m-9 21 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m9 -3 h-5.14 a3.98 3.98 0 0 0 -7.15 -1.26 A7.99 7.99 0 0 1 12 4 h8 a8 8 0 0 1 0 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 9.98 9.98 0 0 0 -4.97 18.66
          arcToRelative(
            a = 9.98f,
            b = 9.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.97f,
            dy1 = 18.66f,
          )
          // Q 7.02 20.82 7 21
          quadTo(
            x1 = 7.02f,
            y1 = 20.82f,
            x2 = 7.0f,
            y2 = 21.0f,
          )
          // a 4 4 0 0 0 2.91 3.83
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.91f,
            dy1 = 3.83f,
          )
          // A 4 4 0 0 1 6 28
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 28.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 0 0 5.93 -5.12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.93f,
            dy1 = -5.12f,
          )
          // A 4 4 0 0 0 14.86 22
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.86f,
            y1 = 22.0f,
          )
          // H 20
          horizontalLineTo(x = 20.0f)
          // a 10 10 0 0 0 0 -20
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -20.0f,
          )
          // m -9 21
          moveToRelative(dx = -9.0f, dy = 21.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 9 -3
          moveToRelative(dx = 9.0f, dy = -3.0f)
          // h -5.14
          horizontalLineToRelative(dx = -5.14f)
          // a 3.98 3.98 0 0 0 -7.15 -1.26
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.15f,
            dy1 = -1.26f,
          )
          // A 7.99 7.99 0 0 1 12 4
          arcTo(
            horizontalEllipseRadius = 7.99f,
            verticalEllipseRadius = 7.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 4.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 8 8 0 0 1 0 16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 16.0f,
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
      .also { _lasso = it }
  }

@Suppress("ObjectPropertyName")
private var _lasso: ImageVector? = null
