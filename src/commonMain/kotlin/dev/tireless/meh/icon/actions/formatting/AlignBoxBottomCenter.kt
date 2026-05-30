// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignBoxBottomCenter: ImageVector
  get() {
    val current = _alignBoxBottomCenter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AlignBoxBottomCenter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M6 4 v24 h20 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
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
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
        }
        // <rect width="12" height="2" x="10.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 20
          moveTo(x = 22.0f, y = 20.0f)
          // l -12 0
          lineToRelative(dx = -12.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 12 -0z
          lineToRelative(dx = 12.0f, dy = -0.0f)
          close()
        }
        // <rect width="8" height="2" x="12.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 25
          moveTo(x = 20.0f, y = 25.0f)
          // l -8 0
          lineToRelative(dx = -8.0f, dy = 0.0f)
          // l 0 -2
          lineToRelative(dx = 0.0f, dy = -2.0f)
          // l 8 -0z
          lineToRelative(dx = 8.0f, dy = -0.0f)
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
      .also { _alignBoxBottomCenter = it }
  }

@Suppress("ObjectPropertyName")
private var _alignBoxBottomCenter: ImageVector? = null
