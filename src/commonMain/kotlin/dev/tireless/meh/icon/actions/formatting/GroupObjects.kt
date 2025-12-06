// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GroupObjects: ImageVector
  get() {
    val current = _groupObjects
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GroupObjects",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 13 V9 H9 v10 h4 v4 h10 V13Z m-8 -2 h6 v6 h-6Z m10 10 h-6 v-2 h4 v-4 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 13
          moveTo(x = 19.0f, y = 13.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 13z
          verticalLineTo(y = 13.0f)
          close()
          // m -8 -2
          moveToRelative(dx = -8.0f, dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // m 10 10
          moveToRelative(dx = 10.0f, dy = 10.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M30 8 V2 h-6 v2 H8 V2 H2 v6 h2 v16 H2 v6 h6 v-2 h16 v2 h6 v-6 h-2 V8Z m-4 -4 h2 v2 h-2Z M4 4 h2 v2 H4Z m2 24 H4 v-2 h2Z m22 0 h-2 v-2 h2Z m-2 -4 h-2 v2 H8 v-2 H6 V8 h2 V6 h16 v2 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 8
          moveTo(x = 30.0f, y = 8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
          close()
          // m -4 -4
          moveToRelative(dx = -4.0f, dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 2 24
          moveToRelative(dx = 2.0f, dy = 24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 22 0
          moveToRelative(dx = 22.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -2 -4
          moveToRelative(dx = -2.0f, dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _groupObjects = it }
  }

@Suppress("ObjectPropertyName")
private var _groupObjects: ImageVector? = null
