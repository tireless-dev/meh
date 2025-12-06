// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkOverlay: ImageVector
  get() {
    val current = _networkOverlay
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NetworkOverlay",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 23.0 13.83 23.0 16.41 20.41 15.0 19.0 10.0 24.0 15.0 29.0 16.41 27.59 13.83 25.0 22.0 25.0 22.0 23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 23
          moveTo(x = 22.0f, y = 23.0f)
          // L 13.83 23
          lineTo(x = 13.83f, y = 23.0f)
          // L 16.41 20.41
          lineTo(x = 16.41f, y = 20.41f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 10 24
          lineTo(x = 10.0f, y = 24.0f)
          // L 15 29
          lineTo(x = 15.0f, y = 29.0f)
          // L 16.41 27.59
          lineTo(x = 16.41f, y = 27.59f)
          // L 13.83 25
          lineTo(x = 13.83f, y = 25.0f)
          // L 22 25
          lineTo(x = 22.0f, y = 25.0f)
          // L 22 23z
          lineTo(x = 22.0f, y = 23.0f)
          close()
        }
        // <polygon points="11.0 13.0 19.17 13.0 16.59 10.41 18.0 9.0 23.0 14.0 18.0 19.0 16.59 17.59 19.17 15.0 11.0 15.0 11.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 13
          moveTo(x = 11.0f, y = 13.0f)
          // L 19.17 13
          lineTo(x = 19.17f, y = 13.0f)
          // L 16.59 10.41
          lineTo(x = 16.59f, y = 10.41f)
          // L 18 9
          lineTo(x = 18.0f, y = 9.0f)
          // L 23 14
          lineTo(x = 23.0f, y = 14.0f)
          // L 18 19
          lineTo(x = 18.0f, y = 19.0f)
          // L 16.59 17.59
          lineTo(x = 16.59f, y = 17.59f)
          // L 19.17 15
          lineTo(x = 19.17f, y = 15.0f)
          // L 11 15
          lineTo(x = 11.0f, y = 15.0f)
          // L 11 13z
          lineTo(x = 11.0f, y = 13.0f)
          close()
        }
        // M24.5 25 H24 v-2 h.5 a5.5 5.5 0 0 0 .38 -10.98 l-.84 -.06 -.09 -.83 a8 8 0 0 0 -15.9 0 l-.1 .83 -.83 .06 A5.5 5.5 0 0 0 7.5 23 H8 v2 H7.5 a7.5 7.5 0 0 1 -1.32 -14.88 10 10 0 0 1 19.64 0 A7.5 7.5 0 0 1 24.5 25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.5 25
          moveTo(x = 24.5f, y = 25.0f)
          // H 24
          horizontalLineTo(x = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 5.5 5.5 0 0 0 0.38 -10.98
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.38f,
            dy1 = -10.98f,
          )
          // l -0.84 -0.06
          lineToRelative(dx = -0.84f, dy = -0.06f)
          // l -0.09 -0.83
          lineToRelative(dx = -0.09f, dy = -0.83f)
          // a 8 8 0 0 0 -15.9 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -15.9f,
            dy1 = 0.0f,
          )
          // l -0.1 0.83
          lineToRelative(dx = -0.1f, dy = 0.83f)
          // l -0.83 0.06
          lineToRelative(dx = -0.83f, dy = 0.06f)
          // A 5.5 5.5 0 0 0 7.5 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 23.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
          // a 7.5 7.5 0 0 1 -1.32 -14.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.32f,
            dy1 = -14.88f,
          )
          // a 10 10 0 0 1 19.64 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 19.64f,
            dy1 = 0.0f,
          )
          // A 7.5 7.5 0 0 1 24.5 25
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.5f,
            y1 = 25.0f,
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
      .also { _networkOverlay = it }
  }

@Suppress("ObjectPropertyName")
private var _networkOverlay: ImageVector? = null
