// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlightInternational: ImageVector
  get() {
    val current = _flightInternational
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FlightInternational",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 28 a5 5 0 0 1 -.67 -.04 A22 22 0 0 1 12.03 17 h17.92 q.04 -.5 .05 -1 a14 14 0 1 0 -14 14Z m11.95 -13 h-5.99 a24 24 0 0 0 -2.75 -10.55 A12 12 0 0 1 27.95 15 M16.67 4.04 A22 22 0 0 1 19.97 15 h-7.94 a22 22 0 0 1 3.3 -10.96 5 5 0 0 1 1.34 0 m-3.88 .4 A24 24 0 0 0 10.04 15 H4.05 A12 12 0 0 1 12.8 4.45 M4.05 17 h5.99 a24 24 0 0 0 2.75 10.55 A12 12 0 0 1 4.05 17
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 5 5 0 0 1 -0.67 -0.04
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.67f,
            dy1 = -0.04f,
          )
          // A 22 22 0 0 1 12.03 17
          arcTo(
            horizontalEllipseRadius = 22.0f,
            verticalEllipseRadius = 22.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.03f,
            y1 = 17.0f,
          )
          // h 17.92
          horizontalLineToRelative(dx = 17.92f)
          // q 0.04 -0.5 0.05 -1
          quadToRelative(
            dx1 = 0.04f,
            dy1 = -0.5f,
            dx2 = 0.05f,
            dy2 = -1.0f,
          )
          // a 14 14 0 1 0 -14 14z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          close()
          // m 11.95 -13
          moveToRelative(dx = 11.95f, dy = -13.0f)
          // h -5.99
          horizontalLineToRelative(dx = -5.99f)
          // a 24 24 0 0 0 -2.75 -10.55
          arcToRelative(
            a = 24.0f,
            b = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.75f,
            dy1 = -10.55f,
          )
          // A 12 12 0 0 1 27.95 15
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.95f,
            y1 = 15.0f,
          )
          // M 16.67 4.04
          moveTo(x = 16.67f, y = 4.04f)
          // A 22 22 0 0 1 19.97 15
          arcTo(
            horizontalEllipseRadius = 22.0f,
            verticalEllipseRadius = 22.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.97f,
            y1 = 15.0f,
          )
          // h -7.94
          horizontalLineToRelative(dx = -7.94f)
          // a 22 22 0 0 1 3.3 -10.96
          arcToRelative(
            a = 22.0f,
            b = 22.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.3f,
            dy1 = -10.96f,
          )
          // a 5 5 0 0 1 1.34 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.34f,
            dy1 = 0.0f,
          )
          // m -3.88 0.4
          moveToRelative(dx = -3.88f, dy = 0.4f)
          // A 24 24 0 0 0 10.04 15
          arcTo(
            horizontalEllipseRadius = 24.0f,
            verticalEllipseRadius = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.04f,
            y1 = 15.0f,
          )
          // H 4.05
          horizontalLineTo(x = 4.05f)
          // A 12 12 0 0 1 12.8 4.45
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.8f,
            y1 = 4.45f,
          )
          // M 4.05 17
          moveTo(x = 4.05f, y = 17.0f)
          // h 5.99
          horizontalLineToRelative(dx = 5.99f)
          // a 24 24 0 0 0 2.75 10.55
          arcToRelative(
            a = 24.0f,
            b = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.75f,
            dy1 = 10.55f,
          )
          // A 12 12 0 0 1 4.05 17
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.05f,
            y1 = 17.0f,
          )
        }
        // m25 25 5 2 v-2 l-5 -2.5 V20 a1 1 0 0 0 -2 0 v2.5 L18 25 v2 l5 -2 v3.5 L21 30 v1 l3 -1 3 1 v-1 l-2 -1.5Z
        path(
          pathFillType = PathFillType.EvenOdd,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 25
          moveTo(x = 25.0f, y = 25.0f)
          // l 5 2
          lineToRelative(dx = 5.0f, dy = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // l -5 -2.5
          lineToRelative(dx = -5.0f, dy = -2.5f)
          // V 20
          verticalLineTo(y = 20.0f)
          // a 1 1 0 0 0 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // v 2.5
          verticalLineToRelative(dy = 2.5f)
          // L 18 25
          lineTo(x = 18.0f, y = 25.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // l 5 -2
          lineToRelative(dx = 5.0f, dy = -2.0f)
          // v 3.5
          verticalLineToRelative(dy = 3.5f)
          // L 21 30
          lineTo(x = 21.0f, y = 30.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // l 3 -1
          lineToRelative(dx = 3.0f, dy = -1.0f)
          // l 3 1
          lineToRelative(dx = 3.0f, dy = 1.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // l -2 -1.5z
          lineToRelative(dx = -2.0f, dy = -1.5f)
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
      .also { _flightInternational = it }
  }

@Suppress("ObjectPropertyName")
private var _flightInternational: ImageVector? = null
