// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NumberSmall1: ImageVector
  get() {
    val current = _numberSmall1
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NumberSmall1",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 19.0 17.0 11.0 15.0 11.0 15.0 12.0 13.0 12.0 13.0 14.0 15.0 14.0 15.0 19.0 13.0 19.0 13.0 21.0 19.0 21.0 19.0 19.0 17.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 19
          moveTo(x = 17.0f, y = 19.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 12
          lineTo(x = 15.0f, y = 12.0f)
          // L 13 12
          lineTo(x = 13.0f, y = 12.0f)
          // L 13 14
          lineTo(x = 13.0f, y = 14.0f)
          // L 15 14
          lineTo(x = 15.0f, y = 14.0f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // L 19 19
          lineTo(x = 19.0f, y = 19.0f)
          // L 17 19z
          lineTo(x = 17.0f, y = 19.0f)
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
      .also { _numberSmall1 = it }
  }

@Suppress("ObjectPropertyName")
private var _numberSmall1: ImageVector? = null
