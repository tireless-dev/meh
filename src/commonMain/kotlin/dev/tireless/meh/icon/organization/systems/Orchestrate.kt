// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Orchestrate: ImageVector
  get() {
    val current = _orchestrate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Orchestrate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 20 a3 3 0 0 0 -2.32 1.13 L9.24 16.07 l14.35 -4.3 A2.99 2.99 0 0 0 29 10 a3 3 0 0 0 -5.98 -.15 L8.84 14.1 14 7.81 A2.97 2.97 0 0 0 18 5 a3 3 0 0 0 -6 0 q.02 .87 .44 1.55 l-5.43 6.64 A2.97 2.97 0 0 0 3 16 a3 3 0 0 0 4 2.81 l5.44 6.64 A3 3 0 1 0 15 24 a3 3 0 0 0 -1.01 .19 l-4.96 -6.07 L23 23 A3 3 0 1 0 26 20 m0 -11 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M15 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m1 23 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 M5 16 a1 1 0 1 1 2 0 1 1 0 0 1 -2 0 m21 8 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 20
          moveTo(x = 26.0f, y = 20.0f)
          // a 3 3 0 0 0 -2.32 1.13
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.32f,
            dy1 = 1.13f,
          )
          // L 9.24 16.07
          lineTo(x = 9.24f, y = 16.07f)
          // l 14.35 -4.3
          lineToRelative(dx = 14.35f, dy = -4.3f)
          // A 2.99 2.99 0 0 0 29 10
          arcTo(
            horizontalEllipseRadius = 2.99f,
            verticalEllipseRadius = 2.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 10.0f,
          )
          // a 3 3 0 0 0 -5.98 -0.15
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.98f,
            dy1 = -0.15f,
          )
          // L 8.84 14.1
          lineTo(x = 8.84f, y = 14.1f)
          // L 14 7.81
          lineTo(x = 14.0f, y = 7.81f)
          // A 2.97 2.97 0 0 0 18 5
          arcTo(
            horizontalEllipseRadius = 2.97f,
            verticalEllipseRadius = 2.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 5.0f,
          )
          // a 3 3 0 0 0 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // q 0.02 0.87 0.44 1.55
          quadToRelative(
            dx1 = 0.02f,
            dy1 = 0.87f,
            dx2 = 0.44f,
            dy2 = 1.55f,
          )
          // l -5.43 6.64
          lineToRelative(dx = -5.43f, dy = 6.64f)
          // A 2.97 2.97 0 0 0 3 16
          arcTo(
            horizontalEllipseRadius = 2.97f,
            verticalEllipseRadius = 2.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 16.0f,
          )
          // a 3 3 0 0 0 4 2.81
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 2.81f,
          )
          // l 5.44 6.64
          lineToRelative(dx = 5.44f, dy = 6.64f)
          // A 3 3 0 1 0 15 24
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 24.0f,
          )
          // a 3 3 0 0 0 -1.01 0.19
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.01f,
            dy1 = 0.19f,
          )
          // l -4.96 -6.07
          lineToRelative(dx = -4.96f, dy = -6.07f)
          // L 23 23
          lineTo(x = 23.0f, y = 23.0f)
          // A 3 3 0 1 0 26 20
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 20.0f,
          )
          // m 0 -11
          moveToRelative(dx = 0.0f, dy = -11.0f)
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
          // M 15 4
          moveTo(x = 15.0f, y = 4.0f)
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
          // m 1 23
          moveToRelative(dx = 1.0f, dy = 23.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // M 5 16
          moveTo(x = 5.0f, y = 16.0f)
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
          // a 1 1 0 0 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // m 21 8
          moveToRelative(dx = 21.0f, dy = 8.0f)
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
      .also { _orchestrate = it }
  }

@Suppress("ObjectPropertyName")
private var _orchestrate: ImageVector? = null
