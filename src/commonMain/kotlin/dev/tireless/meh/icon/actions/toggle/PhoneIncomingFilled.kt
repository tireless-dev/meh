// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneIncomingFilled: ImageVector
  get() {
    val current = _phoneIncomingFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneIncomingFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m20.33 21.48 2.24 -2.24 a2.2 2.2 0 0 1 2.34 -.48 l2.73 1.1 a2.2 2.2 0 0 1 1.36 2 v4.97 A2.17 2.17 0 0 1 26.72 29 C7.59 27.8 3.73 11.6 3.02 5.4 A2.16 2.16 0 0 1 5.16 3 h4.87 a2.2 2.2 0 0 1 2.01 1.36 l1.1 2.73 a2.2 2.2 0 0 1 -.49 2.34 l-2.24 2.24 s1.25 8.73 9.91 9.81
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.33 21.48
          moveTo(x = 20.33f, y = 21.48f)
          // l 2.24 -2.24
          lineToRelative(dx = 2.24f, dy = -2.24f)
          // a 2.2 2.2 0 0 1 2.34 -0.48
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.34f,
            dy1 = -0.48f,
          )
          // l 2.73 1.1
          lineToRelative(dx = 2.73f, dy = 1.1f)
          // a 2.2 2.2 0 0 1 1.36 2
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.36f,
            dy1 = 2.0f,
          )
          // v 4.97
          verticalLineToRelative(dy = 4.97f)
          // A 2.17 2.17 0 0 1 26.72 29
          arcTo(
            horizontalEllipseRadius = 2.17f,
            verticalEllipseRadius = 2.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.72f,
            y1 = 29.0f,
          )
          // C 7.59 27.8 3.73 11.6 3.02 5.4
          curveTo(
            x1 = 7.59f,
            y1 = 27.8f,
            x2 = 3.73f,
            y2 = 11.6f,
            x3 = 3.02f,
            y3 = 5.4f,
          )
          // A 2.16 2.16 0 0 1 5.16 3
          arcTo(
            horizontalEllipseRadius = 2.16f,
            verticalEllipseRadius = 2.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.16f,
            y1 = 3.0f,
          )
          // h 4.87
          horizontalLineToRelative(dx = 4.87f)
          // a 2.2 2.2 0 0 1 2.01 1.36
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.01f,
            dy1 = 1.36f,
          )
          // l 1.1 2.73
          lineToRelative(dx = 1.1f, dy = 2.73f)
          // a 2.2 2.2 0 0 1 -0.49 2.34
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.49f,
            dy1 = 2.34f,
          )
          // l -2.24 2.24
          lineToRelative(dx = -2.24f, dy = 2.24f)
          // s 1.25 8.73 9.91 9.81
          reflectiveCurveToRelative(
            dx1 = 1.25f,
            dy1 = 8.73f,
            dx2 = 9.91f,
            dy2 = 9.81f,
          )
        }
        // <polygon points="27.0 13.0 27.0 11.0 22.414 11.0 29.0 4.414 27.586 3.0 21.0 9.586 21.0 5.0 19.0 5.0 19.0 13.0 27.0 13.0" fill="#000" style="fill:#231f20" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 13
          moveTo(x = 27.0f, y = 13.0f)
          // L 27 11
          lineTo(x = 27.0f, y = 11.0f)
          // L 22.414 11
          lineTo(x = 22.414f, y = 11.0f)
          // L 29 4.414
          lineTo(x = 29.0f, y = 4.414f)
          // L 27.586 3
          lineTo(x = 27.586f, y = 3.0f)
          // L 21 9.586
          lineTo(x = 21.0f, y = 9.586f)
          // L 21 5
          lineTo(x = 21.0f, y = 5.0f)
          // L 19 5
          lineTo(x = 19.0f, y = 5.0f)
          // L 19 13
          lineTo(x = 19.0f, y = 13.0f)
          // L 27 13z
          lineTo(x = 27.0f, y = 13.0f)
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
      .also { _phoneIncomingFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneIncomingFilled: ImageVector? = null
