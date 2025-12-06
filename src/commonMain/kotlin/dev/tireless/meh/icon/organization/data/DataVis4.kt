// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataVis4: ImageVector
  get() {
    val current = _dataVis4
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataVis4",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6 H17 V5 h10Z M15 27 h-4 v-4 h4Z m0 -6 h-4 v-4 h4Z m-6 0 H5 v-4 h4Z m2 -6 v-4 h10 v4Z m0 -6 V5 h4 v4Z m12 2 h4 v4 h-4Z M9 5 v10 H5 V5Z M5 23 h4 v4 H5Z m12 4 V17 h10 v10Z
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 15 27
          moveTo(x = 15.0f, y = 27.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m -6 0
          moveToRelative(dx = -6.0f, dy = 0.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 2 -6
          moveToRelative(dx = 2.0f, dy = -6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 12 2
          moveToRelative(dx = 12.0f, dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // M 9 5
          moveTo(x = 9.0f, y = 5.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
          close()
          // M 5 23
          moveTo(x = 5.0f, y = 23.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 12 4
          moveToRelative(dx = 12.0f, dy = 4.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 10z
          verticalLineToRelative(dy = 10.0f)
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
      .also { _dataVis4 = it }
  }

@Suppress("ObjectPropertyName")
private var _dataVis4: ImageVector? = null
