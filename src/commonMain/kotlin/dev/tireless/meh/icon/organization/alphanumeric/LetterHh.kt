// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterHh: ImageVector
  get() {
    val current = _letterHh
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterHh",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="13.0 9.0 13.0 15.0 9.0 15.0 9.0 9.0 7.0 9.0 7.0 23.0 9.0 23.0 9.0 17.0 13.0 17.0 13.0 23.0 15.0 23.0 15.0 9.0 13.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 9
          moveTo(x = 13.0f, y = 9.0f)
          // L 13 15
          lineTo(x = 13.0f, y = 15.0f)
          // L 9 15
          lineTo(x = 9.0f, y = 15.0f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 9 23
          lineTo(x = 9.0f, y = 23.0f)
          // L 9 17
          lineTo(x = 9.0f, y = 17.0f)
          // L 13 17
          lineTo(x = 13.0f, y = 17.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 15 23
          lineTo(x = 15.0f, y = 23.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 13 9z
          lineTo(x = 13.0f, y = 9.0f)
          close()
        }
        // M23 13 h-4 V9 h-2 v14 h2 v-8 h4 v8 h2 v-8 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
      .also { _letterHh = it }
  }

@Suppress("ObjectPropertyName")
private var _letterHh: ImageVector? = null
