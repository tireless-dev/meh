// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FishMultiple: ImageVector
  get() {
    val current = _fishMultiple
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FishMultiple",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 14 a13 13 0 0 0 -3.83 -9.24 L24.41 3 23 4.41 l1.76 1.76 a11.07 11.07 0 0 1 0 15.66 L22 24.59 23.41 26 l2.76 -2.76 A13 13 0 0 0 30 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 14
          moveTo(x = 30.0f, y = 14.0f)
          // a 13 13 0 0 0 -3.83 -9.24
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.83f,
            dy1 = -9.24f,
          )
          // L 24.41 3
          lineTo(x = 24.41f, y = 3.0f)
          // L 23 4.41
          lineTo(x = 23.0f, y = 4.41f)
          // l 1.76 1.76
          lineToRelative(dx = 1.76f, dy = 1.76f)
          // a 11.07 11.07 0 0 1 0 15.66
          arcToRelative(
            a = 11.07f,
            b = 11.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 15.66f,
          )
          // L 22 24.59
          lineTo(x = 22.0f, y = 24.59f)
          // L 23.41 26
          lineTo(x = 23.41f, y = 26.0f)
          // l 2.76 -2.76
          lineToRelative(dx = 2.76f, dy = -2.76f)
          // A 13 13 0 0 0 30 14
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 14.0f,
          )
        }
        // <circle cx="17.0" cy="11.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 11
          moveTo(x = 17.0f, y = 11.0f)
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
        // M22 14 a13 13 0 0 0 -3.83 -9.24 L16.41 3 15 4.41 l1.76 1.76 a11.07 11.07 0 0 1 0 15.66 L14 24.59 15.41 26 l2.76 -2.76 A13 13 0 0 0 22 14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 14
          moveTo(x = 22.0f, y = 14.0f)
          // a 13 13 0 0 0 -3.83 -9.24
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.83f,
            dy1 = -9.24f,
          )
          // L 16.41 3
          lineTo(x = 16.41f, y = 3.0f)
          // L 15 4.41
          lineTo(x = 15.0f, y = 4.41f)
          // l 1.76 1.76
          lineToRelative(dx = 1.76f, dy = 1.76f)
          // a 11.07 11.07 0 0 1 0 15.66
          arcToRelative(
            a = 11.07f,
            b = 11.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 15.66f,
          )
          // L 14 24.59
          lineTo(x = 14.0f, y = 24.59f)
          // L 15.41 26
          lineTo(x = 15.41f, y = 26.0f)
          // l 2.76 -2.76
          lineToRelative(dx = 2.76f, dy = -2.76f)
          // A 13 13 0 0 0 22 14
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 14.0f,
          )
        }
        // <circle cx="25.0" cy="11.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
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
        // <circle cx="9.0" cy="11.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 11
          moveTo(x = 9.0f, y = 11.0f)
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
        // m9.41 24 .76 -.76 a13.07 13.07 0 0 0 0 -18.48 L8 2.59 5.83 4.76 a13.07 13.07 0 0 0 0 18.48 L6.59 24 l-4.3 4.3 A1 1 0 0 0 3 30 h10 a1 1 0 0 0 .7 -1.7Z M4 14 a11 11 0 0 1 3.24 -7.83 L8 5.41 l.76 .76 a11.07 11.07 0 0 1 0 15.66 L8 22.59 l-.76 -.76 A11 11 0 0 1 4 14 m1.41 14 L8 25.41 10.59 28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.41 24
          moveTo(x = 9.41f, y = 24.0f)
          // l 0.76 -0.76
          lineToRelative(dx = 0.76f, dy = -0.76f)
          // a 13.07 13.07 0 0 0 0 -18.48
          arcToRelative(
            a = 13.07f,
            b = 13.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -18.48f,
          )
          // L 8 2.59
          lineTo(x = 8.0f, y = 2.59f)
          // L 5.83 4.76
          lineTo(x = 5.83f, y = 4.76f)
          // a 13.07 13.07 0 0 0 0 18.48
          arcToRelative(
            a = 13.07f,
            b = 13.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 18.48f,
          )
          // L 6.59 24
          lineTo(x = 6.59f, y = 24.0f)
          // l -4.3 4.3
          lineToRelative(dx = -4.3f, dy = 4.3f)
          // A 1 1 0 0 0 3 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 0.7 -1.7z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.7f,
            dy1 = -1.7f,
          )
          close()
          // M 4 14
          moveTo(x = 4.0f, y = 14.0f)
          // a 11 11 0 0 1 3.24 -7.83
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.24f,
            dy1 = -7.83f,
          )
          // L 8 5.41
          lineTo(x = 8.0f, y = 5.41f)
          // l 0.76 0.76
          lineToRelative(dx = 0.76f, dy = 0.76f)
          // a 11.07 11.07 0 0 1 0 15.66
          arcToRelative(
            a = 11.07f,
            b = 11.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 15.66f,
          )
          // L 8 22.59
          lineTo(x = 8.0f, y = 22.59f)
          // l -0.76 -0.76
          lineToRelative(dx = -0.76f, dy = -0.76f)
          // A 11 11 0 0 1 4 14
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 14.0f,
          )
          // m 1.41 14
          moveToRelative(dx = 1.41f, dy = 14.0f)
        // L 8 25.41
        lineTo(x = 8.0f, y = 25.41f)
        // L 10.59 28z
        lineTo(x = 10.59f, y = 28.0f)
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
      .also { _fishMultiple = it }
  }

@Suppress("ObjectPropertyName")
private var _fishMultiple: ImageVector? = null
