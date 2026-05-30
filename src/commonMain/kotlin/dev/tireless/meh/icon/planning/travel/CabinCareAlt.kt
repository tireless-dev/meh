// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CabinCareAlt: ImageVector
  get() {
    val current = _cabinCareAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CabinCareAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 25 v-2 h-9.23 l-.8 -3 H27 v-2 h-7.57 l-2.46 -9.26 -1.94 .52 3.8 14.25 A2 2 0 0 0 20.78 25 H22 v3 H10 v-3 h6 v-2 H6.77 l-.8 -3 H13 v-2 H5.43 L2.97 8.74 1.03 9.26 l3.8 14.25 A2 2 0 0 0 6.78 25 H8 v3 H2 v2 h28 v-2 h-6 v-3Z M27.3 2 a2.7 2.7 0 0 0 -1.9 .8 L25 3.22 l-.4 -.4 a2.66 2.66 0 0 0 -3.81 0 2.8 2.8 0 0 0 0 3.9 L25 11 l4.21 -4.3 a2.8 2.8 0 0 0 0 -3.9 2.7 2.7 0 0 0 -1.9 -.8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 25
          moveTo(x = 30.0f, y = 25.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9.23
          horizontalLineToRelative(dx = -9.23f)
          // l -0.8 -3
          lineToRelative(dx = -0.8f, dy = -3.0f)
          // H 27
          horizontalLineTo(x = 27.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -7.57
          horizontalLineToRelative(dx = -7.57f)
          // l -2.46 -9.26
          lineToRelative(dx = -2.46f, dy = -9.26f)
          // l -1.94 0.52
          lineToRelative(dx = -1.94f, dy = 0.52f)
          // l 3.8 14.25
          lineToRelative(dx = 3.8f, dy = 14.25f)
          // A 2 2 0 0 0 20.78 25
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.78f,
            y1 = 25.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6.77
          horizontalLineTo(x = 6.77f)
          // l -0.8 -3
          lineToRelative(dx = -0.8f, dy = -3.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5.43
          horizontalLineTo(x = 5.43f)
          // L 2.97 8.74
          lineTo(x = 2.97f, y = 8.74f)
          // L 1.03 9.26
          lineTo(x = 1.03f, y = 9.26f)
          // l 3.8 14.25
          lineToRelative(dx = 3.8f, dy = 14.25f)
          // A 2 2 0 0 0 6.78 25
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.78f,
            y1 = 25.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // M 27.3 2
          moveTo(x = 27.3f, y = 2.0f)
          // a 2.7 2.7 0 0 0 -1.9 0.8
          arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.8f,
          )
          // L 25 3.22
          lineTo(x = 25.0f, y = 3.22f)
          // l -0.4 -0.4
          lineToRelative(dx = -0.4f, dy = -0.4f)
          // a 2.66 2.66 0 0 0 -3.81 0
          arcToRelative(
            a = 2.66f,
            b = 2.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.81f,
            dy1 = 0.0f,
          )
          // a 2.8 2.8 0 0 0 0 3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.9f,
          )
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // l 4.21 -4.3
          lineToRelative(dx = 4.21f, dy = -4.3f)
          // a 2.8 2.8 0 0 0 0 -3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.9f,
          )
          // a 2.7 2.7 0 0 0 -1.9 -0.8
          arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = -0.8f,
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
      .also { _cabinCareAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _cabinCareAlt: ImageVector? = null
