// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
  get() {
    val current = _edit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Edit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 26
          moveTo(x = 2.0f, y = 26.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M25.4 9 c.8 -.8 .8 -2 0 -2.8 l-3.6 -3.6 c-.8 -.8 -2 -.8 -2.8 0 l-15 15 V24 h6.4z m-5 -5 L24 7.6 l-3 3 L17.4 7z M6 22 v-3.6 l10 -10 3.6 3.6 -10 10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.4 9
          moveTo(x = 25.4f, y = 9.0f)
          // c 0.8 -0.8 0.8 -2 0 -2.8
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.8f,
            dx2 = 0.8f,
            dy2 = -2.0f,
            dx3 = 0.0f,
            dy3 = -2.8f,
          )
          // l -3.6 -3.6
          lineToRelative(dx = -3.6f, dy = -3.6f)
          // c -0.8 -0.8 -2 -0.8 -2.8 0
          curveToRelative(
            dx1 = -0.8f,
            dy1 = -0.8f,
            dx2 = -2.0f,
            dy2 = -0.8f,
            dx3 = -2.8f,
            dy3 = 0.0f,
          )
          // l -15 15
          lineToRelative(dx = -15.0f, dy = 15.0f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h 6.4z
          horizontalLineToRelative(dx = 6.4f)
          close()
          // m -5 -5
          moveToRelative(dx = -5.0f, dy = -5.0f)
          // L 24 7.6
          lineTo(x = 24.0f, y = 7.6f)
          // l -3 3
          lineToRelative(dx = -3.0f, dy = 3.0f)
          // L 17.4 7z
          lineTo(x = 17.4f, y = 7.0f)
          close()
          // M 6 22
          moveTo(x = 6.0f, y = 22.0f)
          // v -3.6
          verticalLineToRelative(dy = -3.6f)
          // l 10 -10
          lineToRelative(dx = 10.0f, dy = -10.0f)
          // l 3.6 3.6
          lineToRelative(dx = 3.6f, dy = 3.6f)
          // l -10 10z
          lineToRelative(dx = -10.0f, dy = 10.0f)
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
      .also { _edit = it }
  }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null
