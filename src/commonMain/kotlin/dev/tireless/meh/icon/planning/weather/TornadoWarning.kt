// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TornadoWarning: ImageVector
  get() {
    val current = _tornadoWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TornadoWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="16" height="2" x="2.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 4
          moveTo(x = 2.0f, y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
        // <rect width="12" height="2" x="4.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="2.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 12
          moveTo(x = 2.0f, y = 12.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="10" height="2" x="2.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 16
          moveTo(x = 2.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="8" height="2" x="4.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
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
        // <rect width="4" height="2" x="12.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M23.75 10 h-1.5 V6 h1.5Z M23 11 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
        path {
          // M 23.75 10
          moveTo(x = 23.75f, y = 10.0f)
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 1.5z
          horizontalLineToRelative(dx = 1.5f)
          close()
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
        }
        // M29.91 13.94 23.63 2.37 a.72 .72 0 0 0 -1.26 0 L16.1 13.94 A.72 .72 0 0 0 16.72 15 h12.56 a.72 .72 0 0 0 .63 -1.06 M22.25 6 h1.5 v4 h-1.5Z M23 13 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.91 13.94
          moveTo(x = 29.91f, y = 13.94f)
          // L 23.63 2.37
          lineTo(x = 23.63f, y = 2.37f)
          // a 0.72 0.72 0 0 0 -1.26 0
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.26f,
            dy1 = 0.0f,
          )
          // L 16.1 13.94
          lineTo(x = 16.1f, y = 13.94f)
          // A 0.72 0.72 0 0 0 16.72 15
          arcTo(
            horizontalEllipseRadius = 0.72f,
            verticalEllipseRadius = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.72f,
            y1 = 15.0f,
          )
          // h 12.56
          horizontalLineToRelative(dx = 12.56f)
          // a 0.72 0.72 0 0 0 0.63 -1.06
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.63f,
            dy1 = -1.06f,
          )
          // M 22.25 6
          moveTo(x = 22.25f, y = 6.0f)
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1.5z
          horizontalLineToRelative(dx = -1.5f)
          close()
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
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
      .also { _tornadoWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _tornadoWarning: ImageVector? = null
