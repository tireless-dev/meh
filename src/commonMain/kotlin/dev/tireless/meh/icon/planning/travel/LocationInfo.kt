// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationInfo: ImageVector
  get() {
    val current = _locationInfo
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LocationInfo",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 18.0 17.0 11.0 13.0 11.0 13.0 13.0 15.0 13.0 15.0 18.0 12.0 18.0 12.0 20.0 20.0 20.0 20.0 18.0 17.0 18.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 17 18
          moveTo(x = 17.0f, y = 18.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 13 13
          lineTo(x = 13.0f, y = 13.0f)
          // L 15 13
          lineTo(x = 15.0f, y = 13.0f)
          // L 15 18
          lineTo(x = 15.0f, y = 18.0f)
          // L 12 18
          lineTo(x = 12.0f, y = 18.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 20 20
          lineTo(x = 20.0f, y = 20.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 17 18z
          lineTo(x = 17.0f, y = 18.0f)
          close()
        }
        // M15.5 6 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.5 6
          moveTo(x = 15.5f, y = 6.0f)
          // a 1.5 1.5 0 1 0 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 0 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
        }
        // m16 30 -8.44 -9.95 -.34 -.45 A11.01 11.01 0 0 1 16 2 a11.01 11.01 0 0 1 8.79 17.6 s-.3 .4 -.35 .45z M8.81 18.4 l.29 .37 L16 26.9 l6.91 -8.15 .28 -.37 A9.01 9.01 0 1 0 7 13 a9 9 0 0 0 1.81 5.4
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // l -8.44 -9.95
          lineToRelative(dx = -8.44f, dy = -9.95f)
          // l -0.34 -0.45
          lineToRelative(dx = -0.34f, dy = -0.45f)
          // A 11.01 11.01 0 0 1 16 2
          arcTo(
            horizontalEllipseRadius = 11.01f,
            verticalEllipseRadius = 11.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // a 11.01 11.01 0 0 1 8.79 17.6
          arcToRelative(
            a = 11.01f,
            b = 11.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.79f,
            dy1 = 17.6f,
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
          // A 9.01 9.01 0 1 0 7 13
          arcTo(
            horizontalEllipseRadius = 9.01f,
            verticalEllipseRadius = 9.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 13.0f,
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
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _locationInfo = it }
  }

@Suppress("ObjectPropertyName")
private var _locationInfo: ImageVector? = null
