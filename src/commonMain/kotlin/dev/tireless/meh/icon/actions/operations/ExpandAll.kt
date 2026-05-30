// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExpandAll: ImageVector
  get() {
    val current = _expandAll
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ExpandAll",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 10 h14 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H12 a2 2 0 0 0 -2 2 v1 H6 V2 H4 v23 a2 2 0 0 0 2 2 h4 v1 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 H12 a2 2 0 0 0 -2 2 v1 H6 v-8 h4 v1 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 H12 a2 2 0 0 0 -2 2 v1 H6 V7 h4 v1 a2 2 0 0 0 2 2 m0 -6 h14 v4 H12Z m0 20 h14 v4 H12Z m0 -10 h14 v4 H12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 23
          verticalLineToRelative(dy = 23.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 12z
          horizontalLineTo(x = 12.0f)
          close()
          // m 0 20
          moveToRelative(dx = 0.0f, dy = 20.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 12z
          horizontalLineTo(x = 12.0f)
          close()
          // m 0 -10
          moveToRelative(dx = 0.0f, dy = -10.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 12z
          horizontalLineTo(x = 12.0f)
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
      .also { _expandAll = it }
  }

@Suppress("ObjectPropertyName")
private var _expandAll: ImageVector? = null
