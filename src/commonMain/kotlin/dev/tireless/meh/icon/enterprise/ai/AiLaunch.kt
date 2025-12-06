// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiLaunch: ImageVector
  get() {
    val current = _aiLaunch
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiLaunch",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m15 19 -1.41 1.41 L17.17 24 H4 V11 H2 v13 a2 2 0 0 0 2 2 h13.17 l-3.58 3.59 L15 31 l6 -6z m9 -1 v-2 h2 V4 h-2 V2 h6 v2 h-2 v12 h2 v2z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 19
          moveTo(x = 15.0f, y = 19.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 17.17 24
          lineTo(x = 17.17f, y = 24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 13.17
          horizontalLineToRelative(dx = 13.17f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 15 31
          lineTo(x = 15.0f, y = 31.0f)
          // l 6 -6z
          lineToRelative(dx = 6.0f, dy = -6.0f)
          close()
          // m 9 -1
          moveToRelative(dx = 9.0f, dy = -1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
        }
        // M21 18 h2 L17.5 2 h-3 L9 18 h2 l1.33 -4 h7.34z m-8 -6 3 -9 3 9z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 18
          moveTo(x = 21.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 17.5 2
          lineTo(x = 17.5f, y = 2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // L 9 18
          lineTo(x = 9.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1.33 -4
          lineToRelative(dx = 1.33f, dy = -4.0f)
          // h 7.34z
          horizontalLineToRelative(dx = 7.34f)
          close()
          // m -8 -6
          moveToRelative(dx = -8.0f, dy = -6.0f)
          // l 3 -9
          lineToRelative(dx = 3.0f, dy = -9.0f)
          // l 3 9z
          lineToRelative(dx = 3.0f, dy = 9.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
        // l 0 -32
        lineToRelative(dx = 0.0f, dy = -32.0f)
        // l 32 -0z
        lineToRelative(dx = 32.0f, dy = -0.0f)
        close()
      }
    }.build()
      .also { _aiLaunch = it }
  }

@Suppress("ObjectPropertyName")
private var _aiLaunch: ImageVector? = null
