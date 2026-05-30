// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScreenMapSet: ImageVector
  get() {
    val current = _screenMapSet
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScreenMapSet",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="7" height="2" x="24.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 26
          moveTo(x = 24.0f, y = 26.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="7" height="2" x="24.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 22
          moveTo(x = 24.0f, y = 22.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <polygon points="20.4141 12.0 25.0 12.0 25.0 10.0 17.0 10.0 17.0 18.0 19.0 18.0 19.0 13.4141 25.5859 20.0 27.0 18.5859 20.4141 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.4141 12
          moveTo(x = 20.4141f, y = 12.0f)
          // L 25 12
          lineTo(x = 25.0f, y = 12.0f)
          // L 25 10
          lineTo(x = 25.0f, y = 10.0f)
          // L 17 10
          lineTo(x = 17.0f, y = 10.0f)
          // L 17 18
          lineTo(x = 17.0f, y = 18.0f)
          // L 19 18
          lineTo(x = 19.0f, y = 18.0f)
          // L 19 13.4141
          lineTo(x = 19.0f, y = 13.4141f)
          // L 25.5859 20
          lineTo(x = 25.5859f, y = 20.0f)
          // L 27 18.5859
          lineTo(x = 27.0f, y = 18.5859f)
          // L 20.4141 12z
          lineTo(x = 20.4141f, y = 12.0f)
          close()
        }
        // M7 7 h22 v12 h2 V7 a2 2 0 0 0 -2 -2 H7 a2 2 0 0 0 -2 2 v15 a2 2 0 0 0 2 2 h7 v4 h-4 v2 h12 v-8 H7z m13 21 h-4 v-4 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 7
          moveTo(x = 7.0f, y = 7.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 7
          verticalLineTo(y = 7.0f)
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
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // v 15
          verticalLineToRelative(dy = 15.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 7z
          horizontalLineTo(x = 7.0f)
          close()
          // m 13 21
          moveToRelative(dx = 13.0f, dy = 21.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M26 3 V1 H3 a2 2 0 0 0 -2 2 v15 h2 V3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 3
          moveTo(x = 26.0f, y = 3.0f)
          // V 1
          verticalLineTo(y = 1.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 3z
          verticalLineTo(y = 3.0f)
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
      .also { _screenMapSet = it }
  }

@Suppress("ObjectPropertyName")
private var _screenMapSet: ImageVector? = null
