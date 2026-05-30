// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceMask: ImageVector
  get() {
    val current = _faceMask
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceMask",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11.5 11 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5 m9 0 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.5 11
          moveTo(x = 11.5f, y = 11.0f)
          // a 2.5 2.5 0 1 0 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // a 2.5 2.5 0 0 0 -2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.5f,
            dy1 = -2.5f,
          )
          // m 9 0
          moveToRelative(dx = 9.0f, dy = 0.0f)
          // a 2.5 2.5 0 1 0 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // a 2.5 2.5 0 0 0 -2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.5f,
            dy1 = -2.5f,
          )
        }
        // M30 16 A14 14 0 1 0 8.9 28.04 L8.9 28.2 a2 2 0 0 0 2 1.8 h10.18 a2 2 0 0 0 2 -1.8 l.01 -.16 A14 14 0 0 0 30 16 M16 4 a12 12 0 0 1 11.97 11.4 l-5.2 2.6 H9.23 l-5.21 -2.6 A12 12 0 0 1 16 4 M4.12 17.68 l3.94 1.97 .58 5.8 a12 12 0 0 1 -4.52 -7.77 M21.09 28 H10.91 l-.8 -8 H21.9Z m2.27 -2.54 .58 -5.81 3.94 -1.97 a12 12 0 0 1 -4.52 7.78
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // A 14 14 0 1 0 8.9 28.04
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 8.9f,
            y1 = 28.04f,
          )
          // L 8.9 28.2
          lineTo(x = 8.9f, y = 28.2f)
          // a 2 2 0 0 0 2 1.8
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 1.8f,
          )
          // h 10.18
          horizontalLineToRelative(dx = 10.18f)
          // a 2 2 0 0 0 2 -1.8
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.8f,
          )
          // l 0.01 -0.16
          lineToRelative(dx = 0.01f, dy = -0.16f)
          // A 14 14 0 0 0 30 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // a 12 12 0 0 1 11.97 11.4
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.97f,
            dy1 = 11.4f,
          )
          // l -5.2 2.6
          lineToRelative(dx = -5.2f, dy = 2.6f)
          // H 9.23
          horizontalLineTo(x = 9.23f)
          // l -5.21 -2.6
          lineToRelative(dx = -5.21f, dy = -2.6f)
          // A 12 12 0 0 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // M 4.12 17.68
          moveTo(x = 4.12f, y = 17.68f)
          // l 3.94 1.97
          lineToRelative(dx = 3.94f, dy = 1.97f)
          // l 0.58 5.8
          lineToRelative(dx = 0.58f, dy = 5.8f)
          // a 12 12 0 0 1 -4.52 -7.77
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.52f,
            dy1 = -7.77f,
          )
          // M 21.09 28
          moveTo(x = 21.09f, y = 28.0f)
          // H 10.91
          horizontalLineTo(x = 10.91f)
          // l -0.8 -8
          lineToRelative(dx = -0.8f, dy = -8.0f)
          // H 21.9z
          horizontalLineTo(x = 21.9f)
          close()
          // m 2.27 -2.54
          moveToRelative(dx = 2.27f, dy = -2.54f)
          // l 0.58 -5.81
          lineToRelative(dx = 0.58f, dy = -5.81f)
          // l 3.94 -1.97
          lineToRelative(dx = 3.94f, dy = -1.97f)
          // a 12 12 0 0 1 -4.52 7.78
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.52f,
            dy1 = 7.78f,
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
      .also { _faceMask = it }
  }

@Suppress("ObjectPropertyName")
private var _faceMask: ImageVector? = null
