// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoilMoistureField: ImageVector
  get() {
    val current = _soilMoistureField
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SoilMoistureField",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24.5 30 a5.2 5.2 0 0 1 -4.63 -8.08 l3.62 -5.38 a1.22 1.22 0 0 1 2.02 0 l3.55 5.28 A5.5 5.5 0 0 1 30 24.75 5.4 5.4 0 0 1 24.5 30 m0 -11.38 -2.94 4.37 A3.2 3.2 0 0 0 24.5 28 a3.4 3.4 0 0 0 3.5 -3.25 3.4 3.4 0 0 0 -.63 -1.87Z M11 16 v-5 h1 a4 4 0 0 0 4 -4 V4 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 5 2 H2 v3 a6 6 0 0 0 6 6 h1 v5 H2 v2 h14 v-2Z m2 -10 h1 v1 a2 2 0 0 1 -2 2 h-1 V8 a2 2 0 0 1 2 -2 M8 9 a4 4 0 0 1 -4 -4 V4 h1 a4 4 0 0 1 4 4 v1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.5 30
          moveTo(x = 24.5f, y = 30.0f)
          // a 5.2 5.2 0 0 1 -4.63 -8.08
          arcToRelative(
            a = 5.2f,
            b = 5.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.63f,
            dy1 = -8.08f,
          )
          // l 3.62 -5.38
          lineToRelative(dx = 3.62f, dy = -5.38f)
          // a 1.22 1.22 0 0 1 2.02 0
          arcToRelative(
            a = 1.22f,
            b = 1.22f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.02f,
            dy1 = 0.0f,
          )
          // l 3.55 5.28
          lineToRelative(dx = 3.55f, dy = 5.28f)
          // A 5.5 5.5 0 0 1 30 24.75
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 24.75f,
          )
          // A 5.4 5.4 0 0 1 24.5 30
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.5f,
            y1 = 30.0f,
          )
          // m 0 -11.38
          moveToRelative(dx = 0.0f, dy = -11.38f)
          // l -2.94 4.37
          lineToRelative(dx = -2.94f, dy = 4.37f)
          // A 3.2 3.2 0 0 0 24.5 28
          arcTo(
            horizontalEllipseRadius = 3.2f,
            verticalEllipseRadius = 3.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.5f,
            y1 = 28.0f,
          )
          // a 3.4 3.4 0 0 0 3.5 -3.25
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.5f,
            dy1 = -3.25f,
          )
          // a 3.4 3.4 0 0 0 -0.63 -1.87z
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.63f,
            dy1 = -1.87f,
          )
          close()
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
      .also { _soilMoistureField = it }
  }

@Suppress("ObjectPropertyName")
private var _soilMoistureField: ImageVector? = null
