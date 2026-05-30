// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TennisBall: ImageVector
  get() {
    val current = _tennisBall
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TennisBall",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 4 a8.98 8.98 0 0 0 -8.17 12.75 L2 25.6 3.41 27 l8.5 -8.49 a9 9 0 0 0 1.58 1.59 L10 23.59 11.41 25 l3.84 -3.83 A9 9 0 1 0 19 4 m6.9 7.9 a7 7 0 0 1 -5.8 -5.8 7 7 0 0 1 5.8 5.8 m-13.8 2.2 a7 7 0 0 1 5.8 5.8 7 7 0 0 1 -5.8 -5.8 m7.83 5.83 a9 9 0 0 0 -7.86 -7.86 7 7 0 0 1 6 -6 9 9 0 0 0 7.86 7.86 7 7 0 0 1 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 4
          moveTo(x = 19.0f, y = 4.0f)
          // a 8.98 8.98 0 0 0 -8.17 12.75
          arcToRelative(
            a = 8.98f,
            b = 8.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.17f,
            dy1 = 12.75f,
          )
          // L 2 25.6
          lineTo(x = 2.0f, y = 25.6f)
          // L 3.41 27
          lineTo(x = 3.41f, y = 27.0f)
          // l 8.5 -8.49
          lineToRelative(dx = 8.5f, dy = -8.49f)
          // a 9 9 0 0 0 1.58 1.59
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.58f,
            dy1 = 1.59f,
          )
          // L 10 23.59
          lineTo(x = 10.0f, y = 23.59f)
          // L 11.41 25
          lineTo(x = 11.41f, y = 25.0f)
          // l 3.84 -3.83
          lineToRelative(dx = 3.84f, dy = -3.83f)
          // A 9 9 0 1 0 19 4
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 4.0f,
          )
          // m 6.9 7.9
          moveToRelative(dx = 6.9f, dy = 7.9f)
          // a 7 7 0 0 1 -5.8 -5.8
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.8f,
            dy1 = -5.8f,
          )
          // a 7 7 0 0 1 5.8 5.8
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.8f,
            dy1 = 5.8f,
          )
          // m -13.8 2.2
          moveToRelative(dx = -13.8f, dy = 2.2f)
          // a 7 7 0 0 1 5.8 5.8
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.8f,
            dy1 = 5.8f,
          )
          // a 7 7 0 0 1 -5.8 -5.8
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.8f,
            dy1 = -5.8f,
          )
          // m 7.83 5.83
          moveToRelative(dx = 7.83f, dy = 5.83f)
          // a 9 9 0 0 0 -7.86 -7.86
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.86f,
            dy1 = -7.86f,
          )
          // a 7 7 0 0 1 6 -6
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 9 9 0 0 0 7.86 7.86
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.86f,
            dy1 = 7.86f,
          )
          // a 7 7 0 0 1 -6 6
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
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
      .also { _tennisBall = it }
  }

@Suppress("ObjectPropertyName")
private var _tennisBall: ImageVector? = null
