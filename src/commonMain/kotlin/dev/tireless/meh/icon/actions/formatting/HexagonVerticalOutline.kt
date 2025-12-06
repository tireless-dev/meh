// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HexagonVerticalOutline: ImageVector
  get() {
    val current = _hexagonVerticalOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HexagonVerticalOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M3 23 V9 a1 1 0 0 1 .5 -.86 l12 -7 a1 1 0 0 1 1 0 l12 7 A1 1 0 0 1 29 9 v14 a1 1 0 0 1 -.5 .86 l-12 7 a1 1 0 0 1 -1 0 l-12 -7 A1 1 0 0 1 3 23 M5 9.57 v12.86 l11 6.41 11 -6.41 V9.57 L16 3.16z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3 23
          moveTo(x = 3.0f, y = 23.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // a 1 1 0 0 1 0.5 -0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = -0.86f,
          )
          // l 12 -7
          lineToRelative(dx = 12.0f, dy = -7.0f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 12 7
          lineToRelative(dx = 12.0f, dy = 7.0f)
          // A 1 1 0 0 1 29 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 9.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 1 1 0 0 1 -0.5 0.86
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.86f,
          )
          // l -12 7
          lineToRelative(dx = -12.0f, dy = 7.0f)
          // a 1 1 0 0 1 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // l -12 -7
          lineToRelative(dx = -12.0f, dy = -7.0f)
          // A 1 1 0 0 1 3 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 23.0f,
          )
          // M 5 9.57
          moveTo(x = 5.0f, y = 9.57f)
          // v 12.86
          verticalLineToRelative(dy = 12.86f)
          // l 11 6.41
          lineToRelative(dx = 11.0f, dy = 6.41f)
          // l 11 -6.41
          lineToRelative(dx = 11.0f, dy = -6.41f)
          // V 9.57
          verticalLineTo(y = 9.57f)
          // L 16 3.16z
          lineTo(x = 16.0f, y = 3.16f)
          close()
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
      .also { _hexagonVerticalOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _hexagonVerticalOutline: ImageVector? = null
