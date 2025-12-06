// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceCool: ImageVector
  get() {
    val current = _faceCool
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceCool",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 24 a8 8 0 0 0 6.85 -3.89 l-1.71 -1 a6 6 0 0 1 -10.28 0 l-1.71 1 A8 8 0 0 0 16 24
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 8 8 0 0 0 6.85 -3.89
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.85f,
            dy1 = -3.89f,
          )
          // l -1.71 -1
          lineToRelative(dx = -1.71f, dy = -1.0f)
          // a 6 6 0 0 1 -10.28 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.28f,
            dy1 = 0.0f,
          )
          // l -1.71 1
          lineToRelative(dx = -1.71f, dy = 1.0f)
          // A 8 8 0 0 0 16 24
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 24.0f,
          )
        }
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 2 a12 12 0 0 1 10.89 7 H25 a1 1 0 0 0 -1 -1 H8 a1 1 0 0 0 -1 1 H5.11 A12 12 0 0 1 16 4 m0 24 A12 12 0 0 1 4 16 a12 12 0 0 1 .4 -3 H7 v2 a2 2 0 0 0 2 2 h3.31 a2 2 0 0 0 2 -1.67 L14.83 12 h2.34 l.55 3.33 a2 2 0 0 0 2 1.67 H23 a2 2 0 0 0 2 -2 v-2 h2.6 a12 12 0 0 1 .4 3 12 12 0 0 1 -12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // a 12 12 0 0 1 10.89 7
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.89f,
            dy1 = 7.0f,
          )
          // H 25
          horizontalLineTo(x = 25.0f)
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
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // H 5.11
          horizontalLineTo(x = 5.11f)
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
          // m 0 24
          moveToRelative(dx = 0.0f, dy = 24.0f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // a 12 12 0 0 1 0.4 -3
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.4f,
            dy1 = -3.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 3.31
          horizontalLineToRelative(dx = 3.31f)
          // a 2 2 0 0 0 2 -1.67
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.67f,
          )
          // L 14.83 12
          lineTo(x = 14.83f, y = 12.0f)
          // h 2.34
          horizontalLineToRelative(dx = 2.34f)
          // l 0.55 3.33
          lineToRelative(dx = 0.55f, dy = 3.33f)
          // a 2 2 0 0 0 2 1.67
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 1.67f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2.6
          horizontalLineToRelative(dx = 2.6f)
          // a 12 12 0 0 1 0.4 3
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.4f,
            dy1 = 3.0f,
          )
          // a 12 12 0 0 1 -12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -12.0f,
            dy1 = 12.0f,
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
      .also { _faceCool = it }
  }

@Suppress("ObjectPropertyName")
private var _faceCool: ImageVector? = null
