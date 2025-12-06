// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Subdirectory: ImageVector
  get() {
    val current = _subdirectory
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Subdirectory",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m9 20 1.41 1.41 L7.83 24 H26 V4 h2 v20 a2 2 0 0 1 -2 2 H7.83 l2.58 2.59 L9 30 l-5 -5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 20
          moveTo(x = 9.0f, y = 20.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 7.83 24
          lineTo(x = 7.83f, y = 24.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // H 7.83
          horizontalLineTo(x = 7.83f)
          // l 2.58 2.59
          lineToRelative(dx = 2.58f, dy = 2.59f)
          // L 9 30
          lineTo(x = 9.0f, y = 30.0f)
          // l -5 -5z
          lineToRelative(dx = -5.0f, dy = -5.0f)
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
      .also { _subdirectory = it }
  }

@Suppress("ObjectPropertyName")
private var _subdirectory: ImageVector? = null
