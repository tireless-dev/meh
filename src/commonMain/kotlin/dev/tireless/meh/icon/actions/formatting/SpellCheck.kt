// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SpellCheck: ImageVector
  get() {
    val current = _spellCheck
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SpellCheck",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 22 h2 l-5 -12 h-2 l-5 12 h2 l1.24 -3 h5.53Z m-5.93 -5 1.82 -4.42 h.25 L18 17Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l -5 -12
          lineToRelative(dx = -5.0f, dy = -12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // l -5 12
          lineToRelative(dx = -5.0f, dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 1.24 -3
          lineToRelative(dx = 1.24f, dy = -3.0f)
          // h 5.53z
          horizontalLineToRelative(dx = 5.53f)
          close()
          // m -5.93 -5
          moveToRelative(dx = -5.93f, dy = -5.0f)
          // l 1.82 -4.42
          lineToRelative(dx = 1.82f, dy = -4.42f)
          // h 0.25
          horizontalLineToRelative(dx = 0.25f)
          // L 18 17z
          lineTo(x = 18.0f, y = 17.0f)
          close()
        }
        // M12 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v11 h-2 V6 H6 v20 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
        }
        // <polygon points="23.0 27.18 20.41 24.59 19.0 26.0 23.0 30.0 30.0 23.0 28.59 21.59 23.0 27.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 27.18
          moveTo(x = 23.0f, y = 27.18f)
          // L 20.41 24.59
          lineTo(x = 20.41f, y = 24.59f)
          // L 19 26
          lineTo(x = 19.0f, y = 26.0f)
          // L 23 30
          lineTo(x = 23.0f, y = 30.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 28.59 21.59
          lineTo(x = 28.59f, y = 21.59f)
          // L 23 27.18z
          lineTo(x = 23.0f, y = 27.18f)
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
      .also { _spellCheck = it }
  }

@Suppress("ObjectPropertyName")
private var _spellCheck: ImageVector? = null
