// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Settings: ImageVector
  get() {
    val current = _settings
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Settings",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 16.76 v-1.53 l1.92 -1.68 A2 2 0 0 0 29.3 11 l-2.36 -4 a2 2 0 0 0 -1.73 -1 2 2 0 0 0 -.64 .1 l-2.43 .82 a11 11 0 0 0 -1.31 -.75 l-.51 -2.52 a2 2 0 0 0 -2 -1.61 h-4.68 a2 2 0 0 0 -2 1.61 l-.51 2.52 a12 12 0 0 0 -1.32 .75 L7.43 6.06 A2 2 0 0 0 6.79 6 a2 2 0 0 0 -1.73 1 L2.7 11 a2 2 0 0 0 .41 2.51 L5 15.24 v1.53 l-1.89 1.68 A2 2 0 0 0 2.7 21 l2.36 4 a2 2 0 0 0 1.73 1 2 2 0 0 0 .64 -.1 l2.43 -.82 a11 11 0 0 0 1.31 .75 l.51 2.52 a2 2 0 0 0 2 1.61 h4.72 a2 2 0 0 0 2 -1.61 l.51 -2.52 a12 12 0 0 0 1.32 -.75 l2.42 .82 a2 2 0 0 0 .64 .1 2 2 0 0 0 1.73 -1 l2.28 -4 a2 2 0 0 0 -.41 -2.51Z M25.21 24 l-3.43 -1.16 a9 9 0 0 1 -2.71 1.57 L18.36 28 h-4.72 l-.71 -3.55 a9 9 0 0 1 -2.7 -1.57 L6.79 24 l-2.36 -4 2.72 -2.4 a9 9 0 0 1 0 -3.13 L4.43 12 l2.36 -4 3.43 1.16 a9 9 0 0 1 2.71 -1.57 L13.64 4 h4.72 l.71 3.55 a9 9 0 0 1 2.7 1.57 L25.21 8 l2.36 4 -2.72 2.4 a9 9 0 0 1 0 3.13 L27.57 20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 16.76
          moveTo(x = 27.0f, y = 16.76f)
          // v -1.53
          verticalLineToRelative(dy = -1.53f)
          // l 1.92 -1.68
          lineToRelative(dx = 1.92f, dy = -1.68f)
          // A 2 2 0 0 0 29.3 11
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 29.3f,
            y1 = 11.0f,
          )
          // l -2.36 -4
          lineToRelative(dx = -2.36f, dy = -4.0f)
          // a 2 2 0 0 0 -1.73 -1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.73f,
            dy1 = -1.0f,
          )
          // a 2 2 0 0 0 -0.64 0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.64f,
            dy1 = 0.1f,
          )
          // l -2.43 0.82
          lineToRelative(dx = -2.43f, dy = 0.82f)
          // a 11 11 0 0 0 -1.31 -0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.31f,
            dy1 = -0.75f,
          )
          // l -0.51 -2.52
          lineToRelative(dx = -0.51f, dy = -2.52f)
          // a 2 2 0 0 0 -2 -1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -1.61f,
          )
          // h -4.68
          horizontalLineToRelative(dx = -4.68f)
          // a 2 2 0 0 0 -2 1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 1.61f,
          )
          // l -0.51 2.52
          lineToRelative(dx = -0.51f, dy = 2.52f)
          // a 12 12 0 0 0 -1.32 0.75
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.32f,
            dy1 = 0.75f,
          )
          // L 7.43 6.06
          lineTo(x = 7.43f, y = 6.06f)
          // A 2 2 0 0 0 6.79 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.79f,
            y1 = 6.0f,
          )
          // a 2 2 0 0 0 -1.73 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.73f,
            dy1 = 1.0f,
          )
          // L 2.7 11
          lineTo(x = 2.7f, y = 11.0f)
          // a 2 2 0 0 0 0.41 2.51
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.41f,
            dy1 = 2.51f,
          )
          // L 5 15.24
          lineTo(x = 5.0f, y = 15.24f)
          // v 1.53
          verticalLineToRelative(dy = 1.53f)
          // l -1.89 1.68
          lineToRelative(dx = -1.89f, dy = 1.68f)
          // A 2 2 0 0 0 2.7 21
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.7f,
            y1 = 21.0f,
          )
          // l 2.36 4
          lineToRelative(dx = 2.36f, dy = 4.0f)
          // a 2 2 0 0 0 1.73 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.73f,
            dy1 = 1.0f,
          )
          // a 2 2 0 0 0 0.64 -0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.64f,
            dy1 = -0.1f,
          )
          // l 2.43 -0.82
          lineToRelative(dx = 2.43f, dy = -0.82f)
          // a 11 11 0 0 0 1.31 0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.31f,
            dy1 = 0.75f,
          )
          // l 0.51 2.52
          lineToRelative(dx = 0.51f, dy = 2.52f)
          // a 2 2 0 0 0 2 1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 1.61f,
          )
          // h 4.72
          horizontalLineToRelative(dx = 4.72f)
          // a 2 2 0 0 0 2 -1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.61f,
          )
          // l 0.51 -2.52
          lineToRelative(dx = 0.51f, dy = -2.52f)
          // a 12 12 0 0 0 1.32 -0.75
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.32f,
            dy1 = -0.75f,
          )
          // l 2.42 0.82
          lineToRelative(dx = 2.42f, dy = 0.82f)
          // a 2 2 0 0 0 0.64 0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.64f,
            dy1 = 0.1f,
          )
          // a 2 2 0 0 0 1.73 -1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.73f,
            dy1 = -1.0f,
          )
          // l 2.28 -4
          lineToRelative(dx = 2.28f, dy = -4.0f)
          // a 2 2 0 0 0 -0.41 -2.51z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.41f,
            dy1 = -2.51f,
          )
          close()
          // M 25.21 24
          moveTo(x = 25.21f, y = 24.0f)
          // l -3.43 -1.16
          lineToRelative(dx = -3.43f, dy = -1.16f)
          // a 9 9 0 0 1 -2.71 1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.71f,
            dy1 = 1.57f,
          )
          // L 18.36 28
          lineTo(x = 18.36f, y = 28.0f)
          // h -4.72
          horizontalLineToRelative(dx = -4.72f)
          // l -0.71 -3.55
          lineToRelative(dx = -0.71f, dy = -3.55f)
          // a 9 9 0 0 1 -2.7 -1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.7f,
            dy1 = -1.57f,
          )
          // L 6.79 24
          lineTo(x = 6.79f, y = 24.0f)
          // l -2.36 -4
          lineToRelative(dx = -2.36f, dy = -4.0f)
          // l 2.72 -2.4
          lineToRelative(dx = 2.72f, dy = -2.4f)
          // a 9 9 0 0 1 0 -3.13
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.13f,
          )
          // L 4.43 12
          lineTo(x = 4.43f, y = 12.0f)
          // l 2.36 -4
          lineToRelative(dx = 2.36f, dy = -4.0f)
          // l 3.43 1.16
          lineToRelative(dx = 3.43f, dy = 1.16f)
          // a 9 9 0 0 1 2.71 -1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.71f,
            dy1 = -1.57f,
          )
          // L 13.64 4
          lineTo(x = 13.64f, y = 4.0f)
          // h 4.72
          horizontalLineToRelative(dx = 4.72f)
          // l 0.71 3.55
          lineToRelative(dx = 0.71f, dy = 3.55f)
          // a 9 9 0 0 1 2.7 1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.7f,
            dy1 = 1.57f,
          )
          // L 25.21 8
          lineTo(x = 25.21f, y = 8.0f)
          // l 2.36 4
          lineToRelative(dx = 2.36f, dy = 4.0f)
          // l -2.72 2.4
          lineToRelative(dx = -2.72f, dy = 2.4f)
          // a 9 9 0 0 1 0 3.13
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.13f,
          )
          // L 27.57 20z
          lineTo(x = 27.57f, y = 20.0f)
          close()
        }
        // M16 22 a6 6 0 1 1 6 -6 5.94 5.94 0 0 1 -6 6 m0 -10 a3.9 3.9 0 0 0 -4 4 3.9 3.9 0 0 0 4 4 3.9 3.9 0 0 0 4 -4 3.9 3.9 0 0 0 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // a 6 6 0 1 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 5.94 5.94 0 0 1 -6 6
          arcToRelative(
            a = 5.94f,
            b = 5.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // a 3.9 3.9 0 0 0 -4 4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 3.9 3.9 0 0 0 4 4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 3.9 3.9 0 0 0 4 -4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 3.9 3.9 0 0 0 -4 -4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
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
      .also { _settings = it }
  }

@Suppress("ObjectPropertyName")
private var _settings: ImageVector? = null
