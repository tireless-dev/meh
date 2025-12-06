// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeatMap03: ImageVector
  get() {
    val current = _heatMap03
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HeatMap03",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m-8 6 h-6 V5 h6Z m0 2 v4 h-6 v-4Z m-8 0 v4 H5 v-4Z m0 6 v4 H5 v-4Z m2 0 h6 v4 h-6Z m8 -2 v-4 h6 v4Z M5 23 h6 v4 H5Z m16 4 v-4 h6 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 3
          moveTo(x = 27.0f, y = 3.0f)
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
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
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
          // m -8 6
          moveToRelative(dx = -8.0f, dy = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m 2 0
          moveToRelative(dx = 2.0f, dy = 0.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // m 8 -2
          moveToRelative(dx = 8.0f, dy = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // M 5 23
          moveTo(x = 5.0f, y = 23.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 16 4
          moveToRelative(dx = 16.0f, dy = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _heatMap03 = it }
  }

@Suppress("ObjectPropertyName")
private var _heatMap03: ImageVector? = null
