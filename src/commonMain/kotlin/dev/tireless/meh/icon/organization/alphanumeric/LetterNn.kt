// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterNn: ImageVector
  get() {
    val current = _letterNn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterNn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 23 h-2 v-8 h-4 v8 h-2 V13 h6 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 23
          moveTo(x = 25.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
        }
        // <polygon points="13.0 19.0 9.32 9.0 7.0 9.0 7.0 23.0 9.0 23.0 9.0 13.0 12.68 23.0 15.0 23.0 15.0 9.0 13.0 9.0 13.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 19
          moveTo(x = 13.0f, y = 19.0f)
          // L 9.32 9
          lineTo(x = 9.32f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 9 23
          lineTo(x = 9.0f, y = 23.0f)
          // L 9 13
          lineTo(x = 9.0f, y = 13.0f)
          // L 12.68 23
          lineTo(x = 12.68f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 13 9
          lineTo(x = 13.0f, y = 9.0f)
          // L 13 19z
          lineTo(x = 13.0f, y = 19.0f)
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
      .also { _letterNn = it }
  }

@Suppress("ObjectPropertyName")
private var _letterNn: ImageVector? = null
