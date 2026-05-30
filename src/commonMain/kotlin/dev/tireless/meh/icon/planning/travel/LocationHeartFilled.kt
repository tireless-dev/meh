// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationHeartFilled: ImageVector
  get() {
    val current = _locationHeartFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LocationHeartFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18.3 9 a2.7 2.7 0 0 0 -1.9 .8 L16 10.22 l-.4 -.4 a2.66 2.66 0 0 0 -3.81 0 2.8 2.8 0 0 0 0 3.9 L16 18 l4.21 -4.3 a2.8 2.8 0 0 0 0 -3.9 2.7 2.7 0 0 0 -1.9 -.8
        path {
          // M 18.3 9
          moveTo(x = 18.3f, y = 9.0f)
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
          // L 16 10.22
          lineTo(x = 16.0f, y = 10.22f)
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
          // L 16 18
          lineTo(x = 16.0f, y = 18.0f)
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
        // M16 2 A11 11 0 0 0 5 13 a11 11 0 0 0 2.22 6.6 s.3 .4 .34 .45 L16 30 l8.44 -9.95 .34 -.45 A11 11 0 0 0 27 13 11 11 0 0 0 16 2 m4.21 11.7 -4.2 4.3 -4.22 -4.3 a2.8 2.8 0 0 1 0 -3.9 2.66 2.66 0 0 1 3.81 0 l.4 .41 .4 -.4 a2.66 2.66 0 0 1 3.81 0 2.8 2.8 0 0 1 0 3.9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // A 11 11 0 0 0 5 13
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 13.0f,
          )
          // a 11 11 0 0 0 2.22 6.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.22f,
            dy1 = 6.6f,
          )
          // s 0.3 0.4 0.34 0.45
          reflectiveCurveToRelative(
            dx1 = 0.3f,
            dy1 = 0.4f,
            dx2 = 0.34f,
            dy2 = 0.45f,
          )
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // l 8.44 -9.95
          lineToRelative(dx = 8.44f, dy = -9.95f)
          // l 0.34 -0.45
          lineToRelative(dx = 0.34f, dy = -0.45f)
          // A 11 11 0 0 0 27 13
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 13.0f,
          )
          // A 11 11 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 4.21 11.7
          moveToRelative(dx = 4.21f, dy = 11.7f)
          // l -4.2 4.3
          lineToRelative(dx = -4.2f, dy = 4.3f)
          // l -4.22 -4.3
          lineToRelative(dx = -4.22f, dy = -4.3f)
          // a 2.8 2.8 0 0 1 0 -3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.9f,
          )
          // a 2.66 2.66 0 0 1 3.81 0
          arcToRelative(
            a = 2.66f,
            b = 2.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.81f,
            dy1 = 0.0f,
          )
          // l 0.4 0.41
          lineToRelative(dx = 0.4f, dy = 0.41f)
          // l 0.4 -0.4
          lineToRelative(dx = 0.4f, dy = -0.4f)
          // a 2.66 2.66 0 0 1 3.81 0
          arcToRelative(
            a = 2.66f,
            b = 2.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.81f,
            dy1 = 0.0f,
          )
          // a 2.8 2.8 0 0 1 0 3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.9f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _locationHeartFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _locationHeartFilled: ImageVector? = null
