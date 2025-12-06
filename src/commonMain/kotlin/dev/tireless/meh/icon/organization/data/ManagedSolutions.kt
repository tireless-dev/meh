// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ManagedSolutions: ImageVector
  get() {
    val current = _managedSolutions
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ManagedSolutions",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 23.0 25.0 23.0 25.0 18.0 23.0 18.0 23.0 23.0 18.0 23.0 18.0 25.0 23.0 25.0 23.0 30.0 25.0 30.0 25.0 25.0 30.0 25.0 30.0 23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23
          moveTo(x = 30.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 25 18
          lineTo(x = 25.0f, y = 18.0f)
          // L 23 18
          lineTo(x = 23.0f, y = 18.0f)
          // L 23 23
          lineTo(x = 23.0f, y = 23.0f)
          // L 18 23
          lineTo(x = 18.0f, y = 23.0f)
          // L 18 25
          lineTo(x = 18.0f, y = 25.0f)
          // L 23 25
          lineTo(x = 23.0f, y = 25.0f)
          // L 23 30
          lineTo(x = 23.0f, y = 30.0f)
          // L 25 30
          lineTo(x = 25.0f, y = 30.0f)
          // L 25 25
          lineTo(x = 25.0f, y = 25.0f)
          // L 30 25
          lineTo(x = 30.0f, y = 25.0f)
          // L 30 23z
          lineTo(x = 30.0f, y = 23.0f)
          close()
        }
        // m24.13 11.84 1.18 .21 a6 6 0 0 1 2.62 1.15 5.4 5.4 0 0 1 2.02 4.8 h2.03 a7.5 7.5 0 0 0 -6.15 -7.88 10 10 0 0 0 -7.94 -7.94 10 10 0 0 0 -11.72 7.94 7.5 7.5 0 0 0 -6.11 8.29 A7.7 7.7 0 0 0 7.77 25 H14 v-2 H7.7 a5.6 5.6 0 0 1 -5.6 -4.49 5.5 5.5 0 0 1 4.43 -6.43 l1.35 -.24 .21 -1.11 a8.2 8.2 0 0 1 6.74 -6.64 8 8 0 0 1 3.02 .13 8.1 8.1 0 0 1 6.05 6.44Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.13 11.84
          moveTo(x = 24.13f, y = 11.84f)
          // l 1.18 0.21
          lineToRelative(dx = 1.18f, dy = 0.21f)
          // a 6 6 0 0 1 2.62 1.15
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.62f,
            dy1 = 1.15f,
          )
          // a 5.4 5.4 0 0 1 2.02 4.8
          arcToRelative(
            a = 5.4f,
            b = 5.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.02f,
            dy1 = 4.8f,
          )
          // h 2.03
          horizontalLineToRelative(dx = 2.03f)
          // a 7.5 7.5 0 0 0 -6.15 -7.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.15f,
            dy1 = -7.88f,
          )
          // a 10 10 0 0 0 -7.94 -7.94
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.94f,
            dy1 = -7.94f,
          )
          // a 10 10 0 0 0 -11.72 7.94
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.72f,
            dy1 = 7.94f,
          )
          // a 7.5 7.5 0 0 0 -6.11 8.29
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.11f,
            dy1 = 8.29f,
          )
          // A 7.7 7.7 0 0 0 7.77 25
          arcTo(
            horizontalEllipseRadius = 7.7f,
            verticalEllipseRadius = 7.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.77f,
            y1 = 25.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.7
          horizontalLineTo(x = 7.7f)
          // a 5.6 5.6 0 0 1 -5.6 -4.49
          arcToRelative(
            a = 5.6f,
            b = 5.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.6f,
            dy1 = -4.49f,
          )
          // a 5.5 5.5 0 0 1 4.43 -6.43
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.43f,
            dy1 = -6.43f,
          )
          // l 1.35 -0.24
          lineToRelative(dx = 1.35f, dy = -0.24f)
          // l 0.21 -1.11
          lineToRelative(dx = 0.21f, dy = -1.11f)
          // a 8.2 8.2 0 0 1 6.74 -6.64
          arcToRelative(
            a = 8.2f,
            b = 8.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.74f,
            dy1 = -6.64f,
          )
          // a 8 8 0 0 1 3.02 0.13
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.02f,
            dy1 = 0.13f,
          )
          // a 8.1 8.1 0 0 1 6.05 6.44z
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.05f,
            dy1 = 6.44f,
          )
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
      .also { _managedSolutions = it }
  }

@Suppress("ObjectPropertyName")
private var _managedSolutions: ImageVector? = null
