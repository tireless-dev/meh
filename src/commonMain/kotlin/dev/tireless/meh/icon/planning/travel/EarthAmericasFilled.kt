// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthAmericasFilled: ImageVector
  get() {
    val current = _earthAmericasFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EarthAmericasFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M4 16 a12 12 0 0 1 .7 -4 H10 l5 4 -2.8 3.7 a1 1 0 0 0 .1 1.3 l2.7 3 v3.95 A12 12 0 0 1 4 16 m17.43 10.68 2.55 -7.7 A1 1 0 0 0 23.61 18 L15 11 l2 -2 h5.28 a1 1 0 0 0 .95 -.68 l.5 -1.49 a11.97 11.97 0 0 1 -2.3 19.86
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
          // M 4 16
          moveTo(x = 4.0f, y = 16.0f)
          // a 12 12 0 0 1 0.7 -4
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.7f,
            dy1 = -4.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // l 5 4
          lineToRelative(dx = 5.0f, dy = 4.0f)
          // l -2.8 3.7
          lineToRelative(dx = -2.8f, dy = 3.7f)
          // a 1 1 0 0 0 0.1 1.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = 1.3f,
          )
          // l 2.7 3
          lineToRelative(dx = 2.7f, dy = 3.0f)
          // v 3.95
          verticalLineToRelative(dy = 3.95f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // m 17.43 10.68
          moveToRelative(dx = 17.43f, dy = 10.68f)
          // l 2.55 -7.7
          lineToRelative(dx = 2.55f, dy = -7.7f)
          // A 1 1 0 0 0 23.61 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.61f,
            y1 = 18.0f,
          )
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // h 5.28
          horizontalLineToRelative(dx = 5.28f)
          // a 1 1 0 0 0 0.95 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.95f,
            dy1 = -0.68f,
          )
          // l 0.5 -1.49
          lineToRelative(dx = 0.5f, dy = -1.49f)
          // a 11.97 11.97 0 0 1 -2.3 19.86
          arcToRelative(
            a = 11.97f,
            b = 11.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.3f,
            dy1 = 19.86f,
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
      .also { _earthAmericasFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _earthAmericasFilled: ImageVector? = null
