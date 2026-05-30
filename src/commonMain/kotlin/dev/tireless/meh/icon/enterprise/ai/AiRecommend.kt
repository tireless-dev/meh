// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiRecommend: ImageVector
  get() {
    val current = _aiRecommend
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiRecommend",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 20 v-2 h1 v-7 h-1 V9 h4 v2 h-1 v7 h1 v2z m-3.5 0 h2 L13 9 h-3 L6.5 20 h2 l.6 -2 h4.78z m-4.8 -4 1.63 -5.41 h.26 L13.26 16z m16.52 5 -1.79 3.62 -4 .58 2.9 2.82 L22.64 32 l3.58 -1.88 L29.79 32 l-.68 -3.98 L32 25.2 l-4 -.58z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 9
          verticalLineTo(y = 9.0f)
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
          // L 13 9
          lineTo(x = 13.0f, y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // L 6.5 20
          lineTo(x = 6.5f, y = 20.0f)
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
          // L 13.26 16z
          lineTo(x = 13.26f, y = 16.0f)
          close()
          // m 16.52 5
          moveToRelative(dx = 16.52f, dy = 5.0f)
          // l -1.79 3.62
          lineToRelative(dx = -1.79f, dy = 3.62f)
          // l -4 0.58
          lineToRelative(dx = -4.0f, dy = 0.58f)
          // l 2.9 2.82
          lineToRelative(dx = 2.9f, dy = 2.82f)
          // L 22.64 32
          lineTo(x = 22.64f, y = 32.0f)
          // l 3.58 -1.88
          lineToRelative(dx = 3.58f, dy = -1.88f)
          // L 29.79 32
          lineTo(x = 29.79f, y = 32.0f)
          // l -0.68 -3.98
          lineToRelative(dx = -0.68f, dy = -3.98f)
          // L 32 25.2
          lineTo(x = 32.0f, y = 25.2f)
          // l -4 -0.58z
          lineToRelative(dx = -4.0f, dy = -0.58f)
          close()
        }
        // <polygon points="17.0 30.0 0.0 30.0 0.0 0.0 30.0 0.0 30.0 17.0 28.0 17.0 28.0 2.0 2.0 2.0 2.0 28.0 17.0 28.0 17.0 30.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 17 30
          moveTo(x = 17.0f, y = 30.0f)
          // L 0 30
          lineTo(x = 0.0f, y = 30.0f)
          // L 0 0
          lineTo(x = 0.0f, y = 0.0f)
          // L 30 0
          lineTo(x = 30.0f, y = 0.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 28 17
          lineTo(x = 28.0f, y = 17.0f)
          // L 28 2
          lineTo(x = 28.0f, y = 2.0f)
          // L 2 2
          lineTo(x = 2.0f, y = 2.0f)
          // L 2 28
          lineTo(x = 2.0f, y = 28.0f)
          // L 17 28
          lineTo(x = 17.0f, y = 28.0f)
          // L 17 30z
          lineTo(x = 17.0f, y = 30.0f)
          close()
        }
        // <rect width="32" height="32" x="0.0" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _aiRecommend = it }
  }

@Suppress("ObjectPropertyName")
private var _aiRecommend: ImageVector? = null
