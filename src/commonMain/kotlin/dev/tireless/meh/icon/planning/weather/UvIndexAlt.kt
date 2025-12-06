// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UvIndexAlt: ImageVector
  get() {
    val current = _uvIndexAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UvIndexAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 30 H9 a2 2 0 0 1 -2 -2 v-8 h2 v8 h4 v-8 h2 v8 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 30
          moveTo(x = 13.0f, y = 30.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
        // <polygon points="25.0 20.0 23.25 20.0 21.0 29.031 18.792 20.0 17.0 20.0 19.5 30.0 22.5 30.0 25.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 20
          moveTo(x = 25.0f, y = 20.0f)
          // L 23.25 20
          lineTo(x = 23.25f, y = 20.0f)
          // L 21 29.031
          lineTo(x = 21.0f, y = 29.031f)
          // L 18.792 20
          lineTo(x = 18.792f, y = 20.0f)
          // L 17 20
          lineTo(x = 17.0f, y = 20.0f)
          // L 19.5 30
          lineTo(x = 19.5f, y = 30.0f)
          // L 22.5 30
          lineTo(x = 22.5f, y = 30.0f)
          // L 25 20z
          lineTo(x = 25.0f, y = 20.0f)
          close()
        }
        // <rect width="2" height="5" x="15.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 2
          moveTo(x = 15.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="5" height="2" x="21.668" y="6.854" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.687681 8.899519
          moveTo(x = 21.687681f, y = 8.899519f)
          // l 3.535534 -3.535534
          lineToRelative(dx = 3.535534f, dy = -3.535534f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -3.535534 3.535534z
          lineToRelative(dx = -3.535534f, dy = 3.535534f)
          close()
        }
        // <rect width="5" height="2" x="25.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 15
          moveTo(x = 25.0f, y = 15.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
          close()
        }
        // <rect width="5" height="2" x="2.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 15
          moveTo(x = 2.0f, y = 15.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
          close()
        }
        // <rect width="2" height="5" x="6.854" y="5.375" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.3946834 6.8078966
          moveTo(x = 5.3946834f, y = 6.8078966f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 3.535534 3.535534
          lineToRelative(dx = 3.535534f, dy = 3.535534f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // M22 17 h-2 v-1 a4 4 0 0 0 -8 0 v1 h-2 v-1 a6 6 0 0 1 12 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 17
          moveTo(x = 22.0f, y = 17.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 6 6 0 0 1 12 0z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 12.0f,
            dy1 = 0.0f,
          )
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
      .also { _uvIndexAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _uvIndexAlt: ImageVector? = null
