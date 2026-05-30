// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningAltInvertedFilled: ImageVector
  get() {
    val current = _warningAltInvertedFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningAltInvertedFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 20 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 20 m-1.12 -5 h2.24 V6 h-2.25Z
        path {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // a 1.5 1.5 0 1 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // A 1.5 1.5 0 0 1 16 20
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 20.0f,
          )
          // m -1.12 -5
          moveToRelative(dx = -1.12f, dy = -5.0f)
          // h 2.24
          horizontalLineToRelative(dx = 2.24f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2.25z
          horizontalLineToRelative(dx = -2.25f)
          close()
        }
        // M27.35 4 H4.65 L16 25.83z M14.87 6 h2.26 v9 h-2.25Z M16 20 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 20
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.35 4
          moveTo(x = 27.35f, y = 4.0f)
          // H 4.65
          horizontalLineTo(x = 4.65f)
          // L 16 25.83z
          lineTo(x = 16.0f, y = 25.83f)
          close()
          // M 14.87 6
          moveTo(x = 14.87f, y = 6.0f)
          // h 2.26
          horizontalLineToRelative(dx = 2.26f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2.25z
          horizontalLineToRelative(dx = -2.25f)
          close()
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // a 1.5 1.5 0 1 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // A 1.5 1.5 0 0 1 16 20
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 20.0f,
          )
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
      .also { _warningAltInvertedFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _warningAltInvertedFilled: ImageVector? = null
