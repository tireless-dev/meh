// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextAlignMixed: ImageVector
  get() {
    val current = _textAlignMixed
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextAlignMixed",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 4 H9 v2 h5 v2 h-4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 V6 a2 2 0 0 0 -2 -2 m0 8 h-4 v-2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 4
          moveTo(x = 14.0f, y = 4.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 0 8
          moveToRelative(dx = 0.0f, dy = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // <polygon points="22.0 26.0 22.0 18.0 20.0 18.0 20.0 19.0 18.0 19.0 18.0 21.0 20.0 21.0 20.0 26.0 18.0 26.0 18.0 28.0 24.0 28.0 24.0 26.0 22.0 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 26
          moveTo(x = 22.0f, y = 26.0f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 20 19
          lineTo(x = 20.0f, y = 19.0f)
          // L 18 19
          lineTo(x = 18.0f, y = 19.0f)
          // L 18 21
          lineTo(x = 18.0f, y = 21.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 20 26
          lineTo(x = 20.0f, y = 26.0f)
          // L 18 26
          lineTo(x = 18.0f, y = 26.0f)
          // L 18 28
          lineTo(x = 18.0f, y = 28.0f)
          // L 24 28
          lineTo(x = 24.0f, y = 28.0f)
          // L 24 26
          lineTo(x = 24.0f, y = 26.0f)
          // L 22 26z
          lineTo(x = 22.0f, y = 26.0f)
          close()
        }
        // <rect width="2" height="14" x="2.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="14" x="28.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
      .also { _textAlignMixed = it }
  }

@Suppress("ObjectPropertyName")
private var _textAlignMixed: ImageVector? = null
