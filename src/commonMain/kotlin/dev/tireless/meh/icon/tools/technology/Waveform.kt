// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Waveform: ImageVector
  get() {
    val current = _waveform
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Waveform",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 19 h-2 v-6 h2z M4 10 H2 v12 h2z m10 0 h-2 v12 h2z m10 0 h-2 v12 h2z M9 6 H7 v20 h2z m20 0 h-2 v20 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 19
          moveTo(x = 19.0f, y = 19.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 9 6
          moveTo(x = 9.0f, y = 6.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 20 0
          moveToRelative(dx = 20.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
      .also { _waveform = it }
  }

@Suppress("ObjectPropertyName")
private var _waveform: ImageVector? = null
