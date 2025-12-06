// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataError: ImageVector
  get() {
    val current = _dataError
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataError",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="11.0" cy="8.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 8
          moveTo(x = 11.0f, y = 8.0f)
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
        // <circle cx="11.0" cy="16.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
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
        // <circle cx="11.0" cy="24.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 24
          moveTo(x = 11.0f, y = 24.0f)
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
        // M24 3 H8 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h10 v-2 H8 v-6 h18 V5 a2 2 0 0 0 -2 -2 m0 16 H8 v-6 h16Z m0 -8 H8 V5 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 3
          moveTo(x = 24.0f, y = 3.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // m 0 16
          moveToRelative(dx = 0.0f, dy = 16.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
        }
        // <polygon points="29.0 24.415 27.586 23.0 25.0 25.587 22.414 23.0 21.0 24.415 23.586 27.0 21.0 29.586 22.414 31.0 25.0 28.414 27.586 31.0 29.0 29.586 26.414 27.0 29.0 24.415" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 24.415
          moveTo(x = 29.0f, y = 24.415f)
          // L 27.586 23
          lineTo(x = 27.586f, y = 23.0f)
          // L 25 25.587
          lineTo(x = 25.0f, y = 25.587f)
          // L 22.414 23
          lineTo(x = 22.414f, y = 23.0f)
          // L 21 24.415
          lineTo(x = 21.0f, y = 24.415f)
          // L 23.586 27
          lineTo(x = 23.586f, y = 27.0f)
          // L 21 29.586
          lineTo(x = 21.0f, y = 29.586f)
          // L 22.414 31
          lineTo(x = 22.414f, y = 31.0f)
          // L 25 28.414
          lineTo(x = 25.0f, y = 28.414f)
          // L 27.586 31
          lineTo(x = 27.586f, y = 31.0f)
          // L 29 29.586
          lineTo(x = 29.0f, y = 29.586f)
          // L 26.414 27
          lineTo(x = 26.414f, y = 27.0f)
          // L 29 24.415z
          lineTo(x = 29.0f, y = 24.415f)
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
      .also { _dataError = it }
  }

@Suppress("ObjectPropertyName")
private var _dataError: ImageVector? = null
