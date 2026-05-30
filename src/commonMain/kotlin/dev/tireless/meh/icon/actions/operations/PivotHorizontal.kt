// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PivotHorizontal: ImageVector
  get() {
    val current = _pivotHorizontal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PivotHorizontal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.1 2 H3.9 A1.9 1.9 0 0 0 2 3.9 v24.2 C2 29.2 2.9 30 3.9 30 h24.2 c1.1 0 1.9 -.9 1.9 -1.9 V3.9 C30 2.8 29.1 2 28.1 2 M28 28 H4 V8 h24z m0 -22 H4 V4 h24z m-6 13 -1.4 1.4 -2.6 -2.6 V24 a2 2 0 0 1 -2 2 h-6 v-2 h6 v-6.2 l-2.6 2.6 L12 19 l5 -5z M8 12 v-2 h16 v2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.1 2
          moveTo(x = 28.1f, y = 2.0f)
          // H 3.9
          horizontalLineTo(x = 3.9f)
          // A 1.9 1.9 0 0 0 2 3.9
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 3.9f,
          )
          // v 24.2
          verticalLineToRelative(dy = 24.2f)
          // C 2 29.2 2.9 30 3.9 30
          curveTo(
            x1 = 2.0f,
            y1 = 29.2f,
            x2 = 2.9f,
            y2 = 30.0f,
            x3 = 3.9f,
            y3 = 30.0f,
          )
          // h 24.2
          horizontalLineToRelative(dx = 24.2f)
          // c 1.1 0 1.9 -0.9 1.9 -1.9
          curveToRelative(
            dx1 = 1.1f,
            dy1 = 0.0f,
            dx2 = 1.9f,
            dy2 = -0.9f,
            dx3 = 1.9f,
            dy3 = -1.9f,
          )
          // V 3.9
          verticalLineTo(y = 3.9f)
          // C 30 2.8 29.1 2 28.1 2
          curveTo(
            x1 = 30.0f,
            y1 = 2.8f,
            x2 = 29.1f,
            y2 = 2.0f,
            x3 = 28.1f,
            y3 = 2.0f,
          )
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
          // m 0 -22
          moveToRelative(dx = 0.0f, dy = -22.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
          // m -6 13
          moveToRelative(dx = -6.0f, dy = 13.0f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l -2.6 -2.6
          lineToRelative(dx = -2.6f, dy = -2.6f)
          // V 24
          verticalLineTo(y = 24.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -6.2
          verticalLineToRelative(dy = -6.2f)
          // l -2.6 2.6
          lineToRelative(dx = -2.6f, dy = 2.6f)
          // L 12 19
          lineTo(x = 12.0f, y = 19.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
          // M 8 12
          moveTo(x = 8.0f, y = 12.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
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
      .also { _pivotHorizontal = it }
  }

@Suppress("ObjectPropertyName")
private var _pivotHorizontal: ImageVector? = null
