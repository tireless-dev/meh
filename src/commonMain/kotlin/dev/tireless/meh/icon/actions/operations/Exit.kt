// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Exit: ImageVector
  get() {
    val current = _exit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Exit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="24" x="26.0" y="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="11.414 20.586 7.828 17.0 22.0 17.0 22.0 15.0 7.828 15.0 11.414 11.414 10.0 10.0 4.0 16.0 10.0 22.0 11.414 20.586" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.414 20.586
          moveTo(x = 11.414f, y = 20.586f)
          // L 7.828 17
          lineTo(x = 7.828f, y = 17.0f)
          // L 22 17
          lineTo(x = 22.0f, y = 17.0f)
          // L 22 15
          lineTo(x = 22.0f, y = 15.0f)
          // L 7.828 15
          lineTo(x = 7.828f, y = 15.0f)
          // L 11.414 11.414
          lineTo(x = 11.414f, y = 11.414f)
          // L 10 10
          lineTo(x = 10.0f, y = 10.0f)
          // L 4 16
          lineTo(x = 4.0f, y = 16.0f)
          // L 10 22
          lineTo(x = 10.0f, y = 22.0f)
          // L 11.414 20.586z
          lineTo(x = 11.414f, y = 20.586f)
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
      .also { _exit = it }
  }

@Suppress("ObjectPropertyName")
private var _exit: ImageVector? = null
