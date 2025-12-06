// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SAP: ImageVector
  get() {
    val current = _sAP
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SAP",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 8 h-6.18 A3 3 0 0 0 20 6 a3 3 0 0 0 -2.82 2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h1.18 A3 3 0 0 0 8 26 a3 3 0 0 0 2.82 -2 H15 a1 1 0 0 0 .7 -.3 l14 -14 A1 1 0 0 0 29 8 m-9 0 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M8 24 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m6.59 -2 h-3.77 A3 3 0 0 0 8 20 a3 3 0 0 0 -2.82 2 H4 V10 h13.18 A3 3 0 0 0 20 12 a3 3 0 0 0 2.82 -2 h3.77z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 8
          moveTo(x = 29.0f, y = 8.0f)
          // h -6.18
          horizontalLineToRelative(dx = -6.18f)
          // A 3 3 0 0 0 20 6
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 6.0f,
          )
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 1.18
          horizontalLineToRelative(dx = 1.18f)
          // A 3 3 0 0 0 8 26
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 26.0f,
          )
          // a 3 3 0 0 0 2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = -2.0f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // a 1 1 0 0 0 0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.7f,
            dy1 = -0.3f,
          )
          // l 14 -14
          lineToRelative(dx = 14.0f, dy = -14.0f)
          // A 1 1 0 0 0 29 8
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 8.0f,
          )
          // m -9 0
          moveToRelative(dx = -9.0f, dy = 0.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // M 8 24
          moveTo(x = 8.0f, y = 24.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 6.59 -2
          moveToRelative(dx = 6.59f, dy = -2.0f)
          // h -3.77
          horizontalLineToRelative(dx = -3.77f)
          // A 3 3 0 0 0 8 20
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 20.0f,
          )
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 13.18
          horizontalLineToRelative(dx = 13.18f)
          // A 3 3 0 0 0 20 12
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 12.0f,
          )
          // a 3 3 0 0 0 2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = -2.0f,
          )
          // h 3.77z
          horizontalLineToRelative(dx = 3.77f)
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
      .also { _sAP = it }
  }

@Suppress("ObjectPropertyName")
private var _sAP: ImageVector? = null
