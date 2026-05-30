// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoilTemperatureField: ImageVector
  get() {
    val current = _soilTemperatureField
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SoilTemperatureField",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11 16 v-5 h1 a4 4 0 0 0 4 -4 V4 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 5 2 H2 v3 a6 6 0 0 0 6 6 h1 v5 H2 v2 h14 v-2Z m2 -10 h1 v1 a2 2 0 0 1 -2 2 h-1 V8 a2 2 0 0 1 2 -2 M8 9 a4 4 0 0 1 -4 -4 V4 h1 a4 4 0 0 1 4 4 v1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 4 4 0 0 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // a 4 4 0 0 0 -2.75 1.1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.75f,
            dy1 = 1.1f,
          )
          // A 6 6 0 0 0 5 2
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 2.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 6 6 0 0 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 2 -10
          moveToRelative(dx = 2.0f, dy = -10.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // v 1z
          verticalLineToRelative(dy = 1.0f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 21
          moveTo(x = 2.0f, y = 21.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="2.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 26
          moveTo(x = 2.0f, y = 26.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M25 30 a4.99 4.99 0 0 1 -3 -8.98 V15 a3 3 0 0 1 6 0 v6.02 A4.99 4.99 0 0 1 25 30 m0 -16 a1 1 0 0 0 -1 1 v7.13 l-.5 .29 A3 3 0 0 0 22 25 a3 3 0 0 0 6 0 3 3 0 0 0 -1.5 -2.58 L26 22.13 V15 a1 1 0 0 0 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 30
          moveTo(x = 25.0f, y = 30.0f)
          // a 4.99 4.99 0 0 1 -3 -8.98
          arcToRelative(
            a = 4.99f,
            b = 4.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -8.98f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // a 3 3 0 0 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // v 6.02
          verticalLineToRelative(dy = 6.02f)
          // A 4.99 4.99 0 0 1 25 30
          arcTo(
            horizontalEllipseRadius = 4.99f,
            verticalEllipseRadius = 4.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 30.0f,
          )
          // m 0 -16
          moveToRelative(dx = 0.0f, dy = -16.0f)
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
          // v 7.13
          verticalLineToRelative(dy = 7.13f)
          // l -0.5 0.29
          lineToRelative(dx = -0.5f, dy = 0.29f)
          // A 3 3 0 0 0 22 25
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 25.0f,
          )
          // a 3 3 0 0 0 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 0 0 -1.5 -2.58
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.5f,
            dy1 = -2.58f,
          )
          // L 26 22.13
          lineTo(x = 26.0f, y = 22.13f)
          // V 15
          verticalLineTo(y = 15.0f)
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
      .also { _soilTemperatureField = it }
  }

@Suppress("ObjectPropertyName")
private var _soilTemperatureField: ImageVector? = null
