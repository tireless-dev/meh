// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Factor: ImageVector
  get() {
    val current = _factor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Factor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 28 V9 h-3 V4 h2 V2 h-6 v2 h2 v5 h-3 v19 h-4 V16 h-3 v-5 h2 V9 H8 v2 h2 v5 H7 v12 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m-14 0 H9 V18 h4Z m8 -17 h4 v17 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 28
          moveTo(x = 27.0f, y = 28.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 19
          verticalLineToRelative(dy = 19.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -14 0
          moveToRelative(dx = -14.0f, dy = 0.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 8 -17
          moveToRelative(dx = 8.0f, dy = -17.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
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
      .also { _factor = it }
  }

@Suppress("ObjectPropertyName")
private var _factor: ImageVector? = null
