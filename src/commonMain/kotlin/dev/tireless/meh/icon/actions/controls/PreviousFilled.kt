// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PreviousFilled: ImageVector
  get() {
    val current = _previousFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PreviousFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m8 15 H11.85 l5.58 5.57 L16 24 l-8 -8 8 -8 1.43 1.4 -5.58 5.6 H24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 8 15
          moveToRelative(dx = 8.0f, dy = 15.0f)
          // H 11.85
          horizontalLineTo(x = 11.85f)
          // l 5.58 5.57
          lineToRelative(dx = 5.58f, dy = 5.57f)
          // L 16 24
          lineTo(x = 16.0f, y = 24.0f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // l 1.43 1.4
          lineToRelative(dx = 1.43f, dy = 1.4f)
          // l -5.58 5.6
          lineToRelative(dx = -5.58f, dy = 5.6f)
          // H 24z
          horizontalLineTo(x = 24.0f)
          close()
        }
        // <polygon points="16.0 8.0 17.43 9.393 11.85 15.0 24.0 15.0 24.0 17.0 11.85 17.0 17.43 22.573 16.0 24.0 8.0 16.0 16.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // L 17.43 9.393
          lineTo(x = 17.43f, y = 9.393f)
          // L 11.85 15
          lineTo(x = 11.85f, y = 15.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 11.85 17
          lineTo(x = 11.85f, y = 17.0f)
          // L 17.43 22.573
          lineTo(x = 17.43f, y = 22.573f)
          // L 16 24
          lineTo(x = 16.0f, y = 24.0f)
          // L 8 16
          lineTo(x = 8.0f, y = 16.0f)
          // L 16 8z
          lineTo(x = 16.0f, y = 8.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _previousFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _previousFilled: ImageVector? = null
