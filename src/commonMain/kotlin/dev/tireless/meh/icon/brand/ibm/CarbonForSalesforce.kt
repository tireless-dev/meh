// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarbonForSalesforce: ImageVector
  get() {
    val current = _carbonForSalesforce
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarbonForSalesforce",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.51 17.69 -6 -3.55 Q23.27 14 23 14 c-.27 0 -.35 .05 -.51 .14 l-6 3.55 A1 1 0 0 0 16 18.55 v6.9 a1 1 0 0 0 .49 .86 l6 3.55 Q22.73 30 23 30 c.27 0 .35 -.05 .51 -.14 l6 -3.55 A1 1 0 0 0 30 25.45 v-6.9 a1 1 0 0 0 -.49 -.86 M28 24.88 l-5 2.96 -5 -2.96 v-5.76 l5 -2.96 5 2.96z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.51 17.69
          moveTo(x = 29.51f, y = 17.69f)
          // l -6 -3.55
          lineToRelative(dx = -6.0f, dy = -3.55f)
          // Q 23.27 14 23 14
          quadTo(
            x1 = 23.27f,
            y1 = 14.0f,
            x2 = 23.0f,
            y2 = 14.0f,
          )
          // c -0.27 0 -0.35 0.05 -0.51 0.14
          curveToRelative(
            dx1 = -0.27f,
            dy1 = 0.0f,
            dx2 = -0.35f,
            dy2 = 0.05f,
            dx3 = -0.51f,
            dy3 = 0.14f,
          )
          // l -6 3.55
          lineToRelative(dx = -6.0f, dy = 3.55f)
          // A 1 1 0 0 0 16 18.55
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 18.55f,
          )
          // v 6.9
          verticalLineToRelative(dy = 6.9f)
          // a 1 1 0 0 0 0.49 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.49f,
            dy1 = 0.86f,
          )
          // l 6 3.55
          lineToRelative(dx = 6.0f, dy = 3.55f)
          // Q 22.73 30 23 30
          quadTo(
            x1 = 22.73f,
            y1 = 30.0f,
            x2 = 23.0f,
            y2 = 30.0f,
          )
          // c 0.27 0 0.35 -0.05 0.51 -0.14
          curveToRelative(
            dx1 = 0.27f,
            dy1 = 0.0f,
            dx2 = 0.35f,
            dy2 = -0.05f,
            dx3 = 0.51f,
            dy3 = -0.14f,
          )
          // l 6 -3.55
          lineToRelative(dx = 6.0f, dy = -3.55f)
          // A 1 1 0 0 0 30 25.45
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 25.45f,
          )
          // v -6.9
          verticalLineToRelative(dy = -6.9f)
          // a 1 1 0 0 0 -0.49 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.49f,
            dy1 = -0.86f,
          )
          // M 28 24.88
          moveTo(x = 28.0f, y = 24.88f)
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
        // M23.4 4.47 a7 7 0 0 0 -1.88 .27 A5.6 5.6 0 0 0 13.9 3.6 6 6 0 0 0 9.81 2 H9.8 a6.02 6.02 0 0 0 -5.82 7.66 5.4 5.4 0 0 0 -1.97 4.18 5.37 5.37 0 0 0 5.34 5.39 h.28 a5.7 5.7 0 0 0 4.99 2.98 A6 6 0 0 0 14 22.04 v-2.11 a3.68 3.68 0 0 1 -4.82 -2.12 L8.88 17 l-.84 .17 a3.38 3.38 0 0 1 -4.03 -3.33 c0 -1.2 .64 -2.33 1.68 -2.94 l.77 -.45 L6.1 9.63 a3.96 3.96 0 0 1 .83 -4.44 A4 4 0 0 1 9.8 4 a4.1 4.1 0 0 1 3.22 1.59 l.6 .79 1.2 -.96 a3.55 3.55 0 0 1 5.44 1.02 l.45 .8 .83 -.38 a4.63 4.63 0 0 1 5.48 7.09 l1.75 1.01 a6.63 6.63 0 0 0 -5.38 -10.49z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.4 4.47
          moveTo(x = 23.4f, y = 4.47f)
          // a 7 7 0 0 0 -1.88 0.27
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.88f,
            dy1 = 0.27f,
          )
          // A 5.6 5.6 0 0 0 13.9 3.6
          arcTo(
            horizontalEllipseRadius = 5.6f,
            verticalEllipseRadius = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.9f,
            y1 = 3.6f,
          )
          // A 6 6 0 0 0 9.81 2
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.81f,
            y1 = 2.0f,
          )
          // H 9.8
          horizontalLineTo(x = 9.8f)
          // a 6.02 6.02 0 0 0 -5.82 7.66
          arcToRelative(
            a = 6.02f,
            b = 6.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.82f,
            dy1 = 7.66f,
          )
          // a 5.4 5.4 0 0 0 -1.97 4.18
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.97f,
            dy1 = 4.18f,
          )
          // a 5.37 5.37 0 0 0 5.34 5.39
          arcToRelative(
            a = 5.37f,
            b = 5.37f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.34f,
            dy1 = 5.39f,
          )
          // h 0.28
          horizontalLineToRelative(dx = 0.28f)
          // a 5.7 5.7 0 0 0 4.99 2.98
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.99f,
            dy1 = 2.98f,
          )
          // A 6 6 0 0 0 14 22.04
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 22.04f,
          )
          // v -2.11
          verticalLineToRelative(dy = -2.11f)
          // a 3.68 3.68 0 0 1 -4.82 -2.12
          arcToRelative(
            a = 3.68f,
            b = 3.68f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.82f,
            dy1 = -2.12f,
          )
          // L 8.88 17
          lineTo(x = 8.88f, y = 17.0f)
          // l -0.84 0.17
          lineToRelative(dx = -0.84f, dy = 0.17f)
          // a 3.38 3.38 0 0 1 -4.03 -3.33
          arcToRelative(
            a = 3.38f,
            b = 3.38f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.03f,
            dy1 = -3.33f,
          )
          // c 0 -1.2 0.64 -2.33 1.68 -2.94
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.2f,
            dx2 = 0.64f,
            dy2 = -2.33f,
            dx3 = 1.68f,
            dy3 = -2.94f,
          )
          // l 0.77 -0.45
          lineToRelative(dx = 0.77f, dy = -0.45f)
          // L 6.1 9.63
          lineTo(x = 6.1f, y = 9.63f)
          // a 3.96 3.96 0 0 1 0.83 -4.44
          arcToRelative(
            a = 3.96f,
            b = 3.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.83f,
            dy1 = -4.44f,
          )
          // A 4 4 0 0 1 9.8 4
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.8f,
            y1 = 4.0f,
          )
          // a 4.1 4.1 0 0 1 3.22 1.59
          arcToRelative(
            a = 4.1f,
            b = 4.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.22f,
            dy1 = 1.59f,
          )
          // l 0.6 0.79
          lineToRelative(dx = 0.6f, dy = 0.79f)
          // l 1.2 -0.96
          lineToRelative(dx = 1.2f, dy = -0.96f)
          // a 3.55 3.55 0 0 1 5.44 1.02
          arcToRelative(
            a = 3.55f,
            b = 3.55f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.44f,
            dy1 = 1.02f,
          )
          // l 0.45 0.8
          lineToRelative(dx = 0.45f, dy = 0.8f)
          // l 0.83 -0.38
          lineToRelative(dx = 0.83f, dy = -0.38f)
          // a 4.63 4.63 0 0 1 5.48 7.09
          arcToRelative(
            a = 4.63f,
            b = 4.63f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.48f,
            dy1 = 7.09f,
          )
          // l 1.75 1.01
          lineToRelative(dx = 1.75f, dy = 1.01f)
          // a 6.63 6.63 0 0 0 -5.38 -10.49z
          arcToRelative(
            a = 6.63f,
            b = 6.63f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          dx1 = -5.38f,
          dy1 = -10.49f,
        )
        close()
      }
      // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
      path(
        fill = SolidColor(Color.Transparent),
        strokeLineWidth = 0.0f,
      ) {
        // M 32 32
        moveTo(x = 32.0f, y = 32.0f)
        // l -32 0
        lineToRelative(dx = -32.0f, dy = 0.0f)
        // l 0 -32
        lineToRelative(dx = 0.0f, dy = -32.0f)
        // l 32 -0z
        lineToRelative(dx = 32.0f, dy = -0.0f)
        close()
      }
    }.build()
      .also { _carbonForSalesforce = it }
  }

@Suppress("ObjectPropertyName")
private var _carbonForSalesforce: ImageVector? = null
