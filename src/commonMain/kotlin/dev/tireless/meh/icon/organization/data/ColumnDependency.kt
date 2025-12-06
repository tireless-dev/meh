// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ColumnDependency: ImageVector
  get() {
    val current = _columnDependency
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ColumnDependency",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 10 V2 h-8 v3 h-5 a2 2 0 0 0 -2 2 v8 h-5 v-3 H2 v8 h8 v-3 h5 v8 a2 2 0 0 0 2 2 h5 v3 h8 v-8 h-8 v3 h-5 v-8 h5 v3 h8 v-8 h-8 v3 h-5 V7 h5 v3Z M8 18 H4 v-4 h4Z m16 6 h4 v4 h-4Z m0 -10 h4 v4 h-4Z m0 -10 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 10
          moveTo(x = 30.0f, y = 10.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 16 6
          moveToRelative(dx = 16.0f, dy = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
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
      .also { _columnDependency = it }
  }

@Suppress("ObjectPropertyName")
private var _columnDependency: ImageVector? = null
