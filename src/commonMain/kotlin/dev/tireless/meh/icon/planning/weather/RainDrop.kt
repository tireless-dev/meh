// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RainDrop: ImageVector
  get() {
    val current = _rainDrop
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RainDrop",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 24 v-2 a3.3 3.3 0 0 0 3 -3 h2 a5.27 5.27 0 0 1 -5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3.3 3.3 0 0 0 3 -3
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 5.27 5.27 0 0 1 -5 5
          arcToRelative(
            a = 5.27f,
            b = 5.27f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
        }
        // M16 28 a9 9 0 0 1 -9 -9 10 10 0 0 1 1.5 -4.96 l6.65 -10.6 a1.04 1.04 0 0 1 1.7 0 l6.63 10.55 A10 10 0 0 1 25 19 a9 9 0 0 1 -9 9 m0 -22.15 -5.78 9.2 A8 8 0 0 0 9 19 a7 7 0 0 0 14 0 8 8 0 0 0 -1.25 -4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 9 9 0 0 1 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
          // a 10 10 0 0 1 1.5 -4.96
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -4.96f,
          )
          // l 6.65 -10.6
          lineToRelative(dx = 6.65f, dy = -10.6f)
          // a 1.04 1.04 0 0 1 1.7 0
          arcToRelative(
            a = 1.04f,
            b = 1.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.7f,
            dy1 = 0.0f,
          )
          // l 6.63 10.55
          lineToRelative(dx = 6.63f, dy = 10.55f)
          // A 10 10 0 0 1 25 19
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 19.0f,
          )
          // a 9 9 0 0 1 -9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.0f,
            dy1 = 9.0f,
          )
          // m 0 -22.15
          moveToRelative(dx = 0.0f, dy = -22.15f)
          // l -5.78 9.2
          lineToRelative(dx = -5.78f, dy = 9.2f)
          // A 8 8 0 0 0 9 19
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 19.0f,
          )
          // a 7 7 0 0 0 14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          // a 8 8 0 0 0 -1.25 -4z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.25f,
            dy1 = -4.0f,
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
      .also { _rainDrop = it }
  }

@Suppress("ObjectPropertyName")
private var _rainDrop: ImageVector? = null
