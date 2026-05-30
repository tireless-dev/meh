// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortingZToA: ImageVector
  get() {
    val current = _sortingZToA
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SortingZToA",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 11 h-5 v2 h5 v2 h-4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 v-8 a2 2 0 0 0 -2 -2 m0 8 h-4 v-2 h4z M16 2 l-5 6 h10z m0 28 5 -6 H11z m-5 -11 H5.5 l5.5 -6 v-2 H3 v2 h5.5 L3 19 v2 h8z m8 -2 v-2 h-6 v2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 11
          moveTo(x = 27.0f, y = 11.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // m 0 8
          moveToRelative(dx = 0.0f, dy = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // l -5 6
          lineToRelative(dx = -5.0f, dy = 6.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // m 0 28
          moveToRelative(dx = 0.0f, dy = 28.0f)
          // l 5 -6
          lineToRelative(dx = 5.0f, dy = -6.0f)
          // H 11z
          horizontalLineTo(x = 11.0f)
          close()
          // m -5 -11
          moveToRelative(dx = -5.0f, dy = -11.0f)
          // H 5.5
          horizontalLineTo(x = 5.5f)
          // l 5.5 -6
          lineToRelative(dx = 5.5f, dy = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5.5
          horizontalLineToRelative(dx = 5.5f)
          // L 3 19
          lineTo(x = 3.0f, y = 19.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 8 -2
          moveToRelative(dx = 8.0f, dy = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
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
      .also { _sortingZToA = it }
  }

@Suppress("ObjectPropertyName")
private var _sortingZToA: ImageVector? = null
