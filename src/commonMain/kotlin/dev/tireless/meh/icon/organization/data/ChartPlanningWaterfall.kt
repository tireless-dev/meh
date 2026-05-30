// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartPlanningWaterfall: ImageVector
  get() {
    val current = _chartPlanningWaterfall
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartPlanningWaterfall",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 8 a1 1 0 0 0 -1 -1 h-4 a1 1 0 0 0 -1 1 v7 h-2 V3 a1 1 0 0 0 -1 -1 h-4 a1 1 0 0 0 -1 1 v12 h-2 V5 a1 1 0 0 0 -1 -1 H8 a1 1 0 0 0 -1 1 v10 H3 v12 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 V17 h2 v5 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-5 h2 v12 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 V17 h4z M7 26 H5 v-9 h2z m8 -5 h-2 v-4 h2z m2 -6 V4 h2 v11z m10 0 h-2 V9 h2z
        path(
          fill = SolidColor(Color(0xFF090909)),
        ) {
          // M 29 8
          moveTo(x = 29.0f, y = 8.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 17
          verticalLineTo(y = 17.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 7 26
          moveTo(x = 7.0f, y = 26.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 8 -5
          moveToRelative(dx = 8.0f, dy = -5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 2 -6
          moveToRelative(dx = 2.0f, dy = -6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 11z
          verticalLineToRelative(dy = 11.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _chartPlanningWaterfall = it }
  }

@Suppress("ObjectPropertyName")
private var _chartPlanningWaterfall: ImageVector? = null
