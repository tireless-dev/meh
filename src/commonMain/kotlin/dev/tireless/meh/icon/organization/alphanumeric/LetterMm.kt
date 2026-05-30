// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterMm: ImageVector
  get() {
    val current = _letterMm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterMm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 13 h-8 v10 h2 v-8 h2 v8 h2 v-8 h2 v8 h2 v-8 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 13
          moveTo(x = 24.0f, y = 13.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
        // <polygon points="12.0 9.0 10.48 14.0 10.0 15.98 9.54 14.0 8.0 9.0 6.0 9.0 6.0 23.0 8.0 23.0 8.0 15.0 7.84 13.0 8.42 15.0 10.0 19.63 11.58 15.0 12.16 13.0 12.0 15.0 12.0 23.0 14.0 23.0 14.0 9.0 12.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 9
          moveTo(x = 12.0f, y = 9.0f)
          // L 10.48 14
          lineTo(x = 10.48f, y = 14.0f)
          // L 10 15.98
          lineTo(x = 10.0f, y = 15.98f)
          // L 9.54 14
          lineTo(x = 9.54f, y = 14.0f)
          // L 8 9
          lineTo(x = 8.0f, y = 9.0f)
          // L 6 9
          lineTo(x = 6.0f, y = 9.0f)
          // L 6 23
          lineTo(x = 6.0f, y = 23.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 7.84 13
          lineTo(x = 7.84f, y = 13.0f)
          // L 8.42 15
          lineTo(x = 8.42f, y = 15.0f)
          // L 10 19.63
          lineTo(x = 10.0f, y = 19.63f)
          // L 11.58 15
          lineTo(x = 11.58f, y = 15.0f)
          // L 12.16 13
          lineTo(x = 12.16f, y = 13.0f)
          // L 12 15
          lineTo(x = 12.0f, y = 15.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 14 23
          lineTo(x = 14.0f, y = 23.0f)
          // L 14 9
          lineTo(x = 14.0f, y = 9.0f)
          // L 12 9z
          lineTo(x = 12.0f, y = 9.0f)
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
      .also { _letterMm = it }
  }

@Suppress("ObjectPropertyName")
private var _letterMm: ImageVector? = null
