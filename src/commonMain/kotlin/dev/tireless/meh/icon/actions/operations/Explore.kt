// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Explore: ImageVector
  get() {
    val current = _explore
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Explore",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.7 9.3 a1 1 0 0 0 -1.02 -.25 l-9 3 a1 1 0 0 0 -.63 .63 l-3 9 a1 1 0 0 0 1.27 1.27 l9 -3 a1 1 0 0 0 .63 -.63 l3 -9 a1 1 0 0 0 -.24 -1.03 M11.59 20.41 l2.21 -6.63 4.42 4.42Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.7 9.3
          moveTo(x = 22.7f, y = 9.3f)
          // a 1 1 0 0 0 -1.02 -0.25
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.02f,
            dy1 = -0.25f,
          )
          // l -9 3
          lineToRelative(dx = -9.0f, dy = 3.0f)
          // a 1 1 0 0 0 -0.63 0.63
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.63f,
            dy1 = 0.63f,
          )
          // l -3 9
          lineToRelative(dx = -3.0f, dy = 9.0f)
          // a 1 1 0 0 0 1.27 1.27
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.27f,
            dy1 = 1.27f,
          )
          // l 9 -3
          lineToRelative(dx = 9.0f, dy = -3.0f)
          // a 1 1 0 0 0 0.63 -0.63
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.63f,
            dy1 = -0.63f,
          )
          // l 3 -9
          lineToRelative(dx = 3.0f, dy = -9.0f)
          // a 1 1 0 0 0 -0.24 -1.03
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.24f,
            dy1 = -1.03f,
          )
          // M 11.59 20.41
          moveTo(x = 11.59f, y = 20.41f)
          // l 2.21 -6.63
          lineToRelative(dx = 2.21f, dy = -6.63f)
          // l 4.42 4.42z
          lineToRelative(dx = 4.42f, dy = 4.42f)
          close()
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _explore = it }
  }

@Suppress("ObjectPropertyName")
private var _explore: ImageVector? = null
