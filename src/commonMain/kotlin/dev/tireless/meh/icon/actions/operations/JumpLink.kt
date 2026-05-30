// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JumpLink: ImageVector
  get() {
    val current = _jumpLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JumpLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13.41 17.59 18 22.17 V8 H8 V6 h10 a2 2 0 0 1 2 2 v14.17 l4.59 -4.58 L26 19 l-7 7 -7 -7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13.41 17.59
          moveTo(x = 13.41f, y = 17.59f)
          // L 18 22.17
          lineTo(x = 18.0f, y = 22.17f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v 14.17
          verticalLineToRelative(dy = 14.17f)
          // l 4.59 -4.58
          lineToRelative(dx = 4.59f, dy = -4.58f)
          // L 26 19
          lineTo(x = 26.0f, y = 19.0f)
          // l -7 7
          lineToRelative(dx = -7.0f, dy = 7.0f)
          // l -7 -7z
          lineToRelative(dx = -7.0f, dy = -7.0f)
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
      .also { _jumpLink = it }
  }

@Suppress("ObjectPropertyName")
private var _jumpLink: ImageVector? = null
