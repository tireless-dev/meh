// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Idea: ImageVector
  get() {
    val current = _idea
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Idea",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="10" height="2" x="11.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 24
          moveTo(x = 11.0f, y = 24.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="6" height="2" x="13.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // M16 2 A10 10 0 0 0 6 12 a9.2 9.2 0 0 0 3.46 7.62 c1 .93 1.54 1.46 1.54 2.38 h2 c0 -1.84 -1.11 -2.87 -2.19 -3.86 A7.2 7.2 0 0 1 8 12 a8 8 0 0 1 16 0 7.2 7.2 0 0 1 -2.82 6.14 c-1.07 1 -2.18 2 -2.18 3.86 h2 c0 -.92 .53 -1.45 1.54 -2.39 A9.2 9.2 0 0 0 26 12 10 10 0 0 0 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // A 10 10 0 0 0 6 12
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 12.0f,
          )
          // a 9.2 9.2 0 0 0 3.46 7.62
          arcToRelative(
            a = 9.2f,
            b = 9.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.46f,
            dy1 = 7.62f,
          )
          // c 1 0.93 1.54 1.46 1.54 2.38
          curveToRelative(
            dx1 = 1.0f,
            dy1 = 0.93f,
            dx2 = 1.54f,
            dy2 = 1.46f,
            dx3 = 1.54f,
            dy3 = 2.38f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -1.84 -1.11 -2.87 -2.19 -3.86
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.84f,
            dx2 = -1.11f,
            dy2 = -2.87f,
            dx3 = -2.19f,
            dy3 = -3.86f,
          )
          // A 7.2 7.2 0 0 1 8 12
          arcTo(
            horizontalEllipseRadius = 7.2f,
            verticalEllipseRadius = 7.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 12.0f,
          )
          // a 8 8 0 0 1 16 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 16.0f,
            dy1 = 0.0f,
          )
          // a 7.2 7.2 0 0 1 -2.82 6.14
          arcToRelative(
            a = 7.2f,
            b = 7.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = 6.14f,
          )
          // c -1.07 1 -2.18 2 -2.18 3.86
          curveToRelative(
            dx1 = -1.07f,
            dy1 = 1.0f,
            dx2 = -2.18f,
            dy2 = 2.0f,
            dx3 = -2.18f,
            dy3 = 3.86f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -0.92 0.53 -1.45 1.54 -2.39
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.92f,
            dx2 = 0.53f,
            dy2 = -1.45f,
            dx3 = 1.54f,
            dy3 = -2.39f,
          )
          // A 9.2 9.2 0 0 0 26 12
          arcTo(
            horizontalEllipseRadius = 9.2f,
            verticalEllipseRadius = 9.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 12.0f,
          )
          // A 10 10 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
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
      .also { _idea = it }
  }

@Suppress("ObjectPropertyName")
private var _idea: ImageVector? = null
