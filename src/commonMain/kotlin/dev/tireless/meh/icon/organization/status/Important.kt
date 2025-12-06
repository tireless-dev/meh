// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Important: ImageVector
  get() {
    val current = _important
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Important",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 19 h-2 V8 h2z m-1 2 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 19
          moveTo(x = 17.0f, y = 19.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -1 2
          moveToRelative(dx = -1.0f, dy = 2.0f)
          // a 1.5 1.5 0 1 0 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 0 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.0f,
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
      .also { _important = it }
  }

@Suppress("ObjectPropertyName")
private var _important: ImageVector? = null
