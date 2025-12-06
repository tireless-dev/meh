// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterIi: ImageVector
  get() {
    val current = _letterIi
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterIi",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="10.0 11.0 13.0 11.0 13.0 21.0 10.0 21.0 10.0 23.0 18.0 23.0 18.0 21.0 15.0 21.0 15.0 11.0 18.0 11.0 18.0 9.0 10.0 9.0 10.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 11
          moveTo(x = 10.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // L 10 21
          lineTo(x = 10.0f, y = 21.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 18 23
          lineTo(x = 18.0f, y = 23.0f)
          // L 18 21
          lineTo(x = 18.0f, y = 21.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 18 11
          lineTo(x = 18.0f, y = 11.0f)
          // L 18 9
          lineTo(x = 18.0f, y = 9.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 10 11z
          lineTo(x = 10.0f, y = 11.0f)
          close()
        }
        // <rect width="2" height="10" x="20.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 13
          moveTo(x = 20.0f, y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="20.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 9
          moveTo(x = 20.0f, y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _letterIi = it }
  }

@Suppress("ObjectPropertyName")
private var _letterIi: ImageVector? = null
