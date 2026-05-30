// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShapeIntersect: ImageVector
  get() {
    val current = _shapeIntersect
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ShapeIntersect",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 10 h-6 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h6 v6 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V12 a2 2 0 0 0 -2 -2 M4 20 V4 h16 v6 h-8 a2 2 0 0 0 -2 2 v8Z m8 8 v-6 h8 a2 2 0 0 0 2 -2 v-8 h6 v16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 10
          moveTo(x = 28.0f, y = 10.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // V 12
          verticalLineTo(y = 12.0f)
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
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // v 8z
          verticalLineToRelative(dy = 8.0f)
          close()
          // m 8 8
          moveToRelative(dx = 8.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 16z
          verticalLineToRelative(dy = 16.0f)
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
      .also { _shapeIntersect = it }
  }

@Suppress("ObjectPropertyName")
private var _shapeIntersect: ImageVector? = null
