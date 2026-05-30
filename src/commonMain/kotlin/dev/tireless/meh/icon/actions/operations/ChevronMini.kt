// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronMini: ImageVector
  get() {
    val current = _chevronMini
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChevronMini",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="31.0 19.0 31.0 31.0 19.0 31.0 31.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 19
          moveTo(x = 31.0f, y = 19.0f)
          // L 31 31
          lineTo(x = 31.0f, y = 31.0f)
          // L 19 31
          lineTo(x = 19.0f, y = 31.0f)
          // L 31 19z
          lineTo(x = 31.0f, y = 19.0f)
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
      .also { _chevronMini = it }
  }

@Suppress("ObjectPropertyName")
private var _chevronMini: ImageVector? = null
