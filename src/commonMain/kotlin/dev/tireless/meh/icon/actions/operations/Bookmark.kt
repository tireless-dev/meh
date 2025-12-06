// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bookmark: ImageVector
  get() {
    val current = _bookmark
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bookmark",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 4 v22.75 l-7.1 -3.59 -.9 -.45 -.9 .45 L8 26.75 V4z m0 -2 H8 a2 2 0 0 0 -2 2 v26 l10 -5 10 5 V4 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 4
          moveTo(x = 24.0f, y = 4.0f)
          // v 22.75
          verticalLineToRelative(dy = 22.75f)
          // l -7.1 -3.59
          lineToRelative(dx = -7.1f, dy = -3.59f)
          // l -0.9 -0.45
          lineToRelative(dx = -0.9f, dy = -0.45f)
          // l -0.9 0.45
          lineToRelative(dx = -0.9f, dy = 0.45f)
          // L 8 26.75
          lineTo(x = 8.0f, y = 26.75f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // l 10 -5
          lineToRelative(dx = 10.0f, dy = -5.0f)
          // l 10 5
          lineToRelative(dx = 10.0f, dy = 5.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
      .also { _bookmark = it }
  }

@Suppress("ObjectPropertyName")
private var _bookmark: ImageVector? = null
