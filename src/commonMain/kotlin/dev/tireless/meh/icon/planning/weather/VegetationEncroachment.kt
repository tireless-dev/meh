// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VegetationEncroachment: ImageVector
  get() {
    val current = _vegetationEncroachment
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VegetationEncroachment",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 20 h7 v-2 h-9 v10 a2 2 0 0 0 2 2 h3 v-2 h-3z m-7 10 H9 v-2 h3 V15.57 l-3.51 -2.11 1.02 -1.72 3.52 2.11 A2 2 0 0 1 14 15.57 V28 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 20
          moveTo(x = 19.0f, y = 20.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
          // m -7 10
          moveToRelative(dx = -7.0f, dy = 10.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 15.57
          verticalLineTo(y = 15.57f)
          // l -3.51 -2.11
          lineToRelative(dx = -3.51f, dy = -2.11f)
          // l 1.02 -1.72
          lineToRelative(dx = 1.02f, dy = -1.72f)
          // l 3.52 2.11
          lineToRelative(dx = 3.52f, dy = 2.11f)
          // A 2 2 0 0 1 14 15.57
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 15.57f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
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
        }
        // <polygon points="30.0 6.4102 28.59 5.0 25.0 8.5898 21.41 5.0 20.0 6.4102 23.59 10.0 20.0 13.5898 21.41 15.0 25.0 11.4102 28.59 15.0 30.0 13.5898 26.41 10.0 30.0 6.4102" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6.4102
          moveTo(x = 30.0f, y = 6.4102f)
          // L 28.59 5
          lineTo(x = 28.59f, y = 5.0f)
          // L 25 8.5898
          lineTo(x = 25.0f, y = 8.5898f)
          // L 21.41 5
          lineTo(x = 21.41f, y = 5.0f)
          // L 20 6.4102
          lineTo(x = 20.0f, y = 6.4102f)
          // L 23.59 10
          lineTo(x = 23.59f, y = 10.0f)
          // L 20 13.5898
          lineTo(x = 20.0f, y = 13.5898f)
          // L 21.41 15
          lineTo(x = 21.41f, y = 15.0f)
          // L 25 11.4102
          lineTo(x = 25.0f, y = 11.4102f)
          // L 28.59 15
          lineTo(x = 28.59f, y = 15.0f)
          // L 30 13.5898
          lineTo(x = 30.0f, y = 13.5898f)
          // L 26.41 10
          lineTo(x = 26.41f, y = 10.0f)
          // L 30 6.4102z
          lineTo(x = 30.0f, y = 6.4102f)
          close()
        }
        // M17.3 2.29 A10 10 0 0 0 15 2 a8 8 0 0 0 -6.92 4 H8 a6 6 0 0 0 0 12 v-2 a4 4 0 0 1 0 -8 l.39 .04 .86 .11 .3 -.66 A6 6 0 0 1 15 4 a8 8 0 0 1 1.73 .21z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.3 2.29
          moveTo(x = 17.3f, y = 2.29f)
          // A 10 10 0 0 0 15 2
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 2.0f,
          )
          // a 8 8 0 0 0 -6.92 4
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.92f,
            dy1 = 4.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 6 6 0 0 0 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // l 0.39 0.04
          lineToRelative(dx = 0.39f, dy = 0.04f)
          // l 0.86 0.11
          lineToRelative(dx = 0.86f, dy = 0.11f)
          // l 0.3 -0.66
          lineToRelative(dx = 0.3f, dy = -0.66f)
          // A 6 6 0 0 1 15 4
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 4.0f,
          )
          // a 8 8 0 0 1 1.73 0.21z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.73f,
            dy1 = 0.21f,
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
      .also { _vegetationEncroachment = it }
  }

@Suppress("ObjectPropertyName")
private var _vegetationEncroachment: ImageVector? = null
