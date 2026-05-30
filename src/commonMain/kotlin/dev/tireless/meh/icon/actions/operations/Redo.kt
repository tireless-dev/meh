// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Redo: ImageVector
  get() {
    val current = _redo
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Redo",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 10 h12.19 l-3.6 -3.59 L22 5 l6 6 -6 6 -1.4 -1.41 L24.18 12 H12 a6 6 0 0 0 0 12 h8 v2 h-8 a8 8 0 0 1 0 -16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // h 12.19
          horizontalLineToRelative(dx = 12.19f)
          // l -3.6 -3.59
          lineToRelative(dx = -3.6f, dy = -3.59f)
          // L 22 5
          lineTo(x = 22.0f, y = 5.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -1.4 -1.41
          lineToRelative(dx = -1.4f, dy = -1.41f)
          // L 24.18 12
          lineTo(x = 24.18f, y = 12.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // a 6 6 0 0 0 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 8 8 0 0 1 0 -16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -16.0f,
          )
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
      .also { _redo = it }
  }

@Suppress("ObjectPropertyName")
private var _redo: ImageVector? = null
