// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextFont: ImageVector
  get() {
    val current = _textFont
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextFont",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 12 h-5 v2 h5 a1 1 0 0 1 1 1 v2 h-4 a3 3 0 0 0 -3 3 v1 a3 3 0 0 0 3 3 h6 v-9 a3 3 0 0 0 -3 -3 m-3 10 a1 1 0 0 1 -1 -1 v-1 a1 1 0 0 1 1 -1 h4 v3Z m-6 2 h2 L12 7 h-2 L4 24 h2 l1.7 -5 h6.6Z m-7.63 -7 2.5 -7.37 h.26 l2.5 7.37Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 12
          moveTo(x = 25.0f, y = 12.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m -3 10
          moveToRelative(dx = -3.0f, dy = 10.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
          // m -6 2
          moveToRelative(dx = -6.0f, dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 12 7
          lineTo(x = 12.0f, y = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // L 4 24
          lineTo(x = 4.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1.7 -5
          lineToRelative(dx = 1.7f, dy = -5.0f)
          // h 6.6z
          horizontalLineToRelative(dx = 6.6f)
          close()
          // m -7.63 -7
          moveToRelative(dx = -7.63f, dy = -7.0f)
          // l 2.5 -7.37
          lineToRelative(dx = 2.5f, dy = -7.37f)
          // h 0.26
          horizontalLineToRelative(dx = 0.26f)
          // l 2.5 7.37z
          lineToRelative(dx = 2.5f, dy = 7.37f)
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
      .also { _textFont = it }
  }

@Suppress("ObjectPropertyName")
private var _textFont: ImageVector? = null
