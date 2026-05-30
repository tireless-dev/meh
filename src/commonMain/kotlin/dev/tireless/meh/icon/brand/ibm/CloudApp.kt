// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudApp: ImageVector
  get() {
    val current = _cloudApp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudApp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.83 13.12 A10 10 0 0 0 16 5 v2 a8 8 0 0 1 7.86 6.5 l.26 1.34 1.35 .24 A5.5 5.5 0 0 1 24.51 26 H16 v2 h8.5 a7.5 7.5 0 0 0 1.33 -14.88
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.83 13.12
          moveTo(x = 25.83f, y = 13.12f)
          // A 10 10 0 0 0 16 5
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 5.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 8 8 0 0 1 7.86 6.5
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.86f,
            dy1 = 6.5f,
          )
          // l 0.26 1.34
          lineToRelative(dx = 0.26f, dy = 1.34f)
          // l 1.35 0.24
          lineToRelative(dx = 1.35f, dy = 0.24f)
          // A 5.5 5.5 0 0 1 24.51 26
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.51f,
            y1 = 26.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8.5
          horizontalLineToRelative(dx = 8.5f)
          // a 7.5 7.5 0 0 0 1.33 -14.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.33f,
            dy1 = -14.88f,
          )
        }
        // <rect width="6" height="2" x="8.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 24
          moveTo(x = 8.0f, y = 24.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="2" height="2" x="4.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="8" height="2" x="6.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 20
          moveTo(x = 6.0f, y = 20.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="2" height="2" x="2.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 20
          moveTo(x = 2.0f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="6" height="2" x="8.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="2" height="2" x="4.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 16
          moveTo(x = 4.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="10.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 12
          moveTo(x = 10.0f, y = 12.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="2" height="2" x="6.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="12.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
      .also { _cloudApp = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudApp: ImageVector? = null
