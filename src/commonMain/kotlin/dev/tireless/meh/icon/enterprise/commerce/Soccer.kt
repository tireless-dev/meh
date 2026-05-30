// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Soccer: ImageVector
  get() {
    val current = _soccer
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Soccer",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="17.0" cy="28.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 28
          moveTo(x = 17.0f, y = 28.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <rect width="8" height="2" x="7.55" y="17.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.9998207 20.585964
          moveTo(x = 7.9998207f, y = 20.585964f)
          // l 5.656854 -5.656854
          lineToRelative(dx = 5.656854f, dy = -5.656854f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -5.656854 5.656854z
          lineToRelative(dx = -5.656854f, dy = 5.656854f)
          close()
        }
        // M28 16.58 19.41 8 H6 v2 h12.59 l3 3 L6 28.59 7.41 30 23 14.42 26.58 18 23 21.59 24.41 23 28 19.42 a2 2 0 0 0 0 -2.84 M24.5 9 A3.5 3.5 0 1 1 28 5.5 3.5 3.5 0 0 1 24.5 9 m0 -5 A1.5 1.5 0 1 0 26 5.5 1.5 1.5 0 0 0 24.5 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16.58
          moveTo(x = 28.0f, y = 16.58f)
          // L 19.41 8
          lineTo(x = 19.41f, y = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 12.59
          horizontalLineToRelative(dx = 12.59f)
          // l 3 3
          lineToRelative(dx = 3.0f, dy = 3.0f)
          // L 6 28.59
          lineTo(x = 6.0f, y = 28.59f)
          // L 7.41 30
          lineTo(x = 7.41f, y = 30.0f)
          // L 23 14.42
          lineTo(x = 23.0f, y = 14.42f)
          // L 26.58 18
          lineTo(x = 26.58f, y = 18.0f)
          // L 23 21.59
          lineTo(x = 23.0f, y = 21.59f)
          // L 24.41 23
          lineTo(x = 24.41f, y = 23.0f)
          // L 28 19.42
          lineTo(x = 28.0f, y = 19.42f)
          // a 2 2 0 0 0 0 -2.84
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.84f,
          )
          // M 24.5 9
          moveTo(x = 24.5f, y = 9.0f)
          // A 3.5 3.5 0 1 1 28 5.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 5.5f,
          )
          // A 3.5 3.5 0 0 1 24.5 9
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.5f,
            y1 = 9.0f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // A 1.5 1.5 0 1 0 26 5.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 5.5f,
          )
          // A 1.5 1.5 0 0 0 24.5 4
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.5f,
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
      .also { _soccer = it }
  }

@Suppress("ObjectPropertyName")
private var _soccer: ImageVector? = null
