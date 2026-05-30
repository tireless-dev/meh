// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningAltInverted: ImageVector
  get() {
    val current = _warningAltInverted
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningAltInverted",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 17 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 17
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 17
          moveTo(x = 16.0f, y = 17.0f)
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
          // A 1.5 1.5 0 0 0 16 17
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 17.0f,
          )
        }
        // <rect width="2" height="9" x="15.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 6
          moveTo(x = 15.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M29.86 2.48 a1 1 0 0 1 .03 .98 l-13 25 a1 1 0 0 1 -1.78 0 l-13 -25 A1 1 0 0 1 3 2 h26 a1 1 0 0 1 .86 .48 M4.64 4 16 25.83 27.35 4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.86 2.48
          moveTo(x = 29.86f, y = 2.48f)
          // a 1 1 0 0 1 0.03 0.98
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.03f,
            dy1 = 0.98f,
          )
          // l -13 25
          lineToRelative(dx = -13.0f, dy = 25.0f)
          // a 1 1 0 0 1 -1.78 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.78f,
            dy1 = 0.0f,
          )
          // l -13 -25
          lineToRelative(dx = -13.0f, dy = -25.0f)
          // A 1 1 0 0 1 3 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 2.0f,
          )
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // a 1 1 0 0 1 0.86 0.48
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.86f,
            dy1 = 0.48f,
          )
          // M 4.64 4
          moveTo(x = 4.64f, y = 4.0f)
          // L 16 25.83
          lineTo(x = 16.0f, y = 25.83f)
          // L 27.35 4z
          lineTo(x = 27.35f, y = 4.0f)
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
      .also { _warningAltInverted = it }
  }

@Suppress("ObjectPropertyName")
private var _warningAltInverted: ImageVector? = null
