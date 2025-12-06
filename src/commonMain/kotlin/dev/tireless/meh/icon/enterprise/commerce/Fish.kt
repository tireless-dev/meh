// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fish: ImageVector
  get() {
    val current = _fish
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Fish",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="24.0" cy="7.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 7
          moveTo(x = 24.0f, y = 7.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M26 2 a16 16 0 0 0 -16 16 v2 H3 a1 1 0 0 0 -.7 1.7 l8 8 A1 1 0 0 0 12 29 v-7 h2 A16 16 0 0 0 30 6 V2Z M10 26.59 5.41 22 H10Z M12 20 v-2 a14 14 0 0 1 3.9 -9.68 l7.78 7.77 A14 14 0 0 1 14 20Z M28 6 a14 14 0 0 1 -2.98 8.6 l-7.63 -7.62 A14 14 0 0 1 26 4 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // a 16 16 0 0 0 -16 16
          arcToRelative(
            a = 16.0f,
            b = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -16.0f,
            dy1 = 16.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 0 -0.7 1.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.7f,
          )
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // A 1 1 0 0 0 12 29
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 29.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 16 16 0 0 0 30 6
          arcTo(
            horizontalEllipseRadius = 16.0f,
            verticalEllipseRadius = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 6.0f,
          )
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // M 10 26.59
          moveTo(x = 10.0f, y = 26.59f)
          // L 5.41 22
          lineTo(x = 5.41f, y = 22.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
          close()
          // M 12 20
          moveTo(x = 12.0f, y = 20.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 14 14 0 0 1 3.9 -9.68
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.9f,
            dy1 = -9.68f,
          )
          // l 7.78 7.77
          lineToRelative(dx = 7.78f, dy = 7.77f)
          // A 14 14 0 0 1 14 20z
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 20.0f,
          )
          close()
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // a 14 14 0 0 1 -2.98 8.6
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.98f,
            dy1 = 8.6f,
          )
          // l -7.63 -7.62
          lineToRelative(dx = -7.63f, dy = -7.62f)
          // A 14 14 0 0 1 26 4
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 4.0f,
          )
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _fish = it }
  }

@Suppress("ObjectPropertyName")
private var _fish: ImageVector? = null
