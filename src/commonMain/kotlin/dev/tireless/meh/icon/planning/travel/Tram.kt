// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tram: ImageVector
  get() {
    val current = _tram
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tram",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 6 h-4 V4 h6 V2 H9 v2 h6 v2 h-4 a5 5 0 0 0 -5 5 v11 a5 5 0 0 0 3.58 4.77 L8.2 30 h2.17 l1.29 -3 h8.68 l1.29 3 h2.17 l-1.38 -3.23 A5 5 0 0 0 26 22 V11 a5 5 0 0 0 -5 -5 M11 8 h10 a3 3 0 0 1 2.82 2 H8.18 A3 3 0 0 1 11 8 m13 13 h-3 v2 h2.82 A3 3 0 0 1 21 25 H11 a3 3 0 0 1 -2.82 -2 H11 v-2 H8 v-2 h16Z m0 -4 H8 v-5 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 6
          moveTo(x = 21.0f, y = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // a 5 5 0 0 0 3.58 4.77
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.58f,
            dy1 = 4.77f,
          )
          // L 8.2 30
          lineTo(x = 8.2f, y = 30.0f)
          // h 2.17
          horizontalLineToRelative(dx = 2.17f)
          // l 1.29 -3
          lineToRelative(dx = 1.29f, dy = -3.0f)
          // h 8.68
          horizontalLineToRelative(dx = 8.68f)
          // l 1.29 3
          lineToRelative(dx = 1.29f, dy = 3.0f)
          // h 2.17
          horizontalLineToRelative(dx = 2.17f)
          // l -1.38 -3.23
          lineToRelative(dx = -1.38f, dy = -3.23f)
          // A 5 5 0 0 0 26 22
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 22.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // M 11 8
          moveTo(x = 11.0f, y = 8.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 3 3 0 0 1 2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.82f,
            dy1 = 2.0f,
          )
          // H 8.18
          horizontalLineTo(x = 8.18f)
          // A 3 3 0 0 1 11 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 8.0f,
          )
          // m 13 13
          moveToRelative(dx = 13.0f, dy = 13.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.82
          horizontalLineToRelative(dx = 2.82f)
          // A 3 3 0 0 1 21 25
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 25.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // a 3 3 0 0 1 -2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = -2.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
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
      .also { _tram = it }
  }

@Suppress("ObjectPropertyName")
private var _tram: ImageVector? = null
