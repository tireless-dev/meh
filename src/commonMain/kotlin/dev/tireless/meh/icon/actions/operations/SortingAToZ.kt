// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortingAToZ: ImageVector
  get() {
    val current = _sortingAToZ
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SortingAToZ",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11 13 a2 2 0 0 0 -2 -2 H4 v2 h5 v2 H5 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6z m-2 6 H5 v-2 h4z m7 -17 -5 6 h10z m0 28 5 -6 H11z m13 -19 h-8 v2 h5.5 L21 19 v2 h8 v-2 h-5.5 l5.5 -6z m-10 6 v-2 h-6 v2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 13
          moveTo(x = 11.0f, y = 13.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -2 6
          moveToRelative(dx = -2.0f, dy = 6.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 7 -17
          moveToRelative(dx = 7.0f, dy = -17.0f)
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
          // m 13 -19
          moveToRelative(dx = 13.0f, dy = -19.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5.5
          horizontalLineToRelative(dx = 5.5f)
          // L 21 19
          lineTo(x = 21.0f, y = 19.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -5.5
          horizontalLineToRelative(dx = -5.5f)
          // l 5.5 -6z
          lineToRelative(dx = 5.5f, dy = -6.0f)
          close()
          // m -10 6
          moveToRelative(dx = -10.0f, dy = 6.0f)
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
      .also { _sortingAToZ = it }
  }

@Suppress("ObjectPropertyName")
private var _sortingAToZ: ImageVector? = null
