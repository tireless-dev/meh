// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Logout: ImageVector
  get() {
    val current = _logout
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Logout",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M6 30 h12 a2 2 0 0 0 2 -2 v-3 h-2 v3 H6 V4 h12 v3 h2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 30
          moveTo(x = 6.0f, y = 30.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
        }
        // <polygon points="20.586 20.586 24.172 17.0 10.0 17.0 10.0 15.0 24.172 15.0 20.586 11.414 22.0 10.0 28.0 16.0 22.0 22.0 20.586 20.586" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.586 20.586
          moveTo(x = 20.586f, y = 20.586f)
          // L 24.172 17
          lineTo(x = 24.172f, y = 17.0f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 10 15
          lineTo(x = 10.0f, y = 15.0f)
          // L 24.172 15
          lineTo(x = 24.172f, y = 15.0f)
          // L 20.586 11.414
          lineTo(x = 20.586f, y = 11.414f)
          // L 22 10
          lineTo(x = 22.0f, y = 10.0f)
          // L 28 16
          lineTo(x = 28.0f, y = 16.0f)
          // L 22 22
          lineTo(x = 22.0f, y = 22.0f)
          // L 20.586 20.586z
          lineTo(x = 20.586f, y = 20.586f)
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
      .also { _logout = it }
  }

@Suppress("ObjectPropertyName")
private var _logout: ImageVector? = null
