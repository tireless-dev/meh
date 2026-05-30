// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarbonUiBuilder: ImageVector
  get() {
    val current = _carbonUiBuilder
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarbonUiBuilder",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="24.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 28
          moveTo(x = 24.0f, y = 28.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <circle cx="21.0" cy="29.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 29
          moveTo(x = 21.0f, y = 29.0f)
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
        // <circle cx="29.0" cy="25.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 25
          moveTo(x = 29.0f, y = 25.0f)
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
        // <rect width="6" height="2" x="20.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // l -6 0
          lineToRelative(dx = -6.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 6 -0z
          lineToRelative(dx = 6.0f, dy = -0.0f)
          close()
        }
        // <rect width="6" height="2" x="24.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 20
          moveTo(x = 24.0f, y = 20.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <circle cx="21.0" cy="21.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 21
          moveTo(x = 21.0f, y = 21.0f)
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
        // M21.5 14.13 13 9.31 a1 1 0 0 0 -1 0 l-8.5 4.82 A1 1 0 0 0 3 15 v10 a1 1 0 0 0 .5 .87 l8.5 4.81 1 -1.74 -8 -4.52 v-8.84 l7.5 -4.25 7.5 4.25 V18 h2 v-3 a1 1 0 0 0 -.5 -.87
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.5 14.13
          moveTo(x = 21.5f, y = 14.13f)
          // L 13 9.31
          lineTo(x = 13.0f, y = 9.31f)
          // a 1 1 0 0 0 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // l -8.5 4.82
          lineToRelative(dx = -8.5f, dy = 4.82f)
          // A 1 1 0 0 0 3 15
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 15.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 1 1 0 0 0 0.5 0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = 0.87f,
          )
          // l 8.5 4.81
          lineToRelative(dx = 8.5f, dy = 4.81f)
          // l 1 -1.74
          lineToRelative(dx = 1.0f, dy = -1.74f)
          // l -8 -4.52
          lineToRelative(dx = -8.0f, dy = -4.52f)
          // v -8.84
          verticalLineToRelative(dy = -8.84f)
          // l 7.5 -4.25
          lineToRelative(dx = 7.5f, dy = -4.25f)
          // l 7.5 4.25
          lineToRelative(dx = 7.5f, dy = 4.25f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 1 1 0 0 0 -0.5 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.87f,
          )
        }
        // M25 15 h2 V7 a1 1 0 0 0 -.5 -.87 L18 1.31 a1 1 0 0 0 -1 0 L8.5 6.13 l1 1.74 8 -4.54 L25 7.58z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 15
          moveTo(x = 25.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -0.5 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.87f,
          )
          // L 18 1.31
          lineTo(x = 18.0f, y = 1.31f)
          // a 1 1 0 0 0 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // L 8.5 6.13
          lineTo(x = 8.5f, y = 6.13f)
          // l 1 1.74
          lineToRelative(dx = 1.0f, dy = 1.74f)
          // l 8 -4.54
          lineToRelative(dx = 8.0f, dy = -4.54f)
          // L 25 7.58z
          lineTo(x = 25.0f, y = 7.58f)
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
      .also { _carbonUiBuilder = it }
  }

@Suppress("ObjectPropertyName")
private var _carbonUiBuilder: ImageVector? = null
