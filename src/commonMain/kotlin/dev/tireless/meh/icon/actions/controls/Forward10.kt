// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forward10: ImageVector
  get() {
    val current = _forward10
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Forward10",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 18 A10 10 0 1 1 16 8 h4 v5 l6 -6 -6 -6 v5 h-4 a12 12 0 1 0 12 12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // A 10 10 0 1 1 16 8
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 12 12 0 1 0 12 12z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          close()
        }
        // M19.63 22.13 a3 3 0 0 1 -1.28 -.27 2.4 2.4 0 0 1 -.89 -.77 4 4 0 0 1 -.52 -1.25 8 8 0 0 1 -.17 -1.68 8 8 0 0 1 .17 -1.68 4 4 0 0 1 .52 -1.25 2.4 2.4 0 0 1 .89 -.77 3 3 0 0 1 1.28 -.27 2.4 2.4 0 0 1 2.16 1 5.2 5.2 0 0 1 .7 2.93 5.2 5.2 0 0 1 -.7 2.93 2.4 2.4 0 0 1 -2.16 1.08 m0 -1.22 a1.1 1.1 0 0 0 1 -.55 A3.4 3.4 0 0 0 21 18.85 v-1.38 a3 3 0 0 0 -.29 -1.5 1.23 1.23 0 0 0 -2.06 0 3 3 0 0 0 -.29 1.5 v1.38 a3.4 3.4 0 0 0 .29 1.51 1.1 1.1 0 0 0 .98 .55 m-9 1.09 v-1.18 h2 v-5.19 l-1.86 1 -.55 -1.06 2.32 -1.3 H14 v6.5 h1.78 V22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.63 22.13
          moveTo(x = 19.63f, y = 22.13f)
          // a 3 3 0 0 1 -1.28 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.28f,
            dy1 = -0.27f,
          )
          // a 2.4 2.4 0 0 1 -0.89 -0.77
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = -0.77f,
          )
          // a 4 4 0 0 1 -0.52 -1.25
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.52f,
            dy1 = -1.25f,
          )
          // a 8 8 0 0 1 -0.17 -1.68
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.17f,
            dy1 = -1.68f,
          )
          // a 8 8 0 0 1 0.17 -1.68
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.17f,
            dy1 = -1.68f,
          )
          // a 4 4 0 0 1 0.52 -1.25
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.52f,
            dy1 = -1.25f,
          )
          // a 2.4 2.4 0 0 1 0.89 -0.77
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.89f,
            dy1 = -0.77f,
          )
          // a 3 3 0 0 1 1.28 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.28f,
            dy1 = -0.27f,
          )
          // a 2.4 2.4 0 0 1 2.16 1
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.16f,
            dy1 = 1.0f,
          )
          // a 5.2 5.2 0 0 1 0.7 2.93
          arcToRelative(
            a = 5.2f,
            b = 5.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = 2.93f,
          )
          // a 5.2 5.2 0 0 1 -0.7 2.93
          arcToRelative(
            a = 5.2f,
            b = 5.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = 2.93f,
          )
          // a 2.4 2.4 0 0 1 -2.16 1.08
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.16f,
            dy1 = 1.08f,
          )
          // m 0 -1.22
          moveToRelative(dx = 0.0f, dy = -1.22f)
          // a 1.1 1.1 0 0 0 1 -0.55
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -0.55f,
          )
          // A 3.4 3.4 0 0 0 21 18.85
          arcTo(
            horizontalEllipseRadius = 3.4f,
            verticalEllipseRadius = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 18.85f,
          )
          // v -1.38
          verticalLineToRelative(dy = -1.38f)
          // a 3 3 0 0 0 -0.29 -1.5
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = -1.5f,
          )
          // a 1.23 1.23 0 0 0 -2.06 0
          arcToRelative(
            a = 1.23f,
            b = 1.23f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.06f,
            dy1 = 0.0f,
          )
          // a 3 3 0 0 0 -0.29 1.5
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = 1.5f,
          )
          // v 1.38
          verticalLineToRelative(dy = 1.38f)
          // a 3.4 3.4 0 0 0 0.29 1.51
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = 1.51f,
          )
          // a 1.1 1.1 0 0 0 0.98 0.55
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.98f,
            dy1 = 0.55f,
          )
          // m -9 1.09
          moveToRelative(dx = -9.0f, dy = 1.09f)
          // v -1.18
          verticalLineToRelative(dy = -1.18f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5.19
          verticalLineToRelative(dy = -5.19f)
          // l -1.86 1
          lineToRelative(dx = -1.86f, dy = 1.0f)
          // l -0.55 -1.06
          lineToRelative(dx = -0.55f, dy = -1.06f)
          // l 2.32 -1.3
          lineToRelative(dx = 2.32f, dy = -1.3f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 6.5
          verticalLineToRelative(dy = 6.5f)
          // h 1.78
          horizontalLineToRelative(dx = 1.78f)
          // V 22z
          verticalLineTo(y = 22.0f)
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
      .also { _forward10 = it }
  }

@Suppress("ObjectPropertyName")
private var _forward10: ImageVector? = null
