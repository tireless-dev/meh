// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tides: ImageVector
  get() {
    val current = _tides
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tides",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="14.0 7.0 9.0 2.0 4.0 7.0 5.413 8.416 8.0 5.833 8.0 14.0 10.0 14.0 10.0 5.833 12.586 8.414 14.0 7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 7
          moveTo(x = 14.0f, y = 7.0f)
          // L 9 2
          lineTo(x = 9.0f, y = 2.0f)
          // L 4 7
          lineTo(x = 4.0f, y = 7.0f)
          // L 5.413 8.416
          lineTo(x = 5.413f, y = 8.416f)
          // L 8 5.833
          lineTo(x = 8.0f, y = 5.833f)
          // L 8 14
          lineTo(x = 8.0f, y = 14.0f)
          // L 10 14
          lineTo(x = 10.0f, y = 14.0f)
          // L 10 5.833
          lineTo(x = 10.0f, y = 5.833f)
          // L 12.586 8.414
          lineTo(x = 12.586f, y = 8.414f)
          // L 14 7z
          lineTo(x = 14.0f, y = 7.0f)
          close()
        }
        // <polygon points="26.586 7.586 24.0 10.167 24.0 2.0 22.0 2.0 22.0 10.167 19.413 7.584 18.0 9.0 23.0 14.0 28.0 9.0 26.586 7.586" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.586 7.586
          moveTo(x = 26.586f, y = 7.586f)
          // L 24 10.167
          lineTo(x = 24.0f, y = 10.167f)
          // L 24 2
          lineTo(x = 24.0f, y = 2.0f)
          // L 22 2
          lineTo(x = 22.0f, y = 2.0f)
          // L 22 10.167
          lineTo(x = 22.0f, y = 10.167f)
          // L 19.413 7.584
          lineTo(x = 19.413f, y = 7.584f)
          // L 18 9
          lineTo(x = 18.0f, y = 9.0f)
          // L 23 14
          lineTo(x = 23.0f, y = 14.0f)
          // L 28 9
          lineTo(x = 28.0f, y = 9.0f)
          // L 26.586 7.586z
          lineTo(x = 26.586f, y = 7.586f)
          close()
        }
        // M20 20 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 16 17 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 12 20 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 8 17 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 4 20 H2 v2 h2 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 20 22 h10 v-2Z m8 8 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 24 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 20 28 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 16 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 12 28 H2 v2 h10 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 28 30 h2 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
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
          // A 1 1 0 0 0 16 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 17.0f,
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
          // A 3.4 3.4 0 0 1 12 20
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 20.0f,
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
          // A 1 1 0 0 0 8 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 17.0f,
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
          // A 3.4 3.4 0 0 1 4 20
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 20.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // A 5 5 0 0 0 20 22
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 22.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 8 8
          moveToRelative(dx = 8.0f, dy = 8.0f)
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
          // A 1 1 0 0 0 24 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
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
          // A 3.4 3.4 0 0 1 20 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
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
          // A 1 1 0 0 0 16 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
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
          // A 3.4 3.4 0 0 1 12 28
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 28.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // A 5 5 0 0 0 28 30
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 30.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _tides = it }
  }

@Suppress("ObjectPropertyName")
private var _tides: ImageVector? = null
