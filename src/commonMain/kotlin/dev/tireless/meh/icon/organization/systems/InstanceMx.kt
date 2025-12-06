// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InstanceMx: ImageVector
  get() {
    val current = _instanceMx
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InstanceMx",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 5.0 20.0 5.0 18.0 8.897 16.0 5.0 14.0 5.0 16.905 10.0 14.0 15.0 16.0 15.0 18.0 11.201 20.0 15.0 22.0 15.0 19.098 10.0 22.0 5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 5
          moveTo(x = 22.0f, y = 5.0f)
          // L 20 5
          lineTo(x = 20.0f, y = 5.0f)
          // L 18 8.897
          lineTo(x = 18.0f, y = 8.897f)
          // L 16 5
          lineTo(x = 16.0f, y = 5.0f)
          // L 14 5
          lineTo(x = 14.0f, y = 5.0f)
          // L 16.905 10
          lineTo(x = 16.905f, y = 10.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 16 15
          lineTo(x = 16.0f, y = 15.0f)
          // L 18 11.201
          lineTo(x = 18.0f, y = 11.201f)
          // L 20 15
          lineTo(x = 20.0f, y = 15.0f)
          // L 22 15
          lineTo(x = 22.0f, y = 15.0f)
          // L 19.098 10
          lineTo(x = 19.098f, y = 10.0f)
          // L 22 5z
          lineTo(x = 22.0f, y = 5.0f)
          close()
        }
        // <polygon points="10.0 2.0 8.485 6.374 8.0 8.0 7.535 6.374 6.0 2.0 4.0 2.0 4.0 15.0 6.0 15.0 6.0 7.374 5.841 5.378 6.421 7.374 8.0 12.0 9.579 7.374 10.159 5.374 10.0 7.374 10.0 15.0 12.0 15.0 12.0 2.0 10.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 2
          moveTo(x = 10.0f, y = 2.0f)
          // L 8.485 6.374
          lineTo(x = 8.485f, y = 6.374f)
          // L 8 8
          lineTo(x = 8.0f, y = 8.0f)
          // L 7.535 6.374
          lineTo(x = 7.535f, y = 6.374f)
          // L 6 2
          lineTo(x = 6.0f, y = 2.0f)
          // L 4 2
          lineTo(x = 4.0f, y = 2.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 6 15
          lineTo(x = 6.0f, y = 15.0f)
          // L 6 7.374
          lineTo(x = 6.0f, y = 7.374f)
          // L 5.841 5.378
          lineTo(x = 5.841f, y = 5.378f)
          // L 6.421 7.374
          lineTo(x = 6.421f, y = 7.374f)
          // L 8 12
          lineTo(x = 8.0f, y = 12.0f)
          // L 9.579 7.374
          lineTo(x = 9.579f, y = 7.374f)
          // L 10.159 5.374
          lineTo(x = 10.159f, y = 5.374f)
          // L 10 7.374
          lineTo(x = 10.0f, y = 7.374f)
          // L 10 15
          lineTo(x = 10.0f, y = 15.0f)
          // L 12 15
          lineTo(x = 12.0f, y = 15.0f)
          // L 12 2
          lineTo(x = 12.0f, y = 2.0f)
          // L 10 2z
          lineTo(x = 10.0f, y = 2.0f)
          close()
        }
        // <circle cx="9.0" cy="27.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 27
          moveTo(x = 9.0f, y = 27.0f)
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
        // <rect width="4" height="2" x="2.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 18
          moveTo(x = 2.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="8.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="14.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 18
          moveTo(x = 14.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="20.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 18
          moveTo(x = 20.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="26.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M26 31 H6 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M6 25 v4 h20 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 31
          moveTo(x = 26.0f, y = 31.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // M 6 25
          moveTo(x = 6.0f, y = 25.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
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
      .also { _instanceMx = it }
  }

@Suppress("ObjectPropertyName")
private var _instanceMx: ImageVector? = null
