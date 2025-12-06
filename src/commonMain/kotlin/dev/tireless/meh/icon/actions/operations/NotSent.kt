// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotSent: ImageVector
  get() {
    val current = _notSent
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotSent",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 28.59 3.41 2 2 3.41 l8 8 -7.34 2.65 a1 1 0 0 0 0 1.87 l9.6 3.84 3.84 9.6 A1 1 0 0 0 17 30 a1 1 0 0 0 .92 -.66 L20.6 22 l8 8Z M5.8 15 l5.74 -2 3.05 3 -1.83 1.83Z M17 26.2 l-2.79 -7 L16 17.41 l3 3.05Z m-1.31 -14.75 7.64 -2.78 -2.78 7.64 1.56 1.56 3.83 -10.53 a1 1 0 0 0 -1.28 -1.28 L14.13 9.89Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28.59
          moveTo(x = 30.0f, y = 28.59f)
          // L 3.41 2
          lineTo(x = 3.41f, y = 2.0f)
          // L 2 3.41
          lineTo(x = 2.0f, y = 3.41f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // l -7.34 2.65
          lineToRelative(dx = -7.34f, dy = 2.65f)
          // a 1 1 0 0 0 0 1.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.87f,
          )
          // l 9.6 3.84
          lineToRelative(dx = 9.6f, dy = 3.84f)
          // l 3.84 9.6
          lineToRelative(dx = 3.84f, dy = 9.6f)
          // A 1 1 0 0 0 17 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 30.0f,
          )
          // a 1 1 0 0 0 0.92 -0.66
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -0.66f,
          )
          // L 20.6 22
          lineTo(x = 20.6f, y = 22.0f)
          // l 8 8z
          lineToRelative(dx = 8.0f, dy = 8.0f)
          close()
          // M 5.8 15
          moveTo(x = 5.8f, y = 15.0f)
          // l 5.74 -2
          lineToRelative(dx = 5.74f, dy = -2.0f)
          // l 3.05 3
          lineToRelative(dx = 3.05f, dy = 3.0f)
          // l -1.83 1.83z
          lineToRelative(dx = -1.83f, dy = 1.83f)
          close()
          // M 17 26.2
          moveTo(x = 17.0f, y = 26.2f)
          // l -2.79 -7
          lineToRelative(dx = -2.79f, dy = -7.0f)
          // L 16 17.41
          lineTo(x = 16.0f, y = 17.41f)
          // l 3 3.05z
          lineToRelative(dx = 3.0f, dy = 3.05f)
          close()
          // m -1.31 -14.75
          moveToRelative(dx = -1.31f, dy = -14.75f)
          // l 7.64 -2.78
          lineToRelative(dx = 7.64f, dy = -2.78f)
          // l -2.78 7.64
          lineToRelative(dx = -2.78f, dy = 7.64f)
          // l 1.56 1.56
          lineToRelative(dx = 1.56f, dy = 1.56f)
          // l 3.83 -10.53
          lineToRelative(dx = 3.83f, dy = -10.53f)
          // a 1 1 0 0 0 -1.28 -1.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = -1.28f,
          )
          // L 14.13 9.89z
          lineTo(x = 14.13f, y = 9.89f)
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
      .also { _notSent = it }
  }

@Suppress("ObjectPropertyName")
private var _notSent: ImageVector? = null
