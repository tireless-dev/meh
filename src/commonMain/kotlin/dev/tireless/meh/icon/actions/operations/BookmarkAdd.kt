// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookmarkAdd: ImageVector
  get() {
    val current = _bookmarkAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BookmarkAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 16 v10.75 l-7.1 -3.59 -.9 -.45 -.9 .45 L8 26.75 V4 h10 V2 H8 a2 2 0 0 0 -2 2 v26 l10 -5.05 L26 30 V16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 16
          moveTo(x = 24.0f, y = 16.0f)
          // v 10.75
          verticalLineToRelative(dy = 10.75f)
          // l -7.1 -3.59
          lineToRelative(dx = -7.1f, dy = -3.59f)
          // l -0.9 -0.45
          lineToRelative(dx = -0.9f, dy = -0.45f)
          // l -0.9 0.45
          lineToRelative(dx = -0.9f, dy = 0.45f)
          // L 8 26.75
          lineTo(x = 8.0f, y = 26.75f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
          // l 10 -5.05
          lineToRelative(dx = 10.0f, dy = -5.05f)
          // L 26 30
          lineTo(x = 26.0f, y = 30.0f)
          // V 16z
          verticalLineTo(y = 16.0f)
          close()
        }
        // <polygon points="26.0 6.0 26.0 2.0 24.0 2.0 24.0 6.0 20.0 6.0 20.0 8.0 24.0 8.0 24.0 12.0 26.0 12.0 26.0 8.0 30.0 8.0 30.0 6.0 26.0 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
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
          // L 30 6
          lineTo(x = 30.0f, y = 6.0f)
          // L 26 6z
          lineTo(x = 26.0f, y = 6.0f)
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
      .also { _bookmarkAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _bookmarkAdd: ImageVector? = null
