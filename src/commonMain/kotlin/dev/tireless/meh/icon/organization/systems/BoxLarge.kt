// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxLarge: ImageVector
  get() {
    val current = _boxLarge
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BoxLarge",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 28 H6 a2 2 0 0 1 -2 -2 V9 h2 v17 h20 V9 h2 v17 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
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
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
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
        // <polygon points="14.0 21.0 14.0 9.0 12.0 9.0 12.0 23.0 20.0 23.0 20.0 21.0 14.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 21
          moveTo(x = 14.0f, y = 21.0f)
          // L 14 9
          lineTo(x = 14.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 14 21z
          lineTo(x = 14.0f, y = 21.0f)
          close()
        }
        // <rect width="24" height="2" x="4.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -24z
          horizontalLineToRelative(dx = -24.0f)
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
      .also { _boxLarge = it }
  }

@Suppress("ObjectPropertyName")
private var _boxLarge: ImageVector? = null
