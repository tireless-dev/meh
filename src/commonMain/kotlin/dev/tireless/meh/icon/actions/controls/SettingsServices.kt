// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SettingsServices: ImageVector
  get() {
    val current = _settingsServices
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SettingsServices",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 25 h-2 v-2 h1 v-4 h-4 v1 h-2 v-2 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 1 1 v6 a1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 25
          moveTo(x = 29.0f, y = 25.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
        }
        // M24 30 h-6 a1 1 0 0 1 -1 -1 v-6 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 1 1 v6 a1 1 0 0 1 -1 1 m-5 -2 h4 v-4 h-4Z m-4 -8.14 A4 4 0 1 1 20 16 h2 a6 6 0 1 0 -7 5.91Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 30
          moveTo(x = 24.0f, y = 30.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m -5 -2
          moveToRelative(dx = -5.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -4 -8.14
          moveToRelative(dx = -4.0f, dy = -8.14f)
          // A 4 4 0 1 1 20 16
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 1 0 -7 5.91z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 5.91f,
          )
          close()
        }
        // m28.89 13.55 -2.31 2.03 -1.42 -1.42 2.41 -2.12 -2.36 -4.08 -3.44 1.16 a9 9 0 0 0 -2.7 -1.57 L18.36 4 h-4.72 l-.71 3.55 a9 9 0 0 0 -2.71 1.57 L6.79 7.96 l-2.36 4.08 2.72 2.39 a9 9 0 0 0 0 3.13 l-2.72 2.4 2.36 4.08 3.44 -1.16 a9 9 0 0 0 2.7 1.57 L13.64 28 H15 v2 h-1.36 a2 2 0 0 1 -1.96 -1.61 l-.51 -2.52 a11 11 0 0 1 -1.31 -.75 l-2.43 .82 a2 2 0 0 1 -.64 .1 2 2 0 0 1 -1.73 -1 L2.7 20.96 a2 2 0 0 1 .41 -2.51 l1.92 -1.68 Q5 16.38 5 16 c0 -.38 .02 -.51 .04 -.76 l-1.93 -1.69 a2 2 0 0 1 -.41 -2.51 l2.36 -4.08 a2 2 0 0 1 1.73 -1 2 2 0 0 1 .64 .1 l2.42 .82 a12 12 0 0 1 1.32 -.75 l.51 -2.52 A2 2 0 0 1 13.64 2 h4.72 a2 2 0 0 1 1.96 1.61 l.51 2.52 a11 11 0 0 1 1.31 .75 l2.43 -.82 a2 2 0 0 1 .64 -.1 2 2 0 0 1 1.73 1 l2.36 4.08 a2 2 0 0 1 -.41 2.51
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.89 13.55
          moveTo(x = 28.89f, y = 13.55f)
          // l -2.31 2.03
          lineToRelative(dx = -2.31f, dy = 2.03f)
          // l -1.42 -1.42
          lineToRelative(dx = -1.42f, dy = -1.42f)
          // l 2.41 -2.12
          lineToRelative(dx = 2.41f, dy = -2.12f)
          // l -2.36 -4.08
          lineToRelative(dx = -2.36f, dy = -4.08f)
          // l -3.44 1.16
          lineToRelative(dx = -3.44f, dy = 1.16f)
          // a 9 9 0 0 0 -2.7 -1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.7f,
            dy1 = -1.57f,
          )
          // L 18.36 4
          lineTo(x = 18.36f, y = 4.0f)
          // h -4.72
          horizontalLineToRelative(dx = -4.72f)
          // l -0.71 3.55
          lineToRelative(dx = -0.71f, dy = 3.55f)
          // a 9 9 0 0 0 -2.71 1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.71f,
            dy1 = 1.57f,
          )
          // L 6.79 7.96
          lineTo(x = 6.79f, y = 7.96f)
          // l -2.36 4.08
          lineToRelative(dx = -2.36f, dy = 4.08f)
          // l 2.72 2.39
          lineToRelative(dx = 2.72f, dy = 2.39f)
          // a 9 9 0 0 0 0 3.13
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.13f,
          )
          // l -2.72 2.4
          lineToRelative(dx = -2.72f, dy = 2.4f)
          // l 2.36 4.08
          lineToRelative(dx = 2.36f, dy = 4.08f)
          // l 3.44 -1.16
          lineToRelative(dx = 3.44f, dy = -1.16f)
          // a 9 9 0 0 0 2.7 1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.7f,
            dy1 = 1.57f,
          )
          // L 13.64 28
          lineTo(x = 13.64f, y = 28.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1.36
          horizontalLineToRelative(dx = -1.36f)
          // a 2 2 0 0 1 -1.96 -1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.96f,
            dy1 = -1.61f,
          )
          // l -0.51 -2.52
          lineToRelative(dx = -0.51f, dy = -2.52f)
          // a 11 11 0 0 1 -1.31 -0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.31f,
            dy1 = -0.75f,
          )
          // l -2.43 0.82
          lineToRelative(dx = -2.43f, dy = 0.82f)
          // a 2 2 0 0 1 -0.64 0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.64f,
            dy1 = 0.1f,
          )
          // a 2 2 0 0 1 -1.73 -1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.73f,
            dy1 = -1.0f,
          )
          // L 2.7 20.96
          lineTo(x = 2.7f, y = 20.96f)
          // a 2 2 0 0 1 0.41 -2.51
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.41f,
            dy1 = -2.51f,
          )
          // l 1.92 -1.68
          lineToRelative(dx = 1.92f, dy = -1.68f)
          // Q 5 16.38 5 16
          quadTo(
            x1 = 5.0f,
            y1 = 16.38f,
            x2 = 5.0f,
            y2 = 16.0f,
          )
          // c 0 -0.38 0.02 -0.51 0.04 -0.76
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.38f,
            dx2 = 0.02f,
            dy2 = -0.51f,
            dx3 = 0.04f,
            dy3 = -0.76f,
          )
          // l -1.93 -1.69
          lineToRelative(dx = -1.93f, dy = -1.69f)
          // a 2 2 0 0 1 -0.41 -2.51
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.41f,
            dy1 = -2.51f,
          )
          // l 2.36 -4.08
          lineToRelative(dx = 2.36f, dy = -4.08f)
          // a 2 2 0 0 1 1.73 -1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.73f,
            dy1 = -1.0f,
          )
          // a 2 2 0 0 1 0.64 0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.64f,
            dy1 = 0.1f,
          )
          // l 2.42 0.82
          lineToRelative(dx = 2.42f, dy = 0.82f)
          // a 12 12 0 0 1 1.32 -0.75
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.32f,
            dy1 = -0.75f,
          )
          // l 0.51 -2.52
          lineToRelative(dx = 0.51f, dy = -2.52f)
          // A 2 2 0 0 1 13.64 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.64f,
            y1 = 2.0f,
          )
          // h 4.72
          horizontalLineToRelative(dx = 4.72f)
          // a 2 2 0 0 1 1.96 1.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.96f,
            dy1 = 1.61f,
          )
          // l 0.51 2.52
          lineToRelative(dx = 0.51f, dy = 2.52f)
          // a 11 11 0 0 1 1.31 0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.31f,
            dy1 = 0.75f,
          )
          // l 2.43 -0.82
          lineToRelative(dx = 2.43f, dy = -0.82f)
          // a 2 2 0 0 1 0.64 -0.1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.64f,
            dy1 = -0.1f,
          )
          // a 2 2 0 0 1 1.73 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.73f,
          dy1 = 1.0f,
        )
        // l 2.36 4.08
        lineToRelative(dx = 2.36f, dy = 4.08f)
        // a 2 2 0 0 1 -0.41 2.51
        arcToRelative(
          a = 2.0f,
          b = 2.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = -0.41f,
          dy1 = 2.51f,
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
      .also { _settingsServices = it }
  }

@Suppress("ObjectPropertyName")
private var _settingsServices: ImageVector? = null
