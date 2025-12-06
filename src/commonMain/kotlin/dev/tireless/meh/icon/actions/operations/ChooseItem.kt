// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChooseItem: ImageVector
  get() {
    val current = _chooseItem
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChooseItem",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="20" x="28.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="17.0 6.0 15.57 7.393 23.15 15.0 2.0 15.0 2.0 17.0 23.15 17.0 15.57 24.573 17.0 26.0 27.0 16.0 17.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 6
          moveTo(x = 17.0f, y = 6.0f)
          // L 15.57 7.393
          lineTo(x = 15.57f, y = 7.393f)
          // L 23.15 15
          lineTo(x = 23.15f, y = 15.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 23.15 17
          lineTo(x = 23.15f, y = 17.0f)
          // L 15.57 24.573
          lineTo(x = 15.57f, y = 24.573f)
          // L 17 26
          lineTo(x = 17.0f, y = 26.0f)
          // L 27 16
          lineTo(x = 27.0f, y = 16.0f)
          // L 17 6z
          lineTo(x = 17.0f, y = 6.0f)
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
      .also { _chooseItem = it }
  }

@Suppress("ObjectPropertyName")
private var _chooseItem: ImageVector? = null
