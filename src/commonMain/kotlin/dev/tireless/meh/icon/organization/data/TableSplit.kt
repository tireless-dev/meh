// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableSplit: ImageVector
  get() {
    val current = _tableSplit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TableSplit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 2 v4 H5 V5Z m-10 6 h10 v7 H17Z m-2 7 H5 v-7 h10Z M5 20 h10 v7 H5Z m12 7 v-7 h10 v7Z
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
          close()
          // m -10 6
          moveToRelative(dx = -10.0f, dy = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 17z
          horizontalLineTo(x = 17.0f)
          close()
          // m -2 7
          moveToRelative(dx = -2.0f, dy = 7.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 5 20
          moveTo(x = 5.0f, y = 20.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 12 7
          moveToRelative(dx = 12.0f, dy = 7.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7z
          verticalLineToRelative(dy = 7.0f)
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
      .also { _tableSplit = it }
  }

@Suppress("ObjectPropertyName")
private var _tableSplit: ImageVector? = null
