// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HexagonVerticalSolid: ImageVector
  get() {
    val current = _hexagonVerticalSolid
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HexagonVerticalSolid",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16.55 30.85 11.92 -6.96 A1.1 1.1 0 0 0 29 22.96 V9.04 c0 -.38 -.2 -.73 -.53 -.93 L16.55 1.15 a1.1 1.1 0 0 0 -1.1 0 L3.53 8.1 A1.1 1.1 0 0 0 3 9.04 v13.92 c0 .38 .2 .73 .53 .93 l11.92 6.96 a1.1 1.1 0 0 0 1.1 0
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.55 30.85
          moveTo(x = 16.55f, y = 30.85f)
          // l 11.92 -6.96
          lineToRelative(dx = 11.92f, dy = -6.96f)
          // A 1.1 1.1 0 0 0 29 22.96
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.0f,
            y1 = 22.96f,
          )
          // V 9.04
          verticalLineTo(y = 9.04f)
          // c 0 -0.38 -0.2 -0.73 -0.53 -0.93
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.38f,
            dx2 = -0.2f,
            dy2 = -0.73f,
            dx3 = -0.53f,
            dy3 = -0.93f,
          )
          // L 16.55 1.15
          lineTo(x = 16.55f, y = 1.15f)
          // a 1.1 1.1 0 0 0 -1.1 0
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.1f,
            dy1 = 0.0f,
          )
          // L 3.53 8.1
          lineTo(x = 3.53f, y = 8.1f)
          // A 1.1 1.1 0 0 0 3 9.04
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 9.04f,
          )
          // v 13.92
          verticalLineToRelative(dy = 13.92f)
          // c 0 0.38 0.2 0.73 0.53 0.93
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.38f,
            dx2 = 0.2f,
            dy2 = 0.73f,
            dx3 = 0.53f,
            dy3 = 0.93f,
          )
          // l 11.92 6.96
          lineToRelative(dx = 11.92f, dy = 6.96f)
          // a 1.1 1.1 0 0 0 1.1 0
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.1f,
            dy1 = 0.0f,
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
      .also { _hexagonVerticalSolid = it }
  }

@Suppress("ObjectPropertyName")
private var _hexagonVerticalSolid: ImageVector? = null
