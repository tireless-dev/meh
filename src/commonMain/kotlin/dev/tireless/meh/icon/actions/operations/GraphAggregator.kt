// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GraphAggregator: ImageVector
  get() {
    val current = _graphAggregator
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GraphAggregator",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="12" x="3.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3 18
          moveTo(x = 3.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="6" x="9.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 24
          moveTo(x = 9.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="14" x="15.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 16
          moveTo(x = 15.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="21.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 20
          moveTo(x = 21.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="16" x="27.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 14
          moveTo(x = 27.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M28 2 a2 2 0 0 0 -1.93 2.51 l-3.56 3.56 A2 2 0 0 0 22 8 a2 2 0 0 0 -.88 .21 L18 6.12 18 6 a2 2 0 1 0 -3.84 .79 l-3.93 5.23 L10 12 a2 2 0 0 0 -.51 .07 L5.93 8.51 a2 2 0 1 0 -1.41 1.41 l3.55 3.57 a2 2 0 1 0 3.76 -.27 l3.94 -5.24 L16 8 a2 2 0 0 0 .88 -.21 L20 9.88 20 10 a2 2 0 1 0 3.93 -.51 l3.56 -3.56 A2 2 0 1 0 28 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // a 2 2 0 0 0 -1.93 2.51
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.93f,
            dy1 = 2.51f,
          )
          // l -3.56 3.56
          lineToRelative(dx = -3.56f, dy = 3.56f)
          // A 2 2 0 0 0 22 8
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 8.0f,
          )
          // a 2 2 0 0 0 -0.88 0.21
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.88f,
            dy1 = 0.21f,
          )
          // L 18 6.12
          lineTo(x = 18.0f, y = 6.12f)
          // L 18 6
          lineTo(x = 18.0f, y = 6.0f)
          // a 2 2 0 1 0 -3.84 0.79
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.84f,
            dy1 = 0.79f,
          )
          // l -3.93 5.23
          lineToRelative(dx = -3.93f, dy = 5.23f)
          // L 10 12
          lineTo(x = 10.0f, y = 12.0f)
          // a 2 2 0 0 0 -0.51 0.07
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = 0.07f,
          )
          // L 5.93 8.51
          lineTo(x = 5.93f, y = 8.51f)
          // a 2 2 0 1 0 -1.41 1.41
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 1.41f,
          )
          // l 3.55 3.57
          lineToRelative(dx = 3.55f, dy = 3.57f)
          // a 2 2 0 1 0 3.76 -0.27
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.76f,
            dy1 = -0.27f,
          )
          // l 3.94 -5.24
          lineToRelative(dx = 3.94f, dy = -5.24f)
          // L 16 8
          lineTo(x = 16.0f, y = 8.0f)
          // a 2 2 0 0 0 0.88 -0.21
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.88f,
            dy1 = -0.21f,
          )
          // L 20 9.88
          lineTo(x = 20.0f, y = 9.88f)
          // L 20 10
          lineTo(x = 20.0f, y = 10.0f)
          // a 2 2 0 1 0 3.93 -0.51
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.93f,
            dy1 = -0.51f,
          )
          // l 3.56 -3.56
          lineToRelative(dx = 3.56f, dy = -3.56f)
          // A 2 2 0 1 0 28 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 2.0f,
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
      .also { _graphAggregator = it }
  }

@Suppress("ObjectPropertyName")
private var _graphAggregator: ImageVector? = null
