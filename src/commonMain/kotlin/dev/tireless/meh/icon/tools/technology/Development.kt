// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Development: ImageVector
  get() {
    val current = _development
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Development",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 4 v4 H4 V4z M2 2 v8 h8 V2Z m16 5 v4 h-4 V7z m-6 -2 v8 h8 V5Z M8 16 v4 H4 v-4z m-6 -2 v8 h8 v-8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 4
          moveTo(x = 8.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // m 16 5
          moveToRelative(dx = 16.0f, dy = 5.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
          close()
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
        }
        // M22 10 v6 h-6 v6 h-6 v8 h20 V10Z m-4 8 h4 v4 h-4Z m-2 10 h-4 v-4 h4Z m6 0 h-4 v-4 h4Z m6 0 h-4 v-4 h4Z m0 -6 h-4 v-4 h4Z m-4 -6 v-4 h4 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 10
          moveTo(x = 22.0f, y = 10.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 10z
          verticalLineTo(y = 10.0f)
          close()
          // m -4 8
          moveToRelative(dx = -4.0f, dy = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m -4 -6
          moveToRelative(dx = -4.0f, dy = -6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _development = it }
  }

@Suppress("ObjectPropertyName")
private var _development: ImageVector? = null
