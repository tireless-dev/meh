// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VehicleApi: ImageVector
  get() {
    val current = _vehicleApi
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VehicleApi",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 11 a2 2 0 0 0 -.82 .18 l-2.35 -1.67 A4 4 0 0 0 25 8.5 a4 4 0 0 0 -.17 -1.01 l2.35 -1.67 A2 2 0 1 0 26 4 l.02 .19 -2.3 1.63 A3.5 3.5 0 0 0 21.5 5 a3.5 3.5 0 0 0 0 7 3.5 3.5 0 0 0 2.23 -.82 l2.29 1.63 L26 13 a2 2 0 1 0 2 -2 m-6.5 -1 A1.5 1.5 0 1 1 23 8.5 a1.5 1.5 0 0 1 -1.5 1.5 m7.84 9.93 -7.73 -2.77 -3.24 -4.06 a3 3 0 0 0 -2.32 -1.1 h-8 a3 3 0 0 0 -2.47 1.31 L2.87 17.3 A5 5 0 0 0 2 20.11 V26 a1 1 0 0 0 1 1 h2.14 a3.98 3.98 0 0 0 7.72 0 h6.28 a3.98 3.98 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-5.12 a1 1 0 0 0 -.66 -.95 M9 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 0 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m5 -3 h-1.14 a3.98 3.98 0 0 0 -7.72 0 h-6.28 a3.98 3.98 0 0 0 -7.72 0 H4 v-4.9 a3 3 0 0 1 .52 -1.68 l2.71 -3.98 A1 1 0 0 1 8.06 14 h8 a1 1 0 0 1 .76 .35 l3.4 4.27 a1 1 0 0 0 .44 .32 L28 21.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 11
          moveTo(x = 28.0f, y = 11.0f)
          // a 2 2 0 0 0 -0.82 0.18
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.82f,
            dy1 = 0.18f,
          )
          // l -2.35 -1.67
          lineToRelative(dx = -2.35f, dy = -1.67f)
          // A 4 4 0 0 0 25 8.5
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 8.5f,
          )
          // a 4 4 0 0 0 -0.17 -1.01
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.17f,
            dy1 = -1.01f,
          )
          // l 2.35 -1.67
          lineToRelative(dx = 2.35f, dy = -1.67f)
          // A 2 2 0 1 0 26 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 4.0f,
          )
          // l 0.02 0.19
          lineToRelative(dx = 0.02f, dy = 0.19f)
          // l -2.3 1.63
          lineToRelative(dx = -2.3f, dy = 1.63f)
          // A 3.5 3.5 0 0 0 21.5 5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.5f,
            y1 = 5.0f,
          )
          // a 3.5 3.5 0 0 0 0 7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 7.0f,
          )
          // a 3.5 3.5 0 0 0 2.23 -0.82
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.23f,
            dy1 = -0.82f,
          )
          // l 2.29 1.63
          lineToRelative(dx = 2.29f, dy = 1.63f)
          // L 26 13
          lineTo(x = 26.0f, y = 13.0f)
          // a 2 2 0 1 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m -6.5 -1
          moveToRelative(dx = -6.5f, dy = -1.0f)
          // A 1.5 1.5 0 1 1 23 8.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 8.5f,
          )
          // a 1.5 1.5 0 0 1 -1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = 1.5f,
          )
          // m 7.84 9.93
          moveToRelative(dx = 7.84f, dy = 9.93f)
          // l -7.73 -2.77
          lineToRelative(dx = -7.73f, dy = -2.77f)
          // l -3.24 -4.06
          lineToRelative(dx = -3.24f, dy = -4.06f)
          // a 3 3 0 0 0 -2.32 -1.1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.32f,
            dy1 = -1.1f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 3 3 0 0 0 -2.47 1.31
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.47f,
            dy1 = 1.31f,
          )
          // L 2.87 17.3
          lineTo(x = 2.87f, y = 17.3f)
          // A 5 5 0 0 0 2 20.11
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 20.11f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
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
          // h 2.14
          horizontalLineToRelative(dx = 2.14f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // h 6.28
          horizontalLineToRelative(dx = 6.28f)
          // a 3.98 3.98 0 0 0 7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.72f,
            dy1 = 0.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -5.12
          verticalLineToRelative(dy = -5.12f)
          // a 1 1 0 0 0 -0.66 -0.95
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.66f,
            dy1 = -0.95f,
          )
          // M 9 28
          moveTo(x = 9.0f, y = 28.0f)
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
          // m 14 0
          moveToRelative(dx = 14.0f, dy = 0.0f)
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
          // m 5 -3
          moveToRelative(dx = 5.0f, dy = -3.0f)
          // h -1.14
          horizontalLineToRelative(dx = -1.14f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // h -6.28
          horizontalLineToRelative(dx = -6.28f)
          // a 3.98 3.98 0 0 0 -7.72 0
          arcToRelative(
            a = 3.98f,
            b = 3.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 0.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4.9
          verticalLineToRelative(dy = -4.9f)
          // a 3 3 0 0 1 0.52 -1.68
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.52f,
            dy1 = -1.68f,
          )
          // l 2.71 -3.98
          lineToRelative(dx = 2.71f, dy = -3.98f)
          // A 1 1 0 0 1 8.06 14
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.06f,
            y1 = 14.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 1 1 0 0 1 0.76 0.35
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.76f,
            dy1 = 0.35f,
          )
          // l 3.4 4.27
          lineToRelative(dx = 3.4f, dy = 4.27f)
          // a 1 1 0 0 0 0.44 0.32
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.44f,
            dy1 = 0.32f,
          )
          // L 28 21.58z
          lineTo(x = 28.0f, y = 21.58f)
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
      .also { _vehicleApi = it }
  }

@Suppress("ObjectPropertyName")
private var _vehicleApi: ImageVector? = null
