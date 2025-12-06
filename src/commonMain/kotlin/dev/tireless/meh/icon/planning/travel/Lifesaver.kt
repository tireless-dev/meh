// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lifesaver: ImageVector
  get() {
    val current = _lifesaver
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Lifesaver",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.23 22.81 a14 14 0 0 0 0 -13.62 L28.4 9 a2 2 0 0 0 0 -2.83 L25.83 3.6 a2 2 0 0 0 -2.83 0 l-.19 .18 a14 14 0 0 0 -13.62 0 L9 3.6 a2 2 0 0 0 -2.83 0 L3.6 6.17 a2 2 0 0 0 0 2.83 l.18 .19 a14 14 0 0 0 0 13.62 L3.6 23 a2 2 0 0 0 0 2.83 l2.58 2.58 a2 2 0 0 0 2.83 0 l.19 -.18 a14 14 0 0 0 13.62 0 L23 28.4 a2 2 0 0 0 2.83 0 l2.58 -2.58 a2 2 0 0 0 0 -2.83Z M28 16 a12 12 0 0 1 -1.25 5.33 l-3.9 -3.9 a7 7 0 0 0 0 -2.87 l3.9 -3.9 A12 12 0 0 1 28 16 m-1 -8.41 -4.93 4.93 a7 7 0 0 0 -2.59 -2.59 L24.41 5Z M16 21 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5 m5.32 -15.73 -3.88 3.88 a7 7 0 0 0 -2.88 0 l-3.88 -3.88 a12.3 12.3 0 0 1 10.64 0 M7.59 5 l4.93 4.93 a7 7 0 0 0 -2.59 2.59 L5 7.6Z M4 16 a12 12 0 0 1 1.25 -5.33 l3.9 3.9 a7 7 0 0 0 0 2.87 l-3.9 3.9 A12 12 0 0 1 4 16 m3.59 11 L5 24.41 l4.93 -4.93 a7 7 0 0 0 2.59 2.59Z m3.1 -.27 3.87 -3.88 a7 7 0 0 0 2.88 0 l3.88 3.88 a12.3 12.3 0 0 1 -10.64 0 M24.4 27 l-4.93 -4.93 a7 7 0 0 0 2.59 -2.59 L27 24.41Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.23 22.81
          moveTo(x = 28.23f, y = 22.81f)
          // a 14 14 0 0 0 0 -13.62
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -13.62f,
          )
          // L 28.4 9
          lineTo(x = 28.4f, y = 9.0f)
          // a 2 2 0 0 0 0 -2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.83f,
          )
          // L 25.83 3.6
          lineTo(x = 25.83f, y = 3.6f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -0.19 0.18
          lineToRelative(dx = -0.19f, dy = 0.18f)
          // a 14 14 0 0 0 -13.62 0
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -13.62f,
            dy1 = 0.0f,
          )
          // L 9 3.6
          lineTo(x = 9.0f, y = 3.6f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // L 3.6 6.17
          lineTo(x = 3.6f, y = 6.17f)
          // a 2 2 0 0 0 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.83f,
          )
          // l 0.18 0.19
          lineToRelative(dx = 0.18f, dy = 0.19f)
          // a 14 14 0 0 0 0 13.62
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 13.62f,
          )
          // L 3.6 23
          lineTo(x = 3.6f, y = 23.0f)
          // a 2 2 0 0 0 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.83f,
          )
          // l 2.58 2.58
          lineToRelative(dx = 2.58f, dy = 2.58f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 0.19 -0.18
          lineToRelative(dx = 0.19f, dy = -0.18f)
          // a 14 14 0 0 0 13.62 0
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 13.62f,
            dy1 = 0.0f,
          )
          // L 23 28.4
          lineTo(x = 23.0f, y = 28.4f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 2.58 -2.58
          lineToRelative(dx = 2.58f, dy = -2.58f)
          // a 2 2 0 0 0 0 -2.83z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.83f,
          )
          close()
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // a 12 12 0 0 1 -1.25 5.33
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.25f,
            dy1 = 5.33f,
          )
          // l -3.9 -3.9
          lineToRelative(dx = -3.9f, dy = -3.9f)
          // a 7 7 0 0 0 0 -2.87
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.87f,
          )
          // l 3.9 -3.9
          lineToRelative(dx = 3.9f, dy = -3.9f)
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
          // m -1 -8.41
          moveToRelative(dx = -1.0f, dy = -8.41f)
          // l -4.93 4.93
          lineToRelative(dx = -4.93f, dy = 4.93f)
          // a 7 7 0 0 0 -2.59 -2.59
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.59f,
            dy1 = -2.59f,
          )
          // L 24.41 5z
          lineTo(x = 24.41f, y = 5.0f)
          close()
          // M 16 21
          moveTo(x = 16.0f, y = 21.0f)
          // a 5 5 0 1 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // m 5.32 -15.73
          moveToRelative(dx = 5.32f, dy = -15.73f)
          // l -3.88 3.88
          lineToRelative(dx = -3.88f, dy = 3.88f)
          // a 7 7 0 0 0 -2.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.88f,
            dy1 = 0.0f,
          )
          // l -3.88 -3.88
          lineToRelative(dx = -3.88f, dy = -3.88f)
          // a 12.3 12.3 0 0 1 10.64 0
          arcToRelative(
            a = 12.3f,
            b = 12.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.64f,
            dy1 = 0.0f,
          )
          // M 7.59 5
          moveTo(x = 7.59f, y = 5.0f)
          // l 4.93 4.93
          lineToRelative(dx = 4.93f, dy = 4.93f)
          // a 7 7 0 0 0 -2.59 2.59
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.59f,
            dy1 = 2.59f,
          )
          // L 5 7.6z
          lineTo(x = 5.0f, y = 7.6f)
          close()
          // M 4 16
          moveTo(x = 4.0f, y = 16.0f)
          // a 12 12 0 0 1 1.25 -5.33
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.25f,
            dy1 = -5.33f,
          )
          // l 3.9 3.9
          lineToRelative(dx = 3.9f, dy = 3.9f)
          // a 7 7 0 0 0 0 2.87
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.87f,
          )
          // l -3.9 3.9
          lineToRelative(dx = -3.9f, dy = 3.9f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // m 3.59 11
          moveToRelative(dx = 3.59f, dy = 11.0f)
          // L 5 24.41
          lineTo(x = 5.0f, y = 24.41f)
          // l 4.93 -4.93
          lineToRelative(dx = 4.93f, dy = -4.93f)
          // a 7 7 0 0 0 2.59 2.59z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.59f,
            dy1 = 2.59f,
          )
          close()
          // m 3.1 -0.27
          moveToRelative(dx = 3.1f, dy = -0.27f)
          // l 3.87 -3.88
          lineToRelative(dx = 3.87f, dy = -3.88f)
          // a 7 7 0 0 0 2.88 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.88f,
            dy1 = 0.0f,
          )
          // l 3.88 3.88
          lineToRelative(dx = 3.88f, dy = 3.88f)
          // a 12.3 12.3 0 0 1 -10.64 0
          arcToRelative(
            a = 12.3f,
            b = 12.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.64f,
            dy1 = 0.0f,
          )
          // M 24.4 27
          moveTo(x = 24.4f, y = 27.0f)
          // l -4.93 -4.93
          lineToRelative(dx = -4.93f, dy = -4.93f)
          // a 7 7 0 0 0 2.59 -2.59
          arcToRelative(
          a = 7.0f,
          b = 7.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = 2.59f,
          dy1 = -2.59f,
        )
        // L 27 24.41z
        lineTo(x = 27.0f, y = 24.41f)
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
      .also { _lifesaver = it }
  }

@Suppress("ObjectPropertyName")
private var _lifesaver: ImageVector? = null
