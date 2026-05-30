// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Login: ImageVector
  get() {
    val current = _login
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Login",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 H14 a2 2 0 0 1 -2 -2 v-3 h2 v3 h12 V4 H14 v3 h-2 V4 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
        // <polygon points="14.59 20.59 18.17 17.0 4.0 17.0 4.0 15.0 18.17 15.0 14.59 11.41 16.0 10.0 22.0 16.0 16.0 22.0 14.59 20.59" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14.59 20.59
          moveTo(x = 14.59f, y = 20.59f)
          // L 18.17 17
          lineTo(x = 18.17f, y = 17.0f)
          // L 4 17
          lineTo(x = 4.0f, y = 17.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 18.17 15
          lineTo(x = 18.17f, y = 15.0f)
          // L 14.59 11.41
          lineTo(x = 14.59f, y = 11.41f)
          // L 16 10
          lineTo(x = 16.0f, y = 10.0f)
          // L 22 16
          lineTo(x = 22.0f, y = 16.0f)
          // L 16 22
          lineTo(x = 16.0f, y = 22.0f)
          // L 14.59 20.59z
          lineTo(x = 14.59f, y = 20.59f)
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
      .also { _login = it }
  }

@Suppress("ObjectPropertyName")
private var _login: ImageVector? = null
