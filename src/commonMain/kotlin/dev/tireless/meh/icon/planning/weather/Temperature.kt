// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Temperature: ImageVector
  get() {
    val current = _temperature
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Temperature",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 17.26 V6 a4 4 0 0 0 -8 0 v11.26 a7 7 0 1 0 8 0 M9 4 a2 2 0 0 1 2 2 v7 H7 V6 a2 2 0 0 1 2 -2 m0 24 a5 5 0 0 1 -2.5 -9.33 L7 18.39 V15 h4 v3.39 l.5 .28 A5 5 0 0 1 9 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 17.26
          moveTo(x = 13.0f, y = 17.26f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 11.26
          verticalLineToRelative(dy = 11.26f)
          // a 7 7 0 1 0 8 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m 0 24
          moveToRelative(dx = 0.0f, dy = 24.0f)
          // a 5 5 0 0 1 -2.5 -9.33
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.5f,
            dy1 = -9.33f,
          )
          // L 7 18.39
          lineTo(x = 7.0f, y = 18.39f)
          // V 15
          verticalLineTo(y = 15.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3.39
          verticalLineToRelative(dy = 3.39f)
          // l 0.5 0.28
          lineToRelative(dx = 0.5f, dy = 0.28f)
          // A 5 5 0 0 1 9 28
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 28.0f,
          )
        }
        // <rect width="10" height="2" x="20.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 4
          moveTo(x = 20.0f, y = 4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="7" height="2" x="20.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="10" height="2" x="20.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="7" height="2" x="20.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
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
      .also { _temperature = it }
  }

@Suppress("ObjectPropertyName")
private var _temperature: ImageVector? = null
