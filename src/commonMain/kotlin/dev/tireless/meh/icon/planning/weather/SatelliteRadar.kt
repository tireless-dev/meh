// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SatelliteRadar: ImageVector
  get() {
    val current = _satelliteRadar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SatelliteRadar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 14 h-2 A10 10 0 0 0 18 4 V2 a12 12 0 0 1 12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 14
          moveTo(x = 30.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // A 10 10 0 0 0 18 4
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // a 12 12 0 0 1 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
        }
        // M26 14 h-2 a6 6 0 0 0 -6 -6 V6 a8 8 0 0 1 8 8 M16 28 v-3.04 a10 10 0 0 0 7.32 -2.2 A1.9 1.9 0 0 0 24 21.41 a1.8 1.8 0 0 0 -.53 -1.36 L18.41 15 21 12.41 19.59 11 17 13.59 l-5.06 -5.06 A1.8 1.8 0 0 0 10.58 8 a1.9 1.9 0 0 0 -1.33 .68 10 10 0 0 0 -.51 11.95 L6.28 28 H2 v2 h28 v-2Z m-5.32 -17.9 11.23 11.22 a8 8 0 0 1 -11.23 -11.23 M14 28 H8.39 l1.87 -5.63 A10 10 0 0 0 14 24.54Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 14
          moveTo(x = 26.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 8 8 0 0 1 8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 8.0f,
          )
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // v -3.04
          verticalLineToRelative(dy = -3.04f)
          // a 10 10 0 0 0 7.32 -2.2
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.32f,
            dy1 = -2.2f,
          )
          // A 1.9 1.9 0 0 0 24 21.41
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 21.41f,
          )
          // a 1.8 1.8 0 0 0 -0.53 -1.36
          arcToRelative(
            a = 1.8f,
            b = 1.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.53f,
            dy1 = -1.36f,
          )
          // L 18.41 15
          lineTo(x = 18.41f, y = 15.0f)
          // L 21 12.41
          lineTo(x = 21.0f, y = 12.41f)
          // L 19.59 11
          lineTo(x = 19.59f, y = 11.0f)
          // L 17 13.59
          lineTo(x = 17.0f, y = 13.59f)
          // l -5.06 -5.06
          lineToRelative(dx = -5.06f, dy = -5.06f)
          // A 1.8 1.8 0 0 0 10.58 8
          arcTo(
            horizontalEllipseRadius = 1.8f,
            verticalEllipseRadius = 1.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.58f,
            y1 = 8.0f,
          )
          // a 1.9 1.9 0 0 0 -1.33 0.68
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.33f,
            dy1 = 0.68f,
          )
          // a 10 10 0 0 0 -0.51 11.95
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = 11.95f,
          )
          // L 6.28 28
          lineTo(x = 6.28f, y = 28.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -5.32 -17.9
          moveToRelative(dx = -5.32f, dy = -17.9f)
          // l 11.23 11.22
          lineToRelative(dx = 11.23f, dy = 11.22f)
          // a 8 8 0 0 1 -11.23 -11.23
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.23f,
            dy1 = -11.23f,
          )
          // M 14 28
          moveTo(x = 14.0f, y = 28.0f)
          // H 8.39
          horizontalLineTo(x = 8.39f)
          // l 1.87 -5.63
          lineToRelative(dx = 1.87f, dy = -5.63f)
          // A 10 10 0 0 0 14 24.54z
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 24.54f,
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
      .also { _satelliteRadar = it }
  }

@Suppress("ObjectPropertyName")
private var _satelliteRadar: ImageVector? = null
