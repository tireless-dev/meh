// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartlyCloudyNight: ImageVector
  get() {
    val current = _partlyCloudyNight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PartlyCloudyNight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 19 a5 5 0 0 0 -3.2 -4.66 6.97 6.97 0 0 0 -13.04 -1.44 13 13 0 0 1 .13 -8.52 A1 1 0 0 0 12.98 3 l-.17 .02 A13.1 13.1 0 0 0 14.63 29 h.5 a13 13 0 0 0 10.28 -5.04 A5 5 0 0 0 30 19 m-15.3 8 A11.1 11.1 0 0 1 11.5 5.4 a15 15 0 0 0 .85 9.37 A4.99 4.99 0 0 0 15 24 h7.68 a11 11 0 0 1 -7.56 3z M25 22 H15 a3 3 0 0 1 -.7 -5.9 l.66 -.17 .1 -.67 a5 5 0 0 1 9.88 0 l.1 .67 .66 .16 A3 3 0 0 1 25 22
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 19
          moveTo(x = 30.0f, y = 19.0f)
          // a 5 5 0 0 0 -3.2 -4.66
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.2f,
            dy1 = -4.66f,
          )
          // a 6.97 6.97 0 0 0 -13.04 -1.44
          arcToRelative(
            a = 6.97f,
            b = 6.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -13.04f,
            dy1 = -1.44f,
          )
          // a 13 13 0 0 1 0.13 -8.52
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.13f,
            dy1 = -8.52f,
          )
          // A 1 1 0 0 0 12.98 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.98f,
            y1 = 3.0f,
          )
          // l -0.17 0.02
          lineToRelative(dx = -0.17f, dy = 0.02f)
          // A 13.1 13.1 0 0 0 14.63 29
          arcTo(
            horizontalEllipseRadius = 13.1f,
            verticalEllipseRadius = 13.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.63f,
            y1 = 29.0f,
          )
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 13 13 0 0 0 10.28 -5.04
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.28f,
            dy1 = -5.04f,
          )
          // A 5 5 0 0 0 30 19
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 19.0f,
          )
          // m -15.3 8
          moveToRelative(dx = -15.3f, dy = 8.0f)
          // A 11.1 11.1 0 0 1 11.5 5.4
          arcTo(
            horizontalEllipseRadius = 11.1f,
            verticalEllipseRadius = 11.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.5f,
            y1 = 5.4f,
          )
          // a 15 15 0 0 0 0.85 9.37
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.85f,
            dy1 = 9.37f,
          )
          // A 4.99 4.99 0 0 0 15 24
          arcTo(
            horizontalEllipseRadius = 4.99f,
            verticalEllipseRadius = 4.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 24.0f,
          )
          // h 7.68
          horizontalLineToRelative(dx = 7.68f)
          // a 11 11 0 0 1 -7.56 3z
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.56f,
            dy1 = 3.0f,
          )
          close()
          // M 25 22
          moveTo(x = 25.0f, y = 22.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // a 3 3 0 0 1 -0.7 -5.9
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -5.9f,
          )
          // l 0.66 -0.17
          lineToRelative(dx = 0.66f, dy = -0.17f)
          // l 0.1 -0.67
          lineToRelative(dx = 0.1f, dy = -0.67f)
          // a 5 5 0 0 1 9.88 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.88f,
            dy1 = 0.0f,
          )
          // l 0.1 0.67
          lineToRelative(dx = 0.1f, dy = 0.67f)
          // l 0.66 0.16
          lineToRelative(dx = 0.66f, dy = 0.16f)
          // A 3 3 0 0 1 25 22
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 22.0f,
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
      .also { _partlyCloudyNight = it }
  }

@Suppress("ObjectPropertyName")
private var _partlyCloudyNight: ImageVector? = null
