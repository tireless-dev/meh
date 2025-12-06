// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Asset: ImageVector
  get() {
    val current = _asset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Asset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 24 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // M30 6 a4 4 0 0 0 -4 -4 4 4 0 0 0 -1.85 .48 l-16.4 8.48 a10 10 0 1 0 13.32 13.23 l8.49 -16.4 A4 4 0 0 0 30 6 m-4 -2 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 m-3.98 1.8 L22 6 a4 4 0 0 0 4 4 l.19 -.02 -4.33 8.36 a10 10 0 0 0 -8.22 -8.2Z M12 28 a8 8 0 1 1 8 -8 8 8 0 0 1 -8 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 0 -1.85 0.48
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.85f,
            dy1 = 0.48f,
          )
          // l -16.4 8.48
          lineToRelative(dx = -16.4f, dy = 8.48f)
          // a 10 10 0 1 0 13.32 13.23
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 13.32f,
            dy1 = 13.23f,
          )
          // l 8.49 -16.4
          lineToRelative(dx = 8.49f, dy = -16.4f)
          // A 4 4 0 0 0 30 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 6.0f,
          )
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m -3.98 1.8
          moveToRelative(dx = -3.98f, dy = 1.8f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // l 0.19 -0.02
          lineToRelative(dx = 0.19f, dy = -0.02f)
          // l -4.33 8.36
          lineToRelative(dx = -4.33f, dy = 8.36f)
          // a 10 10 0 0 0 -8.22 -8.2z
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.22f,
            dy1 = -8.2f,
          )
          close()
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // a 8 8 0 1 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // a 8 8 0 0 1 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 8.0f,
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
      .also { _asset = it }
  }

@Suppress("ObjectPropertyName")
private var _asset: ImageVector? = null
