// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextClearFormat: ImageVector
  get() {
    val current = _textClearFormat
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextClearFormat",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.44 16.57 21.45 8.6 a2 2 0 0 0 -2.83 0 l-5.35 5.35 L9 2 H7 L2 16 h2 l1 -3 h6 l.8 2.4 -7.21 7.22 a2 2 0 0 0 0 2.83 L9.13 30 h9.6 l10.7 -10.72 a1.9 1.9 0 0 0 0 -2.7 M5.67 11 8 4 l2.33 7Z m12.22 17 H9.96 L6 24.04 l6.31 -6.31 7.93 7.92Z m3.76 -3.76 -7.92 -7.93 6.3 -6.31 7.94 7.93Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.44 16.57
          moveTo(x = 29.44f, y = 16.57f)
          // L 21.45 8.6
          lineTo(x = 21.45f, y = 8.6f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -5.35 5.35
          lineToRelative(dx = -5.35f, dy = 5.35f)
          // L 9 2
          lineTo(x = 9.0f, y = 2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // L 2 16
          lineTo(x = 2.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1 -3
          lineToRelative(dx = 1.0f, dy = -3.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // l 0.8 2.4
          lineToRelative(dx = 0.8f, dy = 2.4f)
          // l -7.21 7.22
          lineToRelative(dx = -7.21f, dy = 7.22f)
          // a 2 2 0 0 0 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.83f,
          )
          // L 9.13 30
          lineTo(x = 9.13f, y = 30.0f)
          // h 9.6
          horizontalLineToRelative(dx = 9.6f)
          // l 10.7 -10.72
          lineToRelative(dx = 10.7f, dy = -10.72f)
          // a 1.9 1.9 0 0 0 0 -2.7
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.7f,
          )
          // M 5.67 11
          moveTo(x = 5.67f, y = 11.0f)
          // L 8 4
          lineTo(x = 8.0f, y = 4.0f)
          // l 2.33 7z
          lineToRelative(dx = 2.33f, dy = 7.0f)
          close()
          // m 12.22 17
          moveToRelative(dx = 12.22f, dy = 17.0f)
          // H 9.96
          horizontalLineTo(x = 9.96f)
          // L 6 24.04
          lineTo(x = 6.0f, y = 24.04f)
          // l 6.31 -6.31
          lineToRelative(dx = 6.31f, dy = -6.31f)
          // l 7.93 7.92z
          lineToRelative(dx = 7.93f, dy = 7.92f)
          close()
          // m 3.76 -3.76
          moveToRelative(dx = 3.76f, dy = -3.76f)
          // l -7.92 -7.93
          lineToRelative(dx = -7.92f, dy = -7.93f)
          // l 6.3 -6.31
          lineToRelative(dx = 6.3f, dy = -6.31f)
          // l 7.94 7.93z
          lineToRelative(dx = 7.94f, dy = 7.93f)
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
      .also { _textClearFormat = it }
  }

@Suppress("ObjectPropertyName")
private var _textClearFormat: ImageVector? = null
