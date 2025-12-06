// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterLl: ImageVector
  get() {
    val current = _letterLl
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterLl",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="11.0 21.0 11.0 9.0 9.0 9.0 9.0 23.0 17.0 23.0 17.0 21.0 11.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 21
          moveTo(x = 11.0f, y = 21.0f)
          // L 11 9
          lineTo(x = 11.0f, y = 9.0f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 9 23
          lineTo(x = 9.0f, y = 23.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 11 21z
          lineTo(x = 11.0f, y = 21.0f)
          close()
        }
        // M23 23 h-2 a2 2 0 0 1 -2 -2 V9 h2 v12 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 23
          moveTo(x = 23.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _letterLl = it }
  }

@Suppress("ObjectPropertyName")
private var _letterLl: ImageVector? = null
