// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DoubleAxisChartColumn: ImageVector
  get() {
    val current = _doubleAxisChartColumn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DoubleAxisChartColumn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 v26 h-3 V6 h-7 v22 h-4 V14 H7 v14 H4 V2 H2 v26 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V2z M12 28 H9 V16 h3z m11 0 h-3 V8 h3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // m 11 0
          moveToRelative(dx = 11.0f, dy = 0.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
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
      .also { _doubleAxisChartColumn = it }
  }

@Suppress("ObjectPropertyName")
private var _doubleAxisChartColumn: ImageVector? = null
