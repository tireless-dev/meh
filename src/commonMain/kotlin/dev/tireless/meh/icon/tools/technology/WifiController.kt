// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WifiController: ImageVector
  get() {
    val current = _wifiController
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WifiController",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M6 30 h20 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 m0 -8 h20 v6 H6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 30
          moveTo(x = 6.0f, y = 30.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
        }
        // <circle cx="9.0" cy="25.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 25
          moveTo(x = 9.0f, y = 25.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="16.0" cy="14.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 14.5
          moveTo(x = 16.0f, y = 14.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M10.78 10.33 a7 7 0 0 1 10.44 0 l-1.5 1.34 a5 5 0 0 0 -7.45 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.78 10.33
          moveTo(x = 10.78f, y = 10.33f)
          // a 7 7 0 0 1 10.44 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.44f,
            dy1 = 0.0f,
          )
          // l -1.5 1.34
          lineToRelative(dx = -1.5f, dy = 1.34f)
          // a 5 5 0 0 0 -7.45 0z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.45f,
            dy1 = 0.0f,
          )
          close()
        }
        // M7.2 7.4 a11 11 0 0 1 17.6 0 l-1.6 1.2 a9 9 0 0 0 -14.4 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.2 7.4
          moveTo(x = 7.2f, y = 7.4f)
          // a 11 11 0 0 1 17.6 0
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.6f,
            dy1 = 0.0f,
          )
          // l -1.6 1.2
          lineToRelative(dx = -1.6f, dy = 1.2f)
          // a 9 9 0 0 0 -14.4 0z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -14.4f,
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
      .also { _wifiController = it }
  }

@Suppress("ObjectPropertyName")
private var _wifiController: ImageVector? = null
