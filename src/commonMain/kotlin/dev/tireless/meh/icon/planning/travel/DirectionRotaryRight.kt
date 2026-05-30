// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryRight: ImageVector
  get() {
    val current = _directionRotaryRight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRotaryRight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m22 4 -1.41 1.41 L25.17 10 h-8.26 A6 6 0 1 0 10 16.91 V28 h2 V16.91 A6 6 0 0 0 16.91 12 h8.26 l-4.58 4.59 L22 18 l7 -7Z M11 15 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 25.17 10
          lineTo(x = 25.17f, y = 10.0f)
          // h -8.26
          horizontalLineToRelative(dx = -8.26f)
          // A 6 6 0 1 0 10 16.91
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 16.91f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 16.91
          verticalLineTo(y = 16.91f)
          // A 6 6 0 0 0 16.91 12
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.91f,
            y1 = 12.0f,
          )
          // h 8.26
          horizontalLineToRelative(dx = 8.26f)
          // l -4.58 4.59
          lineToRelative(dx = -4.58f, dy = 4.59f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
          // M 11 15
          moveTo(x = 11.0f, y = 15.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
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
      .also { _directionRotaryRight = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRotaryRight: ImageVector? = null
