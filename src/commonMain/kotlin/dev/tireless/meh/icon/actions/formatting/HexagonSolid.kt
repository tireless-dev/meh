// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HexagonSolid: ImageVector
  get() {
    val current = _hexagonSolid
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HexagonSolid",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30.85 15.45 23.9 3.53 A1.1 1.1 0 0 0 22.96 3 H9.04 A1.1 1.1 0 0 0 8.1 3.53 L1.15 15.45 a1.1 1.1 0 0 0 0 1.1 L8.1 28.47 A1.1 1.1 0 0 0 9.04 29 h13.92 c.38 0 .73 -.2 .93 -.53 l6.96 -11.92 a1.1 1.1 0 0 0 0 -1.1
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.85 15.45
          moveTo(x = 30.85f, y = 15.45f)
          // L 23.9 3.53
          lineTo(x = 23.9f, y = 3.53f)
          // A 1.1 1.1 0 0 0 22.96 3
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.96f,
            y1 = 3.0f,
          )
          // H 9.04
          horizontalLineTo(x = 9.04f)
          // A 1.1 1.1 0 0 0 8.1 3.53
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.1f,
            y1 = 3.53f,
          )
          // L 1.15 15.45
          lineTo(x = 1.15f, y = 15.45f)
          // a 1.1 1.1 0 0 0 0 1.1
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.1f,
          )
          // L 8.1 28.47
          lineTo(x = 8.1f, y = 28.47f)
          // A 1.1 1.1 0 0 0 9.04 29
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.04f,
            y1 = 29.0f,
          )
          // h 13.92
          horizontalLineToRelative(dx = 13.92f)
          // c 0.38 0 0.73 -0.2 0.93 -0.53
          curveToRelative(
            dx1 = 0.38f,
            dy1 = 0.0f,
            dx2 = 0.73f,
            dy2 = -0.2f,
            dx3 = 0.93f,
            dy3 = -0.53f,
          )
          // l 6.96 -11.92
          lineToRelative(dx = 6.96f, dy = -11.92f)
          // a 1.1 1.1 0 0 0 0 -1.1
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.1f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _hexagonSolid = it }
  }

@Suppress("ObjectPropertyName")
private var _hexagonSolid: ImageVector? = null
