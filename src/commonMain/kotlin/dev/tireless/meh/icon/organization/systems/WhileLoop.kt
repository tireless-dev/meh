// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WhileLoop: ImageVector
  get() {
    val current = _whileLoop
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WhileLoop",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 23 h7 v7 h-2 v-3.35 A9 9 0 0 1 21 30 H11 c-5 0 -9 -4 -9 -9 v-8 h2 v8 c0 3.9 3.1 7 7 7 h10 c2.4 0 4.5 -1.18 5.75 -3 H23z M9 7 H5.25 A7 7 0 0 1 11 4 h10 c3.9 0 7 3.1 7 7 v8 h2 v-8 c0 -5 -4 -9 -9 -9 H11 a9 9 0 0 0 -7 3.35 V2 H2 v7 h7z m4.96 15 1.53 -6.35 .77 -3.16 h.04 l.74 3.16 L18.57 22 h2.56 L24 10 h-2.17 l-1.22 5.76 -.75 3.68 H19.8 l-.84 -3.68 L17.6 10 h-2.52 l-1.37 5.76 -.86 3.68 h-.05 l-.74 -3.68 L10.86 10 H8.6 l2.79 12z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 23
          moveTo(x = 23.0f, y = 23.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3.35
          verticalLineToRelative(dy = -3.35f)
          // A 9 9 0 0 1 21 30
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 30.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -5 0 -9 -4 -9 -9
          curveToRelative(
            dx1 = -5.0f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // c 0 3.9 3.1 7 7 7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = 3.1f,
            dy2 = 7.0f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 2.4 0 4.5 -1.18 5.75 -3
          curveToRelative(
            dx1 = 2.4f,
            dy1 = 0.0f,
            dx2 = 4.5f,
            dy2 = -1.18f,
            dx3 = 5.75f,
            dy3 = -3.0f,
          )
          // H 23z
          horizontalLineTo(x = 23.0f)
          close()
          // M 9 7
          moveTo(x = 9.0f, y = 7.0f)
          // H 5.25
          horizontalLineTo(x = 5.25f)
          // A 7 7 0 0 1 11 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 4.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 3.9 0 7 3.1 7 7
          curveToRelative(
            dx1 = 3.9f,
            dy1 = 0.0f,
            dx2 = 7.0f,
            dy2 = 3.1f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // c 0 -5 -4 -9 -9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.0f,
            dx2 = -4.0f,
            dy2 = -9.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 9 9 0 0 0 -7 3.35
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 3.35f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
          close()
          // m 4.96 15
          moveToRelative(dx = 4.96f, dy = 15.0f)
          // l 1.53 -6.35
          lineToRelative(dx = 1.53f, dy = -6.35f)
          // l 0.77 -3.16
          lineToRelative(dx = 0.77f, dy = -3.16f)
          // h 0.04
          horizontalLineToRelative(dx = 0.04f)
          // l 0.74 3.16
          lineToRelative(dx = 0.74f, dy = 3.16f)
          // L 18.57 22
          lineTo(x = 18.57f, y = 22.0f)
          // h 2.56
          horizontalLineToRelative(dx = 2.56f)
          // L 24 10
          lineTo(x = 24.0f, y = 10.0f)
          // h -2.17
          horizontalLineToRelative(dx = -2.17f)
          // l -1.22 5.76
          lineToRelative(dx = -1.22f, dy = 5.76f)
          // l -0.75 3.68
          lineToRelative(dx = -0.75f, dy = 3.68f)
          // H 19.8
          horizontalLineTo(x = 19.8f)
          // l -0.84 -3.68
          lineToRelative(dx = -0.84f, dy = -3.68f)
          // L 17.6 10
          lineTo(x = 17.6f, y = 10.0f)
          // h -2.52
          horizontalLineToRelative(dx = -2.52f)
          // l -1.37 5.76
          lineToRelative(dx = -1.37f, dy = 5.76f)
          // l -0.86 3.68
          lineToRelative(dx = -0.86f, dy = 3.68f)
          // h -0.05
          horizontalLineToRelative(dx = -0.05f)
          // l -0.74 -3.68
          lineToRelative(dx = -0.74f, dy = -3.68f)
          // L 10.86 10
          lineTo(x = 10.86f, y = 10.0f)
          // H 8.6
          horizontalLineTo(x = 8.6f)
          // l 2.79 12z
          lineToRelative(dx = 2.79f, dy = 12.0f)
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
      .also { _whileLoop = it }
  }

@Suppress("ObjectPropertyName")
private var _whileLoop: ImageVector? = null
