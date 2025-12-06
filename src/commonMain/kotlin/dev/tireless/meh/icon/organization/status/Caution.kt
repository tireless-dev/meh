// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Caution: ImageVector
  get() {
    val current = _caution
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Caution",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // M12.32 12 H3.68 L8 4.09z M14 13 8 2 2 13Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.32 12
          moveTo(x = 12.32f, y = 12.0f)
          // H 3.68
          horizontalLineTo(x = 3.68f)
          // L 8 4.09z
          lineTo(x = 8.0f, y = 4.09f)
          close()
          // M 14 13
          moveTo(x = 14.0f, y = 13.0f)
          // L 8 2
          lineTo(x = 8.0f, y = 2.0f)
          // L 2 13z
          lineTo(x = 2.0f, y = 13.0f)
          close()
        }
        // <polygon points="12.315 12.0 3.685 12.0 8.0 4.088 12.315 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.315 12
          moveTo(x = 12.315f, y = 12.0f)
          // L 3.685 12
          lineTo(x = 3.685f, y = 12.0f)
          // L 8 4.088
          lineTo(x = 8.0f, y = 4.088f)
          // L 12.315 12z
          lineTo(x = 12.315f, y = 12.0f)
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
      .also { _caution = it }
  }

@Suppress("ObjectPropertyName")
private var _caution: ImageVector? = null
