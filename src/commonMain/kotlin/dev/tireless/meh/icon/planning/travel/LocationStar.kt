// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationStar: ImageVector
  get() {
    val current = _locationStar
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LocationStar",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 7.0 17.912 10.667 22.0 11.173 19.0 13.926 19.6 18.0 16.0 15.708 12.4 18.0 13.0 13.926 10.0 11.173 14.2 10.667 16.0 7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // L 17.912 10.667
          lineTo(x = 17.912f, y = 10.667f)
          // L 22 11.173
          lineTo(x = 22.0f, y = 11.173f)
          // L 19 13.926
          lineTo(x = 19.0f, y = 13.926f)
          // L 19.6 18
          lineTo(x = 19.6f, y = 18.0f)
          // L 16 15.708
          lineTo(x = 16.0f, y = 15.708f)
          // L 12.4 18
          lineTo(x = 12.4f, y = 18.0f)
          // L 13 13.926
          lineTo(x = 13.0f, y = 13.926f)
          // L 10 11.173
          lineTo(x = 10.0f, y = 11.173f)
          // L 14.2 10.667
          lineTo(x = 14.2f, y = 10.667f)
          // L 16 7z
          lineTo(x = 16.0f, y = 7.0f)
          close()
        }
        // m16 30 -8.44 -9.95 -.34 -.45 A11 11 0 0 1 5 13 a11 11 0 0 1 22 0 11 11 0 0 1 -2.21 6.6 s-.3 .4 -.35 .45Z M8.81 18.4 l.29 .37 L16 26.9 l6.91 -8.15 .28 -.37 A9 9 0 0 0 25 13 a9 9 0 0 0 -18 0 9 9 0 0 0 1.81 5.4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // l -8.44 -9.95
          lineToRelative(dx = -8.44f, dy = -9.95f)
          // l -0.34 -0.45
          lineToRelative(dx = -0.34f, dy = -0.45f)
          // A 11 11 0 0 1 5 13
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 13.0f,
          )
          // a 11 11 0 0 1 22 0
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 22.0f,
            dy1 = 0.0f,
          )
          // a 11 11 0 0 1 -2.21 6.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.21f,
            dy1 = 6.6f,
          )
          // s -0.3 0.4 -0.35 0.45z
          reflectiveCurveToRelative(
            dx1 = -0.3f,
            dy1 = 0.4f,
            dx2 = -0.35f,
            dy2 = 0.45f,
          )
          close()
          // M 8.81 18.4
          moveTo(x = 8.81f, y = 18.4f)
          // l 0.29 0.37
          lineToRelative(dx = 0.29f, dy = 0.37f)
          // L 16 26.9
          lineTo(x = 16.0f, y = 26.9f)
          // l 6.91 -8.15
          lineToRelative(dx = 6.91f, dy = -8.15f)
          // l 0.28 -0.37
          lineToRelative(dx = 0.28f, dy = -0.37f)
          // A 9 9 0 0 0 25 13
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 13.0f,
          )
          // a 9 9 0 0 0 -18 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -18.0f,
            dy1 = 0.0f,
          )
          // a 9 9 0 0 0 1.81 5.4
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.81f,
            dy1 = 5.4f,
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
      .also { _locationStar = it }
  }

@Suppress("ObjectPropertyName")
private var _locationStar: ImageVector? = null
