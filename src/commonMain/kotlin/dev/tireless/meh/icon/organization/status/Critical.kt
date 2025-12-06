// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Critical: ImageVector
  get() {
    val current = _critical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Critical",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // M12.89 11.47 a6 6 0 0 0 -8.36 -8.36Z M3.1 4.53 a6 6 0 0 0 8.36 8.36Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.89 11.47
          moveTo(x = 12.89f, y = 11.47f)
          // a 6 6 0 0 0 -8.36 -8.36z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.36f,
            dy1 = -8.36f,
          )
          close()
          // M 3.1 4.53
          moveTo(x = 3.1f, y = 4.53f)
          // a 6 6 0 0 0 8.36 8.36z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.36f,
            dy1 = 8.36f,
          )
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
      .also { _critical = it }
  }

@Suppress("ObjectPropertyName")
private var _critical: ImageVector? = null
