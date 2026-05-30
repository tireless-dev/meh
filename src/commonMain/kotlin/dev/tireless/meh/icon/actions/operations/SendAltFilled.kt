// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendAltFilled: ImageVector
  get() {
    val current = _sendAltFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SendAltFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.71 4.29 a1 1 0 0 0 -1.05 -.23 l-22 8 a1 1 0 0 0 0 1.87 l8.59 3.43 L19.59 11 21 12.41 l-6.37 6.37 3.44 8.59 A1 1 0 0 0 19 28 a1 1 0 0 0 .92 -.66 l8 -22 a1 1 0 0 0 -.21 -1.05
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.71 4.29
          moveTo(x = 27.71f, y = 4.29f)
          // a 1 1 0 0 0 -1.05 -0.23
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.05f,
            dy1 = -0.23f,
          )
          // l -22 8
          lineToRelative(dx = -22.0f, dy = 8.0f)
          // a 1 1 0 0 0 0 1.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.87f,
          )
          // l 8.59 3.43
          lineToRelative(dx = 8.59f, dy = 3.43f)
          // L 19.59 11
          lineTo(x = 19.59f, y = 11.0f)
          // L 21 12.41
          lineTo(x = 21.0f, y = 12.41f)
          // l -6.37 6.37
          lineToRelative(dx = -6.37f, dy = 6.37f)
          // l 3.44 8.59
          lineToRelative(dx = 3.44f, dy = 8.59f)
          // A 1 1 0 0 0 19 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 0 0.92 -0.66
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -0.66f,
          )
          // l 8 -22
          lineToRelative(dx = 8.0f, dy = -22.0f)
          // a 1 1 0 0 0 -0.21 -1.05
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.21f,
            dy1 = -1.05f,
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
      .also { _sendAltFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _sendAltFilled: ImageVector? = null
