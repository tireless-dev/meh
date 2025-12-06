// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartAverage: ImageVector
  get() {
    val current = _chartAverage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartAverage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 24 c-3.6 0 -5.03 -4.18 -6.41 -8.21 C15.28 11.96 13.92 8 11 8 a3.4 3.4 0 0 0 -3.05 2.32 l-1.9 -.64 C6.1 9.53 7.32 6 11 6 c4.35 0 6.01 4.85 7.48 9.14 C19.68 18.67 20.83 22 23 22 a3.4 3.4 0 0 0 3.05 -2.32 l1.9 .64 C27.9 20.47 26.68 24 23 24
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 24
          moveTo(x = 23.0f, y = 24.0f)
          // c -3.6 0 -5.03 -4.18 -6.41 -8.21
          curveToRelative(
            dx1 = -3.6f,
            dy1 = 0.0f,
            dx2 = -5.03f,
            dy2 = -4.18f,
            dx3 = -6.41f,
            dy3 = -8.21f,
          )
          // C 15.28 11.96 13.92 8 11 8
          curveTo(
            x1 = 15.28f,
            y1 = 11.96f,
            x2 = 13.92f,
            y2 = 8.0f,
            x3 = 11.0f,
            y3 = 8.0f,
          )
          // a 3.4 3.4 0 0 0 -3.05 2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.05f,
            dy1 = 2.32f,
          )
          // l -1.9 -0.64
          lineToRelative(dx = -1.9f, dy = -0.64f)
          // C 6.1 9.53 7.32 6 11 6
          curveTo(
            x1 = 6.1f,
            y1 = 9.53f,
            x2 = 7.32f,
            y2 = 6.0f,
            x3 = 11.0f,
            y3 = 6.0f,
          )
          // c 4.35 0 6.01 4.85 7.48 9.14
          curveToRelative(
            dx1 = 4.35f,
            dy1 = 0.0f,
            dx2 = 6.01f,
            dy2 = 4.85f,
            dx3 = 7.48f,
            dy3 = 9.14f,
          )
          // C 19.68 18.67 20.83 22 23 22
          curveTo(
            x1 = 19.68f,
            y1 = 18.67f,
            x2 = 20.83f,
            y2 = 22.0f,
            x3 = 23.0f,
            y3 = 22.0f,
          )
          // a 3.4 3.4 0 0 0 3.05 -2.32
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.05f,
            dy1 = -2.32f,
          )
          // l 1.9 0.64
          lineToRelative(dx = 1.9f, dy = 0.64f)
          // C 27.9 20.47 26.68 24 23 24
          curveTo(
            x1 = 27.9f,
            y1 = 20.47f,
            x2 = 26.68f,
            y2 = 24.0f,
            x3 = 23.0f,
            y3 = 24.0f,
          )
        }
        // M4 28 V17 h2 v-2 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="8.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 15
          moveTo(x = 8.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="12.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 15
          moveTo(x = 12.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="20.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 15
          moveTo(x = 20.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="24.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 15
          moveTo(x = 24.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="28.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 15
          moveTo(x = 28.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _chartAverage = it }
  }

@Suppress("ObjectPropertyName")
private var _chartAverage: ImageVector? = null
