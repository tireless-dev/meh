// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PauseFuture: ImageVector
  get() {
    val current = _pauseFuture
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PauseFuture",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="14.0 11.0 12.0 11.0 12.0 22.0 14.0 22.0 14.0 11.0 14.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 11
          moveTo(x = 14.0f, y = 11.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 14 22
          lineTo(x = 14.0f, y = 22.0f)
          // L 14 11
          lineTo(x = 14.0f, y = 11.0f)
          // L 14 11z
          lineTo(x = 14.0f, y = 11.0f)
          close()
        }
        // <polygon points="20.0 11.0 18.0 11.0 18.0 22.0 20.0 22.0 20.0 11.0 20.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 11
          moveTo(x = 20.0f, y = 11.0f)
          // L 18 11
          lineTo(x = 18.0f, y = 11.0f)
          // L 18 22
          lineTo(x = 18.0f, y = 22.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20 11z
          lineTo(x = 20.0f, y = 11.0f)
          close()
        }
        // M16 2 a14 14 0 0 1 10 4.23 V2 h2 v8 h-8 V8 h4.92 A11.98 11.98 0 1 0 28 16 h2 A14 14 0 1 1 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 0 1 10 4.23
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = 4.23f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4.92
          horizontalLineToRelative(dx = 4.92f)
          // A 11.98 11.98 0 1 0 28 16
          arcTo(
            horizontalEllipseRadius = 11.98f,
            verticalEllipseRadius = 11.98f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 14 14 0 1 1 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _pauseFuture = it }
  }

@Suppress("ObjectPropertyName")
private var _pauseFuture: ImageVector? = null
