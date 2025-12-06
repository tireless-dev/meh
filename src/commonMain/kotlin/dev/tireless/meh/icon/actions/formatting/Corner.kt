// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Corner: ImageVector
  get() {
    val current = _corner
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Corner",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 9 H14 V6 H6 v8 h3 v14 h2 V14 h3 v-3 h14Z m-16 3 H8 V8 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
          // m -16 3
          moveToRelative(dx = -16.0f, dy = 3.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _corner = it }
  }

@Suppress("ObjectPropertyName")
private var _corner: ImageVector? = null
