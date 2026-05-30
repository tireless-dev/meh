// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionCurve: ImageVector
  get() {
    val current = _directionCurve
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionCurve",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m17 4 -7 7 1.41 1.41 L16 7.83 v6.77 a3 3 0 0 1 -.66 1.87 l-2.24 2.8 A5 5 0 0 0 12 22.4 V28 h2 v-5.6 a3 3 0 0 1 .66 -1.87 l2.24 -2.8 A5 5 0 0 0 18 14.6 V7.83 l4.59 4.58 L24 11Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 4
          moveTo(x = 17.0f, y = 4.0f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 16 7.83
          lineTo(x = 16.0f, y = 7.83f)
          // v 6.77
          verticalLineToRelative(dy = 6.77f)
          // a 3 3 0 0 1 -0.66 1.87
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.66f,
            dy1 = 1.87f,
          )
          // l -2.24 2.8
          lineToRelative(dx = -2.24f, dy = 2.8f)
          // A 5 5 0 0 0 12 22.4
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 22.4f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5.6
          verticalLineToRelative(dy = -5.6f)
          // a 3 3 0 0 1 0.66 -1.87
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.66f,
            dy1 = -1.87f,
          )
          // l 2.24 -2.8
          lineToRelative(dx = 2.24f, dy = -2.8f)
          // A 5 5 0 0 0 18 14.6
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 14.6f,
          )
          // V 7.83
          verticalLineTo(y = 7.83f)
          // l 4.59 4.58
          lineToRelative(dx = 4.59f, dy = 4.58f)
          // L 24 11z
          lineTo(x = 24.0f, y = 11.0f)
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
      .also { _directionCurve = it }
  }

@Suppress("ObjectPropertyName")
private var _directionCurve: ImageVector? = null
