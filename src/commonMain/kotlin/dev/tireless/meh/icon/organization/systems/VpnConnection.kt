// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VpnConnection: ImageVector
  get() {
    val current = _vpnConnection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VpnConnection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 7 a2 2 0 0 0 -1.72 1 H22 a6 6 0 0 0 -12 0 H5.72 a2 2 0 1 0 0 2 H10 v4 H8 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V16 a2 2 0 0 0 -2 -2 h-2 v-4 h4.28 A2 2 0 1 0 28 7 M12 8 a4 4 0 0 1 8 0 v6 h-8 v-4 h5 V8Z m12 8 v12 H8 V16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 7
          moveTo(x = 28.0f, y = 7.0f)
          // a 2 2 0 0 0 -1.72 1
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.72f,
            dy1 = 1.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // a 6 6 0 0 0 -12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // H 5.72
          horizontalLineTo(x = 5.72f)
          // a 2 2 0 1 0 0 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4.28
          horizontalLineToRelative(dx = 4.28f)
          // A 2 2 0 1 0 28 7
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 7.0f,
          )
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // a 4 4 0 0 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
          close()
          // m 12 8
          moveToRelative(dx = 12.0f, dy = 8.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 16z
          verticalLineTo(y = 16.0f)
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
      .also { _vpnConnection = it }
  }

@Suppress("ObjectPropertyName")
private var _vpnConnection: ImageVector? = null
