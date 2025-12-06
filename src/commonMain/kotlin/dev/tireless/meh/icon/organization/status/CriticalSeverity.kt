// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CriticalSeverity: ImageVector
  get() {
    val current = _criticalSeverity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CriticalSeverity",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // <polygon points="13.0 13.0 3.0 13.0 3.0 3.0 13.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 13
          moveTo(x = 13.0f, y = 13.0f)
          // L 3 13
          lineTo(x = 3.0f, y = 13.0f)
          // L 3 3
          lineTo(x = 3.0f, y = 3.0f)
          // L 13 13z
          lineTo(x = 13.0f, y = 13.0f)
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
      .also { _criticalSeverity = it }
  }

@Suppress("ObjectPropertyName")
private var _criticalSeverity: ImageVector? = null
