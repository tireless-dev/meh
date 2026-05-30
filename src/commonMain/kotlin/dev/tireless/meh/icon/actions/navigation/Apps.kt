// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apps: ImageVector
  get() {
    val current = _apps
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Apps",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 4 v4 H4 V4Z m2 -2 H2 v8 h8Z m8 2 v4 h-4 V4Z m2 -2 h-8 v8 h8Z m8 2 v4 h-4 V4Z m2 -2 h-8 v8 h8Z M8 14 v4 H4 v-4Z m2 -2 H2 v8 h8Z m8 2 v4 h-4 v-4Z m2 -2 h-8 v8 h8Z m8 2 v4 h-4 v-4Z m2 -2 h-8 v8 h8Z M8 24 v4 H4 v-4Z m2 -2 H2 v8 h8Z m8 2 v4 h-4 v-4Z m2 -2 h-8 v8 h8Z m8 2 v4 h-4 v-4Z m2 -2 h-8 v8 h8Z
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
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // M 8 24
          moveTo(x = 8.0f, y = 24.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 -2
          moveToRelative(dx = 2.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _apps = it }
  }

@Suppress("ObjectPropertyName")
private var _apps: ImageVector? = null
