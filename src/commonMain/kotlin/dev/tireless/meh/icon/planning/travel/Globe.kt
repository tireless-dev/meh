// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Globe: ImageVector
  get() {
    val current = _globe
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Globe",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 4 a7 7 0 1 1 -7 7 7 7 0 0 1 7 -7 m0 -2 a9 9 0 1 0 9 9 9 9 0 0 0 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 4
          moveTo(x = 14.0f, y = 4.0f)
          // a 7 7 0 1 1 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // a 7 7 0 0 1 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 9 9 0 1 0 9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 9.0f,
            dy1 = 9.0f,
          )
          // a 9 9 0 0 0 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
        }
        // M28 11 a14 14 0 0 0 -4.1 -9.9 l-1.42 1.42 a12 12 0 0 1 -16.92 17 l-.04 -.04 L4.1 20.9 A14 14 0 0 0 14 25 v3 h-4 v2 h10 v-2 h-4 v-3.16 A14 14 0 0 0 28 11
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 11
          moveTo(x = 28.0f, y = 11.0f)
          // a 14 14 0 0 0 -4.1 -9.9
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.1f,
            dy1 = -9.9f,
          )
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // a 12 12 0 0 1 -16.92 17
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -16.92f,
            dy1 = 17.0f,
          )
          // l -0.04 -0.04
          lineToRelative(dx = -0.04f, dy = -0.04f)
          // L 4.1 20.9
          lineTo(x = 4.1f, y = 20.9f)
          // A 14 14 0 0 0 14 25
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 25.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -3.16
          verticalLineToRelative(dy = -3.16f)
          // A 14 14 0 0 0 28 11
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 11.0f,
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
      .also { _globe = it }
  }

@Suppress("ObjectPropertyName")
private var _globe: ImageVector? = null
