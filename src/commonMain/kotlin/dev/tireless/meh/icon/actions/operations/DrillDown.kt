// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DrillDown: ImageVector
  get() {
    val current = _drillDown
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DrillDown",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="10.0 6.0 11.414 4.586 15.0 8.172 15.0 0.0 17.0 0.0 17.0 8.172 20.586 4.586 22.0 6.0 16.0 12.0 10.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 6
          moveTo(x = 10.0f, y = 6.0f)
          // L 11.414 4.586
          lineTo(x = 11.414f, y = 4.586f)
          // L 15 8.172
          lineTo(x = 15.0f, y = 8.172f)
          // L 15 0
          lineTo(x = 15.0f, y = 0.0f)
          // L 17 0
          lineTo(x = 17.0f, y = 0.0f)
          // L 17 8.172
          lineTo(x = 17.0f, y = 8.172f)
          // L 20.586 4.586
          lineTo(x = 20.586f, y = 4.586f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // L 16 12
          lineTo(x = 16.0f, y = 12.0f)
          // L 10 6z
          lineTo(x = 10.0f, y = 6.0f)
          close()
        }
        // M22 16 a6 6 0 0 0 -1.76 -4.24 L16 16 l-4.24 -4.24 A6 6 0 1 0 22 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 16
          moveTo(x = 22.0f, y = 16.0f)
          // a 6 6 0 0 0 -1.76 -4.24
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.76f,
            dy1 = -4.24f,
          )
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // l -4.24 -4.24
          lineToRelative(dx = -4.24f, dy = -4.24f)
          // A 6 6 0 1 0 22 16
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 16.0f,
          )
        }
        // M30 16 a14 14 0 0 0 -4.1 -9.9 l-1.42 1.42 a12 12 0 1 1 -16.96 0 L6.1 6.1 A14 14 0 1 0 30 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // a 14 14 0 0 0 -4.1 -9.9
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.1f,
            dy1 = -9.9f,
          )
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // a 12 12 0 1 1 -16.96 0
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -16.96f,
            dy1 = 0.0f,
          )
          // L 6.1 6.1
          lineTo(x = 6.1f, y = 6.1f)
          // A 14 14 0 1 0 30 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
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
      .also { _drillDown = it }
  }

@Suppress("ObjectPropertyName")
private var _drillDown: ImageVector? = null
