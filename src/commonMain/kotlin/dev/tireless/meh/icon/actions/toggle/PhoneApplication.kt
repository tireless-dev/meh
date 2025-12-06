// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneApplication: ImageVector
  get() {
    val current = _phoneApplication
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneApplication",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="4" x="26.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="26.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 8
          moveTo(x = 26.0f, y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="20.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="20.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 8
          moveTo(x = 20.0f, y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M25 30 h-.17 C5.18 28.87 2.39 12.29 2 7.23 a3 3 0 0 1 2.76 -3.22 L5 4 h5.27 a2 2 0 0 1 1.86 1.26 L13.65 9 a2 2 0 0 1 -.44 2.16 l-2.13 2.15 a9.4 9.4 0 0 0 7.58 7.6 l2.17 -2.15 A2 2 0 0 1 23 18.35 l3.77 1.51 A2 2 0 0 1 28 21.72 V27 a3 3 0 0 1 -3 3 M5 6 a1 1 0 0 0 -1 1 v.08 C4.46 13 7.41 27 24.94 28 A1 1 0 0 0 26 27.06 v-5.34 l-3.77 -1.51 -2.87 2.85 L18.88 23 C10.18 21.91 9 13.21 9 13.12 l-.06 -.48 2.84 -2.87 L10.28 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 30
          moveTo(x = 25.0f, y = 30.0f)
          // h -0.17
          horizontalLineToRelative(dx = -0.17f)
          // C 5.18 28.87 2.39 12.29 2 7.23
          curveTo(
            x1 = 5.18f,
            y1 = 28.87f,
            x2 = 2.39f,
            y2 = 12.29f,
            x3 = 2.0f,
            y3 = 7.23f,
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
          // L 5 4
          lineTo(x = 5.0f, y = 4.0f)
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
          // L 13.65 9
          lineTo(x = 13.65f, y = 9.0f)
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
          // A 2 2 0 0 1 23 18.35
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 18.35f,
          )
          // l 3.77 1.51
          lineToRelative(dx = 3.77f, dy = 1.51f)
          // A 2 2 0 0 1 28 21.72
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 21.72f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
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
          // M 5 6
          moveTo(x = 5.0f, y = 6.0f)
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
          // C 4.46 13 7.41 27 24.94 28
          curveTo(
            x1 = 4.46f,
            y1 = 13.0f,
            x2 = 7.41f,
            y2 = 27.0f,
            x3 = 24.94f,
            y3 = 28.0f,
          )
          // A 1 1 0 0 0 26 27.06
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 27.06f,
          )
          // v -5.34
          verticalLineToRelative(dy = -5.34f)
          // l -3.77 -1.51
          lineToRelative(dx = -3.77f, dy = -1.51f)
          // l -2.87 2.85
          lineToRelative(dx = -2.87f, dy = 2.85f)
          // L 18.88 23
          lineTo(x = 18.88f, y = 23.0f)
          // C 10.18 21.91 9 13.21 9 13.12
          curveTo(
            x1 = 10.18f,
            y1 = 21.91f,
            x2 = 9.0f,
            y2 = 13.21f,
            x3 = 9.0f,
            y3 = 13.12f,
          )
          // l -0.06 -0.48
          lineToRelative(dx = -0.06f, dy = -0.48f)
          // l 2.84 -2.87
          lineToRelative(dx = 2.84f, dy = -2.87f)
          // L 10.28 6z
          lineTo(x = 10.28f, y = 6.0f)
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
      .also { _phoneApplication = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneApplication: ImageVector? = null
