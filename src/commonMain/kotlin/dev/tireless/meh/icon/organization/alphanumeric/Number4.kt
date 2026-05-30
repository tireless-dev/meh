// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Number4: ImageVector
  get() {
    val current = _number4
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Number4",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 10 v8z m1 -1 h-2 v8 h-3 V9 h-2 v10 h5 v4 h2 v-4 h1 v-2 h-1z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 10
          moveTo(x = 18.0f, y = 10.0f)
          // v 8z
          verticalLineToRelative(dy = 8.0f)
          close()
          // m 1 -1
          moveToRelative(dx = 1.0f, dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -1z
          horizontalLineToRelative(dx = -1.0f)
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
      .also { _number4 = it }
  }

@Suppress("ObjectPropertyName")
private var _number4: ImageVector? = null
