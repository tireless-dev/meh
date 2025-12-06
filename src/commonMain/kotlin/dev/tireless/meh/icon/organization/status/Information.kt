// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Information: ImageVector
  get() {
    val current = _information
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Information",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 22.0 17.0 14.0 13.0 14.0 13.0 16.0 15.0 16.0 15.0 22.0 12.0 22.0 12.0 24.0 20.0 24.0 20.0 22.0 17.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 22
          moveTo(x = 17.0f, y = 22.0f)
          // L 17 14
          lineTo(x = 17.0f, y = 14.0f)
          // L 13 14
          lineTo(x = 13.0f, y = 14.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 15 16
          lineTo(x = 15.0f, y = 16.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 12 24
          lineTo(x = 12.0f, y = 24.0f)
          // L 20 24
          lineTo(x = 20.0f, y = 24.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 17 22z
          lineTo(x = 17.0f, y = 22.0f)
          close()
        }
        // M16 8 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // a 1.5 1.5 0 1 0 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // A 1.5 1.5 0 0 0 16 8
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 8.0f,
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
      .also { _information = it }
  }

@Suppress("ObjectPropertyName")
private var _information: ImageVector? = null
