// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Error: ImageVector
  get() {
    val current = _error
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Error",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M2 16 A14 14 0 1 0 16 2 14 14 0 0 0 2 16 m23.15 7.75 L8.25 6.85 a12 12 0 0 1 16.9 16.9 M8.24 25.16 a12 12 0 0 1 -1.4 -16.89 l16.89 16.89 a12 12 0 0 1 -15.49 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 16
          moveTo(x = 2.0f, y = 16.0f)
          // A 14 14 0 1 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // A 14 14 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // m 23.15 7.75
          moveToRelative(dx = 23.15f, dy = 7.75f)
          // L 8.25 6.85
          lineTo(x = 8.25f, y = 6.85f)
          // a 12 12 0 0 1 16.9 16.9
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 16.9f,
            dy1 = 16.9f,
          )
          // M 8.24 25.16
          moveTo(x = 8.24f, y = 25.16f)
          // a 12 12 0 0 1 -1.4 -16.89
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.4f,
            dy1 = -16.89f,
          )
          // l 16.89 16.89
          lineToRelative(dx = 16.89f, dy = 16.89f)
          // a 12 12 0 0 1 -15.49 0
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -15.49f,
            dy1 = 0.0f,
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
      .also { _error = it }
  }

@Suppress("ObjectPropertyName")
private var _error: ImageVector? = null
