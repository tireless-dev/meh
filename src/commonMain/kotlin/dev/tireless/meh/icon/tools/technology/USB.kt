// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val USB: ImageVector
  get() {
    val current = _uSB
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.USB",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 15 V6 a2 2 0 0 0 -2 -2 H10 a2 2 0 0 0 -2 2 v9 a2 2 0 0 0 -2 2 v11 h2 V17 h16 v11 h2 V17 a2 2 0 0 0 -2 -2 M10 6 h12 v9 H10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 15
          moveTo(x = 24.0f, y = 15.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
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
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 17
          verticalLineTo(y = 17.0f)
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
          // M 10 6
          moveTo(x = 10.0f, y = 6.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
          close()
        }
        // <rect width="3" height="2" x="12.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // <rect width="3" height="2" x="17.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 10
          moveTo(x = 17.0f, y = 10.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
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
      .also { _uSB = it }
  }

@Suppress("ObjectPropertyName")
private var _uSB: ImageVector? = null
