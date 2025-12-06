// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MacOption: ImageVector
  get() {
    val current = _macOption
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MacOption",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="10" height="2" x="18.0" y="5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 5
          moveTo(x = 18.0f, y = 5.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <polygon points="10.6 5.0 4.0 5.0 4.0 7.0 9.4 7.0 18.4 27.0 28.0 27.0 28.0 25.0 19.6 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.6 5
          moveTo(x = 10.6f, y = 5.0f)
          // L 4 5
          lineTo(x = 4.0f, y = 5.0f)
          // L 4 7
          lineTo(x = 4.0f, y = 7.0f)
          // L 9.4 7
          lineTo(x = 9.4f, y = 7.0f)
          // L 18.4 27
          lineTo(x = 18.4f, y = 27.0f)
          // L 28 27
          lineTo(x = 28.0f, y = 27.0f)
          // L 28 25
          lineTo(x = 28.0f, y = 25.0f)
          // L 19.6 25z
          lineTo(x = 19.6f, y = 25.0f)
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
      .also { _macOption = it }
  }

@Suppress("ObjectPropertyName")
private var _macOption: ImageVector? = null
