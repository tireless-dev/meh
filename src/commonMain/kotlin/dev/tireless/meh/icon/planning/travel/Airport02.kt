// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airport02: ImageVector
  get() {
    val current = _airport02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Airport02",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 17 h-3.59 L16 13 h-2 l2.59 4 h-5.87 L9.5 15 H8 l1.06 3.3 A1 1 0 0 0 10 19 H23 a1 1 0 0 0 0 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 17
          moveTo(x = 23.0f, y = 17.0f)
          // h -3.59
          horizontalLineToRelative(dx = -3.59f)
          // L 16 13
          lineTo(x = 16.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l 2.59 4
          lineToRelative(dx = 2.59f, dy = 4.0f)
          // h -5.87
          horizontalLineToRelative(dx = -5.87f)
          // L 9.5 15
          lineTo(x = 9.5f, y = 15.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // l 1.06 3.3
          lineToRelative(dx = 1.06f, dy = 3.3f)
          // A 1 1 0 0 0 10 19
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 19.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // a 1 1 0 0 0 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _airport02 = it }
  }

@Suppress("ObjectPropertyName")
private var _airport02: ImageVector? = null
