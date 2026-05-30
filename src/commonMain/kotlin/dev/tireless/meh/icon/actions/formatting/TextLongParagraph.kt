// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextLongParagraph: ImageVector
  get() {
    val current = _textLongParagraph
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextLongParagraph",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="6.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 24
          moveTo(x = 6.0f, y = 24.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="20" height="2" x="6.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 18
          moveTo(x = 6.0f, y = 18.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -20z
          horizontalLineToRelative(dx = -20.0f)
          close()
        }
        // <rect width="20" height="2" x="6.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -20z
          horizontalLineToRelative(dx = -20.0f)
          close()
        }
        // <rect width="20" height="2" x="6.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -20z
          horizontalLineToRelative(dx = -20.0f)
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
      .also { _textLongParagraph = it }
  }

@Suppress("ObjectPropertyName")
private var _textLongParagraph: ImageVector? = null
