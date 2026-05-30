// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Network3: ImageVector
  get() {
    val current = _network3
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Network3",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 30 h-8 v-8 h8Z m-6 -2 h4 v-4 h-4Z m-4 -1 H8 a6 6 0 0 1 0 -12 h2 v2 H8 a4 4 0 0 0 0 8 h12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -4 -1
          moveToRelative(dx = -4.0f, dy = -1.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 6 6 0 0 1 0 -12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -12.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 4 4 0 0 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // M20 20 h-8 v-8 h8Z m-6 -2 h4 v-4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M24 17 h-2 v-2 h2 a4 4 0 0 0 0 -8 H12 V5 h12 a6 6 0 0 1 0 12 m-14 -7 H2 V2 h8Z M4 8 h4 V4 H4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 17
          moveTo(x = 24.0f, y = 17.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 6 6 0 0 1 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // m -14 -7
          moveToRelative(dx = -14.0f, dy = -7.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _network3 = it }
  }

@Suppress("ObjectPropertyName")
private var _network3: ImageVector? = null
