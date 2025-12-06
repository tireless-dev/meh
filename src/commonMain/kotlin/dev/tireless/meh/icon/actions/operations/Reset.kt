// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Reset: ImageVector
  get() {
    val current = _reset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Reset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 28 A12 12 0 1 0 6 16 v6.2 l-3.6 -3.6 L1 20 l6 6 6 -6 -1.4 -1.4 L8 22.2 V16 a10 10 0 1 1 10 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // A 12 12 0 1 0 6 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 16.0f,
          )
          // v 6.2
          verticalLineToRelative(dy = 6.2f)
          // l -3.6 -3.6
          lineToRelative(dx = -3.6f, dy = -3.6f)
          // L 1 20
          lineTo(x = 1.0f, y = 20.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // L 8 22.2
          lineTo(x = 8.0f, y = 22.2f)
          // V 16
          verticalLineTo(y = 16.0f)
          // a 10 10 0 1 1 10 10z
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = 10.0f,
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
      .also { _reset = it }
  }

@Suppress("ObjectPropertyName")
private var _reset: ImageVector? = null
