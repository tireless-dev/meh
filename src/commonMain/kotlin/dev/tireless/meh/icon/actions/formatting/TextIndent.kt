// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextIndent: ImageVector
  get() {
    val current = _textIndent
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextIndent",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="14.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 6
          moveTo(x = 14.0f, y = 6.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="14.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 12
          moveTo(x = 14.0f, y = 12.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="21" height="2" x="7.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 18
          moveTo(x = 7.0f, y = 18.0f)
          // h 21
          horizontalLineToRelative(dx = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -21z
          horizontalLineToRelative(dx = -21.0f)
          close()
        }
        // <rect width="21" height="2" x="7.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 24
          moveTo(x = 7.0f, y = 24.0f)
          // h 21
          horizontalLineToRelative(dx = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -21z
          horizontalLineToRelative(dx = -21.0f)
          close()
        }
        // <polygon points="4.0 13.59 7.29 10.0 4.0 6.41 5.42 5.0 10.04 10.0 5.42 15.0 4.0 13.59" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 13.59
          moveTo(x = 4.0f, y = 13.59f)
          // L 7.29 10
          lineTo(x = 7.29f, y = 10.0f)
          // L 4 6.41
          lineTo(x = 4.0f, y = 6.41f)
          // L 5.42 5
          lineTo(x = 5.42f, y = 5.0f)
          // L 10.04 10
          lineTo(x = 10.04f, y = 10.0f)
          // L 5.42 15
          lineTo(x = 5.42f, y = 15.0f)
          // L 4 13.59z
          lineTo(x = 4.0f, y = 13.59f)
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
      .also { _textIndent = it }
  }

@Suppress("ObjectPropertyName")
private var _textIndent: ImageVector? = null
