// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PortInput: ImageVector
  get() {
    val current = _portInput
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PortInput",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 28 c-3.6 0 -6.97 -1.59 -9.26 -4.36 l1.55 -1.28 A10.01 10.01 0 1 0 18 6 c-3 0 -5.8 1.33 -7.71 3.64 L8.74 8.36 A12.01 12.01 0 0 1 30 16 c0 6.62 -5.38 12 -12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // c -3.6 0 -6.97 -1.59 -9.26 -4.36
          curveToRelative(
            dx1 = -3.6f,
            dy1 = 0.0f,
            dx2 = -6.97f,
            dy2 = -1.59f,
            dx3 = -9.26f,
            dy3 = -4.36f,
          )
          // l 1.55 -1.28
          lineToRelative(dx = 1.55f, dy = -1.28f)
          // A 10.01 10.01 0 1 0 18 6
          arcTo(
            horizontalEllipseRadius = 10.01f,
            verticalEllipseRadius = 10.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 6.0f,
          )
          // c -3 0 -5.8 1.33 -7.71 3.64
          curveToRelative(
            dx1 = -3.0f,
            dy1 = 0.0f,
            dx2 = -5.8f,
            dy2 = 1.33f,
            dx3 = -7.71f,
            dy3 = 3.64f,
          )
          // L 8.74 8.36
          lineTo(x = 8.74f, y = 8.36f)
          // A 12.01 12.01 0 0 1 30 16
          arcTo(
            horizontalEllipseRadius = 12.01f,
            verticalEllipseRadius = 12.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          // c 0 6.62 -5.38 12 -12 12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 6.62f,
            dx2 = -5.38f,
            dy2 = 12.0f,
            dx3 = -12.0f,
            dy3 = 12.0f,
          )
        }
        // <polygon points="23.0 16.0 16.0 9.0 14.5859 10.4141 19.1719 15.0 2.0 15.0 2.0 17.0 19.1719 17.0 14.5859 21.5859 16.0 23.0 23.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 16
          moveTo(x = 23.0f, y = 16.0f)
          // L 16 9
          lineTo(x = 16.0f, y = 9.0f)
          // L 14.5859 10.4141
          lineTo(x = 14.5859f, y = 10.4141f)
          // L 19.1719 15
          lineTo(x = 19.1719f, y = 15.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 19.1719 17
          lineTo(x = 19.1719f, y = 17.0f)
          // L 14.5859 21.5859
          lineTo(x = 14.5859f, y = 21.5859f)
          // L 16 23
          lineTo(x = 16.0f, y = 23.0f)
          // L 23 16z
          lineTo(x = 23.0f, y = 16.0f)
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
      .also { _portInput = it }
  }

@Suppress("ObjectPropertyName")
private var _portInput: ImageVector? = null
