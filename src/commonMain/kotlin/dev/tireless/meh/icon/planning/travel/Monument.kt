// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monument: ImageVector
  get() {
    val current = _monument
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Monument",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 28 V6 l-4 -4 -4 4 v22 H2 v2 h28 v-2Z m-6 0 V6.83 l2 -2 2 2 V28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 28
          moveTo(x = 20.0f, y = 28.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -6 0
          moveToRelative(dx = -6.0f, dy = 0.0f)
          // V 6.83
          verticalLineTo(y = 6.83f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // l 2 2
          lineToRelative(dx = 2.0f, dy = 2.0f)
          // V 28z
          verticalLineTo(y = 28.0f)
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
      .also { _monument = it }
  }

@Suppress("ObjectPropertyName")
private var _monument: ImageVector? = null
