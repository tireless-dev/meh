// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Number5: ImageVector
  get() {
    val current = _number5
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Number5",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 23 h-6 v-2 h6 v-4 h-6 V9 h8 v2 h-6 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _number5 = it }
  }

@Suppress("ObjectPropertyName")
private var _number5: ImageVector? = null
