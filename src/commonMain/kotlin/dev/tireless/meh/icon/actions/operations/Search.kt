// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Search: ImageVector
  get() {
    val current = _search
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Search",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29 27.59 -7.55 -7.56 a11.02 11.02 0 1 0 -1.42 1.42 L27.6 29Z M4 13 a9 9 0 1 1 9 9 9 9 0 0 1 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 27.59
          moveTo(x = 29.0f, y = 27.59f)
          // l -7.55 -7.56
          lineToRelative(dx = -7.55f, dy = -7.56f)
          // a 11.02 11.02 0 1 0 -1.42 1.42
          arcToRelative(
            a = 11.02f,
            b = 11.02f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 1.42f,
          )
          // L 27.6 29z
          lineTo(x = 27.6f, y = 29.0f)
          close()
          // M 4 13
          moveTo(x = 4.0f, y = 13.0f)
          // a 9 9 0 1 1 9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 9.0f,
            dy1 = 9.0f,
          )
          // a 9 9 0 0 1 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.0f,
            dy1 = -9.0f,
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
      .also { _search = it }
  }

@Suppress("ObjectPropertyName")
private var _search: ImageVector? = null
