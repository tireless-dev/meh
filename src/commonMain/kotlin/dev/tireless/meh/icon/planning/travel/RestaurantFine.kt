// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RestaurantFine: ImageVector
  get() {
    val current = _restaurantFine
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RestaurantFine",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 11 V3 a1 1 0 0 0 -1 -1 H19 a1 1 0 0 0 -1 1 v8 a6 6 0 0 0 5 5.91 V28 h-4 v2 h10 v-2 h-4 V16.91 a6 6 0 0 0 5 -5.9 m-10 0 V4 h8 v7 a4 4 0 1 1 -8 0 m-8 -9 v9.02 a3.96 3.96 0 0 1 -3.96 3.96 A4 4 0 0 1 4 11.02 V2 H2 v9.02 a6 6 0 0 0 5 5.87 V30 h2 V16.9 a5.96 5.96 0 0 0 5 -5.88 V2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11
          moveTo(x = 30.0f, y = 11.0f)
          // V 3
          verticalLineTo(y = 3.0f)
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
          // H 19
          horizontalLineTo(x = 19.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 16.91
          verticalLineTo(y = 16.91f)
          // a 6 6 0 0 0 5 -5.9
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.9f,
          )
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 4 4 0 1 1 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // m -8 -9
          moveToRelative(dx = -8.0f, dy = -9.0f)
          // v 9.02
          verticalLineToRelative(dy = 9.02f)
          // a 3.96 3.96 0 0 1 -3.96 3.96
          arcToRelative(
            a = 3.96f,
            b = 3.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.96f,
            dy1 = 3.96f,
          )
          // A 4 4 0 0 1 4 11.02
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 11.02f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 9.02
          verticalLineToRelative(dy = 9.02f)
          // a 6 6 0 0 0 5 5.87
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.87f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 16.9
          verticalLineTo(y = 16.9f)
          // a 5.96 5.96 0 0 0 5 -5.88
          arcToRelative(
            a = 5.96f,
            b = 5.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.88f,
          )
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
        }
        // <rect width="2" height="10" x="7.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 2
          moveTo(x = 7.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _restaurantFine = it }
  }

@Suppress("ObjectPropertyName")
private var _restaurantFine: ImageVector? = null
