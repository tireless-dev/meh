// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UngroupObjects: ImageVector
  get() {
    val current = _ungroupObjects
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UngroupObjects",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 14 v-4 h-4 v2 h-6 V6 h2 V2 h-4 v2 H6 V2 H2 v4 h2 v12 H2 v4 h4 v-2 h6 v6 h-2 v4 h4 v-2 h12 v2 h4 v-4 h-2 V14Z M6 6 h12 v12 H6Z m20 20 H14 v-6 h4 v2 h4 v-4 h-2 v-4 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 14
          moveTo(x = 30.0f, y = 14.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 14z
          verticalLineTo(y = 14.0f)
          close()
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 20 20
          moveToRelative(dx = 20.0f, dy = 20.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _ungroupObjects = it }
  }

@Suppress("ObjectPropertyName")
private var _ungroupObjects: ImageVector? = null
