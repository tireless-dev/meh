// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HazeNight: ImageVector
  get() {
    val current = _hazeNight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HazeNight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 22 H13 a1 1 0 0 0 0 2 h9.68 a11 11 0 0 1 -7.56 3 H14.7 A11.1 11.1 0 0 1 11.5 5.4 15 15 0 0 0 11.45 12 h2.05 a13 13 0 0 1 .39 -7.62 A1 1 0 0 0 12.98 3 l-.17 .02 A13.1 13.1 0 0 0 14.63 29 h.5 a13 13 0 0 0 10.25 -5 H29 a1 1 0 0 0 0 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 22
          moveTo(x = 29.0f, y = 22.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // a 1 1 0 0 0 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 9.68
          horizontalLineToRelative(dx = 9.68f)
          // a 11 11 0 0 1 -7.56 3
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.56f,
            dy1 = 3.0f,
          )
          // H 14.7
          horizontalLineTo(x = 14.7f)
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
          // A 15 15 0 0 0 11.45 12
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.45f,
            y1 = 12.0f,
          )
          // h 2.05
          horizontalLineToRelative(dx = 2.05f)
          // a 13 13 0 0 1 0.39 -7.62
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.39f,
            dy1 = -7.62f,
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
          // a 13 13 0 0 0 10.25 -5
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.25f,
            dy1 = -5.0f,
          )
          // H 29
          horizontalLineTo(x = 29.0f)
          // a 1 1 0 0 0 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
        }
        // M27 20 H17 a1 1 0 0 1 0 -2 h10 a1 1 0 0 1 0 2 m-2 -4 H13 a1 1 0 0 1 0 -2 h12 a1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 20
          moveTo(x = 27.0f, y = 20.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m -2 -4
          moveToRelative(dx = -2.0f, dy = -4.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
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
      .also { _hazeNight = it }
  }

@Suppress("ObjectPropertyName")
private var _hazeNight: ImageVector? = null
