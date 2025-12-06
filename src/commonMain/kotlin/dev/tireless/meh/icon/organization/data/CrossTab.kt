// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CrossTab: ImageVector
  get() {
    val current = _crossTab
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CrossTab",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H10 a2 2 0 0 0 -2 2 v3 H4 a2 2 0 0 0 -2 2 v19 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M10 4 h18 v3 H10Z m18 10 h-8 V9 h8Z m-18 7 v-5 h8 v5Z m8 2 v5 h-8 v-5Z M8 21 H4 v-5 h4Z M18 9 v5 h-8 V9Z m2 7 h8 v5 h-8Z M8 9 v5 H4 V9Z M4 23 h4 v5 H4Z m16 5 v-5 h8 v5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // v 19
          verticalLineToRelative(dy = 19.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // M 10 4
          moveTo(x = 10.0f, y = 4.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
          close()
          // m 18 10
          moveToRelative(dx = 18.0f, dy = 10.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -18 7
          moveToRelative(dx = -18.0f, dy = 7.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
          close()
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -5z
          verticalLineToRelative(dy = -5.0f)
          close()
          // M 8 21
          moveTo(x = 8.0f, y = 21.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 18 9
          moveTo(x = 18.0f, y = 9.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
          // m 2 7
          moveToRelative(dx = 2.0f, dy = 7.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
          // M 4 23
          moveTo(x = 4.0f, y = 23.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 16 5
          moveToRelative(dx = 16.0f, dy = 5.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
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
      .also { _crossTab = it }
  }

@Suppress("ObjectPropertyName")
private var _crossTab: ImageVector? = null
