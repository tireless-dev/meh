// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScreenMap: ImageVector
  get() {
    val current = _screenMap
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScreenMap",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="22.0" y="25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 25
          moveTo(x = 22.0f, y = 25.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="8" height="2" x="22.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 21
          moveTo(x = 22.0f, y = 21.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <polygon points="18.4141 11.0 23.0 11.0 23.0 9.0 15.0 9.0 15.0 17.0 17.0 17.0 17.0 12.4141 23.5859 19.0 25.0 17.5859 18.4141 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.4141 11
          moveTo(x = 18.4141f, y = 11.0f)
          // L 23 11
          lineTo(x = 23.0f, y = 11.0f)
          // L 23 9
          lineTo(x = 23.0f, y = 9.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // L 17 17
          lineTo(x = 17.0f, y = 17.0f)
          // L 17 12.4141
          lineTo(x = 17.0f, y = 12.4141f)
          // L 23.5859 19
          lineTo(x = 23.5859f, y = 19.0f)
          // L 25 17.5859
          lineTo(x = 25.0f, y = 17.5859f)
          // L 18.4141 11z
          lineTo(x = 18.4141f, y = 11.0f)
          close()
        }
        // M28 3 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8 v4 H8 v2 h12 v-8 H4 V5 h24 v14 h2 V5 a2 2 0 0 0 -2 -2 M18 27 h-4 v-4 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 3
          moveTo(x = 28.0f, y = 3.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
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
          // M 18 27
          moveTo(x = 18.0f, y = 27.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _screenMap = it }
  }

@Suppress("ObjectPropertyName")
private var _screenMap: ImageVector? = null
