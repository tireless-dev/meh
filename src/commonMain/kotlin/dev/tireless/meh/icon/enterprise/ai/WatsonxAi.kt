// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatsonxAi: ImageVector
  get() {
    val current = _watsonxAi
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WatsonxAi",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 24 a2 2 0 0 0 -2 2 l.02 .22 A13 13 0 0 1 16 29 c-4.26 0 -8 -3.97 -8 -8.5 0 -4.69 3.81 -8.5 8.5 -8.5 H17 v-2 h-.5 C10.71 10 6 14.71 6 20.5 a10.5 10.5 0 0 0 1.44 5.26 A12.96 12.96 0 0 1 4.46 10 L2.7 9.08 A15.02 15.02 0 0 0 25.2 27.83 2 2 0 0 0 28 26 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 24
          moveTo(x = 26.0f, y = 24.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // l 0.02 0.22
          lineToRelative(dx = 0.02f, dy = 0.22f)
          // A 13 13 0 0 1 16 29
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 29.0f,
          )
          // c -4.26 0 -8 -3.97 -8 -8.5
          curveToRelative(
            dx1 = -4.26f,
            dy1 = 0.0f,
            dx2 = -8.0f,
            dy2 = -3.97f,
            dx3 = -8.0f,
            dy3 = -8.5f,
          )
          // c 0 -4.69 3.81 -8.5 8.5 -8.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.69f,
            dx2 = 3.81f,
            dy2 = -8.5f,
            dx3 = 8.5f,
            dy3 = -8.5f,
          )
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -0.5
          horizontalLineToRelative(dx = -0.5f)
          // C 10.71 10 6 14.71 6 20.5
          curveTo(
            x1 = 10.71f,
            y1 = 10.0f,
            x2 = 6.0f,
            y2 = 14.71f,
            x3 = 6.0f,
            y3 = 20.5f,
          )
          // a 10.5 10.5 0 0 0 1.44 5.26
          arcToRelative(
            a = 10.5f,
            b = 10.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.44f,
            dy1 = 5.26f,
          )
          // A 12.96 12.96 0 0 1 4.46 10
          arcTo(
            horizontalEllipseRadius = 12.96f,
            verticalEllipseRadius = 12.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.46f,
            y1 = 10.0f,
          )
          // L 2.7 9.08
          lineTo(x = 2.7f, y = 9.08f)
          // A 15.02 15.02 0 0 0 25.2 27.83
          arcTo(
            horizontalEllipseRadius = 15.02f,
            verticalEllipseRadius = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.2f,
            y1 = 27.83f,
          )
          // A 2 2 0 0 0 28 26
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.0f,
          )
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // <rect width="2" height="2" x="11.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 20
          moveTo(x = 13.0f, y = 20.0f)
          // l -8.742278E-8 2
          lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
          // l -2 -8.742278E-8
          lineToRelative(dx = -2.0f, dy = -8.742278E-8f)
          // l 8.742278E-8 -2z
          lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="19.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 10
          moveTo(x = 21.0f, y = 10.0f)
          // l -8.742278E-8 2
          lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
          // l -2 -8.742278E-8
          lineToRelative(dx = -2.0f, dy = -8.742278E-8f)
          // l 8.742278E-8 -2z
          lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
          close()
        }
        // M16 1 a15 15 0 0 0 -9.2 3.17 A2 2 0 0 0 4 6 a2 2 0 1 0 4 0 L7.98 5.78 A13 13 0 0 1 16 3 c4.26 0 8 3.97 8 8.5 0 4.69 -3.81 8.5 -8.5 8.5 H15 v2 h.5 C21.29 22 26 17.29 26 11.5 c0 -1.89 -.53 -3.7 -1.44 -5.26 A12.96 12.96 0 0 1 27.54 22 l1.77 .92 A15.02 15.02 0 0 0 16 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 1
          moveTo(x = 16.0f, y = 1.0f)
          // a 15 15 0 0 0 -9.2 3.17
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.2f,
            dy1 = 3.17f,
          )
          // A 2 2 0 0 0 4 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 6.0f,
          )
          // a 2 2 0 1 0 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // L 7.98 5.78
          lineTo(x = 7.98f, y = 5.78f)
          // A 13 13 0 0 1 16 3
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 3.0f,
          )
          // c 4.26 0 8 3.97 8 8.5
          curveToRelative(
            dx1 = 4.26f,
            dy1 = 0.0f,
            dx2 = 8.0f,
            dy2 = 3.97f,
            dx3 = 8.0f,
            dy3 = 8.5f,
          )
          // c 0 4.69 -3.81 8.5 -8.5 8.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.69f,
            dx2 = -3.81f,
            dy2 = 8.5f,
            dx3 = -8.5f,
            dy3 = 8.5f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // C 21.29 22 26 17.29 26 11.5
          curveTo(
            x1 = 21.29f,
            y1 = 22.0f,
            x2 = 26.0f,
            y2 = 17.29f,
            x3 = 26.0f,
            y3 = 11.5f,
          )
          // c 0 -1.89 -0.53 -3.7 -1.44 -5.26
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.89f,
            dx2 = -0.53f,
            dy2 = -3.7f,
            dx3 = -1.44f,
            dy3 = -5.26f,
          )
          // A 12.96 12.96 0 0 1 27.54 22
          arcTo(
            horizontalEllipseRadius = 12.96f,
            verticalEllipseRadius = 12.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.54f,
            y1 = 22.0f,
          )
          // l 1.77 0.92
          lineToRelative(dx = 1.77f, dy = 0.92f)
          // A 15.02 15.02 0 0 0 16 1
          arcTo(
            horizontalEllipseRadius = 15.02f,
            verticalEllipseRadius = 15.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
          x1 = 16.0f,
          y1 = 1.0f,
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
      .also { _watsonxAi = it }
  }

@Suppress("ObjectPropertyName")
private var _watsonxAi: ImageVector? = null
