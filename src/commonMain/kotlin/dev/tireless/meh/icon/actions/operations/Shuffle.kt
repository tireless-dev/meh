// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shuffle: ImageVector
  get() {
    val current = _shuffle
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Shuffle",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.59 19.41 26.17 23 h-6.62 l-4.37 -7 4.37 -7 h6.62 l-3.58 3.59 L24 14 l6 -6 -6 -6 -1.41 1.41 L26.17 7 h-6.62 a2 2 0 0 0 -1.69 .94 L14 14.11 l-3.86 -6.17 A2 2 0 0 0 8.45 7 H2 v2 h6.45 l4.37 7 -4.37 7 H2 v2 h6.45 a2 2 0 0 0 1.69 -.94 L14 17.89 l3.86 6.17 A2 2 0 0 0 19.55 25 h6.62 l-3.58 3.59 L24 30 l6 -6 -6 -6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.59 19.41
          moveTo(x = 22.59f, y = 19.41f)
          // L 26.17 23
          lineTo(x = 26.17f, y = 23.0f)
          // h -6.62
          horizontalLineToRelative(dx = -6.62f)
          // l -4.37 -7
          lineToRelative(dx = -4.37f, dy = -7.0f)
          // l 4.37 -7
          lineToRelative(dx = 4.37f, dy = -7.0f)
          // h 6.62
          horizontalLineToRelative(dx = 6.62f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 24 14
          lineTo(x = 24.0f, y = 14.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 7
          lineTo(x = 26.17f, y = 7.0f)
          // h -6.62
          horizontalLineToRelative(dx = -6.62f)
          // a 2 2 0 0 0 -1.69 0.94
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.69f,
            dy1 = 0.94f,
          )
          // L 14 14.11
          lineTo(x = 14.0f, y = 14.11f)
          // l -3.86 -6.17
          lineToRelative(dx = -3.86f, dy = -6.17f)
          // A 2 2 0 0 0 8.45 7
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.45f,
            y1 = 7.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.45
          horizontalLineToRelative(dx = 6.45f)
          // l 4.37 7
          lineToRelative(dx = 4.37f, dy = 7.0f)
          // l -4.37 7
          lineToRelative(dx = -4.37f, dy = 7.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.45
          horizontalLineToRelative(dx = 6.45f)
          // a 2 2 0 0 0 1.69 -0.94
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.69f,
            dy1 = -0.94f,
          )
          // L 14 17.89
          lineTo(x = 14.0f, y = 17.89f)
          // l 3.86 6.17
          lineToRelative(dx = 3.86f, dy = 6.17f)
          // A 2 2 0 0 0 19.55 25
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.55f,
            y1 = 25.0f,
          )
          // h 6.62
          horizontalLineToRelative(dx = 6.62f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 24 30
          lineTo(x = 24.0f, y = 30.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6z
          lineToRelative(dx = -6.0f, dy = -6.0f)
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
      .also { _shuffle = it }
  }

@Suppress("ObjectPropertyName")
private var _shuffle: ImageVector? = null
