// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cursor2: ImageVector
  get() {
    val current = _cursor2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Cursor2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m27.34 12.06 -22 -8 a1 1 0 0 0 -1.28 1.28 l8 22 A1 1 0 0 0 13 28 a1 1 0 0 0 .93 -.63 l3.84 -9.6 9.6 -3.84 a1 1 0 0 0 0 -1.87Z m-10.71 4 -.4 .16 -.16 .4 L13 24.2 6.67 6.67 24.2 13Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.34 12.06
          moveTo(x = 27.34f, y = 12.06f)
          // l -22 -8
          lineToRelative(dx = -22.0f, dy = -8.0f)
          // a 1 1 0 0 0 -1.28 1.28
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = 1.28f,
          )
          // l 8 22
          lineToRelative(dx = 8.0f, dy = 22.0f)
          // A 1 1 0 0 0 13 28
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 28.0f,
          )
          // a 1 1 0 0 0 0.93 -0.63
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.93f,
            dy1 = -0.63f,
          )
          // l 3.84 -9.6
          lineToRelative(dx = 3.84f, dy = -9.6f)
          // l 9.6 -3.84
          lineToRelative(dx = 9.6f, dy = -3.84f)
          // a 1 1 0 0 0 0 -1.87z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.87f,
          )
          close()
          // m -10.71 4
          moveToRelative(dx = -10.71f, dy = 4.0f)
          // l -0.4 0.16
          lineToRelative(dx = -0.4f, dy = 0.16f)
          // l -0.16 0.4
          lineToRelative(dx = -0.16f, dy = 0.4f)
          // L 13 24.2
          lineTo(x = 13.0f, y = 24.2f)
          // L 6.67 6.67
          lineTo(x = 6.67f, y = 6.67f)
          // L 24.2 13z
          lineTo(x = 24.2f, y = 13.0f)
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
      .also { _cursor2 = it }
  }

@Suppress("ObjectPropertyName")
private var _cursor2: ImageVector? = null
