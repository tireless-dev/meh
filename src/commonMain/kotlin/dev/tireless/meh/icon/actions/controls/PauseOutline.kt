// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PauseOutline: ImageVector
  get() {
    val current = _pauseOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PauseOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="14.0 10.0 12.0 10.0 12.0 22.0 14.0 22.0 14.0 10.0 14.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 10
          moveTo(x = 14.0f, y = 10.0f)
          // L 12 10
          lineTo(x = 12.0f, y = 10.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 14 22
          lineTo(x = 14.0f, y = 22.0f)
          // L 14 10
          lineTo(x = 14.0f, y = 10.0f)
          // L 14 10z
          lineTo(x = 14.0f, y = 10.0f)
          close()
        }
        // <polygon points="20.0 10.0 18.0 10.0 18.0 22.0 20.0 22.0 20.0 10.0 20.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
          // L 18 10
          lineTo(x = 18.0f, y = 10.0f)
          // L 18 22
          lineTo(x = 18.0f, y = 22.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 20 10
          lineTo(x = 20.0f, y = 10.0f)
          // L 20 10z
          lineTo(x = 20.0f, y = 10.0f)
          close()
        }
        // M16 4 A12 12 0 1 1 4 16 12 12 0 0 1 16 4 m0 -2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // A 12 12 0 1 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // A 12 12 0 0 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
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
      .also { _pauseOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _pauseOutline: ImageVector? = null
