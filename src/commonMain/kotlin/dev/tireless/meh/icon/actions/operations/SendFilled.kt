// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendFilled: ImageVector
  get() {
    val current = _sendFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SendFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m27.45 15.11 -22 -11 a1 1 0 0 0 -1.08 .12 1 1 0 0 0 -.33 1 L6.69 15 H18 v2 H6.69 L4 26.74 A1 1 0 0 0 5 28 a1 1 0 0 0 .45 -.11 l22 -11 a1 1 0 0 0 0 -1.78
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.45 15.11
          moveTo(x = 27.45f, y = 15.11f)
          // l -22 -11
          lineToRelative(dx = -22.0f, dy = -11.0f)
          // a 1 1 0 0 0 -1.08 0.12
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.08f,
            dy1 = 0.12f,
          )
          // a 1 1 0 0 0 -0.33 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.33f,
            dy1 = 1.0f,
          )
          // L 6.69 15
          lineTo(x = 6.69f, y = 15.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6.69
          horizontalLineTo(x = 6.69f)
          // L 4 26.74
          lineTo(x = 4.0f, y = 26.74f)
          // A 1 1 0 0 0 5 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 0 0.45 -0.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.45f,
            dy1 = -0.11f,
          )
          // l 22 -11
          lineToRelative(dx = 22.0f, dy = -11.0f)
          // a 1 1 0 0 0 0 -1.78
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.78f,
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
      .also { _sendFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _sendFilled: ImageVector? = null
