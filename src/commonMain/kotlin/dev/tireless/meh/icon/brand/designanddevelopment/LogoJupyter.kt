// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoJupyter: ImageVector
  get() {
    val current = _logoJupyter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoJupyter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.08 3.59 A1.69 1.69 0 1 1 24.32 2 a1.67 1.67 0 0 1 1.76 1.59
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.08 3.59
          moveTo(x = 26.08f, y = 3.59f)
          // A 1.69 1.69 0 1 1 24.32 2
          arcTo(
            horizontalEllipseRadius = 1.69f,
            verticalEllipseRadius = 1.69f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 24.32f,
            y1 = 2.0f,
          )
          // a 1.67 1.67 0 0 1 1.76 1.59
          arcToRelative(
            a = 1.67f,
            b = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.76f,
            dy1 = 1.59f,
          )
        }
        // M16.22 23.11 c-4.49 0 -8.43 -1.6 -10.47 -3.99 a11.16 11.16 0 0 0 20.94 0 c-2.04 2.38 -5.96 4 -10.47 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.22 23.11
          moveTo(x = 16.22f, y = 23.11f)
          // c -4.49 0 -8.43 -1.6 -10.47 -3.99
          curveToRelative(
            dx1 = -4.49f,
            dy1 = 0.0f,
            dx2 = -8.43f,
            dy2 = -1.6f,
            dx3 = -10.47f,
            dy3 = -3.99f,
          )
          // a 11.16 11.16 0 0 0 20.94 0
          arcToRelative(
            a = 11.16f,
            b = 11.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 20.94f,
            dy1 = 0.0f,
          )
          // c -2.04 2.38 -5.96 4 -10.47 4
          curveToRelative(
            dx1 = -2.04f,
            dy1 = 2.38f,
            dx2 = -5.96f,
            dy2 = 4.0f,
            dx3 = -10.47f,
            dy3 = 4.0f,
          )
        }
        // M16.22 7.65 c4.49 0 8.43 1.6 10.47 3.99 a11.16 11.16 0 0 0 -20.94 0 c2.04 -2.39 5.96 -4 10.47 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.22 7.65
          moveTo(x = 16.22f, y = 7.65f)
          // c 4.49 0 8.43 1.6 10.47 3.99
          curveToRelative(
            dx1 = 4.49f,
            dy1 = 0.0f,
            dx2 = 8.43f,
            dy2 = 1.6f,
            dx3 = 10.47f,
            dy3 = 3.99f,
          )
          // a 11.16 11.16 0 0 0 -20.94 0
          arcToRelative(
            a = 11.16f,
            b = 11.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -20.94f,
            dy1 = 0.0f,
          )
          // c 2.04 -2.39 5.96 -4 10.47 -4
          curveToRelative(
            dx1 = 2.04f,
            dy1 = -2.39f,
            dx2 = 5.96f,
            dy2 = -4.0f,
            dx3 = 10.47f,
            dy3 = -4.0f,
          )
        }
        // M10.04 27.74 a2.1 2.1 0 1 1 -.2 -.8 2 2 0 0 1 .2 .8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.04 27.74
          moveTo(x = 10.04f, y = 27.74f)
          // a 2.1 2.1 0 1 1 -0.2 -0.8
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -0.2f,
            dy1 = -0.8f,
          )
          // a 2 2 0 0 1 0.2 0.8
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.2f,
            dy1 = 0.8f,
          )
        }
        // M6.26 7.1 a1.23 1.23 0 1 1 1.2 -1.27 1.24 1.24 0 0 1 -1.2 1.28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.26 7.1
          moveTo(x = 6.26f, y = 7.1f)
          // a 1.23 1.23 0 1 1 1.2 -1.27
          arcToRelative(
            a = 1.23f,
            b = 1.23f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.2f,
            dy1 = -1.27f,
          )
          // a 1.24 1.24 0 0 1 -1.2 1.28
          arcToRelative(
            a = 1.24f,
            b = 1.24f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.2f,
            dy1 = 1.28f,
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
      .also { _logoJupyter = it }
  }

@Suppress("ObjectPropertyName")
private var _logoJupyter: ImageVector? = null
