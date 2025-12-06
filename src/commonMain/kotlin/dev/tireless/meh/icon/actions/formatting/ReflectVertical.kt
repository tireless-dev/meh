// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReflectVertical: ImageVector
  get() {
    val current = _reflectVertical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ReflectVertical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16.79 19.39 7 9 A1 1 0 0 1 23 30 H9 a1 1 0 0 1 -.79 -1.61 l7 -9 a1 1 0 0 1 1.58 0
        path(
          fill = SolidColor(Color(0xFF272425)),
        ) {
          // M 16.79 19.39
          moveTo(x = 16.79f, y = 19.39f)
          // l 7 9
          lineToRelative(dx = 7.0f, dy = 9.0f)
          // A 1 1 0 0 1 23 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 30.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 1 1 0 0 1 -0.79 -1.61
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.79f,
            dy1 = -1.61f,
          )
          // l 7 -9
          lineToRelative(dx = 7.0f, dy = -9.0f)
          // a 1 1 0 0 1 1.58 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.58f,
            dy1 = 0.0f,
          )
        }
        // <rect width="2" height="28" x="15.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 1.9999993 17
          moveTo(x = 1.9999993f, y = 17.0f)
          // l -8.742278E-8 -2
          lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
          // l 28 -1.2239188E-6
          lineToRelative(dx = 28.0f, dy = -1.2239188E-6f)
          // l 8.742278E-8 2z
          lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
          close()
        }
        // M16 13 a1 1 0 0 1 -.79 -.39 l-7 -9 A1 1 0 0 1 9 2 h14 a1 1 0 0 1 .79 1.61 l-7 9 A1 1 0 0 1 16 13 m-4.96 -9 L16 10.37 20.96 4Z
        path(
          fill = SolidColor(Color(0xFF272425)),
        ) {
          // M 16 13
          moveTo(x = 16.0f, y = 13.0f)
          // a 1 1 0 0 1 -0.79 -0.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.79f,
            dy1 = -0.39f,
          )
          // l -7 -9
          lineToRelative(dx = -7.0f, dy = -9.0f)
          // A 1 1 0 0 1 9 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 2.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // a 1 1 0 0 1 0.79 1.61
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.79f,
            dy1 = 1.61f,
          )
          // l -7 9
          lineToRelative(dx = -7.0f, dy = 9.0f)
          // A 1 1 0 0 1 16 13
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 13.0f,
          )
          // m -4.96 -9
          moveToRelative(dx = -4.96f, dy = -9.0f)
          // L 16 10.37
          lineTo(x = 16.0f, y = 10.37f)
          // L 20.96 4z
          lineTo(x = 20.96f, y = 4.0f)
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
      .also { _reflectVertical = it }
  }

@Suppress("ObjectPropertyName")
private var _reflectVertical: ImageVector? = null
