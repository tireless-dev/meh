// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZIP: ImageVector
  get() {
    val current = _zIP
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ZIP",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 9 h-6 v14 h2 v-5 h4 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m0 7 h-4 v-5 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // m 0 7
          moveToRelative(dx = 0.0f, dy = 7.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // <polygon points="12.0 9.0 12.0 11.0 15.0 11.0 15.0 21.0 12.0 21.0 12.0 23.0 20.0 23.0 20.0 21.0 17.0 21.0 17.0 11.0 20.0 11.0 20.0 9.0 12.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 9
          moveTo(x = 12.0f, y = 9.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 12 9z
          lineTo(x = 12.0f, y = 9.0f)
          close()
        }
        // <polygon points="10.0 9.0 2.0 9.0 2.0 11.0 8.0 11.0 2.0 21.0 2.0 23.0 10.0 23.0 10.0 21.0 4.0 21.0 10.0 11.0 10.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 9
          moveTo(x = 10.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 2 11
          lineTo(x = 2.0f, y = 11.0f)
          // L 8 11
          lineTo(x = 8.0f, y = 11.0f)
          // L 2 21
          lineTo(x = 2.0f, y = 21.0f)
          // L 2 23
          lineTo(x = 2.0f, y = 23.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 10 21
          lineTo(x = 10.0f, y = 21.0f)
          // L 4 21
          lineTo(x = 4.0f, y = 21.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 10 9z
          lineTo(x = 10.0f, y = 9.0f)
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
      .also { _zIP = it }
  }

@Suppress("ObjectPropertyName")
private var _zIP: ImageVector? = null
