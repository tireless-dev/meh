// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SquareFill: ImageVector
  get() {
    val current = _squareFill
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SquareFill",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // <rect width="10" height="10" x="3.0" y="3.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3 3
          moveTo(x = 3.0f, y = 3.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="16" height="16" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
      }.build()
      .also { _squareFill = it }
  }

@Suppress("ObjectPropertyName")
private var _squareFill: ImageVector? = null
