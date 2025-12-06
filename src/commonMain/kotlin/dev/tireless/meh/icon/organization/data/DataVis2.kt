// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataVis2: ImageVector
  get() {
    val current = _dataVis2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataVis2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H17 a2 2 0 0 0 -2 2 v6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h11 a2 2 0 0 0 2 -2 v-6 h11 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 2 v4 H17 V4Z M15 22 H4 v-4 h11Z m2 -12 h11 v4 H17Z m-2 2 v4 H4 v-4Z M4 28 v-4 h11 v4Z m13 -8 v-4 h11 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 11
          horizontalLineToRelative(dx = 11.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 15 22
          moveTo(x = 15.0f, y = 22.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11z
          horizontalLineToRelative(dx = 11.0f)
          close()
          // m 2 -12
          moveToRelative(dx = 2.0f, dy = -12.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 17z
          horizontalLineTo(x = 17.0f)
          close()
          // m -2 2
          moveToRelative(dx = -2.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 13 -8
          moveToRelative(dx = 13.0f, dy = -8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
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
      .also { _dataVis2 = it }
  }

@Suppress("ObjectPropertyName")
private var _dataVis2: ImageVector? = null
