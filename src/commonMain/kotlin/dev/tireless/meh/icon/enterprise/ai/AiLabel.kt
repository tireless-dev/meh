// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiLabel: ImageVector
  get() {
    val current = _aiLabel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiLabel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 21 v-2 h1 v-7 h-1 v-2 h4 v2 h-1 v7 h1 v2z m-3.5 0 h2 L14 10 h-3 L7.5 21 h2 l.6 -2 h4.78z m-4.8 -4 1.63 -5.41 h.26 L14.26 17z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 21
          moveTo(x = 19.0f, y = 21.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m -3.5 0
          moveToRelative(dx = -3.5f, dy = 0.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 14 10
          lineTo(x = 14.0f, y = 10.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // L 7.5 21
          lineTo(x = 7.5f, y = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 0.6 -2
          lineToRelative(dx = 0.6f, dy = -2.0f)
          // h 4.78z
          horizontalLineToRelative(dx = 4.78f)
          close()
          // m -4.8 -4
          moveToRelative(dx = -4.8f, dy = -4.0f)
          // l 1.63 -5.41
          lineToRelative(dx = 1.63f, dy = -5.41f)
          // h 0.26
          horizontalLineToRelative(dx = 0.26f)
          // L 14.26 17z
          lineTo(x = 14.26f, y = 17.0f)
          close()
        }
        // M32 32 H0 V0 h32z M2 30 h28 V2 H2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // H 0
          horizontalLineTo(x = 0.0f)
          // V 0
          verticalLineTo(y = 0.0f)
          // h 32z
          horizontalLineToRelative(dx = 32.0f)
          close()
          // M 2 30
          moveTo(x = 2.0f, y = 30.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2z
          horizontalLineTo(x = 2.0f)
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
      .also { _aiLabel = it }
  }

@Suppress("ObjectPropertyName")
private var _aiLabel: ImageVector? = null
