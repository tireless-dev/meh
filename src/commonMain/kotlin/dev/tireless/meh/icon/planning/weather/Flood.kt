// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flood: ImageVector
  get() {
    val current = _flood
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Flood",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 28 a3 3 0 0 1 -1 -.18 3.8 3.8 0 0 1 -2.05 -2.14 A1 1 0 0 0 25 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 21 28 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 17 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 13 28 a3.4 3.4 0 0 1 -3.05 -2.32 1 1 0 0 0 -1.9 0 A3.4 3.4 0 0 1 5 28 H2 v2 h3 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 5.02 5.02 0 0 0 8 0 5 5 0 0 0 2.14 1.62 A5 5 0 0 0 29 30 h1 v-2Z m-1 -14.37 L29.76 15 31 13.43 16.61 2.2 a1 1 0 0 0 -1.24 0 L1 13.41 2.24 15 4 13.62 v5.19 a3.7 3.7 0 0 1 -2 2 v2.09 A5 5 0 0 0 5 21 a5.02 5.02 0 0 0 8 0 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 25 23 h5 v-2 h-2Z m-6.05 5.05 a1 1 0 0 0 -1.9 0 A3.4 3.4 0 0 1 17 21 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 13 18 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 9 21 a3.4 3.4 0 0 1 -3 -2.19 v-6.75 l10 -7.79 10 7.8 V21 h-1 a3.4 3.4 0 0 1 -3.05 -2.32
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 28
          moveTo(x = 29.0f, y = 28.0f)
          // a 3 3 0 0 1 -1 -0.18
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -0.18f,
          )
          // a 3.8 3.8 0 0 1 -2.05 -2.14
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.05f,
            dy1 = -2.14f,
          )
          // A 1 1 0 0 0 25 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 25.0f,
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
          // A 3.4 3.4 0 0 1 21 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 28.0f,
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
          // A 1 1 0 0 0 17 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 25.0f,
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
          // A 3.4 3.4 0 0 1 13 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 28.0f,
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
          // a 1 1 0 0 0 -1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 1 5 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 28.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // a 5 5 0 0 0 2.14 1.62
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.14f,
            dy1 = 1.62f,
          )
          // A 5 5 0 0 0 29 30
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 30.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -1 -14.37
          moveToRelative(dx = -1.0f, dy = -14.37f)
          // L 29.76 15
          lineTo(x = 29.76f, y = 15.0f)
          // L 31 13.43
          lineTo(x = 31.0f, y = 13.43f)
          // L 16.61 2.2
          lineTo(x = 16.61f, y = 2.2f)
          // a 1 1 0 0 0 -1.24 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.24f,
            dy1 = 0.0f,
          )
          // L 1 13.41
          lineTo(x = 1.0f, y = 13.41f)
          // L 2.24 15
          lineTo(x = 2.24f, y = 15.0f)
          // L 4 13.62
          lineTo(x = 4.0f, y = 13.62f)
          // v 5.19
          verticalLineToRelative(dy = 5.19f)
          // a 3.7 3.7 0 0 1 -2 2
          arcToRelative(
            a = 3.7f,
            b = 3.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 2.09
          verticalLineToRelative(dy = 2.09f)
          // A 5 5 0 0 0 5 21
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 21.0f,
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
          // A 5 5 0 0 0 25 23
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 23.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m -6.05 5.05
          moveToRelative(dx = -6.05f, dy = 5.05f)
          // a 1 1 0 0 0 -1.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.0f,
          )
          // A 3.4 3.4 0 0 1 17 21
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 21.0f,
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
          // A 1 1 0 0 0 13 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 18.0f,
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
          // A 3.4 3.4 0 0 1 9 21
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 21.0f,
          )
          // a 3.4 3.4 0 0 1 -3 -2.19
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -2.19f,
          )
          // v -6.75
          verticalLineToRelative(dy = -6.75f)
          // l 10 -7.79
          lineToRelative(dx = 10.0f, dy = -7.79f)
          // l 10 7.8
          lineToRelative(dx = 10.0f, dy = 7.8f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
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
      .also { _flood = it }
  }

@Suppress("ObjectPropertyName")
private var _flood: ImageVector? = null
