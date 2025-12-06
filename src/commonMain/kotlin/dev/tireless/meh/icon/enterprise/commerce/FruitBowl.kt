// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FruitBowl: ImageVector
  get() {
    val current = _fruitBowl
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FruitBowl",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 15 a6 6 0 0 0 -3.1 -5.25 A4 4 0 0 0 24 7 h-2 a2 2 0 0 1 -2 2 6 6 0 0 0 -6 5.9 7 7 0 0 1 -2 -4.9 4 4 0 0 0 -3 -3.86 V4 H7 v2.14 A4 4 0 0 0 4 10 v5 H2 v1 a14 14 0 0 0 28 0 v-1Z m-6 -4 a4 4 0 0 1 4 4 h-8 a4 4 0 0 1 4 -4 M6 10 a2 2 0 1 1 4 0 9 9 0 0 0 1.53 5 H6Z m10 18 A12 12 0 0 1 4.04 17 h23.92 A12 12 0 0 1 16 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 15
          moveTo(x = 26.0f, y = 15.0f)
          // a 6 6 0 0 0 -3.1 -5.25
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.1f,
            dy1 = -5.25f,
          )
          // A 4 4 0 0 0 24 7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 7.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // a 6 6 0 0 0 -6 5.9
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 5.9f,
          )
          // a 7 7 0 0 1 -2 -4.9
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -4.9f,
          )
          // a 4 4 0 0 0 -3 -3.86
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.86f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2.14
          verticalLineToRelative(dy = 2.14f)
          // A 4 4 0 0 0 4 10
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 10.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 14 14 0 0 0 28 0
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 28.0f,
            dy1 = 0.0f,
          )
          // v -1z
          verticalLineToRelative(dy = -1.0f)
          close()
          // m -6 -4
          moveToRelative(dx = -6.0f, dy = -4.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // M 6 10
          moveTo(x = 6.0f, y = 10.0f)
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
          // a 9 9 0 0 0 1.53 5
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.53f,
            dy1 = 5.0f,
          )
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 10 18
          moveToRelative(dx = 10.0f, dy = 18.0f)
          // A 12 12 0 0 1 4.04 17
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.04f,
            y1 = 17.0f,
          )
          // h 23.92
          horizontalLineToRelative(dx = 23.92f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
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
      .also { _fruitBowl = it }
  }

@Suppress("ObjectPropertyName")
private var _fruitBowl: ImageVector? = null
