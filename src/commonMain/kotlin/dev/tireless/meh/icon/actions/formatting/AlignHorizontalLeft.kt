// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontalLeft: ImageVector
  get() {
    val current = _alignHorizontalLeft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AlignHorizontalLeft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 26 H11 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h15 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m0 -6 H11 v4 h15Z m-8 -6 h-7 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h7 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m0 -6 h-7 v4 h7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 15z
          horizontalLineToRelative(dx = 15.0f)
          close()
          // m -8 -6
          moveToRelative(dx = -8.0f, dy = -6.0f)
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
          close()
        }
        // <rect width="2" height="28" x="4.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 2
          moveTo(x = 4.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _alignHorizontalLeft = it }
  }

@Suppress("ObjectPropertyName")
private var _alignHorizontalLeft: ImageVector? = null
