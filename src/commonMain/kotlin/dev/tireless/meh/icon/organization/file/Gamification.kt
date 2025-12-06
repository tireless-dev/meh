// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gamification: ImageVector
  get() {
    val current = _gamification
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Gamification",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 23 h-.13 l.96 -1.45 A1 1 0 0 0 24 21 v-9 c0 -9.89 -7.92 -10 -8 -10 a1 1 0 0 0 -1 1 v2 h-1 a1 1 0 0 0 -.58 .19 l-7 5 a1 1 0 0 0 -.37 1.13 l1 3 a1 1 0 0 0 1.1 .67 l4.86 -.7 -3.86 6.18 a1 1 0 0 0 .02 1.09 L10.13 23 H10 a3 3 0 0 0 -3 3 v4 h19 v-4 a3 3 0 0 0 -3 -3 m-7.15 -9.47 a1 1 0 0 0 -1 -1.52 l-6.17 .88 -.5 -1.5 L14.32 7 H16 a1 1 0 0 0 1 -1 V4.13 c1.5 .33 4.22 1.54 4.86 5.87 H19 v2 h3 v2 h-3 v2 h3 v2 h-3 v2 h3 v.7 L20.46 23 h-7.93 l-1.34 -2.02Z M24 28 H9 v-2 a1 1 0 0 1 1 -1 h13 a1 1 0 0 1 1 1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 23
          moveTo(x = 23.0f, y = 23.0f)
          // h -0.13
          horizontalLineToRelative(dx = -0.13f)
          // l 0.96 -1.45
          lineToRelative(dx = 0.96f, dy = -1.45f)
          // A 1 1 0 0 0 24 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 21.0f,
          )
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // c 0 -9.89 -7.92 -10 -8 -10
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -9.89f,
            dx2 = -7.92f,
            dy2 = -10.0f,
            dx3 = -8.0f,
            dy3 = -10.0f,
          )
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 1 1 0 0 0 -0.58 0.19
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.58f,
            dy1 = 0.19f,
          )
          // l -7 5
          lineToRelative(dx = -7.0f, dy = 5.0f)
          // a 1 1 0 0 0 -0.37 1.13
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.37f,
            dy1 = 1.13f,
          )
          // l 1 3
          lineToRelative(dx = 1.0f, dy = 3.0f)
          // a 1 1 0 0 0 1.1 0.67
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.1f,
            dy1 = 0.67f,
          )
          // l 4.86 -0.7
          lineToRelative(dx = 4.86f, dy = -0.7f)
          // l -3.86 6.18
          lineToRelative(dx = -3.86f, dy = 6.18f)
          // a 1 1 0 0 0 0.02 1.09
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.02f,
            dy1 = 1.09f,
          )
          // L 10.13 23
          lineTo(x = 10.13f, y = 23.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 19
          horizontalLineToRelative(dx = 19.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m -7.15 -9.47
          moveToRelative(dx = -7.15f, dy = -9.47f)
          // a 1 1 0 0 0 -1 -1.52
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.52f,
          )
          // l -6.17 0.88
          lineToRelative(dx = -6.17f, dy = 0.88f)
          // l -0.5 -1.5
          lineToRelative(dx = -0.5f, dy = -1.5f)
          // L 14.32 7
          lineTo(x = 14.32f, y = 7.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 4.13
          verticalLineTo(y = 4.13f)
          // c 1.5 0.33 4.22 1.54 4.86 5.87
          curveToRelative(
            dx1 = 1.5f,
            dy1 = 0.33f,
            dx2 = 4.22f,
            dy2 = 1.54f,
            dx3 = 4.86f,
            dy3 = 5.87f,
          )
          // H 19
          horizontalLineTo(x = 19.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 0.7
          verticalLineToRelative(dy = 0.7f)
          // L 20.46 23
          lineTo(x = 20.46f, y = 23.0f)
          // h -7.93
          horizontalLineToRelative(dx = -7.93f)
          // l -1.34 -2.02z
          lineToRelative(dx = -1.34f, dy = -2.02f)
          close()
          // M 24 28
          moveTo(x = 24.0f, y = 28.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // a 1 1 0 0 1 1 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
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
      .also { _gamification = it }
  }

@Suppress("ObjectPropertyName")
private var _gamification: ImageVector? = null
