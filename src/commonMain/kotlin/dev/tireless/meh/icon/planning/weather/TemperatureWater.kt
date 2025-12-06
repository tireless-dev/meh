// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureWater: ImageVector
  get() {
    val current = _temperatureWater
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TemperatureWater",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 9 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 30 9 V7 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 26 4 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 22 7 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 18 4 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 14 7 h-1 V6 a4 4 0 0 0 -8 0 v11.26 A7.01 7.01 0 1 0 13.87 18 H14 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 30 18 v-2 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 26 13 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 22 16 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 18 13 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 14 16 h-1 V9Z M7 6 a2 2 0 0 1 4 0 v6 H7Z m2 22 a5 5 0 0 1 -2.5 -9.33 L7 18.4 V14 h4 v4.39 l.5 .28 A5 5 0 0 1 9 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 9
          moveTo(x = 14.0f, y = 9.0f)
          // a 5 5 0 0 0 4 -1.99
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -1.99f,
          )
          // a 5.02 5.02 0 0 0 8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // A 5 5 0 0 0 30 9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 9.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 3.4 3.4 0 0 1 -3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 0 26 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 0 -0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 1 22 7
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 7.0f,
          )
          // a 3.4 3.4 0 0 1 -3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 0 18 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 4.0f,
          )
          // a 1 1 0 0 0 -0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 1 14 7
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 7.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 11.26
          verticalLineToRelative(dy = 11.26f)
          // A 7.01 7.01 0 1 0 13.87 18
          arcTo(
            horizontalEllipseRadius = 7.01f,
            verticalEllipseRadius = 7.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 13.87f,
            y1 = 18.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // a 5 5 0 0 0 4 -1.99
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -1.99f,
          )
          // a 5.02 5.02 0 0 0 8 0
          arcToRelative(
            a = 5.02f,
            b = 5.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // A 5 5 0 0 0 30 18
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 18.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3.4 3.4 0 0 1 -3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 0 26 13
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 13.0f,
          )
          // a 1 1 0 0 0 -0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 1 22 16
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 16.0f,
          )
          // a 3.4 3.4 0 0 1 -3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.05f,
            dy1 = -2.32f,
          )
          // A 1 1 0 0 0 18 13
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 13.0f,
          )
          // a 1 1 0 0 0 -0.95 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.95f,
            dy1 = 0.68f,
          )
          // A 3.4 3.4 0 0 1 14 16
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 16.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
          // M 7 6
          moveTo(x = 7.0f, y = 6.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 7z
          horizontalLineTo(x = 7.0f)
          close()
          // m 2 22
          moveToRelative(dx = 2.0f, dy = 22.0f)
          // a 5 5 0 0 1 -2.5 -9.33
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.5f,
            dy1 = -9.33f,
          )
          // L 7 18.4
          lineTo(x = 7.0f, y = 18.4f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4.39
          verticalLineToRelative(dy = 4.39f)
          // l 0.5 0.28
          lineToRelative(dx = 0.5f, dy = 0.28f)
          // A 5 5 0 0 1 9 28
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          x1 = 9.0f,
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
      .also { _temperatureWater = it }
  }

@Suppress("ObjectPropertyName")
private var _temperatureWater: ImageVector? = null
