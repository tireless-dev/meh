// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableOfContents: ImageVector
  get() {
    val current = _tableOfContents
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TableOfContents",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="18" height="2" x="4.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="4.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 12
          moveTo(x = 4.0f, y = 12.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="4.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="18" height="2" x="4.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -18z
          horizontalLineToRelative(dx = -18.0f)
          close()
        }
        // <rect width="2" height="2" x="26.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="26.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 12
          moveTo(x = 26.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="26.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 18
          moveTo(x = 26.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="26.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 24
          moveTo(x = 26.0f, y = 24.0f)
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
      .also { _tableOfContents = it }
  }

@Suppress("ObjectPropertyName")
private var _tableOfContents: ImageVector? = null
