// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashFilled: ImageVector
  get() {
    val current = _flashFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FlashFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11.61 29.92 a1 1 0 0 1 -.6 -1.07 L12.83 17 H8 a1 1 0 0 1 -1 -1.23 l3 -13 A1 1 0 0 1 11 2 h10 a1 1 0 0 1 .78 .37 1 1 0 0 1 .2 .85 L20.25 11 H25 a1 1 0 0 1 .9 .56 1 1 0 0 1 -.11 1 l-13 17 A1 1 0 0 1 12 30 a1 1 0 0 1 -.39 -.08
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.61 29.92
          moveTo(x = 11.61f, y = 29.92f)
          // a 1 1 0 0 1 -0.6 -1.07
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.6f,
            dy1 = -1.07f,
          )
          // L 12.83 17
          lineTo(x = 12.83f, y = 17.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 1 1 0 0 1 -1 -1.23
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.23f,
          )
          // l 3 -13
          lineToRelative(dx = 3.0f, dy = -13.0f)
          // A 1 1 0 0 1 11 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 1 0.78 0.37
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.78f,
            dy1 = 0.37f,
          )
          // a 1 1 0 0 1 0.2 0.85
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.2f,
            dy1 = 0.85f,
          )
          // L 20.25 11
          lineTo(x = 20.25f, y = 11.0f)
          // H 25
          horizontalLineTo(x = 25.0f)
          // a 1 1 0 0 1 0.9 0.56
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 0.56f,
          )
          // a 1 1 0 0 1 -0.11 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.11f,
            dy1 = 1.0f,
          )
          // l -13 17
          lineToRelative(dx = -13.0f, dy = 17.0f)
          // A 1 1 0 0 1 12 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 1 -0.39 -0.08
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.39f,
            dy1 = -0.08f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _flashFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _flashFilled: ImageVector? = null
