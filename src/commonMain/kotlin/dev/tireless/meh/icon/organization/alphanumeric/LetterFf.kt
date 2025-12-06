// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterFf: ImageVector
  get() {
    val current = _letterFf
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterFf",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 11.0 16.0 9.0 8.0 9.0 8.0 23.0 10.0 23.0 10.0 17.0 15.0 17.0 15.0 15.0 10.0 15.0 10.0 11.0 16.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 11
          moveTo(x = 16.0f, y = 11.0f)
          // L 16 9
          lineTo(x = 16.0f, y = 9.0f)
          // L 8 9
          lineTo(x = 8.0f, y = 9.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // L 10 15
          lineTo(x = 10.0f, y = 15.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 16 11z
          lineTo(x = 16.0f, y = 11.0f)
          close()
        }
        // M24 11 V9 h-3 a2 2 0 0 0 -2 2 v2 h-2 v2 h2 v8 h2 v-8 h3 v-2 h-3 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 11
          moveTo(x = 24.0f, y = 11.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _letterFf = it }
  }

@Suppress("ObjectPropertyName")
private var _letterFf: ImageVector? = null
