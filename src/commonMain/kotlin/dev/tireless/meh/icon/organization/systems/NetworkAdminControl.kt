// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkAdminControl: ImageVector
  get() {
    val current = _networkAdminControl
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NetworkAdminControl",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="27.0 20.415 25.586 19.0 23.0 21.587 20.414 19.0 19.0 20.415 21.586 23.0 19.0 25.586 20.414 27.0 23.0 24.414 25.586 27.0 27.0 25.586 24.414 23.0 27.0 20.415" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 20.415
          moveTo(x = 27.0f, y = 20.415f)
          // L 25.586 19
          lineTo(x = 25.586f, y = 19.0f)
          // L 23 21.587
          lineTo(x = 23.0f, y = 21.587f)
          // L 20.414 19
          lineTo(x = 20.414f, y = 19.0f)
          // L 19 20.415
          lineTo(x = 19.0f, y = 20.415f)
          // L 21.586 23
          lineTo(x = 21.586f, y = 23.0f)
          // L 19 25.586
          lineTo(x = 19.0f, y = 25.586f)
          // L 20.414 27
          lineTo(x = 20.414f, y = 27.0f)
          // L 23 24.414
          lineTo(x = 23.0f, y = 24.414f)
          // L 25.586 27
          lineTo(x = 25.586f, y = 27.0f)
          // L 27 25.586
          lineTo(x = 27.0f, y = 25.586f)
          // L 24.414 23
          lineTo(x = 24.414f, y = 23.0f)
          // L 27 20.415z
          lineTo(x = 27.0f, y = 20.415f)
          close()
        }
        // M24 4 a4 4 0 0 0 -4 4 4 4 0 0 0 .57 2.02 L10.02 20.57 A4 4 0 0 0 8 20 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2.02 l10.55 -10.55 A4 4 0 0 0 24 12 a4 4 0 0 0 0 -8 M8 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m16 -16 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 4
          moveTo(x = 24.0f, y = 4.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.57f,
            dy1 = 2.02f,
          )
          // L 10.02 20.57
          lineTo(x = 10.02f, y = 20.57f)
          // A 4 4 0 0 0 8 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.0f,
            y1 = 20.0f,
          )
          // a 4 4 0 1 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 -0.57 -2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.57f,
            dy1 = -2.02f,
          )
          // l 10.55 -10.55
          lineToRelative(dx = 10.55f, dy = -10.55f)
          // A 4 4 0 0 0 24 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 12.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // M 8 26
          moveTo(x = 8.0f, y = 26.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 16 -16
          moveToRelative(dx = 16.0f, dy = -16.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // <polygon points="8.0 11.18 5.41 8.59 4.0 10.0 8.0 14.0 15.0 7.0 13.59 5.59 8.0 11.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 11.18
          moveTo(x = 8.0f, y = 11.18f)
          // L 5.41 8.59
          lineTo(x = 5.41f, y = 8.59f)
          // L 4 10
          lineTo(x = 4.0f, y = 10.0f)
          // L 8 14
          lineTo(x = 8.0f, y = 14.0f)
          // L 15 7
          lineTo(x = 15.0f, y = 7.0f)
          // L 13.59 5.59
          lineTo(x = 13.59f, y = 5.59f)
          // L 8 11.18z
          lineTo(x = 8.0f, y = 11.18f)
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
      .also { _networkAdminControl = it }
  }

@Suppress("ObjectPropertyName")
private var _networkAdminControl: ImageVector? = null
