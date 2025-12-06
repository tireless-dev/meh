// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MeterAlt: ImageVector
  get() {
    val current = _meterAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MeterAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 20 a14 14 0 0 0 -2.23 -7.53 l-1.44 1.45 A12 12 0 0 1 28 20Z M28 9.41 26.59 8 l-8.57 8.57 A4 4 0 0 0 16 16 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2.02Z M16 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m0 -14 a12 12 0 0 1 6.08 1.67 l1.46 -1.45 A13.98 13.98 0 0 0 2 20 h2 A12 12 0 0 1 16 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 20
          moveTo(x = 30.0f, y = 20.0f)
          // a 14 14 0 0 0 -2.23 -7.53
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.23f,
            dy1 = -7.53f,
          )
          // l -1.44 1.45
          lineToRelative(dx = -1.44f, dy = 1.45f)
          // A 12 12 0 0 1 28 20z
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 20.0f,
          )
          close()
          // M 28 9.41
          moveTo(x = 28.0f, y = 9.41f)
          // L 26.59 8
          lineTo(x = 26.59f, y = 8.0f)
          // l -8.57 8.57
          lineToRelative(dx = -8.57f, dy = 8.57f)
          // A 4 4 0 0 0 16 16
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 16.0f,
          )
          // a 4 4 0 1 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 -0.57 -2.02z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.57f,
            dy1 = -2.02f,
          )
          close()
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
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
          // m 0 -14
          moveToRelative(dx = 0.0f, dy = -14.0f)
          // a 12 12 0 0 1 6.08 1.67
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.08f,
            dy1 = 1.67f,
          )
          // l 1.46 -1.45
          lineToRelative(dx = 1.46f, dy = -1.45f)
          // A 13.98 13.98 0 0 0 2 20
          arcTo(
            horizontalEllipseRadius = 13.98f,
            verticalEllipseRadius = 13.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 20.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 12 12 0 0 1 16 8
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
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
      .also { _meterAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _meterAlt: ImageVector? = null
