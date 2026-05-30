// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SolarPanel: ImageVector
  get() {
    val current = _solarPanel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SolarPanel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 26 V14 H13 v12 h5 v2 H2 v2 h28 v-2 h-5 v-2Z m-5 -2 v-3 h3 v3Z m-2 -3 v3 h-3 v-3Z m-3 -2 v-3 h3 v3Z m8 0 h-3 v-3 h3Z m-10 -3 v3 h-3 v-3Z m-3 8 v-3 h3 v3Z m8 4 h-3 v-2 h3Z M9.33 14.98 A4 4 0 1 1 16 12 h-2 a2 2 0 1 0 -3.33 1.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 26
          moveTo(x = 30.0f, y = 26.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -5 -2
          moveToRelative(dx = -5.0f, dy = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
          // m -2 -3
          moveToRelative(dx = -2.0f, dy = -3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -3 -2
          moveToRelative(dx = -3.0f, dy = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
          // m 8 0
          moveToRelative(dx = 8.0f, dy = 0.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // m -10 -3
          moveToRelative(dx = -10.0f, dy = -3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -3 8
          moveToRelative(dx = -3.0f, dy = 8.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
          // m 8 4
          moveToRelative(dx = 8.0f, dy = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // M 9.33 14.98
          moveTo(x = 9.33f, y = 14.98f)
          // A 4 4 0 1 1 16 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 12.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 1 0 -3.33 1.5z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.33f,
            dy1 = 1.5f,
          )
          close()
        }
        // <rect width="2" height="4" x="11.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 2
          moveTo(x = 11.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="4" height="2" x="2.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 11
          moveTo(x = 2.0f, y = 11.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="2" height="4" x="5.343" y="4.343" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.2216797 5.635893
          moveTo(x = 4.2216797f, y = 5.635893f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 2.828427 2.828427
          lineToRelative(dx = 2.828427f, dy = 2.828427f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // <rect width="2" height="4" x="16.657" y="4.343" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.949894 8.464319
          moveTo(x = 16.949894f, y = 8.464319f)
          // l -1.4142137 -1.4142134
          lineToRelative(dx = -1.4142137f, dy = -1.4142134f)
          // l 2.8284268 -2.8284273
          lineToRelative(dx = 2.8284268f, dy = -2.8284273f)
          // l 1.4142137 1.4142134z
          lineToRelative(dx = 1.4142137f, dy = 1.4142134f)
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
      .also { _solarPanel = it }
  }

@Suppress("ObjectPropertyName")
private var _solarPanel: ImageVector? = null
