// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendAlt: ImageVector
  get() {
    val current = _sendAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SendAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.71 4.29 a1 1 0 0 0 -1.05 -.23 l-22 8 a1 1 0 0 0 0 1.87 l9.6 3.84 3.84 9.6 A1 1 0 0 0 19 28 a1 1 0 0 0 .92 -.66 l8 -22 a1 1 0 0 0 -.21 -1.05 M19 24.2 l-2.79 -7 L21 12.41 19.59 11 l-4.83 4.83 L7.8 13 l17.53 -6.33Z
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
          // l 9.6 3.84
          lineToRelative(dx = 9.6f, dy = 3.84f)
          // l 3.84 9.6
          lineToRelative(dx = 3.84f, dy = 9.6f)
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
          // M 19 24.2
          moveTo(x = 19.0f, y = 24.2f)
          // l -2.79 -7
          lineToRelative(dx = -2.79f, dy = -7.0f)
          // L 21 12.41
          lineTo(x = 21.0f, y = 12.41f)
          // L 19.59 11
          lineTo(x = 19.59f, y = 11.0f)
          // l -4.83 4.83
          lineToRelative(dx = -4.83f, dy = 4.83f)
          // L 7.8 13
          lineTo(x = 7.8f, y = 13.0f)
          // l 17.53 -6.33z
          lineToRelative(dx = 17.53f, dy = -6.33f)
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
      .also { _sendAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _sendAlt: ImageVector? = null
