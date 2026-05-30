// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarHeatMap: ImageVector
  get() {
    val current = _calendarHeatMap
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CalendarHeatMap",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 4 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 M6 6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v4 H6Z m0 6 h5 v6 H6Z m13 14 h-6 v-6 h6Z m0 -8 h-6 v-6 h6Z m2 8 v-6 h5 v6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 13 14
          moveToRelative(dx = 13.0f, dy = 14.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 2 8
          moveToRelative(dx = 2.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
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
      .also { _calendarHeatMap = it }
  }

@Suppress("ObjectPropertyName")
private var _calendarHeatMap: ImageVector? = null
