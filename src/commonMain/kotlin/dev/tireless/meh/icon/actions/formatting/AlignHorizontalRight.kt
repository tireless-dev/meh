// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontalRight: ImageVector
  get() {
    val current = _alignHorizontalRight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AlignHorizontalRight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 24 v-4 a2 2 0 0 1 2 -2 h15 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 m2 0 h15 v-4 H6Z m6 -12 V8 a2 2 0 0 1 2 -2 h7 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-7 a2 2 0 0 1 -2 -2 m2 0 h7 V8 h-7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 24
          moveTo(x = 4.0f, y = 24.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 6 -12
          moveToRelative(dx = 6.0f, dy = -12.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="2" height="28" x="26.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // l -2 0
          lineToRelative(dx = -2.0f, dy = 0.0f)
          // l 0 -28
          lineToRelative(dx = 0.0f, dy = -28.0f)
          // l 2 -0z
          lineToRelative(dx = 2.0f, dy = -0.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
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
      .also { _alignHorizontalRight = it }
  }

@Suppress("ObjectPropertyName")
private var _alignHorizontalRight: ImageVector? = null
