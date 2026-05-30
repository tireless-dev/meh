// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextVerticalAlignment: ImageVector
  get() {
    val current = _textVerticalAlignment
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextVerticalAlignment",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="16.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M10.85 30 H13 L8.64 20 H6.36 L2 30 h2.15 l.8 -2 h5.1Z m-5.1 -4 1.75 -4.37 L9.25 26Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.85 30
          moveTo(x = 10.85f, y = 30.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // L 8.64 20
          lineTo(x = 8.64f, y = 20.0f)
          // H 6.36
          horizontalLineTo(x = 6.36f)
          // L 2 30
          lineTo(x = 2.0f, y = 30.0f)
          // h 2.15
          horizontalLineToRelative(dx = 2.15f)
          // l 0.8 -2
          lineToRelative(dx = 0.8f, dy = -2.0f)
          // h 5.1z
          horizontalLineToRelative(dx = 5.1f)
          close()
          // m -5.1 -4
          moveToRelative(dx = -5.1f, dy = -4.0f)
          // l 1.75 -4.37
          lineToRelative(dx = 1.75f, dy = -4.37f)
          // L 9.25 26z
          lineTo(x = 9.25f, y = 26.0f)
          close()
        }
        // <rect width="28" height="2" x="2.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 15
          moveTo(x = 2.0f, y = 15.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M10.85 12 H13 L8.64 2 H6.36 L2 12 h2.15 l.8 -2 h5.1Z m-5.1 -4 L7.5 3.63 9.25 8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.85 12
          moveTo(x = 10.85f, y = 12.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // L 8.64 2
          lineTo(x = 8.64f, y = 2.0f)
          // H 6.36
          horizontalLineTo(x = 6.36f)
          // L 2 12
          lineTo(x = 2.0f, y = 12.0f)
          // h 2.15
          horizontalLineToRelative(dx = 2.15f)
          // l 0.8 -2
          lineToRelative(dx = 0.8f, dy = -2.0f)
          // h 5.1z
          horizontalLineToRelative(dx = 5.1f)
          close()
          // m -5.1 -4
          moveToRelative(dx = -5.1f, dy = -4.0f)
          // L 7.5 3.63
          lineTo(x = 7.5f, y = 3.63f)
          // L 9.25 8z
          lineTo(x = 9.25f, y = 8.0f)
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
      .also { _textVerticalAlignment = it }
  }

@Suppress("ObjectPropertyName")
private var _textVerticalAlignment: ImageVector? = null
