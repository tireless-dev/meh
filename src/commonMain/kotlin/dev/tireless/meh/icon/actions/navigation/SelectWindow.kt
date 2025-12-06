// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SelectWindow: ImageVector
  get() {
    val current = _selectWindow
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SelectWindow",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 26 H4 a2 2 0 0 1 -2 -2 v-4 h2 v4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 26
          moveTo(x = 8.0f, y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // <rect width="2" height="4" x="2.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 12
          moveTo(x = 2.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M26 8 h-2 V4 h-4 V2 h4 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 8
          moveTo(x = 26.0f, y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
        }
        // <rect width="4" height="2" x="12.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 2
          moveTo(x = 12.0f, y = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M4 8 H2 V4 a2 2 0 0 1 2 -2 h4 v2 H4Z m23 24 a1 1 0 0 1 -.7 -.3 l-6.14 -6.13 -3.33 4.98 a1 1 0 0 1 -1.79 -.26 l-6 -20 a1 1 0 0 1 1.25 -1.25 l20 6 a1 1 0 0 1 .26 1.8 l-4.98 3.32 6.14 6.13 a1 1 0 0 1 0 1.42 l-4 4 A1 1 0 0 1 27 32 m0 -2.41 L29.59 27 l-7.16 -7.16 5.25 -3.5 -16.19 -4.85 4.86 16.19 3.5 -5.25Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 23 24
          moveToRelative(dx = 23.0f, dy = 24.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -6.14 -6.13
          lineToRelative(dx = -6.14f, dy = -6.13f)
          // l -3.33 4.98
          lineToRelative(dx = -3.33f, dy = 4.98f)
          // a 1 1 0 0 1 -1.79 -0.26
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.79f,
            dy1 = -0.26f,
          )
          // l -6 -20
          lineToRelative(dx = -6.0f, dy = -20.0f)
          // a 1 1 0 0 1 1.25 -1.25
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.25f,
            dy1 = -1.25f,
          )
          // l 20 6
          lineToRelative(dx = 20.0f, dy = 6.0f)
          // a 1 1 0 0 1 0.26 1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.26f,
            dy1 = 1.8f,
          )
          // l -4.98 3.32
          lineToRelative(dx = -4.98f, dy = 3.32f)
          // l 6.14 6.13
          lineToRelative(dx = 6.14f, dy = 6.13f)
          // a 1 1 0 0 1 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // A 1 1 0 0 1 27 32
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.0f,
            y1 = 32.0f,
          )
          // m 0 -2.41
          moveToRelative(dx = 0.0f, dy = -2.41f)
          // L 29.59 27
          lineTo(x = 29.59f, y = 27.0f)
          // l -7.16 -7.16
          lineToRelative(dx = -7.16f, dy = -7.16f)
          // l 5.25 -3.5
          lineToRelative(dx = 5.25f, dy = -3.5f)
          // l -16.19 -4.85
          lineToRelative(dx = -16.19f, dy = -4.85f)
          // l 4.86 16.19
          lineToRelative(dx = 4.86f, dy = 16.19f)
          // l 3.5 -5.25z
          lineToRelative(dx = 3.5f, dy = -5.25f)
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
      .also { _selectWindow = it }
  }

@Suppress("ObjectPropertyName")
private var _selectWindow: ImageVector? = null
