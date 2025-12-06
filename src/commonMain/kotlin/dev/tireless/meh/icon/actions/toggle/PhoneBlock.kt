// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneBlock: ImageVector
  get() {
    val current = _phoneBlock
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneBlock",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 29 h-.17 C6.18 27.87 3.39 11.29 3 6.23 a3 3 0 0 1 2.76 -3.22 L6 3 h5.27 a2 2 0 0 1 1.86 1.26 L14.65 8 a2 2 0 0 1 -.44 2.16 l-2.13 2.15 a9.4 9.4 0 0 0 7.58 7.6 l2.17 -2.15 A2 2 0 0 1 24 17.35 l3.77 1.51 A2 2 0 0 1 29 20.72 V26 a3 3 0 0 1 -3 3 M6 5 a1 1 0 0 0 -1 1 v.08 C5.46 12 8.41 26 25.94 27 A1 1 0 0 0 27 26.06 v-5.34 l-3.77 -1.51 -2.87 2.85 L19.88 22 c-8.7 -1.09 -9.88 -9.79 -9.88 -9.88 l-.06 -.48 2.84 -2.87 L11.28 5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 29
          moveTo(x = 26.0f, y = 29.0f)
          // h -0.17
          horizontalLineToRelative(dx = -0.17f)
          // C 6.18 27.87 3.39 11.29 3 6.23
          curveTo(
            x1 = 6.18f,
            y1 = 27.87f,
            x2 = 3.39f,
            y2 = 11.29f,
            x3 = 3.0f,
            y3 = 6.23f,
          )
          // a 3 3 0 0 1 2.76 -3.22
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.76f,
            dy1 = -3.22f,
          )
          // L 6 3
          lineTo(x = 6.0f, y = 3.0f)
          // h 5.27
          horizontalLineToRelative(dx = 5.27f)
          // a 2 2 0 0 1 1.86 1.26
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.86f,
            dy1 = 1.26f,
          )
          // L 14.65 8
          lineTo(x = 14.65f, y = 8.0f)
          // a 2 2 0 0 1 -0.44 2.16
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.44f,
            dy1 = 2.16f,
          )
          // l -2.13 2.15
          lineToRelative(dx = -2.13f, dy = 2.15f)
          // a 9.4 9.4 0 0 0 7.58 7.6
          arcToRelative(
            a = 9.4f,
            b = 9.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.58f,
            dy1 = 7.6f,
          )
          // l 2.17 -2.15
          lineToRelative(dx = 2.17f, dy = -2.15f)
          // A 2 2 0 0 1 24 17.35
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 17.35f,
          )
          // l 3.77 1.51
          lineToRelative(dx = 3.77f, dy = 1.51f)
          // A 2 2 0 0 1 29 20.72
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 20.72f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // M 6 5
          moveTo(x = 6.0f, y = 5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 0.08
          verticalLineToRelative(dy = 0.08f)
          // C 5.46 12 8.41 26 25.94 27
          curveTo(
            x1 = 5.46f,
            y1 = 12.0f,
            x2 = 8.41f,
            y2 = 26.0f,
            x3 = 25.94f,
            y3 = 27.0f,
          )
          // A 1 1 0 0 0 27 26.06
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 26.06f,
          )
          // v -5.34
          verticalLineToRelative(dy = -5.34f)
          // l -3.77 -1.51
          lineToRelative(dx = -3.77f, dy = -1.51f)
          // l -2.87 2.85
          lineToRelative(dx = -2.87f, dy = 2.85f)
          // L 19.88 22
          lineTo(x = 19.88f, y = 22.0f)
          // c -8.7 -1.09 -9.88 -9.79 -9.88 -9.88
          curveToRelative(
            dx1 = -8.7f,
            dy1 = -1.09f,
            dx2 = -9.88f,
            dy2 = -9.79f,
            dx3 = -9.88f,
            dy3 = -9.88f,
          )
          // l -0.06 -0.48
          lineToRelative(dx = -0.06f, dy = -0.48f)
          // l 2.84 -2.87
          lineToRelative(dx = 2.84f, dy = -2.87f)
          // L 11.28 5z
          lineTo(x = 11.28f, y = 5.0f)
          close()
        }
        // <polygon points="24.41 9.0 28.0 5.41 26.59 4.0 23.0 7.59 19.41 4.0 18.0 5.41 21.59 9.0 18.0 12.59 19.41 14.0 23.0 10.41 26.59 14.0 28.0 12.59 24.41 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.41 9
          moveTo(x = 24.41f, y = 9.0f)
          // L 28 5.41
          lineTo(x = 28.0f, y = 5.41f)
          // L 26.59 4
          lineTo(x = 26.59f, y = 4.0f)
          // L 23 7.59
          lineTo(x = 23.0f, y = 7.59f)
          // L 19.41 4
          lineTo(x = 19.41f, y = 4.0f)
          // L 18 5.41
          lineTo(x = 18.0f, y = 5.41f)
          // L 21.59 9
          lineTo(x = 21.59f, y = 9.0f)
          // L 18 12.59
          lineTo(x = 18.0f, y = 12.59f)
          // L 19.41 14
          lineTo(x = 19.41f, y = 14.0f)
          // L 23 10.41
          lineTo(x = 23.0f, y = 10.41f)
          // L 26.59 14
          lineTo(x = 26.59f, y = 14.0f)
          // L 28 12.59
          lineTo(x = 28.0f, y = 12.59f)
          // L 24.41 9z
          lineTo(x = 24.41f, y = 9.0f)
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
      .also { _phoneBlock = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneBlock: ImageVector? = null
