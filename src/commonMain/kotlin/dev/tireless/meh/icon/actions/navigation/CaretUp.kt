// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CaretUp: ImageVector
  get() {
    val current = _caretUp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CaretUp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="8.0 20.0 16.0 10.0 24.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 20
          moveTo(x = 8.0f, y = 20.0f)
          // L 16 10
          lineTo(x = 16.0f, y = 10.0f)
          // L 24 20z
          lineTo(x = 24.0f, y = 20.0f)
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
      .also { _caretUp = it }
  }

@Suppress("ObjectPropertyName")
private var _caretUp: ImageVector? = null
