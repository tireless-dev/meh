// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepeatOne: ImageVector
  get() {
    val current = _repeatOne
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RepeatOne",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M6 6 h20.17 L22.6 2.41 24 1 l6 6 -6 6 -1.41 -1.41 L26.17 8 H6 v7 H4 V8 a2 2 0 0 1 2 -2 m3.41 14.41 L5.83 24 H26 v-7 h2 v7 a2 2 0 0 1 -2 2 H5.83 l3.58 3.59 L8 31 l-6 -6 6 -6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 20.17
          horizontalLineToRelative(dx = 20.17f)
          // L 22.6 2.41
          lineTo(x = 22.6f, y = 2.41f)
          // L 24 1
          lineTo(x = 24.0f, y = 1.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 26.17 8
          lineTo(x = 26.17f, y = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // m 3.41 14.41
          moveToRelative(dx = 3.41f, dy = 14.41f)
          // L 5.83 24
          lineTo(x = 5.83f, y = 24.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // H 5.83
          horizontalLineTo(x = 5.83f)
          // l 3.58 3.59
          lineToRelative(dx = 3.58f, dy = 3.59f)
          // L 8 31
          lineTo(x = 8.0f, y = 31.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l 6 -6z
          lineToRelative(dx = 6.0f, dy = -6.0f)
          close()
        }
        // <polygon points="17.0 19.0 17.0 11.0 15.0 11.0 15.0 12.0 13.0 12.0 13.0 14.0 15.0 14.0 15.0 19.0 13.0 19.0 13.0 21.0 19.0 21.0 19.0 19.0 17.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 19
          moveTo(x = 17.0f, y = 19.0f)
          // L 17 11
          lineTo(x = 17.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 12
          lineTo(x = 15.0f, y = 12.0f)
          // L 13 12
          lineTo(x = 13.0f, y = 12.0f)
          // L 13 14
          lineTo(x = 13.0f, y = 14.0f)
          // L 15 14
          lineTo(x = 15.0f, y = 14.0f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 13 21
          lineTo(x = 13.0f, y = 21.0f)
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // L 19 19
          lineTo(x = 19.0f, y = 19.0f)
          // L 17 19z
          lineTo(x = 17.0f, y = 19.0f)
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
      .also { _repeatOne = it }
  }

@Suppress("ObjectPropertyName")
private var _repeatOne: ImageVector? = null
