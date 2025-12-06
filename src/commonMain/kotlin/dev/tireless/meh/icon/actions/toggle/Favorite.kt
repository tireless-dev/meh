// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Favorite: ImageVector
  get() {
    val current = _favorite
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Favorite",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.45 6 a5.5 5.5 0 0 1 3.91 1.64 5.7 5.7 0 0 1 0 8 L16 26.13 5.64 15.64 a5.7 5.7 0 0 1 0 -8 5.5 5.5 0 0 1 7.82 0 l2.54 2.6 2.53 -2.58 A5.4 5.4 0 0 1 22.45 6 m0 -2 a7.5 7.5 0 0 0 -5.34 2.24 L16 7.36 l-1.11 -1.12 a7.5 7.5 0 0 0 -10.68 0 7.7 7.7 0 0 0 0 10.82 L16 29 l11.79 -11.94 a7.7 7.7 0 0 0 0 -10.82 A7.5 7.5 0 0 0 22.45 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.45 6
          moveTo(x = 22.45f, y = 6.0f)
          // a 5.5 5.5 0 0 1 3.91 1.64
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.91f,
            dy1 = 1.64f,
          )
          // a 5.7 5.7 0 0 1 0 8
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // L 16 26.13
          lineTo(x = 16.0f, y = 26.13f)
          // L 5.64 15.64
          lineTo(x = 5.64f, y = 15.64f)
          // a 5.7 5.7 0 0 1 0 -8
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // a 5.5 5.5 0 0 1 7.82 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.82f,
            dy1 = 0.0f,
          )
          // l 2.54 2.6
          lineToRelative(dx = 2.54f, dy = 2.6f)
          // l 2.53 -2.58
          lineToRelative(dx = 2.53f, dy = -2.58f)
          // A 5.4 5.4 0 0 1 22.45 6
          arcTo(
            horizontalEllipseRadius = 5.4f,
            verticalEllipseRadius = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.45f,
            y1 = 6.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 7.5 7.5 0 0 0 -5.34 2.24
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.34f,
            dy1 = 2.24f,
          )
          // L 16 7.36
          lineTo(x = 16.0f, y = 7.36f)
          // l -1.11 -1.12
          lineToRelative(dx = -1.11f, dy = -1.12f)
          // a 7.5 7.5 0 0 0 -10.68 0
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.68f,
            dy1 = 0.0f,
          )
          // a 7.7 7.7 0 0 0 0 10.82
          arcToRelative(
            a = 7.7f,
            b = 7.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.82f,
          )
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 11.79 -11.94
          lineToRelative(dx = 11.79f, dy = -11.94f)
          // a 7.7 7.7 0 0 0 0 -10.82
          arcToRelative(
            a = 7.7f,
            b = 7.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -10.82f,
          )
          // A 7.5 7.5 0 0 0 22.45 4
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.45f,
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
      .also { _favorite = it }
  }

@Suppress("ObjectPropertyName")
private var _favorite: ImageVector? = null
