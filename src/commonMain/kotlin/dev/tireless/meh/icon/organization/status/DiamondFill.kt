// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiamondFill: ImageVector
  get() {
    val current = _diamondFill
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DiamondFill",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // M8 2.41 13.59 8 8 13.59 2.41 8z M8 1 1 8 l7 7 7 -7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 2.41
          moveTo(x = 8.0f, y = 2.41f)
          // L 13.59 8
          lineTo(x = 13.59f, y = 8.0f)
          // L 8 13.59
          lineTo(x = 8.0f, y = 13.59f)
          // L 2.41 8z
          lineTo(x = 2.41f, y = 8.0f)
          close()
          // M 8 1
          moveTo(x = 8.0f, y = 1.0f)
          // L 1 8
          lineTo(x = 1.0f, y = 8.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 7 -7z
          lineToRelative(dx = 7.0f, dy = -7.0f)
          close()
        }
        // M8 2.41 13.59 8 8 13.59 2.41 8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 2.41
          moveTo(x = 8.0f, y = 2.41f)
          // L 13.59 8
          lineTo(x = 13.59f, y = 8.0f)
          // L 8 13.59
          lineTo(x = 8.0f, y = 13.59f)
          // L 2.41 8z
          lineTo(x = 2.41f, y = 8.0f)
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
      .also { _diamondFill = it }
  }

@Suppress("ObjectPropertyName")
private var _diamondFill: ImageVector? = null
