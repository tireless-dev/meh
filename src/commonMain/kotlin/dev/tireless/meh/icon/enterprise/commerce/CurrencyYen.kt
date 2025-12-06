// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyYen: ImageVector
  get() {
    val current = _currencyYen
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CurrencyYen",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="32" height="32" fill="#000" />
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
        // <polygon points="24.271 5.0 22.0 5.0 16.0 16.0 10.0 5.0 7.729 5.0 13.794 16.0 8.0 16.0 8.0 18.0 15.0 18.0 15.0 21.0 8.0 21.0 8.0 23.0 15.0 23.0 15.0 27.0 17.0 27.0 17.0 23.0 24.0 23.0 24.0 21.0 17.0 21.0 17.0 18.0 24.0 18.0 24.0 16.0 18.206 16.0 24.271 5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.271 5
          moveTo(x = 24.271f, y = 5.0f)
          // L 22 5
          lineTo(x = 22.0f, y = 5.0f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // L 10 5
          lineTo(x = 10.0f, y = 5.0f)
          // L 7.729 5
          lineTo(x = 7.729f, y = 5.0f)
          // L 13.794 16
          lineTo(x = 13.794f, y = 16.0f)
          // L 8 16
          lineTo(x = 8.0f, y = 16.0f)
          // L 8 18
          lineTo(x = 8.0f, y = 18.0f)
          // L 15 18
          lineTo(x = 15.0f, y = 18.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 8 21
          lineTo(x = 8.0f, y = 21.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 15 27
          lineTo(x = 15.0f, y = 27.0f)
          // L 17 27
          lineTo(x = 17.0f, y = 27.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 21
          lineTo(x = 24.0f, y = 21.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 18
          lineTo(x = 17.0f, y = 18.0f)
          // L 24 18
          lineTo(x = 24.0f, y = 18.0f)
          // L 24 16
          lineTo(x = 24.0f, y = 16.0f)
          // L 18.206 16
          lineTo(x = 18.206f, y = 16.0f)
          // L 24.271 5z
          lineTo(x = 24.271f, y = 5.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _currencyYen = it }
  }

@Suppress("ObjectPropertyName")
private var _currencyYen: ImageVector? = null
