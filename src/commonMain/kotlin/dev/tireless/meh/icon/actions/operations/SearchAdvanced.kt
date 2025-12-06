// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchAdvanced: ImageVector
  get() {
    val current = _searchAdvanced
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SearchAdvanced",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 6.0 26.0 6.0 26.0 2.0 24.0 2.0 24.0 6.0 20.0 6.0 20.0 8.0 24.0 8.0 24.0 12.0 26.0 12.0 26.0 8.0 30.0 8.0 30.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 26 2
          lineTo(x = 26.0f, y = 2.0f)
          // L 24 2
          lineTo(x = 24.0f, y = 2.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 20 8
          lineTo(x = 20.0f, y = 8.0f)
          // L 24 8
          lineTo(x = 24.0f, y = 8.0f)
          // L 24 12
          lineTo(x = 24.0f, y = 12.0f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 26 8
          lineTo(x = 26.0f, y = 8.0f)
          // L 30 8
          lineTo(x = 30.0f, y = 8.0f)
          // L 30 6z
          lineTo(x = 30.0f, y = 6.0f)
          close()
        }
        // m24 28.59 -5.98 -5.98 a9.02 9.02 0 1 0 -1.4 1.41 L22.58 30Z M4 17 a7 7 0 1 1 7 7 7 7 0 0 1 -7 -7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 28.59
          moveTo(x = 24.0f, y = 28.59f)
          // l -5.98 -5.98
          lineToRelative(dx = -5.98f, dy = -5.98f)
          // a 9.02 9.02 0 1 0 -1.4 1.41
          arcToRelative(
            a = 9.02f,
            b = 9.02f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 1.41f,
          )
          // L 22.58 30z
          lineTo(x = 22.58f, y = 30.0f)
          close()
          // M 4 17
          moveTo(x = 4.0f, y = 17.0f)
          // a 7 7 0 1 1 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // a 7 7 0 0 1 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -7.0f,
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
      .also { _searchAdvanced = it }
  }

@Suppress("ObjectPropertyName")
private var _searchAdvanced: ImageVector? = null
