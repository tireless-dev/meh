// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DoubleInteger: ImageVector
  get() {
    val current = _doubleInteger
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DoubleInteger",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 8 V6 h-4 V2 h-2 v4 H8 V2 H6 v4 H2 v2 h4 v3 H2 v2 h4 v4 h2 v-4 h3 v4 h2 v-4 h4 v-2 h-4 V8Z m-6 3 H8 V8 h3Z m19 10 v-2 h-4 v-4 h-2 v4 h-3 v-4 h-2 v4 h-4 v2 h4 v3 h-4 v2 h4 v4 h2 v-4 h3 v4 h2 v-4 h4 v-2 h-4 v-3Z m-6 3 h-3 v-3 h3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 8
          moveTo(x = 17.0f, y = 8.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
          close()
          // m -6 3
          moveToRelative(dx = -6.0f, dy = 3.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // m 19 10
          moveToRelative(dx = 19.0f, dy = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m -6 3
          moveToRelative(dx = -6.0f, dy = 3.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
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
      .also { _doubleInteger = it }
  }

@Suppress("ObjectPropertyName")
private var _doubleInteger: ImageVector? = null
