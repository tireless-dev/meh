// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkEnterprise: ImageVector
  get() {
    val current = _networkEnterprise
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NetworkEnterprise",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.8 10 a10 10 0 0 0 -19.62 .12 A7.5 7.5 0 0 0 7.5 25 H8 v-2 H7.5 a5.5 5.5 0 0 1 -.38 -10.98 l.84 -.06 .09 -.83 A8 8 0 0 1 23.74 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.8 10
          moveTo(x = 25.8f, y = 10.0f)
          // a 10 10 0 0 0 -19.62 0.12
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -19.62f,
            dy1 = 0.12f,
          )
          // A 7.5 7.5 0 0 0 7.5 25
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 25.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
          // a 5.5 5.5 0 0 1 -0.38 -10.98
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.38f,
            dy1 = -10.98f,
          )
          // l 0.84 -0.06
          lineToRelative(dx = 0.84f, dy = -0.06f)
          // l 0.09 -0.83
          lineToRelative(dx = 0.09f, dy = -0.83f)
          // A 8 8 0 0 1 23.74 10z
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.74f,
            y1 = 10.0f,
          )
          close()
        }
        // M28 12 H18 a2 2 0 0 0 -2 2 v4 h-4 a2 2 0 0 0 -2 2 v10 h20 V14 a2 2 0 0 0 -2 -2 M12 28 v-8 h4 v8Z m16 0 H18 V14 h10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 14
          verticalLineTo(y = 14.0f)
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
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 8z
          verticalLineToRelative(dy = 8.0f)
          close()
          // m 16 0
          moveToRelative(dx = 16.0f, dy = 0.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
        }
        // <rect width="2" height="4" x="20.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="24.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 16
          moveTo(x = 24.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="20.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="24.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 22
          moveTo(x = 24.0f, y = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _networkEnterprise = it }
  }

@Suppress("ObjectPropertyName")
private var _networkEnterprise: ImageVector? = null
