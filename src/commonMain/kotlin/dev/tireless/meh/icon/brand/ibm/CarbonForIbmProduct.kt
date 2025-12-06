// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarbonForIbmProduct: ImageVector
  get() {
    val current = _carbonForIbmProduct
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarbonForIbmProduct",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m22.5 12.69 -6 -3.55 a1 1 0 0 0 -1 0 l-6 3.55 A1 1 0 0 0 9 13.55 v6.9 a1 1 0 0 0 .5 .86 l6 3.55 a1 1 0 0 0 1 0 l6 -3.55 a1 1 0 0 0 .5 -.86 v-6.9 a1 1 0 0 0 -.5 -.86 M21 19.88 l-5 2.96 -5 -2.96 v-5.76 l5 -2.96 5 2.96z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 12.69
          moveTo(x = 22.5f, y = 12.69f)
          // l -6 -3.55
          lineToRelative(dx = -6.0f, dy = -3.55f)
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
          // l -6 3.55
          lineToRelative(dx = -6.0f, dy = 3.55f)
          // A 1 1 0 0 0 9 13.55
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 13.55f,
          )
          // v 6.9
          verticalLineToRelative(dy = 6.9f)
          // a 1 1 0 0 0 0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = 0.86f,
          )
          // l 6 3.55
          lineToRelative(dx = 6.0f, dy = 3.55f)
          // a 1 1 0 0 0 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 6 -3.55
          lineToRelative(dx = 6.0f, dy = -3.55f)
          // a 1 1 0 0 0 0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.5f,
            dy1 = -0.86f,
          )
          // v -6.9
          verticalLineToRelative(dy = -6.9f)
          // a 1 1 0 0 0 -0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.86f,
          )
          // M 21 19.88
          moveTo(x = 21.0f, y = 19.88f)
          // l -5 2.96
          lineToRelative(dx = -5.0f, dy = 2.96f)
          // l -5 -2.96
          lineToRelative(dx = -5.0f, dy = -2.96f)
          // v -5.76
          verticalLineToRelative(dy = -5.76f)
          // l 5 -2.96
          lineToRelative(dx = 5.0f, dy = -2.96f)
          // l 5 2.96z
          lineToRelative(dx = 5.0f, dy = 2.96f)
          close()
        }
        // M6 20.18 v-9.11 l6.2 -3.66 -1.02 -1.73 L4.5 9.64 A1 1 0 0 0 4 10.5 v9.68 a3 3 0 1 0 2 0 M5 24 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m22 -4 a3 3 0 0 0 -2.82 4 L16 28.84 l-6.4 -3.79 -1.02 1.73 6.91 4.08 a1 1 0 0 0 1.02 0 l8.96 -5.3 A2.97 2.97 0 0 0 30 23 a3 3 0 0 0 -3 -3 m0 4 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 M16 7 c.73 0 1.4 -.27 1.91 -.7 L26 11.06 V18 h2 v-7.5 a1 1 0 0 0 -.5 -.86 l-8.56 -5.06 A3 3 0 1 0 16 7 m0 -4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 20.18
          moveTo(x = 6.0f, y = 20.18f)
          // v -9.11
          verticalLineToRelative(dy = -9.11f)
          // l 6.2 -3.66
          lineToRelative(dx = 6.2f, dy = -3.66f)
          // l -1.02 -1.73
          lineToRelative(dx = -1.02f, dy = -1.73f)
          // L 4.5 9.64
          lineTo(x = 4.5f, y = 9.64f)
          // A 1 1 0 0 0 4 10.5
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 10.5f,
          )
          // v 9.68
          verticalLineToRelative(dy = 9.68f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // M 5 24
          moveTo(x = 5.0f, y = 24.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 22 -4
          moveToRelative(dx = 22.0f, dy = -4.0f)
          // a 3 3 0 0 0 -2.82 4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 4.0f,
          )
          // L 16 28.84
          lineTo(x = 16.0f, y = 28.84f)
          // l -6.4 -3.79
          lineToRelative(dx = -6.4f, dy = -3.79f)
          // l -1.02 1.73
          lineToRelative(dx = -1.02f, dy = 1.73f)
          // l 6.91 4.08
          lineToRelative(dx = 6.91f, dy = 4.08f)
          // a 1 1 0 0 0 1.02 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.02f,
            dy1 = 0.0f,
          )
          // l 8.96 -5.3
          lineToRelative(dx = 8.96f, dy = -5.3f)
          // A 2.97 2.97 0 0 0 30 23
          arcTo(
            horizontalEllipseRadius = 2.97f,
            verticalEllipseRadius = 2.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 23.0f,
          )
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // c 0.73 0 1.4 -0.27 1.91 -0.7
          curveToRelative(
            dx1 = 0.73f,
            dy1 = 0.0f,
            dx2 = 1.4f,
            dy2 = -0.27f,
            dx3 = 1.91f,
            dy3 = -0.7f,
          )
          // L 26 11.06
          lineTo(x = 26.0f, y = 11.06f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -7.5
          verticalLineToRelative(dy = -7.5f)
          // a 1 1 0 0 0 -0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.5f,
            dy1 = -0.86f,
          )
          // l -8.56 -5.06
          lineToRelative(dx = -8.56f, dy = -5.06f)
          // A 3 3 0 1 0 16 7
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 7.0f,
          )
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = 0.0f,
          dy1 = -2.0f,
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
      .also { _carbonForIbmProduct = it }
  }

@Suppress("ObjectPropertyName")
private var _carbonForIbmProduct: ImageVector? = null
