// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radar: ImageVector
  get() {
    val current = _radar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Radar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 3.41 28.59 2 l-13.3 13.3 a1 1 0 0 0 1.42 1.4 l4.18 -4.17 A6 6 0 1 1 16 10 V8 a8.01 8.01 0 1 0 6.32 3.1 l2.84 -2.85 A12 12 0 0 1 28 16 12 12 0 1 1 16 4 V2 a14 14 0 1 0 14 14 14 14 0 0 0 -3.42 -9.16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // l -13.3 13.3
          lineToRelative(dx = -13.3f, dy = 13.3f)
          // a 1 1 0 0 0 1.42 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 1.4f,
          )
          // l 4.18 -4.17
          lineToRelative(dx = 4.18f, dy = -4.17f)
          // A 6 6 0 1 1 16 10
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 10.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 8.01 8.01 0 1 0 6.32 3.1
          arcToRelative(
            a = 8.01f,
            b = 8.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.32f,
            dy1 = 3.1f,
          )
          // l 2.84 -2.85
          lineToRelative(dx = 2.84f, dy = -2.85f)
          // A 12 12 0 0 1 28 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // A 12 12 0 1 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // a 14 14 0 0 0 -3.42 -9.16z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.42f,
            dy1 = -9.16f,
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
      .also { _radar = it }
  }

@Suppress("ObjectPropertyName")
private var _radar: ImageVector? = null
