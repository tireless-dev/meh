// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Earth: ImageVector
  get() {
    val current = _earth
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Earth",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m5 3.1 A12 12 0 0 1 23.92 7 L23.5 8 H21Z m-7.62 22.6 A11.98 11.98 0 0 1 8.12 6.98 L9.46 9 h3.35 l-1.5 4 H7.28 L5.9 17.15 8.46 21 h5 l1.44 2.15Z M16 28 l-.6 -.03 1.4 -4.19 a2 2 0 0 0 -.24 -1.74 l-1.43 -2.15 A2 2 0 0 0 13.46 19 H9.53 L8.1 16.85 8.72 15 H11 v2 h2 v-2.82 l2.94 -7.83 -1.88 -.7 L13.56 7 h-3.02 L9.73 5.79 A11.8 11.8 0 0 1 19 4.39 V8 a2 2 0 0 0 2 2 h2.59 A2 2 0 0 0 25 9.41 l.14 -.14 .28 -.68 A12 12 0 0 1 27.3 12 h-4.7 a2 2 0 0 0 -1.97 1.67 l-.6 3.44 a2 2 0 0 0 1 2.08 l2.16 1.47 1.45 3.64 A12 12 0 0 1 16 28 m8.81 -8.66 -2.71 -1.83 -.1 -.06 .6 -3.45 h5.22 a11.7 11.7 0 0 1 -1.74 8.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 5 3.1
          moveToRelative(dx = 5.0f, dy = 3.1f)
          // A 12 12 0 0 1 23.92 7
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.92f,
            y1 = 7.0f,
          )
          // L 23.5 8
          lineTo(x = 23.5f, y = 8.0f)
          // H 21z
          horizontalLineTo(x = 21.0f)
          close()
          // m -7.62 22.6
          moveToRelative(dx = -7.62f, dy = 22.6f)
          // A 11.98 11.98 0 0 1 8.12 6.98
          arcTo(
            horizontalEllipseRadius = 11.98f,
            verticalEllipseRadius = 11.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.12f,
            y1 = 6.98f,
          )
          // L 9.46 9
          lineTo(x = 9.46f, y = 9.0f)
          // h 3.35
          horizontalLineToRelative(dx = 3.35f)
          // l -1.5 4
          lineToRelative(dx = -1.5f, dy = 4.0f)
          // H 7.28
          horizontalLineTo(x = 7.28f)
          // L 5.9 17.15
          lineTo(x = 5.9f, y = 17.15f)
          // L 8.46 21
          lineTo(x = 8.46f, y = 21.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // l 1.44 2.15z
          lineToRelative(dx = 1.44f, dy = 2.15f)
          close()
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // l -0.6 -0.03
          lineToRelative(dx = -0.6f, dy = -0.03f)
          // l 1.4 -4.19
          lineToRelative(dx = 1.4f, dy = -4.19f)
          // a 2 2 0 0 0 -0.24 -1.74
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.24f,
            dy1 = -1.74f,
          )
          // l -1.43 -2.15
          lineToRelative(dx = -1.43f, dy = -2.15f)
          // A 2 2 0 0 0 13.46 19
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.46f,
            y1 = 19.0f,
          )
          // H 9.53
          horizontalLineTo(x = 9.53f)
          // L 8.1 16.85
          lineTo(x = 8.1f, y = 16.85f)
          // L 8.72 15
          lineTo(x = 8.72f, y = 15.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.82
          verticalLineToRelative(dy = -2.82f)
          // l 2.94 -7.83
          lineToRelative(dx = 2.94f, dy = -7.83f)
          // l -1.88 -0.7
          lineToRelative(dx = -1.88f, dy = -0.7f)
          // L 13.56 7
          lineTo(x = 13.56f, y = 7.0f)
          // h -3.02
          horizontalLineToRelative(dx = -3.02f)
          // L 9.73 5.79
          lineTo(x = 9.73f, y = 5.79f)
          // A 11.8 11.8 0 0 1 19 4.39
          arcTo(
            horizontalEllipseRadius = 11.8f,
            verticalEllipseRadius = 11.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 4.39f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 2.59
          horizontalLineToRelative(dx = 2.59f)
          // A 2 2 0 0 0 25 9.41
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 9.41f,
          )
          // l 0.14 -0.14
          lineToRelative(dx = 0.14f, dy = -0.14f)
          // l 0.28 -0.68
          lineToRelative(dx = 0.28f, dy = -0.68f)
          // A 12 12 0 0 1 27.3 12
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.3f,
            y1 = 12.0f,
          )
          // h -4.7
          horizontalLineToRelative(dx = -4.7f)
          // a 2 2 0 0 0 -1.97 1.67
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.97f,
            dy1 = 1.67f,
          )
          // l -0.6 3.44
          lineToRelative(dx = -0.6f, dy = 3.44f)
          // a 2 2 0 0 0 1 2.08
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 2.08f,
          )
          // l 2.16 1.47
          lineToRelative(dx = 2.16f, dy = 1.47f)
          // l 1.45 3.64
          lineToRelative(dx = 1.45f, dy = 3.64f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // m 8.81 -8.66
          moveToRelative(dx = 8.81f, dy = -8.66f)
          // l -2.71 -1.83
          lineToRelative(dx = -2.71f, dy = -1.83f)
          // l -0.1 -0.06
          lineToRelative(dx = -0.1f, dy = -0.06f)
          // l 0.6 -3.45
          lineToRelative(dx = 0.6f, dy = -3.45f)
          // h 5.22
          horizontalLineToRelative(dx = 5.22f)
          // a 11.7 11.7 0 0 1 -1.74 8.5z
          arcToRelative(
            a = 11.7f,
            b = 11.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.74f,
            dy1 = 8.5f,
        )
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
      .also { _earth = it }
  }

@Suppress("ObjectPropertyName")
private var _earth: ImageVector? = null
