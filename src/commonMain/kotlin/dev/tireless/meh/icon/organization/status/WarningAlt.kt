// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningAlt: ImageVector
  get() {
    val current = _warningAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 23 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 23
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
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
          // A 1.5 1.5 0 0 0 16 23
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 23.0f,
          )
        }
        // <rect width="2" height="9" x="15.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 12
          moveTo(x = 15.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M29 30 H3 a1 1 0 0 1 -.89 -1.46 l13 -25 a1 1 0 0 1 1.78 0 l13 25 A1 1 0 0 1 29 30 M4.65 28 h22.7 L16 6.17z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 30
          moveTo(x = 29.0f, y = 30.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 -0.89 -1.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = -1.46f,
          )
          // l 13 -25
          lineToRelative(dx = 13.0f, dy = -25.0f)
          // a 1 1 0 0 1 1.78 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.78f,
            dy1 = 0.0f,
          )
          // l 13 25
          lineToRelative(dx = 13.0f, dy = 25.0f)
          // A 1 1 0 0 1 29 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 30.0f,
          )
          // M 4.65 28
          moveTo(x = 4.65f, y = 28.0f)
          // h 22.7
          horizontalLineToRelative(dx = 22.7f)
          // L 16 6.17z
          lineTo(x = 16.0f, y = 6.17f)
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
      .also { _warningAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _warningAlt: ImageVector? = null
