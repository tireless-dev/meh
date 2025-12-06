// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bar: ImageVector
  get() {
    val current = _bar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 11 H15 a1 1 0 0 0 -1 1 v4 a6 6 0 0 0 5 5.91 V28 h-3 v2 h8 v-2 h-3 v-6.09 A6 6 0 0 0 26 16 v-4 a1 1 0 0 0 -1 -1 m-1 5 a4 4 0 0 1 -8 0 v-3 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 6 6 0 0 0 5 5.91
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.91f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -6.09
          verticalLineToRelative(dy = -6.09f)
          // A 6 6 0 0 0 26 16
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 16.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // m -1 5
          moveToRelative(dx = -1.0f, dy = 5.0f)
          // a 4 4 0 0 1 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
        }
        // M15 1 h-5 a1 1 0 0 0 -1 1 v7.37 A6.1 6.1 0 0 0 6 15 v14 a1 1 0 0 0 1 1 h5 v-2 H8 V15 c0 -3.19 2.23 -4.02 2.32 -4.05 L11 10.72 V3 h3 v5 h2 V2 a1 1 0 0 0 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 1
          moveTo(x = 15.0f, y = 1.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 7.37
          verticalLineToRelative(dy = 7.37f)
          // A 6.1 6.1 0 0 0 6 15
          arcTo(
            horizontalEllipseRadius = 6.1f,
            verticalEllipseRadius = 6.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 15.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 15
          verticalLineTo(y = 15.0f)
          // c 0 -3.19 2.23 -4.02 2.32 -4.05
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.19f,
            dx2 = 2.23f,
            dy2 = -4.02f,
            dx3 = 2.32f,
            dy3 = -4.05f,
          )
          // L 11 10.72
          lineTo(x = 11.0f, y = 10.72f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
      .also { _bar = it }
  }

@Suppress("ObjectPropertyName")
private var _bar: ImageVector? = null
