// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tools: ImageVector
  get() {
    val current = _tools
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tools",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12.1 2 a10 10 0 0 0 -5.4 1.6 l6.4 6.4 a2.1 2.1 0 0 1 .2 3 2.1 2.1 0 0 1 -3 -.2 L3.7 6.4 A10 10 0 0 0 2 12.1 a10.14 10.14 0 0 0 10.1 10.1 11 11 0 0 0 2.6 -.3 l6.7 6.7 a5 5 0 0 0 7.1 -7.1 l-6.7 -6.7 a11 11 0 0 0 .3 -2.6 A10 10 0 0 0 12.1 2 m8 10.1 a8 8 0 0 1 -.3 2.1 l-.3 1.1 .8 .8 6.7 6.7 a2.9 2.9 0 0 1 .9 2.1 A2.7 2.7 0 0 1 27 27 a2.9 2.9 0 0 1 -4.2 0 l-6.7 -6.7 -.8 -.8 -1.1 .3 a8 8 0 0 1 -2.1 .3 8.3 8.3 0 0 1 -5.7 -2.3 A7.6 7.6 0 0 1 4 12.1 a8 8 0 0 1 .3 -2.2 l4.4 4.4 a4.14 4.14 0 0 0 5.9 .2 4.14 4.14 0 0 0 -.2 -5.9 L10 4.2 a7 7 0 0 1 2 -.3 8.3 8.3 0 0 1 5.7 2.3 8.5 8.5 0 0 1 2.4 5.9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.1 2
          moveTo(x = 12.1f, y = 2.0f)
          // a 10 10 0 0 0 -5.4 1.6
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.4f,
            dy1 = 1.6f,
          )
          // l 6.4 6.4
          lineToRelative(dx = 6.4f, dy = 6.4f)
          // a 2.1 2.1 0 0 1 0.2 3
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.2f,
            dy1 = 3.0f,
          )
          // a 2.1 2.1 0 0 1 -3 -0.2
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -0.2f,
          )
          // L 3.7 6.4
          lineTo(x = 3.7f, y = 6.4f)
          // A 10 10 0 0 0 2 12.1
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 12.1f,
          )
          // a 10.14 10.14 0 0 0 10.1 10.1
          arcToRelative(
            a = 10.14f,
            b = 10.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.1f,
            dy1 = 10.1f,
          )
          // a 11 11 0 0 0 2.6 -0.3
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.6f,
            dy1 = -0.3f,
          )
          // l 6.7 6.7
          lineToRelative(dx = 6.7f, dy = 6.7f)
          // a 5 5 0 0 0 7.1 -7.1
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.1f,
            dy1 = -7.1f,
          )
          // l -6.7 -6.7
          lineToRelative(dx = -6.7f, dy = -6.7f)
          // a 11 11 0 0 0 0.3 -2.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = -2.6f,
          )
          // A 10 10 0 0 0 12.1 2
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.1f,
            y1 = 2.0f,
          )
          // m 8 10.1
          moveToRelative(dx = 8.0f, dy = 10.1f)
          // a 8 8 0 0 1 -0.3 2.1
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.3f,
            dy1 = 2.1f,
          )
          // l -0.3 1.1
          lineToRelative(dx = -0.3f, dy = 1.1f)
          // l 0.8 0.8
          lineToRelative(dx = 0.8f, dy = 0.8f)
          // l 6.7 6.7
          lineToRelative(dx = 6.7f, dy = 6.7f)
          // a 2.9 2.9 0 0 1 0.9 2.1
          arcToRelative(
            a = 2.9f,
            b = 2.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 2.1f,
          )
          // A 2.7 2.7 0 0 1 27 27
          arcTo(
            horizontalEllipseRadius = 2.7f,
            verticalEllipseRadius = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 27.0f,
          )
          // a 2.9 2.9 0 0 1 -4.2 0
          arcToRelative(
            a = 2.9f,
            b = 2.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.2f,
            dy1 = 0.0f,
          )
          // l -6.7 -6.7
          lineToRelative(dx = -6.7f, dy = -6.7f)
          // l -0.8 -0.8
          lineToRelative(dx = -0.8f, dy = -0.8f)
          // l -1.1 0.3
          lineToRelative(dx = -1.1f, dy = 0.3f)
          // a 8 8 0 0 1 -2.1 0.3
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.1f,
            dy1 = 0.3f,
          )
          // a 8.3 8.3 0 0 1 -5.7 -2.3
          arcToRelative(
            a = 8.3f,
            b = 8.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.7f,
            dy1 = -2.3f,
          )
          // A 7.6 7.6 0 0 1 4 12.1
          arcTo(
            horizontalEllipseRadius = 7.6f,
            verticalEllipseRadius = 7.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 12.1f,
          )
          // a 8 8 0 0 1 0.3 -2.2
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.3f,
            dy1 = -2.2f,
          )
          // l 4.4 4.4
          lineToRelative(dx = 4.4f, dy = 4.4f)
          // a 4.14 4.14 0 0 0 5.9 0.2
          arcToRelative(
            a = 4.14f,
            b = 4.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.9f,
            dy1 = 0.2f,
          )
          // a 4.14 4.14 0 0 0 -0.2 -5.9
          arcToRelative(
            a = 4.14f,
            b = 4.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -5.9f,
          )
          // L 10 4.2
          lineTo(x = 10.0f, y = 4.2f)
          // a 7 7 0 0 1 2 -0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -0.3f,
          )
          // a 8.3 8.3 0 0 1 5.7 2.3
          arcToRelative(
            a = 8.3f,
            b = 8.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.7f,
            dy1 = 2.3f,
          )
          // a 8.5 8.5 0 0 1 2.4 5.9
          arcToRelative(
            a = 8.5f,
            b = 8.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
          dx1 = 2.4f,
          dy1 = 5.9f,
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
      .also { _tools = it }
  }

@Suppress("ObjectPropertyName")
private var _tools: ImageVector? = null
