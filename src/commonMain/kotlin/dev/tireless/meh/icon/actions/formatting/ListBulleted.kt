// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListBulleted: ImageVector
  get() {
    val current = _listBulleted
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ListBulleted",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="7.0" cy="9.0" radius="3.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 9
          moveTo(x = 7.0f, y = 9.0f)
          // m -3 0
          moveToRelative(dx = -3.0f, dy = 0.0f)
          // a 3 3 0 1 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 1 1 -6 0z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="7.0" cy="23.0" radius="3.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 23
          moveTo(x = 7.0f, y = 23.0f)
          // m -3 0
          moveToRelative(dx = -3.0f, dy = 0.0f)
          // a 3 3 0 1 1 6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 0.0f,
          )
          // a 3 3 0 1 1 -6 0z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <rect width="14" height="2" x="16.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="16.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
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
      .also { _listBulleted = it }
  }

@Suppress("ObjectPropertyName")
private var _listBulleted: ImageVector? = null
