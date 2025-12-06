// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchLocate: ImageVector
  get() {
    val current = _searchLocate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SearchLocate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30 28.59 -4.69 -4.7 a8.03 8.03 0 1 0 -1.41 1.42 L28.59 30Z M19 25 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28.59
          moveTo(x = 30.0f, y = 28.59f)
          // l -4.69 -4.7
          lineToRelative(dx = -4.69f, dy = -4.7f)
          // a 8.03 8.03 0 1 0 -1.41 1.42
          arcToRelative(
            a = 8.03f,
            b = 8.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 1.42f,
          )
          // L 28.59 30z
          lineTo(x = 28.59f, y = 30.0f)
          close()
          // M 19 25
          moveTo(x = 19.0f, y = 25.0f)
          // a 6 6 0 1 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
        }
        // <rect width="8" height="2" x="2.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 12
          moveTo(x = 2.0f, y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="16" height="2" x="2.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
        // <rect width="16" height="2" x="2.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 7
          moveTo(x = 2.0f, y = 7.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
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
      .also { _searchLocate = it }
  }

@Suppress("ObjectPropertyName")
private var _searchLocate: ImageVector? = null
