// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heading: ImageVector
  get() {
    val current = _heading
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Heading",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 7 v18 h-3 v-6 H11 v6 H8 V7 h3 v9 h10 V7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 7
          moveTo(x = 24.0f, y = 7.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
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
      .also { _heading = it }
  }

@Suppress("ObjectPropertyName")
private var _heading: ImageVector? = null
