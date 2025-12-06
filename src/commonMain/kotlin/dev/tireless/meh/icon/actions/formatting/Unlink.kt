// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unlink: ImageVector
  get() {
    val current = _unlink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Unlink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="5" x="5.0" y="3.59" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3.5838833 5.0020366
          moveTo(x = 3.5838833f, y = 5.0020366f)
          // l 1.4139667 -1.4144604
          lineToRelative(dx = 1.4139667f, dy = -1.4144604f)
          // l 3.536151 3.5349166
          lineToRelative(dx = 3.536151f, dy = 3.5349166f)
          // l -1.4139667 1.4144604z
          lineToRelative(dx = -1.4139667f, dy = 1.4144604f)
          close()
        }
        // <rect width="2" height="5" x="25.0" y="23.58" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.581112 24.99166
          moveTo(x = 23.581112f, y = 24.99166f)
          // l 1.4144603 -1.4139668
          lineToRelative(dx = 1.4144603f, dy = -1.4139668f)
          // l 3.5349169 3.5361507
          lineToRelative(dx = 3.5349169f, dy = 3.5361507f)
          // l -1.4144603 1.4139668z
          lineToRelative(dx = -1.4144603f, dy = 1.4139668f)
          close()
        }
        // <rect width="2" height="4" x="11.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 2
          moveTo(x = 11.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="2.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 11
          moveTo(x = 2.0f, y = 11.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="26.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 19
          moveTo(x = 26.0f, y = 19.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="2" height="4" x="19.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 26
          moveTo(x = 19.0f, y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // m16.58 21.07 -3.71 3.72 a4 4 0 1 1 -5.66 -5.66 l3.72 -3.72 L9.51 14 5.8 17.72 a6 6 0 0 0 -.06 8.54 A6 6 0 0 0 10 28 a6 6 0 0 0 4.32 -1.8 L18 22.49Z m-1.17 -10.14 3.72 -3.72 a4 4 0 1 1 5.66 5.66 l-3.72 3.72 L22.49 18 l3.71 -3.72 a6 6 0 0 0 .06 -8.54 A6 6 0 0 0 22 4 a6 6 0 0 0 -4.32 1.8 L14 9.51Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.58 21.07
          moveTo(x = 16.58f, y = 21.07f)
          // l -3.71 3.72
          lineToRelative(dx = -3.71f, dy = 3.72f)
          // a 4 4 0 1 1 -5.66 -5.66
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.66f,
            dy1 = -5.66f,
          )
          // l 3.72 -3.72
          lineToRelative(dx = 3.72f, dy = -3.72f)
          // L 9.51 14
          lineTo(x = 9.51f, y = 14.0f)
          // L 5.8 17.72
          lineTo(x = 5.8f, y = 17.72f)
          // a 6 6 0 0 0 -0.06 8.54
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.06f,
            dy1 = 8.54f,
          )
          // A 6 6 0 0 0 10 28
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 28.0f,
          )
          // a 6 6 0 0 0 4.32 -1.8
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.32f,
            dy1 = -1.8f,
          )
          // L 18 22.49z
          lineTo(x = 18.0f, y = 22.49f)
          close()
          // m -1.17 -10.14
          moveToRelative(dx = -1.17f, dy = -10.14f)
          // l 3.72 -3.72
          lineToRelative(dx = 3.72f, dy = -3.72f)
          // a 4 4 0 1 1 5.66 5.66
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.66f,
            dy1 = 5.66f,
          )
          // l -3.72 3.72
          lineToRelative(dx = -3.72f, dy = 3.72f)
          // L 22.49 18
          lineTo(x = 22.49f, y = 18.0f)
          // l 3.71 -3.72
          lineToRelative(dx = 3.71f, dy = -3.72f)
          // a 6 6 0 0 0 0.06 -8.54
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.06f,
            dy1 = -8.54f,
          )
          // A 6 6 0 0 0 22 4
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 4.0f,
          )
          // a 6 6 0 0 0 -4.32 1.8
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.32f,
            dy1 = 1.8f,
          )
          // L 14 9.51z
          lineTo(x = 14.0f, y = 9.51f)
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
      .also { _unlink = it }
  }

@Suppress("ObjectPropertyName")
private var _unlink: ImageVector? = null
