// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DnsServices: ImageVector
  get() {
    val current = _dnsServices
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DnsServices",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="10" height="2" x="20.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="6" height="2" x="20.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 24
          moveTo(x = 20.0f, y = 24.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // M30 17 v-1 a13.99 13.99 0 1 0 -10.77 13.63 l-.46 -1.95 A12 12 0 0 1 16 28 q-.28 0 -.56 -.03 A20.3 20.3 0 0 1 12.03 17Z m-2.04 -2 h-5.98 A24 24 0 0 0 19.2 4.44 12 12 0 0 1 27.96 15 M16.56 4.03 A20.3 20.3 0 0 1 19.97 15 h-7.94 a20.3 20.3 0 0 1 3.4 -10.97 L16 4 q.29 0 .56 .03 M12.8 4.44 A24 24 0 0 0 10.02 15 H4.04 A12 12 0 0 1 12.8 4.44 m0 23.12 A12 12 0 0 1 4.04 17 h5.98 a24 24 0 0 0 2.78 10.56
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 17
          moveTo(x = 30.0f, y = 17.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 13.99 13.99 0 1 0 -10.77 13.63
          arcToRelative(
            a = 13.99f,
            b = 13.99f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -10.77f,
            dy1 = 13.63f,
          )
          // l -0.46 -1.95
          lineToRelative(dx = -0.46f, dy = -1.95f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // q -0.28 0 -0.56 -0.03
          quadToRelative(
            dx1 = -0.28f,
            dy1 = 0.0f,
            dx2 = -0.56f,
            dy2 = -0.03f,
          )
          // A 20.3 20.3 0 0 1 12.03 17z
          arcTo(
            horizontalEllipseRadius = 20.3f,
            verticalEllipseRadius = 20.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.03f,
            y1 = 17.0f,
          )
          close()
          // m -2.04 -2
          moveToRelative(dx = -2.04f, dy = -2.0f)
          // h -5.98
          horizontalLineToRelative(dx = -5.98f)
          // A 24 24 0 0 0 19.2 4.44
          arcTo(
            horizontalEllipseRadius = 24.0f,
            verticalEllipseRadius = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.2f,
            y1 = 4.44f,
          )
          // A 12 12 0 0 1 27.96 15
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.96f,
            y1 = 15.0f,
          )
          // M 16.56 4.03
          moveTo(x = 16.56f, y = 4.03f)
          // A 20.3 20.3 0 0 1 19.97 15
          arcTo(
            horizontalEllipseRadius = 20.3f,
            verticalEllipseRadius = 20.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.97f,
            y1 = 15.0f,
          )
          // h -7.94
          horizontalLineToRelative(dx = -7.94f)
          // a 20.3 20.3 0 0 1 3.4 -10.97
          arcToRelative(
            a = 20.3f,
            b = 20.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.4f,
            dy1 = -10.97f,
          )
          // L 16 4
          lineTo(x = 16.0f, y = 4.0f)
          // q 0.29 0 0.56 0.03
          quadToRelative(
            dx1 = 0.29f,
            dy1 = 0.0f,
            dx2 = 0.56f,
            dy2 = 0.03f,
          )
          // M 12.8 4.44
          moveTo(x = 12.8f, y = 4.44f)
          // A 24 24 0 0 0 10.02 15
          arcTo(
            horizontalEllipseRadius = 24.0f,
            verticalEllipseRadius = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.02f,
            y1 = 15.0f,
          )
          // H 4.04
          horizontalLineTo(x = 4.04f)
          // A 12 12 0 0 1 12.8 4.44
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.8f,
            y1 = 4.44f,
          )
          // m 0 23.12
          moveToRelative(dx = 0.0f, dy = 23.12f)
          // A 12 12 0 0 1 4.04 17
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.04f,
            y1 = 17.0f,
          )
          // h 5.98
          horizontalLineToRelative(dx = 5.98f)
          // a 24 24 0 0 0 2.78 10.56
          arcToRelative(
            a = 24.0f,
            b = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.78f,
            dy1 = 10.56f,
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
      .also { _dnsServices = it }
  }

@Suppress("ObjectPropertyName")
private var _dnsServices: ImageVector? = null
